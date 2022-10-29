import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
   @ObfuscatedName("a")
   @Export("socket")
   Socket socket;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   @Export("source")
   BufferedSource source;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Low;"
   )
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1620434704"
   )
   @Export("isAvailable")
   public boolean isAvailable(int var1) throws IOException {
      return this.source.isAvailable(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1875273278"
   )
   @Export("available")
   public int available() throws IOException {
      return this.source.available();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "7042"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() throws IOException {
      return this.source.readUnsignedByte();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "-1864209340"
   )
   @Export("read")
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1825322520"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "78"
   )
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
