import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
final class class69 implements ThreadFactory {
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("clientLanguage")
   static Language clientLanguage;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "48"
   )
   static int method2039(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.GETWINDOWMODE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class7.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.SETWINDOWMODE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               NPC.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.method2450();
            return 1;
         } else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
            if (var0 == 5310) {
               --Interpreter.Interpreter_intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               WorldMapSectionType.clientPreferences.method2510(var3);
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(Lmy;B)V",
      garbageValue = "2"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field695) {
         Client.field722[var0.rootIndex] = true;
      }

   }
}
