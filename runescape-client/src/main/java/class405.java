import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pu")
public class class405 {
	@ObfuscatedName("az")
	static char[] field4562;
	@ObfuscatedName("ah")
	static char[] field4561;
	@ObfuscatedName("af")
	static char[] field4563;
	@ObfuscatedName("at")
	static int[] field4560;

	static {
		field4562 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4562[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4562[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4562[var0] = (char)(var0 + 48 - 52);
		}

		field4562[62] = '+';
		field4562[63] = '/';
		field4561 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4561[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4561[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4561[var0] = (char)(var0 + 48 - 52);
		}

		field4561[62] = '*';
		field4561[63] = '-';
		field4563 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4563[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4563[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4563[var0] = (char)(var0 + 48 - 52);
		}

		field4563[62] = '-';
		field4563[63] = '_';
		field4560 = new int[128];

		for (var0 = 0; var0 < field4560.length; ++var0) {
			field4560[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4560[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4560[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4560[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4560;
		field4560[43] = 62;
		var2[42] = 62;
		int[] var1 = field4560;
		field4560[47] = 63;
		var1[45] = 63;
	}
}
