import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class104 {
	@ObfuscatedName("aa")
	public static short[][] field1342;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -486293299
	)
	int field1343;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 376070003
	)
	int field1338;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 557862203
	)
	int field1339;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 44402109
	)
	int field1341;

	class104(int var1, int var2, int var3, int var4) {
		this.field1343 = var1;
		this.field1338 = var2;
		this.field1339 = var3;
		this.field1341 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	int method2706() {
		return this.field1343;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "433721125"
	)
	int method2695() {
		return this.field1338;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1676197536"
	)
	int method2707() {
		return this.field1339;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method2694() {
		return this.field1341;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FZI)F",
		garbageValue = "-1944566118"
	)
	static float method2712(class132 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3017() != 0) {
			float var4 = (float)var0.field1541[0].field1492;
			float var5 = (float)var0.field1541[var0.method3017() - 1].field1492;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1541[0].field1490;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1547 == class130.field1522) {
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1547 != class130.field1525 && var0.field1547 != class130.field1526) {
						if (var0.field1547 == class130.field1523) {
							var11 = var4 - var1;
							var16 = var0.field1541[0].field1491;
							var17 = var0.field1541[0].field1495;
							var3 = var0.field1541[0].field1490;
							if ((double)var16 != 0.0D) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1553 == class130.field1522) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1553 != class130.field1525 && var0.field1553 != class130.field1526) {
					if (var0.field1553 == class130.field1523) {
						var11 = var1 - var5;
						var16 = var0.field1541[var0.method3017() - 1].field1489;
						var17 = var0.field1541[var0.method3017() - 1].field1494;
						var3 = var0.field1541[var0.method3017() - 1].field1490;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = class183.method3586(var0, var11);
				float var18;
				if (var2 && var0.field1547 == class130.field1526) {
					var18 = var0.field1541[var0.method3017() - 1].field1490 - var0.field1541[0].field1490;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1553 == class130.field1526) {
					var18 = var0.field1541[var0.method3017() - 1].field1490 - var0.field1541[0].field1490;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lul;IIIIIIB)V",
		garbageValue = "76"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var8;
		if (var7) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class530.method9468(932731 + var4, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.readUnsignedByte();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					VertexNormal.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					SecureRandomFuture.Tiles_shapes[var1][var2][var3] = (byte)((var8 - 2) / 4);
					class199.field2004[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					World.Tiles_underlays[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var8 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1642041169"
	)
	static int method2711(int var0, Script var1, boolean var2) {
		return 2;
	}
}
