import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -213423439
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("aw")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ak")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("aj")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ai")
	static byte[][][] field1037;
	@ObfuscatedName("ay")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("as")
	static int[][] field1039;
	@ObfuscatedName("ae")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("am")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("an")
	static int[] field1042;
	@ObfuscatedName("az")
	static final int[] field1043;
	@ObfuscatedName("ag")
	static final int[] field1044;
	@ObfuscatedName("ad")
	static final int[] field1045;
	@ObfuscatedName("ac")
	static final int[] field1033;
	@ObfuscatedName("av")
	static final int[] field1035;
	@ObfuscatedName("ax")
	static final int[] field1047;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1620838953
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -53243575
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_minPlane = 99;
		field1043 = new int[]{1, 2, 4, 8};
		field1044 = new int[]{16, 32, 64, 128};
		field1045 = new int[]{1, 0, -1, 0};
		field1033 = new int[]{0, -1, 0, 1};
		field1035 = new int[]{1, -1, -1, 1};
		field1047 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-3"
	)
	static String method2519(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1374973643"
	)
	public static int method2520(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[BIIIIIII)V"
	)
	static final void method2515(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
					ObjectComposition var20 = UrlRequest.getObjectDefinition(var10);
					int var23 = var15 & 7;
					int var24 = var14 & 7;
					int var26 = var20.sizeX;
					int var27 = var20.sizeY;
					int var28;
					if ((var19 & 1) == 1) {
						var28 = var26;
						var26 = var27;
						var27 = var28;
					}

					int var25 = var8 & 3;
					int var22;
					if (var25 == 0) {
						var22 = var23;
					} else if (var25 == 1) {
						var22 = var24;
					} else if (var25 == 2) {
						var22 = 7 - var23 - (var26 - 1);
					} else {
						var22 = 7 - var24 - (var27 - 1);
					}

					var28 = var22 + var3;
					int var31 = var15 & 7;
					int var32 = var14 & 7;
					int var34 = var20.sizeX;
					int var35 = var20.sizeY;
					int var36;
					if ((var19 & 1) == 1) {
						var36 = var34;
						var34 = var35;
						var35 = var36;
					}

					int var33 = var8 & 3;
					int var30;
					if (var33 == 0) {
						var30 = var32;
					} else if (var33 == 1) {
						var30 = 7 - var31 - (var34 - 1);
					} else if (var33 == 2) {
						var30 = 7 - var32 - (var35 - 1);
					} else {
						var30 = var31;
					}

					var36 = var4 + var30;
					if (var28 > 0 && var36 > 0 && var28 < var0.sizeX - 1 && var36 < var0.sizeY - 1) {
						int var37 = var2;
						if ((var0.tileSettings[1][var28][var36] & 2) == 2) {
							var37 = var2 - 1;
						}

						CollisionMap var38 = null;
						if (var37 >= 0 && var0.collisionMaps != null) {
							var38 = var0.collisionMaps[var37];
						}

						UrlRequest.addObjects(var0, var2, var28, var36, var10, var19 + var8 & 3, var18, var38);
					}
				}
			}
		}
	}
}
