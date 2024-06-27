import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
class class333 implements ThreadFactory {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -359790385
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 440453039
	)
	static int field3643;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	class333(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1598204448"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-223269989"
	)
	static void method6367() {
		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var0 = class170.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var0.packetBuffer.writeByte(GrandExchangeOfferOwnWorldComparator.getWindowedMode());
			var0.packetBuffer.writeShort(class74.canvasWidth);
			var0.packetBuffer.writeShort(class1.canvasHeight);
			Client.packetWriter.addNode(var0);
		}
	}
}
