import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public enum class86 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1095(0, -1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1094(1, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1098(2, 3),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1096(3, 4),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1097(4, 5),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   field1102(5, 6);

   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1416858077
   )
   @Export("cacheGamebuild")
   public static int cacheGamebuild;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1375045067
   )
   final int field1103;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1420454587
   )
   final int field1100;

   class86(int var3, int var4) {
      this.field1103 = var3;
      this.field1100 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1100;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1962588142"
   )
   static int method2346(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;B)Z",
      garbageValue = "77"
   )
   static boolean method2341(Date var0) {
      java.util.Calendar var1 = java.util.Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }
}
