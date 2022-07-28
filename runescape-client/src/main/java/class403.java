import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("oq")
public class class403 {
	@ObfuscatedName("a")
	static final int[] field4465 = new int[2048];

	@ObfuscatedName("d")
	static final int[] field4464 = new int[2048];

	static {
		double var0 = 0.0030679615757712823;
		for (int var2 = 0; var2 < 2048; ++var2) {
			field4465[var2] = ((int) (65536.0 * Math.sin(((double) (var2)) * var0)));
			field4464[var2] = ((int) (65536.0 * Math.cos(var0 * ((double) (var2)))));
		}
	}
}