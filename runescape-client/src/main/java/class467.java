import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class467 {
	@ObfuscatedName("aj")
	static int[] field4802;
	@ObfuscatedName("ag")
	public static int[] field4797;
	@ObfuscatedName("bp")
	static Image field4803;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -568930795
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		field4802 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field4802[var0] = method8431(var0);
		}

		method8427();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "94"
	)
	static final int method8431(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D;
		double var3 = (double)(var0 >> 5 & 31) / 31.0D;
		double var5 = (double)(var0 & 31) / 31.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var7 + var9) / 2.0D;
		if (var7 != var9) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var9 == var5) {
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = 256.0D * var13;
		if (var18 < 0.0D) {
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995D) {
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D);
		return (int)(128.0D * var15) + (var20 << 7);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "176921584"
	)
	public static int method8426() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1544009428"
	)
	static void method8427() {
		if (field4797 == null) {
			field4797 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var7 * var5;
					}

					double var17 = 2.0D * var7 - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = var17 + 6.0D * (0.6666666666666666D - var19) * (var15 - var17);
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = 6.0D * (var15 - var17) * var23 + var17;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(var9 * 256.0D);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field4797[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "172911680"
	)
	public static int method8428(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	public static void method8434() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1878130101"
	)
	static int method8435(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4151(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4150(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field750.method4152(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)Z",
		garbageValue = "0"
	)
	static final boolean method8437(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6143(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6122(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6122(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
