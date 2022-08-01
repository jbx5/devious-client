import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("c")
public final class class4 {
	@ObfuscatedName("x")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "713636320")
	public static String method13(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;
		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = SecureRandomCallable.method2122(var5);
			}
			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}
			var2[var4] = var5;
		}
		return new String(var2);
	}
}