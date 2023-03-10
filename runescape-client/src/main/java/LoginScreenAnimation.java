import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("mapSceneSprites")
   static IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("sprites")
   IndexedSprite[] sprites;
   @ObfuscatedName("av")
   int[] field1231 = new int[256];
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1799581355
   )
   int field1234 = 0;
   @ObfuscatedName("ap")
   int[] field1235;
   @ObfuscatedName("ar")
   int[] field1236;
   @ObfuscatedName("ak")
   int[] field1237;
   @ObfuscatedName("ax")
   int[] field1238;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -987210543
   )
   int field1247 = 0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 976671989
   )
   int field1229 = 0;
   @ObfuscatedName("am")
   int[] field1246;
   @ObfuscatedName("az")
   int[] field1242;
   @ObfuscatedName("ae")
   int[] field1243;
   @ObfuscatedName("au")
   int[] field1244;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -843108399
   )
   int field1245 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -316853488
   )
   int field1240 = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1747294615
   )
   int field1233 = 0;

   @ObfuscatedSignature(
      descriptor = "([Lsp;)V"
   )
   LoginScreenAnimation(IndexedSprite[] var1) {
      this.sprites = var1;
      this.initColors();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-64"
   )
   @Export("initColors")
   void initColors() {
      this.field1236 = new int[256];

      int var1;
      for(var1 = 0; var1 < 64; ++var1) {
         this.field1236[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1236[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1236[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1236[var1 + 192] = 16777215;
      }

      this.field1237 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1237[var1] = var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1237[var1 + 64] = var1 * 4 + '\uff00';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1237[var1 + 128] = var1 * 262144 + '\uffff';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1237[var1 + 192] = 16777215;
      }

      this.field1238 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1238[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1238[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1238[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1238[var1 + 192] = 16777215;
      }

      this.field1235 = new int[256];
      this.field1245 = 0;
      this.field1243 = new int['耀'];
      this.field1244 = new int['耀'];
      this.method2394((IndexedSprite)null);
      this.field1246 = new int['耀'];
      this.field1242 = new int['耀'];
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1947284022"
   )
   void method2418() {
      this.field1236 = null;
      this.field1237 = null;
      this.field1238 = null;
      this.field1235 = null;
      this.field1243 = null;
      this.field1244 = null;
      this.field1246 = null;
      this.field1242 = null;
      this.field1245 = 0;
      this.field1240 = 0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1856839217"
   )
   @Export("draw")
   void draw(int var1, int var2) {
      if (this.field1246 == null) {
         this.initColors();
      }

      if (this.field1233 == 0) {
         this.field1233 = var2;
      }

      int var3 = var2 - this.field1233;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field1233 = var2;
      if (var3 > 0) {
         this.method2389(var3);
      }

      this.method2391(var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2069106519"
   )
   final void method2389(int var1) {
      this.field1245 += 128 * var1;
      int var2;
      if (this.field1245 > this.field1243.length) {
         this.field1245 -= this.field1243.length;
         var2 = (int)(Math.random() * 12.0);
         this.method2394(this.sprites[var2]);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field1246[var2 + var3] - this.field1243[var2 + this.field1245 & this.field1243.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1246[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = var7 * 128;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.field1246[var8 + var9] = 255;
            } else {
               this.field1246[var9 + var8] = 0;
            }
         }
      }

      if (this.field1247 * 16 > 0) {
         this.field1247 = this.field1247 * 16 - var1 * 4;
      }

      if (this.field1229 * 16 > 0) {
         this.field1229 = this.field1229 * 16 - var1 * 4;
      }

      if (this.field1247 * 16 == 0 && this.field1229 * 16 == 0) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.field1247 = 1024;
         }

         if (var7 == 1) {
            this.field1229 = 1024;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.field1231[var7] = this.field1231[var7 + var1];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.field1231[var7] = (int)(Math.sin((double)this.field1234 / 14.0) * 16.0 + Math.sin((double)this.field1234 / 15.0) * 14.0 + Math.sin((double)this.field1234 / 16.0) * 12.0);
         ++this.field1234;
      }

      this.field1240 = this.field1240 * 10000 + var1 * 10000;
      var7 = ((Client.cycle & 1) + var1) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < this.field1240 * 100; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.field1246[var12 + (var13 << 7)] = 192;
         }

         this.field1240 = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = var11 * 128;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var7 + var14 < 128) {
                  var12 += this.field1246[var7 + var14 + var13];
               }

               if (var14 - (var7 + 1) >= 0) {
                  var12 -= this.field1246[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.field1242[var13 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var13 + var7 < 256) {
                  var12 += this.field1242[var14 + var11 + var7 * 128];
               }

               if (var13 - (var7 + 1) >= 0) {
                  var12 -= this.field1242[var14 + var11 - (var7 + 1) * 128];
               }

               if (var13 >= 0) {
                  this.field1246[var11 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1192166879"
   )
   final int method2399(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var4 * (var1 & '\uff00') & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "114"
   )
   final void method2391(int var1) {
      int var2 = this.field1235.length;
      if (this.field1247 * 16 > 0) {
         this.method2392(this.field1247 * 16, this.field1237);
      } else if (this.field1229 * 16 > 0) {
         this.method2392(this.field1229 * 16, this.field1238);
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.field1235[var3] = this.field1236[var3];
         }
      }

      this.method2393(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I[IB)V",
      garbageValue = "100"
   )
   final void method2392(int var1, int[] var2) {
      int var3 = this.field1235.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.field1235[var4] = this.method2399(this.field1236[var4], var2[var4], 1024 - var1);
         } else if (var1 > 256) {
            this.field1235[var4] = var2[var4];
         } else {
            this.field1235[var4] = this.method2399(var2[var4], this.field1236[var4], 256 - var1);
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "7"
   )
   final void method2393(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.field1231[var3] / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= StudioGame.rasterProvider.width) {
            var7 = StudioGame.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * StudioGame.rasterProvider.width;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.field1246[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.field1235[var10];
               int var14 = StudioGame.rasterProvider.pixels[var8];
               StudioGame.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & '\uff00') + var12 * (var10 & '\uff00') & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lsp;B)V",
      garbageValue = "11"
   )
   final void method2394(IndexedSprite var1) {
      int var2;
      for(var2 = 0; var2 < this.field1243.length; ++var2) {
         this.field1243[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1243[var3] = (int)(Math.random() * 256.0);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.field1244[var5] = (this.field1243[var5 + 128] + this.field1243[var5 - 128] + this.field1243[var5 + 1] + this.field1243[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.field1243;
         this.field1243 = this.field1244;
         this.field1244 = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.subHeight; ++var3) {
            for(var4 = 0; var4 < var1.subWidth; ++var4) {
               if (var1.pixels[var2++] != 0) {
                  var5 = var4 + var1.xOffset + 16;
                  int var6 = var3 + var1.yOffset + 16;
                  int var7 = var5 + (var6 << 7);
                  this.field1243[var7] = 0;
               }
            }
         }
      }

   }
}
