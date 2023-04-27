import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive18")
   static Archive archive18;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnu;Lnu;I)I",
      garbageValue = "-411750205"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1338946112"
   )
   public static int method6884(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }
}
