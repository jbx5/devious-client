import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class248 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -319523021
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "80"
	)
	public static int method4976(int var0, int var1, int var2) {
		int var3 = GameObject.method4490(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
