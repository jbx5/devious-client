import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public abstract class class297 implements class299 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -27562183
	)
	protected int field3147;

	@ObfuscatedSignature(
		descriptor = "(Lox;Lpe;I)V"
	)
	protected class297(StudioGame var1, Language var2, int var3) {
		this.field3147 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Luh;",
		garbageValue = "-113"
	)
	public static class521 method5966(int var0) {
		int var1 = class519.field5119[var0];
		if (var1 == 1) {
			return class521.field5125;
		} else if (var1 == 2) {
			return class521.field5126;
		} else {
			return var1 == 3 ? class521.field5128 : null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FZI)F",
		garbageValue = "587235743"
	)
	static float method5965(class132 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3091() != 0) {
			float var4 = (float)var0.field1559[0].field1501;
			float var5 = (float)var0.field1559[var0.method3091() - 1].field1501;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1559[0].field1500;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1557 == class130.field1544) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1557 != class130.field1540 && var0.field1557 != class130.field1541) {
						if (var0.field1557 == class130.field1539) {
							var11 = var4 - var1;
							var16 = var0.field1559[0].field1503;
							var17 = var0.field1559[0].field1502;
							var3 = var0.field1559[0].field1500;
							if ((double)var16 != 0.0D) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1574 == class130.field1544) {
					if (0.0D != (double)var10) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1574 != class130.field1540 && var0.field1574 != class130.field1541) {
					if (var0.field1574 == class130.field1539) {
						var11 = var1 - var5;
						var16 = var0.field1559[var0.method3091() - 1].field1499;
						var17 = var0.field1559[var0.method3091() - 1].field1506;
						var3 = var0.field1559[var0.method3091() - 1].field1500;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = Tile.method5276(var0, var11);
				float var18;
				if (var2 && var0.field1557 == class130.field1541) {
					var18 = var0.field1559[var0.method3091() - 1].field1500 - var0.field1559[0].field1500;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1574 == class130.field1541) {
					var18 = var0.field1559[var0.method3091() - 1].field1500 - var0.field1559[0].field1500;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}
