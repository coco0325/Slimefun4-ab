package me.mrCookieSlime.Slimefun.api;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

import me.mrCookieSlime.Slimefun.api.energy.ItemEnergy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import me.vagdedes.mysql.database.SQL;

public class Backpacks {

	public static String tablename = "sf_backpack";

	public static String createBackpack(Player p) {
		Date date = new Date();
		long id = date.getTime();
		SQL.insertData("uuid", " '"+p.getUniqueId().toString()+"#"+id+"' ", tablename);
		return p.getUniqueId() + "#" + id;
	}
	
	public static void openBackpack(Player p, ItemStack item) {
		Inventory inv = getInventory(item);
		if (inv != null) p.openInventory(inv);
	}
	
	public static Inventory getInventory(ItemStack item) {
		if (item == null || !item.hasItemMeta() || !item.getItemMeta().hasLore()) return null;
		long id = -1;
		String uuid = "";
		for (String line: item.getItemMeta().getLore()) {
			if (line.startsWith(ChatColor.translateAlternateColorCodes('&', "&7ID: ")) && line.contains("#")) {
				try {
					id = Long.parseLong(line.split("#")[1]);
					uuid = line.split("#")[0].replace(ChatColor.translateAlternateColorCodes('&', "&7ID: "), "");
				} catch(NumberFormatException x) {
					x.printStackTrace();
				}
			}
		}
		
		if (id >= 0) {
			Object o = SQL.get("inv", "uuid", "=", uuid+"#"+id, tablename);
			String baseinv = String.valueOf(o);
			Integer size = getSize(item);
			try {
				Inventory inv = Bukkit.createInventory(null, size, "背包 [ 容量 " + size + " ]");
				if(o == null){
					return inv;
				}
				inv.setContents(fromBase64(baseinv).getContents());
				return inv;
			}catch (Exception e){
				saveBackpack(Bukkit.createInventory(null, 36), item);
				return Bukkit.createInventory(null, size, "背包 [ 容量 " + 36+ " ]");
			}
		}
		else return null;
	}
	
	public static void saveBackpack(Inventory inv, ItemStack item) {
		long id = -1;
		String uuid = "";
		for (String line: item.getItemMeta().getLore()) {
			if (line.startsWith(ChatColor.translateAlternateColorCodes('&', "&7ID: ")) && line.contains("#")) {
				try {
					id = Long.parseLong(line.split("#")[1]);
					uuid = line.split("#")[0].replace(ChatColor.translateAlternateColorCodes('&', "&7ID: "), "");
				} catch(NumberFormatException x) {
					x.printStackTrace();
				}
			}
		}
		String baseinv = toBase64(inv);
		SQL.set("inv", baseinv, "uuid", "=", uuid+"#"+id, tablename);
	}

	public static String toBase64(Inventory inventory) throws IllegalStateException {
		try {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			BukkitObjectOutputStream dataOutput = new BukkitObjectOutputStream(outputStream);

			// Write the size of the inventory
			dataOutput.writeInt(inventory.getSize());

			// Save every element in the list
			for (int i = 0; i < inventory.getSize(); i++) {
				dataOutput.writeObject(inventory.getItem(i));
			}

			// Serialize that array
			dataOutput.close();
			return Base64Coder.encodeLines(outputStream.toByteArray());
		} catch (Exception e) {
			throw new IllegalStateException("無法編碼.", e);
		}
	}

	public static Inventory fromBase64(String data) throws IOException {
		try {
			ByteArrayInputStream inputStream = new ByteArrayInputStream(Base64Coder.decodeLines(data));
			BukkitObjectInputStream dataInput = new BukkitObjectInputStream(inputStream);
			Inventory inventory = Bukkit.getServer().createInventory(null, dataInput.readInt());

			// Read the serialized inventory
			for (int i = 0; i < inventory.getSize(); i++) {
				inventory.setItem(i, (ItemStack) dataInput.readObject());
			}

			dataInput.close();
			return inventory;
		} catch (ClassNotFoundException e) {
			throw new IOException("無法解碼.", e);
		}
	}

	public static int getSize(ItemStack item){
		return Integer.parseInt(item.getItemMeta().getLore().get(1).substring(8));
	}

	public static boolean isEmpty(ItemStack item){
		for(ItemStack i : getInventory(item).getContents()){
			if(i != null){
				return false;
			}
		}
		return true;
	}
}
