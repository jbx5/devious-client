import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
final class class105 implements class321 {
   @ObfuscatedName("wb")
   @ObfuscatedGetter(
      intValue = 1072694307
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lmb;)V"
   )
   class105(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "51"
   )
   public void vmethod5986() {
      if (this.val$cc != null && this.val$cc.method6383().field3528 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2247(this.val$cc);
         var1.setArgs(this.val$cc.method6383().field3528);
         Message.method1177().addFirst(var1);
      }

   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2052906651"
   )
   @Export("setTapToDrop")
   static void setTapToDrop(boolean var0) {
      Client.tapToDrop = var0;
   }
}
