import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tj")
public class class496 {
	@ObfuscatedName("ap")
	static final int[] field5026;
	@ObfuscatedName("ae")
	static final int[] field5029;

	static {
		field5026 = new int[2048];
		field5029 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5026[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5029[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
