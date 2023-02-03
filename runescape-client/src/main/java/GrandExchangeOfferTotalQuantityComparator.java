import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
   @ObfuscatedName("gu")
   @Export("secureRandom")
   static SecureRandom secureRandom;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmv;Lmv;I)I",
      garbageValue = "-1885708948"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-213688643"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }
}
