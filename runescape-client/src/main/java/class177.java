import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class177 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;
	@ObfuscatedName("ax")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("br")
	@Export("hasFocus")
	protected static boolean hasFocus;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[Lol;",
		garbageValue = "58"
	)
	public static class382[] method3791() {
		return new class382[]{class382.field4454, class382.field4456, class382.field4453, class382.field4452};
	}
}
