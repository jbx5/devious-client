import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1715620411
   )
   @Export("SpriteBuffer_spriteWidth")
   public static int SpriteBuffer_spriteWidth;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lmg;Lmg;B)I",
      garbageValue = "22"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lkd;II)V",
      garbageValue = "137593594"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field3622 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field3692 == null) {
            var0.field3692 = new int[var0.field3622.length];
         }

         var0.field3692[var1] = Integer.MAX_VALUE;
      }
   }
}
