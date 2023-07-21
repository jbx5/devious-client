import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field5052;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ar")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("am")
	int[][] field5051;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1236052801
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1416782085"
	)
	void method8995(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method8997(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-444511694"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1836238392"
	)
	void method8997(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5051 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				this.columnTypes[var4] = class10.method103(var1, var6);
				this.field5051[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	void method9008() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "972688880"
	)
	public static int method9009(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class126.field1494;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44;
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
				var10 = var42 && var43 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class453 var11 = new class453(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = (float)var13 * var9[var13];
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method9009(var12, var1 - 1, var2, false, var4, false, var41);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = class328.method6114(var9, var1, var2);
							if (Math.abs(var18) <= var44 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var20 == var14) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var41[var20];
						}

						var17 = class328.method6114(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = class328.method6114(var11.field4757, var11.field4758, var16);
							float var23;
							if (Math.abs(var26) < class126.field1494) {
								var23 = var16;
							} else {
								float var27 = class328.method6114(var11.field4757, var11.field4758, var19);
								if (Math.abs(var27) < class126.field1494) {
									var23 = var19;
								} else {
									float var28 = 0.0F;
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var35 = 0.0F;
									boolean var36 = true;
									boolean var37 = false;

									do {
										var37 = false;
										if (var36) {
											var28 = var24;
											var35 = var26;
											var29 = var25 - var24;
											var30 = var29;
											var36 = false;
										}

										if (Math.abs(var35) < Math.abs(var27)) {
											var24 = var25;
											var25 = var28;
											var28 = var24;
											var26 = var27;
											var27 = var35;
											var35 = var26;
										}

										float var38 = class126.field1496 * Math.abs(var25) + 0.0F;
										float var39 = 0.5F * (var28 - var25);
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var24 == var28) {
													var31 = 2.0F * var39 * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = ((var32 - var33) * 2.0F * var39 * var32 - (var25 - var24) * (var33 - 1.0F)) * var34;
													var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var32 * 3.0F * var39 - Math.abs(var32 * var38) && var31 < Math.abs(var32 * 0.5F * var34)) {
													var29 = var31 / var32;
												} else {
													var29 = var39;
													var30 = var39;
												}
											} else {
												var29 = var39;
												var30 = var39;
											}

											var24 = var25;
											var26 = var27;
											if (Math.abs(var29) > var38) {
												var25 += var29;
											} else if ((double)var39 > 0.0D) {
												var25 += var38;
											} else {
												var25 -= var38;
											}

											var27 = class328.method6114(var11.field4757, var11.field4758, var25);
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
												var36 = true;
												var37 = true;
											} else {
												var37 = true;
											}
										}
									} while(var37);

									var23 = var25;
								}
							}

							var6[var22] = var23;
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1993931981"
	)
	static void method9006() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (Login.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = ArchiveLoader.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = VarbitComposition.getWidget(var4);
					if (var5 != null) {
						class200.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
