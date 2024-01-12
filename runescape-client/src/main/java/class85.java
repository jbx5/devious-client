import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class85 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "27164"
	)
	public static int method2351(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
