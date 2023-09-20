import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public abstract class class183 {
	@ObfuscatedName("ti")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ax")
	String field1888;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;Ljava/lang/String;)V"
	)
	class183(class172 var1, String var2) {
		this.this$0 = var1;
		this.field1888 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1007456210"
	)
	public abstract int vmethod3575();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1667250407"
	)
	public String vmethod3574() {
		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-19272"
	)
	public int vmethod3573() {
		return -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "4207"
	)
	public String method3576() {
		return this.field1888;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FB)F",
		garbageValue = "-84"
	)
	static float method3586(class132 var0, float var1) {
		if (var0 != null && var0.method3017() != 0) {
			if (var1 < (float)var0.field1541[0].field1492) {
				return var0.field1547 == class130.field1524 ? var0.field1541[0].field1490 : class104.method2712(var0, var1, true);
			} else if (var1 > (float)var0.field1541[var0.method3017() - 1].field1492) {
				return var0.field1553 == class130.field1524 ? var0.field1541[var0.method3017() - 1].field1490 : class104.method2712(var0, var1, false);
			} else if (var0.field1548) {
				return var0.field1541[0].field1490;
			} else {
				class127 var2 = var0.method3030(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1489 == 0.0D && 0.0D == (double)var2.field1494) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1489 && Float.MAX_VALUE == var2.field1494) {
						var4 = true;
					} else if (var2.field1493 != null) {
						if (var0.field1552) {
							var5 = (float)var2.field1492;
							float var9 = var2.field1490;
							var6 = var5 + var2.field1489 * 0.33333334F;
							float var10 = var2.field1494 * 0.33333334F + var9;
							float var8 = (float)var2.field1493.field1492;
							float var12 = var2.field1493.field1490;
							var7 = var8 - var2.field1493.field1491 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1493.field1495;
							if (var0.field1558) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) {
									float var17 = var8 - var5;
									if (0.0D != (double)var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.field1556 = 0.33333334F == var20[0] && var20[1] == 0.6666667F;
										float var21 = var20[0];
										float var22 = var20[1];
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										float var23;
										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											var20[1] = 1.0F - var20[1];
											if (var20[0] < 0.0F) {
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) {
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) {
												var23 = (float)(1.0D + (double)(var20[0] * (var20[0] - 2.0F + var20[1])) + (double)var20[1] * ((double)var20[1] - 2.0D));
												if (class128.field1501 + var23 > 0.0F) {
													class10.method104(var20);
												}
											}

											var20[1] = 1.0F - var20[1];
										}

										if (var21 != var20[0]) {
											float var13 = var17 * var20[0] + var5;
											if ((double)var21 != 0.0D) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var20[1] * var17 + var5;
											if (1.0D != (double)var22) {
												var16 = (float)((double)var12 - (1.0D - (double)var20[1]) * (double)(var12 - var11) / (1.0D - (double)var22));
											}
										}

										var0.field1543 = var5;
										var0.field1544 = var8;
										class315.method5905(0.0F, var20[0], var20[1], 1.0F, var0);
										var23 = var15 - var9;
										float var24 = var16 - var15;
										float var25 = var12 - var16;
										float var26 = var24 - var23;
										var0.field1554 = var25 - var24 - var26;
										var0.field1551 = var26 + var26 + var26;
										var0.field1550 = var23 + var23 + var23;
										var0.field1549 = var9;
									}
								}
							} else {
								TileItem.method2727(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1552 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1490;
					} else if (var4) {
						return (float)var2.field1492 != var1 && var2.field1493 != null ? var2.field1493.field1490 : var2.field1490;
					} else if (var0.field1558) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1543 == var1) {
								var6 = 0.0F;
							} else if (var0.field1544 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1543) / (var0.field1544 - var0.field1543);
							}

							if (var0.field1556) {
								var7 = var6;
							} else {
								class128.field1502[3] = var0.field1542;
								class128.field1502[2] = var0.field1538;
								class128.field1502[1] = var0.field1546;
								class128.field1502[0] = var0.field1545 - var6;
								class128.field1503[0] = 0.0F;
								class128.field1503[1] = 0.0F;
								class128.field1503[2] = 0.0F;
								class128.field1503[3] = 0.0F;
								class128.field1503[4] = 0.0F;
								int var27 = PacketBufferNode.method5873(class128.field1502, 3, 0.0F, true, 1.0F, true, class128.field1503);
								if (var27 == 1) {
									var7 = class128.field1503[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var7 * ((var0.field1554 * var7 + var0.field1551) * var7 + var0.field1550) + var0.field1549;
						}

						return var5;
					} else {
						return DevicePcmPlayerProvider.method311(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lol;",
		garbageValue = "654321032"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4267, PlayerType.field4285, PlayerType.field4273, PlayerType.PlayerType_ironman, PlayerType.field4278, PlayerType.PlayerType_ultimateIronman, PlayerType.field4275, PlayerType.field4277, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.field4272, PlayerType.PlayerType_jagexModerator, PlayerType.field4276, PlayerType.field4274, PlayerType.field4279, PlayerType.PlayerType_normal, PlayerType.field4270};
	}
}
