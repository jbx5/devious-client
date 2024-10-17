import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class201 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}
}
