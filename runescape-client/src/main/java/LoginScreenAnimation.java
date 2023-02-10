import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("sprites")
   IndexedSprite[] sprites;
   @ObfuscatedName("i")
   int[] field1246 = new int[256];
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1503190187
   )
   int field1242 = 0;
   @ObfuscatedName("l")
   int[] field1257;
   @ObfuscatedName("k")
   int[] field1254;
   @ObfuscatedName("c")
   int[] field1250;
   @ObfuscatedName("r")
   int[] field1251;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1661241181
   )
   int field1252 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 934620171
   )
   int field1253 = 0;
   @ObfuscatedName("t")
   int[] field1241;
   @ObfuscatedName("h")
   int[] field1255;
   @ObfuscatedName("p")
   int[] field1256;
   @ObfuscatedName("o")
   int[] field1245;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -599464181
   )
   int field1258 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1905594928
   )
   int field1259 = 0;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -852708365
   )
   int field1247 = 0;

   @ObfuscatedSignature(
      descriptor = "([Lrg;)V"
   )
   LoginScreenAnimation(IndexedSprite[] var1) {
      this.sprites = var1;
      this.initColors();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-91507505"
   )
   @Export("initColors")
   void initColors() {
      this.field1254 = new int[256];

      int var1;
      for(var1 = 0; var1 < 64; ++var1) {
         this.field1254[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1254[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1254[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1254[var1 + 192] = 16777215;
      }

      this.field1250 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1250[var1] = var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1250[var1 + 64] = var1 * 4 + '\uff00';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1250[var1 + 128] = var1 * 262144 + '\uffff';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1250[var1 + 192] = 16777215;
      }

      this.field1251 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1251[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1251[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1251[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1251[var1 + 192] = 16777215;
      }

      this.field1257 = new int[256];
      this.field1258 = 0;
      this.field1256 = new int['耀'];
      this.field1245 = new int['耀'];
      this.method2455((IndexedSprite)null);
      this.field1241 = new int['耀'];
      this.field1255 = new int['耀'];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-232497301"
   )
   void method2464() {
      this.field1254 = null;
      this.field1250 = null;
      this.field1251 = null;
      this.field1257 = null;
      this.field1256 = null;
      this.field1245 = null;
      this.field1241 = null;
      this.field1255 = null;
      this.field1258 = 0;
      this.field1259 = 0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "531628471"
   )
   @Export("draw")
   void draw(int var1, int var2) {
      if (this.field1241 == null) {
         this.initColors();
      }

      if (this.field1247 == 0) {
         this.field1247 = var2;
      }

      int var3 = var2 - this.field1247;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field1247 = var2;
      if (var3 > 0) {
         this.method2450(var3);
      }

      this.method2452(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "13"
   )
   final void method2450(int var1) {
      this.field1258 += var1 * 128;
      int var2;
      if (this.field1258 > this.field1256.length) {
         this.field1258 -= this.field1256.length;
         var2 = (int)(Math.random() * 12.0);
         this.method2455(this.sprites[var2]);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field1241[var2 + var3] - this.field1256[var2 + this.field1258 & this.field1256.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1241[var2++] = var6;
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
               this.field1241[var8 + var9] = 255;
            } else {
               this.field1241[var8 + var9] = 0;
            }
         }
      }

      if (this.field1252 * 16 > 0) {
         this.field1252 = this.field1252 * 16 - var1 * 4;
      }

      if (this.field1253 * 16 > 0) {
         this.field1253 = this.field1253 * 16 - var1 * 4;
      }

      if (this.field1252 * 16 == 0 && this.field1253 * 16 == 0) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.field1252 = 1024;
         }

         if (var7 == 1) {
            this.field1253 = 1024;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.field1246[var7] = this.field1246[var7 + var1];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.field1246[var7] = (int)(Math.sin((double)this.field1242 / 14.0) * 16.0 + Math.sin((double)this.field1242 / 15.0) * 14.0 + Math.sin((double)this.field1242 / 16.0) * 12.0);
         ++this.field1242;
      }

      this.field1259 = this.field1259 * 10000 + var1 * 10000;
      var7 = ((Client.cycle & 1) + var1) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < this.field1259 * 100; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.field1241[var12 + (var13 << 7)] = 192;
         }

         this.field1259 = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = var11 * 128;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var7 + var14 < 128) {
                  var12 += this.field1241[var13 + var14 + var7];
               }

               if (var14 - (var7 + 1) >= 0) {
                  var12 -= this.field1241[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.field1255[var14 + var13] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var7 + var13 < 256) {
                  var12 += this.field1255[var14 + var11 + var7 * 128];
               }

               if (var13 - (var7 + 1) >= 0) {
                  var12 -= this.field1255[var14 + var11 - (var7 + 1) * 128];
               }

               if (var13 >= 0) {
                  this.field1241[var11 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1478312132"
   )
   final int method2451(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + var4 * (var1 & '\uff00') & 16711680) >> 8;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "893483018"
   )
   final void method2452(int var1) {
      int var2 = this.field1257.length;
      if (this.field1252 * 16 > 0) {
         this.method2460(this.field1252 * 16, this.field1250);
      } else if (this.field1253 * 16 > 0) {
         this.method2460(this.field1253 * 16, this.field1251);
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.field1257[var3] = this.field1254[var3];
         }
      }

      this.method2476(var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I[II)V",
      garbageValue = "711796277"
   )
   final void method2460(int var1, int[] var2) {
      int var3 = this.field1257.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.field1257[var4] = this.method2451(this.field1254[var4], var2[var4], 1024 - var1);
         } else if (var1 > 256) {
            this.field1257[var4] = var2[var4];
         } else {
            this.field1257[var4] = this.method2451(var2[var4], this.field1254[var4], 256 - var1);
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   final void method2476(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.field1246[var3] / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= KeyHandler.rasterProvider.width) {
            var7 = KeyHandler.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * KeyHandler.rasterProvider.width;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.field1241[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.field1257[var10];
               int var14 = KeyHandler.rasterProvider.pixels[var8];
               KeyHandler.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & '\uff00') + var12 * (var10 & '\uff00') & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)V",
      garbageValue = "-445402155"
   )
   final void method2455(IndexedSprite var1) {
      int var2;
      for(var2 = 0; var2 < this.field1256.length; ++var2) {
         this.field1256[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1256[var3] = (int)(Math.random() * 256.0);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.field1245[var5] = (this.field1256[var5 + 128] + this.field1256[var5 - 128] + this.field1256[var5 + 1] + this.field1256[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.field1256;
         this.field1256 = this.field1245;
         this.field1245 = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.subHeight; ++var3) {
            for(var4 = 0; var4 < var1.subWidth; ++var4) {
               if (var1.pixels[var2++] != 0) {
                  var5 = var4 + var1.xOffset + 16;
                  int var6 = var3 + var1.yOffset + 16;
                  int var7 = var5 + (var6 << 7);
                  this.field1256[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)V",
      garbageValue = "-1091260727"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field724) {
         Client.field725[var0.rootIndex] = true;
      }

   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "5494"
   )
   static final void method2463(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = 0.5F + (float)var0 / 200.0F;
      Rasterizer3D.Rasterizer3D_setBrightness((double)var1);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness((double)var1);
      ItemComposition.ItemDefinition_cachedSprites.clear();
      PacketWriter.clientPreferences.method2583((double)var1);
   }
}
