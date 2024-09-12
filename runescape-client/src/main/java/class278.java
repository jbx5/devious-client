import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class278 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lkt;"
	)
	class275[] field3057;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1744892407"
	)
	public void method5712() {
		this.field3057 = new class275[1];
		class271 var1 = class271.field3007;
		this.field3057[0] = new class275(var1.field3013, var1.field3014);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILks;Lkd;Z[I[II)I",
		garbageValue = "488065841"
	)
	public int method5713(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method5714(var1, var2, var3, var4, var5, var6, var7, var8, this.field3057[0]);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILks;Lkd;Z[I[ILkt;I)I",
		garbageValue = "-461299189"
	)
	int method5714(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class275 var9) {
		var9.method5688();
		int var10 = var9.method5674();
		int var11 = var9.method5673();
		int[][] var12 = var9.method5672();
		int[][] var13 = var9.method5690();
		int[] var14 = var9.method5696();
		int[] var15 = var9.method5676();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method5715(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method5726(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method5720(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method5670();
		int var20 = var9.method5671();
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
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var24 + var26 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILks;Lkd;Lkt;I)Z",
		garbageValue = "1884266838"
	)
	final boolean method5715(int var1, int var2, RouteStrategy var3, CollisionMap var4, class275 var5) {
		int var6 = var5.method5674();
		int var7 = var5.method5673();
		int[][] var8 = var5.method5672();
		int[][] var9 = var5.method5690();
		int[] var10 = var5.method5696();
		int[] var11 = var5.method5676();
		int var12 = var5.method5667();
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
				var5.method5669(var13, var14);
				return true;
			}

			int var24 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 1076101384) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var24;
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && (var21[var22 + 1][var23] & 1076101504) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var24;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var24;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var24;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var24;
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 1076101507) == 0 && (var21[var22 + 1][var23] & 1076101504) == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var24;
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var24;
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 1] & 1076101600) == 0 && (var21[var22 + 1][var23] & 1076101504) == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}

		var5.method5669(var13, var14);
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILks;Lkd;Lkt;I)Z",
		garbageValue = "-1529842740"
	)
	final boolean method5726(int var1, int var2, RouteStrategy var3, CollisionMap var4, class275 var5) {
		int var6 = var5.method5674();
		int var7 = var5.method5673();
		int[][] var8 = var5.method5672();
		int[][] var9 = var5.method5690();
		int[] var10 = var5.method5696();
		int[] var11 = var5.method5676();
		int var12 = var5.method5667();
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
				var5.method5669(var13, var14);
				return true;
			}

			int var24 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 1076101390) == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var24;
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 1076101507) == 0 && (var21[var22 + 2][var23 + 1] & 1076101600) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var24;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 1076101390) == 0 && (var21[var22 + 1][var23 - 1] & 1076101507) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var24;
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 1076101432) == 0 && (var21[var22 + 1][var23 + 2] & 1076101600) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var24;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22][var23 - 1] & 1076101519) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var24;
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 1076101519) == 0 && (var21[var22 + 2][var23 - 1] & 1076101507) == 0 && (var21[var22 + 2][var23] & 1076101603) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var24;
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 1076101438) == 0 && (var21[var22 - 1][var23 + 2] & 1076101432) == 0 && (var21[var22][var23 + 2] & 1076101624) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var24;
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 1076101624) == 0 && (var21[var22 + 2][var23 + 2] & 1076101600) == 0 && (var21[var22 + 2][var23 + 1] & 1076101603) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}

		var5.method5669(var13, var14);
		return false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILks;Lkd;Lkt;B)Z",
		garbageValue = "-69"
	)
	final boolean method5720(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class275 var6) {
		int var7 = var6.method5674();
		int var8 = var6.method5673();
		int[][] var9 = var6.method5672();
		int[][] var10 = var6.method5690();
		int[] var11 = var6.method5696();
		int[] var12 = var6.method5676();
		int var13 = var6.method5667();
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
			label305:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label282:
							do {
								if (var27 == var21) {
									var6.method5669(var14, var15);
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
									var6.method5669(var14, var15);
									return true;
								}

								var25 = var9[var16][var17] + 1;
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var3 + var24 - 1] & 1076101432) == 0) {
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

										if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && (var22[var3 + var23][var24] & 1076101507) == 0 && (var22[var3 + var23][var3 + var24 - 1] & 1076101600) == 0) {
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

										if ((var22[var3 + var23][var26 + var24] & 1076101603) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 1076101390) == 0 && (var22[var3 + var23 - 1][var24 - 1] & 1076101507) == 0) {
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

										if ((var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && (var22[var23][var3 + var24] & 1076101432) == 0 && (var22[var3 + var23 - 1][var3 + var24] & 1076101600) == 0) {
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

										if ((var22[var23 + var26][var3 + var24] & 1076101624) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
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

										if ((var22[var23 - 1][var26 + (var24 - 1)] & 1076101438) != 0 || (var22[var26 + (var23 - 1)][var24 - 1] & 1076101519) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 1076101507) == 0) {
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

										if ((var22[var3 + var23][var26 + (var24 - 1)] & 1076101603) != 0 || (var22[var23 + var26][var24 - 1] & 1076101519) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var3 + var24] & 1076101432) == 0) {
									for (var26 = 1; var26 < var3; ++var26) {
										if ((var22[var23 - 1][var26 + var24] & 1076101438) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 1076101624) != 0) {
											continue label282;
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
				} while((var22[var3 + var23][var3 + var24] & 1076101600) != 0);

				for (var26 = 1; var26 < var3; ++var26) {
					if ((var22[var23 + var26][var3 + var24] & 1076101624) != 0 || (var22[var3 + var23][var24 + var26] & 1076101603) != 0) {
						continue label305;
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
}
