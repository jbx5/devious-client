import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public abstract class class260 {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive2")
	static Archive archive2;

	class260() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lju;IIIIJ)V"
	)
	abstract void vmethod5146(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lkg;IIIB)V",
		garbageValue = "30"
	)
	abstract void vmethod5147(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lke;IIB)V",
		garbageValue = "14"
	)
	abstract void vmethod5148(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lkg;IIIIIIIIIIIIIII)V",
		garbageValue = "1669183748"
	)
	void method5149(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
		int var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
		int var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
		int var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
		int var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
		int var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
		int var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
		int var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
		float var25 = class175.method3578(var13);
		float var26 = class175.method3578(var14);
		float var27 = class175.method3578(var15);
		float var28 = class175.method3578(var16);
		Rasterizer3D.clips.field2983 = 0;
		int var29;
		int var30;
		if ((var21 - var23) * (var20 - var24) - (var22 - var24) * (var19 - var23) > 0) {
			Rasterizer3D.clips.field2973 = false;
			var29 = Rasterizer3D.method4760();
			if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
				Rasterizer3D.clips.field2973 = true;
			}

			if (var1.field2734 && Scene.containsBounds(var1.field2738, var1.field2739, var22, var24, var20, var21, var23, var19)) {
				var1.field2740 = var3;
				var1.field2741 = var4;
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) {
					Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				if (var2.isFlat) {
					Rasterizer3D.method4700(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
				} else {
					Rasterizer3D.method4700(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.texture);
				}
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method4913(var30, var2.neColor), Scene.method4913(var30, var2.nwColor), Scene.method4913(var30, var2.seColor));
			}
		}

		if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0) {
			Rasterizer3D.clips.field2973 = false;
			var29 = Rasterizer3D.method4760();
			if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) {
				Rasterizer3D.clips.field2973 = true;
			}

			if (var1.field2734 && Scene.containsBounds(var1.field2738, var1.field2739, var18, var20, var24, var17, var19, var23)) {
				var1.field2740 = var3;
				var1.field2741 = var4;
			}

			if (var2.texture == -1) {
				if (var2.swColor != 12345678) {
					Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				Rasterizer3D.method4700(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method4913(var30, var2.swColor), Scene.method4913(var30, var2.seColor), Scene.method4913(var30, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lke;IIB)V",
		garbageValue = "119"
	)
	void method5158(Scene var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.clips.field2983 = 0;
		int var5 = var2.faceX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.faceX[var6];
			int var8 = var2.faceY[var6];
			int var9 = var2.faceZ[var6];
			int var10 = SceneTileModel.field2855[var7];
			int var11 = SceneTileModel.field2855[var8];
			int var12 = SceneTileModel.field2855[var9];
			int var13 = SceneTileModel.field2856[var7];
			int var14 = SceneTileModel.field2856[var8];
			int var15 = SceneTileModel.field2856[var9];
			float var16 = SceneTileModel.field2857[var7];
			float var17 = SceneTileModel.field2857[var8];
			float var18 = SceneTileModel.field2857[var9];
			if ((var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0) {
				Rasterizer3D.clips.field2973 = false;
				int var19 = Rasterizer3D.method4760();
				if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
					Rasterizer3D.clips.field2973 = true;
				}

				if (var1.field2734 && Scene.containsBounds(var1.field2738, var1.field2739, var13, var14, var15, var10, var11, var12)) {
					var1.field2740 = var3;
					var1.field2741 = var4;
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
					if (!Scene.Scene_isLowDetail) {
						if (var2.field2852) {
							Rasterizer3D.method4700(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field2858[0], SceneTileModel.field2858[1], SceneTileModel.field2858[3], SceneTileModel.field2859[0], SceneTileModel.field2859[1], SceneTileModel.field2859[3], SceneTileModel.field2860[0], SceneTileModel.field2860[1], SceneTileModel.field2860[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.method4700(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field2858[var7], SceneTileModel.field2858[var8], SceneTileModel.field2858[var9], SceneTileModel.field2859[var7], SceneTileModel.field2859[var8], SceneTileModel.field2859[var9], SceneTileModel.field2860[var7], SceneTileModel.field2860[var8], SceneTileModel.field2860[var9], var2.triangleTextureId[var6]);
						}
					} else {
						int var20 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]);
						Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method4913(var20, var2.triangleColorA[var6]), Scene.method4913(var20, var2.triangleColorB[var6]), Scene.method4913(var20, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "768609623"
	)
	public static final void method5163(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
