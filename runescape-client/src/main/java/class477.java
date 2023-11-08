import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sx")
public class class477 {
	@ObfuscatedName("ax")
	static final int[] field4824;
	@ObfuscatedName("as")
	static final int[] field4828;

	static {
		field4824 = new int[2048];
		field4828 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4824[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4828[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
