import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1409837805
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ad")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ag")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("ak")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("aj")
	static int[][] field1039;
	@ObfuscatedName("av")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ab")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ae")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("al")
	static final int[] field1040;
	@ObfuscatedName("ay")
	static final int[] field1041;
	@ObfuscatedName("ao")
	static final int[] field1042;
	@ObfuscatedName("aa")
	static final int[] field1043;
	@ObfuscatedName("as")
	static final int[] field1032;
	@ObfuscatedName("aw")
	static final int[] field1045;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1581876365
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1640997177
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_minPlane = 99;
		field1040 = new int[]{1, 2, 4, 8};
		field1041 = new int[]{16, 32, 64, 128};
		field1042 = new int[]{1, 0, -1, 0};
		field1043 = new int[]{0, -1, 0, 1};
		field1032 = new int[]{1, -1, -1, 1};
		field1045 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "31168282"
	)
	public static void method2345(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class153.ByteArrayPool_alternativeSizes = var0;
			class450.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			HttpRequestTask.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class153.ByteArrayPool_alternativeSizes.length; ++var2) {
				HttpRequestTask.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4842.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4842);
		} else {
			class153.ByteArrayPool_alternativeSizes = null;
			class450.ByteArrayPool_altSizeArrayCounts = null;
			HttpRequestTask.ByteArrayPool_arrays = null;
			class323.method6110();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1582739656"
	)
	public static int method2340(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIIIII)V"
	)
	static final void method2287(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = HttpRequest.getObjectDefinition(var10);
					int var21 = var3 + Clock.method4344(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.sizeX;
					int var28 = var20.sizeY;
					int var29;
					if ((var19 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (var26 == 1) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (var26 == 2) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					var29 = var23 + var4;
					if (var21 > 0 && var29 > 0 && var21 < var0.sizeX - 1 && var29 < var0.sizeY - 1) {
						int var30 = var2;
						if ((var0.tileSettings[1][var21][var29] & 2) == 2) {
							var30 = var2 - 1;
						}

						CollisionMap var31 = null;
						if (var30 >= 0 && var0.collisionMaps != null) {
							var31 = var0.collisionMaps[var30];
						}

						KeyHandler.addObjects(var0, var2, var21, var29, var10, var19 + var8 & 3, var18, var31);
					}
				}
			}
		}
	}
}
