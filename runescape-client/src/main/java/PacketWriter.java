import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1737915133
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 571826815
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ad")
	boolean field1434;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -60278445
	)
	int field1442;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -313873225
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1444;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1446;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1447;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1434 = true;
		this.field1442 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050822204"
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
		descriptor = "(Lmh;I)V",
		garbageValue = "1820843042"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "1991611295"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103979421"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrq;",
		garbageValue = "1648103891"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "-459075448"
	)
	static final boolean method2801(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6325(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6326(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6326(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.field3299, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
