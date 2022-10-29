import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
   @ObfuscatedName("ij")
   @Export("regions")
   static int[] regions;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1816036113
   )
   @Export("approxDestinationX")
   public int approxDestinationX;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -639446105
   )
   @Export("approxDestinationY")
   public int approxDestinationY;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1855921895
   )
   @Export("approxDestinationSizeX")
   public int approxDestinationSizeX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 969919873
   )
   @Export("approxDestinationSizeY")
   public int approxDestinationSizeY;

   protected RouteStrategy() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIILgr;I)Z",
      garbageValue = "-376004430"
   )
   @Export("hasArrived")
   public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "-27"
   )
   static int method4044(int var0, Script var1, boolean var2) {
      Widget var7;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
            var7 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               class97 var8 = new class97(var4, var7.id, var7.childIndex, var7.itemId);
               Interpreter.field851.add(var8);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
            class379.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               class97 var6 = new class97(var5, var3, var4, class281.getWidget(var3).itemId);
               Interpreter.field851.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field839 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var7 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         } else {
            var7 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
         }

         if (var7.onResize == null) {
            return 0;
         } else {
            ScriptEvent var9 = new ScriptEvent();
            var9.widget = var7;
            var9.args = var7.onResize;
            var9.field1053 = Interpreter.field839 + 1;
            Client.scriptEvents.addFirst(var9);
            return 1;
         }
      }
   }
}
