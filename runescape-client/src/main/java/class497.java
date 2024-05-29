import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class497 {
	@ObfuscatedName("aa")
	static int[] field5036;
	@ObfuscatedName("at")
	public static int[] field5035;

	static {
		field5036 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5036[var0] = method8978(var0);
		}

		method8980();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1181172717"
	)
	static final int method8978(int var0) {
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
		double var15 = (var9 + var7) / 2.0D;
		if (var7 != var9) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
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

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8));
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "274939767"
	)
	static void method8980() {
		if (field5035 == null) {
			field5035 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = 2.0D * var7 - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + 6.0D * (var15 - var17) * var19;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = var17 + 6.0D * (0.6666666666666666D - var19) * (var15 - var17);
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + 6.0D * (var15 - var17) * var3;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = 6.0D * (var15 - var17) * (0.6666666666666666D - var3) + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var17 + (0.6666666666666666D - var23) * (var15 - var17) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(var9 * 256.0D);
				int var16 = (int)(var11 * 256.0D);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5035[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-400349041"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "117"
	)
	public static int method8983(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-108075379"
	)
	static void method8985() {
		for (int var0 = 0; var0 < Client.field824.size(); ++var0) {
			int var2 = (Integer)Client.field824.get(var0);
			class141 var3 = HealthBar.method2651(var2);
			int var1;
			if (var3 == null) {
				var1 = 2;
			} else {
				var1 = var3.method3149() ? 0 : 1;
			}

			if (var1 != 2) {
				Client.field824.remove(var0);
				--var0;
			}
		}

	}
}
