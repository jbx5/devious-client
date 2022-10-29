import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class132 extends class135 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1557466625
   )
   int field1568;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -781866971
   )
   int field1570;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 570600793
   )
   int field1569;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1326345317
   )
   int field1571;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class132(class138 var1) {
      this.this$0 = var1;
      this.field1568 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1568 = var1.readUnsignedShort();
      this.field1570 = var1.readInt();
      this.field1569 = var1.readUnsignedByte();
      this.field1571 = var1.readUnsignedByte();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3088(this.field1568, this.field1570, this.field1569, this.field1571);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ldb;FB)F",
      garbageValue = "-55"
   )
   static float method2966(class124 var0, float var1) {
      if (var0 != null && var0.method2880() != 0) {
         if (var1 < (float)var0.field1493[0].field1441) {
            return var0.field1490 == class123.field1470 ? var0.field1493[0].field1438 : class404.method7600(var0, var1, true);
         } else if (var1 > (float)var0.field1493[var0.method2880() - 1].field1441) {
            return var0.field1489 == class123.field1470 ? var0.field1493[var0.method2880() - 1].field1438 : class404.method7600(var0, var1, false);
         } else if (var0.field1480) {
            return var0.field1493[0].field1438;
         } else {
            class120 var2 = var0.method2879(var1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               if ((double)var2.field1442 == 0.0 && 0.0 == (double)var2.field1443) {
                  var3 = true;
               } else if (Float.MAX_VALUE == var2.field1442 && Float.MAX_VALUE == var2.field1443) {
                  var4 = true;
               } else if (var2.field1444 != null) {
                  if (var0.field1483) {
                     float[] var5 = new float[4];
                     float[] var6 = new float[4];
                     var5[0] = (float)var2.field1441;
                     var6[0] = var2.field1438;
                     var5[1] = var5[0] + 0.33333334F * var2.field1442;
                     var6[1] = 0.33333334F * var2.field1443 + var6[0];
                     var5[3] = (float)var2.field1444.field1441;
                     var6[3] = var2.field1444.field1438;
                     var5[2] = var5[3] - var2.field1444.field1440 * 0.33333334F;
                     var6[2] = var6[3] - var2.field1444.field1439 * 0.33333334F;
                     if (var0.field1481) {
                        if (var0 != null) {
                           float var7 = var5[3] - var5[0];
                           if ((double)var7 != 0.0) {
                              float var8 = var5[1] - var5[0];
                              float var9 = var5[2] - var5[0];
                              Float var10 = var8 / var7;
                              Float var11 = var9 / var7;
                              var0.field1484 = var10 == 0.33333334F && var11 == 0.6666667F;
                              float var12 = var10;
                              float var13 = var11;
                              if ((double)var10 < 0.0) {
                                 var10 = 0.0F;
                              }

                              if ((double)var11 > 1.0) {
                                 var11 = 1.0F;
                              }

                              if ((double)var10 > 1.0 || var11 < -1.0F) {
                                 Float var14 = var10;
                                 Float var15 = 1.0F - var11;
                                 if (var10 < 0.0F) {
                                    var14 = 0.0F;
                                 }

                                 if (var15 < 0.0F) {
                                    var15 = 0.0F;
                                 }

                                 if (var14 > 1.0F || var15 > 1.0F) {
                                    float var16 = (float)((double)(var14 * (var14 - 2.0F + var15)) + (double)var15 * ((double)var15 - 2.0) + 1.0);
                                    if (class121.field1454 + var16 > 0.0F) {
                                       WorldMapEvent.method5310(var14, var15);
                                    }
                                 }

                                 var15 = 1.0F - var15;
                              }

                              if (var10 != var12) {
                                 var5[1] = var5[0] + var10 * var7;
                                 if (0.0 != (double)var12) {
                                    var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12;
                                 }
                              }

                              if (var11 != var13) {
                                 var5[2] = var5[0] + var11 * var7;
                                 if ((double)var13 != 1.0) {
                                    var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0 - (double)var11) / (1.0 - (double)var13));
                                 }
                              }

                              var0.field1485 = var5[0];
                              var0.field1486 = var5[3];
                              float var26 = var10;
                              float var27 = var11;
                              float[] var28 = var0.field1487;
                              float var17 = var26 - 0.0F;
                              float var18 = var27 - var26;
                              float var19 = 1.0F - var27;
                              float var20 = var18 - var17;
                              var28[3] = var19 - var18 - var20;
                              var28[2] = var20 + var20 + var20;
                              var28[1] = var17 + var17 + var17;
                              var28[0] = 0.0F;
                              var17 = var6[0];
                              var18 = var6[1];
                              var19 = var6[2];
                              var20 = var6[3];
                              float[] var21 = var0.field1488;
                              float var22 = var18 - var17;
                              float var23 = var19 - var18;
                              float var24 = var20 - var19;
                              float var25 = var23 - var22;
                              var21[3] = var24 - var23 - var25;
                              var21[2] = var25 + var25 + var25;
                              var21[1] = var22 + var22 + var22;
                              var21[0] = var17;
                           }
                        }
                     } else {
                        class150.method3171(var0, var5, var6);
                     }

                     var0.field1483 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1438;
               } else if (var4) {
                  return (float)var2.field1441 != var1 && var2.field1444 != null ? var2.field1444.field1438 : var2.field1438;
               } else {
                  return var0.field1481 ? Interpreter.method1891(var0, var1) : WorldMapDecoration.method5149(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Date;",
      garbageValue = "-1954783269"
   )
   static Date method2964() {
      java.util.Calendar var0 = java.util.Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-558415644"
   )
   @Export("getTileHeight")
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
         int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
         return var8 * (128 - var7) + var9 * var7 >> 7;
      } else {
         return 0;
      }
   }
}
