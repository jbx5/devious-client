import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class295 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lfg;", garbageValue = 
	"1171437373")

	static VerticalAlignment[] method5745() {
		return new VerticalAlignment[]{ VerticalAlignment.field1932, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1935 };
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"176339284")

	static final void method5732() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		ObjectComposition.method3674();
		if (ClientPacket.friendsChat != null) {
			ClientPacket.friendsChat.clearFriends();
		}

	}
}