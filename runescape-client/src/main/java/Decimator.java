import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1949191081
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1558579081
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 793602059
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("as")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = UserList.method8427(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = 6.0D + (double)var4 / (double)var1;
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = 3.141592653589793D * ((double)var8 - var6);
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "21"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1434711410"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1390182066"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-717284719"
	)
	public static boolean method1103(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "747088777"
	)
	public static int method1107(int var0, int var1, int var2) {
		int var3 = class315.method6060(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-76245267"
	)
	static final int method1104(int var0, int var1) {
		int var2 = class210.method4166(var0 - 1, var1 - 1) + class210.method4166(var0 + 1, var1 - 1) + class210.method4166(var0 - 1, 1 + var1) + class210.method4166(var0 + 1, 1 + var1);
		int var3 = class210.method4166(var0 - 1, var1) + class210.method4166(var0 + 1, var1) + class210.method4166(var0, var1 - 1) + class210.method4166(var0, 1 + var1);
		int var4 = class210.method4166(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method1096(int var0) {
		int[] var1 = KeyHandler.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
					Actor.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
					Actor.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		KeyHandler.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
					FloorOverlayDefinition.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
					FloorOverlayDefinition.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = Actor.scene.getFloorDecorationTag(class473.Client_plane, var5, var6);
				if (var7 != 0L) {
					int var9 = Message.Entity_unpackID(var7);
					int var10 = class127.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class139.WorldMapElement_get(var10).field1876) {
						Client.mapIcons[Client.mapIconCount] = class139.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		UserComparator8.rasterProvider.apply();
	}
}
