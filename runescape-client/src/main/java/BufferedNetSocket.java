import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mr")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 1443215399)
    @Export("Interpreter_stringStackSize")
    static int Interpreter_stringStackSize;

    @ObfuscatedName("c")
    @Export("socket")
    Socket socket;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lmv;")
    @Export("source")
    BufferedSource source;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lmj;")
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

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-499949391")
    @Export("close")
    public void close() {
        this.sink.close();
        try {
            this.socket.close();
        } catch (IOException var2) {
        }
        this.source.close();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-86")
    @Export("readUnsignedByte")
    public int readUnsignedByte() throws IOException {
        return this.source.readUnsignedByte();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2115909346")
    @Export("available")
    public int available() throws IOException {
        return this.source.available();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "67")
    @Export("isAvailable")
    public boolean isAvailable(int var1) throws IOException {
        return this.source.isAvailable(var1);
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "-781316249")
    @Export("read")
    public int read(byte[] var1, int var2, int var3) throws IOException {
        return this.source.read(var1, var2, var3);
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "300460862")
    @Export("write")
    public void write(byte[] var1, int var2, int var3) throws IOException {
        this.sink.write(var1, var2, var3);
    }

    protected void finalize() {
        this.close();
    }
}