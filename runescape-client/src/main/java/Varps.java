import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kk")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("o")
	@Export("Varps_masks")
	static int[] Varps_masks = new int[32];

	@ObfuscatedName("q")
	@Export("Varps_temp")
	public static int[] Varps_temp;

	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}
		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("o")
	static double method5536(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0) / Math.sqrt(6.283185307179586);
		return var6 / var4;
	}
}