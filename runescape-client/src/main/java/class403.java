import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("ov")
public class class403 {
	@ObfuscatedName("n")
	static final int[] field4455 = new int[2048];

	@ObfuscatedName("d")
	static final int[] field4457 = new int[2048];

	static {
		double var0 = 0.0030679615757712823;
		for (int var2 = 0; var2 < 2048; ++var2) {
			field4455[var2] = ((int) (65536.0 * Math.sin(((double) (var2)) * var0)));
			field4457[var2] = ((int) (65536.0 * Math.cos(((double) (var2)) * var0)));
		}
	}
}