import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class192 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}
}
