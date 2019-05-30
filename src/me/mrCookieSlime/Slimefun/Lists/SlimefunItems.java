package me.mrCookieSlime.Slimefun.Lists;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.crypto.CipherSpi;

@SuppressWarnings("deprecation")
public class SlimefunItems {

	/* Items */
	public static ItemStack PORTABLE_CRAFTER = null;
	public static ItemStack PORTABLE_DUSTBIN = null;
	public static ItemStack ENDER_BACKPACK = null;
	public static ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.ENDER_EYE, "&6&l魔法末影之眼", 0, new String[] {"&4&l需要全套末影護甲", "", "&7&e右鍵&7 以射出一顆末影珍珠"});
	public static ItemStack BROKEN_SPAWNER = new CustomItem(new MaterialData(Material.SPAWNER), "&c已損壞的生怪箱", "&7類型: &b<#>", "", "&c已損壞, 需要在遠古魔法祭壇中修復");
	public static ItemStack REPAIRED_SPAWNER = new CustomItem(Material.SPAWNER, "&b已修復的生怪箱", 0, new String[] {"&7類型: &b<#>"});
	public static ItemStack INFERNAL_BONEMEAL = new CustomItem(new MaterialData(Material.BONE_MEAL), "&4地獄骨粉", "", "&c加速地獄疙瘩的生長速度");

	/* Gadgets */
	public static ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6淘金盤","&a&o可以獲得各種各樣的礦物", "", "&7&e右鍵&7 從沙礫中淘金");
	public static ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&r&l降落傘", "&7按住 &eShift&7 使用"), Color.WHITE);
	public static ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEAD, "&6抓鉤", "&7&e右鍵&7 使用");
	public static ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&b太陽能頭盔", "", "&a&o替身上的物品充電");
	public static ItemStack CLOTH = new CustomItem(Material.PAPER, "&b布", 0);
	public static ItemStack CAN = null;
	public static ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a夜視眼鏡", "", "&9+ 夜視效果"), Color.BLACK);
	public static ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e農夫的靴子", "", "&6&o能夠防止你踩壞農田"), Color.YELLOW);
	public static ItemStack INFUSED_MAGNET = null;
	public static ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&c學識之瓶", "", "&r允許你將經驗儲存在瓶子裡", "&7需要消耗 &a1 個等級");
	public static ItemStack RAG = new CustomItem(Material.PAPER, "&c破布", "", "&a1級醫療供給", "", "&r恢復2點血量", "&r可以熄滅身上的火", "", "&7&e右鍵&7 使用");
	public static ItemStack BANDAGE = new CustomItem(Material.PAPER, "&c繃帶", "", "&a2級醫療供給", "", "&r恢復4點血量", "&r可以熄滅身上的火", "", "&7&e右鍵&7 使用");
	public static ItemStack SPLINT = new CustomItem(Material.STICK, "&c夾板", "", "&a1級醫療供給", "", "&r恢復2點血量", "", "&7&e右鍵&7使用");
	public static ItemStack VITAMINS = new CustomItem(Material.NETHER_WART, "&c維他命", "", "&a3級醫療供給", "", "&r恢復4點血量", "&r可以熄滅身上的火", "&r治愈中毒/凋零/輻射的負面效果", "", "&7&e右鍵&7 使用");
	public static ItemStack MEDICINE = new CustomItem(Material.POTION, "&c藥物", 8229, new String[] {"", "&a3級醫療供給", "", "&r恢復4點血量", "&r可以熄滅身上的火", "&r治愈中毒/凋零/輻射的負面效果", "", "&7&e右鍵&7 飲用"});

	/* Backpacks */
	public static ItemStack BACKPACK_SMALL = null;
	public static ItemStack BACKPACK_MEDIUM = null;
	public static ItemStack BACKPACK_LARGE = null;
	public static ItemStack WOVEN_BACKPACK = null;
	public static ItemStack GILDED_BACKPACK = null;
	public static ItemStack BOUND_BACKPACK = null;
	public static ItemStack COOLER = null;

	public static ItemStack VOIDBAG_SMALL = null;
	public static ItemStack VOIDBAG_MEDIUM = null;
	public static ItemStack VOIDBAG_BIG = null;
	public static ItemStack VOIDBAG_LARGE = null;
	public static ItemStack BOUND_VOIDBAG = null;

	/* Jetpacks */
	public static ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eI", "", "&8\u21E8 &7材料: &b硬鋁", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7推力: &c0.35", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eII", "", "&8\u21E8 &7材料: &b焊錫", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7推力: &c0.4", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eIII", "", "&8\u21E8 &7材料: &b銀銅合金", "&c&o&8\u21E8 &e \u26A1 &70 / 45 J", "&8\u21E8 &7推力: &c0.45", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eIV", "", "&8\u21E8 &7材料: &b鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7推力: &c0.5", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eV", "", "&8\u21E8 &7材料: &b大馬士革鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7推力: &c0.55", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eVI", "", "&8\u21E8 &7材料: &b強化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7推力: &c0.6", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9電動噴射背包&7 - &eVII", "", "&8\u21E8 &7材料: &b黑鑽石", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7推力: &c0.7", "", "&7按住&eShift&7 使用"), Color.BLACK);
	public static ItemStack ARMORED_JETPACK = new CustomItem(new MaterialData(Material.IRON_CHESTPLATE), "&9裝甲噴射背包", "&8\u21E8 &7材料: &b鋼", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7推力: &c0.45", "", "&7按住&eShift&7 使用");

	/* Jetboots */
	public static ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eI", "", "&8\u21E8 &7材料: &b硬鋁", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7速度: &a0.35", "&8\u21E8 &7準確度: &c50%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eII", "", "&8\u21E8 &7材料: &b焊錫", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7速度: &a0.4", "&8\u21E8 &7準確度: &660%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eIII", "", "&8\u21E8 &7材料: &b銀銅合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7準確度: &665%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eIV", "", "&8\u21E8 &7材料: &b鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.5", "&8\u21E8 &7準確度: &e70%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eV", "", "&8\u21E8 &7材料: &b大馬士革鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7速度: &a0.55", "&8\u21E8 &7準確度: &a75%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eVI", "", "&8\u21E8 &7材料: &b強化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7速度: &a0.6", "&8\u21E8 &7準確度: &c80%", "", "&7按住&eShift&7 使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9噴射靴&7 - &eVII", "", "&8\u21E8 &7材料: &b黑鑽石", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7速度: &a0.7", "&8\u21E8 &7準確度: &c99.9%", "", "&7按住&eShift&7 使用"), Color.BLACK);
	public static ItemStack ARMORED_JETBOOTS = new CustomItem(new MaterialData(Material.IRON_BOOTS), "&9裝甲噴射靴", "", "&8\u21E8 &7材料: &b鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7準確度: &e70%", "", "&7按住&eShift&7 使用");

	/* Multi Tools */
	public static ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eI", "", "&8\u21E8 &7材料: &b硬鋁", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack SOLDER_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eII", "", "&8\u21E8 &7材料: &b焊錫", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack BILLON_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eIII", "", "&8\u21E8 &7材料: &b銀銅合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eIV", "", "&8\u21E8 &7材料: &b鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eV", "", "&8\u21E8 &7材料: &b大馬士革鋼", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eVI", "", "&8\u21E8 &7材料: &b強化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");
	public static ItemStack CARBONADO_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具&7- &eVII", "", "&8\u21E8 &7材料: &b黑鑽石", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&7&e右鍵&7 使用", "&7按住&eShift + 右鍵&7 以更改模式");

	/* Food */
	public static ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6幸運餅乾", "", "&a&o告訴你未來發生的事 :o");
	public static ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6牛肉乾", "", "&a&o管飽");
	public static ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6魔法糖", "", "&a&o感受赫爾墨斯的力量!");
	public static ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6怪物肉乾", "", "&a&o提神抗飢餓");
	public static ItemStack APPLE_JUICE = new CustomPotion("&c蘋果汁", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢復&b&o" + "3.0" + " &7&o的飢餓值") ;
	public static ItemStack MELON_JUICE = new CustomPotion("&c西瓜汁", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢復&b&o" + "3.0" + " &7&o的飢餓值") ;
	public static ItemStack CARROT_JUICE = new CustomPotion("&6胡蘿蔔汁", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢復&b&o" + "3.0" + " &7&o的飢餓值") ;
	public static ItemStack PUMPKIN_JUICE = new CustomPotion("&6南瓜汁", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&o恢復&b&o" + "3.0" + " &7&o的飢餓值") ;
	public static ItemStack GOLDEN_APPLE_JUICE = new CustomPotion("&b金蘋果汁", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0));

	/* Christmas */
	public static ItemStack CHRISTMAS_MILK = new CustomPotion("&6聖誕牛奶", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "", "&7&o恢復&b&o" + "2.5" + " &7&o的飢餓值") ;
	public static ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6巧克力牛奶", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 12, 0), "", "&7&o恢復&b&o" + "6.0" + " &7&o的飢餓值") ;
	public static ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&a蛋酒", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 7, 0), "", "&7&o恢復&b&o" + "3.5" + " &7&o的飢餓值") ;
	public static ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&c蘋果酒", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&o恢復&b&o" + "7.0" + " &7&o的飢餓值") ;
	public static ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("聖誕餅乾"), 0);
	public static ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("水果蛋糕"), 0);
	public static ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&r蘋果派", 0);
	public static ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6熱可可", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&o恢復&b&o" + "7.0" + " &7&o的飢餓值") ;
	public static ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("聖誕蛋糕"), 0);
	public static ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.BRICKS, "&6焦糖", 0);
	public static ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6焦糖蘋果", 0);
	public static ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6巧克力蘋果", 0);
	public static ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, Christmas.color("聖誕禮物"), "&7來自&emrCookieSlime &7的禮物", "&7收件人: &e你", "", "&e右鍵&7 拆開");

	/* Easter */
	public static ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&r復活節彩蛋", "&b驚喜!");
	public static ItemStack EASTER_CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6胡蘿蔔派", 0);

	/* Weapons */
	public static ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&7奶奶的拐杖", 0, new String[0], new String[] {"KNOCKBACK-2"});
	public static ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&7爺爺的拐杖", 0, new String[0], new String[] {"KNOCKBACK-5"});
	public static ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&6斬首之劍", "&7斬首II", "", "&r有機率砍下生物的頭", "&r(提高掉落凋零骷髏頭的機率)");
	public static ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLDEN_SWORD, "&c吸血鬼之刀", 0, new String[] {"&7生命竊取I", "", "&r在攻擊時有45% 的機率", "使自己恢復2 點血量"}, new String[] {"FIRE_ASPECT-2", "DURABILITY-4", "DAMAGE_ALL-2"});
	public static ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&a地震斧", "", "&7&o製造一場地震...", "", "&7&e右鍵&7 使用");

	/* Bows */
	public static ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&c爆破弓", 0, new String[] {"&r被爆裂之弓射出的箭擊中將會飛上天"});
	public static ItemStack ICY_BOW = new CustomItem(Material.BOW, "&b冰封之弓", 0, new String[] {"&r被此弓射出的箭擊中", "&r將會因寒冷而無法移動(2秒內)"});
	public static ItemStack WITHER_BOW = new CustomItem(Material.BOW, "&a凋零之弓", 0, new String[] {"&c&o花開凋謝之時", "", "&r將會給予射中的實體凋零效果" });

	/* Tools */
	public static ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6熔爐鎬", 0, new String[] {"&c&l自動熔煉", "", "&9在挖礦時有時運效果"});
	public static ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6伐木斧", 0, new String[] {"&a&o砍倒整棵樹木..."});
	public static ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.IRON_PICKAXE, "&c生怪箱之鎬", 0, new String[] {"", "&9可以獲取生怪箱"});
	public static ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9榮耀之鎬", 0, new String[] {"", "&r它如此強大", "&r因此能自動將挖到的礦物變為粉末..."}, new String[] {"DURABILITY-2", "DIG_SPEED-4"});
	public static ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&e爆炸鎬", 0, new String[] {"", "&r允許你在一瞬間挖掘礦物", "", "&9在挖礦時有時運效果"});
	public static ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&a尋礦鎬", 0, new String[] {"&r使用時將會指出你附近的礦物", "&r但可能它會受到損傷", " ", "&7&e右鍵&7 以尋找四周的礦物"});
	public static ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9鈷鎬", 0, new String[] {}, new String[] {"DURABILITY-3", "DIG_SPEED-6"});
	public static ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&e礦脈鎬", 0, new String[] {"", "&r這個鎬子將會挖出", "&r整個礦脈的礦物..."} );

	/* Armor */
	public static ItemStack GLOWSTONE_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&e&l螢光頭盔", 0, new String[] {"", "&a&o像太陽一樣閃耀!", "", "&9+ 夜視效果" }), Color.YELLOW);
	public static ItemStack GLOWSTONE_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&e&l螢光胸甲", 0, new String[] {"", "&a&o像太陽一樣閃耀!", "", "&9+ 夜視效果"}), Color.YELLOW);
	public static ItemStack GLOWSTONE_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&e&l螢光護腿", 0, new String[] {"", "&a&o像太陽一樣閃耀!", "", "&9+ 夜視效果" }), Color.YELLOW);
	public static ItemStack GLOWSTONE_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e&l螢光靴子", 0, new String[] {"", "&a&o像太陽一樣閃耀!", "", "&9+ 夜視效果" }), Color.YELLOW);
	public static ItemStack ENDER_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5&l末影頭盔", 0, new String[] {"", "&a&o任意移動"}), Color.fromRGB(28, 25, 112) );
	public static ItemStack ENDER_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5&l末影胸甲", 0, new String[] {"", "&a&o任意移動"}), Color.fromRGB(28, 25, 112 ));
	public static ItemStack ENDER_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5&l末影護腿", 0, new String[] {"", "&a&o任意移動"}), Color.fromRGB(28, 25, 112) );
	public static ItemStack ENDER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5&l末影靴子", 0, new String[] {"", "&a&o任意移動", "" , "&9+ 使用末影珍珠時無傷害"}), Color.fromRGB(28, 25, 112));
	public static ItemStack SLIME_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a&l史萊姆頭盔 I", 0, new String[] {"", "&a&o有彈性的感覺"}), Color.LIME);
	public static ItemStack SLIME_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&a&l史萊姆胸甲 I", 0, new String[] {"", "&a&o有彈性的感覺"}), Color.LIME);
	public static ItemStack SLIME_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&a&l史萊姆護腿 I", 0, new String[] {"", "&a&o有彈性的感覺", "", "&9+ 速度"}) , Color.LIME);
	public static ItemStack SLIME_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&a&l史萊姆靴子 I", 0, new String[] {"", "&a&o有彈性的感覺", "", "&9+ 跳躍提升", "&9+ 減免摔落傷害"}), Color.LIME);
	public static ItemStack CACTUS_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2仙人掌頭盔", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color. GREEN);
	public static ItemStack CACTUS_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2仙人掌胸甲", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color .GREEN);
	public static ItemStack CACTUS_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2仙人掌護腿", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color. GREEN);
	public static ItemStack CACTUS_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2仙人掌靴子", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color. GREEN);
	public static ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&7大馬士革頭盔", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&7大馬士革胸甲", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&7大馬士革護腿", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&7大馬士革靴子", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&b強化合金頭盔", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&b強化合金胸甲", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&b強化合金護腿", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&b強化合金靴子", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack SCUBA_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&c潛水頭盔", 0, new String[] {"", "&b讓你能夠在水下呼吸", "&4&o生化套裝的一部分" }), Color.ORANGE);
	public static ItemStack HAZMATSUIT_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&c生化服", 0, new String[] {"", "&b讓你能在火焰中行走", "&4&o生化套裝的一部分"}), Color.ORANGE);
	public static ItemStack HAZMATSUIT_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&c生化護腿", 0, new String[] {"", "&4&o生化套裝的一部分"}), Color.ORANGE);
	public static ItemStack RUBBER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&c橡膠靴", 0, new String[] {"", "&4&o生化套裝的一部分"}), Color.BLACK);
	public static ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6鍍金鐵頭盔", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6鍍金鐵胸甲", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6鍍金鐵護腿", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6鍍金鐵靴子", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GOLD_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6金頭盔", 0, new String[] {"&912克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6金胸甲", 0, new String[] {"&912克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6金護腿", 0, new String[] {"&912克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6金靴子", 0, new String[] {"&912克拉"}, new String[] {"DURABILITY-10"});
	public static ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&a&l史萊姆頭盔 II", 0, new String[] {"&7&o已強化", "", "&a&o有彈性的感覺"}, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&a&l史萊姆胸甲 II", 0, new String[] {"&7&o已強化", "", "&a&o有彈性的感覺"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&a&l史萊姆護腿 II", 0, new String[] {"&7&o已強化", "", "&a&o有彈性的感覺", "", "&9+ SPEED "}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&a&l史萊姆靴子 II", 0, new String[] {"&7&o已強化", "", "&a&o有彈性的感覺", "", "&9+ 跳躍提升", "&9+ 減免摔落傷害"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack BOOTS_OF_THE_STOMPER = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&b踐踏者之靴", 0, new String[] {"", "&9你受到的所有摔落傷害", "&9將轉給附近的生物/玩家", "", "&9+ 減免摔落傷害"}), Color.AQUA);
	public static ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&c重型頭盔", 0, new String[] {"", "&9+ 力量", "&9+ 緩慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&c重型胸甲", 0, new String[] {"", "&9+ 力量", "&9+ 緩慢"}, new String[] {"DURABILITY-10" , "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&c重型護腿", 0, new String[] {"", "&9+ 力量", "&9+ 緩慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&c重型靴子", 0, new String[] {"", "&9+ 力量", "&9+ 緩慢"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});

	/* Misc */
	public static ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6魔法顆粒 &7- &eI", 0, new String[] {"", "&c&o等級: I"});
	public static ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6魔法顆粒 &7- &eII", 0, new String[] {"", "&c&o等級: II"});
	public static ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6魔法顆粒 &7- &eIII", 0, new String[] {"", "&c&o等級: III"});
	public static ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5末影顆粒 &7- &eI", 0, new String[] {"", "&c&o等級: I"});
	public static ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5末影顆粒 &7- &eII", 0, new String[] {"", "&c&o等級: II"});
	public static ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5末影顆粒 &7- &eIII", 0, new String[] {"", "&c&o等級: III"});
	public static ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6魔法書皮", 0, new String[] {"", "&a&o用於各種魔法書"});
	public static ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&b基礎電路板", 0);
	public static ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&b高級電路板", 0);
	public static ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&r小麥粉", 0);
	public static ItemStack STEEL_PLATE = new CustomItem(Material.PAPER, "&7&l鋼板", 0);
	public static ItemStack COMPRESSED_CARBON = null;
	public static ItemStack BATTERY = null;
	public static ItemStack CARBON_CHUNK = null;
	public static ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7&l鋼推進器", 0);
	public static ItemStack POWER_CRYSTAL = null;
	public static ItemStack CHAIN = new CustomItem(Material.STRING, "&b鎖鏈", 0);
	public static ItemStack HOOK = new CustomItem(Material.FLINT, "&b鉤子", 0);
	public static ItemStack SIFTED_ORE = new CustomItem(Material.GUNPOWDER, "&6篩礦", 0);
	public static ItemStack STONE_CHUNK = null;
	public static ItemStack LAVA_CRYSTAL = null;
	public static ItemStack SALT = new CustomItem(Material.SUGAR, "&r鹽", 0);
	public static ItemStack BUTTER = null;
	public static ItemStack CHEESE = null;
	public static ItemStack HEAVY_CREAM = new CustomItem(Material.SNOWBALL, "&r濃奶油", 0);
	public static ItemStack CRUSHED_ORE = new CustomItem(Material.GUNPOWDER, "&6已粉碎的礦石", 0);
	public static ItemStack PULVERIZED_ORE = new CustomItem(Material.GUNPOWDER, "&6粉末狀的礦石", 0);
	public static ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.GUNPOWDER, "&6純礦簇", 0);
	public static ItemStack TINY_URANIUM = null;
	public static ItemStack SMALL_URANIUM = null;
	public static ItemStack MAGNET = null;
	public static ItemStack NECROTIC_SKULL = new CustomItem(new ItemStack(Material.WITHER_SKELETON_SKULL), "&c壞死的頭顱");
	public static ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.GUNPOWDER, "&4重生精華", 0);
	public static ItemStack ELECTRO_MAGNET = null;
	public static ItemStack HEATING_COIL = null;
	public static ItemStack COOLING_UNIT = null;
	public static ItemStack ELECTRIC_MOTOR = null;
	public static ItemStack CARGO_MOTOR = null;
	public static ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6維度傳送捲軸", 0, new String[] {"", "&c這個捲軸可以便攜地創建", "&c一個臨時的黑洞", "&c將附近的實體都傳送至", "&c另一個維度上", "&c所有東西都反轉了", "", "&r就是說: 讓實體轉180°"});
	public static ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6知識巨著", 0, new String[] {"&7主人: &bNone", "", "&e右鍵&7 以綁定你的所有研究", "" , "", "&e右鍵&7 以獲得前任主人的所有研究"});
	public static ItemStack HARDENED_GLASS = new CustomItem(new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS), "&7鋼化玻璃", "", "&r可以抵抗爆炸");
	public static ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5防凋零黑曜石", 0, new String[] {"", "&r可以抵抗爆炸和", "&r凋零的攻擊"});
	public static ItemStack WITHER_PROOF_GLASS = new CustomItem(new ItemStack(Material.PURPLE_STAINED_GLASS), "&5防凋零玻璃", "", "&r可以抵抗爆炸和", "&r凋零的攻擊");
	public static ItemStack REINFORCED_PLATE = new CustomItem(Material.PAPER, "&7鋼筋板", 0);
	public static ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&d遠古魔法基座", 0, new String[] {"", "&5遠古魔法祭壇的一部分"});
	public static ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTING_TABLE, "&d遠古魔法祭壇", 0, new String[] {"", "&5在世界裡建造祭壇", "&5並用古老的儀式合成物品"});
	public static ItemStack DUCT_TAPE = null;

	public static ItemStack RAINBOW_WOOL = new CustomItem(new ItemStack(Material.WHITE_WOOL), "&5彩虹羊毛", "", "&d輪番展現彩虹的顏色!");
	public static ItemStack RAINBOW_GLASS = new CustomItem(new ItemStack(Material.WHITE_STAINED_GLASS), "&5彩虹玻璃", "", "&d輪番展現彩虹的顏色!");
	public static ItemStack RAINBOW_CLAY = new CustomItem(new ItemStack(Material.WHITE_TERRACOTTA), "&5彩虹黏土塊", "", "&d輪番展現彩虹的顏色!");
	public static ItemStack RAINBOW_GLASS_PANE = new CustomItem(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), "&5彩虹玻璃板", "", "&d輪番展現彩虹的顏色!");

	public static ItemStack RAINBOW_WOOL_XMAS = new CustomItem(new ItemStack(Material.WHITE_WOOL), "&5彩虹羊毛 &7(聖誕節版)", "", Christmas.color("< 聖誕節版>"));
	public static ItemStack RAINBOW_GLASS_XMAS = new CustomItem(new ItemStack(Material.WHITE_STAINED_GLASS), "&5彩虹玻璃 &7(聖誕節版)", "", Christmas.color("< 聖誕節版>"));
	public static ItemStack RAINBOW_CLAY_XMAS = new CustomItem(new ItemStack(Material.WHITE_TERRACOTTA), "&5彩虹黏土塊 &7(聖誕節版)", "", Christmas.color("< 聖誕節版>"));
	public static ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(聖誕節版)", "", Christmas.color("< 聖誕節版>"));

	public static ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(new ItemStack(Material.PINK_WOOL), "&5彩虹羊毛 &7(情人節版)", "", "&d< 情人節版>");
	public static ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(new ItemStack(Material.PINK_STAINED_GLASS), "&5彩虹玻璃 &7(情人節版)", "", "&d< 情人節版>");
	public static ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(new ItemStack(Material.PINK_TERRACOTTA), "&5彩虹黏土塊 &7(情人節版)", "", "&d< 情人節版>");
	public static ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(new ItemStack(Material.PINK_STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(情人節版)", "", "&d< 情人節版>");

	/* Ingots */
	public static ItemStack COPPER_INGOT = new CustomItem(Material.BRICK, "&b銅錠", 0, new String[0]);
	public static ItemStack TIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b錫錠", 0, new String[0]);
	public static ItemStack SILVER_INGOT = new CustomItem(Material.IRON_INGOT, "&b銀錠", 0, new String[0]);
	public static ItemStack ALUMINUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b鋁錠", 0, new String[0]);
	public static ItemStack LEAD_INGOT = new CustomItem(Material.IRON_INGOT, "&b鉛錠", 0, new String[0]);
	public static ItemStack ZINC_INGOT = new CustomItem(Material.IRON_INGOT, "&b鋅錠", 0, new String[0]);
	public static ItemStack MAGNESIUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b鎂錠", 0, new String[0]);

	/* Alloy (Carbon + Iron) */
	public static ItemStack STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b鋼錠", 0, new String[0]);
	/* Alloy (Copper + Tin) */
	public static ItemStack BRONZE_INGOT = new CustomItem(Material.BRICK, "&b青銅錠", 0, new String[0]);
	/* Alloy (Copper + Aluminum) */
	public static ItemStack DURALUMIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b硬鋁合金錠", 0, new String[0]);
	/* Alloy (Copper + Silver) */
	public static ItemStack BILLON_INGOT = new CustomItem(Material.IRON_INGOT, "&b銀銅合金錠", 0, new String[0]);
	/* Alloy (Copper + Zinc) */
	public static ItemStack BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b黃銅錠", 0, new String[0]);
	/* Alloy (Aluminum + Brass) */
	public static ItemStack ALUMINUM_BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b鋁黃銅錠", 0, new String[0]);
	/* Alloy (Aluminum + Bronze) */
	public static ItemStack ALUMINUM_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b鋁青銅錠", 0, new String[0]);
	/* Alloy (Gold + Silver + Copper) */
	public static ItemStack CORINTHIAN_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b科林斯青銅錠", 0, new String[0]);
	/* Alloy (Lead + Tin) */
	public static ItemStack SOLDER_INGOT = new CustomItem(Material.IRON_INGOT, "&b焊錫錠", 0, new String[0]);
	/* Alloy (Steel + Iron + Carbon) */
	public static ItemStack DAMASCUS_STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b大馬士革鋼錠", 0, new String[0]);
	/* Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze) */
	public static ItemStack HARDENED_METAL_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l硬化金屬", 0);
	/* Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel) */
	public static ItemStack REINFORCED_ALLOY_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l強化合金錠", 0);
	/* Alloy (Iron + Silicon) */
	public static ItemStack FERROSILICON = new CustomItem(Material.IRON_INGOT, "&b矽鐵" , 0);
	/* Alloy (Iron + Gold) */
	public static ItemStack GILDED_IRON = new CustomItem(Material.GOLD_INGOT, "&6&l鍍金鐵錠", 0);
	/* Alloy (Redston + Ferrosilicon) */
	public static ItemStack REDSTONE_ALLOY = new CustomItem(Material.BRICK, "&c紅石合金錠", 0);
	/* Alloy (Iron + Copper) */
	public static ItemStack NICKEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b鎳錠" , 0);
	/* Alloy (Nickel + Iron + Copper) */
	public static ItemStack COBALT_INGOT = new CustomItem(Material.IRON_INGOT, "&9鈷錠" , 0);

	/* Gold */
	public static ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(4克拉)", 0);
	public static ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(6克拉)", 0);
	public static ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(8克拉)", 0);
	public static ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(10克拉)", 0);
	public static ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(12克拉)", 0);
	public static ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(14克拉)", 0);
	public static ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(16克拉)", 0);
	public static ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(18克拉)", 0);
	public static ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(20克拉)", 0);
	public static ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(22克拉)", 0);
	public static ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&r金錠 &7(24克拉)", 0);

	/* Dusts */
	public static ItemStack IRON_DUST = new CustomItem(Material.GUNPOWDER, "&6鐵粉", 0);
	public static ItemStack GOLD_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6金粉", 0);
	public static ItemStack TIN_DUST = new CustomItem(Material.SUGAR, "&6錫粉", 0);
	public static ItemStack COPPER_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6銅粉", 0);
	public static ItemStack SILVER_DUST = new CustomItem(Material.SUGAR, "&6銀粉", 0);
	public static ItemStack ALUMINUM_DUST = new CustomItem(Material.SUGAR, "&6鋁粉", 0);
	public static ItemStack LEAD_DUST = new CustomItem(Material.GUNPOWDER, "&6鉛粉", 0);
	public static ItemStack SULFATE = new CustomItem(Material.GLOWSTONE_DUST, "&6硫酸鹽", 0);
	public static ItemStack ZINC_DUST = new CustomItem(Material.SUGAR, "&6鋅粉", 0);
	public static ItemStack MAGNESIUM_DUST = new CustomItem(Material.SUGAR, "&6鎂", 0);
	public static ItemStack CARBON = null;
	public static ItemStack SILICON = new CustomItem(Material.FIREWORK_STAR, "&6矽", 0);
	public static ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&r金塊 &7(24克拉)", 0);

	/* Gems */
	public static ItemStack SYNTHETIC_DIAMOND = null;
	public static ItemStack SYNTHETIC_EMERALD = null;
	public static ItemStack SYNTHETIC_SAPPHIRE;
	public static ItemStack CARBONADO = null;
	public static ItemStack RAW_CARBONADO = null;
	public static ItemStack URANIUM = null;
	public static ItemStack NEPTUNIUM = null;
	public static ItemStack PLUTONIUM = null;
	public static ItemStack BOOSTED_URANIUM = null;

	/* Talisman */
	public static ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6普通護身符", 0);
	public static ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&a鐵砧護身符", 0, new String[] {"", "&r每個護身符可以防止", "&r一個工具因耐久不足而損壞", " &r然後就會被消耗", "", "&4&l警告:", "&4由於過於強大的工具的複雜性", "&4此護身符不能修復過於強大的工具"});
	public static ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&a礦工護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r將有20% 的機率雙倍掉落", "&r你挖出的礦物"});
	public static ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&a獵人護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r將有20% 的機率雙倍掉落", "&r你殺死的生物的掉落物"});
	public static ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&a岩漿行者護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r獲得火焰保護效果", "&r僅在你行走在岩漿上時可用", "&r然後就會被消耗"});
	public static ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&a潛水者護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r一旦你即將溺水而死", "&r護身符將會給予你水下呼吸", "&r然後就會被消耗"});
	public static ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&a天使護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r有75% 的機率減免你的摔落傷害"});
	public static ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&a消防員護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r在你著火時", "&r給予你防火效果", "&r然後就會被消耗"});
	public static ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&a魔法師護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r在附魔時有80%的機率", "&r得到一個額外的附魔"});
	public static ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&a旅行者護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r在你開始疾跑時有60% 的機率", "&r給予你速度效果"});
	public static ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&a戰士護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r你被攻擊後將會獲得力量3的效果", "&r然後就會被消耗"});
	public static ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&a騎士護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r在你被攻擊後", "&r有30% 的機率獲得五秒的生命恢復", "&r然後就會被消耗"});
	public static ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&a旋風護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r將有60% 的機率" , "&r反彈所有沖向你的彈射物"});
	public static ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&a巫師護身符", 0, new String[] {"", "&r當這個護身符在你的背包裡時", "&r在你附魔時可獲得時運4/5", "&r但它也可能降低該物品", "&r其他附魔的等級"});

	/* Staves */
	public static ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6元素法杖", 0);
	public static ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6元素法杖&7 - &b&o風", 0, new String[] {"", "&7元素: &b&o風", "", "&7&e右鍵&7 以將你吹飛"}, new String[] {"LUCK-1"});
	public static ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6元素法杖&7 - &c&o火", 0, new String[] {"", "&7元素: &c&o火","", "&c讓火焰淨化一切!"}, new String[] {"FIRE_ASPECT-5"});
	public static ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6元素法杖&7 - &1&o水", 0, new String[] {"", "&7元素: &1&o水", "", "&7&e右鍵&7 以滅掉你身上的火"}, new String[] {"WATER_WORKER-1"});

	/* 機器 */
	public static ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&b磨石", 0, new String[] {"", "&a&o更高效的磨物品"});
	public static ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6盔甲鍛造台", 0, new String[] {"", "&a&o給你創造強大防具的力量"});
	public static ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6冶煉爐", 0, new String[] {"", "&a&o用作冶煉金屬的高溫爐"});
	public static ItemStack IGNITION_CHAMBER = new CustomItem(new ItemStack(Material.HOPPER), "&4自動點火裝置", "&r以防你的冶煉爐失去火焰", "&r需要打火石", "&r必須放置於冶煉爐的發射器旁邊");
	public static ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&b碎礦機", 0, new String[] {"", "&a&o粉碎礦石並且得到雙倍的粉塵"});
	public static ItemStack COMPRESSOR = new CustomItem(Material.PISTON, "&b壓縮機", 0, new String[] {"", "&a&o壓縮物品"});
	public static ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&b壓力室", 0, new String[] {"", "&a&o壓縮更多的物品"});
	public static ItemStack MAGIC_WORKBENCH = new CustomItem(Material.CRAFTING_TABLE, "&6魔法工作台", 0, new String[] {"給物品注入魔法能量"});
	public static ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON, "&6洗礦機", 0, new String[] {"", "&a&o清洗篩礦變成過濾礦石", "&a&o並且給你一些小石塊" });
	public static ItemStack SAW_MILL = new CustomItem(Material.IRON_BARS, "&6鋸木機", 0, new String[] {"", "&a&o從1個原木中獲得8個木頭"});
	public static ItemStack COMPOSTER = new CustomItem(Material.CAULDRON, "&a攪拌機", 0, new String[] {"", "&a&o隨著時間的推移可以轉換各種材料..."});
	public static ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.CRAFTING_TABLE, "&e進階工作台", 0, new String[] {"", "&a&o一個基礎的工作台", "&a&o無法承受強大的力量..." });
	public static ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON, "&c坩堝", 0, new String[] {"", "&a&o用來把物品變為液體"});
	public static ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&a榨汁機", 0, new String[] {"", "&a&o讓你創造美味的果汁"});

	public static ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太陽能板", 0, new String[] {"", "&a&o將陽光變為能量"});
	public static ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太陽能陣列", 0, new String[] {"", "&a&o將陽光變為能量"});
	public static ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&b挖礦機", 0, new String[] {"", "&a&o挖出所有礦物!"});
	public static ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6高級挖礦機", 0, new String[] {"", "&a&o挖出所有礦物!", "&a&o自動磨碎礦物"});
	public static ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&a自動淘金機", 0, new String[] {"", "&a&o升級版淘金盤"});

	public static ItemStack HOLOGRAM_PROJECTOR = new CustomItem(new MaterialData(Material.QUARTZ_SLAB), "&b全像投影器", "", "&r投影出可編輯的文字");

	/* Enhanced Furnaces */
	public static ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eI", 0, new String[] {"", "&7燃燒速度: &e1x", "&7燃料效率: &e1x", "&7產物翻倍倍數: &e1x"});
	public static ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eII", 0, new String[] {"", "&7燃燒速度: &e2x", "&7燃料效率: &e1x", "&7產物翻倍倍數: &e1x"});
	public static ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eIII", 0, new String[] {"", "&7燃燒速度: &e2x", "&7燃料效率: &e2x", "&7產物翻倍倍數: &e1x"});
	public static ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eIV", 0, new String[] {"", "&7燃燒速度: &e3x", "&7燃料效率: &e2x", "&7產物翻倍倍數: &e1x"});
	public static ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eV", 0, new String[] {"", "&7燃燒速度: &e3x", "&7燃料效率: &e2x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eVI", 0, new String[] {"", "&7燃燒速度: &e3x", "&7燃料效率: &e3x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eVII", 0, new String[] {"", "&7燃燒速度: &e4x", "&7燃料效率: &e3x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eVIII", 0, new String[] {"", "&7燃燒速度: &e4x", "&7燃料效率: &e4x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eIX", 0, new String[] {"", "&7燃燒速度: &e5x", "&7燃料效率: &e4x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eX", 0, new String[] {"", "&7燃燒速度: &e5x", "&7燃料效率: &e5x", "&7產物翻倍倍數: &e2x"});
	public static ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&7強化熔爐 - &eXI", 0, new String[] {"", "&7燃燒速度: &e5x", "&7燃料效率: &e5x", "&7產物翻倍倍數: &e3x"});
	public static ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&7強化合金熔爐", 0, new String[] {"", "&7燃燒速度: &e10x", "&7燃料效率: &e10x", "&7產物翻倍倍數: &e3x"});
	public static ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&7超級黑鑽石熔爐", 0, new String[] {"", "&7燃燒速度: &e20x", "&7燃料效率: &e10x", "&7產物翻倍倍數: &e3x"});

	public static ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&a方塊放置裝置", 0, new String[] {"", "&r所有在這個發射器內的方塊", "&r會被自動放置"}) ;

	/* Soulbound Items */
	public static ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&c靈魂綁定劍", 0);
	public static ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&c靈魂綁定弓", 0);
	public static ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&c靈魂綁定鎬", 0);
	public static ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&c靈魂綁定斧", 0);
	public static ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SHOVEL, "&c靈魂綁定鏟", 0);
	public static ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&c靈魂綁定鋤", 0);

	public static ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&c靈魂綁定頭盔", 0);
	public static ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&c靈魂綁定胸甲", 0);
	public static ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&c靈魂綁定護腿", 0);
	public static ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&c靈魂綁定靴子", 0);

	/* Runes */
	public static ItemStack BLANK_RUNE = null;
	public static ItemStack RUNE_AIR = null;
	public static ItemStack RUNE_WATER = null;
	public static ItemStack RUNE_FIRE = null;
	public static ItemStack RUNE_EARTH = null;
	public static ItemStack RUNE_ENDER = null;
	public static ItemStack RUNE_RAINBOW = null;

	static {
		ItemStack itemB = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
		imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8空白的符文"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = itemB;

		ItemStack itemA = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&b&l氣&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = itemA;

		ItemStack itemW = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&1&l水&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = itemW;

		ItemStack itemF = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&4&l火&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = itemF;

		ItemStack itemE = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.ORANGE).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&c&l地&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = itemE;

		ItemStack itemN = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&5&l末影&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = itemN;

		ItemStack itemR = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7遠古魔法符文 &8&l[&d&l虹&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = itemR;
	}

	/* Electricity */
	public static ItemStack SOLAR_GENERATOR = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&b太陽能發電機", "", "&e基礎發電機", "&8\u21E8 &e\u26A1 &70 J 可儲存", "&8\u21E8 &e\u26A1 &74 J/秒");
	public static ItemStack SOLAR_GENERATOR_2 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&c高級太陽能發電機", "", "&a中級發電機", "&8\u21E8 &e\u26A1 &70 J 可儲存", "&8\u21E8 &e\u26A1 &716 J/秒");
	public static ItemStack SOLAR_GENERATOR_3 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&4黑鑽石太陽能發電機", "", "&4終極發電機", "&8\u21E8 &e\u26A1 &70 J 可儲存", "&8 \u21E8 &e\u26A1 &764 J/秒");
	public static ItemStack SOLAR_GENERATOR_4 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&e充能太陽能發電機", "", "&9可以在夜間工作", "", "&4終極發電機", "&8\u21E8 &e\u26A1 &70 J 可儲存", "&8\u21E8 &e\u26A1 &7256 J/秒 (日間)", "&8\u21E8 &e\u26A1 &7128 J/秒 (夜間)");

	public static ItemStack COAL_GENERATOR = null;
	public static ItemStack LAVA_GENERATOR = null;

	public static ItemStack ELECTRIC_FURNACE = null;
	public static ItemStack ELECTRIC_FURNACE_2 = null;
	public static ItemStack ELECTRIC_FURNACE_3 = null;

	public static ItemStack ELECTRIC_ORE_GRINDER = null;
	public static ItemStack ELECTRIC_ORE_GRINDER_2 = null;
	public static ItemStack ELECTRIC_INGOT_PULVERIZER = null;
	public static ItemStack AUTO_ENCHANTER = null;
	public static ItemStack AUTO_DISENCHANTER = null;
	public static ItemStack AUTO_ANVIL = null;
	public static ItemStack AUTO_ANVIL_2 = null;

	public static ItemStack BIO_REACTOR = null;
	public static ItemStack MULTIMETER = new CustomItem(new MaterialData(Material.CLOCK), "&e萬用表", "", "&r查看機器中儲存的能量");
	public static ItemStack SMALL_CAPACITOR = null, MEDIUM_CAPACITOR = null, BIG_CAPACITOR = null, LARGE_CAPACITOR = null, CARBONADO_EDGED_CAPACITOR = null;

	/* Robots */
	public static ItemStack PROGRAMMABLE_ANDROID = null;
	public static ItemStack PROGRAMMABLE_ANDROID_MINER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_BUTCHER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = null;

	public static ItemStack PROGRAMMABLE_ANDROID_2 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = null;

	public static ItemStack PROGRAMMABLE_ANDROID_3 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = null;

	/* GPS */
	public static ItemStack GPS_TRANSMITTER = null;
	public static ItemStack GPS_TRANSMITTER_2 = null;
	public static ItemStack GPS_TRANSMITTER_3 = null;
	public static ItemStack GPS_TRANSMITTER_4 = null;

	public static ItemStack GPS_CONTROL_PANEL = null;
	public static ItemStack GPS_MARKER_TOOL = new CustomItem(new MaterialData(Material.REDSTONE_TORCH), "&bGPS 標記工具", "", "&r允許你在放置標記工具的位置", "&r設置一個傳送點並命名");
	public static ItemStack GPS_EMERGENCY_TRANSMITTER = null;
	public static ItemStack GPS_GEO_SCANNER = null;

	public static ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(new ItemStack(Material.DISPENSER), "&7機器人交互接口&c(燃料)", "", "&r當腳本告訴它這樣做時", "&r儲存在交互接口的物品" , "&r將會被放入機器人的燃料槽");
	public static ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(new ItemStack(Material.DISPENSER), "&7機器人交互接口&9(物品)", "", "&r當腳本告訴它該這樣做時", "&r儲存在機器人物品欄的物品", "&r將會被放入交互界面");

	public static ItemStack BUCKET_OF_OIL = null;
	public static ItemStack BUCKET_OF_FUEL = null;
	public static ItemStack OIL_PUMP = null;

	public static ItemStack REFINERY = null;
	public static ItemStack COMBUSTION_REACTOR = null;
	public static ItemStack ANDROID_MEMORY_CORE = null;

	public static ItemStack GPS_TELEPORTER_PYLON = new CustomItem(new MaterialData(Material.PURPLE_STAINED_GLASS), "&5GPS 傳送塔", "", "&7傳送器的一部分");
	public static ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(new MaterialData(Material.IRON_BLOCK), "&bGPS 傳送矩陣", "", "&r這是你的GPS 傳送主要零件", "&r這個矩陣允許玩家傳送至", "&r已設置的標記點");
	public static ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(new MaterialData(Material.STONE_PRESSURE_PLATE), "&rGPS 激活設備&3(公共)", "", "&r把它放在傳送矩陣上", "&r並且踩下這個踏板以選擇" , "&r要傳送的標記點");
	public static ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(new MaterialData(Material.STONE_PRESSURE_PLATE), "&rGPS 激活設備&a(私人)", "", "&r把它放在傳送矩陣上", "&r並且踩下這個踏板以選擇" , "&r要傳送的標記點", "", "&r這種激活裝置僅允許", "&r放置它的人使用");

	public static ItemStack ELEVATOR = new CustomItem(new MaterialData(Material.STONE_PRESSURE_PLATE), "&b電梯板", "", "&r在每一層放置電梯板", "&r你就能夠在每一層之間傳送." , "", "&e右鍵電梯板&7 以為此層命名");

	public static ItemStack INFUSED_HOPPER = new CustomItem(new MaterialData(Material.HOPPER), "&5吸入漏斗", "", "&r自動吸入在漏斗附近", "&r7x7x7 範圍內的所有物品");

	public static ItemStack PLASTIC_SHEET = new CustomItem(new MaterialData(Material.PAPER), "&r塑料紙");
	public static ItemStack HEATED_PRESSURE_CHAMBER = null;
	public static ItemStack HEATED_PRESSURE_CHAMBER_2 = null;

	public static ItemStack ELECTRIC_SMELTERY = null;
	public static ItemStack ELECTRIC_SMELTERY_2 = null;

	public static ItemStack ELECTRIFIED_CRUCIBLE = null;
	public static ItemStack ELECTRIFIED_CRUCIBLE_2 = null;
	public static ItemStack ELECTRIFIED_CRUCIBLE_3 = null;

	public static ItemStack CARBON_PRESS = null;
	public static ItemStack CARBON_PRESS_2 = null;
	public static ItemStack CARBON_PRESS_3 = null;

	public static ItemStack BLISTERING_INGOT = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6發泡錠 &7(33%)", "", "&2輻射等級: 高", "&4&o需要生化套裝");
	public static ItemStack BLISTERING_INGOT_2 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6發泡錠 &7(66%)", "", "&2輻射等級: 高", "&4&o需要生化套裝");
	public static ItemStack BLISTERING_INGOT_3 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6發泡錠", "", "&2輻射等級: 高", "&4&o需要生化套裝");

	public static ItemStack ENERGY_REGULATOR = null;
	public static ItemStack DEBUG_FISH = new CustomItem(new MaterialData(Material.PUFFERFISH), "&3這魚多少錢?", "", "&e右鍵&r任意方塊以查看它的方塊數據", "&e左鍵&r破壞方塊" , "&eShift + 左鍵&r任意方塊以清除它的方塊數據", "&eShift + 右鍵&r放置一個佔位符方塊");


	public static ItemStack NETHER_ICE = null;
	public static ItemStack ENRICHED_NETHER_ICE = null;
	public static ItemStack NETHER_ICE_COOLANT_CELL = null;
	public static ItemStack NETHER_DRILL = new CustomItem(new CustomItem(new MaterialData(Material.RED_TERRACOTTA), "&4地獄鑽頭", "", "&r允許你開採地獄冰", "", "&4終極機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7102 J/秒", "", "&c&l! &c只能在地獄使用!", "&c&l! &c請先對所在區塊進行地形掃描")) ;

	// Cargo
	public static ItemStack CARGO_MANAGER = null;
	public static ItemStack CARGO_NODE = null;
	public static ItemStack CARGO_INPUT = null;
	public static ItemStack CARGO_OUTPUT = null;
	public static ItemStack CARGO_OUTPUT_ADVANCED = null;

	public static ItemStack AUTO_BREEDER = null;

	public static ItemStack ORGANIC_FOOD = null;
	public static ItemStack WHEAT_ORGANIC_FOOD = null;
	public static ItemStack CARROT_ORGANIC_FOOD = null;
	public static ItemStack POTATO_ORGANIC_FOOD = null;
	public static ItemStack SEEDS_ORGANIC_FOOD = null;
	public static ItemStack BEETROOT_ORGANIC_FOOD = null;
	public static ItemStack MELON_ORGANIC_FOOD = null;
	public static ItemStack APPLE_ORGANIC_FOOD = null;

	public static ItemStack FERTILIZER = null;
	public static ItemStack WHEAT_FERTILIZER = null;
	public static ItemStack CARROT_FERTILIZER = null;
	public static ItemStack POTATO_FERTILIZER = null;
	public static ItemStack SEEDS_FERTILIZER = null;
	public static ItemStack BEETROOT_FERTILIZER = null;
	public static ItemStack MELON_FERTILIZER = null;
	public static ItemStack APPLE_FERTILIZER = null;

	public static ItemStack ANIMAL_GROWTH_ACCELERATOR = null;
	public static ItemStack CROP_GROWTH_ACCELERATOR = null;
	public static ItemStack CROP_GROWTH_ACCELERATOR_2 = null;

	public static ItemStack FOOD_FABRICATOR = null;
	public static ItemStack FOOD_FABRICATOR_2 = null;

	public static ItemStack FOOD_COMPOSTER = null;
	public static ItemStack FOOD_COMPOSTER_2 = null;

	public static ItemStack XP_COLLECTOR = null;
	public static ItemStack REACTOR_COOLANT_CELL = null;

	public static ItemStack NUCLEAR_REACTOR = null;
	public static ItemStack NETHERSTAR_REACTOR = null;
	public static ItemStack REACTOR_ACCESS_PORT = null;

	public static ItemStack FREEZER = null;
	public static ItemStack FREEZER_2 = null;

	public static ItemStack ELECTRIC_GOLD_PAN = null;
	public static ItemStack ELECTRIC_GOLD_PAN_2 = null;
	public static ItemStack ELECTRIC_GOLD_PAN_3 = null;

	public static ItemStack ELECTRIC_DUST_WASHER = null;
	public static ItemStack ELECTRIC_DUST_WASHER_2 = null;
	public static ItemStack ELECTRIC_DUST_WASHER_3 = null;

	public static ItemStack ELECTRIC_INGOT_FACTORY = null;
	public static ItemStack ELECTRIC_INGOT_FACTORY_2 = null;
	public static ItemStack ELECTRIC_INGOT_FACTORY_3 = null;

	public static ItemStack AUTOMATED_CRAFTING_CHAMBER = null;
	public static ItemStack FLUID_PUMP = null;
	public static ItemStack CHARGING_BENCH = null;

	public static ItemStack WITHER_ASSEMBLER = new CustomItem(new MaterialData(Material.OBSIDIAN), "&5凋零彙編器", "", "&4終極機器", "&8\u21E8 &7冷卻時間: &b30 秒", "&8\u21E8 &e\u26A1 &74096 J 可儲存", "&8\u21E8 &e\u26A1 &74096 J/個凋靈");

	public static ItemStack TRASH_CAN = null;

	public static ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
	public static ItemStack ELYTRA_SCALE = new CustomItem(new ItemStack(Material.FEATHER), "&b鞘翅鱗片");
	public static ItemStack INFUSED_ELYTRA = new CustomItem(new CustomItem(ELYTRA, "&5鞘翅 (經驗修補)"), new String[] {"MENDING-1"});
	public static ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&c鞘翅 (靈魂綁定)");

// ChestTerminal Addon

	public static ItemStack CHEST_TERMINAL = null;
	public static ItemStack CT_IMPORT_BUS = null;
	public static ItemStack CT_EXPORT_BUS = null;

	static {
		try {
			FOOD_COMPOSTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmExZTA3NzBkMDBiYjY1YjY0MTNkMmVjYmIwNjU2NTE4YTI4ZjljNjNjNDJjMDIxY2NiZWU5YzgxNTk0Zjc0NSJ9fX0="), "&c食品堆肥器", "", "&r可製造&a有機肥料", "", "&6高級機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 可儲存", "&8\u21E8 &e\u26A1 &716 J/秒");
			FOOD_COMPOSTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ3YzYxYjlmNjI3ZTdjODQxMDIwMzE0NjEzZDgyNGM1ODZkY2NiZTY2MTAxYWEzZTNkNDA2ZGM4ZDQxMTRkNSJ9fX0="), "&c食品堆肥器&7 - &eII", "", "&r可製造&a有機肥料", "", "&4終極機器", "&8 \u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &7512 J 可儲存", "&8\u21E8 &e\u26A1 &752 J/秒");

			AUTOMATED_CRAFTING_CHAMBER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2Y5ZjM1NmY1ZmU3ZDFiYzkyY2RkZmFlYmEzZWU3NzNhYzlkZjFjYzRkMWMyZjhmZTVmNDcwMTMwMzJjNTUxZCJ9fX0="), "&6自動合成機", "", "&6高級機器", "&8\u21E8 &e\u26A1 &710 J/個物品");

			REACTOR_ACCESS_PORT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzMzZDNhYjRmOWFjMmY5M2U1NzRjYTkxMjkzOWJmN2JhZDFlODRkMGRiMDBmNGIwM2RhODA3ZWUyNDJhOTA2ZiJ9fX0="), "&2反應堆訪問接口", "", "&r允許你通過物流節點來訪問反應堆", "&r也可以用於儲存", "", "&8\u21E8 &c必須&e在反應堆上3格放置");

			FLUID_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQyM2FmOWY3NTNkMjQ0NGUwODdkZDE3YzYzMjUzMWRkMmRlNzE3NzQzZmFhMzUzZmZmNjI5ZGEyNTJiZSJ9fX0="), "&9流體泵", "", "&6高級機器", "&8\u21E8 &e\u26A1 &732 J/個方塊");

			ELECTRIC_SMELTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzYmE1ZjJlZDE0ZDFmYzY0YzI5ODQ1YTA3MTNhN2ExMTkyOWM1OTE1ZjZjOTQyYTNlM2E2ZGEzZTkwMjUifX19"), "&c電力冶煉機", "", "&4僅支持合金, 不能將粉冶煉成錠", "", "&4終極機器", " &8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/秒");
			ELECTRIC_SMELTERY_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzYmE1ZjJlZDE0ZDFmYzY0YzI5ODQ1YTA3MTNhN2ExMTkyOWM1OTE1ZjZjOTQyYTNlM2E2ZGEzZTkwMjUifX19"), "&c電力冶煉機&7 - &eII", "", "&4僅支持合金, 不能將粉冶煉成錠", "", "&4終極機器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &740 J/秒");

			ANIMAL_GROWTH_ACCELERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMxNDI1NDllNTNlZmVmMDIzYjg1NzhlYzU2MmNjZjM0NTRiN2E5Zjg4ODgwM2I4OGQ1Mzc5MjI4ZTJhMzdhYSJ9fX0="), "&b動物生長加速器", "", "&r需要&a有機食物", "", "&4最終機器", "&8\u21E8 &e\u26A1 &71024 J 可儲存", "&8\u21E8 &e\u26A1 &728 J/秒");
			AUTO_BREEDER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjZmMzIzZDFkYmEzOThiOGMzNGU1YTAzZDNhZWIwNWQ2ZDE4YTU5ZjYzMjdmNDhkODY2MThiMzFlNGI3NDhjNyJ9fX0="),"&e自動餵食機",  "", "&r需要&a有機食物", "", "&4最終機器", "&8\u21E8 &e\u26A1 &71024 J 可緩存", "&8\u21E8 &e\u26A1 &760 J/個動物");

			ELECTRIC_ORE_GRINDER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjEzMWEzNmU3MGZmYWE3Y2E3ZTY3MmFlNmFjMjBiN2ZjMWU0NTdjNDNhOGUxMDY5ZTdiMTRlY2RiODU3NiJ9fX0="), "&c電動碎礦機", "","&r礦物粉碎機與磨石的完美結合", "", "&6高級機器", " &8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &712 J/秒");
			ELECTRIC_ORE_GRINDER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVlMTE1NjU2YmMyMjA3NTVjNmQ1YmM4NzI2MGM4MjE0MWMyNTNhMzRiYzNkYjJiZDcyYjcyN2JlZmNjMCJ9fX0="), "&c電動碎礦機&7 - &eII", "","&r礦物粉碎機與磨石的完美結合", "", "&4終極機器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &730 J/秒");

			ELECTRIC_INGOT_PULVERIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjc3OWU3NmI5MWYwOTE5MDkwZjJmYThkMWJhYWZjYjk0MzVhMzFhYzA5NGM4MDAxNzliODA1NmVhY2VmZGE3NiJ9fX0="), "&c電動磨粉機", "", "&r將錠變為粉", "", "&a中級機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &714 J/秒");

			BIO_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ4MzM3ZjdlZGUxNWMzYjJmOGRjNmE2M2JkOTI4NzRjZGY3NGVjODYyYjQxMThjN2UzNTU1OWNlOGI0ZCJ9fX0="), "&2生物反應器", "", "&6普通發電機", "&8\u21E8 &e\u26A1 &7128 J 可儲存", "&8\u21E8 &e\u26A1 &78 J/秒");

			AUTO_ANVIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTg1NWIzZTFkOWE3YjlmZDc2YTc3NmZhNGVlYzg3MWQ1MmVkMjY5MzI1Mzg2MjhjNDNkZTMyZDFkMmQ3NDMifX19"), "&7自動鐵砧", "", "&6高級機器", "&8\u21E8 &7使用膠布, 可修復百分比: 10%", "&8\u21E8 &e \u26A1 &724 J/秒");
			AUTO_ANVIL_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWNiZDlmNWVjMWVkMDA3MjU5OTk2NDkxZTY5ZmY2NDlhMzEwNmNmOTIwMjI3YjFiYjNhNzFlZTdhODk4NjNmIn19fQ=="), "&7自動鐵砧&7 - &eII", "", "&4終極機器", "&8\u21E8 &7使用膠布, 可修復百分比: 25%", "&8 \u21E8 &e\u26A1 &732 J/秒");

			REFINERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmE3ZDI3MTdkMTBiZWM0MTU5ZThmMWQzMzM5ZWFlMzUyMjk3YTYwNzE0M2E5NmIyOWU4ZWMyODczN2UwZDkifX19"), "&c煉油廠", "", "&r提煉原油以創造燃料");

			FOOD_FABRICATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVjNWIyNGNkNWVmYTA3ZDMxYmVlYTY1NWQ3ZmY5NzJlNmY0N2NkYjg5OGJlNDQwNDM2M2RlZWJhNDNiYTVkIn19fQ=="), "&c食品加工機", "", "&r可製造&a有機食物", "", "&6高級機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 可儲存", "&8\u21E8 &e\u26A1 &714 J/秒");
			FOOD_FABRICATOR_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVjNWIyNGNkNWVmYTA3ZDMxYmVlYTY1NWQ3ZmY5NzJlNmY0N2NkYjg5OGJlNDQwNDM2M2RlZWJhNDNiYTVkIn19fQ=="), "&c食品加工機&7 - &eII", "", "&r可製造&a有機食物", "", "&4終極機器", "&8 \u21E8 &7速度: 6x", "&8\u21E8 &e\u26A1 &7512 J 可儲存", "&8\u21E8 &e\u26A1 &748 J/秒");

			ELECTRIFIED_CRUCIBLE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgyZTI3NWQ2N2YzODMyYmJkYTMzYWE4MzQxNzlmNTY2NjZjYTg2ZDFmMmJkMzE2ZWRhZTZlY2VkMGQ5ODA2NCJ9fX0="), "&c電動坩堝", "", "&4終極機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &748 J/秒");
			ELECTRIFIED_CRUCIBLE_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgyZTI3NWQ2N2YzODMyYmJkYTMzYWE4MzQxNzlmNTY2NjZjYTg2ZDFmMmJkMzE2ZWRhZTZlY2VkMGQ5ODA2NCJ9fX0="), "&c電動坩堝&7 - &eII", "", "&4終極機器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &780 J/秒");
			ELECTRIFIED_CRUCIBLE_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgyZTI3NWQ2N2YzODMyYmJkYTMzYWE4MzQxNzlmNTY2NjZjYTg2ZDFmMmJkMzE2ZWRhZTZlY2VkMGQ5ODA2NCJ9fX0="), "&c電動坩堝&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &7120 J/秒");

			ELECTRIC_DUST_WASHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="),"&3電動洗礦機", "", "&e基礎機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &76 J/秒");
			ELECTRIC_DUST_WASHER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="),"&3電動洗礦機&7 - &eII", "", "&e基礎機器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &710 J/秒");
			ELECTRIC_DUST_WASHER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="),"&3電動洗礦機&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &730 J/秒");

			ELECTRIC_GOLD_PAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjIwMTIzMzZkYTZmODFmMTExOWE3Njk5OWExYTdhNDExZjAzNzAyMDI4MGFlNGJkZDNkZjZhNmVkMmVhMmYyYiJ9fX0="), "&6電動淘金機", "", "&e基礎機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &72 J/秒");
			ELECTRIC_GOLD_PAN_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTA2NGU1MDQzNGJiNzMyZGRjMThiNTc5NTYxYTdjYWJlYTAxMDdkZDE4NTg1OGZhYjZiOTQ5MDVkNzA2M2I2YiJ9fX0="),"&6電動淘金機&7 - &eII", "", "&e基礎機器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &74 J/秒");
			ELECTRIC_GOLD_PAN_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDZhNGNkNDI1YmU5NmE3NWJlZDRmNzFiZDRjMzhkNGQwYmIyY2FjZDYzM2RhNmE1YzMyZWJlNDc3M2UzYSJ9fX0="),"&6電動淘金機&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &714 J/秒");

			CHARGING_BENCH = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWZjMDVhZjBlODhjNmZiMTBiNGM4YzhiODFiN2FhNjU4ZTY0NjQ5NzI0Y2I3M2JiOWJiMGYyNWYyOGJkIn19fQ=="), "&6充電台", "", "&r能夠給物品充電, 比如噴射背包", "", "&e基礎機器", "&8\u21E8 &e\u26A1 &7128 J 可儲存", "&8\u21E8 &e\u26A1 &7能源損失率: &c50%");

			SYNTHETIC_DIAMOND = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTY0ZjI1Y2ZmZjc1NGYyODdhOTgzOGQ4ZWZlMDM5OTgwNzNjMjJkZjdhOWQzMDI1YzQyNWUzZWQ3ZmY1MmMyMCJ9fX0="), "&b人造鑽石");
			SYNTHETIC_EMERALD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODkyNmMxZjJjM2MxNGQwODZjNDBjZmMyMzVmZTkzODY5NGY0YTUxMDY3YWRhNDcyNmI0ODZlYTFjODdiMDNlMiJ9fX0="), "&a人造綠寶石");

			CROP_GROWTH_ACCELERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTkyMDNlYzgyNTU1NGEwMmQ4NTAxZTMzNThhMGFhZjg5N2NiNTc5MGRjYjFjZjdiMTkzNGI1MWUyZDQ2YjNlNiJ9fX0="), "&a作物生長加速器", "", "&r需要&a有機肥料", "", "&4最終機器", "&8\u21E8 &7半徑: 7x7", "&8\u21E8 &7速度: &a3/次", "&8\u21E8 &e\u26A1 &71024 J 可緩存", "&8\u21E8 &e\u26A1 &750 J/秒" );
			CROP_GROWTH_ACCELERATOR_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU2ZTc5MWUyZjk3MzcwYjlmODkxYmNjMGY5NjZlM2ViMjlmMzhhMzdjNzAyYjg0NDJhZWI2MGU1MDRiYTM5NyJ9fX0="),"&a作物生長加速器&7 - &eII",  "", "&r需要&a有機肥料", "", "&4最終機器", "&8\u21E8 &7半徑: 9x9", "&8\u21E8 &7速度: &a4/次", "&8\u21E8 &e\u26A1 &71024 J 可緩存", "&8\u21E8 &e\u26A1 &760 J/秒" );

			ELECTRIC_INGOT_FACTORY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="), "&c電動鑄錠機", "", "&e基礎機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &78 J/秒");
			ELECTRIC_INGOT_FACTORY_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="), "&c電動鑄錠機&7 - &eII", "", "&e基礎機器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &714 J/秒");
			ELECTRIC_INGOT_FACTORY_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="), "&c電動鑄錠機&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 8x", "&8\u21E8 &e\u26A1 &740 J/秒");

			HEATED_PRESSURE_CHAMBER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM4ZDY3ZDdiODViODlhODlhNWFkNGIxNjhlYzY3ZGJkZGIxZTU4YzY0OGFjYjFkMmQ2MDJjZGUzZDlmYjgyIn19fQ=="), "&c加熱壓力室", "", "&4終極機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &710 J/秒");
			HEATED_PRESSURE_CHAMBER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM4ZDY3ZDdiODViODlhODlhNWFkNGIxNjhlYzY3ZGJkZGIxZTU4YzY0OGFjYjFkMmQ2MDJjZGUzZDlmYjgyIn19fQ=="), "&c加熱壓力室&7 - &eII", "", "&4終極機器", "&8\u21E8 &7速度: 5x", "&8\u21E8 &e \u26A1 &744 J/秒");

			CARBON_PRESS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQ1Y2Y5MmJjNzllYzE5ZjQxMDY0NDFhZmZmZjE0MDZhMTM2NzAxMGRjYWZiMTk3ZGQ5NGNmY2ExYTZkZTBmYyJ9fX0="), "&c碳壓機", "", "&4終極機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/秒");
			CARBON_PRESS_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQ1Y2Y5MmJjNzllYzE5ZjQxMDY0NDFhZmZmZjE0MDZhMTM2NzAxMGRjYWZiMTk3ZGQ5NGNmY2ExYTZkZTBmYyJ9fX0="), "&c碳壓機&7 - &eII", "", "&4終極機器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e \u26A1 &750 J/秒");
			CARBON_PRESS_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQ1Y2Y5MmJjNzllYzE5ZjQxMDY0NDFhZmZmZjE0MDZhMTM2NzAxMGRjYWZiMTk3ZGQ5NGNmY2ExYTZkZTBmYyJ9fX0="), "&c碳壓機&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 15x", "&8\u21E8 &e \u26A1 &7180 J/秒");

			ELECTRIC_FURNACE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmQ1NWI2ZWYxNmE4ZDRmOTNhYjYxM2I5NDQ1MDRiN2YxNmMzZGY1Y2EzNTNhYzg2MjE1MmZlYTkzODQ5ZDY3YSJ9fX0="),"&c電動熔爐", "", "&e基礎機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &74 J/秒");
			ELECTRIC_FURNACE_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmQ1NWI2ZWYxNmE4ZDRmOTNhYjYxM2I5NDQ1MDRiN2YxNmMzZGY1Y2EzNTNhYzg2MjE1MmZlYTkzODQ5ZDY3YSJ9fX0="),"&c電動熔爐&7 - &eII", "", "&a中級機器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &76 J/秒");
			ELECTRIC_FURNACE_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmQ1NWI2ZWYxNmE4ZDRmOTNhYjYxM2I5NDQ1MDRiN2YxNmMzZGY1Y2EzNTNhYzg2MjE1MmZlYTkzODQ5ZDY3YSJ9fX0="),"&c電動熔爐&7 - &eIII", "", "&a中級機器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &710 J/秒");

			AUTO_ENCHANTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmNzkwMTZjYWQ4NGQxYWUyMTYwOWM0ODEzNzgyNTk4ZTM4Nzk2MWJlMTNjMTU2ODI3NTJmMTI2ZGNlN2EifX19"), "&5自動附魔機", "", "&a中級機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/秒");
			AUTO_DISENCHANTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjI2NzJjODdlZWY2ODE4ODI4OTE4ZGQzY2EwMzg1NmNjYjQzNjZlN2M5YWMyNjI0YTk0MmYwZGI3ZTk2YSJ9fX0="), "&5自動除魔機", "", "&a中級機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/秒");

			PORTABLE_CRAFTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzJlYzRhNGJkOGE1OGY4MzYxZjhhMDMwM2UyMTk5ZDMzZDYyNGVhNWY5MmY3Y2IzNDE0ZmVlOTVlMmQ4NjEifX19"), "&6便攜工作台", "&a&o一個便攜式的工作台", "", "&e右鍵&7 打開");
			PORTABLE_DUSTBIN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&6便攜垃圾箱", "&r輕鬆的消除多餘的物品", "", "&e右鍵&7 打開");
			TRASH_CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3垃圾箱", "", "&r將不需要的物品放入可以消除");
			CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&r錫罐");

			STONE_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&6石塊");

			INFUSED_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&a吸入磁鐵" , "", "&r注入了魔法的磁鐵", "&r能夠將附近的物品", "&r放入你的背包", "", "&7按住&eShift&7 吸取周圍的物品");
			MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c磁鐵");
			ELECTRO_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c電磁鐵");
			ELECTRIC_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&c電動馬達");
			CARGO_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3物流馬達");

			BACKPACK_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWZiNmEzZDdkYmE5N2JiNmU3Zjc5YTE1NjI3YWVjNjM2OTc5MTIzM2Y4MzNmYTc0OWVmMjFiZWQ3OWU1OWU5OCJ9fX0"), "&e小型背包", new String[] {"", "&7大小: &e9", "&7ID: <ID>", "", "&7&e右鍵&7打開"});
			BACKPACK_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM1MWU1MDU5ODk4MzhlMjcyODdlN2FmYmM3Zjk3ZTc5NmNhYjVmMzU5OGE3NjE2MGMxMzFjOTQwZDBjNSJ9fX0="), "&e普通背包", new String[] {"", "&7大小: &e18", "&7ID: <ID>", "", "&7&e右鍵&7打開"});
			BACKPACK_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM3YTM1NTIyZjY3YjJhZjkyMzQ1NTkyODQ2YjcwMmI5YWZiOWQ3YzhkYmFkNWVhMTUwNjczYzllNDRkZTMifX19"), "&e中型背包", new String[] {"", "&7大小: &e27", "&7ID: <ID>", "", "&7&e右鍵&7打開"});
			WOVEN_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk5MDlhOTc3OWI5NDZiOTc4NzQ0MmZhNDgzYWY0ZGU0YjJmMTlmZDQwZGMyMzcwZjdhOWI4ZjUyMWYyMWRkYyJ9fX0="), "&e編織背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e右鍵&7打開"});
			GILDED_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTI1NGFhY2JmNjIzMTc1ZmY5OGRmN2FlMzY2ZTBiODllOTE3MTM0NDE3NTJmM2NkZjk2NWYwMzhiMTc0YjUifX19"), "&e鍍金背包", new String[] {"", "&7大小: &e45", "&7ID: <ID>", "", "&7&e右鍵&7打開"});
			BOUND_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWViNjViYmU3NDQ5NDU4NDFlOTIzNGEzM2I1Y2U1Y2MyMzZmNmEyZmM5M2ExYTNhZTQyZGY3N2M5MDg0ZGYxZSJ9fX0="), "&c靈魂綁定背包", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", "&7&e右鍵&7 打開"});
			COOLER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&b小冰櫃", new String[] {"&r可以儲存果汁和冰沙", "&r當小冰櫃在你的物品欄裡時", "&r在你飢餓時將會自動消耗裡面的食物", "", "&7大小: &e27", "&7ID: <ID>", "", "&7&e右鍵&7 打開"});
			ENDER_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6末影背包", new String[] {"&a&o便攜式末影箱", "", "&e右鍵&7 打開"});

			VOIDBAG_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4小型虛空袋", new String[] {"", "&7大小: &e9", "&7ID: <ID>", "", " &7&e左鍵&7 以吸起周圍的物品", "&7&e右鍵&7 打開"});
			VOIDBAG_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4虛空袋", new String[] {"", "&7大小: &e18", "&7ID: <ID>", "", "&7&e左鍵&7 以吸起周圍的物品", "&7&e右鍵&7 打開"});
			VOIDBAG_BIG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4中型虛空袋", new String[] {"", "&7大小: &e27", "&7ID: <ID>", "", " &7&e左鍵&7 以吸起周圍的物品", "&7&e右鍵&7 打開"});
			VOIDBAG_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4大型虛空袋", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "", " &7&e左鍵&7 以吸起周圍的物品", "&7&e右鍵&7 打開"});
			BOUND_VOIDBAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4靈魂綁定虛空袋", new String[] {"", "&7大小: &e36", "&7ID: <ID>", "" , "&7&e左鍵&7 以吸起周圍的物品", "&7&e右鍵&7 打開"});

			COAL_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c煤炭發電機", "", "&6普通發電機", "&8\u21E8 &e\u26A1 &764 J 可儲存", "&8\u21E8 &e\u26A1 &716 J/秒");
			LAVA_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTliYzBkMjYwNTc1MmExMWRiMTRmYjZlNTY2M2IzOGJkNTU1YmMxZmUxNDEwZDJiMzY2YWM1ODcyYjg3OSJ9fX0="), "&4岩漿發電機", "", "&6普通發電機", "&8\u21E8 &e\u26A1 &7512 J 可儲存", "&8\u21E8 &e\u26A1 &720 J/秒");
			COMBUSTION_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWViZWVjNWNlZmQ0ZmFjM2QyNTg1NzQ4ZWJjYTk4YjMzNGM5OWIyOTMxNWU0ZjYyODMxMzhmYjEzZTNmMzgifX19"), "&c燃燒反應機", "", "&6高級發電機", "&8\u21E8 &e\u26A1 &7256 J 可儲存", "&8\u21E8 &e\u26A1 &724 J/秒");

			NUCLEAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzQxMjY1ZDU3ZDM3MDZjMGI0MjhmMWIyNDMwNDRkNTBkODQxNDkyNmFjYjM3NTJiOGNiOWY1Yjg1YmNkZDA5NiJ9fX0="), "&2核能反應堆", "", "&r需要冷卻劑!", "&8\u21E8 &b必須被水包圍", "&8\u21E8 &b必須使用反應堆冷卻劑工作", "", "&4終極發電機", "&8\u21E8 &e\u26A1 &716384 J 可儲存", "&8\u21E8 &e\u26A1 &7500 J/秒");
			NETHERSTAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTUyZmZkMDg1MjhlYzgxODNiMzVhYWM2NThiMjkyMjZhZDhiOWFhY2FjOGRkOWUwNGNmMTg2YjExMDY0Y2E0ZCJ9fX0="), "&f星火反應堆", "", "&f需要地獄之星", "&8\u21E8 &b必須被水包圍", "&8\u21E8 &b必須使用地獄之星冷卻劑工作", "", "&4終極發電機", "&8\u21E8 &e\u26A1 &732768 J 可儲存", "&8\u21E8 &e\u26A1 &71024 J/秒", "&8\u21E8 &4會導致附近的生物獲得凋零效果");

			SMALL_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a小型儲能電容", "", "&e基礎電容", "&8\u21E8 &e\u26A1 &7128 J 可儲存");
			MEDIUM_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a中型儲能電容", "", "&6普通電容", "&8\u21E8 &e\u26A1 &7512 J 可儲存");
			BIG_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a大型儲能電容", "", "&a中型電容", "&8\u21E8 &e\u26A1 &71024 J 可儲存");
			LARGE_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a巨型儲能電容", "", "&2超級電容", "&8\u21E8 &e\u26A1 &78192 J 可儲存");
			CARBONADO_EDGED_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a黑鑽石儲能電容", "", "&4終極電容", "&8\u21E8 &e\u26A1 &765536 J 可儲存");
			CHEESE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&r奶酪");
			BUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&e奶油");
			DUCT_TAPE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8強力膠布", "", "&r可以用這個在自動鐵砧裡", "&r修復物品");

			URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&4鈾", "", "&2輻射等級: 高", "&4&o需要生化套裝");
			SMALL_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c一小塊鈾", "", "&e輻射等級: 中等", "&4&o需要生化套裝");
			TINY_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c一小堆鈾", "", "&c輻射等級: 低", "&4&o不需生化套裝");

			NEPTUNIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&a錼", "", "&2輻射等級: 高", "&4&o需要生化套裝");
			PLUTONIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&7鈽", "", "&2輻射等級: 高", "&4&o需要生化套裝");
			BOOSTED_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2高純度鈾", "", "&2輻射等級: 高", "&4&o需要生化套裝");

			PROGRAMMABLE_ANDROID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c編程機器人&7(普通)", "", "&8\u21E8 &7功能: 無", "&8\u21E8 &7燃料效率: 1.0x ");
			PROGRAMMABLE_ANDROID_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c編程機器人&7(農夫)", "", "&8\u21E8 &7功能: 耕作", "&8\u21E8 &7燃料效率: 1.0x" );
			PROGRAMMABLE_ANDROID_MINER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&c編程機器人&7(礦工)", "", "&8\u21E8 &7功能: 挖礦", "&8\u21E8 &7燃料效率: 1.0x ");
			PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&c編程機器人&7(樵夫)", "", "&8\u21E8 &7功能: 伐木", "&8\u21E8 &7燃料效率: 1.0x ");
			PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c編程機器人&7(屠夫)", "", "&8\u21E8 &7功能: 屠宰", "&8\u21E8 &7傷害: 4", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c編程機器人&7(漁夫)", "", "&8\u21E8 &7功能: 釣魚", "&8\u21E8 &7成功機率: 10% ", "&8\u21E8 &7燃料效率: 1.0x");

			PROGRAMMABLE_ANDROID_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c高級編程機器人&7(普通)", "", "&8\u21E8 &7功能: 無", "&8\u21E8 &7燃料效率: 1.5 x");
			PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c高級編程機器人&7(漁夫)", "", "&8\u21E8 &7功能: 釣魚", "&8\u21E8 &7成功機率: 20 %", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c高級編程機器人&7(農夫)", "", "&8\u21E8 &7功能: 耕作", "&8\u21E8 &7燃料效率: 1.5x ", "&8\u21E8 &7可以收割異域花園內的植物");
			PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c高級編程機器人&7(屠夫)", "", "&8\u21E8 &7功能: 屠宰", "&8\u21E8 &7傷害: 8" , "&8\u21E8 &7燃料效率: 1.5x");

			PROGRAMMABLE_ANDROID_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&e可授權式編程機器人&7(普通)", "", "&8\u21E8 &7功能: 無", "&8\u21E8 &7燃料效率: 3.0x");
			PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&e可授權式編程機器人&7(漁夫)", "", "&8\u21E8 &7功能: 釣魚", "&8\u21E8 &7成功機率: 30%", "&8\u21E8 &7燃料效率: 8.0x");
			PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&e可授權式編程機器人&7(屠夫)", "", "&8\u21E8 &7功能: 屠宰", "&8\u21E8 &7傷害: 20", "&8\u21E8 &7燃料效率: 8.0x");

			GPS_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bGPS 發射器", "", "&8\u21E8 &e\u26A1 &716 J 可儲存", "&8\u21E8 &e\u26A1 &72 J/秒") ;
			GPS_TRANSMITTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&c高級GPS 發射器", "", "&8\u21E8 &e\u26A1 &764 J 可儲存", "&8\u21E8 &e\u26A1 &76 J/秒 ");
			GPS_TRANSMITTER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&4黑鑽石GPS 發射器", "", "&8\u21E8 &e\u26A1 &7256 J 可儲存", "&8\u21E8 &e\u26A1 &722 J/秒");
			GPS_TRANSMITTER_4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&e充能GPS 發射器", "", "&8\u21E8 &e\u26A1 &71024 J 可儲存", "&8\u21E8 &e\u26A1 &792 J/秒");

			GPS_CONTROL_PANEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&bGPS 控制面板", "", "&r允許你追蹤你的衛星", "&r並且管理已有的標記點");
			GPS_EMERGENCY_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cGPS 緊急發射器", "", "&r當你死亡的時候", "&r如果緊急發射器在你的背包內", "&r將會自動把你的死亡位置設為標記點");

			GPS_GEO_SCANNER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&bGPS 地形掃描器", "", "&r掃描一個區塊中有多少自然資源", "&r例如 &8原油");
			OIL_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&r原油泵", "", "&7泵出原油並把它裝進桶裡", "", "&c&l! &c請先對所在區塊進行地形掃描");
			BUCKET_OF_OIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&r原油桶");
			BUCKET_OF_FUEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&r燃料桶");

			NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0="), "&e地獄冰", "", "&e輻射等級: 中等", "&4&o需要生化套裝");
			ENRICHED_NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&e濃縮地獄冰", "", "&2輻射等級: 極高", "&4&o需要生化套裝");

			LAVA_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&4岩漿水晶");
			ANDROID_MEMORY_CORE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRkODQ0ZmVlMjRkNWYyN2RkYjY2OTQzODUyOGQ4M2I2ODRkOTAxYjc1YTY4ODlmZTc0ODhkZmM0Y2Y3YTFjIn19fQ=="), "&b機器人內存核心");

			CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&e碳");
			COMPRESSED_CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&c壓縮碳");
			CARBON_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&4碳塊");

			SYNTHETIC_SAPPHIRE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM1MDMyZjRkN2QwMWRlOGVjOTlkODlmODcyMzAxMmQ0ZTc0ZmE3MzAyMmM0ZmFjZjFiNTdjN2ZmNmZmMCJ9fX0="), "&b人造藍寶石");
			CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&b&l黑金剛石", "", "&7&o\"黑鑽石\"");
			RAW_CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&b黑鑽石原礦");

			ENERGY_REGULATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&6能源調節器", "", "&r能源網絡的核心部分");

			CARGO_MANAGER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6物流管理器", new String[] { "", "&r物品傳輸網絡的核心組件" });
			CARGO_NODE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7物流節點 &c(連接器)", new String[] { "", "&r物流連接管道" });
			CARGO_INPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7物流節點 &c(輸入)", new String[] { "", "&r物流輸入管道" });
			CARGO_OUTPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6物流節點 &c(輸出)", new String[] { "", "&r物流輸出管道" });
			CARGO_OUTPUT_ADVANCED = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6高級物流節點 &c(輸出)", new String[] { "", "&r物流輸出管道" });

			XP_COLLECTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&a經驗收集器", new String[] { "", "&r收集附近的經驗並儲存它們", "", "&4最終機器", " &8\u21E8 &e\u26A1 &71024 J 可緩存", "&8\u21E8 &e\u26A1 &720 J/秒" });

			ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9X");
			WHEAT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9小麥");
			CARROT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9胡蘿蔔");
			POTATO_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9土豆");
			SEEDS_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9小麥種子");
			BEETROOT_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9甜菜");
			MELON_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9西瓜");
			APPLE_ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機食物", "&7內含 &9蘋果");

			FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9X");
			WHEAT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9小麥");
			CARROT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9胡蘿蔔");
			POTATO_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9土豆");
			SEEDS_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9小麥種子");
			BEETROOT_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9甜菜");
			MELON_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9西瓜");
			APPLE_FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有機肥料", "&7內含 &9蘋果");

			NETHER_ICE_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&6地獄冰冷卻劑");
			REACTOR_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&b反應堆冷卻劑");

			CHEST_TERMINAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3物流接入終端", "&7當此設備成功連接至物流網絡時", "它將允許你遠程與", "&7物流網絡中的任何物品交互", "&7節點將調整至物流網絡頻道");
			CT_IMPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3物流輸入終端", "&7當此設備成功連接至物流網絡時", "它將從其所附屬於的容器中", "&7取出物品並放入物流網絡頻道)");
			CT_EXPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3物流輸出終端", "&7當此設備成功連接至物流網絡時", "它將從物流網絡頻道", "&7取出物品並將它們放入", "&7終端所附屬於的容器");

			FREEZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY5ZTBhYmEzNWQ2ODUzZWU1NGM4Njc5OWY3NTRhZTE2NjlkZDM5YTBlMmYzZDY5NzMxZjMzMWFkZWRlIn19fQ=="), "&b冰箱", "", "&6進階機器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7可儲存256 J ", "&8\u21E8 &e\u26A1 &718 J/秒");
			FREEZER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY5ZTBhYmEzNWQ2ODUzZWU1NGM4Njc5OWY3NTRhZTE2NjlkZDM5YTBlMmYzZDY5NzMxZjMzMWFkZWRlIn19fQ=="), "&b冰箱&7 - &eIII", "", "&4終極機器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &7可儲存256 J", "&8\u21E8 &e\u26A1 &730 J/秒");

			BATTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjRmMjFjZjVjMjM0ZmM5NmRiOTBhMGEzMTFkNmZiZTEyZjg3ODliN2ZhODE1NTcxNjc1N2ZkNTE2YjE4MTEifX19"), "&6電池");

			HEATING_COIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&c加熱線圈");
			COOLING_UNIT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWNlNDI4M2E4N2Q0NzIzYjYyOWUxMjA3ZDBjZWE4MGQ0NjE4YWFlZGQ1ZWEzNGI0MTI5YTkwN2JiMTA1ODY4ZiJ9fX0="), "&b冷卻裝置");
			POWER_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&c&l能量水晶");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}