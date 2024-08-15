import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -244562385
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1706385727
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ao")
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
				double var9 = (double)var7 / (double)var1 + 6.0D;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = 3.141592653589793D * ((double)var11 - var9);
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(65536.0D * var17 + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-18"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var7 * var8[var9];
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1735305768"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1028545603"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(DDIS)[D",
		garbageValue = "-4116"
	)
	public static double[] method1088(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class326.method6175((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2030676330"
	)
	public static int method1099(int var0) {
		return class497.field5035[var0 & 16383];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1405637639"
	)
	static final int method1084(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "0"
	)
	static final void method1096(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			boolean var2;
			int var3;
			int var4;
			ObjectComposition var5;
			if (var1.hitpoints == 0) {
				if (var1.objectId >= 0) {
					var3 = var1.objectId;
					var4 = var1.field1170;
					var5 = class222.getObjectDefinition(var3);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method5114(var4);
					if (!var2) {
						continue;
					}
				}

				class142.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1169, var1.field1170, var1.field1174);
				var1.remove();
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102) {
					if (var1.field1171 >= 0) {
						var3 = var1.field1171;
						var4 = var1.field1176;
						var5 = class222.getObjectDefinition(var3);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method5114(var4);
						if (!var2) {
							continue;
						}
					}

					class142.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1171, var1.field1172, var1.field1176, var1.field1174);
					var1.delay = -1;
					if (var1.objectId == var1.field1171 && var1.objectId == -1) {
						var1.remove();
					} else if (var1.objectId == var1.field1171 && var1.field1172 == var1.field1169 && var1.field1176 == var1.field1170) {
						var1.remove();
					}
				}
			}
		}

	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-501938286"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		SecureRandomCallable.method2373();
		if (HttpRequestTask.friendsChat != null) {
			HttpRequestTask.friendsChat.invalidateIgnoreds();
		}

	}
}
