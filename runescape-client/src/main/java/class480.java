import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("so")
public class class480 {
	@ObfuscatedName("aq")
	static final int[] field4859;
	@ObfuscatedName("ar")
	static final int[] field4860;

	static {
		field4859 = new int[16384];
		field4860 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4859[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4860[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
