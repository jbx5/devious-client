import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class130 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1534 = new class130(0, 0, (String)null, 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1529 = new class130(1, 1, (String)null, 9);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1530 = new class130(2, 2, (String)null, 3);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1531 = new class130(3, 3, (String)null, 6);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1532 = new class130(4, 4, (String)null, 1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   static final class130 field1533 = new class130(5, 5, (String)null, 3);
   @ObfuscatedName("jg")
   @Export("regionLandArchiveIds")
   static int[] regionLandArchiveIds;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -681546351
   )
   final int field1538;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -419437913
   )
   final int field1535;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1959675603
   )
   final int field1536;

   class130(int var1, int var2, String var3, int var4) {
      this.field1538 = var1;
      this.field1535 = var2;
      this.field1536 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1535;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1244171306"
   )
   int method3003() {
      return this.field1536;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Leq;FB)F",
      garbageValue = "-5"
   )
   static float method3002(class129 var0, float var1) {
      if (var0 != null && var0.method2981() != 0) {
         if (var1 < (float)var0.field1510[0].field1457) {
            return var0.field1506 == class127.field1494 ? var0.field1510[0].field1455 : class72.method2050(var0, var1, true);
         } else if (var1 > (float)var0.field1510[var0.method2981() - 1].field1457) {
            return var0.field1507 == class127.field1494 ? var0.field1510[var0.method2981() - 1].field1455 : class72.method2050(var0, var1, false);
         } else if (var0.field1505) {
            return var0.field1510[0].field1455;
         } else {
            class124 var2 = var0.method2980(var1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               float var5;
               float var6;
               float var7;
               if (0.0 == (double)var2.field1458 && (double)var2.field1459 == 0.0) {
                  var3 = true;
               } else if (Float.MAX_VALUE == var2.field1458 && var2.field1459 == Float.MAX_VALUE) {
                  var4 = true;
               } else if (var2.field1460 != null) {
                  if (var0.field1520) {
                     var5 = (float)var2.field1457;
                     float var9 = var2.field1455;
                     var6 = var2.field1458 * 0.33333334F + var5;
                     float var10 = var9 + var2.field1459 * 0.33333334F;
                     float var8 = (float)var2.field1460.field1457;
                     float var12 = var2.field1460.field1455;
                     var7 = var8 - var2.field1460.field1456 * 0.33333334F;
                     float var11 = var12 - 0.33333334F * var2.field1460.field1461;
                     if (var0.field1516) {
                        float var15 = var10;
                        float var16 = var11;
                        if (var0 != null) {
                           float var17 = var8 - var5;
                           if (0.0 != (double)var17) {
                              float var18 = var6 - var5;
                              float var19 = var7 - var5;
                              float[] var20 = new float[]{var18 / var17, var19 / var17};
                              var0.field1508 = 0.33333334F == var20[0] && 0.6666667F == var20[1];
                              float var21 = var20[0];
                              float var22 = var20[1];
                              if ((double)var20[0] < 0.0) {
                                 var20[0] = 0.0F;
                              }

                              if ((double)var20[1] > 1.0) {
                                 var20[1] = 1.0F;
                              }

                              if ((double)var20[0] > 1.0 || var20[1] < -1.0F) {
                                 SoundSystem.method815(var20);
                              }

                              if (var20[0] != var21) {
                                 float var10000 = var5 + var17 * var20[0];
                                 if ((double)var21 != 0.0) {
                                    var15 = var9 + (var10 - var9) * var20[0] / var21;
                                 }
                              }

                              if (var22 != var20[1]) {
                                 float var14 = var17 * var20[1] + var5;
                                 if ((double)var22 != 1.0) {
                                    var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0 - (double)var20[1]) / (1.0 - (double)var22));
                                 }
                              }

                              var0.field1519 = var5;
                              var0.field1511 = var8;
                              float var23 = var20[0];
                              float var24 = var20[1];
                              float var25 = var23 - 0.0F;
                              float var26 = var24 - var23;
                              float var27 = 1.0F - var24;
                              float var28 = var26 - var25;
                              var0.field1515 = var27 - var26 - var28;
                              var0.field1514 = var28 + var28 + var28;
                              var0.field1504 = var25 + var25 + var25;
                              var0.field1522 = 0.0F;
                              var25 = var15 - var9;
                              var26 = var16 - var15;
                              var27 = var12 - var16;
                              var28 = var26 - var25;
                              var0.field1527 = var27 - var26 - var28;
                              var0.field1518 = var28 + var28 + var28;
                              var0.field1512 = var25 + var25 + var25;
                              var0.field1509 = var9;
                           }
                        }
                     } else {
                        class370.method6901(var0, var5, var6, var7, var8, var9, var10, var11, var12);
                     }

                     var0.field1520 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1455;
               } else if (var4) {
                  return var1 != (float)var2.field1457 && var2.field1460 != null ? var2.field1460.field1455 : var2.field1455;
               } else if (var0.field1516) {
                  if (var0 == null) {
                     var5 = 0.0F;
                  } else {
                     if (var1 == var0.field1519) {
                        var6 = 0.0F;
                     } else if (var0.field1511 == var1) {
                        var6 = 1.0F;
                     } else {
                        var6 = (var1 - var0.field1519) / (var0.field1511 - var0.field1519);
                     }

                     if (var0.field1508) {
                        var7 = var6;
                     } else {
                        class125.field1465[3] = var0.field1515;
                        class125.field1465[2] = var0.field1514;
                        class125.field1465[1] = var0.field1504;
                        class125.field1465[0] = var0.field1522 - var6;
                        class125.field1462[0] = 0.0F;
                        class125.field1462[1] = 0.0F;
                        class125.field1462[2] = 0.0F;
                        class125.field1462[3] = 0.0F;
                        class125.field1462[4] = 0.0F;
                        int var29 = class72.method2044(class125.field1465, 3, 0.0F, true, 1.0F, true, class125.field1462);
                        if (var29 == 1) {
                           var7 = class125.field1462[0];
                        } else {
                           var7 = 0.0F;
                        }
                     }

                     var5 = var0.field1509 + var7 * (var0.field1512 + var7 * (var7 * var0.field1527 + var0.field1518));
                  }

                  return var5;
               } else {
                  if (var0 == null) {
                     var5 = 0.0F;
                  } else {
                     var6 = var1 - var0.field1519;
                     var5 = var6 * ((var0.field1504 + var6 * var0.field1522) * var6 + var0.field1514) + var0.field1515;
                  }

                  return var5;
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "109"
   )
   static int method3007(int var0, Script var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class327.method6088() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
