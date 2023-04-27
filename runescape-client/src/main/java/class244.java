import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
public class class244 {
   @ObfuscatedName("bb")
   @Export("fontHelvetica13")
   static java.awt.Font fontHelvetica13;

   @ObfuscatedName("an")
   public static String method5045(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while(var0 != 0L) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(class373.base37Table[(int)(var6 - 37L * var0)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "6390717"
   )
   static int method5043(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHIDE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETLAYER) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("nx")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1315268736"
   )
   static void method5044(int var0) {
      Client.oculusOrbState = var0;
   }
}
