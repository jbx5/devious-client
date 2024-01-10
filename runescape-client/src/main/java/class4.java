import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public final class class4 {
	@ObfuscatedName("ge")
	@Export("refreshToken")
	static String refreshToken;

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-467280453"
	)
	static void method16(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class134.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1850141553"
	)
	static void method17(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3213, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntIME(var3 ? Client.revision : 0);
		var4.packetBuffer.writeShortLE(var0);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeShort(var1);
		Client.packetWriter.addNode(var4);
	}
}
