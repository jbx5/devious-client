import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("am")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ap")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -47945815
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("aj")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("aq")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("aw")
	static int[][][] field1012;
	@ObfuscatedName("ay")
	static final int[] field1014;
	@ObfuscatedName("as")
	static final int[] field1015;
	@ObfuscatedName("ab")
	static final int[] field1018;
	@ObfuscatedName("ah")
	static final int[] field1017;
	@ObfuscatedName("ai")
	static final int[] field1010;
	@ObfuscatedName("ac")
	static final int[] field1007;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -605866805
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1897521151
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1014 = new int[]{1, 2, 4, 8};
		field1015 = new int[]{16, 32, 64, 128};
		field1018 = new int[]{1, 0, -1, 0};
		field1017 = new int[]{0, -1, 0, 1};
		field1010 = new int[]{1, -1, -1, 1};
		field1007 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILkn;[Lii;)V"
	)
	static final void method2274(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class137.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var32 = var16 & 7;
					int var33 = var15 & 7;
					int var35 = var21.sizeX;
					int var36 = var21.sizeY;
					int var37;
					if ((var20 & 1) == 1) {
						var37 = var35;
						var35 = var36;
						var36 = var37;
					}

					int var34 = var7 & 3;
					int var31;
					if (var34 == 0) {
						var31 = var33;
					} else if (var34 == 1) {
						var31 = 7 - var32 - (var35 - 1);
					} else if (var34 == 2) {
						var31 = 7 - var33 - (var36 - 1);
					} else {
						var31 = var32;
					}

					var37 = var3 + var31;
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
						int var38 = var1;
						if ((Tiles_renderFlags[1][var29][var37] & 2) == 2) {
							var38 = var1 - 1;
						}

						CollisionMap var39 = null;
						if (var38 >= 0) {
							var39 = var9[var38];
						}

						class59.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
					}
				}
			}
		}
	}
}
