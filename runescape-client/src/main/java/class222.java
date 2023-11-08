import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class222 extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 240215103
	)
	public int field2346;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 11877061
	)
	public int field2347;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -562661393
	)
	public int field2344;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public Widget field2349;

	@ObfuscatedSignature(
		descriptor = "(IIILnn;)V"
	)
	public class222(int var1, int var2, int var3, Widget var4) {
		this.field2344 = var1;
		this.field2346 = var2;
		this.field2347 = var3;
		this.field2349 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static final void method4306(String var0) {
		WorldMapArea.method4622(var0 + " is already on your friend list");
	}
}
