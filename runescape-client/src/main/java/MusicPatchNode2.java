import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("aw")
	byte[] field3381;
	@ObfuscatedName("ay")
	byte[] field3380;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1230818135
	)
	int field3382;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1609820909
	)
	int field3383;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 985281229
	)
	int field3385;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1653378025
	)
	int field3391;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1512198365
	)
	int field3386;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 22675099
	)
	int field3387;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 547658641
	)
	int field3388;

	MusicPatchNode2() {
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-19"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = UserComparator5.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (0L != var5) {
			var7 = UserComparator5.scene.getObjectFlags(var0, var1, var2, var5);
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

			int[] var19 = Frames.sceneMinimapSprite.pixels;
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = class458.Entity_unpackID(var5);
			ObjectComposition var15 = class90.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class282.mapSceneSprites[var15.mapSceneId];
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

		var5 = UserComparator5.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = UserComparator5.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class458.Entity_unpackID(var5);
			ObjectComposition var20 = class90.getObjectDefinition(var10);
			if (var20.mapSceneId != -1) {
				IndexedSprite var28 = class282.mapSceneSprites[var20.mapSceneId];
				if (var28 != null) {
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2;
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2;
					var28.drawAt(var26 + var1 * 4 + 48, var14 + (104 - var2 - var20.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				int var25 = 15658734;
				boolean var27 = var5 != 0L;
				if (var27) {
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1;
					var27 = !var21;
				}

				if (var27) {
					var25 = 15597568;
				}

				int[] var22 = Frames.sceneMinimapSprite.pixels;
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

		var5 = UserComparator5.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class458.Entity_unpackID(var5);
			ObjectComposition var23 = class90.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = class282.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var1 * 4 + var10 + 48, var11 + (104 - var2 - var23.sizeY) * 4 + 48);
				}
			}
		}

	}
}
