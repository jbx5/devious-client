import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class173 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("field1915")
	public static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive4")
	static Archive archive4;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}
}
