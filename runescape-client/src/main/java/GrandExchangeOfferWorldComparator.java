import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lod;Lod;B)I",
      garbageValue = "25"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1500765789"
   )
   public static int method6833(int var0) {
      return class452.field4730[var0 & 16383];
   }
}
