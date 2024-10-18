import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class178 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "62"
	)
	public static int method3845(int var0) {
		return AuthenticationScheme.method3355(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
