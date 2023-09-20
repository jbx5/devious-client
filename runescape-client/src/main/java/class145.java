import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public abstract class class145 extends Node {
	class145() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	abstract void vmethod3414(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	abstract void vmethod3415(ClanSettings var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;I)V",
		garbageValue = "1295708638"
	)
	public static void method3155(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		class403.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "245688537"
	)
	static final void method3153(String var0) {
		PacketBufferNode var1 = ClanChannelMember.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
