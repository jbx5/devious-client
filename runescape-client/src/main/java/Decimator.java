import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1829904369
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1857281025
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("w")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = 6.0D + (double)var7 / (double)var1; // L: 39
				int var11 = (int)Math.floor(var9 - 7.0D + 1.0D); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "849766572"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "198"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-709095343"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lcz;",
		garbageValue = "-26006"
	)
	static ClientPreferences method1102() {
		AccessFile var0 = null; // L: 112
		ClientPreferences var1 = new ClientPreferences(); // L: 113

		try {
			var0 = SceneTilePaint.getPreferencesFile("", class153.field1729.name, false); // L: 115
			byte[] var2 = new byte[(int)var0.length()]; // L: 116

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 117 118 121
				var4 = var0.read(var2, var3, var2.length - var3); // L: 119
				if (var4 == -1) {
					throw new IOException(); // L: 120
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 123
		} catch (Exception var6) { // L: 125
		}

		try {
			if (var0 != null) { // L: 127
				var0.close();
			}
		} catch (Exception var5) { // L: 129
		}

		return var1; // L: 130
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "67"
	)
	static final void method1104(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					SoundCache.field328[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2002052932"
	)
	public static boolean method1091() {
		return Client.staffModLevel >= 2; // L: 12135
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpb;",
		garbageValue = "-3"
	)
	static class438 method1103(int var0) {
		class438 var1 = (class438)Client.DBTableMasterIndex_cache.get((long)var0); // L: 12210
		if (var1 == null) { // L: 12211
			var1 = new class438(PcmPlayer.field308, var0); // L: 12212
		}

		return var1; // L: 12214
	}
}
