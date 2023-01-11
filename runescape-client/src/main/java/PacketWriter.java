import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("PacketWriter")
public class PacketWriter {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   @Export("socket")
   AbstractSocket socket;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   @Export("packetBufferNodes")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1512304017
   )
   @Export("bufferSize")
   int bufferSize = 0;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer(5000);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("isaacCipher")
   public IsaacCipher isaacCipher;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lqx;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket = null;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 395481445
   )
   @Export("serverPacketLength")
   int serverPacketLength = 0;
   @ObfuscatedName("u")
   boolean field1430 = true;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -562413973
   )
   int field1420 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1673559747
   )
   @Export("pendingWrites")
   int pendingWrites = 0;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   ServerPacket field1431;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   ServerPacket field1432;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   ServerPacket field1433;

   PacketWriter() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1102121791"
   )
   @Export("clearBuffer")
   final void clearBuffer() {
      this.packetBufferNodes.rsClear();
      this.bufferSize = 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1736028032"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljx;S)V",
      garbageValue = "21536"
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
      descriptor = "(Lou;B)V",
      garbageValue = "41"
   )
   @Export("setSocket")
   void setSocket(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1012692446"
   )
   @Export("close")
   void close() {
      if (this.socket != null) {
         this.socket.close();
         this.socket = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1728539133"
   )
   @Export("removeSocket")
   void removeSocket() {
      this.socket = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lou;",
      garbageValue = "121"
   )
   @Export("getSocket")
   AbstractSocket getSocket() {
      return this.socket;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;ZII)V",
      garbageValue = "1924558705"
   )
   public static void method2741(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      NPCComposition.NpcDefinition_archive = var0;
      class363.field4361 = var1;
      GrandExchangeOfferUnitPriceComparator.field4275 = var2;
      NPCComposition.defaultHeadIconArchive = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "315974479"
   )
   @Export("Widget_unpackTargetMask")
   public static int Widget_unpackTargetMask(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1292831199"
   )
   public static int method2729(int var0, int var1) {
      int var2;
      for(var2 = 0; var1 > 0; --var1) {
         var2 = var2 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1918112547"
   )
   static final String method2742(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
      }
   }
}
