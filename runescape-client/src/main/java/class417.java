import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class417 {
	@ObfuscatedName("ac")
	static char[] field4695;
	@ObfuscatedName("ae")
	static char[] field4694;
	@ObfuscatedName("ag")
	static char[] field4696;
	@ObfuscatedName("am")
	static int[] field4697;

	static {
		field4695 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4695[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4695[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4695[var0] = (char)(var0 + 48 - 52);
		}

		field4695[62] = '+';
		field4695[63] = '/';
		field4694 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4694[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4694[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4694[var0] = (char)(var0 + 48 - 52);
		}

		field4694[62] = '*';
		field4694[63] = '-';
		field4696 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4696[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4696[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4696[var0] = (char)(var0 + 48 - 52);
		}

		field4696[62] = '-';
		field4696[63] = '_';
		field4697 = new int[128];

		for (var0 = 0; var0 < field4697.length; ++var0) {
			field4697[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4697[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4697[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4697[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4697;
		field4697[43] = 62;
		var2[42] = 62;
		int[] var1 = field4697;
		field4697[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1478684232"
	)
	public static int method7966(int var0) {
		return (var0 & class543.field5361) - 1;
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1352964695"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class168.friendsChat != null) {
			class168.friendsChat.invalidateIgnoreds();
		}

	}
}
