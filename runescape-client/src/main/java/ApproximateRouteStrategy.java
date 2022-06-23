import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bn")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive10")
	static Archive archive10;

	@ObfuscatedName("hp")
	@ObfuscatedGetter(intValue = 998883341)
	static int field466;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIILgv;I)Z", garbageValue = "1278947831")
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "1")
	static final void method1086(int var0, int var1) {
		ClanChannel var2 = (var0 >= 0) ? Client.currentClanChannels[var0] : class150.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3113()) {
			ClanChannelMember var3 = ((ClanChannelMember) (var2.members.get(var1)));
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = EnumComposition.getPacketBufferNode(ClientPacket.field2914, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + ScriptEvent.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}