package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonCategory;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public final class Categories {
	
	private Categories() {}

	public final static Category WEAPONS = new Category(new MenuItem(Material.GOLDEN_SWORD, "&7Weapons", 0, "open"), 1);
	public static final Category PORTABLE = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&7物品類", "", "&a> 點擊開啟"), 1);
	public final static Category FOOD = new Category(new MenuItem(Material.APPLE, "&7食物類", 0, "點擊開啟"), 2);
	public static final Category MACHINES_1 = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&7基礎機器", "", "&a> 點擊開啟"), 1);
	public static final LockedCategory ELECTRICITY = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU4NDQzMmFmNmYzODIxNjcxMjAyNThkMWVlZThjODdjNmU3NWQ5ZTQ3OWU3YjBkNGM3YjZhZDQ4Y2ZlZWYifX19"), "&b能源與電力", "", "&a> 點擊開啟"), 4, MACHINES_1);
	public final static LockedCategory GPS = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bGPS 系統", "", "&a> 點擊開啟"), 4, MACHINES_1);
	public final static Category ARMOR = new Category(new MenuItem(Material.IRON_CHESTPLATE, "&7科技盔甲", 0, "點擊開啟"), 2);
	public final static Category LUMPS_AND_MAGIC = new Category(new MenuItem(Material.FIRE_CHARGE, "&7魔法材料", 0, "點擊開啟"), 2);
	public final static Category MAGIC = new Category(new MenuItem(Material.BLAZE_POWDER, "&7魔力物品", 0, "點擊開啟"), 3);
	public static final Category MISC = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&7雜項", "", "&a> 點擊開啟"), 2);	public final static Category TECH = new Category(new CustomArmor(new MenuItem(Material.LEATHER_CHESTPLATE, "&7科技物品", 0, "點擊開啟"), Color.SILVER), 3);
	public static final Category RESOURCES = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&7資源", "", "&a> 點擊開啟"), 1);
	public static final Category CARGO = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&c物流管理", "", "&a> 點擊開啟"), 4, MACHINES_1);
	public final static Category TECH_MISC = new Category(new MenuItem(Material.COMPARATOR, "&7科技零件", 0, "點擊開啟"), 2);
	public final static Category MAGIC_ARMOR = new Category(new MenuItem(Material.GOLDEN_CHESTPLATE, "&7魔法盔甲", 0, "點擊開啟"), 2);
	public final static Category TALISMANS_1 = new Category(new MenuItem(Material.EMERALD, "&7魔法水晶 - &aI", 0, "點擊開啟"), 2);
	public final static LockedCategory TALISMANS_2 = new LockedCategory(new MenuItem(Material.EMERALD, "&7魔法水晶 - &aII", 0, "點擊開啟"), 3, TALISMANS_1);
	public final static Category TOOLS = new Category(new MenuItem(Material.GOLDEN_PICKAXE, "&7工具類", 0, "點擊開啟"), 1);
	public final static SeasonCategory CHRISTMAS = new SeasonCategory(12, 1, new MenuItem(Material.NETHER_STAR, "&a聖&c誕&a節", 0, ChatColor.translateAlternateColorCodes('&', "&c幫助 &a聖誕老人")));
	public final static SeasonCategory VALENTINES_DAY = new SeasonCategory(2, 2, new MenuItem(Material.POPPY, "&d情人節", 0, ChatColor.translateAlternateColorCodes('&', "&d慶祝愛情!")));
	public final static SeasonCategory EASTER = new SeasonCategory(4, 2, new MenuItem(Material.EGG, "&6復活節", 0, ChatColor.translateAlternateColorCodes('&', "&a來畫些蛋吧")));
	public final static SeasonCategory BIRTHDAY = new SeasonCategory(10, 1, new MenuItem(Material.FIREWORK_ROCKET, "&a&lTheBusyBiscuit的生日 &7(10/26)", 0, ChatColor.translateAlternateColorCodes('&', "&a與我一同慶祝")));
	
	private static ItemStack getSkull(String texture) {
		try {
			return getSkull(texture);
		}
		catch(Exception x) {
			x.printStackTrace();

			return new ItemStack(Material.PLAYER_HEAD);
		}
	}
}
