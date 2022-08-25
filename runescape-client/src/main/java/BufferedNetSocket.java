import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
@ObfuscatedName("na")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("f")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lnj;")
	@Export("source")
	BufferedSource source;

	@ObfuscatedName("h")
	@Export("socket")
	Socket socket;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lnx;")
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "126370664")
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "14")
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-660901031")
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BIIB)I", garbageValue = "-6")
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([BIIS)V", garbageValue = "-16011")
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-947955059")
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
}