package me.mrCookieSlime.Slimefun.listeners;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Misc.BookDesign;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;
import java.util.List;

public class GuideOnJoinListener implements Listener {

	public GuideOnJoinListener(SlimefunStartup plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	private String menu1 =  ChatColor.translateAlternateColorCodes('&', "&r&aSlimefun 科技+伺服器指南 &7(箱子介面)"),
			menu2 = ChatColor.translateAlternateColorCodes('&', "&r&aSlimefun 科技+伺服器指南 &7(書本介面)"),
			menu3 = ChatColor.translateAlternateColorCodes('&', "&r&cSlimefun 科技+伺服器指南 &4(OP模式)");


	public void checkGuide(Player p) {
		new BukkitRunnable(){
			@Override
			public void run(){
				List<ItemStack> contents = Arrays.asList(p.getInventory().getContents());
				if(contents.contains(SlimefunGuide.getItem(BookDesign.CHEST)) ||
						contents.contains(SlimefunGuide.getItem(BookDesign.BOOK)) ||
						contents.contains(SlimefunGuide.getItem(BookDesign.CHEAT_SHEET))){
					return;
				}else{
					if(p.hasPermission("slimefun.cheat.items")){
						p.getInventory().addItem(SlimefunGuide.getItem(BookDesign.CHEAT_SHEET));
					}else if(p.hasPermission("sf.book")){
						p.getInventory().addItem(SlimefunGuide.getItem(BookDesign.BOOK));
					}else{
						p.getInventory().addItem(SlimefunGuide.getItem(BookDesign.CHEST));
					}
				}
			}
		}.runTaskLater(SlimefunStartup.instance, 80);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		checkGuide(e.getPlayer());
	}

	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent e){
		checkGuide((e.getPlayer()));
	}

	@EventHandler(priority= EventPriority.HIGH)
	public void onPlayerUse(PlayerInteractEvent e){

		Player p = e.getPlayer();
		if(p.getInventory().getItemInMainHand().getType() != null) {
			ItemStack i = p.getInventory().getItemInMainHand();
			if(i.hasItemMeta()) {
				if(i.getItemMeta().hasDisplayName()) {
					if(i.getItemMeta().getDisplayName().equals(menu1) || i.getItemMeta().getDisplayName().equals(menu2) || i.getItemMeta().getDisplayName().equals(menu3)) {
						if(e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
							p.playSound(p.getLocation(), Sound.ENTITY_PARROT_IMITATE_SLIME, SoundCategory.MUSIC, 2, 1);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "dm open slime "+p.getName());
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onPlayerClickMenu(BlockBreakEvent e) {
		if(e.isCancelled()) return;
		Player p = e.getPlayer();
		ItemStack hand = p.getInventory().getItemInMainHand();
		if(hand.getType() != Material.AIR) {
			if(hand.hasItemMeta()) {
				if(hand.getItemMeta().hasDisplayName()) {
					String iname = hand.getItemMeta().getDisplayName();
					if(iname.equals(menu1) || iname.equals(menu2) || iname.equals(menu3)) {
						e.setCancelled(true);
					}
				}
			}
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onHit(EntityDamageByEntityEvent e) {

		if(e.isCancelled()) return;
		if(!(e.getDamager() instanceof Player)) return;
		Entity hitTarget = e.getEntity();
		if(hitTarget != null && hitTarget instanceof ArmorStand) return;
		if(hitTarget != null && hitTarget instanceof ItemFrame) return;
		Player P = (Player) e.getDamager();
		if(!P.getInventory().getItemInMainHand().hasItemMeta()) return;
		if(!P.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()) return;
		String name = P.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
		if(name != menu1 || name != menu2 || name != menu3) return;
		e.setCancelled(true);
		P.playSound(P.getLocation(), Sound.ENTITY_PARROT_IMITATE_SLIME, SoundCategory.MUSIC, 2, 1);
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "dm open slime "+P.getName());
	}

}
