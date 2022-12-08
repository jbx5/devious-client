import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class374 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 377720323
   )
   int field4427;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -502601723
   )
   int field4426;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 771706783
   )
   int field4428;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2056477773
   )
   int field4429;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field4427).length();
      int var3 = 10 - Integer.toString(this.field4428).length();
      int var4 = 10 - Integer.toString(this.field4426).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field4427 + var5 + "Created: " + this.field4426 + var7 + "Total used: " + this.field4428 + var6 + "Max-In-Use: " + this.field4429;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)[Lrx;",
      garbageValue = "1796695547"
   )
   static SpritePixels[] method7318() {
      SpritePixels[] var0 = new SpritePixels[class481.SpriteBuffer_spriteCount];

      for(int var1 = 0; var1 < class481.SpriteBuffer_spriteCount; ++var1) {
         SpritePixels var2 = var0[var1] = new SpritePixels();
         var2.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth;
         var2.height = class481.SpriteBuffer_spriteHeight;
         var2.xOffset = class481.SpriteBuffer_xOffsets[var1];
         var2.yOffset = class414.SpriteBuffer_yOffsets[var1];
         var2.subWidth = class11.SpriteBuffer_spriteWidths[var1];
         var2.subHeight = StructComposition.SpriteBuffer_spriteHeights[var1];
         int var3 = var2.subHeight * var2.subWidth;
         byte[] var4 = FloorDecoration.SpriteBuffer_pixels[var1];
         var2.pixels = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var2.pixels[var5] = WorldMapEvent.SpriteBuffer_spritePalette[var4[var5] & 255];
         }
      }

      class481.SpriteBuffer_xOffsets = null;
      class414.SpriteBuffer_yOffsets = null;
      class11.SpriteBuffer_spriteWidths = null;
      StructComposition.SpriteBuffer_spriteHeights = null;
      WorldMapEvent.SpriteBuffer_spritePalette = null;
      FloorDecoration.SpriteBuffer_pixels = null;
      return var0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "1173906398"
   )
   public static long method7315(int var0) {
      if (var0 > 63) {
         throw new class363("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1210470674"
   )
   @Export("hslToRgb")
   static final int hslToRgb(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }
}
