import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 1244909991
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1431280305
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1099588265
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -705159913
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1404845653
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 136535019
	)
	@Export("cameraYaw")
	int cameraYaw;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1611315841
	)
	@Export("pitchSin")
	int pitchSin;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -919142613
	)
	@Export("pitchCos")
	int pitchCos;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1173490183
	)
	@Export("yawSin")
	int yawSin;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -903591805
	)
	@Export("yawCos")
	int yawCos;

	IntProjection(int var1, int var2, int var3, int var4, int var5) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw = var5;
		this.pitchSin = Rasterizer3D.Rasterizer3D_sine[var4];
		this.pitchCos = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.yawSin = Rasterizer3D.Rasterizer3D_sine[var5];
		this.yawCos = Rasterizer3D.Rasterizer3D_cosine[var5];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5778(var2, this.cameraPitch, this.cameraYaw, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIII)V",
		garbageValue = "1938115394"
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
		int var18 = var9 * this.yawSin + var7 * this.yawCos >> 16;
		var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
		var7 = var18;
		var18 = var14 * this.pitchCos - var9 * this.pitchSin >> 16;
		var9 = var14 * this.pitchSin + var9 * this.pitchCos >> 16;
		var14 = var18;
		if (var9 >= 50) {
			var18 = var11 * this.yawCos + var8 * this.yawSin >> 16;
			var8 = var8 * this.yawCos - var11 * this.yawSin >> 16;
			var11 = var18;
			var18 = var15 * this.pitchCos - var8 * this.pitchSin >> 16;
			var8 = var15 * this.pitchSin + var8 * this.pitchCos >> 16;
			var15 = var18;
			if (var8 >= 50) {
				var18 = var13 * this.yawSin + var10 * this.yawCos >> 16;
				var13 = var13 * this.yawCos - var10 * this.yawSin >> 16;
				var10 = var18;
				var18 = var16 * this.pitchCos - var13 * this.pitchSin >> 16;
				var13 = var13 * this.pitchCos + var16 * this.pitchSin >> 16;
				var16 = var18;
				if (var13 >= 50) {
					var18 = var6 * this.yawCos + var12 * this.yawSin >> 16;
					var12 = var12 * this.yawCos - var6 * this.yawSin >> 16;
					var6 = var18;
					var18 = var17 * this.pitchCos - var12 * this.pitchSin >> 16;
					var12 = var12 * this.pitchCos + var17 * this.pitchSin >> 16;
					if (var12 >= 50) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;IIB)V",
		garbageValue = "112"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6] - this.cameraX;
			int var8 = var2.vertexY[var6] - this.cameraY;
			int var9 = var2.vertexZ[var6] - this.cameraZ;
			int var10 = var9 * this.yawSin + var7 * this.yawCos >> 16;
			var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
			var7 = var10;
			var10 = var8 * this.pitchCos - var9 * this.pitchSin >> 16;
			var9 = var8 * this.pitchSin + var9 * this.pitchCos >> 16;
			if (var9 < 50) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.field3063[var6] = var7;
				SceneTileModel.field3075[var6] = var10;
				SceneTileModel.field3076[var6] = var9;
			}

			SceneTileModel.field3065[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field3073[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field3072[var6] = class386.method7177(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "448213075"
	)
	static void method5336(String var0) {
		Login.displayName = class175.method3562(var0);
	}
}
