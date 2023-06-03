import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("il")
public class class211 implements class29 {
   @ObfuscatedName("at")
   char[] field2346 = new char[128];
   @ObfuscatedName("an")
   int[] field2337 = new int[128];
   @ObfuscatedName("av")
   public int[] field2339 = new int[128];
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1682589327
   )
   public int field2338 = 0;
   @ObfuscatedName("ax")
   int[] field2341 = new int[128];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2126875107
   )
   int field2336 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 305273799
   )
   int field2342 = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 382494323
   )
   int field2343 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1685724559
   )
   int field2344 = 0;
   @ObfuscatedName("af")
   boolean[] field2345 = new boolean[112];
   @ObfuscatedName("ao")
   boolean[] field2347 = new boolean[112];
   @ObfuscatedName("aa")
   boolean[] field2352 = new boolean[112];
   @ObfuscatedName("aj")
   public char field2348;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 2011398897
   )
   public int field2349;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2106714627"
   )
   public boolean vmethod4127(int var1) {
      this.method4144(var1);
      this.field2345[var1] = true;
      this.field2347[var1] = true;
      this.field2352[var1] = false;
      this.field2339[++this.field2338 - 1] = var1;
      return true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "100"
   )
   public boolean vmethod4128(int var1) {
      this.field2345[var1] = false;
      this.field2347[var1] = false;
      this.field2352[var1] = true;
      this.field2341[++this.field2336 - 1] = var1;
      return true;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "4"
   )
   public boolean vmethod4145(char var1) {
      int var2 = this.field2343 + 1 & 127;
      if (var2 != this.field2342) {
         this.field2337[this.field2343] = -1;
         this.field2346[this.field2343] = var1;
         this.field2343 = var2;
      }

      return false;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "839410380"
   )
   public boolean vmethod4131(boolean var1) {
      return false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-33"
   )
   void method4144(int var1) {
      int var2 = this.field2343 + 1 & 127;
      if (var2 != this.field2342) {
         this.field2337[this.field2343] = var1;
         this.field2346[this.field2343] = 0;
         this.field2343 = var2;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1396571827"
   )
   public void method4146() {
      this.field2342 = this.field2344;
      this.field2344 = this.field2343;
      this.field2338 = 0;
      this.field2336 = 0;
      Arrays.fill(this.field2347, false);
      Arrays.fill(this.field2352, false);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "104"
   )
   public final boolean method4133() {
      if (this.field2342 == this.field2344) {
         return false;
      } else {
         this.field2349 = this.field2337[this.field2342];
         this.field2348 = this.field2346[this.field2342];
         this.field2342 = this.field2342 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "62"
   )
   public boolean method4171(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2347[var1] : false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1860279838"
   )
   public boolean method4134(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2345[var1] : false;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "170136780"
   )
   public boolean method4135(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2352[var1] : false;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "969517992"
   )
   public int[] method4136() {
      int[] var1 = new int[this.field2338];

      for(int var2 = 0; var2 < this.field2338; ++var2) {
         var1[var2] = this.field2339[var2];
      }

      return var1;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "834793968"
   )
   public int[] method4137() {
      int[] var1 = new int[this.field2336];

      for(int var2 = 0; var2 < this.field2336; ++var2) {
         var1[var2] = this.field2341[var2];
      }

      return var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZI)I",
      garbageValue = "1273781008"
   )
   static int method4167(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "50"
   )
   public static void method4169(boolean var0) {
      if (var0 != ItemComposition.ItemDefinition_inMembersWorld) {
         ItemComposition.ItemDefinition_cached.clear();
         ItemComposition.ItemDefinition_cachedModels.clear();
         ItemComposition.ItemDefinition_cachedSprites.clear();
         ItemComposition.ItemDefinition_inMembersWorld = var0;
      }

   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1279967208"
   )
   static int method4140(int var0, Script var1, boolean var2) {
      int var3;
      int var6;
      int var9;
      if (var0 == ScriptOpcodes.ENUM_STRING) {
         Interpreter.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         EnumComposition var10 = Canvas.getEnum(var3);
         if (var10.outputType != 's') {
         }

         for(var6 = 0; var6 < var10.outputCount; ++var6) {
            if (var9 == var10.keys[var6]) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10.strVals[var6];
               var10 = null;
               break;
            }
         }

         if (var10 != null) {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10.defaultStr;
         }

         return 1;
      } else if (var0 != ScriptOpcodes.ENUM) {
         if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            EnumComposition var4 = Canvas.getEnum(var3);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 4;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         EnumComposition var7 = Canvas.getEnum(var5);
         if (var3 == var7.inputType && var9 == var7.outputType) {
            for(int var8 = 0; var8 < var7.outputCount; ++var8) {
               if (var6 == var7.keys[var8]) {
                  if (var9 == 115) {
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.strVals[var8];
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var9 == 115) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.defaultStr;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if (var9 == 115) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "null";
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "11"
   )
   static int method4168(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         NPCComposition var6 = Bounds.getNpcDefinition(var5);
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
         return 1;
      } else {
         NPCComposition var3;
         if (var0 == 6764) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
            int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3687(var4);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3735(var4);
            return 1;
         } else if (var0 == 6765) {
            var3 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }
}
