import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 484772747
   )
   @Export("width")
   public final int width;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1166314117
   )
   @Export("height")
   public final int height;
   @ObfuscatedName("v")
   @Export("xWidths")
   public final int[] xWidths;
   @ObfuscatedName("s")
   @Export("xStarts")
   public final int[] xStarts;

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.width = var1;
      this.height = var2;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1980468407"
   )
   @Export("contains")
   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.xStarts.length) {
         int var3 = this.xStarts[var2];
         if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FI)I",
      garbageValue = "-1808391079"
   )
   public static int method5838(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class121.field1479;
      if (var7 <= var44) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var44) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44;
            boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
            var10 = var42 && var43 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            class419 var11 = new class419(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var41 = new float[var1 + 1];
            int var14 = method5838(var12, var1 - 1, var2, false, var4, false, var41);
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
                     var18 = AbstractUserComparator.method7640(var9, var1, var2);
                     if (Math.abs(var18) <= var44 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var14 == var20) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var41[var20];
                  }

                  var17 = AbstractUserComparator.method7640(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var44) {
                     if (var14 != var20 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var10++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = AbstractUserComparator.method7640(var11.field4664, var11.field4660, var16);
                     float var23;
                     if (Math.abs(var26) < class121.field1479) {
                        var23 = var16;
                     } else {
                        float var27 = AbstractUserComparator.method7640(var11.field4664, var11.field4660, var19);
                        if (Math.abs(var27) < class121.field1479) {
                           var23 = var19;
                        } else {
                           float var28 = 0.0F;
                           float var29 = 0.0F;
                           float var30 = 0.0F;
                           float var35 = 0.0F;
                           boolean var36 = true;
                           boolean var37 = false;

                           do {
                              var37 = false;
                              if (var36) {
                                 var28 = var24;
                                 var35 = var26;
                                 var29 = var25 - var24;
                                 var30 = var29;
                                 var36 = false;
                              }

                              if (Math.abs(var35) < Math.abs(var27)) {
                                 var24 = var25;
                                 var25 = var28;
                                 var28 = var24;
                                 var26 = var27;
                                 var27 = var35;
                                 var35 = var26;
                              }

                              float var38 = class121.field1480 * Math.abs(var25) + 0.0F;
                              float var39 = (var28 - var25) * 0.5F;
                              boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var28 == var24) {
                                       var31 = var39 * 2.0F * var34;
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = ((var32 - var33) * var39 * 2.0F * var32 - (var25 - var24) * (var33 - 1.0F)) * var34;
                                       var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F);
                                    }

                                    if ((double)var31 > 0.0) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (2.0F * var31 < var32 * 3.0F * var39 - Math.abs(var38 * var32) && var31 < Math.abs(var32 * 0.5F * var34)) {
                                       var29 = var31 / var32;
                                    } else {
                                       var29 = var39;
                                       var30 = var39;
                                    }
                                 } else {
                                    var29 = var39;
                                    var30 = var39;
                                 }

                                 var24 = var25;
                                 var26 = var27;
                                 if (Math.abs(var29) > var38) {
                                    var25 += var29;
                                 } else if ((double)var39 > 0.0) {
                                    var25 += var38;
                                 } else {
                                    var25 -= var38;
                                 }

                                 var27 = AbstractUserComparator.method7640(var11.field4664, var11.field4660, var25);
                                 if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0) {
                                    var36 = true;
                                    var37 = true;
                                 } else {
                                    var37 = true;
                                 }
                              }
                           } while(var37);

                           var23 = var25;
                        }
                     }

                     var6[var22] = var23;
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
                        var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1637754354"
   )
   @Export("playSong")
   static void playSong(int var0) {
      if (var0 == -1 && !Client.playingJingle) {
         class177.method3538();
      } else if (var0 != -1 && var0 != Client.currentTrackGroupId && PacketWriter.clientPreferences.method2495() != 0 && !Client.playingJingle) {
         class284.method5566(2, class153.archive6, var0, 0, PacketWriter.clientPreferences.method2495(), false);
      }

      Client.currentTrackGroupId = var0;
   }
}
