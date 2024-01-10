import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("cs")
	static String field1412;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1397857855
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -29908699
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ae")
	boolean field1408;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 131827527
	)
	int field1399;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1983813925
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	ServerPacket field1402;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	ServerPacket field1411;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	ServerPacket field1407;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1408 = true;
		this.field1399 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "420416830"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1547817611"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llr;I)V",
		garbageValue = "1256729563"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lri;B)V",
		garbageValue = "25"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "-857387060"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}
}
