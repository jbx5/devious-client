import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1780254277
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 414239573
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ae")
	boolean field1452;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1393121097
	)
	int field1453;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1277978583
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ServerPacket field1455;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ServerPacket field1448;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ServerPacket field1444;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1452 = true;
		this.field1453 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-58595112"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1979538498"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "2114456816"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsx;I)V",
		garbageValue = "-1807591513"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-80816886"
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
		garbageValue = "-64550408"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lsx;",
		garbageValue = "-1533368825"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lum;",
		garbageValue = "-57"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class423.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class532.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class532.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(WorldMapLabelSize.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}
}
