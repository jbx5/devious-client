import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class173 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}
}
