import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ax")
public final class class4 {
   @ObfuscatedName("gx")
   static String field8;

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-473760193"
   )
   static int method12(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
                  GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
                  GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               Interpreter.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
                  GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
                  GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.grandExchangeEvents == null ? 0 : GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  long var5 = BoundaryObject.method5027() - ParamComposition.field2112 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else if (var0 == 3939) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).isTradable ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "497826254"
   )
   static Object method13(int var0) {
      return class490.method8770((class490)GameObject.findEnumerated(class490.method8761(), var0));
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "34"
   )
   static final void method14(boolean var0) {
      WorldMapSectionType.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }
}
