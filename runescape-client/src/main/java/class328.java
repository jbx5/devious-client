import java.awt.datatransfer.Clipboard;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public final class class328 {
	@ObfuscatedName("ak")
	static final HashMap field3598;

	static {
		field3598 = new HashMap();
		TimeZone var0;
		synchronized(field3598) {
			TimeZone var2 = (TimeZone)field3598.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3598.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "954200168"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "8"
	)
	static final void method6532(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3786()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3398, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + World.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1614134537"
	)
	public static Clipboard method6534() {
		return Projectile.client.method498();
	}
}
