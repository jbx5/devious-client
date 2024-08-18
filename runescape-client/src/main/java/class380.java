import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public enum class380 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	field4405(-1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	field4404(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	field4403(1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	field4401(2);

	@ObfuscatedName("df")
	static boolean field4407;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -505842755
	)
	final int field4402;

	class380(int var3) {
		this.field4402 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4402;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lob;IS)V",
		garbageValue = "5692"
	)
	static void method7175(AbstractArchive var0, int var1) {
		if ((var1 & class543.field5357.rsOrdinal()) != 0) {
			FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class543.field5358.rsOrdinal()) != 0) {
			FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class543.field5336.rsOrdinal()) != 0) {
			FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-83"
	)
	static final void method7176(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3577()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class218.getPacketBufferNode(ClientPacket.field3290, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class526.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
