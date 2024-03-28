import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class366 {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1998981915
	)
	static int field3997;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "63421353"
	)
	static float method6871(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}
}
