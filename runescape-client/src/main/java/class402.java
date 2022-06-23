import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("oc")
public class class402 {
	@ObfuscatedName("i")
	static final int[] field4449;

	@ObfuscatedName("s")
	static final int[] field4450;

	static {
		field4449 = new int[2048];
		field4450 = new int[2048];
		double var0 = 0.0030679615757712823;
		for (int var2 = 0; var2 < 2048; ++var2) {
			field4449[var2] = ((int) (65536.0 * Math.sin(var0 * ((double) (var2)))));
			field4450[var2] = ((int) (65536.0 * Math.cos(((double) (var2)) * var0)));
		}
	}
}