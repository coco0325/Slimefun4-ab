package me.mrCookieSlime.Slimefun.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.api.PlayerProfile;

public class PlayerQuitListener implements Listener {

	public PlayerQuitListener(SlimefunStartup plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDisconnect(PlayerQuitEvent e) {
		e.getPlayer().closeInventory();
		SlimefunGuide.history.remove(e.getPlayer().getUniqueId());
		
		if (PlayerProfile.isLoaded(e.getPlayer().getUniqueId())) {
			PlayerProfile.fromUUID(e.getPlayer().getUniqueId()).markForDeletion();
		}
	}

}
