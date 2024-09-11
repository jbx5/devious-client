import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class500 {
	@ObfuscatedName("ap")
	static final int[] field5102;
	@ObfuscatedName("ab")
	static final int[] field5103;

	static {
		field5102 = new int[2048];
		field5103 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5102[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5103[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
