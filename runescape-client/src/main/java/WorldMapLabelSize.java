import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 252766191
	)
	final int field3075;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1237526349
	)
	final int field3079;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 360339709
	)
	final int field3076;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3075 = var1;
		this.field3079 = var2;
		this.field3076 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-1425298382"
	)
	boolean method5750(float var1) {
		return var1 >= (float)this.field3076;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lko;",
		garbageValue = "1682309618"
	)
	static WorldMapLabelSize[] method5755() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium};
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static final void method5757(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class166.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3726()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class141.getPacketBufferNode(ClientPacket.field3320, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class536.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
