import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ur")
	@ObfuscatedSignature(descriptor = 
	"Lbw;")

	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(descriptor = 
	"Lny;")

	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(intValue = 
	1220605689)

	static int field397;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1215193119)

	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-871732017)

	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("n")
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
				double var9 = (((double) (var7)) / ((double) (var1))) + 6.0;
				int var11 = ((int) (Math.floor(1.0 + (var9 - 7.0))));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = ((int) (Math.ceil(var9 + 7.0)));
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = ((double) (var2)) / ((double) (var1)); var11 < var12; ++var11) {
					double var15 = 3.141592653589793 * (((double) (var11)) - var9);
					double var17 = var13;
					if ((var15 < (-1.0E-4)) || (var15 > 1.0E-4)) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54 + (0.46 * Math.cos(0.2243994752564138 * (((double) (var11)) - var9)));
					var8[var11] = ((int) (Math.floor(0.5 + (65536.0 * var17))));
				}
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BI)[B", garbageValue = 
	"-84367819")

	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = ((int) ((((long) (var1.length)) * ((long) (this.outputRate))) / ((long) (this.inputRate)))) + 14;
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
				int var10 = (var3[var6] + 32768) >> 16;
				if (var10 < (-128)) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = ((byte) (var10));
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"25")

	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = ((int) ((((long) (var1)) * ((long) (this.outputRate))) / ((long) (this.inputRate))));
		}

		return var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"1943827297")

	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = ((int) ((((long) (this.outputRate)) * ((long) (var1))) / ((long) (this.inputRate)))) + 6;
		}

		return var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-13")

	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class127.client.method520();
			}

			if ((((var0 == 20) || (var0 == 40)) || (var0 == 45)) || (var0 == 50)) {
				ModeWhere.method6099(0);
				Client.field528 = 0;
				Client.field661 = 0;
				Client.timer.method6563(var0);
				if (var0 != 20) {
					class302.method5766(false);
				}
			}

			if (((var0 != 20) && (var0 != 40)) && (ModeWhere.field4073 != null)) {
				ModeWhere.field4073.close();
				ModeWhere.field4073 = null;
			}

			if (Client.gameState == 25) {
				Client.field560 = 0;
				Client.field747 = 0;
				Client.field608 = 1;
				Client.field558 = 0;
				Client.field758 = 1;
			}

			int var1;
			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20) {
					var1 = (Client.gameState == 11) ? 4 : 0;
					class144.method3080(JagexCache.archive10, class145.archive8, false, var1);
				} else if (var0 == 11) {
					class144.method3080(JagexCache.archive10, class145.archive8, false, 4);
				} else if (var0 == 50) {
					class4.setLoginResponseString("", "Updating date of birth...", "");
					class144.method3080(JagexCache.archive10, class145.archive8, false, 7);
				} else {
					WorldMapSprite.method4351();
				}
			} else {
				var1 = (BufferedSource.method6889()) ? 0 : 12;
				class144.method3080(JagexCache.archive10, class145.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}