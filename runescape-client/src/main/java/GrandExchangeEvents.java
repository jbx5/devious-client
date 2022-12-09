import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
   @ObfuscatedName("e")
   @Export("GrandExchangeEvents_ageComparator")
   public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
   @ObfuscatedName("v")
   @Export("GrandExchangeEvents_priceComparator")
   public static Comparator GrandExchangeEvents_priceComparator;
   @ObfuscatedName("x")
   @Export("GrandExchangeEvents_nameComparator")
   public static Comparator GrandExchangeEvents_nameComparator;
   @ObfuscatedName("m")
   @Export("GrandExchangeEvents_quantityComparator")
   public static Comparator GrandExchangeEvents_quantityComparator;
   @ObfuscatedName("h")
   @Export("events")
   public final List events;

   static {
      new GrandExchangeOfferWorldComparator();
      GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
      GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
      GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
   }

   @ObfuscatedSignature(
      descriptor = "(Lqy;Z)V",
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "1698148596"
   )
   @Export("sort")
   public void sort(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Laa;B)V",
      garbageValue = "-67"
   )
   @Export("PcmStream_disable")
   static final void PcmStream_disable(PcmStream var0) {
      var0.active = false;
      if (var0.sound != null) {
         var0.sound.position = 0;
      }

      for(PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
         PcmStream_disable(var1);
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "82"
   )
   static int method6569(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.field871 - 7.0) * 256.0);
   }
}
