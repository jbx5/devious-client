import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 734716511
	)
	@Export("count")
	int count;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1431189029
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1190976647
	)
	@Export("type")
	int type;
	@ObfuscatedName("n")
	@Export("sender")
	String sender;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("q")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("m")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "255"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1; // L: 25
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend(); // L: 34
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-536134885"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-151416691"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = Varps.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1200998842"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "395618776"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2097518488"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = Varps.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class14.method195(this.sender), Players.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfw;",
		garbageValue = "-2"
	)
	static VerticalAlignment[] method1144() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1979, VerticalAlignment.field1976}; // L: 14
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;IIIZI)V",
		garbageValue = "-1917456783"
	)
	public static void method1164(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class274.musicPlayerStatus = 1; // L: 26
		class274.musicTrackArchive = var0; // L: 27
		class274.musicTrackGroupId = var1; // L: 28
		StructComposition.musicTrackFileId = var2; // L: 29
		class269.musicTrackVolume = var3; // L: 30
		TriBool.musicTrackBoolean = var4; // L: 31
		VarcInt.pcmSampleLength = 10000; // L: 32
	} // L: 33

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1809629894"
	)
	static final void method1165(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8135
			if (Client.showMouseOverText) { // L: 8136
				int var2 = class156.method3411(); // L: 8137
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8139
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8140
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = DynamicObject.method2135(var2); // L: 8141
				}

				if (Client.menuOptionsCount > 2) { // L: 8142
					var3 = var3 + SoundCache.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class29.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8143
			}
		}
	} // L: 8144
}
