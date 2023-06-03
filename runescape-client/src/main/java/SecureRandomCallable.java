import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   SecureRandomCallable() {
   }

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "23"
   )
   static int method2214(int var0, int var1) {
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-85"
   )
   public static void method2210() {
      VarbitComposition.VarbitDefinition_cached.clear();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1602230035"
   )
   public static void method2215() {
      DbRowType.DBRowType_cache.clear();
   }
}
