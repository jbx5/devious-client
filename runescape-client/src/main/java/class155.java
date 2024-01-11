import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class155 extends class159 {
	@ObfuscatedName("as")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field1725;
	@ObfuscatedName("am")
	String field1724;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1792190605
	)
	int field1727;
	@ObfuscatedName("af")
	byte field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1724 = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1724 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1727 = var1.readUnsignedShort();
		this.field1722 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1724);
		var2.world = this.field1727;
		var2.rank = this.field1722;
		var1.addMember(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfx;FB)F",
		garbageValue = "0"
	)
	static float method3423(class131 var0, float var1) {
		if (var0 != null && var0.method3088() != 0) {
			if (var1 < (float)var0.field1545[0].field1483) {
				return var0.field1539 == class129.field1513 ? var0.field1545[0].field1480 : UserComparator8.method2944(var0, var1, true);
			} else if (var1 > (float)var0.field1545[var0.method3088() - 1].field1483) {
				return var0.field1530 == class129.field1513 ? var0.field1545[var0.method3088() - 1].field1480 : UserComparator8.method2944(var0, var1, false);
			} else if (var0.field1527) {
				return var0.field1545[0].field1480;
			} else {
				class126 var2 = var0.method3091(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1481 == 0.0D && (double)var2.field1484 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1481 && Float.MAX_VALUE == var2.field1484) {
						var4 = true;
					} else if (var2.field1485 != null) {
						if (var0.field1543) {
							var5 = (float)var2.field1483;
							float var9 = var2.field1480;
							var6 = var5 + var2.field1481 * 0.33333334F;
							float var10 = var2.field1484 * 0.33333334F + var9;
							float var8 = (float)var2.field1485.field1483;
							float var12 = var2.field1485.field1480;
							var7 = var8 - 0.33333334F * var2.field1485.field1482;
							float var11 = var12 - 0.33333334F * var2.field1485.field1479;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1541) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0D != (double)var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1532 = 0.33333334F == var29[0] && 0.6666667F == var29[1];
										float var21 = var29[0];
										float var22 = var29[1];
										if ((double)var29[0] < 0.0D) {
											var29[0] = 0.0F;
										}

										if ((double)var29[1] > 1.0D) {
											var29[1] = 1.0F;
										}

										if ((double)var29[0] > 1.0D || var29[1] < -1.0F) {
											AttackOption.method2739(var29);
										}

										if (var29[0] != var21) {
											float var10000 = var5 + var17 * var29[0];
											if ((double)var21 != 0.0D) {
												var15 = var9 + var29[0] * (var10 - var9) / var21;
											}
										}

										if (var29[1] != var22) {
											var14 = var17 * var29[1] + var5;
											if (1.0D != (double)var22) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var29[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1533 = var5;
										var0.field1534 = var8;
										float var23 = var29[0];
										float var24 = var29[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1538 = var27 - var26 - var28;
										var0.field1546 = var28 + var28 + var28;
										var0.field1540 = var25 + var25 + var25;
										var0.field1535 = 0.0F;
										World.method1863(var9, var15, var16, var12, var0);
									}
								}
							} else if (var0 != null) {
								var0.field1533 = var5;
								float var13 = var8 - var5;
								var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if ((double)var15 != 0.0D) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0D != (double)var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var17 * var13;
								var0.field1535 = (var20 + var19 - var14 - var14) * var18 / var13;
								var0.field1540 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1546 = var16;
								var0.field1538 = var9;
							}

							var0.field1543 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1480;
					} else if (var4) {
						return (float)var2.field1483 != var1 && var2.field1485 != null ? var2.field1485.field1480 : var2.field1480;
					} else if (var0.field1541) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1533 == var1) {
								var6 = 0.0F;
							} else if (var1 == var0.field1534) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1533) / (var0.field1534 - var0.field1533);
							}

							if (var0.field1532) {
								var7 = var6;
							} else {
								class127.field1491[3] = var0.field1538;
								class127.field1491[2] = var0.field1546;
								class127.field1491[1] = var0.field1540;
								class127.field1491[0] = var0.field1535 - var6;
								class127.field1492[0] = 0.0F;
								class127.field1492[1] = 0.0F;
								class127.field1492[2] = 0.0F;
								class127.field1492[3] = 0.0F;
								class127.field1492[4] = 0.0F;
								int var30 = HttpAuthenticationHeader.method8069(class127.field1491, 3, 0.0F, true, 1.0F, true, class127.field1492);
								if (var30 == 1) {
									var7 = class127.field1492[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var0.field1537 + ((var0.field1542 * var7 + var0.field1529) * var7 + var0.field1531) * var7;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1533;
							var5 = var0.field1538 + var6 * ((var0.field1535 * var6 + var0.field1540) * var6 + var0.field1546);
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2048505706"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldj;",
		garbageValue = "0"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		BufferedSink.method8450(var1);
		Widget var4 = class380.widgetDefinition.method6348(var0);
		FaceNormal.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			FaceNormal.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class195.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			WorldMapScaleHandler.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
