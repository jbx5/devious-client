import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("PacketWriter")
public class PacketWriter {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqz;"
   )
   @Export("socket")
   AbstractSocket socket;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("packetBufferNodes")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -22329009
   )
   @Export("bufferSize")
   int bufferSize = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer(5000);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("isaacCipher")
   public IsaacCipher isaacCipher;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ltl;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket = null;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1149109749
   )
   @Export("serverPacketLength")
   int serverPacketLength = 0;
   @ObfuscatedName("ae")
   boolean field1387 = true;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 372058233
   )
   int field1388 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1074296969
   )
   @Export("pendingWrites")
   int pendingWrites = 0;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   ServerPacket field1390;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   ServerPacket field1393;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   ServerPacket field1392;

   PacketWriter() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "16711935"
   )
   @Export("clearBuffer")
   final void clearBuffer() {
      this.packetBufferNodes.rsClear();
      this.bufferSize = 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1733515630"
   )
   @Export("flush")
   final void flush() throws IOException {
      if (this.socket != null && this.bufferSize > 0) {
         this.buffer.offset = 0;

         while(true) {
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Llm;I)V",
      garbageValue = "-792658230"
   )
   @Export("addNode")
   public final void addNode(PacketBufferNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.index = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.bufferSize += var1.index;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lqz;I)V",
      garbageValue = "-325785679"
   )
   @Export("setSocket")
   void setSocket(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1129024542"
   )
   @Export("close")
   void close() {
      if (this.socket != null) {
         this.socket.close();
         this.socket = null;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-220432815"
   )
   @Export("removeSocket")
   void removeSocket() {
      this.socket = null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Lqz;",
      garbageValue = "31"
   )
   @Export("getSocket")
   AbstractSocket getSocket() {
      return this.socket;
   }
}
