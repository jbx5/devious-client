import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oh")
public class class404 {
	@ObfuscatedName("x")
	static final int[] field4492;
	@ObfuscatedName("j")
	static final int[] field4493;

	static {
		field4492 = new int[2048]; // L: 13
		field4493 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4492[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4493[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
