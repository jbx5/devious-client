import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class496 {
	@ObfuscatedName("ap")
	static final int[] field5052;
	@ObfuscatedName("an")
	static final int[] field5051;

	static {
		field5052 = new int[16384];
		field5051 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5052[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5051[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
