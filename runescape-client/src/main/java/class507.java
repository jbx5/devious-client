import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ty")
public class class507 {
	@ObfuscatedName("ao")
	static final int[] field5149;
	@ObfuscatedName("af")
	static final int[] field5146;

	static {
		field5149 = new int[2048];
		field5146 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5149[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5146[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
