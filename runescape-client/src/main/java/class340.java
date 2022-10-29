import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class340 {
   @ObfuscatedName("a")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("c")
   int[] field4224 = new int[2048];
   @ObfuscatedName("x")
   int[] field4225 = new int[2048];
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -268698711
   )
   int field4226 = 0;

   public class340() {
      Messages.method2645();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-720689240"
   )
   void method6535(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         double var16 = (double)(var8 - 0) / var4;
         double var14 = Math.exp(var16 * -var16 / 2.0) / Math.sqrt(6.283185307179586);
         double var24 = var14 / var4;
         var7[var9] = var24;
         ++var8;
      }

      double[] var18 = var7;
      double var19 = var7[var1] * var7[var1];
      int[] var21 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var21[var12 + var11 * var2] = (int)(var18[var11] * var18[var12] / var19 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      SpritePixels var22 = new SpritePixels(var21, var2, var2);
      this.spriteMap.put(var1, var22);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Lri;",
      garbageValue = "-34097789"
   )
   SpritePixels method6540(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method6535(var1);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-605935669"
   )
   public final void method6537(int var1, int var2) {
      if (this.field4226 < this.field4224.length) {
         this.field4224[this.field4226] = var1;
         this.field4225[this.field4226] = var2;
         ++this.field4226;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public final void method6538() {
      this.field4226 = 0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IILri;FI)V",
      garbageValue = "-570834065"
   )
   public final void method6539(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method6540(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field4226; ++var10) {
         var11 = this.field4224[var10];
         var12 = this.field4225[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method7575(var8, var9);
         this.method6547(var6, var3, var9);
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
               if (var11 > InvDefinition.field1862.length) {
                  var11 = InvDefinition.field1862.length;
               }

               var12 = InvDefinition.field1862[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lri;Lri;Loq;B)V",
      garbageValue = "87"
   )
   void method6547(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
         int var7 = var3.lowX + var2.subWidth * var3.lowY;

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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1261503165"
   )
   @Export("isCharPrintable")
   public static boolean isCharPrintable(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
