import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("sy")
	@ObfuscatedGetter(intValue = 
	1069541605)

	static int field996;
	@ObfuscatedName("v")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("o")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-367367905)

	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("g")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("l")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("n")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("j")
	static int[] field986;
	@ObfuscatedName("a")
	static final int[] field988;
	@ObfuscatedName("m")
	static final int[] field989;
	@ObfuscatedName("q")
	static final int[] field990;
	@ObfuscatedName("y")
	static final int[] field991;
	@ObfuscatedName("z")
	static final int[] field1000;
	@ObfuscatedName("e")
	static final int[] field993;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	468499867)

	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-2107967973)

	@Export("rndLightness")
	static int rndLightness;
	static 
	{
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field988 = new int[]{ 1, 2, 4, 8 };
		field989 = new int[]{ 16, 32, 64, 128 };
		field990 = new int[]{ 1, 0, -1, 0 };
		field991 = new int[]{ 0, -1, 0, 1 };
		field1000 = new int[]{ 1, -1, -1, 1 };
		field993 = new int[]{ -1, -1, 1, 1 };
		rndHue = ((int) (Math.random() * 17.0)) - 8;
		rndLightness = ((int) (Math.random() * 33.0)) - 16;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Lba;", garbageValue = 
	"0")

	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var2.getMessage(var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"([BIIIIIIILgs;[Lgf;)V")

	static final void method2006(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
					ObjectComposition var21 = class116.getObjectDefinition(var11);
					int var22 = var2 + class162.method3273(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + Clock.method3322(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if ((((var22 > 0) && (var23 > 0)) && (var22 < 103)) && (var23 < 103)) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}

						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}

						WorldMapIcon_1.method4556(var1, var22, var23, var11, (var20 + var7) & 3, var19, var8, var25);
					}
				}
			} 
		} 
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-373872413")

	static final void method2040(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != Interpreter.clientPreferences.method2288()) {
			if ((Interpreter.clientPreferences.method2288() == 0) && (Client.currentTrackGroupId != (-1))) {
				WorldMapSection2.method4561(ArchiveLoader.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field731 = false;
			} else if (var0 == 0) {
				WorldMapEvent.midiPcmStream.clear();
				class273.musicPlayerStatus = 1;
				class147.musicTrackArchive = null;
				Client.field731 = false;
			} else if (class273.musicPlayerStatus != 0) {
				DevicePcmPlayerProvider.musicTrackVolume = var0;
			} else {
				WorldMapEvent.midiPcmStream.setPcmStreamVolume(var0);
			}

			Interpreter.clientPreferences.method2326(var0);
		}

	}
}