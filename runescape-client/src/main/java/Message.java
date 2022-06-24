import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("br")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "Lqn;")
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;

	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = "Lnl;")
	static AbstractSocket field461;

	@ObfuscatedName("if")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 169965093)
	@Export("count")
	int count;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1756063821)
	@Export("cycle")
	int cycle;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -163656379)
	@Export("type")
	int type;

	@ObfuscatedName("f")
	@Export("sender")
	String sender;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lqa;")
	@Export("senderUsername")
	Username senderUsername;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("isFromFriend0")
	TriBool isFromFriend0;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	@ObfuscatedName("w")
	@Export("prefix")
	String prefix;

	@ObfuscatedName("y")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V", garbageValue = "18718")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2124874138")
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1551662577")
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}
		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1419615044")
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = (Player.friendSystem.friendsList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2083952991")
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "13")
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}
		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1213016043")
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = (Player.friendSystem.ignoreList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-470307536")
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class92.method2388(this.sender), HealthBarDefinition.loginType);
		} else {
			this.senderUsername = null;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(descriptor = "(Lkb;I)Z", garbageValue = "1375784000")
	static final boolean method1065(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}
			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5573(var2, var3 == 1);
			}
			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}
			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}
			if (var1 == 326) {
				PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}