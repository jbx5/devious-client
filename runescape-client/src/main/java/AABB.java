import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1998849149
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1358064335
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1315387359
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 34426305
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1261800775
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -92257465
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-79"
	)
	static final void method5096(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3453()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = WorldMapElement.getPacketBufferNode(ClientPacket.field3311, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class432.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
