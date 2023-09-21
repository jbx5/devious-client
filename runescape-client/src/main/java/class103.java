import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class103 {
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field1336;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-1015037603"
	)
	public static PacketBufferNode method2692() {
		PacketBufferNode var0 = class306.method5863();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
