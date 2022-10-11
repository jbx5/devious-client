import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class281 {
   @ObfuscatedName("a")
   static int[] field3279;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2000940713
   )
   static int field3276;

   static {
      new Object();
      field3279 = new int[33];
      field3279[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3279[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lkn;",
      garbageValue = "361559239"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = WorldMapManager.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return Widget.Widget_interfaceComponents[var1][var2];
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;Ljava/lang/String;I)I",
      garbageValue = "1134938260"
   )
   public static int method5418(Buffer var0, String var1) {
      int var2 = var0.offset;
      byte[] var3 = class268.method5365(var1);
      var0.writeSmartByteShort(var3.length);
      var0.offset += class305.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
      return var0.offset - var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-11481"
   )
   static int method5428(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
      }
   }
}
