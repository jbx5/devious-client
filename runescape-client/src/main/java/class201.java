import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class201 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1910503401"
	)
	static String method4066(int var0) {
		return "<img=" + var0 + ">";
	}
}
