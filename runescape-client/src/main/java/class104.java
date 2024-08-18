import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class104 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lja;",
		garbageValue = "-24"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < class442.WorldMapElement_cached.length && class442.WorldMapElement_cached[var0] != null ? class442.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	static int method2822() {
		return class28.KeyHandler_keyCodes.length;
	}
}
