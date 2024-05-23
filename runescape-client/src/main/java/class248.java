import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class248 extends class260 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -653944201
	)
	int field2673;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1004642109
	)
	int field2674;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1404479995
	)
	int field2675;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 331009503
	)
	int field2676;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 490189557
	)
	int field2680;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1392008033
	)
	int field2678;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 169206163
	)
	int field2679;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -174075279
	)
	int field2677;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1543758921
	)
	int field2681;

	class248(int var1, int var2, int var3, int var4, int var5) {
		this.field2673 = var1;
		this.field2674 = var2;
		this.field2675 = var3;
		this.field2676 = var4;
		this.field2680 = var5;
		this.field2678 = Rasterizer3D.Rasterizer3D_sine[var4];
		this.field2679 = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.field2677 = Rasterizer3D.Rasterizer3D_sine[var5];
		this.field2681 = Rasterizer3D.Rasterizer3D_cosine[var5];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lju;IIIIJ)V"
	)
	void vmethod5146(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5198(var2, this.field2676, this.field2680, var3, var4, var5, this.field2673, this.field2674, this.field2675, var6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lkg;IIIB)V",
		garbageValue = "30"
	)
	void vmethod5147(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = (var4 << 7) - this.field2673;
		int var8;
		int var9 = var8 = (var5 << 7) - this.field2675;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5] - this.field2674;
		int var15 = var1.tileHeights[var3][var4 + 1][var5] - this.field2674;
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.field2674;
		int var17 = var1.tileHeights[var3][var4][var5 + 1] - this.field2674;
		int var18 = var9 * this.field2677 + var7 * this.field2681 >> 16;
		var9 = var9 * this.field2681 - var7 * this.field2677 >> 16;
		var7 = var18;
		var18 = var14 * this.field2679 - var9 * this.field2678 >> 16;
		var9 = var9 * this.field2679 + var14 * this.field2678 >> 16;
		var14 = var18;
		if (var9 >= 50) {
			var18 = var11 * this.field2681 + var8 * this.field2677 >> 16;
			var8 = var8 * this.field2681 - var11 * this.field2677 >> 16;
			var11 = var18;
			var18 = var15 * this.field2679 - var8 * this.field2678 >> 16;
			var8 = var8 * this.field2679 + var15 * this.field2678 >> 16;
			var15 = var18;
			if (var8 >= 50) {
				var18 = var10 * this.field2681 + var13 * this.field2677 >> 16;
				var13 = var13 * this.field2681 - var10 * this.field2677 >> 16;
				var10 = var18;
				var18 = var16 * this.field2679 - var13 * this.field2678 >> 16;
				var13 = var16 * this.field2678 + var13 * this.field2679 >> 16;
				var16 = var18;
				if (var13 >= 50) {
					var18 = var6 * this.field2681 + var12 * this.field2677 >> 16;
					var12 = var12 * this.field2681 - var6 * this.field2677 >> 16;
					var6 = var18;
					var18 = var17 * this.field2679 - var12 * this.field2678 >> 16;
					var12 = var17 * this.field2678 + var12 * this.field2679 >> 16;
					if (var12 >= 50) {
						this.method5149(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lke;IIB)V",
		garbageValue = "14"
	)
	void vmethod5148(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6] - this.field2673;
			int var8 = var2.vertexY[var6] - this.field2674;
			int var9 = var2.vertexZ[var6] - this.field2675;
			int var10 = var9 * this.field2677 + var7 * this.field2681 >> 16;
			var9 = var9 * this.field2681 - var7 * this.field2677 >> 16;
			var7 = var10;
			var10 = var8 * this.field2679 - var9 * this.field2678 >> 16;
			var9 = var8 * this.field2678 + var9 * this.field2679 >> 16;
			if (var9 < 50) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.field2858[var6] = var7;
				SceneTileModel.field2859[var6] = var10;
				SceneTileModel.field2860[var6] = var9;
			}

			SceneTileModel.field2855[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2856[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2857[var6] = class175.method3578(var9);
		}

		this.method5158(var1, var2, var3, var4);
	}
}
