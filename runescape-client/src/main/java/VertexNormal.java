import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1936083837
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1468539031
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -498232775
	)
	@Export("z")
	int z;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1111169615
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2127974658"
	)
	static final void method4646(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12003
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3265()) { // L: 12004
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12005
				PacketBufferNode var4 = class120.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 12006
				var4.packetBuffer.writeByte(4 + class357.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12007
				var4.packetBuffer.writeByte(var0); // L: 12008
				var4.packetBuffer.writeShort(var1); // L: 12009
				var4.packetBuffer.writeBoolean(var2); // L: 12010
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12011
				Client.packetWriter.addNode(var4); // L: 12012
			}
		}
	} // L: 12013
}
