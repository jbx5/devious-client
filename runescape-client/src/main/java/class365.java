import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nx")
public class class365 implements Iterator {
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = -1083525607
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   class366 field4364;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1835580561
   )
   int field4365 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -541714235
   )
   int field4366;

   @ObfuscatedSignature(
      descriptor = "(Lnm;)V"
   )
   class365(class366 var1) {
      this.field4366 = this.field4364.field4372;
      this.field4364 = var1;
   }

   public boolean hasNext() {
      return this.field4365 < this.field4364.field4369;
   }

   public Object next() {
      if (this.field4364.field4372 != this.field4366) {
         throw new ConcurrentModificationException();
      } else if (this.field4365 < this.field4364.field4369) {
         Object var1 = this.field4364.field4373[this.field4365].field4362;
         ++this.field4365;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-337661484"
   )
   static int method7000(int var0, Script var1, boolean var2) {
      Widget var7;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
            var7 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               class98 var8 = new class98(var4, var7.id, var7.childIndex, var7.itemId);
               Interpreter.field867.add(var8);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
            class87.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               class98 var6 = new class98(var5, var3, var4, PlayerCompositionColorTextureOverride.getWidget(var3).itemId);
               Interpreter.field867.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field874 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var7 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         } else {
            var7 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
         }

         if (var7.onResize == null) {
            return 0;
         } else {
            ScriptEvent var9 = new ScriptEvent();
            var9.widget = var7;
            var9.args = var7.onResize;
            var9.field1084 = Interpreter.field874 + 1;
            Client.scriptEvents.addFirst(var9);
            return 1;
         }
      }
   }
}
