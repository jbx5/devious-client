import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class328 {
	@ObfuscatedName("aq")
	static int[] field3561;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 1411387951
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1489005223
	)
	static int field3560;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 130012625
	)
	static int field3565;

	static {
		new Object();
		field3561 = new int[33];
		field3561[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3561[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	static void method6151() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		class356.field3810 = null;
		KeyHandler.field110 = null;
		WorldMapScaleHandler.Tiles_underlays2 = null;
		Tiles.field1039 = null;
		Tiles.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		Canvas.Tiles_lightness = null;
		Tiles.Tiles_hueMultiplier = null;
		class534.field5292 = null;
	}
}
