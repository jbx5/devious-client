import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("md")
public class class331 {
	@ObfuscatedName("ap")
	static int[] field3609;

	static {
		new Object();
		field3609 = new int[33];
		field3609[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3609[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
