import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cb")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("c")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;

	@ObfuscatedName("k")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1124857953)
	@Export("group")
	int group;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 67717225)
	@Export("type")
	int type;

	@ObfuscatedName("w")
	boolean field1022 = false;

	InterfaceParent() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lkc;", garbageValue = "1265149283")
	static class302[] method2058() {
		return new class302[]{ class302.field3577, class302.field3578 };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IZIZB)V", garbageValue = "1")
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class296.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)Lfa;", garbageValue = "59")
	public static Clock method2057() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}
}