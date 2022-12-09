import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lmg;Lmg;B)I",
      garbageValue = "-86"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1999398444"
   )
   @Export("runIntfCloseListeners")
   static final void runIntfCloseListeners(int var0, int var1) {
      if (Players.loadInterface(var0)) {
         WorldMapLabel.runComponentCloseListeners(class71.Widget_interfaceComponents[var0], var1);
      }
   }
}
