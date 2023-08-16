import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("LoginPacket")
public class LoginPacket implements class293 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3365;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final LoginPacket field3364;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3359;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3360;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final LoginPacket field3361;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final LoginPacket field3362;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Llk;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -85411471
	)
	@Export("id")
	public final int id;

	static {
		field3365 = new LoginPacket(14, 0);
		field3364 = new LoginPacket(15, 4);
		field3359 = new LoginPacket(16, -2);
		field3360 = new LoginPacket(18, -2);
		field3361 = new LoginPacket(19, -2);
		field3362 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = new LoginPacket[]{field3365, field3364, field3360, field3362, field3361, field3359};
		LoginPacket[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			LoginPacket_indexedValues[var1[var2].id] = var1[var2];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILiw;Lis;Lij;S)Z",
		garbageValue = "24346"
	)
	static final boolean method5713(int var0, int var1, RouteStrategy var2, CollisionMap var3, class216 var4) {
		int var5 = var4.method4199();
		int var6 = var4.method4216();
		int[][] var7 = var4.method4202();
		int[][] var8 = var4.method4222();
		int[] var9 = var4.method4203();
		int[] var10 = var4.method4204();
		int var11 = var4.method4205();
		int var12 = var0;
		int var13 = var1;
		int var14 = var5 >> 1;
		int var15 = var6 >> 1;
		int var16 = var0 - var14;
		int var17 = var1 - var15;
		var8[var14][var15] = 99;
		var7[var14][var15] = 0;
		byte var18 = 0;
		int var19 = 0;
		var9[var18] = var0;
		byte var10001 = var18;
		int var24 = var18 + 1;
		var10[var10001] = var1;
		int[][] var20 = var3.flags;

		while (var19 != var24) {
			var12 = var9[var19];
			var13 = var10[var19];
			var19 = var19 + 1 & var11;
			var14 = var12 - var16;
			var15 = var13 - var17;
			int var21 = var12 - var3.xInset;
			int var22 = var13 - var3.yInset;
			if (var2.hasArrived(2, var12, var13, var3)) {
				var4.method4196(var12, var13);
				return true;
			}

			int var23 = var7[var14][var15] + 1;
			if (var14 > 0 && var8[var14 - 1][var15] == 0 && (var20[var21 - 1][var22] & 19136782) == 0 && (var20[var21 - 1][var22 + 1] & 19136824) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15] = 2;
				var7[var14 - 1][var15] = var23;
			}

			if (var14 < var5 - 2 && var8[var14 + 1][var15] == 0 && (var20[var21 + 2][var22] & 19136899) == 0 && (var20[var21 + 2][var22 + 1] & 19136992) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15] = 8;
				var7[var14 + 1][var15] = var23;
			}

			if (var15 > 0 && var8[var14][var15 - 1] == 0 && (var20[var21][var22 - 1] & 19136782) == 0 && (var20[var21 + 1][var22 - 1] & 19136899) == 0) {
				var9[var24] = var12;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14][var15 - 1] = 1;
				var7[var14][var15 - 1] = var23;
			}

			if (var15 < var6 - 2 && var8[var14][var15 + 1] == 0 && (var20[var21][var22 + 2] & 19136824) == 0 && (var20[var21 + 1][var22 + 2] & 19136992) == 0) {
				var9[var24] = var12;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14][var15 + 1] = 4;
				var7[var14][var15 + 1] = var23;
			}

			if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && (var20[var21 - 1][var22] & 19136830) == 0 && (var20[var21 - 1][var22 - 1] & 19136782) == 0 && (var20[var21][var22 - 1] & 19136911) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15 - 1] = 3;
				var7[var14 - 1][var15 - 1] = var23;
			}

			if (var14 < var5 - 2 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 19136911) == 0 && (var20[var21 + 2][var22 - 1] & 19136899) == 0 && (var20[var21 + 2][var22] & 19136995) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15 - 1] = 9;
				var7[var14 + 1][var15 - 1] = var23;
			}

			if (var14 > 0 && var15 < var6 - 2 && var8[var14 - 1][var15 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 19136830) == 0 && (var20[var21 - 1][var22 + 2] & 19136824) == 0 && (var20[var21][var22 + 2] & 19137016) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15 + 1] = 6;
				var7[var14 - 1][var15 + 1] = var23;
			}

			if (var14 < var5 - 2 && var15 < var6 - 2 && var8[var14 + 1][var15 + 1] == 0 && (var20[var21 + 1][var22 + 2] & 19137016) == 0 && (var20[var21 + 2][var22 + 2] & 19136992) == 0 && (var20[var21 + 2][var22 + 1] & 19136995) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15 + 1] = 12;
				var7[var14 + 1][var15 + 1] = var23;
			}
		}

		var4.method4196(var12, var13);
		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IIB)Lpi;",
		garbageValue = "69"
	)
	public static Font method5712(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		return !ApproximateRouteStrategy.method1228(var0, var2, var3) ? null : HealthBarDefinition.method3642(var1.takeFile(var2, var3));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "88"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-245858333"
	)
	static void method5710() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}
}
