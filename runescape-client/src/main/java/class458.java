import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class458 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)D",
		garbageValue = "-1467308353"
	)
	public static double method8816(int var0) {
		int var1 = class507.field5146[var0 & 2047];
		return (double)var1 / 65536.0D;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1408401302"
	)
	public static String method8815(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
