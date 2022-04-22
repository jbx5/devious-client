import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("v")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("c")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1996311103)

	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("f")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("s")
	static byte[][][] field983;
	@ObfuscatedName("q")
	static int[][] field998;
	@ObfuscatedName("p")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("g")
	static final int[] field990;
	@ObfuscatedName("x")
	static final int[] field989;
	@ObfuscatedName("a")
	static final int[] field992;
	@ObfuscatedName("y")
	static final int[] field993;
	@ObfuscatedName("j")
	static final int[] field997;
	@ObfuscatedName("e")
	static final int[] field995;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	1326469755)

	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1535844851)

	@Export("rndLightness")
	static int rndLightness;
	static 
	{
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field990 = new int[]{ 1, 2, 4, 8 };
		field989 = new int[]{ 16, 32, 64, 128 };
		field992 = new int[]{ 1, 0, -1, 0 };
		field993 = new int[]{ 0, -1, 0, 1 };
		field997 = new int[]{ 1, -1, -1, 1 };
		field995 = new int[]{ -1, -1, 1, 1 };
		rndHue = ((int) (Math.random() * 17.0)) - 8;
		rndLightness = ((int) (Math.random() * 33.0)) - 16;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"([BIIIIIIILhv;[Lgv;)V")

	static final void method2015(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
				int var16 = (var13 >> 6) & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (((((var17 == var4) && (var16 >= var5)) && (var16 < (var5 + 8))) && (var15 >= var6)) && (var15 < (var6 + 8))) {
					ObjectComposition var21 = class146.getObjectDefinition(var11);
					int var22 = var2 + StructComposition.method3611(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + class394.method7141(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if ((((var22 > 0) && (var23 > 0)) && (var22 < 103)) && (var23 < 103)) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}

						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}

						WorldMapElement.addObjects(var1, var22, var23, var11, (var20 + var7) & 3, var19, var8, var25);
					}
				}
			} 
		} 
	}
}