import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ay")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1192538000"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILin;Lij;Z[I[ILiq;I)I",
		garbageValue = "-475105468"
	)
	public static int method5513(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class217 var8) {
		var8.method4232();
		int var9 = var8.method4236();
		int var10 = var8.method4237();
		int[][] var11 = var8.method4260();
		int[][] var12 = var8.method4238();
		int[] var13 = var8.method4240();
		int[] var14 = var8.method4241();
		boolean var15;
		int var17;
		int var18;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var31;
		int var33;
		int var43;
		if (var2 == 1) {
			var15 = class172.method3519(var0, var1, var3, var4, var8);
		} else {
			boolean var16;
			int[][] var19;
			int[][] var20;
			int[] var21;
			int[] var22;
			byte var30;
			int[][] var32;
			int var34;
			int var35;
			if (var2 == 2) {
				var17 = var8.method4236();
				var18 = var8.method4237();
				var19 = var8.method4260();
				var20 = var8.method4238();
				var21 = var8.method4240();
				var22 = var8.method4241();
				var23 = var8.method4242();
				var24 = var0;
				var25 = var1;
				var26 = var17 >> 1;
				var27 = var18 >> 1;
				var28 = var0 - var26;
				var29 = var1 - var27;
				var20[var26][var27] = 99;
				var19[var26][var27] = 0;
				var30 = 0;
				var31 = 0;
				var21[var30] = var0;
				var43 = var30 + 1;
				var22[var30] = var1;
				var32 = var4.flags;

				while (true) {
					if (var43 == var31) {
						var8.method4233(var24, var25);
						var16 = false;
						break;
					}

					var24 = var21[var31];
					var25 = var22[var31];
					var31 = var31 + 1 & var23;
					var26 = var24 - var28;
					var27 = var25 - var29;
					var33 = var24 - var4.xInset;
					var34 = var25 - var4.yInset;
					if (var3.hasArrived(2, var24, var25, var4)) {
						var8.method4233(var24, var25);
						var16 = true;
						break;
					}

					var35 = var19[var26][var27] + 1;
					if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0) {
						var21[var43] = var24 - 1;
						var22[var43] = var25;
						var43 = var43 + 1 & var23;
						var20[var26 - 1][var27] = 2;
						var19[var26 - 1][var27] = var35;
					}

					if (var26 < var17 - 2 && var20[var26 + 1][var27] == 0 && (var32[var33 + 2][var34] & 19136899) == 0 && (var32[var33 + 2][var34 + 1] & 19136992) == 0) {
						var21[var43] = var24 + 1;
						var22[var43] = var25;
						var43 = var43 + 1 & var23;
						var20[var26 + 1][var27] = 8;
						var19[var26 + 1][var27] = var35;
					}

					if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0) {
						var21[var43] = var24;
						var22[var43] = var25 - 1;
						var43 = var43 + 1 & var23;
						var20[var26][var27 - 1] = 1;
						var19[var26][var27 - 1] = var35;
					}

					if (var27 < var18 - 2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 2] & 19136824) == 0 && (var32[var33 + 1][var34 + 2] & 19136992) == 0) {
						var21[var43] = var24;
						var22[var43] = var25 + 1;
						var43 = var43 + 1 & var23;
						var20[var26][var27 + 1] = 4;
						var19[var26][var27 + 1] = var35;
					}

					if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34] & 19136830) == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33][var34 - 1] & 19136911) == 0) {
						var21[var43] = var24 - 1;
						var22[var43] = var25 - 1;
						var43 = var43 + 1 & var23;
						var20[var26 - 1][var27 - 1] = 3;
						var19[var26 - 1][var27 - 1] = var35;
					}

					if (var26 < var17 - 2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136911) == 0 && (var32[var33 + 2][var34 - 1] & 19136899) == 0 && (var32[var33 + 2][var34] & 19136995) == 0) {
						var21[var43] = var24 + 1;
						var22[var43] = var25 - 1;
						var43 = var43 + 1 & var23;
						var20[var26 + 1][var27 - 1] = 9;
						var19[var26 + 1][var27 - 1] = var35;
					}

					if (var26 > 0 && var27 < var18 - 2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136830) == 0 && (var32[var33 - 1][var34 + 2] & 19136824) == 0 && (var32[var33][var34 + 2] & 19137016) == 0) {
						var21[var43] = var24 - 1;
						var22[var43] = var25 + 1;
						var43 = var43 + 1 & var23;
						var20[var26 - 1][var27 + 1] = 6;
						var19[var26 - 1][var27 + 1] = var35;
					}

					if (var26 < var17 - 2 && var27 < var18 - 2 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 2] & 19137016) == 0 && (var32[var33 + 2][var34 + 2] & 19136992) == 0 && (var32[var33 + 2][var34 + 1] & 19136995) == 0) {
						var21[var43] = var24 + 1;
						var22[var43] = var25 + 1;
						var43 = var43 + 1 & var23;
						var20[var26 + 1][var27 + 1] = 12;
						var19[var26 + 1][var27 + 1] = var35;
					}
				}

				var15 = var16;
			} else {
				var17 = var8.method4236();
				var18 = var8.method4237();
				var19 = var8.method4260();
				var20 = var8.method4238();
				var21 = var8.method4240();
				var22 = var8.method4241();
				var23 = var8.method4242();
				var24 = var0;
				var25 = var1;
				var26 = var17 >> 1;
				var27 = var18 >> 1;
				var28 = var0 - var26;
				var29 = var1 - var27;
				var20[var26][var27] = 99;
				var19[var26][var27] = 0;
				var30 = 0;
				var31 = 0;
				var21[var30] = var0;
				var43 = var30 + 1;
				var22[var30] = var1;
				var32 = var4.flags;

				label624:
				while (true) {
					label622:
					while (true) {
						int var36;
						do {
							do {
								do {
									label599:
									do {
										if (var31 == var43) {
											var8.method4233(var24, var25);
											var16 = false;
											break label624;
										}

										var24 = var21[var31];
										var25 = var22[var31];
										var31 = var31 + 1 & var23;
										var26 = var24 - var28;
										var27 = var25 - var29;
										var33 = var24 - var4.xInset;
										var34 = var25 - var4.yInset;
										if (var3.hasArrived(var2, var24, var25, var4)) {
											var8.method4233(var24, var25);
											var16 = true;
											break label624;
										}

										var35 = var19[var26][var27] + 1;
										if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + var2 - 1] & 19136824) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24 - 1;
													var22[var43] = var25;
													var43 = var43 + 1 & var23;
													var20[var26 - 1][var27] = 2;
													var19[var26 - 1][var27] = var35;
													break;
												}

												if ((var32[var33 - 1][var34 + var36] & 19136830) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var26 < var17 - var2 && var20[var26 + 1][var27] == 0 && (var32[var33 + var2][var34] & 19136899) == 0 && (var32[var33 + var2][var34 + var2 - 1] & 19136992) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24 + 1;
													var22[var43] = var25;
													var43 = var43 + 1 & var23;
													var20[var26 + 1][var27] = 8;
													var19[var26 + 1][var27] = var35;
													break;
												}

												if ((var32[var33 + var2][var34 + var36] & 19136995) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + var2 - 1][var34 - 1] & 19136899) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24;
													var22[var43] = var25 - 1;
													var43 = var43 + 1 & var23;
													var20[var26][var27 - 1] = 1;
													var19[var26][var27 - 1] = var35;
													break;
												}

												if ((var32[var36 + var33][var34 - 1] & 19136911) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var27 < var18 - var2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + var2] & 19136824) == 0 && (var32[var33 + var2 - 1][var34 + var2] & 19136992) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24;
													var22[var43] = var25 + 1;
													var43 = var43 + 1 & var23;
													var20[var26][var27 + 1] = 4;
													var19[var26][var27 + 1] = var35;
													break;
												}

												if ((var32[var33 + var36][var34 + var2] & 19137016) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2) {
													var21[var43] = var24 - 1;
													var22[var43] = var25 - 1;
													var43 = var43 + 1 & var23;
													var20[var26 - 1][var27 - 1] = 3;
													var19[var26 - 1][var27 - 1] = var35;
													break;
												}

												if ((var32[var33 - 1][var36 + (var34 - 1)] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 - 1] & 19136911) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var26 < var17 - var2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + var2][var34 - 1] & 19136899) == 0) {
											var36 = 1;

											while (true) {
												if (var36 >= var2) {
													var21[var43] = var24 + 1;
													var22[var43] = var25 - 1;
													var43 = var43 + 1 & var23;
													var20[var26 + 1][var27 - 1] = 9;
													var19[var26 + 1][var27 - 1] = var35;
													break;
												}

												if ((var32[var33 + var2][var36 + (var34 - 1)] & 19136995) != 0 || (var32[var33 + var36][var34 - 1] & 19136911) != 0) {
													break;
												}

												++var36;
											}
										}

										if (var26 > 0 && var27 < var18 - var2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + var2] & 19136824) == 0) {
											for (var36 = 1; var36 < var2; ++var36) {
												if ((var32[var33 - 1][var36 + var34] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 + var2] & 19137016) != 0) {
													continue label599;
												}
											}

											var21[var43] = var24 - 1;
											var22[var43] = var25 + 1;
											var43 = var43 + 1 & var23;
											var20[var26 - 1][var27 + 1] = 6;
											var19[var26 - 1][var27 + 1] = var35;
										}
									} while(var26 >= var17 - var2);
								} while(var27 >= var18 - var2);
							} while(var20[var26 + 1][var27 + 1] != 0);
						} while((var32[var33 + var2][var34 + var2] & 19136992) != 0);

						for (var36 = 1; var36 < var2; ++var36) {
							if ((var32[var33 + var36][var34 + var2] & 19137016) != 0 || (var32[var33 + var2][var36 + var34] & 19136995) != 0) {
								continue label622;
							}
						}

						var21[var43] = var24 + 1;
						var22[var43] = var25 + 1;
						var43 = var43 + 1 & var23;
						var20[var26 + 1][var27 + 1] = 12;
						var19[var26 + 1][var27 + 1] = var35;
					}
				}

				var15 = var16;
			}
		}

		int var42 = var0 - (var9 >> 1);
		var17 = var1 - (var10 >> 1);
		var18 = var8.method4234();
		int var37 = var8.method4257();
		int var38;
		int var39;
		if (!var15) {
			var38 = Integer.MAX_VALUE;
			var39 = Integer.MAX_VALUE;
			byte var40 = 10;
			var23 = var3.approxDestinationX;
			var24 = var3.approxDestinationY;
			var25 = var3.approxDestinationSizeX;
			var26 = var3.approxDestinationSizeY;

			for (var27 = var23 - var40; var27 <= var40 + var23; ++var27) {
				for (var28 = var24 - var40; var28 <= var24 + var40; ++var28) {
					var29 = var27 - var42;
					var43 = var28 - var17;
					if (var29 >= 0 && var43 >= 0 && var29 < var9 && var43 < var10 && var11[var29][var43] < 100) {
						var31 = 0;
						if (var27 < var23) {
							var31 = var23 - var27;
						} else if (var27 > var23 + var25 - 1) {
							var31 = var27 - (var23 + var25 - 1);
						}

						int var41 = 0;
						if (var28 < var24) {
							var41 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var41 = var28 - (var26 + var24 - 1);
						}

						var33 = var31 * var31 + var41 * var41;
						if (var33 < var38 || var38 == var33 && var11[var29][var43] < var39) {
							var38 = var33;
							var39 = var11[var29][var43];
							var18 = var27;
							var37 = var28;
						}
					}
				}
			}

			if (var38 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var18 && var37 == var1) {
			var6[0] = var18;
			var7[0] = var37;
			return 0;
		} else {
			byte var44 = 0;
			var13[var44] = var18;
			var38 = var44 + 1;
			var14[var44] = var37;

			int var45;
			for (var39 = var45 = var12[var18 - var42][var37 - var17]; var0 != var18 || var37 != var1; var39 = var12[var18 - var42][var37 - var17]) {
				if (var45 != var39) {
					var45 = var39;
					var13[var38] = var18;
					var14[var38++] = var37;
				}

				if ((var39 & 2) != 0) {
					++var18;
				} else if ((var39 & 8) != 0) {
					--var18;
				}

				if ((var39 & 1) != 0) {
					++var37;
				} else if ((var39 & 4) != 0) {
					--var37;
				}
			}

			var23 = 0;

			while (var38-- > 0) {
				var6[var23] = var13[var38];
				var7[var23++] = var14[var38];
				if (var23 >= var6.length) {
					break;
				}
			}

			return var23;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "86727146"
	)
	static final int method5515(int var0, int var1) {
		int var2 = Canvas.method322(var0 - 1, var1 - 1) + Canvas.method322(1 + var0, var1 - 1) + Canvas.method322(var0 - 1, var1 + 1) + Canvas.method322(1 + var0, 1 + var1);
		int var3 = Canvas.method322(var0 - 1, var1) + Canvas.method322(1 + var0, var1) + Canvas.method322(var0, var1 - 1) + Canvas.method322(var0, 1 + var1);
		int var4 = Canvas.method322(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
