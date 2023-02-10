import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class320 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsf;"
   )
   @Export("newRunException")
   public static RunException newRunException(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-719272140"
   )
   static void method6429() {
      ItemContainer.itemContainers = new NodeHashTable(32);
   }
}
