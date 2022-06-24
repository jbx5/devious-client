import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("cs")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ll")
	@ObfuscatedGetter(intValue = 85190489)
	@Export("Client_plane")
	static int Client_plane;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lnl;")
	@Export("socket")
	AbstractSocket socket;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llk;")
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1705844849)
	@Export("bufferSize")
	int bufferSize;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqt;")
	@Export("buffer")
	Buffer buffer;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lqv;")
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lpq;")
	@Export("packetBuffer")
	PacketBuffer packetBuffer;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ljn;")
	@Export("serverPacket")
	ServerPacket serverPacket;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -438499277)
	@Export("serverPacketLength")
	int serverPacketLength;

	@ObfuscatedName("y")
	boolean field1341;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 482936903)
	int field1342;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1898199617)
	@Export("pendingWrites")
	int pendingWrites;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Ljn;")
	ServerPacket field1350;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljn;")
	ServerPacket field1347;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Ljn;")
	ServerPacket field1352;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1341 = true;
		this.field1342 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1277685397")
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "885234902")
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;
			while (true) {
				PacketBufferNode var1 = ((PacketBufferNode) (this.packetBufferNodes.last()));
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}
				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			} 
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljt;B)V", garbageValue = "-46")
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lnl;I)V", garbageValue = "-1968764439")
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2070187507")
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-59")
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(S)Lnl;", garbageValue = "-13159")
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;ZI)V", garbageValue = "-1796247845")
	public static void method2517(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		class328.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}
}