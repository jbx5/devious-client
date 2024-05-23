import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1451705427
	)
	@Export("count")
	int count;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 808161507
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1276487465
	)
	@Export("type")
	int type;
	@ObfuscatedName("az")
	@Export("sender")
	String sender;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("ab")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ac")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1795660517"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219243855"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1485542928"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class33.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160168016"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1525855178"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-14410"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class33.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class154.method3293(this.sender), class236.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnb;Lnt;ZI)V",
		garbageValue = "502419977"
	)
	public static void method1187(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3902 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3902.equipment = Arrays.copyOf(var0.field3902.field3762, var0.field3902.field3762.length);
			var0.field3902.method6576();
		}

	}
}
