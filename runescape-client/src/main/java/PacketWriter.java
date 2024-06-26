import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2122551751
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -870602463
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ab")
	boolean field1461;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1278220435
	)
	int field1457;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1102504087
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1462;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1459;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1464;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1461 = true;
		this.field1457 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981239932"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "36"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsp;S)V",
		garbageValue = "-10366"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1942660628"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505606497"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lsp;",
		garbageValue = "1302914773"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("aq")
	public static int method2920(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "2066687441"
	)
	static int method2940(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class130.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1529308622"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field776;
		} else if (var5 >= 100) {
			var6 = Client.field777;
		} else {
			var6 = (Client.field777 - Client.field776) * var5 / 100 + Client.field776;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field782) {
			var10 = Client.field782;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field781) {
				var6 = Client.field781;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field783) {
			var10 = Client.field783;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field751) {
				var6 = Client.field751;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class193.method3758(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
