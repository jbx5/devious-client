import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 892213157
	)
	@Export("count")
	int count;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1312110651
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1417053891
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@Export("sender")
	String sender;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("ap")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("aa")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "80"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "963763449"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class299.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1755097600"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656305683"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class299.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(PlayerCompositionColorTextureOverride.method3545(this.sender), Language.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "1803169793"
	)
	static boolean method1185(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-103"
	)
	static void method1217() {
		PacketBufferNode var0 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class218.getWindowedMode());
		var0.packetBuffer.writeShort(class113.canvasWidth);
		var0.packetBuffer.writeShort(class177.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
