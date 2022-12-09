import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mx")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ObfuscatedName("x")
   static boolean field4275;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lmg;Lmg;I)I",
      garbageValue = "1387071428"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "843888430"
   )
   static int method6641(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CLIENTCLOCK) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.cycle;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == ScriptOpcodes.INV_GETOBJ) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method267(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_GETNUM) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ClientPreferences.ItemContainer_getCount(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_TOTAL) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class200.method4095(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_SIZE) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class324.getInvDefinition(var3).size;
            return 1;
         } else if (var0 == ScriptOpcodes.STAT) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_BASE) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.levels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_XP) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.experience[var3];
            return 1;
         } else {
            int var5;
            if (var0 == ScriptOpcodes.COORD) {
               var3 = class383.Client_plane;
               var4 = class154.baseX * 64 + (class155.localPlayer.x >> 7);
               var5 = class365.baseY * 64 + (class155.localPlayer.y >> 7);
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if (var0 == ScriptOpcodes.COORDX) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDZ) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 >> 28;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDY) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method267(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ClientPreferences.ItemContainer_getCount(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class200.method4095(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
               if (Client.staffModLevel >= 2) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.rebootTimer;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_WORLD) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.worldId;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.weight;
               return 1;
            } else if (var0 == ScriptOpcodes.PLAYERMOD) {
               if (Client.playerMod) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.worldProperties;
               return 1;
            } else if (var0 == ScriptOpcodes.MOVECOORD) {
               class87.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
               int var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               return 1;
            } else if (var0 == 3326) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field520;
               return 1;
            } else if (var0 == 3327) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field552;
               return 1;
            } else if (var0 == 3331) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.runEnergy;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-49"
   )
   static void method6640() {
      if (class155.localPlayer.x >> 7 == Client.destinationX && class155.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

   }
}
