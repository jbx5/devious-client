import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lod;Lod;I)I",
      garbageValue = "2033249317"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName().compareTo(var2.getOfferName());
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
