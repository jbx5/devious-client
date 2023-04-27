import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public final class class373 {
   @ObfuscatedName("af")
   @Export("base37Table")
   static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("an")
   static long[] field4384 = new long[12];
   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      descriptor = "Lep;"
   )
   @Export("varcs")
   static Varcs varcs;

   static {
      for(int var0 = 0; var0 < field4384.length; ++var0) {
         field4384[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "121"
   )
   public static int method7203(int var0) {
      return var0 >>> 12;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "96"
   )
   @Export("itemContainerSetItem")
   static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.put(var4, (long)var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ids.length; ++var7) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for(var7 = var4.ids.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }
}
