import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1480797351
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -500041463
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1967185107
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -755510793
	)
	@Export("yawSin")
	int yawSin;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -66116791
	)
	@Export("pitchSin")
	int pitchSin;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1315228097
	)
	@Export("pitchCos")
	int pitchCos;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 932738049
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -691441337
	)
	int field1955;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1497222905
	)
	@Export("cameraYaw")
	int cameraYaw;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 793068403
	)
	int field1952;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1217196279
	)
	@Export("yawCos")
	int yawCos;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.yawSin = var4;
		this.pitchSin = var5;
		this.pitchCos = Rasterizer3D.Rasterizer3D_sine[var4];
		this.cameraPitch = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.field1955 = Rasterizer3D.Rasterizer3D_sine[var5];
		this.cameraYaw = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.field1952 = var6;
		this.yawCos = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod4224(var2, this.yawSin, this.pitchSin, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field1952, this.yawCos, false);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;Lhv;IIII)V",
		garbageValue = "-347958206"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = (var4 << 7) - this.cameraX;
		int var8;
		int var9 = var8 = (var5 << 7) - this.cameraZ;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5] - this.cameraY;
		int var15 = var1.tileHeights[var3][var4 + 1][var5] - this.cameraY;
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY;
		int var17 = var1.tileHeights[var3][var4][var5 + 1] - this.cameraY;
		int var18 = var9 * this.field1955 + var7 * this.cameraYaw >> 16;
		var9 = var9 * this.cameraYaw - var7 * this.field1955 >> 16;
		var7 = var18;
		var18 = var14 * this.cameraPitch - var9 * this.pitchCos >> 16;
		var9 = var9 * this.cameraPitch + var14 * this.pitchCos >> 16;
		var14 = var18;
		if (var9 >= 50) {
			var18 = var11 * this.cameraYaw + var8 * this.field1955 >> 16;
			var8 = var8 * this.cameraYaw - var11 * this.field1955 >> 16;
			var11 = var18;
			var18 = var15 * this.cameraPitch - var8 * this.pitchCos >> 16;
			var8 = var8 * this.cameraPitch + var15 * this.pitchCos >> 16;
			var15 = var18;
			if (var8 >= 50) {
				var18 = var13 * this.field1955 + var10 * this.cameraYaw >> 16;
				var13 = var13 * this.cameraYaw - var10 * this.field1955 >> 16;
				var10 = var18;
				var18 = var16 * this.cameraPitch - var13 * this.pitchCos >> 16;
				var13 = var16 * this.pitchCos + var13 * this.cameraPitch >> 16;
				var16 = var18;
				if (var13 >= 50) {
					var18 = var12 * this.field1955 + var6 * this.cameraYaw >> 16;
					var12 = var12 * this.cameraYaw - var6 * this.field1955 >> 16;
					var6 = var18;
					var18 = var17 * this.cameraPitch - var12 * this.pitchCos >> 16;
					var12 = var12 * this.cameraPitch + var17 * this.pitchCos >> 16;
					if (var12 >= 50) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhf;Lhc;III)V",
		garbageValue = "2088156522"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6] - this.cameraX;
			int var8 = var2.vertexY[var6] - this.cameraY;
			int var9 = var2.vertexZ[var6] - this.cameraZ;
			int var10 = var7 * this.cameraYaw + var9 * this.field1955 >> 16;
			var9 = var9 * this.cameraYaw - var7 * this.field1955 >> 16;
			var7 = var10;
			var10 = var8 * this.cameraPitch - var9 * this.pitchCos >> 16;
			var9 = var9 * this.cameraPitch + var8 * this.pitchCos >> 16;
			if (var9 < 50) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var10;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = NPC.method2815(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ab")
	public static final int method3823(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var14 + 6.0D * (var12 - var14) * var20;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1090065310"
	)
	static void method3820() {
		Script.Script_cached.clear();
	}
}
