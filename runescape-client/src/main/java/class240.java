import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jz")
public class class240 {
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	static IndexedSprite[] field2526;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	class237[] field2528;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method4538() {
		this.field2528 = new class237[1];
		class233 var1 = class233.field2478;
		this.field2528[0] = new class237(var1.field2483, var1.field2475);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Z[I[II)I",
		garbageValue = "-325600919"
	)
	public int method4512(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4515(var1, var2, var3, var4, var5, var6, var7, var8, this.field2528[0]);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Z[I[ILjf;B)I",
		garbageValue = "-92"
	)
	int method4515(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class237 var9) {
		var9.method4458();
		int var10 = var9.method4462();
		int var11 = var9.method4463();
		int[][] var12 = var9.method4465();
		int[][] var13 = var9.method4464();
		int[] var14 = var9.method4466();
		int[] var15 = var9.method4467();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method4516(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method4517(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4531(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method4494();
		int var20 = var9.method4461();
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjv;Lip;Ljf;I)Z",
		garbageValue = "417425771"
	)
	final boolean method4516(int var1, int var2, RouteStrategy var3, CollisionMap var4, class237 var5) {
		int var6 = var5.method4462();
		int var7 = var5.method4463();
		int[][] var8 = var5.method4465();
		int[][] var9 = var5.method4464();
		int[] var10 = var5.method4466();
		int[] var11 = var5.method4467();
		int var12 = var5.method4468();
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
			if (var3.hasArrived(1, var13, var14, var4)) {
				var5.method4483(var13, var14);
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

		var5.method4483(var13, var14);
		return false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILjv;Lip;Ljf;I)Z",
		garbageValue = "-2008444200"
	)
	final boolean method4517(int var1, int var2, RouteStrategy var3, CollisionMap var4, class237 var5) {
		int var6 = var5.method4462();
		int var7 = var5.method4463();
		int[][] var8 = var5.method4465();
		int[][] var9 = var5.method4464();
		int[] var10 = var5.method4466();
		int[] var11 = var5.method4467();
		int var12 = var5.method4468();
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
				var5.method4483(var13, var14);
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

		var5.method4483(var13, var14);
		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Ljf;I)Z",
		garbageValue = "-1600755395"
	)
	final boolean method4531(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class237 var6) {
		int var7 = var6.method4462();
		int var8 = var6.method4463();
		int[][] var9 = var6.method4465();
		int[][] var10 = var6.method4464();
		int[] var11 = var6.method4466();
		int[] var12 = var6.method4467();
		int var13 = var6.method4468();
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
			label309:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label286:
							do {
								if (var27 == var21) {
									var6.method4483(var14, var15);
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
									var6.method4483(var14, var15);
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

										if ((var22[var23 + var26][var24 - 1] & 1076101519) != 0) {
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
										if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 1076101624) != 0) {
											continue label286;
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
					if ((var22[var26 + var23][var3 + var24] & 1076101624) != 0 || (var22[var3 + var23][var24 + var26] & 1076101603) != 0) {
						continue label309;
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-12954708"
	)
	public static int method4537(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5360[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "656489867"
	)
	static int method4536(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class511.topLevelWorldView.plane;
			int var15 = (SoundCache.localPlayer.x >> 7) + class511.topLevelWorldView.baseX;
			int var8 = (SoundCache.localPlayer.y >> 7) + class511.topLevelWorldView.baseY;
			RestClientThreadFactory.getWorldMap().method9011(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				String var16 = "";
				var9 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				RestClientThreadFactory.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				RestClientThreadFactory.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
					RestClientThreadFactory.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
					RestClientThreadFactory.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
					RestClientThreadFactory.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
					RestClientThreadFactory.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = RestClientThreadFactory.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
						var11 = RestClientThreadFactory.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
							var11 = RestClientThreadFactory.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class130.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
								GameObject.method6031(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class130.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
								GameObject.method6031(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class130.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
								var9 = RestClientThreadFactory.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
								var11 = RestClientThreadFactory.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								RestClientThreadFactory.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								RestClientThreadFactory.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								RestClientThreadFactory.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								RestClientThreadFactory.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
									RestClientThreadFactory.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
									RestClientThreadFactory.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
									RestClientThreadFactory.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									RestClientThreadFactory.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
									RestClientThreadFactory.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class130.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1;
										RestClientThreadFactory.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class130.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1;
										RestClientThreadFactory.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = RestClientThreadFactory.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class130.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
										var5 = RestClientThreadFactory.getWorldMap().method9056(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = RestClientThreadFactory.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = RestClientThreadFactory.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
												var4 = class165.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
												var4 = class165.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
												var4 = class165.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
												var4 = class165.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = TilesProjection.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = TilesProjection.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = TilesProjection.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-9"
	)
	static Object method4522(int var0) {
		return Player.method2461((class534)class210.findEnumerated(class534.method9415(), var0));
	}
}
