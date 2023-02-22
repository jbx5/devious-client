import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
@Implements("ScriptFrame")
public class ScriptFrame {
   @ObfuscatedName("vy")
   static Iterator field450;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lcv;"
   )
   @Export("script")
   Script script;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -243693225
   )
   @Export("pc")
   int pc = -1;
   @ObfuscatedName("ac")
   @Export("intLocals")
   int[] intLocals;
   @ObfuscatedName("ab")
   @Export("stringLocals")
   String[] stringLocals;

   ScriptFrame() {
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "1931889583"
   )
   static int method1152(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.ADD) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            Interpreter.Interpreter_intStackSize -= 5;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
            return 1;
         } else if (var0 == 4016) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
            return 1;
         } else if (var0 == 4017) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            Interpreter.Interpreter_intStackSize -= 3;
            long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var9 = class287.method5476(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class331.method6351(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator8.method2849(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
            return 1;
         } else if (var0 == 4030) {
            Interpreter.Interpreter_intStackSize -= 4;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var9 = UserComparator8.method2849(var9, var5, var6);
            var7 = class206.method4069(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = SequenceDefinition.method4012(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = NPC.method2622(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = WorldMapRegion.method4951(var9, var4);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            var4 = -1;
            if (class162.isNumber(var3)) {
               var4 = GrandExchangeEvent.method6573(var3);
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "124991534"
   )
   static int method1154(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1564152216"
   )
   static final void method1153(int var0) {
      if (var0 >= 0) {
         int var1 = Client.menuArguments1[var0];
         int var2 = Client.menuArguments2[var0];
         int var3 = Client.menuOpcodes[var0];
         int var4 = Client.menuIdentifiers[var0];
         int var5 = Client.menuItemIds[var0];
         String var6 = Client.menuActions[var0];
         String var7 = Client.menuTargets[var0];
         class287.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
      }
   }
}
