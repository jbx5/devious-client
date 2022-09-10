import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class425 {
	@ObfuscatedName("f")
	public static final char[] field4655;
	@ObfuscatedName("n")
	public static final char[] field4659;

	static {
		field4655 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'}; // L: 8
		field4659 = new char[]{'[', ']', '#'}; // L: 9
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1795200802"
	)
	public static int method7664(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1900063141"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class120.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher); // L: 9262
		var2.packetBuffer.writeShortAddLE(var1); // L: 9263
		var2.packetBuffer.writeIntME(var0); // L: 9264
		Client.packetWriter.addNode(var2); // L: 9265
	} // L: 9266
}
