import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	field1273(2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	field1279(4);

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	22827639)

	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ldi;FB)F", garbageValue = 
	"76")

	static float method2392(class117 var0, float var1) {
		if ((var0 != null) && (var0.method2706() != 0)) {
			if (var1 < ((float) (var0.field1430[0].field1384))) {
				return var0.field1428 == class116.field1420 ? var0.field1430[0].field1385 : class202.method4111(var0, var1, true);
			} else if (var1 > ((float) (var0.field1430[var0.method2706() - 1].field1384))) {
				return var0.field1429 == class116.field1420 ? var0.field1430[var0.method2706() - 1].field1385 : class202.method4111(var0, var1, false);
			} else if (var0.field1427) {
				return var0.field1430[0].field1385;
			} else {
				class113 var2 = var0.method2705(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if ((0.0 == ((double) (var2.field1388))) && (0.0 == ((double) (var2.field1389)))) {
						var3 = true;
					} else if ((Float.MAX_VALUE == var2.field1388) && (var2.field1389 == Float.MAX_VALUE)) {
						var4 = true;
					} else if (var2.field1392 != null) {
						if (var0.field1442) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = ((float) (var2.field1384));
							var6[0] = var2.field1385;
							var5[1] = var5[0] + (var2.field1388 * 0.33333334F);
							var6[1] = (var2.field1389 * 0.33333334F) + var6[0];
							var5[3] = ((float) (var2.field1392.field1384));
							var6[3] = var2.field1392.field1385;
							var5[2] = var5[3] - (var2.field1392.field1386 * 0.33333334F);
							var6[2] = var6[3] - (0.33333334F * var2.field1392.field1390);
							float var7;
							float var8;
							float var9;
							float var12;
							float var13;
							if (var0.field1434) {
								if (var0 != null) {
									var7 = var5[3] - var5[0];
									if (0.0 != ((double) (var7))) {
										var8 = var5[1] - var5[0];
										var9 = var5[2] - var5[0];
										Float var15 = var8 / var7;
										Float var16 = var9 / var7;
										var0.field1438 = (var15 == 0.33333334F) && (var16 == 0.6666667F);
										var12 = var15;
										var13 = var16;
										if (((double) (var15)) < 0.0) {
											var15 = 0.0F;
										}

										if (((double) (var16)) > 1.0) {
											var16 = 1.0F;
										}

										if ((((double) (var15)) > 1.0) || (var16 < (-1.0F))) {
											class11.method116(var15, var16);
										}

										if (var15 != var12) {
											var5[1] = var5[0] + (var15 * var7);
											if (((double) (var12)) != 0.0) {
												var6[1] = var6[0] + (((var6[1] - var6[0]) * var15) / var12);
											}
										}

										if (var16 != var13) {
											var5[2] = var5[0] + (var16 * var7);
											if (1.0 != ((double) (var13))) {
												var6[2] = ((float) (((double) (var6[3])) - ((((double) (var6[3] - var6[2])) * (1.0 - ((double) (var16)))) / (1.0 - ((double) (var13))))));
											}
										}

										var0.field1432 = var5[0];
										var0.field1433 = var5[3];
										Frames.method4316(0.0F, var15, var16, 1.0F, var0.field1440);
										Frames.method4316(var6[0], var6[1], var6[2], var6[3], var0.field1435);
									}
								}
							} else if (var0 != null) {
								var0.field1432 = var5[0];
								var7 = var5[3] - var5[0];
								var8 = var6[3] - var6[0];
								var9 = var5[1] - var5[0];
								float var10 = 0.0F;
								float var11 = 0.0F;
								if (0.0 != ((double) (var9))) {
									var10 = (var6[1] - var6[0]) / var9;
								}

								var9 = var5[3] - var5[2];
								if (0.0 != ((double) (var9))) {
									var11 = (var6[3] - var6[2]) / var9;
								}

								var12 = 1.0F / (var7 * var7);
								var13 = var7 * var10;
								float var14 = var11 * var7;
								var0.field1440[0] = (var12 * (((var13 + var14) - var8) - var8)) / var7;
								var0.field1440[1] = var12 * (((((var8 + var8) + var8) - var13) - var13) - var14);
								var0.field1440[2] = var10;
								var0.field1440[3] = var6[0];
							}

							var0.field1442 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1385;
					} else if (var4) {
						return (((float) (var2.field1384)) != var1) && (var2.field1392 != null) ? var2.field1392.field1385 : var2.field1385;
					} else if (var0.field1434) {
						return VarbitComposition.method3555(var0, var1);
					} else {
						float var18;
						if (var0 == null) {
							var18 = 0.0F;
						} else {
							float var17 = var1 - var0.field1432;
							var18 = var0.field1440[3] + ((var0.field1440[2] + (var17 * (var0.field1440[1] + (var0.field1440[0] * var17)))) * var17);
						}

						return var18;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}}