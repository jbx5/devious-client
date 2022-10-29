import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ew")
public class class136 extends class135 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("scriptActiveWidget")
   static Widget scriptActiveWidget;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1922783559
   )
   int field1587;
   @ObfuscatedName("f")
   boolean field1588;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class136(class138 var1) {
      this.this$0 = var1;
      this.field1587 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1587 = var1.readUnsignedShort();
      this.field1588 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3102(this.field1587, this.field1588);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZS)I",
      garbageValue = "3789"
   )
   static int method2991(int var0, Script var1, boolean var2) {
      int var3;
      int var6;
      int var9;
      if (var0 == ScriptOpcodes.ENUM_STRING) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         EnumComposition var10 = Clock.getEnum(var3);
         if (var10.outputType != 's') {
         }

         for(var6 = 0; var6 < var10.outputCount; ++var6) {
            if (var9 == var10.keys[var6]) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10.strVals[var6];
               var10 = null;
               break;
            }
         }

         if (var10 != null) {
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10.defaultStr;
         }

         return 1;
      } else if (var0 != ScriptOpcodes.ENUM) {
         if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            EnumComposition var4 = Clock.getEnum(var3);
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         class379.Interpreter_intStackSize -= 4;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
         EnumComposition var7 = Clock.getEnum(var5);
         if (var3 == var7.inputType && var9 == var7.outputType) {
            for(int var8 = 0; var8 < var7.outputCount; ++var8) {
               if (var6 == var7.keys[var8]) {
                  if (var9 == 115) {
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.strVals[var8];
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var9 == 115) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.defaultStr;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if (var9 == 115) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "null";
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(Lkn;Lgp;IIZI)V",
      garbageValue = "1315594698"
   )
   @Export("addWidgetItemMenuItem")
   static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         UserComparator8.insertMenuItem(var7, GameObject.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4);
      }

   }
}
