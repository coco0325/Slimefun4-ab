package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends ItemStack {
    public MenuItem(Material type, String name, int amount, int durability, String action) {
        super(type, amount);
        ItemMeta im = this.getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lore = new ArrayList();
        lore.add("");
        lore.add(ChatColor.GREEN + "> " + action);
        im.setLore(lore);
        this.setItemMeta(im);
        this.setDurability((short)durability);
    }

    public MenuItem(Material type, String name, int durability, String action) {
        super(type);
        ItemMeta im = this.getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lore = new ArrayList();
        lore.add("");
        lore.add(ChatColor.GREEN + "> " + action);
        im.setLore(lore);
        this.setItemMeta(im);
        this.setDurability((short)durability);
    }
}
