import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class214 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1001699660"
	)
	public static int method3983(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
