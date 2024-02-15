import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1250509033
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -714916873
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -961502115
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1006789137
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1884419007
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lla;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1588374161
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1842825159
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ag")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("am")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 707406203
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -556659883
	)
	int field2811;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -342018933
	)
	int field2794;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -685978953
	)
	int field2813;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FB)F",
		garbageValue = "2"
	)
	static float method5276(class132 var0, float var1) {
		if (var0 != null && var0.method3091() != 0) {
			if (var1 < (float)var0.field1559[0].field1501) {
				return var0.field1557 == class130.field1548 ? var0.field1559[0].field1500 : class297.method5965(var0, var1, true);
			} else if (var1 > (float)var0.field1559[var0.method3091() - 1].field1501) {
				return var0.field1574 == class130.field1548 ? var0.field1559[var0.method3091() - 1].field1500 : class297.method5965(var0, var1, false);
			} else if (var0.field1555) {
				return var0.field1559[0].field1500;
			} else {
				class127 var2 = var0.method3090(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1499 == 0.0D && 0.0D == (double)var2.field1506) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1499 && Float.MAX_VALUE == var2.field1506) {
						var4 = true;
					} else if (var2.field1505 != null) {
						if (var0.field1571) {
							var5 = (float)var2.field1501;
							float var9 = var2.field1500;
							var6 = var2.field1499 * 0.33333334F + var5;
							float var10 = var2.field1506 * 0.33333334F + var9;
							float var8 = (float)var2.field1505.field1501;
							float var12 = var2.field1505.field1500;
							var7 = var8 - var2.field1505.field1503 * 0.33333334F;
							float var11 = var12 - var2.field1505.field1502 * 0.33333334F;
							if (var0.field1565) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) {
									float var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.field1560 = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											var20[1] = 1.0F - var20[1];
											if (var20[0] < 0.0F) {
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) {
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) {
												float var23 = (float)((double)var20[1] * ((double)var20[1] - 2.0D) + (double)((var20[0] - 2.0F + var20[1]) * var20[0]) + 1.0D);
												if (class128.field1512 + var23 > 0.0F) {
													if (var20[0] + class128.field1512 < 1.3333334F) {
														float var24 = var20[0] - 2.0F;
														float var25 = var20[0] - 1.0F;
														float var26 = (float)Math.sqrt((double)(var24 * var24 - var25 * var25 * 4.0F));
														float var27 = (var26 + -var24) * 0.5F;
														if (class128.field1512 + var20[1] > var27) {
															var20[1] = var27 - class128.field1512;
														} else {
															var27 = (-var24 - var26) * 0.5F;
															if (var20[1] < var27 + class128.field1512) {
																var20[1] = class128.field1512 + var27;
															}
														}
													} else {
														var20[0] = 1.3333334F - class128.field1512;
														var20[1] = 0.33333334F - class128.field1512;
													}
												}
											}

											var20[1] = 1.0F - var20[1];
										}

										if (var21 != var20[0]) {
											float var13 = var17 * var20[0] + var5;
											if (0.0D != (double)var21) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var20[1] * var17 + var5;
											if ((double)var22 != 1.0D) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1561 = var5;
										var0.field1556 = var8;
										HttpMethod.method67(0.0F, var20[0], var20[1], 1.0F, var0);
										class93.method2443(var9, var15, var16, var12, var0);
									}
								}
							} else {
								LoginPacket.method3208(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1571 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1500;
					} else if (var4) {
						return (float)var2.field1501 != var1 && var2.field1505 != null ? var2.field1505.field1500 : var2.field1500;
					} else if (var0.field1565) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1561 == var1) {
								var6 = 0.0F;
							} else if (var1 == var0.field1556) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1561) / (var0.field1556 - var0.field1561);
							}

							if (var0.field1560) {
								var7 = var6;
							} else {
								class128.field1511[3] = var0.field1566;
								class128.field1511[2] = var0.field1562;
								class128.field1511[1] = var0.field1564;
								class128.field1511[0] = var0.field1563 - var6;
								class128.field1510[0] = 0.0F;
								class128.field1510[1] = 0.0F;
								class128.field1510[2] = 0.0F;
								class128.field1510[3] = 0.0F;
								class128.field1510[4] = 0.0F;
								int var28 = class148.method3244(class128.field1511, 3, 0.0F, true, 1.0F, true, class128.field1510);
								if (var28 == 1) {
									var7 = class128.field1510[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var0.field1567 + var7 * (var0.field1569 + var7 * (var0.field1573 + var0.field1570 * var7));
						}

						return var5;
					} else {
						return ArchiveLoader.method2325(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
