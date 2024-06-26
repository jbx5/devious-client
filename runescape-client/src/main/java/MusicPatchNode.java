import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -729100137
	)
	int field3685;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	MusicPatchNode2 field3690;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1005303001
	)
	int field3679;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -868790673
	)
	int field3675;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -517826237
	)
	int field3681;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1043375921
	)
	int field3682;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 706498263
	)
	int field3683;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2119889119
	)
	int field3684;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1724018517
	)
	int field3678;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -348267781
	)
	int field3689;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1147391719
	)
	int field3686;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1168553427
	)
	int field3694;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -156080559
	)
	int field3680;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -271653801
	)
	int field3688;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1558729485
	)
	int field3687;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1991784073
	)
	int field3692;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1146890015
	)
	int field3691;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1037298513
	)
	int field3695;

	MusicPatchNode() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-330147749"
	)
	void method6423() {
		this.table = null;
		this.rawSound = null;
		this.field3690 = null;
		this.stream = null;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2143422785"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class511.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = 0L != var6;
			if (var13) {
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var20 = class196.sceneMinimapSprite.pixels;
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class229.Entity_unpackID(var6);
			ObjectComposition var16 = HttpRequest.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = class418.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 1) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var20[var27] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class229.Entity_unpackID(var6);
			ObjectComposition var21 = HttpRequest.getObjectDefinition(var11);
			if (var21.mapSceneId != -1) {
				IndexedSprite var29 = class418.mapSceneSprites[var21.mapSceneId];
				if (var29 != null) {
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2;
					var15 = (var21.sizeY * 4 - var29.subHeight) / 2;
					var29.drawAt(var1 * 4 + var27 + 48, (104 - var2 - var21.sizeY) * 4 + var15 + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var28 = 0L != var6;
				if (var28) {
					boolean var22 = (int)(var6 >>> 16 & 1L) == 1;
					var28 = !var22;
				}

				if (var28) {
					var26 = 15597568;
				}

				int[] var23 = class196.sceneMinimapSprite.pixels;
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var23[var30] = var26;
					var23[var30 + 1 + 512] = var26;
					var23[var30 + 1024 + 2] = var26;
					var23[var30 + 1536 + 3] = var26;
				} else {
					var23[var30 + 1536] = var26;
					var23[var30 + 1 + 1024] = var26;
					var23[var30 + 512 + 2] = var26;
					var23[var30 + 3] = var26;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (0L != var6) {
			var8 = class229.Entity_unpackID(var6);
			ObjectComposition var24 = HttpRequest.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = class418.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var12 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var11 + var1 * 4 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
