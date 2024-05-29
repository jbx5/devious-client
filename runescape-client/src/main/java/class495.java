import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class495 {
	@ObfuscatedName("af")
	static final int[] field5019;
	@ObfuscatedName("aa")
	static final int[] field5020;

	static {
		field5019 = new int[16384];
		field5020 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5019[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5020[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-93"
	)
	static int method8968(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}
}
