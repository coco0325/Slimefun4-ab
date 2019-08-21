package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.EmeraldEnchants.EmeraldEnchants;
import me.mrCookieSlime.EmeraldEnchants.ItemEnchantment;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineHelper;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;

public class AutoDisenchanter extends AContainer {

	public AutoDisenchanter(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
	}

	@Override
	public String getInventoryTitle() {
		return "&5自動除魔機";
	}

	@Override
	public ItemStack getProgressBar() {
		return new ItemStack(Material.DIAMOND_CHESTPLATE);
	}

	@Override
	public void registerDefaultRecipes() {}

	@Override
	public int getEnergyConsumption() {
		return 9;
	}

	@Override
	protected void tick(Block b) {
		if (isProcessing(b)) {
			int timeleft = progress.get(b)-Math.toIntExact(System.currentTimeMillis()/1000);
			if (timeleft > 0) {
				ItemStack item = getProgressBar().clone();
				ItemMeta im = item.getItemMeta();
				((Damageable) im).setDamage(MachineHelper.getDurability(item, timeleft*2, processing.get(b).getTicks()));
				im.setDisplayName(" ");
				List<String> lore = new ArrayList<String>();
				lore.add(MachineHelper.getProgress(timeleft*2, processing.get(b).getTicks()));
				lore.add("");
				lore.add(MachineHelper.getTimeLeft(timeleft));
				im.setLore(lore);
				item.setItemMeta(im);

				BlockStorage.getInventory(b).replaceExistingItem(22, item);

				if (ChargableBlock.isChargable(b)) {
					if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
					ChargableBlock.addCharge(b, -getEnergyConsumption());
				}
			}
			else {
				processing_items.remove(b);
				BlockStorage.getInventory(b).replaceExistingItem(22, new CustomItem(new ItemStack(Material.BLACK_STAINED_GLASS_PANE), " "));
				pushItems(b, processing.get(b).getOutput());

				progress.remove(b);
				processing.remove(b);
			}
		}
		else {
			MachineRecipe r = null;
			Map<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
			Set<ItemEnchantment> enchantments2 = new HashSet<ItemEnchantment>();
			slots:
			for (int slot: getInputSlots()) {
				ItemStack target = BlockStorage.getInventory(b).getItemInSlot(slot == getInputSlots()[0] ? getInputSlots()[1]: getInputSlots()[0]);
				ItemStack item = BlockStorage.getInventory(b).getItemInSlot(slot);
				
				// Check if disenchantable
				SlimefunItem sfItem = null;
				if ((item != null) && (item.getType() != Material.BOOK)) { // stops endless checks of getByItem for empty book stacks.
					sfItem = SlimefunItem.getByItem(item);
				}
				if (sfItem != null && !sfItem.isDisenchantable()) return;
				
				// Disenchant
				if (item != null && target != null && target.getType() == Material.BOOK) {
					int amount = 0;

					for (Map.Entry<Enchantment, Integer> e: item.getEnchantments().entrySet()) {
						enchantments.put(e.getKey(), e.getValue());
						amount++;
					}
					if (Slimefun.isEmeraldEnchantsInstalled()) {
						for (ItemEnchantment enchantment: EmeraldEnchants.getInstance().getRegistry().getEnchantments(item)) {
							amount++;
							enchantments2.add(enchantment);
						}
					}
					if (amount > 0) {
						ItemStack newItem = item.clone();
						newItem.setAmount(1);
						ItemStack book = target.clone();
						book.setAmount(1);
						book.setType(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta meta = (EnchantmentStorageMeta) book.getItemMeta();
						for (Map.Entry<Enchantment,Integer> e: enchantments.entrySet()) {
							newItem.removeEnchantment(e.getKey());
							meta.addStoredEnchant(e.getKey(), e.getValue(), true);
						}
						book.setItemMeta(meta);

						for (ItemEnchantment e: enchantments2) {
							EmeraldEnchants.getInstance().getRegistry().applyEnchantment(book, e.getEnchantment(), e.getLevel());
							EmeraldEnchants.getInstance().getRegistry().applyEnchantment(newItem, e.getEnchantment(), 0);
						}
						r = new MachineRecipe(100 * amount, new ItemStack[] {target, item}, new ItemStack[] {newItem, book});
						break slots;
					}
				}
			}

			if (r != null) {
				if (!fits(b, r.getOutput())) return;
				ArrayList<ItemStack> items = new ArrayList<ItemStack>();
				for (int slot: getInputSlots()) {
					items.add(BlockStorage.getInventory(b).getItemInSlot(slot));
					BlockStorage.getInventory(b).replaceExistingItem(slot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(slot), 1));
				}
				processing_items.put(b, items);
				processing.put(b, r);
				progress.put(b, Math.toIntExact(System.currentTimeMillis()/1000)+(r.getTicks()/2));
			}
		}
	}

	@Override
	public int getSpeed() {
		return 1;
	}

	@Override
	public String getMachineIdentifier() {
		return "AUTO_DISENCHANTER";
	}

}
