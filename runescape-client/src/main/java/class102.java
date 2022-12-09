import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
final class class102 implements class297 {
   @ObfuscatedName("tk")
   @ObfuscatedGetter(
      intValue = 1621599055
   )
   static int field1367;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lkd;)V"
   )
   class102(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1798262930"
   )
   public void vmethod5829() {
      if (this.val$cc != null && this.val$cc.method6185().field3469 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2255(this.val$cc);
         var1.setArgs(this.val$cc.method6185().field3469);
         AABB.method4611().addFirst(var1);
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ldu;FB)F",
      garbageValue = "89"
   )
   static float method2625(class125 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.field1543;
         return (var0.field1537 + var2 * (var0.field1545 * var2 + var0.field1559)) * var2 + var0.field1548;
      }
   }
}
