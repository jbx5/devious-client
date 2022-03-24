import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class286 {
	@ObfuscatedName("ak")
	static String field3281;

	@ObfuscatedName("hr")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"-1152795")

	static final void method5548(boolean var0) {
		MouseHandler.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if ((Client.packetWriter.pendingWrites >= 50) || var0) {
			Client.packetWriter.pendingWrites = 0;
			if ((!Client.hadNetworkError) && (Client.packetWriter.getSocket() != null)) {
				PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"2")

	static final void method5549() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1119;
					var4 = class116.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if ((var3 >= 5) && (var3 <= 8)) {
						var3 = 4;
					}

					var1 = var4.method3651(var3);
					if (!var1) {
						continue;
					}
				}

				DirectByteArrayCopier.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1117, var0.field1119);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (((((var0.delay == 0) && (var0.x >= 1)) && (var0.y >= 1)) && (var0.x <= 102)) && (var0.y <= 102)) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1122;
						var4 = class116.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if ((var3 >= 5) && (var3 <= 8)) {
							var3 = 4;
						}

						var1 = var4.method3651(var3);
						if (!var1) {
							continue;
						}
					}

					DirectByteArrayCopier.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1122);
					var0.delay = -1;
					if ((var0.objectId == var0.id) && (var0.objectId == (-1))) {
						var0.remove();
					} else if (((var0.objectId == var0.id) && (var0.orientation == var0.field1117)) && (var0.field1122 == var0.field1119)) {
						var0.remove();
					}
				}
			}
		}

	}
}