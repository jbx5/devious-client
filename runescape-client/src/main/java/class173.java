import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class173 {
   @ObfuscatedName("ws")
   @ObfuscatedGetter(
      intValue = -1905199499
   )
   @Export("foundItemIndex")
   static int foundItemIndex;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Leo;"
   )
   public UrlRequest field1830;
   @ObfuscatedName("al")
   public float[] field1829;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   final class167 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgs;)V"
   )
   class173(class167 var1) {
      this.this$0 = var1;
      this.field1829 = new float[4];
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IB)V",
      garbageValue = "1"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field3575 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field3670 == null) {
            var0.field3670 = new int[var0.field3575.length];
         }

         var0.field3670[var1] = Integer.MAX_VALUE;
      }
   }
}
