import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gq")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      descriptor = "Lmk;"
   )
   @Export("grandExchangeEvents")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("EnumDefinition_archive")
   static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("s")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("z")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1053984563
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1265657645
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("n")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("l")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("k")
   @Export("strVals")
   public String[] strVals;

   EnumComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2126248770"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "-225365971"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.inputType = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.outputType = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if (var2 == 5) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.strVals[var3] = var1.readStringCp1252NullTerminated();
            }
         } else if (var2 == 6) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.intVals = new int[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "59"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1103882701"
   )
   static int method3711(int var0, Script var1, boolean var2) {
      Widget var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTEXT) {
         Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.text;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleZ;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTRANS) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyTop;
         return 1;
      } else if (var0 == 2610) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyBot;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         class302 var4;
         if (var0 == 2617) {
            var4 = var3.method6226();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3465 : 0;
         }

         if (var0 == 2618) {
            var4 = var3.method6226();
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3470 : 0;
            return 1;
         } else {
            class307 var7;
            if (var0 == 2619) {
               var7 = var3.method6235();
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6128().method7078() : "";
               return 1;
            } else if (var0 == 2620) {
               var4 = var3.method6226();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3467 : 0;
               return 1;
            } else if (var0 == 2621) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5950() : 0;
               return 1;
            } else if (var0 == 2622) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5983() : 0;
               return 1;
            } else if (var0 == 2623) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5984() : 0;
               return 1;
            } else if (var0 == 2624) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5974() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5973().method7307() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var7 = var3.method6235();
                  int var5 = var7 != null ? var7.method5978() : 0;
                  int var6 = var7 != null ? var7.method6145() : 0;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 2628) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6145() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5985() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5948() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6058() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5987() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 2633) {
                     var8 = var3.method6227();
                     Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var8 = var3.method6227();
                     Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method394((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5954() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1234070189"
   )
   static boolean method3710(int var0) {
      for(int var1 = 0; var1 < Client.field759; ++var1) {
         if (Client.field745[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
