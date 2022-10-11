import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class137 extends class145 {
	@ObfuscatedName("a")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 232681789
	)
	int field1617;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class137(class146 var1) {
		this.this$0 = var1;
		this.field1617 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	void vmethod3300(Buffer var1) {
		this.field1617 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	void vmethod3302(ClanChannel var1) {
		var1.removeMember(this.field1617); // L: 96
	} // L: 97

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "2036973926"
	)
	static final void method3075(String var0, int var1) {
		PacketBufferNode var2 = class120.getPacketBufferNode(ClientPacket.FRIEND_SETRANK, Client.packetWriter.isaacCipher); // L: 228
		var2.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 229
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 230
		var2.packetBuffer.writeByteNeg(var1); // L: 231
		Client.packetWriter.addNode(var2); // L: 232
	} // L: 233

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1753739766"
	)
	static boolean method3085() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4792
	}
}
