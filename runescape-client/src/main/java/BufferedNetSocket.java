import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.net.Socket;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ni")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("o")
	@Export("socket")
	Socket socket;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnu;")
	@Export("source")
	BufferedSource source;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lnq;")
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-17")
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-717230257")
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "354179744")
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "([BIIB)I", garbageValue = "42")
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-1292249553")
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1642633675")
	@Export("close")
	public void close() {
		this.sink.close();
		try {
			this.socket.close();
		} catch (IOException var2) {
		}
		this.source.close();
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llc;Ljava/lang/String;Ljava/lang/String;B)Lql;", garbageValue = "21")
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class174.method3444(var0, var3, var4);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "-74")
	static int method6883(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var5)))));
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3.method5640()) ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			return PacketWriter.method2600(var3);
		} else if (var0 == 2709) {
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			return HealthBar.method2410(var3);
		} else {
			return 2;
		}
	}
}