import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class306 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"([FIFI)F", garbageValue = 
	"-1652525463")

	static float method5786(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + (var3 * var2);
		}

		return var3;
	}
}