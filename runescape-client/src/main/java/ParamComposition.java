import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("ParamDefinition_archive")
   static AbstractArchive ParamDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ParamDefinition_cached")
   static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("du")
   static boolean field2121;
   @ObfuscatedName("v")
   @Export("type")
   char type;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 818744259
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("m")
   @Export("defaultStr")
   public String defaultStr;
   @ObfuscatedName("q")
   @Export("autoDisable")
   boolean autoDisable = true;

   ParamComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-35"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "125"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "1176853720"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.readByte();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class358.cp1252AsciiExtension[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.type = var3;
      } else if (var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if (var2 == 4) {
         this.autoDisable = false;
      } else if (var2 == 5) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1916237971"
   )
   @Export("isString")
   public boolean isString() {
      return this.type == 's';
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-114129637"
   )
   static int method3803(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == ScriptOpcodes.ADD) {
         class87.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 + var3;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         class87.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         class87.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 * var3;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         class87.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            class87.Interpreter_intStackSize -= 5;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            class87.Interpreter_intStackSize -= 3;
            long var9 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            long var11 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            long var13 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var3 = class233.method4850(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            class87.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapEvent.method5405(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            class87.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class159.method3346(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            class87.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
            return 1;
         } else if (var0 == 4030) {
            class87.Interpreter_intStackSize -= 4;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3];
            var3 = class159.method3346(var3, var5, var6);
            var7 = Actor.method2362(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = class163.method3416(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = SoundSystem.method874(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = Ignored.method7614(var3, var4);
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }
}
