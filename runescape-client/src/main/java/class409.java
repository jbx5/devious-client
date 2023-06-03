import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class409 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpo;"
   )
   public static final class409 field4549 = new class409(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpo;"
   )
   static final class409 field4548 = new class409(1);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 170219121
   )
   final int field4547;

   class409(int var1) {
      this.field4547 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "23"
   )
   public static void method7687(int var0, int var1) {
      Iterator var2 = class304.field3388.iterator();

      while(var2.hasNext()) {
         class312 var3 = (class312)var2.next();
         var3.vmethod5914(var0, var1);
      }

   }
}
