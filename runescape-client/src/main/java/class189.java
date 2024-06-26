import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class189 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2141473903"
	)
	public static String method3693(CharSequence var0) {
		long var3 = 0L;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			var3 *= 37L;
			char var7 = var0.charAt(var6);
			if (var7 >= 'A' && var7 <= 'Z') {
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') {
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48);
			}

			if (var3 >= 177917621779460413L) {
				break;
			}
		}

		while (var3 % 37L == 0L && var3 != 0L) {
			var3 /= 37L;
		}

		String var8 = class237.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FZI)F",
		garbageValue = "-131890586"
	)
	static float method3695(class135 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3150() != 0) {
			float var4 = (float)var0.field1579[0].field1526;
			float var5 = (float)var0.field1579[var0.method3150() - 1].field1526;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1579[0].field1527;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(1.0D + var8);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1580 == class133.field1564) {
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1580 != class133.field1562 && var0.field1580 != class133.field1563) {
						if (var0.field1580 == class133.field1561) {
							var11 = var4 - var1;
							var16 = var0.field1579[0].field1528;
							var17 = var0.field1579[0].field1529;
							var3 = var0.field1579[0].field1527;
							if ((double)var16 != 0.0D) {
								var3 -= var11 * var17 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1583 == class133.field1564) {
					if (0.0D != (double)var10) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1583 != class133.field1562 && var0.field1583 != class133.field1563) {
					if (var0.field1583 == class133.field1561) {
						var11 = var1 - var5;
						var16 = var0.field1579[var0.method3150() - 1].field1535;
						var17 = var0.field1579[var0.method3150() - 1].field1531;
						var3 = var0.field1579[var0.method3150() - 1].field1527;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = AuthenticationScheme.method3050(var0, var11);
				float var18;
				if (var2 && var0.field1580 == class133.field1563) {
					var18 = var0.field1579[var0.method3150() - 1].field1527 - var0.field1579[0].field1527;
					var3 = (float)((double)var3 - var8 * (double)var18);
				} else if (!var2 && var0.field1583 == class133.field1563) {
					var18 = var0.field1579[var0.method3150() - 1].field1527 - var0.field1579[0].field1527;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-680016432"
	)
	public static byte[] method3694(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) {
				var2[var3] = -128;
			} else if (var4 == 8218) {
				var2[var3] = -126;
			} else if (var4 == 402) {
				var2[var3] = -125;
			} else if (var4 == 8222) {
				var2[var3] = -124;
			} else if (var4 == 8230) {
				var2[var3] = -123;
			} else if (var4 == 8224) {
				var2[var3] = -122;
			} else if (var4 == 8225) {
				var2[var3] = -121;
			} else if (var4 == 710) {
				var2[var3] = -120;
			} else if (var4 == 8240) {
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118;
			} else if (var4 == 8249) {
				var2[var3] = -117;
			} else if (var4 == 338) {
				var2[var3] = -116;
			} else if (var4 == 381) {
				var2[var3] = -114;
			} else if (var4 == 8216) {
				var2[var3] = -111;
			} else if (var4 == 8217) {
				var2[var3] = -110;
			} else if (var4 == 8220) {
				var2[var3] = -109;
			} else if (var4 == 8221) {
				var2[var3] = -108;
			} else if (var4 == 8226) {
				var2[var3] = -107;
			} else if (var4 == 8211) {
				var2[var3] = -106;
			} else if (var4 == 8212) {
				var2[var3] = -105;
			} else if (var4 == 732) {
				var2[var3] = -104;
			} else if (var4 == 8482) {
				var2[var3] = -103;
			} else if (var4 == 353) {
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101;
			} else if (var4 == 339) {
				var2[var3] = -100;
			} else if (var4 == 382) {
				var2[var3] = -98;
			} else if (var4 == 376) {
				var2[var3] = -97;
			} else {
				var2[var3] = 63;
			}
		}

		return var2;
	}
}
