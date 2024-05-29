import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("TilesProjection")
public class TilesProjection extends Projection
{
	@ObfuscatedName("az")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1852051081
	)
	public static int field2792;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class423 field2790;
	@ObfuscatedName("al")
	float[] field2793;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	TilesProjection(class423 var1) {
		this.field2793 = new float[3];
		this.field2790 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lju;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.field2790, var3, var4, var5, var6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lkg;IIIB)V",
		garbageValue = "30"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7;
		int var8;
		int var9 = var8 = var5 << 7;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5];
		int var15 = var1.tileHeights[var3][var4 + 1][var5];
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1];
		int var17 = var1.tileHeights[var3][var4][var5 + 1];
		this.field2790.method7867((float)var7, (float)var14, (float)var9, this.field2793);
		var7 = (int)this.field2793[0];
		var14 = (int)this.field2793[1];
		var9 = (int)this.field2793[2] | 1;
		this.field2790.method7867((float)var11, (float)var15, (float)var8, this.field2793);
		var11 = (int)this.field2793[0];
		var15 = (int)this.field2793[1];
		var8 = (int)this.field2793[2] | 1;
		this.field2790.method7867((float)var10, (float)var16, (float)var13, this.field2793);
		var10 = (int)this.field2793[0];
		var16 = (int)this.field2793[1];
		var13 = (int)this.field2793[2] | 1;
		this.field2790.method7867((float)var6, (float)var17, (float)var12, this.field2793);
		var6 = (int)this.field2793[0];
		var17 = (int)this.field2793[1];
		var12 = (int)this.field2793[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lke;IIB)V",
		garbageValue = "14"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.field2790.method7867((float)var7, (float)var8, (float)var9, this.field2793);
			var7 = (int)this.field2793[0];
			var8 = (int)this.field2793[1];
			var9 = (int)this.field2793[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.field2858[var6] = var7;
				SceneTileModel.field2859[var6] = var8;
				SceneTileModel.field2860[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.field2855[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2856[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2857[var6] = class175.method3578(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}
}
