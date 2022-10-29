import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llp;Llp;B)I",
      garbageValue = "20"
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

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ILki;ZB)V",
      garbageValue = "-28"
   )
   static void method6533(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = getWorldMap().getMapArea(var0);
      int var4 = class296.localPlayer.plane;
      int var5 = KeyHandler.baseX * 64 + (class296.localPlayer.x >> 7);
      int var6 = class158.baseY * 64 + (class296.localPlayer.y >> 7);
      Coord var7 = new Coord(var4, var5, var6);
      getWorldMap().method7882(var3, var7, var1, var2);
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "(B)Lpd;",
      garbageValue = "53"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return class7.worldMap;
   }
}
