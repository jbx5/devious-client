import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ch")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("sprites")
   IndexedSprite[] sprites;
   @ObfuscatedName("y")
   int[] field1224 = new int[256];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1039743457
   )
   int field1228 = 0;
   @ObfuscatedName("n")
   int[] field1232;
   @ObfuscatedName("r")
   int[] field1227;
   @ObfuscatedName("l")
   int[] field1237;
   @ObfuscatedName("s")
   int[] field1221;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1827124167
   )
   int field1226 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 788944111
   )
   int field1231 = 0;
   @ObfuscatedName("o")
   int[] field1225;
   @ObfuscatedName("u")
   int[] field1233;
   @ObfuscatedName("z")
   int[] field1234;
   @ObfuscatedName("t")
   int[] field1235;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1883625357
   )
   int field1229 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1849168848
   )
   int field1238 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 773450197
   )
   int field1236 = 0;

   @ObfuscatedSignature(
      descriptor = "([Lry;)V"
   )
   LoginScreenAnimation(IndexedSprite[] var1) {
      this.sprites = var1;
      this.initColors();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-15"
   )
   @Export("initColors")
   void initColors() {
      this.field1227 = new int[256];

      int var1;
      for(var1 = 0; var1 < 64; ++var1) {
         this.field1227[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1227[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1227[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1227[var1 + 192] = 16777215;
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

      this.field1221 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 192] = 16777215;
      }

      this.field1232 = new int[256];
      this.field1229 = 0;
      this.field1234 = new int['耀'];
      this.field1235 = new int['耀'];
      this.method2362((IndexedSprite)null);
      this.field1225 = new int['耀'];
      this.field1233 = new int['耀'];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "10000"
   )
   void method2344() {
      this.field1227 = null;
      this.field1237 = null;
      this.field1221 = null;
      this.field1232 = null;
      this.field1234 = null;
      this.field1235 = null;
      this.field1225 = null;
      this.field1233 = null;
      this.field1229 = 0;
      this.field1238 = 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-98"
   )
   @Export("draw")
   void draw(int var1, int var2) {
      if (this.field1225 == null) {
         this.initColors();
      }

      if (this.field1236 == 0) {
         this.field1236 = var2;
      }

      int var3 = var2 - this.field1236;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field1236 = var2;
      if (var3 > 0) {
         this.method2346(var3);
      }

      this.method2374(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1529135396"
   )
   final void method2346(int var1) {
      this.field1229 += var1 * 128;
      int var2;
      if (this.field1229 > this.field1234.length) {
         this.field1229 -= this.field1234.length;
         var2 = (int)(Math.random() * 12.0);
         this.method2362(this.sprites[var2]);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field1225[var3 + var2] - this.field1234[var2 + this.field1229 & this.field1234.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1225[var2++] = var6;
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
               this.field1225[var8 + var9] = 255;
            } else {
               this.field1225[var8 + var9] = 0;
            }
         }
      }

      if (this.field1226 * 16 > 0) {
         this.field1226 = this.field1226 * 16 - var1 * 4;
      }

      if (this.field1231 * 16 > 0) {
         this.field1231 = this.field1231 * 16 - var1 * 4;
      }

      if (this.field1226 * 16 == 0 && this.field1231 * 16 == 0) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.field1226 = 1024;
         }

         if (var7 == 1) {
            this.field1231 = 1024;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.field1224[var7] = this.field1224[var7 + var1];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.field1224[var7] = (int)(Math.sin((double)this.field1228 / 14.0) * 16.0 + Math.sin((double)this.field1228 / 15.0) * 14.0 + Math.sin((double)this.field1228 / 16.0) * 12.0);
         ++this.field1228;
      }

      this.field1238 = this.field1238 * 10000 + 10000 * var1;
      var7 = ((Client.cycle & 1) + var1) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < this.field1238 * 100; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.field1225[var12 + (var13 << 7)] = 192;
         }

         this.field1238 = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = var11 * 128;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var7 + var14 < 128) {
                  var12 += this.field1225[var7 + var14 + var13];
               }

               if (var14 - (var7 + 1) >= 0) {
                  var12 -= this.field1225[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.field1233[var14 + var13] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var7 + var13 < 256) {
                  var12 += this.field1233[var11 + var14 + var7 * 128];
               }

               if (var13 - (var7 + 1) >= 0) {
                  var12 -= this.field1233[var11 + var14 - (var7 + 1) * 128];
               }

               if (var13 >= 0) {
                  this.field1225[var14 + var11] = var12 / (var7 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "282424643"
   )
   final int method2347(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var4 * (var1 & '\uff00') & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-626555307"
   )
   final void method2374(int var1) {
      int var2 = this.field1232.length;
      if (this.field1226 * 16 > 0) {
         this.method2348(this.field1226 * 16, this.field1237);
      } else if (this.field1231 * 16 > 0) {
         this.method2348(this.field1231 * 16, this.field1221);
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.field1232[var3] = this.field1227[var3];
         }
      }

      this.method2349(var1);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I[II)V",
      garbageValue = "383633095"
   )
   final void method2348(int var1, int[] var2) {
      int var3 = this.field1232.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.field1232[var4] = this.method2347(this.field1227[var4], var2[var4], 1024 - var1);
         } else if (var1 > 256) {
            this.field1232[var4] = var2[var4];
         } else {
            this.field1232[var4] = this.method2347(var2[var4], this.field1227[var4], 256 - var1);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "307234910"
   )
   final void method2349(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.field1224[var3] / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= class1.rasterProvider.width) {
            var7 = class1.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * class1.rasterProvider.width;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.field1225[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.field1232[var10];
               int var14 = class1.rasterProvider.pixels[var8];
               class1.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & '\uff00') + var12 * (var10 & '\uff00') & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lry;B)V",
      garbageValue = "83"
   )
   final void method2362(IndexedSprite var1) {
      int var2;
      for(var2 = 0; var2 < this.field1234.length; ++var2) {
         this.field1234[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1234[var3] = (int)(Math.random() * 256.0);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.field1235[var5] = (this.field1234[var5 + 1] + this.field1234[var5 + 128] + this.field1234[var5 - 128] + this.field1234[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.field1234;
         this.field1234 = this.field1235;
         this.field1235 = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.subHeight; ++var3) {
            for(var4 = 0; var4 < var1.subWidth; ++var4) {
               if (var1.pixels[var2++] != 0) {
                  var5 = var4 + var1.xOffset + 16;
                  int var6 = var3 + var1.yOffset + 16;
                  int var7 = var5 + (var6 << 7);
                  this.field1234[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "-846855505"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhj;",
      garbageValue = "125"
   )
   @Export("getFrames")
   static Frames getFrames(int var0) {
      Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         AbstractArchive var3 = class34.SequenceDefinition_animationsArchive;
         AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
         boolean var5 = true;
         int[] var6 = var3.getGroupFileIds(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.getFile(var0, var6[var7]);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.getFile(var9, 0);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         Frames var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new Frames(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if (var2 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1316905508"
   )
   static final void method2350(String var0) {
      class11.method101("Please remove " + var0 + " from your friend list first");
   }
}
