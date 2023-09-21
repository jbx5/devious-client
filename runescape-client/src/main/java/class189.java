import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class189 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 995756711
	)
	public static int field1912;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}
}
