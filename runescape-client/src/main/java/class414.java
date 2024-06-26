import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class414 {
	@ObfuscatedName("aq")
	public static char[] field4669;
	@ObfuscatedName("ad")
	static char[] field4673;
	@ObfuscatedName("ag")
	static char[] field4671;
	@ObfuscatedName("ak")
	static int[] field4672;
	@ObfuscatedName("dp")
	static boolean field4670;

	static {
		field4669 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4669[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4669[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4669[var0] = (char)(var0 + 48 - 52);
		}

		field4669[62] = '+';
		field4669[63] = '/';
		field4673 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4673[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4673[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4673[var0] = (char)(var0 + 48 - 52);
		}

		field4673[62] = '*';
		field4673[63] = '-';
		field4671 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4671[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4671[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4671[var0] = (char)(var0 + 48 - 52);
		}

		field4671[62] = '-';
		field4671[63] = '_';
		field4672 = new int[128];

		for (var0 = 0; var0 < field4672.length; ++var0) {
			field4672[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4672[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4672[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4672[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4672;
		field4672[43] = 62;
		var2[42] = 62;
		int[] var1 = field4672;
		field4672[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-48"
	)
	public static int method7619(int var0) {
		return var0 >>> 4 & class540.field5313;
	}
}
