import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class228 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field1842")
	static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "758106719"
	)
	static void method4769(String var0) {
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
			var1 = var0;
		} else {
			var1 = "";
		}

		Login.displayName = var1;
	}
}
