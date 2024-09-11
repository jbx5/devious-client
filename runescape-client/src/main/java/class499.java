import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tl")
public class class499 {
	@ObfuscatedName("aq")
	static final int[] field5097;
	@ObfuscatedName("af")
	static final int[] field5098;

	static {
		field5097 = new int[16384];
		field5098 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5097[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5098[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
