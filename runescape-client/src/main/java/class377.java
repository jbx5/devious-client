import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class377 {
   @ObfuscatedName("aj")
   public char field4380;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 427774341
   )
   public int field4379 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1079124409
   )
   public int field4378 = 0;

   class377() {
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "87"
   )
   static void method7139(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.remove();
      }
   }
}
