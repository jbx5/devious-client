import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1344045265
	)
	static int field4962;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("az")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lis;Lij;I)Z",
		garbageValue = "-287593620"
	)
	static final boolean method8702(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, class216 var5) {
		int var6 = var5.method4199();
		int var7 = var5.method4216();
		int[][] var8 = var5.method4202();
		int[][] var9 = var5.method4222();
		int[] var10 = var5.method4203();
		int[] var11 = var5.method4204();
		int var12 = var5.method4205();
		int var13 = var0;
		int var14 = var1;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var0 - var15;
		int var18 = var1 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var0;
		int var26 = var19 + 1;
		var11[var19] = var1;
		int[][] var21 = var4.flags;

		while (true) {
			label305:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label282:
							do {
								if (var20 == var26) {
									var5.method4196(var13, var14);
									return false;
								}

								var13 = var10[var20];
								var14 = var11[var20];
								var20 = var20 + 1 & var12;
								var15 = var13 - var17;
								var16 = var14 - var18;
								var22 = var13 - var4.xInset;
								var23 = var14 - var4.yInset;
								if (var3.hasArrived(var2, var13, var14, var4)) {
									var5.method4196(var13, var14);
									return true;
								}

								var24 = var8[var15][var16] + 1;
								if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + var2 - 1] & 19136824) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 - 1;
											var11[var26] = var14;
											var26 = var26 + 1 & var12;
											var9[var15 - 1][var16] = 2;
											var8[var15 - 1][var16] = var24;
											break;
										}

										if ((var21[var22 - 1][var25 + var23] & 19136830) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var15 < var6 - var2 && var9[var15 + 1][var16] == 0 && (var21[var22 + var2][var23] & 19136899) == 0 && (var21[var22 + var2][var23 + var2 - 1] & 19136992) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 + 1;
											var11[var26] = var14;
											var26 = var26 + 1 & var12;
											var9[var15 + 1][var16] = 8;
											var8[var15 + 1][var16] = var24;
											break;
										}

										if ((var21[var22 + var2][var25 + var23] & 19136995) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + var2 - 1][var23 - 1] & 19136899) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13;
											var11[var26] = var14 - 1;
											var26 = var26 + 1 & var12;
											var9[var15][var16 - 1] = 1;
											var8[var15][var16 - 1] = var24;
											break;
										}

										if ((var21[var22 + var25][var23 - 1] & 19136911) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var16 < var7 - var2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + var2] & 19136824) == 0 && (var21[var22 + var2 - 1][var23 + var2] & 19136992) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13;
											var11[var26] = var14 + 1;
											var26 = var26 + 1 & var12;
											var9[var15][var16 + 1] = 4;
											var8[var15][var16 + 1] = var24;
											break;
										}

										if ((var21[var25 + var22][var23 + var2] & 19137016) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 - 1;
											var11[var26] = var14 - 1;
											var26 = var26 + 1 & var12;
											var9[var15 - 1][var16 - 1] = 3;
											var8[var15 - 1][var16 - 1] = var24;
											break;
										}

										if ((var21[var22 - 1][var25 + (var23 - 1)] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 - 1] & 19136911) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var15 < var6 - var2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + var2][var23 - 1] & 19136899) == 0) {
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 + 1;
											var11[var26] = var14 - 1;
											var26 = var26 + 1 & var12;
											var9[var15 + 1][var16 - 1] = 9;
											var8[var15 + 1][var16 - 1] = var24;
											break;
										}

										if ((var21[var22 + var2][var25 + (var23 - 1)] & 19136995) != 0 || (var21[var22 + var25][var23 - 1] & 19136911) != 0) {
											break;
										}

										++var25;
									}
								}

								if (var15 > 0 && var16 < var7 - var2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + var2] & 19136824) == 0) {
									for (var25 = 1; var25 < var2; ++var25) {
										if ((var21[var22 - 1][var23 + var25] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 + var2] & 19137016) != 0) {
											continue label282;
										}
									}

									var10[var26] = var13 - 1;
									var11[var26] = var14 + 1;
									var26 = var26 + 1 & var12;
									var9[var15 - 1][var16 + 1] = 6;
									var8[var15 - 1][var16 + 1] = var24;
								}
							} while(var15 >= var6 - var2);
						} while(var16 >= var7 - var2);
					} while(var9[var15 + 1][var16 + 1] != 0);
				} while((var21[var22 + var2][var23 + var2] & 19136992) != 0);

				for (var25 = 1; var25 < var2; ++var25) {
					if ((var21[var22 + var25][var23 + var2] & 19137016) != 0 || (var21[var22 + var2][var23 + var25] & 19136995) != 0) {
						continue label305;
					}
				}

				var10[var26] = var13 + 1;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "0"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	static void method8701(int var0) {
		SequenceDefinition var1 = EnumComposition.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (ClientPreferences.method2552(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field695.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
