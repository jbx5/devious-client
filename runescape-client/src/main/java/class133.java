import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class133 extends class135 {
   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   static Widget field1575;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -6099282781711769875L
   )
   long field1573;
   @ObfuscatedName("f")
   String field1572;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class133(class138 var1) {
      this.this$0 = var1;
      this.field1573 = -1L;
      this.field1572 = null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1573 = var1.readLong();
      }

      this.field1572 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3080(this.field1573, this.field1572, 0);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1780275774"
   )
   static void method2975() {
      ItemContainer.itemContainers = new NodeHashTable(32);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "115"
   )
   @Export("Messages_getLastChatID")
   static int Messages_getLastChatID(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
      }
   }
}
