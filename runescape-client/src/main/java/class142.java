import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("es")
public class class142 extends class128 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1165730347)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1781355329)
	int field1647;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1647 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1647 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method2982(this.field1647);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2021363720")
	static void method3069() {
		class356.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field997 = null;
		MouseRecorder.field1060 = null;
		Tiles.field998 = null;
		class295.field3524 = null;
		NetFileRequest.Tiles_hue = null;
		class430.Tiles_saturation = null;
		WallDecoration.Tiles_lightness = null;
		class4.Tiles_hueMultiplier = null;
		Tiles.field999 = null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1710253974")
	static int method3067(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "45")
	static final void method3068() {
		if (ClanChannelMember.ClanChat_inClanChat) {
			if (class13.friendsChat != null) {
				class13.friendsChat.sort();
			}
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}
			ClanChannelMember.ClanChat_inClanChat = false;
		}
	}
}