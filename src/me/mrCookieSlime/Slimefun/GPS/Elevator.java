package me.mrCookieSlime.Slimefun.GPS;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.general.Chat.TellRawMessage;
import me.mrCookieSlime.CSCoreLibPlugin.general.Chat.TellRawMessage.HoverAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.CustomBookOverlay;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.MenuHelper;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

public class Elevator {
	
	public static List<UUID> ignored = new ArrayList<>();

	public static void openEditor(Player p, final Block b) {
		ChestMenu menu = new ChestMenu("電梯板設定");
		
		menu.addItem(4, new CustomItem(new ItemStack(Material.NAME_TAG), "&7樓層名稱&e(點我編輯)", "", "&r" + ChatColor.translateAlternateColorCodes('&', BlockStorage.getLocationInfo(b.getLocation(), "floor"))));
		menu.addMenuClickHandler(4, (pl, slot, item, action) -> {
			pl.closeInventory();
			pl.sendMessage("");
			pl.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l>> &e請將樓層名稱輸入聊天欄!"));
			pl.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l>> &e(支援顏色代碼!"));
			pl.sendMessage("");
			
			MenuHelper.awaitChatInput(pl, (player, message) -> {
				BlockStorage.addBlockInfo(b, "floor", message.replaceAll("&", "&"));
				
				player.sendMessage("");
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l>> &e成功命名樓層:"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l>> &r" + ChatColor.translateAlternateColorCodes('&', message)));
				player.sendMessage("");
				
				openEditor(player, b);
				
				return false;
			});
			return false;
		});
		
		menu.open(p);
	}

	public static void openDialogue(Player p, Block b) {
		if (ignored.contains(p.getUniqueId())) {
			ignored.remove(p.getUniqueId());
			return;
		}
		
		TellRawMessage tellraw = new TellRawMessage();
		tellraw.addText("&3- 選擇目的樓層 -\n\n");
		int index = 1;
		for (int y = b.getWorld().getMaxHeight(); y > 0; y--) {
			Block block = b.getWorld().getBlockAt(b.getX(), y, b.getZ());
			if (BlockStorage.check(block, "ELEVATOR_PLATE")) {
				String floor = ChatColor.translateAlternateColorCodes('&', BlockStorage.getLocationInfo(block.getLocation(), "floor"));
				if (block.getY() == b.getY()) {
					tellraw.addText("&7> " + index + ". &r" + floor + "\n");
					tellraw.addHoverEvent(HoverAction.SHOW_TEXT, "\n&e本樓層為:\n&r" + floor + "\n");
				}
				else {
					tellraw.addText("&7" + index + ". &r" + floor + "\n");
					tellraw.addHoverEvent(HoverAction.SHOW_TEXT, "\n&e點我前往樓層\n&r" + floor + "\n");
					tellraw.addClickEvent(me.mrCookieSlime.CSCoreLibPlugin.general.Chat.TellRawMessage.ClickAction.RUN_COMMAND, "/sf elevator " + block.getX() + " " + block.getY() + " " + block.getZ() + " ");
				}
				
				index++;
			}
		}
		if (index > 2) new CustomBookOverlay("Elevator", "Slimefun", tellraw).open(p);
		else Messages.local.sendTranslation(p, "machines.ELEVATOR.no-destinations", true);
	}

}
