import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aq")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("aw")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -611988791
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ao")
	static int[][] field1049;
	@ObfuscatedName("ax")
	static int[][][] field1050;
	@ObfuscatedName("ad")
	static final int[] field1060;
	@ObfuscatedName("at")
	static final int[] field1056;
	@ObfuscatedName("ay")
	static final int[] field1053;
	@ObfuscatedName("ae")
	static final int[] field1054;
	@ObfuscatedName("ac")
	static final int[] field1055;
	@ObfuscatedName("ab")
	static final int[] field1046;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -514495155
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -51634815
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1060 = new int[]{1, 2, 4, 8};
		field1056 = new int[]{16, 32, 64, 128};
		field1053 = new int[]{1, 0, -1, 0};
		field1054 = new int[]{0, -1, 0, 1};
		field1055 = new int[]{1, -1, -1, 1};
		field1046 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILkq;[Liz;)V"
	)
	static final void method2285(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
					ObjectComposition var21 = class127.getObjectDefinition(var11);
					int var22 = var2 + class190.method3772(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var25 = var16 & 7;
					int var26 = var15 & 7;
					int var28 = var21.sizeX;
					int var29 = var21.sizeY;
					int var30;
					if ((var20 & 1) == 1) {
						var30 = var28;
						var28 = var29;
						var29 = var30;
					}

					int var27 = var7 & 3;
					int var24;
					if (var27 == 0) {
						var24 = var26;
					} else if (var27 == 1) {
						var24 = 7 - var25 - (var28 - 1);
					} else if (var27 == 2) {
						var24 = 7 - var26 - (var29 - 1);
					} else {
						var24 = var25;
					}

					var30 = var24 + var3;
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						ItemComposition.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}
}
