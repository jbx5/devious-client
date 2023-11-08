import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pb")
public class class397 {
	@ObfuscatedName("at")
	static char[] field4458;
	@ObfuscatedName("ah")
	static char[] field4456;
	@ObfuscatedName("ar")
	static char[] field4457;
	@ObfuscatedName("ao")
	static int[] field4455;

	static {
		field4458 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4458[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4458[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4458[var0] = (char)(var0 + 48 - 52);
		}

		field4458[62] = '+';
		field4458[63] = '/';
		field4456 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4456[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4456[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4456[var0] = (char)(var0 + 48 - 52);
		}

		field4456[62] = '*';
		field4456[63] = '-';
		field4457 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4457[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4457[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4457[var0] = (char)(var0 + 48 - 52);
		}

		field4457[62] = '-';
		field4457[63] = '_';
		field4455 = new int[128];

		for (var0 = 0; var0 < field4455.length; ++var0) {
			field4455[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4455[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4455[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4455[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4455;
		field4455[43] = 62;
		var2[42] = 62;
		int[] var1 = field4455;
		field4455[47] = 63;
		var1[45] = 63;
	}
}
