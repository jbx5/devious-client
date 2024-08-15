import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class497 {
	@ObfuscatedName("ax")
	static final int[] field5036;
	@ObfuscatedName("ao")
	static final int[] field5035;

	static {
		field5036 = new int[16384];
		field5035 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5036[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5035[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
