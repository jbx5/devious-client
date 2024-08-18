import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class class499 {
	@ObfuscatedName("ao")
	static int[] field5059;
	@ObfuscatedName("am")
	public static int[] field5055;
	@ObfuscatedName("aj")
	public static short[] field5063;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1534686219
	)
	static int field5058;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1580839317
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		field5059 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			int[] var1 = field5059;
			double var4 = (double)(var0 >> 10 & 31) / 31.0D;
			double var6 = (double)(var0 >> 5 & 31) / 31.0D;
			double var8 = (double)(var0 & 31) / 31.0D;
			double var10 = var4;
			if (var6 < var4) {
				var10 = var6;
			}

			if (var8 < var10) {
				var10 = var8;
			}

			double var12 = var4;
			if (var6 > var4) {
				var12 = var6;
			}

			if (var8 > var12) {
				var12 = var8;
			}

			double var14 = 0.0D;
			double var16 = 0.0D;
			double var18 = (var12 + var10) / 2.0D;
			if (var12 != var10) {
				if (var18 < 0.5D) {
					var16 = (var12 - var10) / (var10 + var12);
				}

				if (var18 >= 0.5D) {
					var16 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) {
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var12 == var6) {
					var14 = (var8 - var4) / (var12 - var10) + 2.0D;
				} else if (var8 == var12) {
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(256.0D * var14 / 6.0D);
			var20 &= 255;
			double var21 = 256.0D * var16;
			if (var21 < 0.0D) {
				var21 = 0.0D;
			} else if (var21 > 255.0D) {
				var21 = 255.0D;
			}

			if (var18 > 0.7D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.75D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.85D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.95D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.995D) {
				var18 = 0.995D;
			}

			int var23 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8));
			int var3 = (int)(128.0D * var18) + (var23 << 7);
			var1[var0] = var3;
		}

		method8945();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljc;",
		garbageValue = "-1300538736"
	)
	public static HitSplatDefinition method8944(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1869495011"
	)
	static void method8945() {
		if (field5055 == null) {
			field5055 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = var19 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = (0.6666666666666666D - var19) * (var15 - var17) * 6.0D + var17;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var3 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = 6.0D * (var15 - var17) * (0.6666666666666666D - var3) + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = (var15 - var17) * 6.0D * var23 + var17;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5055[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-517927726"
	)
	public static int method8946(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "1"
	)
	static int method8954(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator8.method3046() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "468537994"
	)
	static final void method8953(int var0) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
