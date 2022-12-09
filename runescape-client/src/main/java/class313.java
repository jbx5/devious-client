import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public enum class313 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   field3720(0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   field3721(1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   field3723(2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   field3722(3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   field3724(4);

   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -742495887
   )
   final int field3725;

   class313(int var3) {
      this.field3725 = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3725;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1788675438"
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
