import java.awt.Component;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Players")
public class Players {
	@ObfuscatedName("f")
	static byte[] field1290;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lga;"
	)
	static class193[] field1291;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	static Buffer[] field1292;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1742411547
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("s")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 842704609
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("m")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("x")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("j")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("v")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1336760617
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("t")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static Buffer field1302;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("loginType")
	static LoginType loginType;

	static {
		field1290 = new byte[2048]; // L: 18
		field1291 = new class193[2048]; // L: 19
		field1292 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1302 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1351614638"
	)
	static void method2569(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 155
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 156
		KeyHandler.field131 = -1; // L: 157
	} // L: 158

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1280446"
	)
	static final void method2581(boolean var0) {
		class14.playPcmPlayers(); // L: 5510
		++Client.packetWriter.pendingWrites; // L: 5511
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5512
			Client.packetWriter.pendingWrites = 0; // L: 5513
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5514
				PacketBufferNode var1 = class120.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher); // L: 5516
				Client.packetWriter.addNode(var1); // L: 5517

				try {
					Client.packetWriter.flush(); // L: 5519
				} catch (IOException var3) { // L: 5521
					Client.hadNetworkError = true; // L: 5522
				}
			}

		}
	} // L: 5525
}
