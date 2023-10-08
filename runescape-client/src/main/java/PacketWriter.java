import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -881098545
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 894589585
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("am")
	boolean field1432;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1260788979
	)
	int field1429;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1395259855
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1431;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1420;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1433;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1432 = true;
		this.field1429 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-633870649"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1725575924"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llx;B)V",
		garbageValue = "22"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-584011742"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087446789"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-669241034"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "-1314055794"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;I)[Lud;",
		garbageValue = "1067620942"
	)
	public static SpritePixels[] method2826(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			SpritePixels[] var5;
			if (!class164.method3376(var0, var3, var4)) {
				var5 = null;
			} else {
				SpritePixels[] var7 = new SpritePixels[class544.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < class544.SpriteBuffer_spriteCount; ++var8) {
					SpritePixels var9 = var7[var8] = new SpritePixels();
					var9.width = class159.SpriteBuffer_spriteWidth;
					var9.height = class500.SpriteBuffer_spriteHeight;
					var9.xOffset = class326.SpriteBuffer_xOffsets[var8];
					var9.yOffset = ModelData0.SpriteBuffer_yOffsets[var8];
					var9.subWidth = class59.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = class544.SpriteBuffer_spriteHeights[var8];
					int var10 = var9.subWidth * var9.subHeight;
					byte[] var11 = AddRequestTask.SpriteBuffer_pixels[var8];
					var9.pixels = new int[var10];

					for (int var12 = 0; var12 < var10; ++var12) {
						var9.pixels[var12] = class372.SpriteBuffer_spritePalette[var11[var12] & 255];
					}
				}

				class407.method7453();
				var5 = var7;
			}

			return var5;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-63"
	)
	public static int method2809(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
