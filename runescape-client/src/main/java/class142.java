import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class142 extends class145 {
	@ObfuscatedName("rd")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1996924927
	)
	public static int field1665;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 905760461
	)
	int field1660;
	@ObfuscatedName("p")
	byte field1658;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 284243937
	)
	int field1659;
	@ObfuscatedName("n")
	String field1666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1660 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	void vmethod3300(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1660 = var1.readUnsignedShort(); // L: 134
		this.field1658 = var1.readByte(); // L: 135
		this.field1659 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1666 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	void vmethod3302(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1660); // L: 143
		var2.rank = this.field1658; // L: 144
		var2.world = this.field1659; // L: 145
		var2.username = new Username(this.field1666); // L: 146
	} // L: 147

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1837453718"
	)
	public static int method3185(String var0) {
		return var0.length() + 2; // L: 119
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2013850455"
	)
	static void method3196(int var0) {
		if (var0 != Client.loginState) { // L: 12188
			Client.loginState = var0; // L: 12189
		}
	} // L: 12190
}
