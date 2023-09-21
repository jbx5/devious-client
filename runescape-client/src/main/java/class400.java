import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("po")
public class class400 {
	@ObfuscatedName("ac")
	static char[] field4477;
	@ObfuscatedName("al")
	static char[] field4476;
	@ObfuscatedName("ak")
	static char[] field4478;
	@ObfuscatedName("ax")
	static int[] field4479;

	static {
		field4477 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4477[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4477[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4477[var0] = (char)(var0 + 48 - 52);
		}

		field4477[62] = '+';
		field4477[63] = '/';
		field4476 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4476[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4476[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4476[var0] = (char)(var0 + 48 - 52);
		}

		field4476[62] = '*';
		field4476[63] = '-';
		field4478 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4478[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4478[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4478[var0] = (char)(var0 + 48 - 52);
		}

		field4478[62] = '-';
		field4478[63] = '_';
		field4479 = new int[128];

		for (var0 = 0; var0 < field4479.length; ++var0) {
			field4479[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4479[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4479[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4479[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4479;
		field4479[43] = 62;
		var2[42] = 62;
		int[] var1 = field4479;
		field4479[47] = 63;
		var1[45] = 63;
	}
}
