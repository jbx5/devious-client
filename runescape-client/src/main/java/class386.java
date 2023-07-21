import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class386 {
	@ObfuscatedName("aw")
	static char[] field4431;
	@ObfuscatedName("ay")
	static char[] field4435;
	@ObfuscatedName("ar")
	static char[] field4432;
	@ObfuscatedName("am")
	static int[] field4433;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 805063407
	)
	static int field4434;

	static {
		field4431 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4431[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4431[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4431[var0] = (char)(var0 + 48 - 52);
		}

		field4431[62] = '+';
		field4431[63] = '/';
		field4435 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4435[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4435[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4435[var0] = (char)(var0 + 48 - 52);
		}

		field4435[62] = '*';
		field4435[63] = '-';
		field4432 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4432[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4432[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4432[var0] = (char)(var0 + 48 - 52);
		}

		field4432[62] = '-';
		field4432[63] = '_';
		field4433 = new int[128];

		for (var0 = 0; var0 < field4433.length; ++var0) {
			field4433[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4433[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4433[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4433[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4433;
		field4433[43] = 62;
		var2[42] = 62;
		int[] var1 = field4433;
		field4433[47] = 63;
		var1[45] = 63;
	}
}
