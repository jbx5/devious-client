import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class498 {
	@ObfuscatedName("an")
	static int[] field5067;
	@ObfuscatedName("aj")
	public static int[] field5064;
	@ObfuscatedName("bn")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field5069;

	static {
		field5067 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5067[var0] = method8889(var0);
		}

		if (field5064 == null) {
			field5064 = new int[65536];
			double var25 = 0.949999988079071D;

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
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
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
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + var3 * 6.0D * (var15 - var17);
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var3);
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var23 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(256.0D * var9);
				int var16 = (int)(var11 * 256.0D);
				int var28 = (int)(256.0D * var13);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field5064[var2] = var18 & 16777215;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1046258857"
	)
	static final int method8889(int var0) {
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
				var13 = (var9 - var7) / (var7 + var9);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
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

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8));
		return (int)(128.0D * var15) + (var20 << 7);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-441009304"
	)
	public static int method8893(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "366528255"
	)
	static class137 method8898(int var0) {
		class137[] var1 = new class137[]{class137.field1622, class137.field1621, class137.field1614, class137.field1634, class137.field1616, class137.field1617, class137.field1618, class137.field1619, class137.field1613, class137.field1631, class137.field1615, class137.field1623, class137.field1624, class137.field1625, class137.field1626, class137.field1627, class137.field1628};
		class137 var2 = (class137)class210.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class137.field1622;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "4095"
	)
	static final void method8897(String var0) {
		AbstractWorldMapIcon.method5076("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-1173020279"
	)
	static void method8899(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class137.method3187(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class330.field3585.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class330.field3585.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class105.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(class199.archive6, (Integer)var0.get(var8), 0, class105.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class157.method3343(var9, var1, var2, var3, var4);
					} else {
						FontName.method9220(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	static final void method8901() {
		for (PendingSpawn var0 = (PendingSpawn)class511.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class511.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class137.method3189(class511.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822131388"
	)
	static final void method8900() {
		Client.field705 = Client.cycleCntr;
	}
}
