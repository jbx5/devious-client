import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
final class class130 implements ThreadFactory {
   @ObfuscatedName("o")
   @Export("cacheSubPaths")
   public static String[] cacheSubPaths;
   @ObfuscatedName("nd")
   @ObfuscatedGetter(
      intValue = -685565429
   )
   @Export("menuX")
   static int menuX;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-1879910170"
   )
   static int method3087(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         class302.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = class133.getWidget(var9);
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
                  var12.method6224();
                  var12.method6235().method5970(new class100(var12));
                  var12.method6235().method5969(new class101(var12));
               }

               var6.children[var11] = var12;
               if (var2) {
                  Interpreter.scriptDotWidget = var12;
               } else {
                  class85.scriptActiveWidget = var12;
               }

               LoginScreenAnimation.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
            Widget var10 = class133.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            LoginScreenAnimation.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
            var3.children = null;
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     Interpreter.scriptDotWidget = var3;
                  } else {
                     class85.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class302.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Widget var5 = class135.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  Interpreter.scriptDotWidget = var5;
               } else {
                  class85.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }
}
