import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mi")
public class class342 {
	@ObfuscatedName("o")
	static char[] field4169 = new char[64];

	@ObfuscatedName("q")
	static char[] field4166;

	@ObfuscatedName("f")
	static char[] field4167;

	@ObfuscatedName("u")
	static int[] field4168;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lql;")
	static IndexedSprite field4165;

	@ObfuscatedName("x")
	public static boolean field4171;

	static {
		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4169[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4169[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4169[var0] = ((char) (var0 + 48 - 52));
		}
		field4169[62] = '+';
		field4169[63] = '/';
		field4166 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4166[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4166[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4166[var0] = ((char) (var0 + 48 - 52));
		}
		field4166[62] = '*';
		field4166[63] = '-';
		field4167 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4167[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4167[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4167[var0] = ((char) (var0 + 48 - 52));
		}
		field4167[62] = '-';
		field4167[63] = '_';
		field4168 = new int[128];
		for (var0 = 0; var0 < class342.field4168.length; ++var0) {
			field4168[var0] = -1;
		}
		for (var0 = 65; var0 <= 90; ++var0) {
			field4168[var0] = var0 - 65;
		}
		for (var0 = 97; var0 <= 122; ++var0) {
			field4168[var0] = var0 - 97 + 26;
		}
		for (var0 = 48; var0 <= 57; ++var0) {
			field4168[var0] = var0 - 48 + 52;
		}
		int[] var2 = field4168;
		field4168[43] = 62;
		var2[42] = 62;
		int[] var1 = field4168;
		field4168[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue = "576354890")
	public static String method6309(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);
		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Calendar.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}
					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}
				}
			} else {
				var2.append(var4);
			}
		}
		return var2.toString();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Llc;Ljava/lang/String;Ljava/lang/String;B)[Lql;", garbageValue = "6")
	public static IndexedSprite[] method6304(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		byte[] var7 = var0.takeFile(var3, var4);
		boolean var6;
		if (var7 == null) {
			var6 = false;
		} else {
			class83.SpriteBuffer_decode(var7);
			var6 = true;
		}
		IndexedSprite[] var5;
		if (!var6) {
			var5 = null;
		} else {
			var5 = class389.method7083();
		}
		return var5;
	}
}