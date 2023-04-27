import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -2017760987
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;

   SecureRandomCallable() {
   }

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lmq;Lmw;ZS)V",
      garbageValue = "222"
   )
   public static void method2223(Widget var0, PlayerComposition var1, boolean var2) {
      var0.modelType = 7;
      var0.field3584 = new PlayerComposition(var1);
      if (!var2) {
         var0.field3584.equipment = Arrays.copyOf(var0.field3584.field3522, var0.field3584.field3522.length);
         var0.field3584.method6068();
      }

   }
}
