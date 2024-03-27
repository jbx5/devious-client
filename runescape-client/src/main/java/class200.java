import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class200 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	public static void method3823() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lip;I)V",
		garbageValue = "895598931"
	)
	static void method3820(class227 var0) {
		if (var0 != null && var0.field2426 != null) {
			if (var0.field2426.childIndex >= 0) {
				Widget var1 = class243.widgetDefinition.method6281(var0.field2426.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2426.childIndex >= var1.children.length || var0.field2426 != var1.children[var0.field2426.childIndex]) {
					return;
				}
			}

			if (var0.field2426.type == 11 && var0.field2424 == 0) {
				if (var0.field2426.method6767(var0.field2422, var0.field2425, 0, 0)) {
					var0.field2426.method6769().method3440().method3576(1, var0.field2426.method6769().method3452());
					switch(var0.field2426.method6672()) {
					case 0:
						class129.openURL(var0.field2426.method6674(), true, false);
						break;
					case 1:
						int var2 = class33.getWidgetFlags(var0.field2426);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field2426.method6675();
							if (var3 != null) {
								PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.field3294, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntLE(var0.field2426.method6673());
								var4.packetBuffer.writeShort(var0.field2426.childIndex);
								var4.packetBuffer.writeInt(var3[1]);
								var4.packetBuffer.writeIntME(var3[2]);
								var4.packetBuffer.writeIntLE(var0.field2426.id);
								var4.packetBuffer.writeIntME(var3[0]);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field2426.type == 12) {
				class347 var6 = var0.field2426.method6667();
				if (var6 != null && var6.method6416()) {
					switch(var0.field2424) {
					case 0:
						Client.field749.method4278(var0.field2426);
						var6.method6486(true);
						var6.method6403(var0.field2422, var0.field2425, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method6395(var0.field2422, var0.field2425);
					}
				}
			}

		}
	}
}
