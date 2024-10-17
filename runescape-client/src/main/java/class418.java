import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class418 {
	@ObfuscatedName("ap")
	public static char[] field4745;
	@ObfuscatedName("aw")
	static char[] field4744;
	@ObfuscatedName("ak")
	static char[] field4743;
	@ObfuscatedName("aj")
	static int[] field4746;

	static {
		field4745 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4745[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4745[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4745[var0] = (char)(var0 + 48 - 52);
		}

		field4745[62] = '+';
		field4745[63] = '/';
		field4744 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4744[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4744[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4744[var0] = (char)(var0 + 48 - 52);
		}

		field4744[62] = '*';
		field4744[63] = '-';
		field4743 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4743[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4743[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4743[var0] = (char)(var0 + 48 - 52);
		}

		field4743[62] = '-';
		field4743[63] = '_';
		field4746 = new int[128];

		for (var0 = 0; var0 < field4746.length; ++var0) {
			field4746[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4746[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4746[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4746[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4746;
		field4746[43] = 62;
		var2[42] = 62;
		int[] var1 = field4746;
		field4746[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2080490367"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}
