package me.mrCookieSlime.Slimefun.androids;

import org.bukkit.block.Block;
import me.mrCookieSlime.Slimefun.Android.ProgrammableAndroid;

public class AndroidObject {
	
	private ProgrammableAndroid android;
	private Block b;
	
	public AndroidObject(ProgrammableAndroid android, Block b) {
		this.android = android;
		this.b = b;
	}
	
	public ProgrammableAndroid getAndroid() {
		return this.android;
	}
	
	public Block getBlock() {
		return b;
	}

}
