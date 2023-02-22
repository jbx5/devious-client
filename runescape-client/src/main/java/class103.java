import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
final class class103 implements class304 {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lmy;)V"
   )
   class103(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "177803302"
   )
   public void vmethod5776() {
      if (this.val$cc != null && this.val$cc.method6163().field3459 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2260(this.val$cc);
         var1.setArgs(this.val$cc.method6163().field3459);
         class144.method3139().addFirst(var1);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIZIB)J",
      garbageValue = "107"
   )
   @Export("calculateTag")
   public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "26"
   )
   static int method2670(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CLIENTCLOCK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == ScriptOpcodes.INV_GETOBJ) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.method2220(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_GETNUM) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.ItemContainer_getCount(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_TOTAL) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.method4791(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_SIZE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.getInvDefinition(var3).size;
            return 1;
         } else if (var0 == ScriptOpcodes.STAT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_BASE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_XP) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
            return 1;
         } else {
            int var5;
            if (var0 == ScriptOpcodes.COORD) {
               var3 = TaskHandler.Client_plane;
               var4 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7);
               var5 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if (var0 == ScriptOpcodes.COORDX) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDZ) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDY) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.method2220(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.ItemContainer_getCount(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.method4791(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
               if (Client.staffModLevel >= 2) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_WORLD) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
               return 1;
            } else if (var0 == ScriptOpcodes.PLAYERMOD) {
               if (Client.playerMod) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
               return 1;
            } else if (var0 == ScriptOpcodes.MOVECOORD) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               return 1;
            } else if (var0 == 3326) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field515;
               return 1;
            } else if (var0 == 3327) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field496;
               return 1;
            } else if (var0 == 3331) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)V",
      garbageValue = "1656599991"
   )
   static final void method2671(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field756 == -1) {
            Client.field756 = var0.spriteId2;
            Client.field718 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field756;
         } else {
            var0.spriteId2 = Client.field718;
         }

      } else if (var1 == 325) {
         if (Client.field756 == -1) {
            Client.field756 = var0.spriteId2;
            Client.field718 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field718;
         } else {
            var0.spriteId2 = Client.field756;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }
}
