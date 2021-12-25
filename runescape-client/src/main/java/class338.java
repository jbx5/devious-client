import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ms")
public class class338 {
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 382463389)
	static int field4055;

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Lko;")
	static StudioGame field4054;

	@ObfuscatedName("c")
	public static final int method6256(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0) {
			double var12;
			if (var4 < 0.5) {
				var12 = (1.0 + var2) * var4;
			} else {
				var12 = (var4 + var2) - (var2 * var4);
			}
			double var14 = (2.0 * var4) - var12;
			double var16 = var0 + 0.3333333333333333;
			if (var16 > 1.0) {
				--var16;
			}
			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				++var20;
			}
			if ((var16 * 6.0) < 1.0) {
				var6 = (((var12 - var14) * 6.0) * var16) + var14;
			} else if ((var16 * 2.0) < 1.0) {
				var6 = var12;
			} else if ((3.0 * var16) < 2.0) {
				var6 = ((6.0 * (var12 - var14)) * (0.6666666666666666 - var16)) + var14;
			} else {
				var6 = var14;
			}
			if ((6.0 * var0) < 1.0) {
				var8 = (((var12 - var14) * 6.0) * var0) + var14;
			} else if ((var0 * 2.0) < 1.0) {
				var8 = var12;
			} else if ((var0 * 3.0) < 2.0) {
				var8 = ((6.0 * (0.6666666666666666 - var0)) * (var12 - var14)) + var14;
			} else {
				var8 = var14;
			}
			if ((var20 * 6.0) < 1.0) {
				var10 = var14 + ((var20 * 6.0) * (var12 - var14));
			} else if ((var20 * 2.0) < 1.0) {
				var10 = var12;
			} else if ((var20 * 3.0) < 2.0) {
				var10 = var14 + (((0.6666666666666666 - var20) * (var12 - var14)) * 6.0);
			} else {
				var10 = var14;
			}
		}
		int var22 = ((int) (var6 * 256.0));
		int var13 = ((int) (var8 * 256.0));
		int var23 = ((int) (var10 * 256.0));
		int var15 = (var23 + (var13 << 8)) + (var22 << 16);
		return var15;
	}
}