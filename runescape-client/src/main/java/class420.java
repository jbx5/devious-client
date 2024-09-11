import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class420 {
	@ObfuscatedName("ac")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("ae")
	static long[] field4702;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4702 = new long[12];

		for (int var0 = 0; var0 < field4702.length; ++var0) {
			field4702[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lkp;S)V",
		garbageValue = "252"
	)
	static void method8018(class268 var0) {
		if (var0 != null && var0.field2969 != null) {
			if (var0.field2969.childIndex >= 0) {
				Widget var1 = TaskHandler.widgetDefinition.method6841(var0.field2969.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2969.childIndex >= var1.children.length || var0.field2969 != var1.children[var0.field2969.childIndex]) {
					return;
				}
			}

			if (var0.field2969.type == 11 && var0.field2970 == 0) {
				if (var0.field2969.method7256(var0.field2974, var0.field2966, 0, 0)) {
					var0.field2969.method7299().method4396().method4517(1, var0.field2969.method7299().method4407());
					switch(var0.field2969.method7250()) {
					case 0:
						FloorOverlayDefinition.openURL(var0.field2969.method7262(), true, false);
						break;
					case 1:
						int var2 = class310.getWidgetFlags(var0.field2969);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field2969.method7343();
							if (var3 != null) {
								PacketBufferNode var4 = class141.getPacketBufferNode(ClientPacket.field3356, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeShort(var0.field2969.childIndex);
								var4.packetBuffer.writeInt(var3[0]);
								var4.packetBuffer.writeIntLE(var3[1]);
								var4.packetBuffer.writeInt(var0.field2969.id);
								var4.packetBuffer.writeInt(var3[2]);
								var4.packetBuffer.writeIntLE(var0.field2969.method7261());
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field2969.type == 12) {
				class360 var6 = var0.field2969.method7268();
				if (var6 != null && var6.method7005()) {
					switch(var0.field2970) {
					case 0:
						Client.field679.method5539(var0.field2969);
						var6.method6953(true);
						var6.method7055(var0.field2974, var0.field2966, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method6993(var0.field2974, var0.field2966);
					}
				}
			}

		}
	}
}
