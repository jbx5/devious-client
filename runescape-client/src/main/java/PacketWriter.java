import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("cz")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lnc;")
	@Export("socket")
	AbstractSocket socket;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llx;")
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes = new IterableNodeDeque();

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 368896299)
	@Export("bufferSize")
	int bufferSize = 0;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqr;")
	@Export("buffer")
	Buffer buffer = new Buffer(5000);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqb;")
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqz;")
	@Export("packetBuffer")
	PacketBuffer packetBuffer = new PacketBuffer(40000);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ljy;")
	@Export("serverPacket")
	ServerPacket serverPacket = null;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 807398607)
	@Export("serverPacketLength")
	int serverPacketLength = 0;

	@ObfuscatedName("o")
	boolean field1335 = true;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1783168523)
	int field1336 = 0;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1886150225)
	@Export("pendingWrites")
	int pendingWrites = 0;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ljy;")
	ServerPacket field1337;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Ljy;")
	ServerPacket field1339;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljy;")
	ServerPacket field1330;

	PacketWriter() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-51645083")
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-25497")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljg;I)V", garbageValue = "-1493234153")
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lnc;I)V", garbageValue = "-1478290701")
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1758085375")
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "30")
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)Lnc;", garbageValue = "2")
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "29")
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ParamComposition.loadInterface(var0)) {
			Widget[] var1 = class358.Widget_interfaceComponents[var0];
			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}
		}
	}
}