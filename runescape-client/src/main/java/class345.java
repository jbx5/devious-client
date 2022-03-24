import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class345 {
	@ObfuscatedName("ry")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("v")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lct;")

	@Export("World_request")
	static UrlRequest World_request;
	static 
	{
		cp1252AsciiExtension = new char[]{ '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(IIZI)Ljava/lang/String;", garbageValue = 
	"-1027496859")

	static String method6478(int var0, int var1, boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			if (var2 && (var0 >= 0)) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - (var0 * var1);
					if (var8 >= 10) {
						var5[var6] = ((char) (var8 + 87));
					} else {
						var5[var6] = ((char) (var8 + 48));
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(CB)Z", garbageValue = 
	"-50")

	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return ((var0 >= 'A') && (var0 <= 'Z')) || ((var0 >= 'a') && (var0 <= 'z'));
	}
}