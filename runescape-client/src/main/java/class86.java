import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class86 {
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1084;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static int method2348(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
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
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else {
			int var5;
			int var6;
			if (var2.secondaryRgb >= 0) {
				var6 = ClientPreferences.method2540(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var5 = class219.method4299(var6, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			} else if (var2.texture >= 0) {
				var6 = class219.method4299(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var6] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var6 = ClientPreferences.method2540(var2.hue, var2.saturation, var2.lightness);
				var5 = class219.method4299(var6, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1827002015"
	)
	public static int method2349(int var0) {
		return GrandExchangeOfferAgeComparator.method7271(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
