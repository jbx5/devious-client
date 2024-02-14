import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class166 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "-676763677"
	)
	public static PacketBufferNode method3491() {
		PacketBufferNode var0 = FadeOutTask.method8005();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
