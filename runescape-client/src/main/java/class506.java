import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tx")
public class class506 {
	@ObfuscatedName("ay")
	static final int[] field5144;
	@ObfuscatedName("as")
	static final int[] field5145;

	static {
		field5144 = new int[16384];
		field5145 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5144[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5145[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
