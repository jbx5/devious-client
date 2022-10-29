import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
public class class313 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = -84985137
   )
   @Export("cameraZ")
   static int cameraZ;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZS)I",
      garbageValue = "255"
   )
   static int method6248(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         var4 = class281.getWidget(var3);
      } else {
         var4 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      }

      if (var0 == ScriptOpcodes.CC_SETPOSITION) {
         class379.Interpreter_intStackSize -= 4;
         var4.rawX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4.rawY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         var4.xAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         var4.yAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
         class143.invalidateWidget(var4);
         ClanChannelMember.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETSIZE) {
         class379.Interpreter_intStackSize -= 4;
         var4.rawWidth = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4.rawHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         var4.widthAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         var4.heightAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
         class143.invalidateWidget(var4);
         ClanChannelMember.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETHIDE) {
         boolean var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         if (var5 != var4.isHidden) {
            var4.isHidden = var5;
            class143.invalidateWidget(var4);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
         var4.noClickThrough = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
         var4.noScrollThrough = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-4925"
   )
   public static void method6246() {
      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   static boolean method6247() {
      return (Client.drawPlayerNames & 4) != 0;
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)Ljava/lang/String;",
      garbageValue = "1141569989"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (class167.Widget_unpackTargetMask(class197.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
