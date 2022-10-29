import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = 2768850440823628545L
   )
   public static long field3653;
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("worldSelectBackSprites")
   static SpritePixels[] worldSelectBackSprites;
   @ObfuscatedName("a")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   DirectByteArrayCopier() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "2"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-622381156"
   )
   @Export("set")
   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-1548833033"
   )
   static int method6228(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               if (WorldMapCacheName.grandExchangeEvents != null) {
                  WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               if (WorldMapCacheName.grandExchangeEvents != null) {
                  WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               class379.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1;
               if (WorldMapCacheName.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  WorldMapCacheName.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               if (WorldMapCacheName.grandExchangeEvents != null) {
                  WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               if (WorldMapCacheName.grandExchangeEvents != null) {
                  WorldMapCacheName.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapCacheName.grandExchangeEvents == null ? 0 : WorldMapCacheName.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  long var5 = UserComparator8.method2748() - class101.field1307 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapCacheName.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
