import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("jl")
public class class270 {
	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1345506166")
	static int method5223(int var0, int var1) {
		FloorOverlayDefinition var3 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var0)))));
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}
			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, ((long) (var0)));
			var2 = var3;
		}
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else if (var2.texture >= 0) {
			int var10 = class160.method3277(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
			return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
		} else if (var2.primaryRgb == 16711935) {
			return var1;
		} else {
			int var5 = var2.hue;
			int var6 = var2.saturation;
			int var7 = var2.lightness;
			if (var7 > 179) {
				var6 /= 2;
			}
			if (var7 > 192) {
				var6 /= 2;
			}
			if (var7 > 217) {
				var6 /= 2;
			}
			if (var7 > 243) {
				var6 /= 2;
			}
			int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
			int var9 = class160.method3277(var8, 96);
			return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "121")
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;
		try {
			var0 = Actor.getPreferencesFile("", AbstractByteArrayCopier.field3293.name, true);
			Buffer var1 = class260.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}
		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}
	}
}