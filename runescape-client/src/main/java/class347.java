import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class347 {
   @ObfuscatedName("l")
   static int[] field4307;
   @ObfuscatedName("f")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("v")
   int[] field4302 = new int[2048];
   @ObfuscatedName("s")
   int[] field4304 = new int[2048];
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1580575271
   )
   int field4301 = 0;

   public class347() {
      field4307 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = SecureRandomCallable.method2282((double)((float)var2 / 360.0F), 0.9998999834060669, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
         field4307[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < field4307.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = SecureRandomCallable.method2282((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < field4307.length; ++var1) {
            field4307[var1] = var5;
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "16"
   )
   void method6740(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         double var20 = class6.method46((double)(var8 - 0) / var4) / var4;
         var7[var9] = var20;
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var17 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var17[var12 + var2 * var11] = (int)(256.0 * (var14[var11] * var14[var12] / var15));
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      SpritePixels var18 = new SpritePixels(var17, var2, var2);
      this.spriteMap.put(var1, var18);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrs;",
      garbageValue = "-1"
   )
   SpritePixels method6742(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method6740(var1);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-699862924"
   )
   public final void method6744(int var1, int var2) {
      if (this.field4301 < this.field4302.length) {
         this.field4302[this.field4301] = var1;
         this.field4304[this.field4301] = var2;
         ++this.field4301;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1874686349"
   )
   public final void method6759() {
      this.field4301 = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IILrs;FI)V",
      garbageValue = "582476905"
   )
   public final void method6760(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method6742(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field4301; ++var10) {
         var11 = this.field4302[var10];
         var12 = this.field4304[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method7852(var8, var9);
         this.method6745(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if (var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if (var11 > field4307.length) {
                  var11 = field4307.length;
               }

               var12 = field4307[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrs;Lrs;Loj;B)V",
      garbageValue = "44"
   )
   void method6745(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (var3.highX != 0 && var3.highY != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.lowX == 0) {
            var4 = var1.subWidth - var3.highX;
         }

         if (var3.lowY == 0) {
            var5 = var1.subHeight - var3.highY;
         }

         int var6 = var4 + var5 * var1.subWidth;
         int var7 = var2.subWidth * var3.lowY + var3.lowX;

         for(int var8 = 0; var8 < var3.highY; ++var8) {
            for(int var9 = 0; var9 < var3.highX; ++var9) {
               int[] var10000 = var2.pixels;
               int var10001 = var7++;
               var10000[var10001] += var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.highX;
            var7 += var2.subWidth - var3.highX;
         }

      }
   }
}
