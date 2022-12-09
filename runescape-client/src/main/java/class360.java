import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public final class class360 {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("scriptActiveWidget")
   static Widget scriptActiveWidget;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Lrx;",
      garbageValue = "-529833233"
   )
   static SpritePixels method6967() {
      SpritePixels var0 = new SpritePixels();
      var0.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth;
      var0.height = class481.SpriteBuffer_spriteHeight;
      var0.xOffset = class481.SpriteBuffer_xOffsets[0];
      var0.yOffset = class414.SpriteBuffer_yOffsets[0];
      var0.subWidth = class11.SpriteBuffer_spriteWidths[0];
      var0.subHeight = StructComposition.SpriteBuffer_spriteHeights[0];
      int var1 = var0.subHeight * var0.subWidth;
      byte[] var2 = FloorDecoration.SpriteBuffer_pixels[0];
      var0.pixels = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.pixels[var3] = WorldMapEvent.SpriteBuffer_spritePalette[var2[var3] & 255];
      }

      class481.SpriteBuffer_xOffsets = null;
      class414.SpriteBuffer_yOffsets = null;
      class11.SpriteBuffer_spriteWidths = null;
      StructComposition.SpriteBuffer_spriteHeights = null;
      WorldMapEvent.SpriteBuffer_spritePalette = null;
      FloorDecoration.SpriteBuffer_pixels = null;
      return var0;
   }
}
