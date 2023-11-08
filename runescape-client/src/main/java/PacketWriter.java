import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1288575101
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1040078129
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("al")
	boolean field1411;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1263938853
	)
	int field1412;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1428520947
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1414;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1409;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1416;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1411 = true;
		this.field1412 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "225"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lld;I)V",
		garbageValue = "-1187530783"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1775171508"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "-1239264198"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1549345675"
	)
	static void method2884() {
		try {
			File var0 = new File(Login.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label39:
				for (int var1 = 0; var1 < class85.field1039.length; ++var1) {
					for (var2 = 0; var2 < GameObject.field3091.length; ++var2) {
						File var3 = new File(GameObject.field3091[var2] + class85.field1039[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label39;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1585666384"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class361.World_worlds != null) {
			class129.doWorldSorting(0, class361.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-577406943"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class13.logOut();
		switch(var0) {
		case 1:
			UserComparator7.method2966(24);
			class139.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			CollisionMap.method4354();
		}

	}
}
