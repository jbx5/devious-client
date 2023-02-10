import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qb")
class class457 implements Iterator {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 358564795
   )
   int field4884;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   final class458 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lqt;)V"
   )
   class457(class458 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field4884 < this.this$0.method8001();
   }

   public Object next() {
      int var1 = ++this.field4884 - 1;
      class423 var2 = (class423)this.this$0.field4888.get((long)var1);
      return var2 != null ? var2 : this.this$0.method8467(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1674234176"
   )
   static int method8459(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.CC_GETOP) {
         if (var0 == ScriptOpcodes.CC_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
