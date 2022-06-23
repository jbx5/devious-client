import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ml")
public class class341 {
	@ObfuscatedName("c")
	public static char[] field4146;

	@ObfuscatedName("v")
	static char[] field4143;

	@ObfuscatedName("q")
	static char[] field4144;

	@ObfuscatedName("f")
	static int[] field4145;

	@ObfuscatedName("ed")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive7")
	static Archive archive7;

	static {
		field4146 = new char[64];
		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4146[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4146[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4146[var0] = ((char) (var0 + 48 - 52));
		}
		field4146[62] = '+';
		field4146[63] = '/';
		field4143 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4143[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4143[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4143[var0] = ((char) (var0 + 48 - 52));
		}
		field4143[62] = '*';
		field4143[63] = '-';
		field4144 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4144[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4144[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4144[var0] = ((char) (var0 + 48 - 52));
		}
		field4144[62] = '-';
		field4144[63] = '_';
		field4145 = new int[128];
		for (var0 = 0; var0 < class341.field4145.length; ++var0) {
			field4145[var0] = -1;
		}
		for (var0 = 65; var0 <= 90; ++var0) {
			field4145[var0] = var0 - 65;
		}
		for (var0 = 97; var0 <= 122; ++var0) {
			field4145[var0] = var0 - 97 + 26;
		}
		for (var0 = 48; var0 <= 57; ++var0) {
			field4145[var0] = var0 - 48 + 52;
		}
		int[] var2 = field4145;
		field4145[43] = 62;
		var2[42] = 62;
		int[] var1 = field4145;
		field4145[47] = 63;
		var1[45] = 63;
	}
}