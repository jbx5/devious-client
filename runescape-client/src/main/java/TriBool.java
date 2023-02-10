import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ot")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();
   @ObfuscatedName("fa")
   @ObfuscatedGetter(
      intValue = 1403299061
   )
   static int field4580;

   TriBool() {
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "-37"
   )
   static int method7752(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               if (EnumComposition.grandExchangeEvents != null) {
                  EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               if (EnumComposition.grandExchangeEvents != null) {
                  EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               class302.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1;
               if (EnumComposition.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  EnumComposition.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               if (EnumComposition.grandExchangeEvents != null) {
                  EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               if (EnumComposition.grandExchangeEvents != null) {
                  EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = EnumComposition.grandExchangeEvents == null ? 0 : EnumComposition.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  long var5 = class153.method3317() - class361.field4359 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "1"
   )
   static String method7753(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
      }
   }
}
