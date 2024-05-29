import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class193 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1258299179
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2123106198"
	)
	public static String method3793(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class413.field4654[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class413.field4654[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class413.field4654[(var6 & 15) << 2 | var7 >>> 6]).append(class413.field4654[var7 & 63]);
				} else {
					var3.append(class413.field4654[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class413.field4654[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "291471895"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = WorldMapElement.getPacketBufferNode(ClientPacket.field3347, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
