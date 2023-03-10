import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
   @ObfuscatedName("wd")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("al")
   @Export("GrandExchangeEvents_ageComparator")
   public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
   @ObfuscatedName("ac")
   @Export("GrandExchangeEvents_priceComparator")
   public static Comparator GrandExchangeEvents_priceComparator;
   @ObfuscatedName("ab")
   @Export("GrandExchangeEvents_nameComparator")
   public static Comparator GrandExchangeEvents_nameComparator;
   @ObfuscatedName("an")
   @Export("GrandExchangeEvents_quantityComparator")
   public static Comparator GrandExchangeEvents_quantityComparator;
   @ObfuscatedName("aj")
   @Export("events")
   public final List events;

   static {
      new GrandExchangeOfferWorldComparator();
      GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
      GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
      GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
   }

   @ObfuscatedSignature(
      descriptor = "(Lsy;Z)V",
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "1953519779"
   )
   @Export("sort")
   public void sort(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([BI)Ljava/lang/String;",
      garbageValue = "370211652"
   )
   public static String method6539(byte[] var0) {
      return ClientPreferences.method2537(var0, 0, var0.length);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)Ljava/lang/String;",
      garbageValue = "204170492"
   )
   static String method6535(Buffer var0, int var1) {
      try {
         int var2 = var0.readUShortSmart();
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class315.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
         String var4 = GrandExchangeOfferUnitPriceComparator.decodeStringCp1252(var3, 0, var2);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
