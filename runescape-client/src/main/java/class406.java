import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public final class class406 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "888334248"
	)
	static float method7449(class131 var0, float var1) {
		if (var0 != null && var0.method3020() != 0) {
			if (var1 < (float)var0.field1562[0].field1512) {
				return var0.field1573 == class129.field1548 ? var0.field1562[0].field1516 : class185.method3680(var0, var1, true);
			} else if (var1 > (float)var0.field1562[var0.method3020() - 1].field1512) {
				return var0.field1561 == class129.field1548 ? var0.field1562[var0.method3020() - 1].field1516 : class185.method3680(var0, var1, false);
			} else if (var0.field1559) {
				return var0.field1562[0].field1516;
			} else {
				class126 var2 = var0.method3035(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0D == (double)var2.field1509 && (double)var2.field1514 == 0.0D) {
						var3 = true;
					} else if (var2.field1509 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1514) {
						var4 = true;
					} else if (var2.field1515 != null) {
						if (var0.field1574) {
							float var5 = (float)var2.field1512;
							float var9 = var2.field1516;
							float var6 = 0.33333334F * var2.field1509 + var5;
							float var10 = var2.field1514 * 0.33333334F + var9;
							float var8 = (float)var2.field1515.field1512;
							float var12 = var2.field1515.field1516;
							float var7 = var8 - 0.33333334F * var2.field1515.field1511;
							float var11 = var12 - var2.field1515.field1510 * 0.33333334F;
							float var13;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1558) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var28 = new float[]{var18 / var17, var19 / var17};
										var0.field1563 = 0.33333334F == var28[0] && var28[1] == 0.6666667F;
										float var21 = var28[0];
										float var22 = var28[1];
										if ((double)var28[0] < 0.0D) {
											var28[0] = 0.0F;
										}

										if ((double)var28[1] > 1.0D) {
											var28[1] = 1.0F;
										}

										float var23;
										float var24;
										float var25;
										float var26;
										if ((double)var28[0] > 1.0D || var28[1] < -1.0F) {
											var28[1] = 1.0F - var28[1];
											if (var28[0] < 0.0F) {
												var28[0] = 0.0F;
											}

											if (var28[1] < 0.0F) {
												var28[1] = 0.0F;
											}

											if (var28[0] > 1.0F || var28[1] > 1.0F) {
												var23 = (float)((double)(var28[0] * (var28[1] + (var28[0] - 2.0F))) + (double)var28[1] * ((double)var28[1] - 2.0D) + 1.0D);
												if (class127.field1518 + var23 > 0.0F) {
													if (var28[0] + class127.field1518 < 1.3333334F) {
														var24 = var28[0] - 2.0F;
														var25 = var28[0] - 1.0F;
														var26 = (float)Math.sqrt((double)(var24 * var24 - 4.0F * var25 * var25));
														float var27 = 0.5F * (var26 + -var24);
														if (class127.field1518 + var28[1] > var27) {
															var28[1] = var27 - class127.field1518;
														} else {
															var27 = 0.5F * (-var24 - var26);
															if (var28[1] < class127.field1518 + var27) {
																var28[1] = var27 + class127.field1518;
															}
														}
													} else {
														var28[0] = 1.3333334F - class127.field1518;
														var28[1] = 0.33333334F - class127.field1518;
													}
												}
											}

											var28[1] = 1.0F - var28[1];
										}

										if (var21 != var28[0]) {
											var13 = var28[0] * var17 + var5;
											if ((double)var21 != 0.0D) {
												var15 = (var10 - var9) * var28[0] / var21 + var9;
											}
										}

										if (var28[1] != var22) {
											float var10000 = var5 + var17 * var28[1];
											if (1.0D != (double)var22) {
												var16 = (float)((double)var12 - (1.0D - (double)var28[1]) * (double)(var12 - var11) / (1.0D - (double)var22));
											}
										}

										var0.field1560 = var5;
										var0.field1565 = var8;
										MenuAction.method2087(0.0F, var28[0], var28[1], 1.0F, var0);
										var23 = var15 - var9;
										var24 = var16 - var15;
										var25 = var12 - var16;
										var26 = var24 - var23;
										var0.field1570 = var25 - var24 - var26;
										var0.field1572 = var26 + var26 + var26;
										var0.field1571 = var23 + var23 + var23;
										var0.field1577 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1560 = var5;
								var13 = var8 - var5;
								float var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if ((double)var15 != 0.0D) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if ((double)var15 != 0.0D) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var17 * var13;
								var0.field1581 = (var20 + var19 - var14 - var14) * var18 / var13;
								var0.field1580 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1564 = var16;
								var0.field1569 = var9;
							}

							var0.field1574 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1516;
					} else if (var4) {
						return (float)var2.field1512 != var1 && var2.field1515 != null ? var2.field1515.field1516 : var2.field1516;
					} else {
						return var0.field1558 ? class179.method3545(var0, var1) : Occluder.method4897(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
