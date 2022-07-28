import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(descriptor = "Lbz;")
	@Export("decimator")
	static Decimator decimator;

	@ObfuscatedName("tm")
	@ObfuscatedGetter(intValue = 1636500941)
	static int field993;

	@ObfuscatedName("o")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights = new int[4][105][105];

	@ObfuscatedName("q")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags = new byte[4][104][104];

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2111723819)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane = 99;

	@ObfuscatedName("c")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;

	@ObfuscatedName("w")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;

	@ObfuscatedName("z")
	static byte[][][] field997;

	@ObfuscatedName("j")
	static byte[][][] field998;

	@ObfuscatedName("g")
	static int[] field999;

	@ObfuscatedName("k")
	static final int[] field1001 = new int[]{ 1, 2, 4, 8 };

	@ObfuscatedName("v")
	static final int[] field1002 = new int[]{ 16, 32, 64, 128 };

	@ObfuscatedName("t")
	static final int[] field1008 = new int[]{ 1, 0, -1, 0 };

	@ObfuscatedName("e")
	static final int[] field1009 = new int[]{ 0, -1, 0, 1 };

	@ObfuscatedName("s")
	static final int[] field1005 = new int[]{ 1, -1, -1, 1 };

	@ObfuscatedName("i")
	static final int[] field1006 = new int[]{ -1, -1, 1, 1 };

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 1980482979)
	@Export("rndHue")
	static int rndHue = ((int) (Math.random() * 17.0)) - 8;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -2038479341)
	@Export("rndLightness")
	static int rndLightness = ((int) (Math.random() * 33.0)) - 16;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IB)J", garbageValue = "11")
	public static long method2115(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "([BIIIIIIILgo;[Lgr;)V")
	static final void method2104(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
					ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var11);
					int var22 = var2 + WorldMapIcon_1.method4560(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + class141.method3060(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}
						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}
						class309.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
					}
				}
			} 
		} 
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Object;", garbageValue = "68")
	static Object method2116(int var0) {
		return class387.method6998(((class433) (class271.findEnumerated(class433.method7604(), var0))));
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(descriptor = "(Lcs;B)V", garbageValue = "35")
	static final void method2114(Actor var0) {
		int var1 = Math.max(1, var0.field1194 - Client.cycle);
		int var2 = var0.field1177 * 128 + var0.field1202 * 64;
		int var3 = var0.field1182 * 128 + var0.field1202 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1142 = 0;
		var0.orientation = var0.field1186;
	}
}