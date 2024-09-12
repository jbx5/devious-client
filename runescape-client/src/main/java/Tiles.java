import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 63843725
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ax")
	static byte[][][] field1065;
	@ObfuscatedName("ar")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ad")
	static int[] field1056;
	@ObfuscatedName("aa")
	static final int[] field1057;
	@ObfuscatedName("ai")
	static final int[] field1058;
	@ObfuscatedName("ao")
	static final int[] field1061;
	@ObfuscatedName("as")
	static final int[] field1060;
	@ObfuscatedName("ay")
	static final int[] field1063;
	@ObfuscatedName("aj")
	static final int[] field1062;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1617834989
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -921284069
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	static {
		Tiles_minPlane = 99;
		field1057 = new int[]{1, 2, 4, 8};
		field1058 = new int[]{16, 32, 64, 128};
		field1061 = new int[]{1, 0, -1, 0};
		field1060 = new int[]{0, -1, 0, 1};
		field1063 = new int[]{1, -1, -1, 1};
		field1062 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIIIII)V"
	)
	static final void method2422(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
					ObjectComposition var20 = class273.getObjectDefinition(var10);
					int var21 = var3 + FloorDecoration.method4710(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					int var22 = var4 + class289.method6083(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					if (var21 > 0 && var22 > 0 && var21 < var0.sizeX - 1 && var22 < var0.sizeY - 1) {
						int var23 = var2;
						if ((var0.tileSettings[1][var21][var22] & 2) == 2) {
							var23 = var2 - 1;
						}

						CollisionMap var24 = null;
						if (var23 >= 0 && var0.collisionMaps != null) {
							var24 = var0.collisionMaps[var23];
						}

						class373.addObjects(var0, var2, var21, var22, var10, var19 + var8 & 3, var18, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lny;I[B[BI)V",
		garbageValue = "-339220276"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3928 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3928 = new byte[11][];
			var0.field3929 = new byte[11][];
			var0.field3931 = new int[11];
			var0.field3997 = new int[11];
		}

		var0.field3928[var1] = var2;
		if (var2 != null) {
			var0.field3852 = true;
		} else {
			var0.field3852 = false;

			for (int var4 = 0; var4 < var0.field3928.length; ++var4) {
				if (var0.field3928[var4] != null) {
					var0.field3852 = true;
					break;
				}
			}
		}

		var0.field3929[var1] = var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "912619882"
	)
	static int method2458(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field890 - 7.0D) * 256.0D);
	}
}
