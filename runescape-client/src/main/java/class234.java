import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class234 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lid;"
	)
	class232[] field2474;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public void method4570() {
		this.field2474 = new class232[1];
		class230 var1 = class230.field2447;
		this.field2474[0] = new class232(var1.field2453, var1.field2454);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILih;Liz;Z[I[II)I",
		garbageValue = "-531168220"
	)
	public int method4571(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4572(var1, var2, var3, var4, var5, var6, var7, var8, this.field2474[0]);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILih;Liz;Z[I[ILid;I)I",
		garbageValue = "-23549821"
	)
	int method4572(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class232 var9) {
		var9.method4519();
		int var10 = var9.method4523();
		int var11 = var9.method4524();
		int[][] var12 = var9.method4526();
		int[][] var13 = var9.method4546();
		int[] var14 = var9.method4527();
		int[] var15 = var9.method4528();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method4573(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method4574(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4583(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method4552();
		int var20 = var9.method4557();
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
						} else if (var29 > var25 + var27 - 1) {
							var33 = var29 - (var25 + var27 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
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
				if (var22 != var37) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILih;Liz;Lid;B)Z",
		garbageValue = "14"
	)
	final boolean method4573(int var1, int var2, RouteStrategy var3, CollisionMap var4, class232 var5) {
		int var6 = var5.method4523();
		int var7 = var5.method4524();
		int[][] var8 = var5.method4526();
		int[][] var9 = var5.method4546();
		int[] var10 = var5.method4527();
		int[] var11 = var5.method4528();
		int var12 = var5.method4529();
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
				var5.method4520(var13, var14);
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

		var5.method4520(var13, var14);
		return false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILih;Liz;Lid;B)Z",
		garbageValue = "45"
	)
	final boolean method4574(int var1, int var2, RouteStrategy var3, CollisionMap var4, class232 var5) {
		int var6 = var5.method4523();
		int var7 = var5.method4524();
		int[][] var8 = var5.method4526();
		int[][] var9 = var5.method4546();
		int[] var10 = var5.method4527();
		int[] var11 = var5.method4528();
		int var12 = var5.method4529();
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
				var5.method4520(var13, var14);
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

		var5.method4520(var13, var14);
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILih;Liz;Lid;B)Z",
		garbageValue = "29"
	)
	final boolean method4583(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class232 var6) {
		int var7 = var6.method4523();
		int var8 = var6.method4524();
		int[][] var9 = var6.method4526();
		int[][] var10 = var6.method4546();
		int[] var11 = var6.method4527();
		int[] var12 = var6.method4528();
		int var13 = var6.method4529();
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
			label303:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label280:
							do {
								if (var21 == var27) {
									var6.method4520(var14, var15);
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
									var6.method4520(var14, var15);
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

										if ((var22[var3 + var23][var26 + (var24 - 1)] & 19136995) != 0 || (var22[var26 + var23][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var3 + var24] & 19136824) == 0) {
									for (var26 = 1; var26 < var3; ++var26) {
										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 19137016) != 0) {
											continue label280;
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
					if ((var22[var26 + var23][var3 + var24] & 19137016) != 0 || (var22[var3 + var23][var24 + var26] & 19136995) != 0) {
						continue label303;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "919541402"
	)
	static int method4589(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field949;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field945;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field946;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}
}
