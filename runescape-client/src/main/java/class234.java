import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class234 {
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -946377949
	)
	static int field2490;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	class232[] field2491;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036255420"
	)
	public void method4441() {
		this.field2491 = new class232[1];
		class230 var1 = class230.field2460;
		this.field2491[0] = new class232(var1.field2466, var1.field2467);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lix;Z[I[II)I",
		garbageValue = "1551515553"
	)
	public int method4446(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4445(var1, var2, var3, var4, var5, var6, var7, var8, this.field2491[0]);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lix;Z[I[ILiz;B)I",
		garbageValue = "49"
	)
	int method4445(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class232 var9) {
		var9.method4401();
		int var10 = var9.method4405();
		int var11 = var9.method4400();
		int[][] var12 = var9.method4427();
		int[][] var13 = var9.method4406();
		int[] var14 = var9.method4409();
		int[] var15 = var9.method4428();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method4444(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method4457(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4450(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method4403();
		int var20 = var9.method4404();
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

			for (int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
				for (int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var25 + var27 - 1);
						}

						int var34 = var33 * var33 + var32 * var32;
						if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILiw;Lix;Liz;B)Z",
		garbageValue = "100"
	)
	final boolean method4444(int var1, int var2, RouteStrategy var3, CollisionMap var4, class232 var5) {
		int var6 = var5.method4405();
		int var7 = var5.method4400();
		int[][] var8 = var5.method4427();
		int[][] var9 = var5.method4406();
		int[] var10 = var5.method4409();
		int[] var11 = var5.method4428();
		int var12 = var5.method4430();
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
				var5.method4402(var13, var14);
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

		var5.method4402(var13, var14);
		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILiw;Lix;Liz;B)Z",
		garbageValue = "-20"
	)
	final boolean method4457(int var1, int var2, RouteStrategy var3, CollisionMap var4, class232 var5) {
		int var6 = var5.method4405();
		int var7 = var5.method4400();
		int[][] var8 = var5.method4427();
		int[][] var9 = var5.method4406();
		int[] var10 = var5.method4409();
		int[] var11 = var5.method4428();
		int var12 = var5.method4430();
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

		while (var20 != var25) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var22 = var13 - var4.xInset;
			int var23 = var14 - var4.yInset;
			if (var3.hasArrived(2, var13, var14, var4)) {
				var5.method4402(var13, var14);
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

		var5.method4402(var13, var14);
		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lix;Liz;I)Z",
		garbageValue = "-152274664"
	)
	final boolean method4450(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class232 var6) {
		int var7 = var6.method4405();
		int var8 = var6.method4400();
		int[][] var9 = var6.method4427();
		int[][] var10 = var6.method4406();
		int[] var11 = var6.method4409();
		int[] var12 = var6.method4428();
		int var13 = var6.method4430();
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
			label306:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label283:
							do {
								if (var27 == var21) {
									var6.method4402(var14, var15);
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
									var6.method4402(var14, var15);
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

										if ((var22[var26 + var23][var24 - 1] & 19136911) != 0) {
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

										if ((var22[var26 + var23][var3 + var24] & 19137016) != 0) {
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
											continue label283;
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
					if ((var22[var23 + var26][var3 + var24] & 19137016) != 0 || (var22[var3 + var23][var26 + var24] & 19136995) != 0) {
						continue label306;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "286326800"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-570566878"
	)
	public static void method4464(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvj;",
		garbageValue = "1658717571"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5316, FillMode.SOLID, FillMode.field5317};
	}
}
