import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class143 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -2075652897916156131L
	)
	long field1645;
	@ObfuscatedName("al")
	String field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class143(class148 var1) {
		this.this$0 = var1;
		this.field1645 = -1L;
		this.field1644 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1645 = var1.readLong();
		}

		this.field1644 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3242(this.field1645, this.field1644, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1171307082"
	)
	public static float method3138(int var0) {
		var0 &= 16383;
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F));
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	static final void method3142() {
		if (class183.ClanChat_inClanChat) {
			if (class358.friendsChat != null) {
				class358.friendsChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}

			class183.ClanChat_inClanChat = false;
		}

	}
}
