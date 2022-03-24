import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-1563809265)

	static int field4286;
	@ObfuscatedName("v")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lny;")

	@Export("source")
	BufferedSource source;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lnh;")

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
	"(B)V", garbageValue = 
	"105")

	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1669312252")

	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1264669351")

	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"396806768")

	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"([BIII)I", garbageValue = 
	"52142940")

	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)V", garbageValue = 
	"-57")

	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}
}