import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   SecureRandomCallable() {
   }

   public Object call() {
      return class9.method74();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1604405350"
   )
   static int method2203(int var0, int var1) {
      for(int var2 = 0; var2 < 8; ++var2) {
         if (var1 <= var0 + 30) {
            return var2;
         }

         var0 += 30;
         var0 += var2 != 1 && var2 != 3 ? 5 : 20;
      }

      return 0;
   }
}
