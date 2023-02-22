import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 527249605
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 959479433
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -960629835
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1689906525
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1789049845
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("ao")
   @Export("action")
   String action;
   @ObfuscatedName("av")
   @Export("target")
   String target;

   MenuAction() {
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1912599738"
   )
   static final void method2052(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZS)I",
      garbageValue = "-3054"
   )
   static int method2053(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 3500) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4074(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4082(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4079(var3) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(Ldq;I)V",
      garbageValue = "65185183"
   )
   static final void method2054(Actor var0) {
      int var2;
      int var3;
      int var4;
      int var6;
      if (var0.targetIndex != -1) {
         Object var1 = null;
         var2 = 65536;
         if (var0.targetIndex < var2) {
            var1 = Client.npcs[var0.targetIndex];
         } else {
            var1 = Client.players[var0.targetIndex - var2];
         }

         if (var1 != null) {
            var3 = var0.x - ((Actor)var1).x;
            var4 = var0.y - ((Actor)var1).y;
            if (var3 != 0 || var4 != 0) {
               var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167) & 2047;
               var0.orientation = var6;
            }
         } else if (var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }
      }

      int var7;
      if (var0.pathLength == 0 || var0.field1214 > 0) {
         var7 = -1;
         if (var0.field1180 != -1 && var0.field1176 != -1) {
            var2 = var0.field1180 * 128 - GameEngine.baseX * 8192 + 64;
            var3 = var0.field1176 * 128 - class178.baseY * 8192 + 64;
            var4 = var0.x - var2;
            int var8 = var0.y - var3;
            if (var4 != 0 || var8 != 0) {
               var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167) & 2047;
               var7 = var6;
            }
         } else if (var0.field1164 != -1) {
            var7 = var0.field1164;
         }

         if (var7 != -1) {
            var0.orientation = var7;
            if (var0.field1157) {
               var0.rotation = var0.orientation;
            }
         }

         var0.method2362();
      }

      var7 = var0.orientation - var0.rotation & 2047;
      if (var7 != 0) {
         boolean var10 = true;
         boolean var11 = true;
         ++var0.field1208;
         var4 = var7 > 1024 ? -1 : 1;
         var0.rotation += var0.field1209 * var4;
         boolean var12 = true;
         if (var7 < var0.field1209 || var7 > 2048 - var0.field1209) {
            var0.rotation = var0.orientation;
            var12 = false;
         }

         if (var0.field1209 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1208 > 25 || var12)) {
            if (var4 == -1 && var0.turnLeftSequence != -1) {
               var0.movementSequence = var0.turnLeftSequence;
            } else if (var4 == 1 && var0.turnRightSequence != -1) {
               var0.movementSequence = var0.turnRightSequence;
            } else {
               var0.movementSequence = var0.walkSequence;
            }
         }

         var0.rotation &= 2047;
      } else {
         if (var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         var0.field1208 = 0;
      }

   }
}
