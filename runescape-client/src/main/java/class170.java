import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class170 extends class163 {
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static WorldView field1839;
	@ObfuscatedName("aq")
	String field1835;
	@ObfuscatedName("ad")
	byte field1838;
	@ObfuscatedName("ag")
	byte field1836;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class170(class164 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1835 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1835 != null) {
			var1.readUnsignedByte();
			this.field1838 = var1.readByte();
			this.field1836 = var1.readByte();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		var1.name = this.field1835;
		if (this.field1835 != null) {
			var1.field1823 = this.field1838;
			var1.field1817 = this.field1836;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lvs;S)Lmb;",
		garbageValue = "25118"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class323.method6113();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
