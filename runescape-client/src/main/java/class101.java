import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
final class class101 implements class297 {
   @ObfuscatedName("tt")
   @ObfuscatedGetter(
      intValue = -2019861191
   )
   static int field1365;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = 978763523
   )
   @Export("selectedItemSlot")
   static int selectedItemSlot;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lkd;)V"
   )
   class101(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1798262930"
   )
   public void vmethod5829() {
      if (this.val$cc != null && this.val$cc.method6185().field3468 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2255(this.val$cc);
         var1.setArgs(this.val$cc.method6185().field3468);
         AABB.method4611().addFirst(var1);
      }

   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1255396169"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field739 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (Message.getWindowedMode() == 1) {
         BuddyRankComparator.client.setMaxCanvasSize(765, 503);
      } else {
         BuddyRankComparator.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         GameEngine.method665();
      }

   }
}
