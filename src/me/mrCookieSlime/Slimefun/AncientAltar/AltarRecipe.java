package me.mrCookieSlime.Slimefun.AncientAltar;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class AltarRecipe {

	ItemStack catalyst;
	List<ItemStack> input;
	ItemStack output;

	public AltarRecipe(List<ItemStack> input, ItemStack output) {
		this.catalyst = input.get(4);
		this.input = new ArrayList<>();

		this.input.add(input.get(0));
		this.input.add(input.get(1));
		this.input.add(input.get(2));
		this.input.add(input.get(5));

		this.input.add(input.get(8));
		this.input.add(input.get(7));
		this.input.add(input.get(6));
		this.input.add(input.get(3));

		this.output = output;

		Pedestals.recipes.add(this);
	}

	public ItemStack getCatalyst() {
		return this.catalyst;
	}

	public ItemStack getOutput() {
		return this.output;
	}

	public List<ItemStack> getInput() {
		return this.input;
	}

}