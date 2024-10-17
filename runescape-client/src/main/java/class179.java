import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class179 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lqt;",
		garbageValue = "36"
	)
	public static final class426 method3848(int var0, int var1, int var2, int var3) {
		float var4 = 1.0E-5F;
		class426 var5 = LoginState.method1296((float)var1, (float)var2, (float)var3);
		class426 var6 = LoginState.method1296(0.0F, (float)var0, 0.0F);
		class426 var7 = LoginState.method1296(0.0F, 1.0F, 0.0F);
		class426 var9 = ViewportMouse.field2897;
		float var8 = var7.method8176(var9);
		if (Math.abs(var8) < 1.0E-5F) {
			return null;
		} else {
			class426 var12;
			synchronized(class426.field4768) {
				if (class426.field4770 == 0) {
					var12 = new class426(var5);
				} else {
					class426.field4768[--class426.field4770].method8169(var5);
					var12 = class426.field4768[class426.field4770];
				}
			}

			var12.method8196(var6);
			float var15 = -TaskHandler.method4506(var7, var12) / var8;
			if (var15 < 0.0F) {
				return null;
			} else {
				var5.method8168();
				var6.method8168();
				var7.method8168();
				var12.method8168();
				return FaceNormal.method5263(var5, class389.method7606(ViewportMouse.field2897, var15));
			}
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-269169318"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class198.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class397.method7768(var6)) {
				var11 = var4;
			}

			int[] var12 = Decimator.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = class309.Entity_unpackID(var6);
			ObjectComposition var15 = UrlRequest.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class420.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class309.Entity_unpackID(var6);
			ObjectComposition var25 = UrlRequest.getObjectDefinition(var11);
			int var20;
			if (var25.mapSceneId != -1) {
				IndexedSprite var21 = class420.mapSceneSprites[var25.mapSceneId];
				if (var21 != null) {
					var14 = (var25.sizeX * 4 - var21.subWidth) / 2;
					var20 = (var25.sizeY * 4 - var21.subHeight) / 2;
					var21.drawAt(var1 * 4 + var14 + 48, var20 + (104 - var2 - var25.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class397.method7768(var6)) {
					var13 = 15597568;
				}

				int[] var19 = Decimator.sceneMinimapSprite.pixels;
				var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var19[var20] = var13;
					var19[var20 + 1 + 512] = var13;
					var19[var20 + 1024 + 2] = var13;
					var19[var20 + 1536 + 3] = var13;
				} else {
					var19[var20 + 1536] = var13;
					var19[var20 + 1 + 1024] = var13;
					var19[var20 + 512 + 2] = var13;
					var19[var20 + 3] = var13;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (0L != var6) {
			var8 = class309.Entity_unpackID(var6);
			ObjectComposition var22 = UrlRequest.getObjectDefinition(var8);
			if (var22.mapSceneId != -1) {
				IndexedSprite var23 = class420.mapSceneSprites[var22.mapSceneId];
				if (var23 != null) {
					var11 = (var22.sizeX * 4 - var23.subWidth) / 2;
					int var24 = (var22.sizeY * 4 - var23.subHeight) / 2;
					var23.drawAt(var11 + var1 * 4 + 48, (104 - var2 - var22.sizeY) * 4 + var24 + 48);
				}
			}
		}

	}
}
