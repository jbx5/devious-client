import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class188 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2007")
	public static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("aq")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2133075483"
	)
	public static void method3965() {
		class197.field2022.clear();
	}
}
