import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mg")
public class class327 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;B)V",
      garbageValue = "6"
   )
   public static void method6574(AbstractArchive var0) {
      DbRowType.field4968 = var0;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "46"
   )
   static int method6575(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.field758 = (short)VertexNormal.method4909(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
         if (Client.field758 <= 0) {
            Client.field758 = 256;
         }

         Client.field759 = (short)VertexNormal.method4909(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (Client.field759 <= 0) {
            Client.field759 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         Interpreter.Interpreter_intStackSize -= 4;
         Client.field572 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.field572 <= 0) {
            Client.field572 = 1;
         }

         Client.field763 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.field763 <= 0) {
            Client.field763 = 32767;
         } else if (Client.field763 < Client.field572) {
            Client.field763 = Client.field572;
         }

         Client.field620 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (Client.field620 <= 0) {
            Client.field620 = 1;
         }

         Client.field694 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         if (Client.field694 <= 0) {
            Client.field694 = 32767;
         } else if (Client.field694 < Client.field620) {
            Client.field694 = Client.field620;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            class36.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.method878(Client.field758);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.method878(Client.field759);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class262.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
