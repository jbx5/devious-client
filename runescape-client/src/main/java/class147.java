import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public abstract class class147 extends Node {
	@ObfuscatedName("al")
	static String[] field1695;
	@ObfuscatedName("jj")
	static int[] field1696;

	class147() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	abstract void vmethod3528(Buffer var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	abstract void vmethod3530(ClanSettings var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "612733654"
	)
	public static int method3268(int var0) {
		return class229.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;",
		garbageValue = "-503099454"
	)
	static JagNetThread method3269() {
		return class233.field2486;
	}
}
