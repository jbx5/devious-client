import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
   @ObfuscatedName("w")
   @Export("GrandExchangeEvents_ageComparator")
   public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
   @ObfuscatedName("v")
   @Export("GrandExchangeEvents_priceComparator")
   public static Comparator GrandExchangeEvents_priceComparator;
   @ObfuscatedName("s")
   @Export("GrandExchangeEvents_nameComparator")
   public static Comparator GrandExchangeEvents_nameComparator;
   @ObfuscatedName("z")
   @Export("GrandExchangeEvents_quantityComparator")
   public static Comparator GrandExchangeEvents_quantityComparator;
   @ObfuscatedName("f")
   @Export("events")
   public final List events;

   static {
      new GrandExchangeOfferWorldComparator();
      GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
      GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
      GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
   }

   @ObfuscatedSignature(
      descriptor = "(Lrd;Z)V",
      garbageValue = "1"
   )
   public GrandExchangeEvents(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.events = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.events.add(new GrandExchangeEvent(var1, var5, var3));
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "1466510344"
   )
   @Export("sort")
   public void sort(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-93"
   )
   static void method6645(int var0) {
      for(IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
         if ((var1.key >> 48 & 65535L) == (long)var0) {
            var1.remove();
         }
      }

   }
}
