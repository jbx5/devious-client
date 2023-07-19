import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("aw")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ay")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1474653259
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("am")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("as")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("at")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ad")
	static final int[] field1027;
	@ObfuscatedName("ao")
	static final int[] field1028;
	@ObfuscatedName("ac")
	static final int[] field1037;
	@ObfuscatedName("ak")
	static final int[] field1034;
	@ObfuscatedName("an")
	static final int[] field1031;
	@ObfuscatedName("af")
	static final int[] field1032;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -812024805
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1215375341
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1027 = new int[]{1, 2, 4, 8};
		field1028 = new int[]{16, 32, 64, 128};
		field1037 = new int[]{1, 0, -1, 0};
		field1034 = new int[]{0, -1, 0, 1};
		field1031 = new int[]{1, -1, -1, 1};
		field1032 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnr;",
		garbageValue = "57"
	)
	public static class353[] method2247() {
		return new class353[]{class353.field4209, class353.field4213, class353.field4210, class353.field4211};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiz;[Lij;)V"
	)
	static final void method2192(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
					ObjectComposition var21 = class90.getObjectDefinition(var11);
					int var22 = var2 + GameObject.method5072(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + World.method1861(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}

						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}

						PendingSpawn.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
					}
				}
			}
		}
	}
}
