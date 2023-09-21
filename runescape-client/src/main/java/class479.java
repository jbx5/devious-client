import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sy")
public class class479 {
	@ObfuscatedName("ao")
	static final int[] field4823;
	@ObfuscatedName("ah")
	static final int[] field4825;

	static {
		field4823 = new int[16384];
		field4825 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4823[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4825[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
