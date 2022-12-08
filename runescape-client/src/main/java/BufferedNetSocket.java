import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("h")
   @Export("socket")
   Socket socket;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lol;"
   )
   @Export("source")
   BufferedSource source;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lox;"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1050513320"
   )
   @Export("isAvailable")
   public boolean isAvailable(int var1) throws IOException {
      return this.source.isAvailable(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-16"
   )
   @Export("available")
   public int available() throws IOException {
      return this.source.available();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1910038551"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() throws IOException {
      return this.source.readUnsignedByte();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "2022338375"
   )
   @Export("read")
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "43"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "985050188"
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
