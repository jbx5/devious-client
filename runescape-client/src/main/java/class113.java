import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class113 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1441;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1439;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1442;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1438;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1444;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1452;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1451;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1435;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1443;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1437;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1445;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1446;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1447;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("field1390")
	static final class113 field1390;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1449;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class113 field1450;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2109334875
	)
	int field1440;

	static {
		field1441 = new class113(0);
		field1439 = new class113(1);
		field1442 = new class113(2);
		field1438 = new class113(3);
		field1444 = new class113(4);
		field1452 = new class113(5);
		field1451 = new class113(6);
		field1435 = new class113(7);
		field1443 = new class113(8);
		field1437 = new class113(9);
		field1445 = new class113(10);
		field1446 = new class113(11);
		field1447 = new class113(12);
		field1390 = new class113(13);
		field1449 = new class113(14);
		field1450 = new class113(15);
	}

	class113(int var1) {
		this.field1440 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lwh;B)Lme;",
		garbageValue = "23"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

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
