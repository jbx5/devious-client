import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
final class class504 implements class499 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lty;I)V",
		garbageValue = "-791895690"
	)
	public void vmethod8956(Object var1, Buffer var2) {
		this.method8955((String)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Ljava/lang/Object;",
		garbageValue = "1270618633"
	)
	public Object vmethod8959(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lty;I)V",
		garbageValue = "-967451643"
	)
	void method8955(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "593676284"
	)
	static final void method8957(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3383()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class503.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class501.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
