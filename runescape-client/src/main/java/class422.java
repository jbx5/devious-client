import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qx")
public class class422 {
   @ObfuscatedName("aj")
   float field4619;
   @ObfuscatedName("al")
   float field4624;
   @ObfuscatedName("ac")
   float field4615;
   @ObfuscatedName("ab")
   float field4616;
   @ObfuscatedName("an")
   float field4617;
   @ObfuscatedName("ao")
   float field4618;
   @ObfuscatedName("av")
   float field4613;
   @ObfuscatedName("aq")
   float field4620;
   @ObfuscatedName("ap")
   float field4621;
   @ObfuscatedName("ar")
   float field4622;
   @ObfuscatedName("ak")
   float field4614;
   @ObfuscatedName("ax")
   float field4623;

   static {
      new class422();
   }

   class422() {
      this.method7903();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1933719764"
   )
   void method7903() {
      this.field4623 = 0.0F;
      this.field4614 = 0.0F;
      this.field4622 = 0.0F;
      this.field4620 = 0.0F;
      this.field4613 = 0.0F;
      this.field4618 = 0.0F;
      this.field4616 = 0.0F;
      this.field4615 = 0.0F;
      this.field4624 = 0.0F;
      this.field4621 = 1.0F;
      this.field4617 = 1.0F;
      this.field4619 = 1.0F;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-1117453232"
   )
   void method7904(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4624;
      float var5 = this.field4617;
      float var6 = this.field4620;
      float var7 = this.field4614;
      this.field4624 = var2 * var4 - this.field4615 * var3;
      this.field4615 = var2 * this.field4615 + var4 * var3;
      this.field4617 = var2 * var5 - var3 * this.field4618;
      this.field4618 = var2 * this.field4618 + var5 * var3;
      this.field4620 = var6 * var2 - this.field4621 * var3;
      this.field4621 = var6 * var3 + this.field4621 * var2;
      this.field4614 = var2 * var7 - var3 * this.field4623;
      this.field4623 = var2 * this.field4623 + var7 * var3;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-1895738714"
   )
   void method7905(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4619;
      float var5 = this.field4616;
      float var6 = this.field4613;
      float var7 = this.field4622;
      this.field4619 = var2 * var4 + var3 * this.field4615;
      this.field4615 = this.field4615 * var2 - var4 * var3;
      this.field4616 = var3 * this.field4618 + var5 * var2;
      this.field4618 = var2 * this.field4618 - var5 * var3;
      this.field4613 = this.field4621 * var3 + var6 * var2;
      this.field4621 = var2 * this.field4621 - var6 * var3;
      this.field4622 = this.field4623 * var3 + var2 * var7;
      this.field4623 = this.field4623 * var2 - var7 * var3;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-1995207939"
   )
   void method7908(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4619;
      float var5 = this.field4616;
      float var6 = this.field4613;
      float var7 = this.field4622;
      this.field4619 = var2 * var4 - var3 * this.field4624;
      this.field4624 = var3 * var4 + this.field4624 * var2;
      this.field4616 = var5 * var2 - this.field4617 * var3;
      this.field4617 = var3 * var5 + var2 * this.field4617;
      this.field4613 = var6 * var2 - this.field4620 * var3;
      this.field4620 = this.field4620 * var2 + var6 * var3;
      this.field4622 = var2 * var7 - var3 * this.field4614;
      this.field4614 = var7 * var3 + this.field4614 * var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "-446919774"
   )
   void method7913(float var1, float var2, float var3) {
      this.field4622 += var1;
      this.field4614 += var2;
      this.field4623 += var3;
   }

   public String toString() {
      return this.field4619 + "," + this.field4616 + "," + this.field4613 + "," + this.field4622 + "\n" + this.field4624 + "," + this.field4617 + "," + this.field4620 + "," + this.field4614 + "\n" + this.field4615 + "," + this.field4618 + "," + this.field4621 + "," + this.field4623;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "-31"
   )
   static int method7922(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var4 = WorldMapSection1.getWidget(var3);
      } else {
         var4 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      }

      if (var0 == ScriptOpcodes.CC_SETPOSITION) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         class69.invalidateWidget(var4);
         class392.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETSIZE) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         class69.invalidateWidget(var4);
         class392.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETHIDE) {
         boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         if (var5 != var4.isHidden) {
            var4.isHidden = var5;
            class69.invalidateWidget(var4);
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
}
