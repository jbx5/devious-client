import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("Players")
public class Players {
	@ObfuscatedName("af")
	static byte[] field1382;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	static class233[] field1383;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lur;"
	)
	static Buffer[] field1395;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1603190335
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ab")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 885805789
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ad")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("al")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("as")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ag")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 626407897
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static Buffer field1384;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static Bounds field1381;

	static {
		field1382 = new byte[2048];
		field1383 = new class233[2048];
		field1395 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1384 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "1367784165"
	)
	public static int method2712(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class127.field1518;
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
				class472 var11 = new class472(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method2712(var12, var1 - 1, var2, false, var4, false, var41);
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
							var18 = class366.method6871(var9, var1, var2);
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

						var17 = class366.method6871(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var14 != var20 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = class366.method6871(var11.field4891, var11.field4890, var16);
							float var23;
							if (Math.abs(var26) < class127.field1518) {
								var23 = var16;
							} else {
								float var27 = class366.method6871(var11.field4891, var11.field4890, var19);
								if (Math.abs(var27) < class127.field1518) {
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

										float var38 = class127.field1522 * Math.abs(var25) + 0.0F;
										float var39 = (var28 - var25) * 0.5F;
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var28 == var24) {
													var31 = var39 * 2.0F * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * (var32 * 2.0F * var39 * (var32 - var33) - (var33 - 1.0F) * (var25 - var24));
													var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var39 * 3.0F * var32 - Math.abs(var32 * var38) && var31 < Math.abs(var32 * 0.5F * var34)) {
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

											var27 = class366.method6871(var11.field4891, var11.field4890, var25);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "406667163"
	)
	static boolean method2715(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "986590976"
	)
	public static int method2714(int var0) {
		return class93.method2381(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "-73"
	)
	static final void method2716(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1251 * 128 + var0.field1249 * 64;
		int var3 = var0.field1238 * 128 + var0.field1249 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1257 = 0;
		var0.orientation = var0.field1203;
	}
}
