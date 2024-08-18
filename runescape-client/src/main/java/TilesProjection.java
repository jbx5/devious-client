import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("TilesProjection")
public class TilesProjection extends Projection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("ay")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	TilesProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;Lhv;IIII)V",
		garbageValue = "-347958206"
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
		this.transformationMatrix.transformPoint((float)var7, (float)var14, (float)var9, this.projection);
		var7 = (int)this.projection[0];
		var14 = (int)this.projection[1];
		var9 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var11, (float)var15, (float)var8, this.projection);
		var11 = (int)this.projection[0];
		var15 = (int)this.projection[1];
		var8 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var10, (float)var16, (float)var13, this.projection);
		var10 = (int)this.projection[0];
		var16 = (int)this.projection[1];
		var13 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var6, (float)var17, (float)var12, this.projection);
		var6 = (int)this.projection[0];
		var17 = (int)this.projection[1];
		var12 = (int)this.projection[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
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
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.transformationMatrix.transformPoint((float)var7, (float)var8, (float)var9, this.projection);
			var7 = (int)this.projection[0];
			var8 = (int)this.projection[1];
			var9 = (int)this.projection[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var8;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = NPC.method2815(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1141040"
	)
	static final boolean method4124(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1831454595"
	)
	static final void method4123() {
		class524.method9344(class394.field4556, class219.field2387, class426.field4703);
		JagNetThread.method7359(class276.field3004, TextureProvider.field2118);
		if (class433.cameraX == class394.field4556 && RestClientThreadFactory.cameraY == class219.field2387 && WorldMapSection0.cameraZ == class426.field4703 && UserComparator6.cameraPitch == class276.field3004 && class264.cameraYaw == TextureProvider.field2118) {
			Client.field765 = false;
			Client.isCameraLocked = false;
			Client.field759 = false;
			Client.field760 = false;
			class156.field1721 = 0;
			class222.field2417 = 0;
			Language.field4602 = 0;
			NPCComposition.field2613 = 0;
			Message.field461 = 0;
			FriendSystem.field827 = 0;
			LoginState.field500 = 0;
			class166.field1793 = 0;
			class329.field3545 = 0;
			Renderable.field2086 = 0;
			Client.field762 = null;
			Client.field615 = null;
			Client.field517 = null;
		}

	}
}
