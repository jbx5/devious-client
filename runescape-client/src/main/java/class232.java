import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class232 {
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -1424338259
	)
	static int field2431;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lig;"
	)
	class230[] field2432;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public void method4389() {
		this.field2432 = new class230[1];
		class228 var1 = class228.field2409;
		this.field2432[0] = new class230(var1.field2407, var1.field2401);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Z[I[II)I",
		garbageValue = "1180709957"
	)
	public int method4391(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4397(var1, var2, var3, var4, var5, var6, var7, var8, this.field2432[0]);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Z[I[ILig;B)I",
		garbageValue = "35"
	)
	int method4397(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class230 var9) {
		var9.method4343();
		int var10 = var9.method4380();
		int var11 = var9.method4348();
		int[][] var12 = var9.method4350();
		int[][] var13 = var9.method4349();
		int[] var14 = var9.method4351();
		int[] var15 = var9.method4352();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method4405(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method4394(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4395(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method4345();
		int var20 = var9.method4346();
		int var21;
		int var22;
		int var24;
		if (!var16) {
			if (!var6) {
				return -1;
			}

			var21 = Integer.MAX_VALUE;
			var22 = Integer.MAX_VALUE;
			byte var23 = 10;
			var24 = var4.approxDestinationX;
			int var25 = var4.approxDestinationY;
			int var26 = var4.approxDestinationSizeX;
			int var27 = var4.approxDestinationSizeY;

			for (int var28 = var24 - var23; var28 <= var23 + var24; ++var28) {
				for (int var29 = var25 - var23; var29 <= var25 + var23; ++var29) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var24 + var26 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var19 == var1 && var20 == var2) {
			var7[0] = var19;
			var8[0] = var20;
			return 0;
		} else {
			byte var36 = 0;
			var14[var36] = var19;
			var21 = var36 + 1;
			var15[var36] = var20;

			int var37;
			for (var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var20 != var2; var22 = var13[var19 - var17][var20 - var18]) {
				if (var37 != var22) {
					var37 = var22;
					var14[var21] = var19;
					var15[var21++] = var20;
				}

				if ((var22 & 2) != 0) {
					++var19;
				} else if ((var22 & 8) != 0) {
					--var19;
				}

				if ((var22 & 1) != 0) {
					++var20;
				} else if ((var22 & 4) != 0) {
					--var20;
				}
			}

			var24 = 0;

			while (var21-- > 0) {
				var7[var24] = var14[var21];
				var8[var24++] = var15[var21];
				if (var24 >= var7.length) {
					break;
				}
			}

			return var24;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILiq;Lih;Lig;I)Z",
		garbageValue = "1570636396"
	)
	final boolean method4405(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4380();
		int var7 = var5.method4348();
		int[][] var8 = var5.method4350();
		int[][] var9 = var5.method4349();
		int[] var10 = var5.method4351();
		int[] var11 = var5.method4352();
		int var12 = var5.method4353();
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		byte var10001 = var19;
		int var25 = var19 + 1;
		var11[var10001] = var2;
		int[][] var21 = var4.flags;

		while (var25 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var22 = var13 - var4.xInset;
			int var23 = var14 - var4.yInset;
			if (var3.hasArrived(1, var13, var14, var4)) {
				var5.method4344(var13, var14);
				return true;
			}

			int var24 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136776) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var24;
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && (var21[var22 + 1][var23] & 19136896) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var24;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136770) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var24;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 1] & 19136800) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var24;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22 - 1][var23] & 19136776) == 0 && (var21[var22][var23 - 1] & 19136770) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var24;
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0 && (var21[var22 + 1][var23] & 19136896) == 0 && (var21[var22][var23 - 1] & 19136770) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var24;
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0 && (var21[var22 - 1][var23] & 19136776) == 0 && (var21[var22][var23 + 1] & 19136800) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var24;
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 1] & 19136992) == 0 && (var21[var22 + 1][var23] & 19136896) == 0 && (var21[var22][var23 + 1] & 19136800) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}

		var5.method4344(var13, var14);
		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILiq;Lih;Lig;I)Z",
		garbageValue = "-525938769"
	)
	final boolean method4394(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4380();
		int var7 = var5.method4348();
		int[][] var8 = var5.method4350();
		int[][] var9 = var5.method4349();
		int[] var10 = var5.method4351();
		int[] var11 = var5.method4352();
		int var12 = var5.method4353();
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		byte var10001 = var19;
		int var25 = var19 + 1;
		var11[var10001] = var2;
		int[][] var21 = var4.flags;

		while (var25 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var22 = var13 - var4.xInset;
			int var23 = var14 - var4.yInset;
			if (var3.hasArrived(2, var13, var14, var4)) {
				var5.method4344(var13, var14);
				return true;
			}

			int var24 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var24;
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 19136899) == 0 && (var21[var22 + 2][var23 + 1] & 19136992) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var24;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var24;
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 19136824) == 0 && (var21[var22 + 1][var23 + 2] & 19136992) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var24;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 19136830) == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22][var23 - 1] & 19136911) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var24;
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136911) == 0 && (var21[var22 + 2][var23 - 1] & 19136899) == 0 && (var21[var22 + 2][var23] & 19136995) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var24;
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136830) == 0 && (var21[var22 - 1][var23 + 2] & 19136824) == 0 && (var21[var22][var23 + 2] & 19137016) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var24;
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 19137016) == 0 && (var21[var22 + 2][var23 + 2] & 19136992) == 0 && (var21[var22 + 2][var23 + 1] & 19136995) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}

		var5.method4344(var13, var14);
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Lig;B)Z",
		garbageValue = "58"
	)
	final boolean method4395(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class230 var6) {
		int var7 = var6.method4380();
		int var8 = var6.method4348();
		int[][] var9 = var6.method4350();
		int[][] var10 = var6.method4349();
		int[] var11 = var6.method4351();
		int[] var12 = var6.method4352();
		int var13 = var6.method4353();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		int var27 = var20 + 1;
		var12[var20] = var2;
		int[][] var22 = var5.flags;

		while (true) {
			label312:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label289:
							do {
								if (var21 == var27) {
									var6.method4344(var14, var15);
									return false;
								}

								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var16 = var14 - var18;
								var17 = var15 - var19;
								var23 = var14 - var5.xInset;
								var24 = var15 - var5.yInset;
								if (var4.hasArrived(var3, var14, var15, var5)) {
									var6.method4344(var14, var15);
									return true;
								}

								var25 = var9[var16][var17] + 1;
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136782) == 0 && (var22[var23 - 1][var3 + var24 - 1] & 19136824) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 - 1;
											var12[var27] = var15;
											var27 = var27 + 1 & var13;
											var10[var16 - 1][var17] = 2;
											var9[var16 - 1][var17] = var25;
											break;
										}

										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && (var22[var3 + var23][var24] & 19136899) == 0 && (var22[var3 + var23][var3 + var24 - 1] & 19136992) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 + 1;
											var12[var27] = var15;
											var27 = var27 + 1 & var13;
											var10[var16 + 1][var17] = 8;
											var9[var16 + 1][var17] = var25;
											break;
										}

										if ((var22[var3 + var23][var24 + var26] & 19136995) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136782) == 0 && (var22[var3 + var23 - 1][var24 - 1] & 19136899) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16][var17 - 1] = 1;
											var9[var16][var17 - 1] = var25;
											break;
										}

										if ((var22[var23 + var26][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && (var22[var23][var3 + var24] & 19136824) == 0 && (var22[var3 + var23 - 1][var3 + var24] & 19136992) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14;
											var12[var27] = var15 + 1;
											var27 = var27 + 1 & var13;
											var10[var16][var17 + 1] = 4;
											var9[var16][var17 + 1] = var25;
											break;
										}

										if ((var22[var23 + var26][var3 + var24] & 19137016) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 - 1;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16 - 1][var17 - 1] = 3;
											var9[var16 - 1][var17 - 1] = var25;
											break;
										}

										if ((var22[var23 - 1][var26 + (var24 - 1)] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 19136899) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 + 1;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16 + 1][var17 - 1] = 9;
											var9[var16 + 1][var17 - 1] = var25;
											break;
										}

										if ((var22[var3 + var23][var26 + (var24 - 1)] & 19136995) != 0 || (var22[var23 + var26][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var3 + var24] & 19136824) == 0) {
									for (var26 = 1; var26 < var3; ++var26) {
										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 19137016) != 0) {
											continue label289;
										}
									}

									var11[var27] = var14 - 1;
									var12[var27] = var15 + 1;
									var27 = var27 + 1 & var13;
									var10[var16 - 1][var17 + 1] = 6;
									var9[var16 - 1][var17 + 1] = var25;
								}
							} while(var16 >= var7 - var3);
						} while(var17 >= var8 - var3);
					} while(var10[var16 + 1][var17 + 1] != 0);
				} while((var22[var3 + var23][var3 + var24] & 19136992) != 0);

				for (var26 = 1; var26 < var3; ++var26) {
					if ((var22[var26 + var23][var3 + var24] & 19137016) != 0 || (var22[var3 + var23][var26 + var24] & 19136995) != 0) {
						continue label312;
					}
				}

				var11[var27] = var14 + 1;
				var12[var27] = var15 + 1;
				var27 = var27 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	public static void method4412() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "368795311"
	)
	static final int method4410() {
		if (class91.clientPreferences.method2502()) {
			return class87.Client_plane;
		} else {
			int var0 = class115.getTileHeight(Client.cameraX, WorldMapArea.cameraZ, class87.Client_plane);
			return var0 - class17.cameraY < 800 && (Tiles.Tiles_renderFlags[class87.Client_plane][Client.cameraX >> 7][WorldMapArea.cameraZ >> 7] & 4) != 0 ? class87.Client_plane : 3;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIIIB)V",
		garbageValue = "79"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			boolean var8 = var1 < var75;
			int var9 = -2;
			if (var0.overheadText != null && (!var8 || !var0.field1246 && (Client.publicChatMode == 4 || !var0.field1207 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				PlayerType.method6828(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = SoundCache.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = SoundCache.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1255;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1211;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field630[Client.overheadTextCount] = var0.field1194;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var19;
			int var22;
			int var83;
			if (!var0.healthBars.method7247()) {
				PlayerType.method6828(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition;
						SpritePixels var13 = var12.getBackSprite();
						SpritePixels var86 = var12.getFrontSprite();
						int var87 = 0;
						if (var13 != null && var86 != null) {
							if (var12.widthPadding * 2 < var86.subWidth) {
								var87 = var12.widthPadding;
							}

							var15 = var86.subWidth - var87 * 2;
						} else {
							var15 = var12.width;
						}

						int var81 = 255;
						boolean var88 = true;
						var19 = Client.cycle - var11.cycle;
						int var89 = var15 * var11.health2 / var12.width;
						int var90;
						int var105;
						if (var11.cycleOffset > var19) {
							var90 = var12.field1987 == 0 ? 0 : var12.field1987 * (var19 / var12.field1987);
							var22 = var15 * var11.health / var12.width;
							var105 = var90 * (var89 - var22) / var11.cycleOffset + var22;
						} else {
							var105 = var89;
							var90 = var12.int5 + var11.cycleOffset - var19;
							if (var12.int3 >= 0) {
								var81 = (var90 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var105 < 1) {
							var105 = 1;
						}

						if (var13 != null && var86 != null) {
							if (var15 == var105) {
								var105 += var87 * 2;
							} else {
								var105 += var87;
							}

							var90 = var13.subHeight;
							var9 += var90;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var83 = var3 + Client.viewportTempY - var9;
							var22 -= var87;
							if (var81 >= 0 && var81 < 255) {
								var13.drawTransAt(var22, var83, var81);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var83, var105 + var22, var90 + var83);
								var86.drawTransAt(var22, var83, var81);
							} else {
								var13.drawTransBgAt(var22, var83);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var83, var22 + var105, var83 + var90);
								var86.drawTransBgAt(var22, var83);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var90 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var22, var105, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var90 + var105, var22, var15 - var105, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) {
				Player var93 = (Player)var0;
				boolean var76;
				if (Client.drawPlayerNames == 0) {
					var76 = false;
				} else if (var93 == TextureProvider.localPlayer) {
					var76 = WorldMapLabelSize.method5219();
				} else {
					var76 = class208.method3847() || ModeWhere.method7182() && var93.isFriend() || class47.method871() && var93.isFriendsChatMember();
				}

				if (var76) {
					Player var95 = (Player)var0;
					if (var8) {
						PlayerType.method6828(var0, var0.defaultHeight + 15);
						AbstractFont var97 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						var9 += 4;
						var97.drawCentered(var95.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
						var9 += 18;
					}
				}
			}

			Archive var18;
			SpritePixels[] var21;
			int var24;
			int var26;
			if (var8) {
				Player var91 = (Player)var0;
				if (var91.isHidden) {
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) {
					PlayerType.method6828(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var91.headIconPk != -1) {
							var9 += 25;
							UserComparator4.headIconPkSprites[var91.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var91.headIconPrayer != -1) {
							var9 += 25;
							class157.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					PlayerType.method6828(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += UserComparator8.headIconHintSprites[1].subHeight;
						UserComparator8.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var92 = (NPC)var0;
				int[] var94 = var92.method2629();
				short[] var96 = var92.method2635();
				if (var96 != null && var94 != null) {
					for (int var77 = 0; var77 < var96.length; ++var77) {
						if (var96[var77] >= 0 && var94[var77] >= 0) {
							long var14 = (long)var94[var77] << 8 | (long)var96[var77];
							Object var16 = (SpritePixels)Client.field810.method7937(var14);
							if (var16 == null) {
								var18 = class199.archive8;
								var19 = var94[var77];
								SpritePixels[] var17;
								if (!class164.method3376(var18, var19, 0)) {
									var17 = null;
								} else {
									var21 = new SpritePixels[class544.SpriteBuffer_spriteCount];
									var22 = 0;

									while (true) {
										if (var22 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453();
											var17 = var21;
											break;
										}

										SpritePixels var23 = var21[var22] = new SpritePixels();
										var23.width = class159.SpriteBuffer_spriteWidth;
										var23.height = class500.SpriteBuffer_spriteHeight;
										var23.xOffset = class326.SpriteBuffer_xOffsets[var22];
										var23.yOffset = ModelData0.SpriteBuffer_yOffsets[var22];
										var23.subWidth = class59.SpriteBuffer_spriteWidths[var22];
										var23.subHeight = class544.SpriteBuffer_spriteHeights[var22];
										var24 = var23.subWidth * var23.subHeight;
										byte[] var25 = AddRequestTask.SpriteBuffer_pixels[var22];
										var23.pixels = new int[var24];

										for (var26 = 0; var26 < var24; ++var26) {
											var23.pixels[var26] = class372.SpriteBuffer_spritePalette[var25[var26] & 255];
										}

										++var22;
									}
								}

								if (var17 != null && var96[var77] < var17.length) {
									var16 = var17[var96[var77]];
									Client.field810.method7928(var14, var16);
								}
							}

							if (var16 != null) {
								PlayerType.method6828(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									((SpritePixels)var16).drawTransBgAt(var2 + Client.viewportTempX - (((SpritePixels)var16).subWidth >> 1), Client.viewportTempY + (var3 - ((SpritePixels)var16).subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					PlayerType.method6828(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						UserComparator8.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var103 = 0; var103 < 4; ++var103) {
				int var78 = var0.hitSplatCycles[var103];
				int var79 = var0.hitSplatTypes[var103];
				HitSplatDefinition var98 = null;
				int var80 = 0;
				if (var79 >= 0) {
					if (var78 <= Client.cycle) {
						continue;
					}

					var98 = class191.method3627(var0.hitSplatTypes[var103]);
					var80 = var98.field2175;
					if (var98 != null && var98.transforms != null) {
						var98 = var98.transform();
						if (var98 == null) {
							var0.hitSplatCycles[var103] = -1;
							continue;
						}
					}
				} else if (var78 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var103];
				HitSplatDefinition var99 = null;
				if (var15 >= 0) {
					var99 = class191.method3627(var15);
					if (var99 != null && var99.transforms != null) {
						var99 = var99.transform();
					}
				}

				if (var78 - var80 <= Client.cycle) {
					if (var98 == null) {
						var0.hitSplatCycles[var103] = -1;
					} else {
						PlayerType.method6828(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var104 = true;
							if (var103 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var103 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var103 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							var18 = null;
							SpritePixels var82 = null;
							SpritePixels var20 = null;
							var21 = null;
							var22 = 0;
							var83 = 0;
							var24 = 0;
							int var84 = 0;
							var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							SpritePixels var100 = var98.method3973();
							int var43;
							if (var100 != null) {
								var22 = var100.subWidth;
								var43 = var100.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var100.xOffset;
							}

							var82 = var98.method3974();
							if (var82 != null) {
								var83 = var82.subWidth;
								var43 = var82.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var82.xOffset;
							}

							var20 = var98.method3975();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							SpritePixels var101 = var98.method3976();
							if (var101 != null) {
								var84 = var101.subWidth;
								var43 = var101.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var101.xOffset;
							}

							if (var99 != null) {
								var30 = var99.method3973();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var99.method3974();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var99.method3975();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var99.method3976();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var85 = var98.getFont();
							if (var85 == null) {
								var85 = class14.fontPlain11;
							}

							Font var44;
							if (var99 != null) {
								var44 = var99.getFont();
								if (var44 == null) {
									var44 = class14.fontPlain11;
								}
							} else {
								var44 = class14.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var98.getString(var0.hitSplatValues[var103]);
							int var102 = var85.stringWidth(var45);
							if (var99 != null) {
								var46 = var99.getString(var0.hitSplatValues2[var103]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var83 > 0) {
								if (var20 == null && var101 == null) {
									var49 = 1;
								} else {
									var49 = var102 / var83 + 1;
								}
							}

							if (var99 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var83 > 0) {
								var56 = var83 * var49;
								var51 += var56;
								var55 += (var56 - var102) / 2;
							} else {
								var51 += var102;
							}

							var56 = var51;
							if (var84 > 0) {
								var51 += var84;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var99 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var103] - Client.cycle;
							int var63 = var98.field2180 - var62 * var98.field2180 / var98.field2175;
							int var64 = var62 * var98.field2171 / var98.field2175 + -var98.field2171;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var64 + (var3 + Client.viewportTempY - 12);
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = var66 + var98.field2173 + 15;
							int var70 = var69 - var85.maxAscent;
							int var71 = var69 + var85.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var99 != null) {
								var72 = var66 + var99.field2173 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var98.field2182 >= 0) {
								var73 = (var62 << 8) / (var98.field2175 - var98.field2182);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var100 != null) {
									var100.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var82 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var82.drawTransAt(var74 * var83 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var101 != null) {
									var101.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var85.drawAlpha(var45, var65 + var55, var69, var98.textColor, 0, var73);
								if (var99 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var99.textColor, 0, var73);
								}
							} else {
								if (var100 != null) {
									var100.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var82 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var82.drawTransBgAt(var74 * var83 + (var65 + var54 - var27), var66);
									}
								}

								if (var101 != null) {
									var101.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var85.draw(var45, var55 + var65, var69, var98.textColor | -16777216, 0);
								if (var99 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var99.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
