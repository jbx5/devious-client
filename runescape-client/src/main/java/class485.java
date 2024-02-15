import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class485 {
	@ObfuscatedName("as")
	static int[] field4908;
	@ObfuscatedName("aa")
	public static int[] field4904;

	static {
		field4908 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field4908[var0] = method8807(var0);
		}

		if (field4904 == null) {
			field4904 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (var5 + 1.0D) * var7;
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

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = (var15 - var17) * 6.0D * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var28 = (int)(256.0D * var13);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field4904[var2] = var18 & 16777215;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "67"
	)
	static final int method8807(int var0) {
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
		if (var9 != var7) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var9 == var3) {
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = var13 * 256.0D;
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
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "43"
	)
	public static int method8809(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "100962176"
	)
	static void method8806() {
		if ((Client.worldProperties & class529.field5183.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			JagexCache.method4224(1);
			Message.method1182();
		} else if ((Client.worldProperties & class529.field5160.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class529.field5162.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			JagexCache.method4224(1);
			Message.method1182();
		} else if ((Client.worldProperties & class529.field5162.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			JagexCache.method4224(1);
			Message.method1182();
		} else {
			class148.Login_promptCredentials(false);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "28265915"
	)
	static final int method8808(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)Lts;",
		garbageValue = "115"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Tiles.worldMap;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class133.clear();
		Actor.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		Client.field737.method4394();
		System.gc();
		class169.method3521(0, 0);
		GrandExchangeOfferOwnWorldComparator.method1192();
		Client.playingJingle = false;
		InterfaceParent.method2350();
		Interpreter.updateGameState(10);
		VarbitComposition.method3830().method4265();
		VarbitComposition.method3830().method4266();
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldj;III)V",
		garbageValue = "-776891660"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = MilliClock.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1254 = 0;
			}

			if (var3 == 2) {
				var0.field1254 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || MilliClock.SequenceDefinition_get(var1).field2266 >= MilliClock.SequenceDefinition_get(var0.sequence).field2266) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1254 = 0;
			var0.field1280 = var0.pathLength;
		}

	}
}
