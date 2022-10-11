import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class409 {
   @ObfuscatedName("a")
   float[] field4583;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1670550447
   )
   int field4582;

   class409(float[] var1, int var2) {
      this.field4583 = var1;
      this.field4582 = var2;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)I",
      garbageValue = "-624936655"
   )
   static int method7736(Widget var0) {
      if (var0.type != 11) {
         --class125.Interpreter_stringStackSize;
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var0.method6067(var1);
         return 1;
      }
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lck;",
      garbageValue = "-432582414"
   )
   static final InterfaceParent method7738(int var0, int var1, int var2) {
      InterfaceParent var3 = new InterfaceParent();
      var3.group = var1;
      var3.type = var2;
      Client.interfaceParents.put(var3, (long)var0);
      Tiles.Widget_resetModelFrames(var1);
      Widget var4 = class281.getWidget(var0);
      class143.invalidateWidget(var4);
      if (Client.meslayerContinueWidget != null) {
         class143.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
      class147.runWidgetOnLoadListener(var1);
      if (Client.rootInterface != -1) {
         WallDecoration.runIntfCloseListeners(Client.rootInterface, 1);
      }

      return var3;
   }
}
