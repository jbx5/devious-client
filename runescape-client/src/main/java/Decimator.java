import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bz")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("z")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 311382131)
	static int field402;

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = "Lgo;")
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1936990541)
	@Export("inputRate")
	int inputRate;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1967517615)
	@Export("outputRate")
	int outputRate;

	@ObfuscatedName("w")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}
			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			} 
			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];
			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = ((double) (var7)) / ((double) (var1)) + 6.0;
				int var11 = ((int) (Math.floor(1.0 + (var9 - 7.0))));
				if (var11 < 0) {
					var11 = 0;
				}
				int var12 = ((int) (Math.ceil(7.0 + var9)));
				if (var12 > 14) {
					var12 = 14;
				}
				for (double var13 = ((double) (var2)) / ((double) (var1)); var11 < var12; ++var11) {
					double var15 = (((double) (var11)) - var9) * Math.PI;
					double var17 = var13;
					if (var15 < -1.0E-4 || var15 > 1.0E-4) {
						var17 = var13 * (Math.sin(var15) / var15);
					}
					var17 *= 0.54 + 0.46 * Math.cos((((double) (var11)) - var9) * 0.2243994752564138);
					var8[var11] = ((int) (Math.floor(65536.0 * var17 + 0.5)));
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([BI)[B", garbageValue = "1799659334")
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = ((int) (((long) (this.outputRate)) * ((long) (var1.length)) / ((long) (this.inputRate)))) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			int var6;
			int var7;
			for (var6 = 0; var6 < var1.length; ++var6) {
				var7 = var1[var6];
				int[] var8 = this.table[var5];
				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var8[var9] * var7;
				}
				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}
			var1 = new byte[var2];
			for (var6 = 0; var6 < var2; ++var6) {
				var7 = var3[var6] + '耀' >> 16;
				if (var7 < -128) {
					var1[var6] = -128;
				} else if (var7 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = ((byte) (var7));
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-115513535")
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = ((int) (((long) (this.outputRate)) * ((long) (var1)) / ((long) (this.inputRate))));
		}
		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2109991761")
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = ((int) (((long) (this.outputRate)) * ((long) (var1)) / ((long) (this.inputRate)))) + 6;
		}
		return var1;
	}
}