import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class252 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljg;",
		garbageValue = "1182220309"
	)
	static VerticalAlignment[] method5015() {
		return new VerticalAlignment[]{VerticalAlignment.field2618, VerticalAlignment.field2619, VerticalAlignment.VerticalAlignment_centered};
	}
}
