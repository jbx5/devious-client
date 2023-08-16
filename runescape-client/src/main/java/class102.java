import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class102 {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static Bounds field1343;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -404137777
	)
	int field1347;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -184686117
	)
	int field1349;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 519228135
	)
	int field1344;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1506450929
	)
	int field1345;

	class102(int var1, int var2, int var3, int var4) {
		this.field1347 = var1;
		this.field1349 = var2;
		this.field1344 = var3;
		this.field1345 = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-92"
	)
	int method2658() {
		return this.field1347;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	int method2661() {
		return this.field1349;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-806640725"
	)
	int method2652() {
		return this.field1344;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1075721841"
	)
	int method2647() {
		return this.field1345;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-880794678"
	)
	static String method2663(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2114213929"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class130.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (0L != var5) {
			var7 = class130.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var12 = 0L != var5;
			if (var12) {
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1;
				var12 = !var13;
			}

			if (var12) {
				var10 = var4;
			}

			int[] var19 = AbstractUserComparator.sceneMinimapSprite.pixels;
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = InvDefinition.Entity_unpackID(var5);
			ObjectComposition var15 = WorldMapElement.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class299.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 1) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var19[var26] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class130.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class130.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = InvDefinition.Entity_unpackID(var5);
			ObjectComposition var20 = WorldMapElement.getObjectDefinition(var10);
			if (var20.mapSceneId != -1) {
				IndexedSprite var28 = class299.mapSceneSprites[var20.mapSceneId];
				if (var28 != null) {
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2;
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2;
					var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48);
				}
			} else if (var9 == 9) {
				int var25 = 15658734;
				boolean var27 = 0L != var5;
				if (var27) {
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1;
					var27 = !var21;
				}

				if (var27) {
					var25 = 15597568;
				}

				int[] var22 = AbstractUserComparator.sceneMinimapSprite.pixels;
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var22[var29] = var25;
					var22[var29 + 1 + 512] = var25;
					var22[var29 + 1024 + 2] = var25;
					var22[var29 + 1536 + 3] = var25;
				} else {
					var22[var29 + 1536] = var25;
					var22[var29 + 1 + 1024] = var25;
					var22[var29 + 512 + 2] = var25;
					var22[var29 + 3] = var25;
				}
			}
		}

		var5 = class130.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = InvDefinition.Entity_unpackID(var5);
			ObjectComposition var23 = WorldMapElement.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = class299.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48);
				}
			}
		}

	}
}
