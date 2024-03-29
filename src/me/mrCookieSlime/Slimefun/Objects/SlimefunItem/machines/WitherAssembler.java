package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Math.DoubleHandler;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager.DataType;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class WitherAssembler extends SlimefunItem {
	
	private static int lifetime = 0;
	
	private static final int[] border = {0, 2, 3, 4, 5, 6, 8, 12, 14, 21, 23, 30, 32, 39, 40, 41};
	private static final int[] border_1 = {9, 10, 11, 18, 20, 27, 29, 36, 37, 38};
	private static final int[] border_2 = {15, 16, 17, 24, 26, 33, 35, 42, 43, 44};

	public WitherAssembler(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
		
		new BlockMenuPreset(name, getInventoryTitle()) {
			
			@Override
			public void init() {
				constructMenu(this);
			}

			@Override
			public void newInstance(final BlockMenu menu, final Block b) {
				try {
					if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getLocationInfo(b.getLocation(), "enabled") == null || BlockStorage.getLocationInfo(b.getLocation(), "enabled").equals("false")) {
						menu.replaceExistingItem(22, new CustomItem(new ItemStack(Material.GUNPOWDER), "&7啟用狀態: &4\u2718", "", "&e> 點我開啟機器"));
						menu.addMenuClickHandler(22, (p, slot, item, action) -> {
							BlockStorage.addBlockInfo(b, "enabled", "true");
							newInstance(menu, b);
							return false;
						});
					}
					else {
						menu.replaceExistingItem(22, new CustomItem(new ItemStack(Material.REDSTONE), "&7啟用狀態: &2\u2714", "", "&e> 點我關閉機器"));
						menu.addMenuClickHandler(22, (p, slot, item, action) -> {
							BlockStorage.addBlockInfo(b, "enabled", "false");
							newInstance(menu, b);
							return false;
						});
					}
					
					double offset = (!BlockStorage.hasBlockInfo(b) || BlockStorage.getLocationInfo(b.getLocation(), "offset") == null) ? 3.0F: Double.valueOf(BlockStorage.getLocationInfo(b.getLocation(), "offset"));
					
					menu.replaceExistingItem(31, new CustomItem(new ItemStack(Material.PISTON), "&7生成高度: &3" + offset + " 個方塊高度上生成", "", "&r左鍵: &7+0.1", "&r右鍵: &7-0.1"));
					menu.addMenuClickHandler(31, (p, slot, item, action) -> {
						double offsetv = DoubleHandler.fixDouble(Double.valueOf(BlockStorage.getLocationInfo(b.getLocation(), "offset")) + (action.isRightClicked() ? -0.1F : 0.1F));
						BlockStorage.addBlockInfo(b, "offset", String.valueOf(offsetv));
						newInstance(menu, b);
						return false;
					});
				} catch(Exception x) {
					x.printStackTrace();
				}
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				return p.hasPermission("slimefun.inventory.bypass") || CSCoreLib.getLib().getProtectionManager().canAccessChest(p.getUniqueId(), b, true);
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				if (flow.equals(ItemTransportFlow.INSERT)) return getInputSlots();
				else return new int[0];
			}
			
			@Override
			public int[] getSlotsAccessedByItemTransport(BlockMenu menu, ItemTransportFlow flow, ItemStack item) {
				if (flow.equals(ItemTransportFlow.INSERT)) {
					if (SlimefunManager.isItemSimiliar(item, new ItemStack(Material.SOUL_SAND), true)) return getSoulSandSlots();
					else return getWitherSkullSlots();
				}
				else return new int[0];
			}
		};
		
		registerBlockHandler(name, new SlimefunBlockHandler() {
			
			@Override
			public void onPlace(Player p, Block b, SlimefunItem item) {
				BlockStorage.addBlockInfo(b, "offset", "3.0");
				BlockStorage.addBlockInfo(b, "enabled", "false");
			}
			
			@Override
			public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason) {
				if (reason.equals(UnregisterReason.EXPLODE)) return false;
				BlockMenu inv = BlockStorage.getInventory(b);
				if (inv != null) {
					for (int slot: getSoulSandSlots()) {
						if (inv.getItemInSlot(slot) != null) {
							b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
							inv.replaceExistingItem(slot, null);
						}
					}
					for (int slot : getWitherSkullSlots()) {
						if (inv.getItemInSlot(slot) != null) {
							b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
							inv.replaceExistingItem(slot, null);
						}
					}
				}
				return true;
			}
		});
	}
	
	private void constructMenu(BlockMenuPreset preset) {
		for (int i : border) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "),
				(p, slot, item, action) -> false
			);
		}
		
		for (int i : border_1) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.BLACK_STAINED_GLASS_PANE), " "),
				(p, slot, item, action) -> false
			);
		}
		
		for (int i : border_2) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.BROWN_STAINED_GLASS_PANE), " "),
				(p, slot, item, action) -> false
			);
		}
		
		preset.addItem(1, new CustomItem(new ItemStack(Material.WITHER_SKELETON_SKULL, (byte) 1), "&7凋零骷髏頭顱槽", "", "&r請放入頭顱"),
			(p, slot, item, action) -> false
		);
		
		preset.addItem(7, new CustomItem(new ItemStack(Material.SOUL_SAND), "&7靈魂沙槽", "", "&r請放入靈魂沙"),
			(p, slot, item, action) -> false
		);
		
		preset.addItem(13, new CustomItem(new ItemStack(Material.CLOCK), "&7冷卻時間: 30秒", "", "&r此機器需要30秒來準備", "&r請耐心等候!"),
			(p, slot, item, action) -> false
		);
	}
	
	public String getInventoryTitle() {
		return "&5凋零彙編器";
	}

	public int[] getInputSlots() {
		return new int[] {19, 28, 25, 34};
	}
	
	public int[] getWitherSkullSlots() {
		return new int[] {19, 28};
	}
	
	public int[] getSoulSandSlots() {
		return new int[] {25, 34};
	}
	
	@Override
	public void register(boolean slimefun) {
		addItemHandler(new BlockTicker() {
			
			@Override
			public void tick(final Block b, SlimefunItem sf, Config data) {
				if (BlockStorage.getLocationInfo(b.getLocation(), "enabled").equals("false")) return;
				if (lifetime % 60 == 0) {
					if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
					
					int soulsand = 0;
					int skulls = 0;
					
					for (int slot : getSoulSandSlots()) {
						if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.SOUL_SAND), true, DataType.ALWAYS)) {
							soulsand = soulsand + BlockStorage.getInventory(b).getItemInSlot(slot).getAmount();
							if (soulsand > 3) {
								soulsand = 4;
								break;
							}
						}
					}
					
					for (int slot : getWitherSkullSlots()) {
						if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.WITHER_SKELETON_SKULL), true, DataType.ALWAYS)) {
							skulls = skulls + BlockStorage.getInventory(b).getItemInSlot(slot).getAmount();
							if (skulls > 2) {
								skulls = 3;
								break;
							}
						}
					}
					
					if (soulsand > 3 && skulls > 2) {
						for (int slot : getSoulSandSlots()) {
							if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.SOUL_SAND), true, DataType.ALWAYS)) {
								final int amount = BlockStorage.getInventory(b).getItemInSlot(slot).getAmount();
								if (amount >= soulsand) {
									BlockStorage.getInventory(b).replaceExistingItem(slot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(slot), soulsand));
									break;
								}
								else {
									soulsand = soulsand - amount;
									BlockStorage.getInventory(b).replaceExistingItem(slot, null);
								}
							}
						}
						
						for (int slot : getWitherSkullSlots()) {
							if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.WITHER_SKELETON_SKULL), true, DataType.ALWAYS)) {
								final int amount = BlockStorage.getInventory(b).getItemInSlot(slot).getAmount();
								if (amount >= skulls) {
									BlockStorage.getInventory(b).replaceExistingItem(slot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(slot), skulls));
									break;
								}
								else {
									skulls = skulls - amount;
									BlockStorage.getInventory(b).replaceExistingItem(slot, null);
								}
							}
						}
						
						ChargableBlock.addCharge(b, -getEnergyConsumption());
						
						final double offset = Double.parseDouble(BlockStorage.getLocationInfo(b.getLocation(), "offset"));
						
						Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, () -> {
							b.getWorld().spawnEntity(new Location(b.getWorld(), b.getX() + 0.5D, b.getY() + offset, b.getZ() + 0.5D), EntityType.WITHER);
						});
						
						return;
					}
				}
			}

			@Override
			public void uniqueTick() {
				lifetime++;
			}

			@Override
			public boolean isSynchronized() {
				return false;
			}
		});

		super.register(slimefun);
	}

	public int getEnergyConsumption() {
		return 4096;
	}

}
