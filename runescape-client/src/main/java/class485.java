import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sw")
public class class485 {
	@ObfuscatedName("ai")
	static final int[] field4926;
	@ObfuscatedName("ax")
	static final int[] field4927;

	static {
		field4926 = new int[2048];
		field4927 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4926[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field4927[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
