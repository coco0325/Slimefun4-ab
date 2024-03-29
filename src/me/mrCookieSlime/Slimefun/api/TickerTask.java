package me.mrCookieSlime.Slimefun.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.mrCookieSlime.CSCoreLibPlugin.general.Clock;
import me.mrCookieSlime.CSCoreLibPlugin.general.Chat.TellRawMessage;
import me.mrCookieSlime.CSCoreLibPlugin.general.Chat.TellRawMessage.HoverAction;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.BlockTicker;

public class TickerTask implements Runnable {
	
	public boolean HALTED = false;
	
	public Map<Location, Location> move = new HashMap<>();
	public Map<Location, Boolean> delete = new HashMap<>();
	
	private Set<BlockTicker> tickers = new HashSet<>();
	
	private int skipped = 0, chunks = 0, machines = 0;
	private long time = 0;
	private Map<String, Integer> map_chunk = new HashMap<>();
	private Map<String, Integer> map_machine = new HashMap<>();
	private Map<String, Long> map_machinetime = new HashMap<>();
	private Map<String, Long> map_chunktime = new HashMap<>();
	private Set<String> skipped_chunks = new HashSet<>();

	public static Map<Location, Long> block_timings = new HashMap<>();
	
	public static Map<Location, Integer> bugged_blocks = new HashMap<>();
	
	@Override
	public void run() {
		long timestamp = System.currentTimeMillis();
		
		skipped = 0;
		chunks = 0;
		machines = 0;
		map_chunk.clear();
		map_machine.clear();
		time = 0;
		map_chunktime.clear();
		skipped_chunks.clear();
		map_machinetime.clear();
		block_timings.clear();

		final Map<Location, Integer> bugged = new HashMap<>(bugged_blocks);
		bugged_blocks.clear();
		
		Map<Location, Boolean> remove = new HashMap<>(delete);

		for (Map.Entry<Location, Boolean> entry: remove.entrySet()) {
			BlockStorage._integrated_removeBlockInfo(entry.getKey(), entry.getValue());
			delete.remove(entry.getKey());
		}
		
		if (!HALTED) {
			for (final String c: BlockStorage.getTickingChunks()) {
				long timestamp2 = System.currentTimeMillis();
				chunks++;
				
				blocks:
				for (final Location l: BlockStorage.getTickingLocations(c)) {
					if (l.getWorld().isChunkLoaded(l.getBlockX() >> 4, l.getBlockZ() >> 4)) {
						final Block b = l.getBlock();
						final SlimefunItem item = BlockStorage.check(l);
						if (item != null) {
							machines++;
							try {
								item.getBlockTicker().update();
								if (item.getBlockTicker().isSynchronized()) {
									Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, () -> {
										try {
											long timestamp3 = System.currentTimeMillis();
											item.getBlockTicker().tick(b, item, BlockStorage.getLocationInfo(l));
											
											map_machinetime.put(item.getID(), (map_machinetime.containsKey(item.getID()) ? map_machinetime.get(item.getID()): 0) + (System.currentTimeMillis() - timestamp3));
											map_chunk.put(c, (map_chunk.containsKey(c) ? map_chunk.get(c): 0) + 1);
											map_machine.put(item.getID(), (map_machine.containsKey(item.getID()) ? map_machine.get(item.getID()): 0) + 1);
											block_timings.put(l, System.currentTimeMillis() - timestamp3);
										} catch (Exception x) {
										}
									});
								}
								else {
									long timestamp3 = System.currentTimeMillis();
									item.getBlockTicker().tick(b, item, BlockStorage.getLocationInfo(l));
									
									map_machinetime.put(item.getID(), (map_machinetime.containsKey(item.getID()) ? map_machinetime.get(item.getID()): 0) + (System.currentTimeMillis() - timestamp3));
									map_chunk.put(c, (map_chunk.containsKey(c) ? map_chunk.get(c): 0) + 1);
									map_machine.put(item.getID(), (map_machine.containsKey(item.getID()) ? map_machine.get(item.getID()): 0) + 1);
									block_timings.put(l, System.currentTimeMillis() - timestamp3);
								}
								tickers.add(item.getBlockTicker());
							} catch (Exception x) {
							}
						}
						else skipped++;
					}
					else {
						skipped += BlockStorage.getTickingLocations(c).size();
						skipped_chunks.add(c);
						chunks--;
						break blocks;
					}
				}
				
				map_chunktime.put(c, System.currentTimeMillis() - timestamp2);
			}
		}

		for (Map.Entry<Location, Location> entry: move.entrySet()) {
			BlockStorage._integrated_moveLocationInfo(entry.getKey(), entry.getValue());
		}
		move.clear();
		
		for (BlockTicker ticker: tickers) {
			ticker.unique = true;
		}
		tickers.clear();
		
		time = System.currentTimeMillis() - timestamp;
	}

	public void info(CommandSender sender) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2== &aSlimefun Diagnostic Tool &2=="));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Halted: &e&l" + String.valueOf(HALTED).toUpperCase()));
		sender.sendMessage("");
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Impact: &e" + time + "ms / 50-750ms"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Ticked Chunks: &e" + chunks));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Ticked Machines: &e" + machines));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Skipped Machines: &e" + skipped));
		sender.sendMessage("");
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Ticking Machines:"));
		if (sender instanceof Player) {
			TellRawMessage tellraw = new TellRawMessage();
			tellraw.addText("   &7&oHover for more Info");
			StringBuilder hover = new StringBuilder();
			int hidden = 0;
			for (String item: map_machine.keySet()) {
				if (map_machinetime.get(item) > 0) hover.append("\n&c" + item + " - " + map_machine.get(item) + "x &7(" + map_machinetime.get(item) + "ms)");
				else hidden++;
			}
			hover.append("\n\n&c+ &4" + hidden + " Hidden");
			tellraw.addHoverEvent(HoverAction.SHOW_TEXT, hover.toString());
			try {
				tellraw.send((Player) sender);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			int hidden = 0;
			for (String item: map_machine.keySet()) {
				if (map_machinetime.get(item) > 0) sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "  &e" + item + " - " + map_machine.get(item) + "x &7(" + map_machinetime.get(item) + "ms)"));
				else hidden++;
			}
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c+ &4" + hidden + " Hidden"));
		}
		sender.sendMessage("");
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Ticking Chunks:"));
		if (sender instanceof Player) {
			TellRawMessage tellraw = new TellRawMessage();
			tellraw.addText("   &7&oHover for more Info");
			StringBuilder hover = new StringBuilder();
			int hidden = 0;
			for (String c: map_chunktime.keySet()) {
				if (!skipped_chunks.contains(c)) {
					if (map_chunktime.get(c) > 0) hover.append("\n&c" + c.replace("CraftChunk", "") + " - " + (map_chunk.containsKey(c) ? map_chunk.get(c): 0) + "x &7(" + map_chunktime.get(c) + "ms)");
					else hidden++;
				}
			}
			hover.append("\n\n&c+ &4" + hidden + " Hidden");
			tellraw.addHoverEvent(HoverAction.SHOW_TEXT, hover.toString());
			
			try {
				tellraw.send((Player) sender);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			int hidden = 0;
			for (String c: map_chunktime.keySet()) {
				if (!skipped_chunks.contains(c)) {
					if (map_chunktime.get(c) > 0) sender.sendMessage("  &c" + c.replace("CraftChunk", "") + " - " + (map_chunk.containsKey(c) ? map_chunk.get(c): 0) + "x &7(" + map_chunktime.get(c) + "ms)");
					else hidden++;
				}
			}
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c+ &4" + hidden + " Hidden"));
		}
	}
	
	public long getTimings(Block b) {
		return block_timings.containsKey(b.getLocation()) ? block_timings.get(b.getLocation()): 0L;
	}
	
	public long getTimings(String item) {
		return map_machinetime.containsKey(item) ? map_machinetime.get(item): 0L;
	}
	
	public long getTimings(Chunk c) {
		return map_chunktime.containsKey(c.toString()) ? map_chunktime.get(c.toString()): 0L;
	}

}
