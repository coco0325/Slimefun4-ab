package me.mrCookieSlime.Slimefun.GEO.Resources;

import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.GEO.OreGenResource;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public class NetherIceResource implements OreGenResource {
	
	@Override
	public int getDefaultSupply(Biome biome) {
		return biome == Biome.NETHER ? 32: 0;
	}

	@Override
	public String getName() {
		return "地獄冰";
	}

	@Override
	public ItemStack getIcon() {
		return SlimefunItems.NETHER_ICE.clone();
	}

	@Override
	public String getMeasurementUnit() {
		return "塊";
	}

}
