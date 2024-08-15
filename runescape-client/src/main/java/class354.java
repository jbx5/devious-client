import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class354 {
	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("entity")
	static Entity entity;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-773430132"
	)
	public static int method6568(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
