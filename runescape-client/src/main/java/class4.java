import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public final class class4 {
   @ObfuscatedName("tb")
   @ObfuscatedGetter(
      intValue = 123289600
   )
   static int field11;

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2019597533"
   )
   @Export("iLog")
   public static int iLog(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1186884492"
   )
   static final int method15(int var0, int var1) {
      int var2 = class320.method6262(var0 + '넵', var1 + 91923, 4) - 128 + (class320.method6262(10294 + var0, '鎽' + var1, 2) - 128 >> 1) + (class320.method6262(var0, var1, 1) - 128 >> 2);
      var2 = (int)((double)var2 * 0.3) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }
}
