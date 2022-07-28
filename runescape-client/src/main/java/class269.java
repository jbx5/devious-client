import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("jc")
public final class class269 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = -19627555958654133L)
	static long field3174;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;", garbageValue = "1902505622")
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class341.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}
					var6 = var7;
				}
				var3[var4++] = ((char) (var6));
			}
		}
		return new String(var3, 0, var4);
	}
}