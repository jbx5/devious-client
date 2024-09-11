import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class197 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "29029"
	)
	public static int method4024(int var0, int var1, int var2) {
		int var3 = class354.method6857(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}
}
