import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cg")
public class class92 {
	@ObfuscatedName("nl")
	@ObfuscatedGetter(intValue = 
	-26736591)

	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("v")
	public static final int method2373(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0 != var2) {
			double var12;
			if (var4 < 0.5) {
				var12 = var4 * (var2 + 1.0);
			} else {
				var12 = (var4 + var2) - (var4 * var2);
			}

			double var14 = (2.0 * var4) - var12;
			double var16 = 0.3333333333333333 + var0;
			if (var16 > 1.0) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				++var20;
			}

			if ((6.0 * var16) < 1.0) {
				var6 = var14 + ((var16 * (var12 - var14)) * 6.0);
			} else if ((var16 * 2.0) < 1.0) {
				var6 = var12;
			} else if ((var16 * 3.0) < 2.0) {
				var6 = var14 + (((0.6666666666666666 - var16) * (var12 - var14)) * 6.0);
			} else {
				var6 = var14;
			}

			if ((6.0 * var0) < 1.0) {
				var8 = var14 + ((6.0 * (var12 - var14)) * var0);
			} else if ((2.0 * var0) < 1.0) {
				var8 = var12;
			} else if ((var0 * 3.0) < 2.0) {
				var8 = var14 + (((var12 - var14) * (0.6666666666666666 - var0)) * 6.0);
			} else {
				var8 = var14;
			}

			if ((6.0 * var20) < 1.0) {
				var10 = var14 + ((var20 * (var12 - var14)) * 6.0);
			} else if ((2.0 * var20) < 1.0) {
				var10 = var12;
			} else if ((3.0 * var20) < 2.0) {
				var10 = (((var12 - var14) * (0.6666666666666666 - var20)) * 6.0) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = ((int) (256.0 * var6));
		int var13 = ((int) (256.0 * var8));
		int var23 = ((int) (var10 * 256.0));
		int var15 = (var23 + (var13 << 8)) + (var22 << 16);
		return var15;
	}
}