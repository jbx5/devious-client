import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class389 {
	@ObfuscatedName("v")
	float[] field4364;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1953516053)

	int field4363;

	class389(float[] var1, int var2) {
		this.field4364 = var1;
		this.field4363 = var2;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"82")

	static final void method7094(boolean var0) {
		class116.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if ((Client.packetWriter.pendingWrites >= 50) || var0) {
			Client.packetWriter.pendingWrites = 0;
			if ((!Client.hadNetworkError) && (Client.packetWriter.getSocket() != null)) {
				PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}