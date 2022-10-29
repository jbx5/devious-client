import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hj")
@Implements("Frames")
public class Frames extends DualNode {
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      longValue = -3395560641786882595L
   )
   static long field2530;
   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   static AbstractSocket field2528;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Lho;"
   )
   @Export("frames")
   Animation[] frames;

   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;IZ)V",
      garbageValue = "0"
   )
   public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      NodeDeque var5 = new NodeDeque();
      int var6 = var1.getGroupFileCount(var3);
      this.frames = new Animation[var6];
      int[] var7 = var1.getGroupFileIds(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.takeFile(var3, var7[var8]);
         Skeleton var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
            if (var11 == var12.id) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13 = var2.getFile(var11, 0);
            var10 = new Skeleton(var11, var13);
            var5.addFirst(var10);
         }

         this.frames[var7[var8]] = new Animation(var9, var10);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1883161689"
   )
   @Export("hasAlphaTransform")
   public boolean hasAlphaTransform(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "1139752609"
   )
   static int method4469(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CLIENTCLOCK) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.cycle;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == ScriptOpcodes.INV_GETOBJ) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class457.method8304(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_GETNUM) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class139.ItemContainer_getCount(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_TOTAL) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapAreaData.method5266(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_SIZE) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getInvDefinition(var3).size;
            return 1;
         } else if (var0 == ScriptOpcodes.STAT) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_BASE) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.levels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_XP) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.experience[var3];
            return 1;
         } else {
            int var5;
            if (var0 == ScriptOpcodes.COORD) {
               var3 = ApproximateRouteStrategy.Client_plane;
               var4 = KeyHandler.baseX * 64 + (class296.localPlayer.x >> 7);
               var5 = class158.baseY * 64 + (class296.localPlayer.y >> 7);
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if (var0 == ScriptOpcodes.COORDX) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDZ) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 >> 28;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDY) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
               class379.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class457.method8304(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
               class379.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class139.ItemContainer_getCount(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
               class379.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapAreaData.method5266(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
               if (Client.staffModLevel >= 2) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.rebootTimer;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_WORLD) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.worldId;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.runEnergy;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.weight;
               return 1;
            } else if (var0 == ScriptOpcodes.PLAYERMOD) {
               if (Client.playerMod) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.worldProperties;
               return 1;
            } else if (var0 == ScriptOpcodes.MOVECOORD) {
               class379.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
               int var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
               return 1;
            } else if (var0 == 3326) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field504;
               return 1;
            } else if (var0 == 3327) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field630;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
