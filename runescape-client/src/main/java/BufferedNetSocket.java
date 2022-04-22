import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("o")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("v")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lnx;")

	@Export("source")
	BufferedSource source;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lnd;")

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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-13138")

	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-891040314")

	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"46")

	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"27")

	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)I", garbageValue = 
	"-118")

	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"-1359342670")

	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}
}