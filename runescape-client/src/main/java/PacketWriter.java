import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("cx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lnj;")
	@Export("socket")
	AbstractSocket socket;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes = new IterableNodeDeque();

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1289075821)
	@Export("bufferSize")
	int bufferSize = 0;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lqw;")
	@Export("buffer")
	Buffer buffer = new Buffer(5000);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqx;")
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("packetBuffer")
	PacketBuffer packetBuffer = new PacketBuffer(40000);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljr;")
	@Export("serverPacket")
	ServerPacket serverPacket = null;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1552785885)
	@Export("serverPacketLength")
	int serverPacketLength = 0;

	@ObfuscatedName("h")
	boolean field1328 = true;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 2051211853)
	int field1332 = 0;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1703250495)
	@Export("pendingWrites")
	int pendingWrites = 0;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ljr;")
	ServerPacket field1339;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Ljr;")
	ServerPacket field1338;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ljr;")
	ServerPacket field1333;

	PacketWriter() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1796874878")
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lji;I)V", garbageValue = "85695598")
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lnj;I)V", garbageValue = "956369932")
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "845615957")
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1350533680")
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)Lnj;", garbageValue = "-1")
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Lku;B)I", garbageValue = "-79")
	static int method2600(Widget var0) {
		if (var0.type != 11) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var0.method5641(var1);
			return 1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "1508117485")
	static int method2599(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}