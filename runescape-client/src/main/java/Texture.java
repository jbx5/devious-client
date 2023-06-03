import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Texture")
public class Texture extends Node {
   @ObfuscatedName("ac")
   @Export("Texture_animatedPixels")
   static int[] Texture_animatedPixels;
   @ObfuscatedName("ax")
   @Export("averageRGB")
   int averageRGB;
   @ObfuscatedName("ap")
   boolean field2469;
   @ObfuscatedName("ab")
   @Export("fileIds")
   int[] fileIds;
   @ObfuscatedName("ak")
   int[] field2473;
   @ObfuscatedName("ae")
   int[] field2474;
   @ObfuscatedName("af")
   int[] field2467;
   @ObfuscatedName("ao")
   @Export("animationDirection")
   int animationDirection;
   @ObfuscatedName("aa")
   @Export("animationSpeed")
   int animationSpeed;
   @ObfuscatedName("aj")
   @Export("pixels")
   int[] pixels;
   @ObfuscatedName("ad")
   @Export("isLoaded")
   boolean isLoaded = false;

   @ObfuscatedSignature(
      descriptor = "(Ltz;)V"
   )
   Texture(Buffer var1) {
      this.averageRGB = var1.readUnsignedShort();
      this.field2469 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if (var2 >= 1 && var2 <= 4) {
         this.fileIds = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.fileIds[var3] = var1.readUnsignedShort();
         }

         if (var2 > 1) {
            this.field2473 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2473[var3] = var1.readUnsignedByte();
            }
         }

         if (var2 > 1) {
            this.field2474 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2474[var3] = var1.readUnsignedByte();
            }
         }

         this.field2467 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field2467[var3] = var1.readInt();
         }

         this.animationDirection = var1.readUnsignedByte();
         this.animationSpeed = var1.readUnsignedByte();
         this.pixels = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(DILnq;)Z"
   )
   @Export("load")
   boolean load(double var1, int var3, AbstractArchive var4) {
      int var5;
      for(var5 = 0; var5 < this.fileIds.length; ++var5) {
         if (var4.getFileFlat(this.fileIds[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.pixels = new int[var5];

      for(int var6 = 0; var6 < this.fileIds.length; ++var6) {
         int var8 = this.fileIds[var6];
         IndexedSprite var7;
         if (!Archive.method6692(var4, var8)) {
            var7 = null;
         } else {
            IndexedSprite var10 = new IndexedSprite();
            var10.width = class330.SpriteBuffer_spriteWidth;
            var10.height = class489.SpriteBuffer_spriteHeight;
            var10.xOffset = class515.SpriteBuffer_xOffsets[0];
            var10.yOffset = class402.SpriteBuffer_yOffsets[0];
            var10.subWidth = class515.SpriteBuffer_spriteWidths[0];
            var10.subHeight = class515.SpriteBuffer_spriteHeights[0];
            var10.palette = class515.SpriteBuffer_spritePalette;
            var10.pixels = class515.SpriteBuffer_pixels[0];
            TextureProvider.method4758();
            var7 = var10;
         }

         var7.normalize();
         byte[] var17 = var7.pixels;
         int[] var11 = var7.palette;
         int var12 = this.field2467[var6];
         if ((var12 & -16777216) == 16777216) {
         }

         if ((var12 & -16777216) == 33554432) {
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if ((var12 & -16777216) == 50331648) {
            var13 = var12 & 16711935;
            var14 = var12 >> 8 & 255;

            for(var15 = 0; var15 < var11.length; ++var15) {
               var16 = var11[var15];
               if (var16 >> 8 == (var16 & '\uffff')) {
                  var16 &= 255;
                  var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var11.length; ++var13) {
            var11[var13] = Rasterizer3D.Rasterizer3D_brighten(var11[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field2473[var6 - 1];
         }

         if (var13 == 0) {
            if (var3 == var7.subWidth) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.pixels[var14] = var11[var17[var14] & 255];
               }
            } else if (var7.subWidth == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.pixels[var14++] = var11[var17[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
                  }
               }
            } else {
               if (var7.subWidth != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.pixels[var14++] = var11[var17[(var16 << 1) + (var15 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var13 == 1) {
         }

         if (var13 == 2) {
         }

         if (var13 == 3) {
         }
      }

      return true;
   }

   @ObfuscatedName("an")
   @Export("reset")
   void reset() {
      this.pixels = null;
   }

   @ObfuscatedName("av")
   @Export("animate")
   void animate(int var1) {
      if (this.pixels != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = var2 * this.animationSpeed * var1;
            var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }

            var10 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var10;
         }

         if (this.animationDirection == 2 || this.animationDirection == 4) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = this.animationSpeed * var1;
            var5 = var2 - 1;
            if (this.animationDirection == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }

            var10 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var10;
         }

      }
   }
}
