import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class386 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(ZLqf;I)V",
		garbageValue = "2053789888"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field625 = 0; // L: 7792
		Client.field549 = 0; // L: 7793
		UserComparator4.method2731(); // L: 7794
		class272.method5399(var0, var1); // L: 7795
		WorldMapLabel.method5120(var1); // L: 7796

		int var2;
		for (var2 = 0; var2 < Client.field625; ++var2) { // L: 7797
			int var3 = Client.field775[var2]; // L: 7798
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7799
				Client.npcs[var3].definition = null; // L: 7800
				Client.npcs[var3] = null; // L: 7801
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7804
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7805
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7806
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7807
				}
			}

		}
	} // L: 7810
}
