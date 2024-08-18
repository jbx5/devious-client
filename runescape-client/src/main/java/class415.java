import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class415 {
	@ObfuscatedName("ab")
	static char[] field4643;
	@ObfuscatedName("ay")
	static char[] field4644;
	@ObfuscatedName("an")
	static char[] field4645;
	@ObfuscatedName("au")
	static int[] field4646;

	static {
		field4643 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4643[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4643[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4643[var0] = (char)(var0 + 48 - 52);
		}

		field4643[62] = '+';
		field4643[63] = '/';
		field4644 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4644[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4644[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4644[var0] = (char)(var0 + 48 - 52);
		}

		field4644[62] = '*';
		field4644[63] = '-';
		field4645 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4645[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4645[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4645[var0] = (char)(var0 + 48 - 52);
		}

		field4645[62] = '-';
		field4645[63] = '_';
		field4646 = new int[128];

		for (var0 = 0; var0 < field4646.length; ++var0) {
			field4646[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4646[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4646[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4646[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4646;
		field4646[43] = 62;
		var2[42] = 62;
		int[] var1 = field4646;
		field4646[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lob;III)Z",
		garbageValue = "-33752809"
	)
	static boolean method7697(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			WorldView.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
