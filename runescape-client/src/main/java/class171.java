import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
public class class171 {
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -1688131963
   )
   static int field1825;

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-525389543"
   )
   static int method3486(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var4 = FriendSystem.getWidget(var3);
      } else {
         var4 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      }

      if (var0 == ScriptOpcodes.CC_SETPOSITION) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         Messages.invalidateWidget(var4);
         class347.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETSIZE) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         Messages.invalidateWidget(var4);
         class347.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETHIDE) {
         boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         if (var5 != var4.isHidden) {
            var4.isHidden = var5;
            Messages.invalidateWidget(var4);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
         var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
         var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Lcc;",
      garbageValue = "-10"
   )
   @Export("getNextWorldListWorld")
   static World getNextWorldListWorld() {
      return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
   }
}
