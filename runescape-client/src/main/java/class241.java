import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class241 {
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1205045751"
	)
	public static long method5128(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("p")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (0L == var0 % 37L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 39 40 49
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var8 = class346.base37Table[(int)(var6 - var0 * 37L)]; // L: 43
					if (var8 == '_') { // L: 44
						int var9 = var5.length() - 1; // L: 45
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 46
						var8 = 160; // L: 47
					}
				}

				var5.reverse(); // L: 51
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 52
				return var5.toString(); // L: 53
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-1617192677"
	)
	static int method5125(int var0, Script var1, boolean var2) {
		return 2; // L: 4631
	}
}
