import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("PacketWriter")
public class PacketWriter {
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 2073555541
   )
   @Export("menuWidth")
   static int menuWidth;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   @Export("socket")
   AbstractSocket socket;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("packetBufferNodes")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1277128427
   )
   @Export("bufferSize")
   int bufferSize = 0;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer(5000);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltk;"
   )
   @Export("isaacCipher")
   public IsaacCipher isaacCipher;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket = null;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 630160811
   )
   @Export("serverPacketLength")
   int serverPacketLength = 0;
   @ObfuscatedName("ap")
   boolean field1385 = true;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 924409333
   )
   int field1383 = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -943421313
   )
   @Export("pendingWrites")
   int pendingWrites = 0;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   ServerPacket field1388;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   ServerPacket field1389;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   ServerPacket field1390;

   PacketWriter() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2072551795"
   )
   @Export("clearBuffer")
   final void clearBuffer() {
      this.packetBufferNodes.rsClear();
      this.bufferSize = 0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lkp;I)V",
      garbageValue = "-712600048"
   )
   @Export("addNode")
   public final void addNode(PacketBufferNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.index = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.bufferSize += var1.index;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lpj;I)V",
      garbageValue = "1344285266"
   )
   @Export("setSocket")
   void setSocket(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-56"
   )
   @Export("close")
   void close() {
      if (this.socket != null) {
         this.socket.close();
         this.socket = null;
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1871566155"
   )
   @Export("removeSocket")
   void removeSocket() {
      this.socket = null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)Lpj;",
      garbageValue = "0"
   )
   @Export("getSocket")
   AbstractSocket getSocket() {
      return this.socket;
   }

   @ObfuscatedName("nx")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "442725709"
   )
   static void method2787(int var0) {
      SequenceDefinition var1 = Coord.SequenceDefinition_get(var0);
      if (var1.isCachedModelIdSet()) {
         int var3 = var1.SequenceDefinition_cachedModelId;
         class134 var5 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3);
         class134 var4;
         if (var5 != null) {
            var4 = var5;
         } else {
            AbstractArchive var7 = SequenceDefinition.SequenceDefinition_animationsArchive;
            AbstractArchive var8 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
            boolean var9 = true;
            byte[] var10 = var7.getFile(var3 >> 16 & '\uffff', var3 & '\uffff');
            class134 var6;
            if (var10 == null) {
               var9 = false;
               var6 = null;
            } else {
               int var11 = (var10[1] & 255) << 8 | var10[2] & 255;
               byte[] var12 = var8.getFile(var11, 0);
               if (var12 == null) {
                  var9 = false;
               }

               if (!var9) {
                  var6 = null;
               } else {
                  if (UserComparator7.field1413 == null) {
                     class134.field1573 = Runtime.getRuntime().availableProcessors();
                     UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class60());
                  }

                  try {
                     var6 = new class134(var7, var8, var3, false);
                  } catch (Exception var14) {
                     var6 = null;
                  }
               }
            }

            if (var6 != null) {
               SequenceDefinition.SequenceDefinition_cachedModel.put(var6, (long)var3);
            }

            var4 = var6;
         }

         int var2;
         if (var4 == null) {
            var2 = 2;
         } else {
            var2 = var4.method3044() ? 0 : 1;
         }

         if (var2 == 2) {
            Client.field745.add(var1.SequenceDefinition_cachedModelId);
         }

      }
   }
}
