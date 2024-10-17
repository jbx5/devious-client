import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class195 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field2054;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}
}
