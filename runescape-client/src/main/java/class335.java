import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class335 {
   @ObfuscatedName("k")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1491774127"
   )
   @Export("SpriteBuffer_decode")
   static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class477.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class451.SpriteBuffer_xOffsets = new int[class477.SpriteBuffer_spriteCount];
      class319.SpriteBuffer_yOffsets = new int[class477.SpriteBuffer_spriteCount];
      class450.SpriteBuffer_spriteWidths = new int[class477.SpriteBuffer_spriteCount];
      class477.SpriteBuffer_spriteHeights = new int[class477.SpriteBuffer_spriteCount];
      class453.SpriteBuffer_pixels = new byte[class477.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class477.SpriteBuffer_spriteCount * 8;
      class477.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class477.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) {
         class451.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) {
         class319.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) {
         class450.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) {
         class477.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class477.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      class477.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class477.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (class477.SpriteBuffer_spritePalette[var3] == 0) {
            class477.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) {
         int var4 = class450.SpriteBuffer_spriteWidths[var3];
         int var5 = class477.SpriteBuffer_spriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class453.SpriteBuffer_pixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.readByte();
               }
            }
         }
      }

   }
}
