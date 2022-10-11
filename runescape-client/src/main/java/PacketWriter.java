import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2113687051
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1033255131
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("m")
	boolean field1340;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 87824195
	)
	int field1349;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -934025343
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	ServerPacket field1348;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	ServerPacket field1350;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	ServerPacket field1345;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1340 = true; // L: 22
		this.field1349 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2084194601"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1134433923"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-1674700526"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)V",
		garbageValue = "-1808674743"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-308687118"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lnl;",
		garbageValue = "90"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-7211049"
	)
	static final void method2673(boolean var0) {
		if (var0) { // L: 2905
			Client.field528 = Login.field916 ? class125.field1541 : class125.field1539; // L: 2906
		} else {
			Client.field528 = Player.clientPreferences.parameters.containsKey(Skeleton.method4255(Login.Login_username)) ? class125.field1542 : class125.field1536; // L: 2909
		}

	} // L: 2911

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method2674(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9188
		int[] var3 = Players.Players_indices; // L: 9189
		boolean var4 = false; // L: 9190
		Username var5 = new Username(var1, Players.loginType); // L: 9191

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9192
			Player var7 = Client.players[var3[var6]]; // L: 9193
			if (var7 != null && var7 != class67.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9194
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9195
					var8 = class120.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher); // L: 9197
					var8.packetBuffer.writeShort(var3[var6]); // L: 9198
					var8.packetBuffer.writeByteAdd(0); // L: 9199
					Client.packetWriter.addNode(var8); // L: 9200
				} else if (var0 == 4) { // L: 9202
					var8 = class120.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher); // L: 9204
					var8.packetBuffer.writeShortLE(var3[var6]); // L: 9205
					var8.packetBuffer.writeByteSub(0); // L: 9206
					Client.packetWriter.addNode(var8); // L: 9207
				} else if (var0 == 6) { // L: 9209
					var8 = class120.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher); // L: 9211
					var8.packetBuffer.writeByteSub(0); // L: 9212
					var8.packetBuffer.writeShortAdd(var3[var6]); // L: 9213
					Client.packetWriter.addNode(var8); // L: 9214
				} else if (var0 == 7) { // L: 9216
					var8 = class120.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher); // L: 9218
					var8.packetBuffer.writeByte(0); // L: 9219
					var8.packetBuffer.writeShortAddLE(var3[var6]); // L: 9220
					Client.packetWriter.addNode(var8); // L: 9221
				}

				var4 = true; // L: 9223
				break;
			}
		}

		if (!var4) { // L: 9227
			class65.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9228
}
