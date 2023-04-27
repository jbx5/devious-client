import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class103 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1357 = new class103(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1349 = new class103(1);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1359 = new class103(2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1351 = new class103(3);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1350 = new class103(4);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1353 = new class103(5);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1354 = new class103(6);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1352 = new class103(7);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1355 = new class103(8);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1364 = new class103(9);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1358 = new class103(10);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1356 = new class103(11);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1360 = new class103(12);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1361 = new class103(13);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1362 = new class103(14);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   static final class103 field1363 = new class103(15);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1140778173
   )
   int field1348;

   class103(int var1) {
      this.field1348 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FB)I",
      garbageValue = "-57"
   )
   public static int method2716(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class121.field1462;
      if (var7 <= var24) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var24) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var24 + var6[0] : var2 < var6[0] - var24;
            boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0];
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            class427 var11 = new class427(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var21 = new float[var1 + 1];
            int var14 = method2716(var12, var1 - 1, var2, false, var4, false, var21);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = class424.method8171(var9, var1, var2);
                     if (Math.abs(var18) <= var24 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var21[var20];
                  }

                  var17 = class424.method8171(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var24) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = Frames.method4711(var11, var16, var19, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lsh;",
      garbageValue = "1454430970"
   )
   public static class478 method2717(int var0) {
      int var1 = class476.field4942[var0];
      if (var1 == 1) {
         return class478.field4948;
      } else if (var1 == 2) {
         return class478.field4946;
      } else {
         return var1 == 3 ? class478.field4947 : null;
      }
   }

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "0"
   )
   @Export("drawScrollBar")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
      HealthBar.scrollBarSprites[0].drawAt(var0, var1);
      HealthBar.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field575);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field568);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field568);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field568);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field568);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field567);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field567);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field567);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field567);
   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "809507201"
   )
   static final int method2714() {
      float var0 = 200.0F * ((float)class20.clientPreferences.method2459() - 0.5F);
      return 100 - Math.round(var0);
   }
}
