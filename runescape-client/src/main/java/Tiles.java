import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bj")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("s")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights = new int[4][105][105];

	@ObfuscatedName("h")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags = new byte[4][104][104];

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -625386397)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane = 99;

	@ObfuscatedName("v")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;

	@ObfuscatedName("c")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;

	@ObfuscatedName("k")
	static byte[][][] field975;

	@ObfuscatedName("p")
	static final int[] field977 = new int[]{ 1, 2, 4, 8 };

	@ObfuscatedName("e")
	static final int[] field978 = new int[]{ 16, 32, 64, 128 };

	@ObfuscatedName("b")
	static final int[] field979 = new int[]{ 1, 0, -1, 0 };

	@ObfuscatedName("x")
	static final int[] field982 = new int[]{ 0, -1, 0, 1 };

	@ObfuscatedName("f")
	static final int[] field981 = new int[]{ 1, -1, -1, 1 };

	@ObfuscatedName("t")
	static final int[] field970 = new int[]{ -1, -1, 1, 1 };

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 565999891)
	@Export("rndHue")
	static int rndHue = ((int) (Math.random() * 17.0)) - 8;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -917550561)
	@Export("rndLightness")
	static int rndLightness = ((int) (Math.random() * 33.0)) - 16;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "-9992")
	static int method1973() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lls;III)[Lqn;", garbageValue = "-2043818816")
	public static SpritePixels[] method2024(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class457.SpriteBuffer_spriteCount];
			for (int var5 = 0; var5 < class457.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = class457.SpriteBuffer_spriteWidth;
				var6.height = class457.SpriteBuffer_spriteHeight;
				var6.xOffset = class457.SpriteBuffer_xOffsets[var5];
				var6.yOffset = InterfaceParent.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class457.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = SoundCache.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = class181.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];
				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = class457.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}
			class457.SpriteBuffer_xOffsets = null;
			InterfaceParent.SpriteBuffer_yOffsets = null;
			class457.SpriteBuffer_spriteWidths = null;
			SoundCache.SpriteBuffer_spriteHeights = null;
			class457.SpriteBuffer_spritePalette = null;
			class181.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "5")
	public static void method2022() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "([BIIIIIIILgy;[Lgl;)V")
	static final void method2011(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
					ObjectComposition var21 = FileSystem.getObjectDefinition(var11);
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
					var29 = var23 + var2;
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
					var37 = var31 + var3;
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
						int var38 = var1;
						if ((Tiles_renderFlags[1][var29][var37] & 2) == 2) {
							var38 = var1 - 1;
						}
						CollisionMap var39 = null;
						if (var38 >= 0) {
							var39 = var9[var38];
						}
						class347.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
					}
				}
			} 
		} 
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(descriptor = "(Lkn;B)Z", garbageValue = "3")
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}