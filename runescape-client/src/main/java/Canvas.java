import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1852926703
   )
   @Export("loginBoxCenter")
   static int loginBoxCenter;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1947443311
   )
   static int field126;
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("a")
   @Export("component")
   Component component;

   Canvas(Component var1) {
      this.component = var1;
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "806733038"
   )
   static int method327(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         class379.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = class281.getWidget(var9);
            if (var6.children == null) {
               var6.children = new Widget[var11 + 1];
            }

            if (var6.children.length <= var11) {
               Widget[] var7 = new Widget[var11 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if (var11 > 0 && var6.children[var11 - 1] == null) {
               throw new RuntimeException("" + (var11 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.childIndex = var11;
               var12.isIf3 = true;
               if (var4 == 12) {
                  var12.method6120();
                  var12.method6076().method5814(new class100(var12));
                  var12.method6076().method5813(new class101(var12));
               }

               var6.children[var11] = var12;
               if (var2) {
                  class140.scriptDotWidget = var12;
               } else {
                  class136.scriptActiveWidget = var12;
               }

               class143.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
            Widget var10 = class281.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            class143.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
            var3.children = null;
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     class140.scriptDotWidget = var3;
                  } else {
                     class136.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class379.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Widget var5 = WorldMapDecoration.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  class140.scriptDotWidget = var5;
               } else {
                  class136.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IZI)Ljava/lang/String;",
      garbageValue = "1028163044"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lkn;I)Ljava/lang/String;",
      garbageValue = "434081345"
   )
   static String method319(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               var0 = var0.substring(0, var3) + class162.method3326(class268.method5366(var1, var2 - 1)) + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
