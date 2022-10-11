import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("PacketWriter")
public class PacketWriter {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   @Export("socket")
   AbstractSocket socket;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("packetBufferNodes")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2139454429
   )
   @Export("bufferSize")
   int bufferSize = 0;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer(5000);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   @Export("isaacCipher")
   public IsaacCipher isaacCipher;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket = null;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 394725867
   )
   @Export("serverPacketLength")
   int serverPacketLength = 0;
   @ObfuscatedName("n")
   boolean field1368 = true;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1601992317
   )
   int field1371 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 146295327
   )
   @Export("pendingWrites")
   int pendingWrites = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   ServerPacket field1380;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   ServerPacket field1373;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   ServerPacket field1381;

   PacketWriter() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1136497619"
   )
   @Export("clearBuffer")
   final void clearBuffer() {
      this.packetBufferNodes.rsClear();
      this.bufferSize = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-946579730"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljc;I)V",
      garbageValue = "-292117948"
   )
   @Export("addNode")
   public final void addNode(PacketBufferNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.index = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.bufferSize += var1.index;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lok;B)V",
      garbageValue = "97"
   )
   @Export("setSocket")
   void setSocket(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-76224096"
   )
   @Export("close")
   void close() {
      if (this.socket != null) {
         this.socket.close();
         this.socket = null;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2141925341"
   )
   @Export("removeSocket")
   void removeSocket() {
      this.socket = null;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Lok;",
      garbageValue = "754617906"
   )
   @Export("getSocket")
   AbstractSocket getSocket() {
      return this.socket;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(CI)B",
      garbageValue = "-1601375638"
   )
   @Export("charToByteCp1252")
   public static byte charToByteCp1252(char var0) {
      byte var1;
      if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if (var0 == 8364) {
         var1 = -128;
      } else if (var0 == 8218) {
         var1 = -126;
      } else if (var0 == 402) {
         var1 = -125;
      } else if (var0 == 8222) {
         var1 = -124;
      } else if (var0 == 8230) {
         var1 = -123;
      } else if (var0 == 8224) {
         var1 = -122;
      } else if (var0 == 8225) {
         var1 = -121;
      } else if (var0 == 710) {
         var1 = -120;
      } else if (var0 == 8240) {
         var1 = -119;
      } else if (var0 == 352) {
         var1 = -118;
      } else if (var0 == 8249) {
         var1 = -117;
      } else if (var0 == 338) {
         var1 = -116;
      } else if (var0 == 381) {
         var1 = -114;
      } else if (var0 == 8216) {
         var1 = -111;
      } else if (var0 == 8217) {
         var1 = -110;
      } else if (var0 == 8220) {
         var1 = -109;
      } else if (var0 == 8221) {
         var1 = -108;
      } else if (var0 == 8226) {
         var1 = -107;
      } else if (var0 == 8211) {
         var1 = -106;
      } else if (var0 == 8212) {
         var1 = -105;
      } else if (var0 == 732) {
         var1 = -104;
      } else if (var0 == 8482) {
         var1 = -103;
      } else if (var0 == 353) {
         var1 = -102;
      } else if (var0 == 8250) {
         var1 = -101;
      } else if (var0 == 339) {
         var1 = -100;
      } else if (var0 == 382) {
         var1 = -98;
      } else if (var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-801264900"
   )
   static void method2655(int var0) {
   }
}
