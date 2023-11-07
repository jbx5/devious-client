import java.util.Collections;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public final class class4 {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static AbstractSocket field4;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1584240093"
	)
	public static void method20(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			Clock.ByteArrayPool_alternativeSizes = var0;
			class267.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class1.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < Clock.ByteArrayPool_alternativeSizes.length; ++var2) {
				class1.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4590.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4590);
		} else {
			Clock.ByteArrayPool_alternativeSizes = null;
			class267.ByteArrayPool_altSizeArrayCounts = null;
			class1.ByteArrayPool_arrays = null;
			Renderable.method5509();
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method19(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3479()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + ClanChannel.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "2291"
	)
	static boolean method21() {
		return WorldMapIcon_1.clientPreferences.method2562() >= Client.field488;
	}
}
