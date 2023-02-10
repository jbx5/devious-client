import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
final class class100 implements class301 {
   @ObfuscatedName("n")
   @Export("SpriteBuffer_spritePalette")
   public static int[] SpriteBuffer_spritePalette;
   @ObfuscatedName("k")
   @Export("Tiles_hue")
   static int[] Tiles_hue;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   static IndexedSprite field1335;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   final Widget val$cc;

   @ObfuscatedSignature(
      descriptor = "(Lkz;)V"
   )
   class100(Widget var1) {
      this.val$cc = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1666573426"
   )
   public void vmethod5862() {
      if (this.val$cc != null && this.val$cc.method6228().field3479 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method2313(this.val$cc);
         var1.setArgs(this.val$cc.method6228().field3479);
         class12.method171().addFirst(var1);
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-121"
   )
   public static void method2724() {
      class488.SpriteBuffer_xOffsets = null;
      ApproximateRouteStrategy.SpriteBuffer_yOffsets = null;
      FriendsList.SpriteBuffer_spriteWidths = null;
      class132.SpriteBuffer_spriteHeights = null;
      SpriteBuffer_spritePalette = null;
      class140.SpriteBuffer_pixels = null;
   }
}
