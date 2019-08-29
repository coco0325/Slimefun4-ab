package me.mrCookieSlime.Slimefun.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Clock;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

public class ErrorReport {
	
	private File file;
	
	public ErrorReport(Throwable throwable, Consumer<PrintStream> printer) {
		String path = "plugins/Slimefun/error-reports/" + Clock.getFormattedTime();
		file = new File(path + ".err");
		
		if (file.exists()) {
			IntStream stream = IntStream.iterate(1, i -> i + 1).filter(i -> !new File(path + " (" + i + ").err").exists());
			int id = stream.findFirst().getAsInt();
			
			file = new File(path + " (" + id + ").err");
		}
		
		try (PrintStream stream = new PrintStream(file)) {
			stream.println();
			stream.println("Java Environment:");
			stream.println("  Operating System: " + System.getProperty("os.name"));
			stream.println("  Java Version: " + System.getProperty("java.version"));
			stream.println();
			stream.println("Server Software: " + Bukkit.getName());
			stream.println("  Build: " + Bukkit.getVersion());
			stream.println("  Minecraft: " + Bukkit.getBukkitVersion());
			stream.println();
			stream.println("Slimefun Environment:");
			stream.println("  CS-CoreLib v" + CSCoreLib.getLib().getDescription().getVersion());
			stream.println("  Slimefun v" + SlimefunStartup.instance.getDescription().getVersion());
			stream.println();

			List<String> plugins = new ArrayList<>();
			List<String> addons = new ArrayList<>();
			
			for (Plugin p: Bukkit.getPluginManager().getPlugins()) {
				if (Bukkit.getPluginManager().isPluginEnabled(p)) {
					plugins.add("  + " + p.getName() + " " + p.getDescription().getVersion());
					if (p.getDescription().getDepend().contains("Slimefun") || p.getDescription().getSoftDepend().contains("Slimefun"))
						addons.add("  + " + p.getName() + " " + p.getDescription().getVersion());
				}
				else {
					plugins.add("  - " + p.getName() + " " + p.getDescription().getVersion());
					if (p.getDescription().getDepend().contains("Slimefun") || p.getDescription().getSoftDepend().contains("Slimefun"))
						addons.add("  - " + p.getName() + " " + p.getDescription().getVersion());
				}
			}
			
			stream.println("Installed Addons (" + addons.size() + ")");
			addons.forEach(stream::println);
			
			stream.println();
			
			stream.println("Installed Plugins (" + plugins.size() + "):");
			plugins.forEach(stream::println);
			
			stream.println();
			
			printer.accept(stream);
			
			stream.println("Stacktrace:");
			stream.println();
			throwable.printStackTrace(stream);
			
			System.err.println("[Slimefun] Saved as: ");
			System.err.println("[Slimefun] /plugins/Slimefun/error-reports/" + file.getName());
			System.err.println("[Slimefun] Please consider sending this File to the developer(s) of Slimefun, this message does not have to be included.");
			System.err.println("[Slimefun] You can put the file on Pastebin and then post it here: https://github.com/TheBusyBiscuit/Slimefun4/issues");
			System.err.println("[Slimefun] ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ErrorReport(Throwable throwable, TickerTask task, Location l, SlimefunItem item) {
		this(throwable, stream -> {
			stream.println("Block Info:");
			stream.println("  World: " + l.getWorld().getName());
			stream.println("  X: " + l.getBlockX());
			stream.println("  Y: " + l.getBlockY());
			stream.println("  Z: " + l.getBlockZ());
			stream.println("  Material: " + l.getBlock().getType());
			stream.println("  State: " + l.getBlock().getState().getClass().getName());
			stream.println();
			stream.println("Ticker-Info:");
			stream.println("  Type: " + (item.getBlockTicker().isSynchronized() ? "Synchronized": "Asynchronous"));
			stream.println("  Object Dump: " + task.toString());
			stream.println();
			stream.println("Slimefun Data:");
			stream.println("  ID: " + item.getID());
			stream.println("  Inventory: " + BlockStorage.getStorage(l.getWorld()).hasInventory(l));
			stream.println("  Data: " + BlockStorage.getBlockInfoAsJson(l));
			stream.println();
		});
	}
	
	public ErrorReport(Throwable throwable, Player p) {
		this(throwable, stream -> {
			stream.println("Player Info:");
			stream.println("  ID: " + p.getUniqueId() + " (" + p.getName() + ")");
			stream.println("  World: " + p.getWorld().getName());
			stream.println("  X: " + p.getLocation().getX());
			stream.println("  Y: " + p.getLocation().getY());
			stream.println("  Z: " + p.getLocation().getZ());
			stream.println("  Profile in RAM? " + PlayerProfile.isLoaded(p.getUniqueId()));
			stream.println();
			stream.println("Item in Main Hand:");
			stream.println(p.getInventory().getItemInMainHand());
			stream.println(SlimefunItem.getByItem(p.getInventory().getItemInMainHand()));
			stream.println();
			stream.println("Item in Off Hand:");
			stream.println(p.getInventory().getItemInOffHand());
			stream.println(SlimefunItem.getByItem(p.getInventory().getItemInOffHand()));
			stream.println();
			stream.println("Helmet:");
			stream.println(p.getInventory().getHelmet());
			stream.println(SlimefunItem.getByItem(p.getInventory().getHelmet()));
			stream.println();
			stream.println("Chestplate:");
			stream.println(p.getInventory().getChestplate());
			stream.println(SlimefunItem.getByItem(p.getInventory().getChestplate()));
			stream.println();
			stream.println("Leggings:");
			stream.println(p.getInventory().getLeggings());
			stream.println(SlimefunItem.getByItem(p.getInventory().getLeggings()));
			stream.println();
			stream.println("Boots:");
			stream.println(p.getInventory().getBoots());
			stream.println(SlimefunItem.getByItem(p.getInventory().getBoots()));
			stream.println();
		});
	}

	public File getFile() {
		return file;
	}
	
	public static void tryCatch(Function<Exception, ErrorReport> function, Runnable runnable) {
		try {
			runnable.run();
		}
		catch(Exception x) {
			function.apply(x);
		}
	}

}
