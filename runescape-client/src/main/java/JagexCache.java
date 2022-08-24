import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fk")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat = null;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File = null;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File = null;

	@ObfuscatedName("fa")
	@ObfuscatedGetter(intValue = 137253805)
	static int field1728;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V", garbageValue = "1451347763")
	static final void method3205(String var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "2130372893")
	static void method3206(int var0, int var1) {
		if (ClanMate.clientPreferences.method2222() != 0 && var0 != -1) {
			class118.method2713(class17.field89, var0, 0, ClanMate.clientPreferences.method2222(), false);
			Client.playingJingle = true;
		}
	}
}