import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Projection")
public abstract class Projection {
	@ObfuscatedName("ad")
	public static short[][] field2769;

	Projection() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lju;IIIIJ)V"
	)
	@Export("draw")
	abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljl;IIII)V",
		garbageValue = "795237467"
	)
	@Export("drawTileUnderlay")
	abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljb;III)V",
		garbageValue = "-849252545"
	)
	@Export("drawTileOverlay")
	abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljl;IIIIIIIIIIIIIII)V",
		garbageValue = "1329653403"
	)
	@Export("drawSceneTilePaint")
	void drawSceneTilePaint(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
		int var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
		int var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
		int var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
		int var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
		int var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
		int var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
		int var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
		float var25 = class142.method3386(var13);
		float var26 = class142.method3386(var14);
		float var27 = class142.method3386(var15);
		float var28 = class142.method3386(var16);
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var29;
		int var30;
		if ((var21 - var23) * (var20 - var24) - (var19 - var23) * (var22 - var24) > 0) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method4807();
			if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var22, var24, var20, var21, var23, var19)) {
				var1.baseX = var3;
				var1.baseY = var4;
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) {
					Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				if (var2.isFlat) {
					Rasterizer3D.rasterTextureWithColors(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
				} else {
					Rasterizer3D.rasterTextureWithColors(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.texture);
				}
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method4956(var30, var2.neColor), Scene.method4956(var30, var2.nwColor), Scene.method4956(var30, var2.seColor));
			}
		}

		if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method4807();
			if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var18, var20, var24, var17, var19, var23)) {
				var1.baseX = var3;
				var1.baseY = var4;
			}

			if (var2.texture == -1) {
				if (var2.swColor != 12345678) {
					Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				Rasterizer3D.rasterTextureWithColors(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method4956(var30, var2.swColor), Scene.method4956(var30, var2.seColor), Scene.method4956(var30, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljb;IIB)V",
		garbageValue = "73"
	)
	@Export("drawSceneTileModel")
	void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var5 = var2.faceX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.faceX[var6];
			int var8 = var2.faceY[var6];
			int var9 = var2.faceZ[var6];
			int var10 = SceneTileModel.verticesX[var7];
			int var11 = SceneTileModel.verticesX[var8];
			int var12 = SceneTileModel.verticesX[var9];
			int var13 = SceneTileModel.verticesY[var7];
			int var14 = SceneTileModel.verticesY[var8];
			int var15 = SceneTileModel.verticesY[var9];
			float var16 = SceneTileModel.verticesZ[var7];
			float var17 = SceneTileModel.verticesZ[var8];
			float var18 = SceneTileModel.verticesZ[var9];
			if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0) {
				Rasterizer3D.clips.clipping = false;
				int var19 = Rasterizer3D.method4807();
				if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
					Rasterizer3D.clips.clipping = true;
				}

				if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var13, var14, var15, var10, var11, var12)) {
					var1.baseX = var3;
					var1.baseY = var4;
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
					if (!Scene.Scene_isLowDetail) {
						if (var2.isFlat) {
							Rasterizer3D.rasterTextureWithColors(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[0], SceneTileModel.triangleTexturesX[1], SceneTileModel.triangleTexturesX[3], SceneTileModel.triangleTexturesY[0], SceneTileModel.triangleTexturesY[1], SceneTileModel.triangleTexturesY[3], SceneTileModel.triangleTexturesZ[0], SceneTileModel.triangleTexturesZ[1], SceneTileModel.triangleTexturesZ[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.rasterTextureWithColors(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[var7], SceneTileModel.triangleTexturesX[var8], SceneTileModel.triangleTexturesX[var9], SceneTileModel.triangleTexturesY[var7], SceneTileModel.triangleTexturesY[var8], SceneTileModel.triangleTexturesY[var9], SceneTileModel.triangleTexturesZ[var7], SceneTileModel.triangleTexturesZ[var8], SceneTileModel.triangleTexturesZ[var9], var2.triangleTextureId[var6]);
						}
					} else {
						int var20 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]);
						Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method4956(var20, var2.triangleColorA[var6]), Scene.method4956(var20, var2.triangleColorB[var6]), Scene.method4956(var20, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)I",
		garbageValue = "-117"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return SoundCache.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
