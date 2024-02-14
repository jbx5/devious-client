import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class172 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmf;",
		garbageValue = "-1094244381"
	)
	static class314[] method3542() {
		return new class314[]{class314.field3435, class314.field3424, class314.field3429, class314.field3430, class314.field3427, class314.field3425, class314.field3433, class314.field3426};
	}
}
