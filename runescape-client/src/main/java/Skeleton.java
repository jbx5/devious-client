import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 759892495
	)
	@Export("id")
	int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 766318001
	)
	@Export("count")
	int count;
	@ObfuscatedName("ap")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("aa")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class227 field2560;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2560 = new class227(var3, var4);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "657439907"
	)
	public int method4520() {
		return this.count;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-896390577"
	)
	public class227 method4517() {
		return this.field2560;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FB)F",
		garbageValue = "0"
	)
	static float method4516(class130 var0, float var1) {
		if (var0 != null && var0.method3000() != 0) {
			if (var1 < (float)var0.field1551[0].field1492) {
				return var0.field1549 == class128.field1530 ? var0.field1551[0].field1495 : UserComparator4.method2864(var0, var1, true);
			} else if (var1 > (float)var0.field1551[var0.method3000() - 1].field1492) {
				return var0.field1571 == class128.field1530 ? var0.field1551[var0.method3000() - 1].field1495 : UserComparator4.method2864(var0, var1, false);
			} else if (var0.field1548) {
				return var0.field1551[0].field1495;
			} else {
				class125 var2 = var0.method2999(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (0.0D == (double)var2.field1496 && (double)var2.field1497 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1496 && Float.MAX_VALUE == var2.field1497) {
						var4 = true;
					} else if (var2.field1498 != null) {
						if (var0.field1564) {
							var5 = (float)var2.field1492;
							float var9 = var2.field1495;
							var6 = 0.33333334F * var2.field1496 + var5;
							float var10 = var2.field1497 * 0.33333334F + var9;
							float var8 = (float)var2.field1498.field1492;
							float var12 = var2.field1498.field1495;
							float var7 = var8 - var2.field1498.field1503 * 0.33333334F;
							float var11 = var12 - var2.field1498.field1493 * 0.33333334F;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1563) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1550 = 0.33333334F == var29[0] && var29[1] == 0.6666667F;
										float var21 = var29[0];
										float var22 = var29[1];
										if ((double)var29[0] < 0.0D) {
											var29[0] = 0.0F;
										}

										if ((double)var29[1] > 1.0D) {
											var29[1] = 1.0F;
										}

										if ((double)var29[0] > 1.0D || var29[1] < -1.0F) {
											class160.method3282(var29);
										}

										float var10000;
										if (var29[0] != var21) {
											var10000 = var5 + var17 * var29[0];
											if (0.0D != (double)var21) {
												var15 = (var10 - var9) * var29[0] / var21 + var9;
											}
										}

										if (var22 != var29[1]) {
											var10000 = var5 + var17 * var29[1];
											if (1.0D != (double)var22) {
												var16 = (float)((double)var12 - (1.0D - (double)var29[1]) * (double)(var12 - var11) / (1.0D - (double)var22));
											}
										}

										var0.field1553 = var5;
										var0.field1554 = var8;
										float var23 = var29[0];
										float var24 = var29[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1552 = var27 - var26 - var28;
										var0.field1557 = var28 + var28 + var28;
										var0.field1556 = var25 + var25 + var25;
										var0.field1555 = 0.0F;
										var25 = var15 - var9;
										var26 = var16 - var15;
										var27 = var12 - var16;
										var28 = var26 - var25;
										var0.field1547 = var27 - var26 - var28;
										var0.field1561 = var28 + var28 + var28;
										var0.field1560 = var25 + var25 + var25;
										var0.field1572 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1553 = var5;
								float var13 = var8 - var5;
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
								var19 = var16 * var13;
								float var20 = var17 * var13;
								var0.field1555 = var18 * (var19 + var20 - var14 - var14) / var13;
								var0.field1556 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1557 = var16;
								var0.field1552 = var9;
							}

							var0.field1564 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1495;
					} else if (var4) {
						return (float)var2.field1492 != var1 && var2.field1498 != null ? var2.field1498.field1495 : var2.field1495;
					} else if (var0.field1563) {
						return class454.method8290(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1553;
							var5 = var0.field1552 + var6 * ((var6 * var0.field1555 + var0.field1556) * var6 + var0.field1557);
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1406508387"
	)
	public static void method4523(int var0) {
		if (var0 != -1) {
			if (class316.Widget_loadedInterfaces[var0]) {
				Decimator.Widget_archive.clearFilesGroup(var0);
				if (PacketBufferNode.Widget_interfaceComponents[var0] != null) {
					for (int var1 = 0; var1 < PacketBufferNode.Widget_interfaceComponents[var0].length; ++var1) {
						if (PacketBufferNode.Widget_interfaceComponents[var0][var1] != null) {
							PacketBufferNode.Widget_interfaceComponents[var0][var1] = null;
						}
					}

					PacketBufferNode.Widget_interfaceComponents[var0] = null;
					class316.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
