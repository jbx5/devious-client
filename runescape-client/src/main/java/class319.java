import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mm")
public class class319 {
	@ObfuscatedName("az")
	static int[] field3480;

	static {
		new Object();
		field3480 = new int[33];
		field3480[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3480[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
