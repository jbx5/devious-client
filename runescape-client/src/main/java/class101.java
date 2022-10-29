import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
final class class101 implements class294 {
   @ObfuscatedName("vw")
   @ObfuscatedGetter(
      longValue = 5641096588668851147L
   )
   static long field1307;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lkn;)V"
   )
   class101(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-462679777"
   )
   public void vmethod5708() {
      if (this.val$cc != null && this.val$cc.method6079().field3415 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2233(this.val$cc);
         var1.setArgs(this.val$cc.method6079().field3415);
         class420.method7802().addFirst(var1);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Lgl;",
      garbageValue = "1170073041"
   )
   static HorizontalAlignment[] method2565() {
      return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1951, HorizontalAlignment.field1950};
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-968767024"
   )
   static int method2560(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      }

      class143.invalidateWidget(var3);
      if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
         if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
            var3.modelType = 2;
            var3.modelId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
            var3.modelType = 3;
            var3.modelId = class296.localPlayer.appearance.getChatHeadId();
            return 1;
         } else {
            return 2;
         }
      } else {
         class379.Interpreter_intStackSize -= 2;
         int var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = MidiPcmStream.ItemDefinition_get(var4);
         var3.modelAngleX = var6.xan2d;
         var3.modelAngleY = var6.yan2d;
         var3.modelAngleZ = var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d;
         var3.modelOffsetY = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
            var3.itemQuantityMode = 0;
         } else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
            var3.itemQuantityMode = 1;
         } else {
            var3.itemQuantityMode = 2;
         }

         if (var3.field3537 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field3537;
         } else if (var3.rawWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
         }

         return 1;
      }
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-445674716"
   )
   static void method2567(int var0, int var1, int var2) {
      if (var0 != 0) {
         int var3 = var0 >> 8;
         int var4 = var0 >> 4 & 7;
         int var5 = var0 & 15;
         Client.soundEffectIds[Client.soundEffectCount] = var3;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
         Client.soundEffects[Client.soundEffectCount] = null;
         int var6 = (var1 - 64) / 128;
         int var7 = (var2 - 64) / 128;
         Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16);
         ++Client.soundEffectCount;
      }
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "911510291"
   )
   @Export("Widget_runOnTargetLeave")
   static void Widget_runOnTargetLeave() {
      if (Client.isSpellSelected) {
         Widget var0 = WorldMapDecoration.getWidgetChild(class124.selectedSpellWidget, Client.selectedSpellChildIndex);
         if (var0 != null && var0.onTargetLeave != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.widget = var0;
            var1.args = var0.onTargetLeave;
            ServerPacket.runScriptEvent(var1);
         }

         Client.selectedSpellItemId = -1;
         Client.isSpellSelected = false;
         class143.invalidateWidget(var0);
      }
   }
}
