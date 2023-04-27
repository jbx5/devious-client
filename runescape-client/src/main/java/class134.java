import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public enum class134 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1603(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1610(1, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1602(2, 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1605(3, 3),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1599(4, 4),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1604(5, 5),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1600(6, 6),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1606(7, 7),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   field1607(8, 8);

   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -895397955
   )
   final int field1608;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 59724017
   )
   final int field1609;

   class134(int var3, int var4) {
      this.field1608 = var3;
      this.field1609 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1609;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([I[II)V",
      garbageValue = "-1476012206"
   )
   public static void method3181(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         ClanChannel.ByteArrayPool_alternativeSizes = var0;
         class136.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
         UserComparator3.ByteArrayPool_arrays = new byte[var0.length][][];

         for(int var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) {
            UserComparator3.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
            ByteArrayPool.field4472.add(var0[var2]);
         }

         Collections.sort(ByteArrayPool.field4472);
      } else {
         ClanChannel.ByteArrayPool_alternativeSizes = null;
         class136.ByteArrayPool_altSizeArrayCounts = null;
         UserComparator3.ByteArrayPool_arrays = null;
         class273.method5614();
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "0"
   )
   public static int method3179(int var0, int var1, int var2) {
      int var3 = class140.method3220(var2 - var1 + 1);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "3"
   )
   @Export("isCharAlphabetic")
   public static boolean isCharAlphabetic(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("oi")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "68"
   )
   static boolean method3178() {
      return class20.clientPreferences.method2469() >= Client.field493;
   }
}
