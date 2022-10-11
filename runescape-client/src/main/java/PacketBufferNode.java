import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 738590169
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2131352745
	)
	@Export("index")
	public int index;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1953769541
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-624724039"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 42
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 43
		}
	} // L: 44

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)Ljava/lang/String;",
		garbageValue = "103"
	)
	static String method5356(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 65
			if (var2 > var1) { // L: 66
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 67
			var0.offset += class283.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 68
			String var4 = ScriptFrame.decodeStringCp1252(var3, 0, var2); // L: 69
			return var4; // L: 70
		} catch (Exception var6) { // L: 72
			return "Cabbage"; // L: 73
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgj;B)V",
		garbageValue = "29"
	)
	static final void method5355(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					VarbitComposition.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llb;IIIBZB)V",
		garbageValue = "96"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 151
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 152
		if (var8 == null) { // L: 153
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 154
			if (var8 == null) { // L: 155
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 156
				if (var8 != null) { // L: 157
					if (var5) { // L: 158
						var8.removeDual(); // L: 159
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 160
						--NetCache.NetCache_pendingWritesCount; // L: 161
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 162
					}

				} else {
					if (!var5) { // L: 166
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 167
						if (var8 != null) { // L: 168
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 170
					var8.archive = var0; // L: 171
					var8.crc = var3; // L: 172
					var8.padding = var4; // L: 173
					if (var5) { // L: 174
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 175
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 176
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 179
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 180
						++NetCache.NetCache_pendingWritesCount; // L: 181
					}

				}
			}
		}
	} // L: 164 183
}
