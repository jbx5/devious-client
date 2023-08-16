import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rx")
public class class464 {
	@ObfuscatedName("ac")
	static final int[] field4786;
	@ObfuscatedName("ai")
	static final int[] field4787;

	static {
		field4786 = new int[16384];
		field4787 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4786[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4787[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
