import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -175790253
   )
   @Export("width")
   int width;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 424237321
   )
   @Export("height")
   int height;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 602652957
   )
   @Export("x")
   int x;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -422577093
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   final WorldMapRenderer this$0;

   @ObfuscatedSignature(
      descriptor = "(Lie;)V"
   )
   WorldMapRectangle(WorldMapRenderer var1) {
      this.this$0 = var1;
   }
}
