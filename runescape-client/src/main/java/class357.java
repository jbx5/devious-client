import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("mz")
public class class357 {
	@ObfuscatedName("c")
	static double method6530(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(var8 * -var8 / 2.0) / Math.sqrt(6.283185307179586);
		return var6 / var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "-586452778")
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class295.charToByteCp1252(var0.charAt(var3));
		}
		return var2;
	}
}