import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class33 {
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 2046874205
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 677815153
	)
	int field164;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1667996831
	)
	int field163;

	class33(int var1, int var2) {
		this.field164 = var1;
		this.field163 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)Z",
		garbageValue = "884934195"
	)
	boolean method477(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field164) {
			case 1:
				return var1.vmethod4396(this.field163);
			case 2:
				return var1.vmethod4375(this.field163);
			case 3:
				return var1.vmethod4378((char)this.field163);
			case 4:
				return var1.vmethod4380(this.field163 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)Lmv;",
		garbageValue = "1882744642"
	)
	@Export("updateExternalPlayer")
	static MusicPatch updateExternalPlayer(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpe;I)I",
		garbageValue = "-1400843805"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = class91.method2389(var9);
			var8 = class91.method2389(var10);
			var9 = class141.standardizeChar(var9, var2);
			var10 = class141.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class415.lowercaseChar(var9, var2) - class415.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var12 != var11) {
					return class415.lowercaseChar(var11, var2) - class415.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return class415.lowercaseChar(var12, var2) - class415.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FFFFFFFFB)V",
		garbageValue = "35"
	)
	static void method480(class135 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if ((double)var9 != 0.0D) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1594 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if ((double)var12[0] < 0.0D) {
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) {
					var12[1] = 1.0F;
				}

				float var15;
				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) {
					var12[1] = 1.0F - var12[1];
					if (var12[0] < 0.0F) {
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) {
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) {
						var15 = (float)((double)(var12[0] * (var12[0] - 2.0F + var12[1])) + ((double)var12[1] - 2.0D) * (double)var12[1] + 1.0D);
						if (var15 + class131.field1544 > 0.0F) {
							BuddyRankComparator.method3029(var12);
						}
					}

					var12[1] = 1.0F - var12[1];
				}

				if (var13 != var12[0]) {
					var2 = var9 * var12[0] + var1;
					if ((double)var13 != 0.0D) {
						var6 = (var6 - var5) * var12[0] / var13 + var5;
					}
				}

				if (var14 != var12[1]) {
					float var10000 = var1 + var12[1] * var9;
					if (1.0D != (double)var14) {
						var7 = (float)((double)var8 - (1.0D - (double)var12[1]) * (double)(var8 - var7) / (1.0D - (double)var14));
					}
				}

				var0.field1592 = var1;
				var0.field1591 = var4;
				TileItem.method2795(0.0F, var12[0], var12[1], 1.0F, var0);
				var15 = var6 - var5;
				float var16 = var7 - var6;
				float var17 = var8 - var7;
				float var18 = var16 - var15;
				var0.field1582 = var17 - var16 - var18;
				var0.field1589 = var18 + var18 + var18;
				var0.field1588 = var15 + var15 + var15;
				var0.field1587 = var5;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-26"
	)
	static void method476(int var0, int var1, int var2, int var3) {
		class330.musicPlayerStatus = var0;
		class330.field3589 = var1;
		class330.field3590 = var2;
		class330.field3586 = var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "98"
	)
	static int method483(int var0, Script var1, boolean var2) {
		return 2;
	}
}
