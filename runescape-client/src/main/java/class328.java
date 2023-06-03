import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class328 {
   @ObfuscatedName("at")
   public static final short[] field3585 = new short[]{6798, 8741, 25238, 4626, 4550};
   @ObfuscatedName("an")
   public static final short[][] field3580 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
   @ObfuscatedName("av")
   public static final short[] field3582 = new short[]{-10304, 9104, -1, -1, -1};
   @ObfuscatedName("as")
   public static final short[][] field3583 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIILig;Lic;Z[I[ILis;I)I",
      garbageValue = "-1826048180"
   )
   public static int method6347(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class215 var8) {
      var8.method4253();
      int var9 = var8.method4230();
      int var10 = var8.method4227();
      int[][] var11 = var8.method4229();
      int[][] var12 = var8.method4245();
      int[] var13 = var8.method4225();
      int[] var14 = var8.method4221();
      boolean var15;
      boolean var16;
      int var17;
      int var18;
      int[][] var19;
      int[][] var20;
      int[] var21;
      int[] var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      int var29;
      int var30;
      int var31;
      int[][] var32;
      int var33;
      int var34;
      int var35;
      if (var2 == 1) {
         var17 = var8.method4230();
         var18 = var8.method4227();
         var19 = var8.method4229();
         var20 = var8.method4245();
         var21 = var8.method4225();
         var22 = var8.method4221();
         var23 = var8.method4232();
         var24 = var0;
         var25 = var1;
         var26 = var17 >> 1;
         var27 = var18 >> 1;
         var28 = var0 - var26;
         var29 = var1 - var27;
         var20[var26][var27] = 99;
         var19[var26][var27] = 0;
         var30 = 0;
         var31 = 0;
         var21[var30] = var0;
         var22[var30++] = var1;
         var32 = var4.flags;

         while(true) {
            if (var31 == var30) {
               var8.method4223(var24, var25);
               var16 = false;
               break;
            }

            var24 = var21[var31];
            var25 = var22[var31];
            var31 = var31 + 1 & var23;
            var26 = var24 - var28;
            var27 = var25 - var29;
            var33 = var24 - var4.xInset;
            var34 = var25 - var4.yInset;
            if (var3.hasArrived(1, var24, var25, var4)) {
               var8.method4223(var24, var25);
               var16 = true;
               break;
            }

            var35 = var19[var26][var27] + 1;
            if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136776) == 0) {
               var21[var30] = var24 - 1;
               var22[var30] = var25;
               var30 = var30 + 1 & var23;
               var20[var26 - 1][var27] = 2;
               var19[var26 - 1][var27] = var35;
            }

            if (var26 < var17 - 1 && var20[var26 + 1][var27] == 0 && (var32[var33 + 1][var34] & 19136896) == 0) {
               var21[var30] = var24 + 1;
               var22[var30] = var25;
               var30 = var30 + 1 & var23;
               var20[var26 + 1][var27] = 8;
               var19[var26 + 1][var27] = var35;
            }

            if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
               var21[var30] = var24;
               var22[var30] = var25 - 1;
               var30 = var30 + 1 & var23;
               var20[var26][var27 - 1] = 1;
               var19[var26][var27 - 1] = var35;
            }

            if (var27 < var18 - 1 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
               var21[var30] = var24;
               var22[var30] = var25 + 1;
               var30 = var30 + 1 & var23;
               var20[var26][var27 + 1] = 4;
               var19[var26][var27 + 1] = var35;
            }

            if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
               var21[var30] = var24 - 1;
               var22[var30] = var25 - 1;
               var30 = var30 + 1 & var23;
               var20[var26 - 1][var27 - 1] = 3;
               var19[var26 - 1][var27 - 1] = var35;
            }

            if (var26 < var17 - 1 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
               var21[var30] = var24 + 1;
               var22[var30] = var25 - 1;
               var30 = var30 + 1 & var23;
               var20[var26 + 1][var27 - 1] = 9;
               var19[var26 + 1][var27 - 1] = var35;
            }

            if (var26 > 0 && var27 < var18 - 1 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
               var21[var30] = var24 - 1;
               var22[var30] = var25 + 1;
               var30 = var30 + 1 & var23;
               var20[var26 - 1][var27 + 1] = 6;
               var19[var26 - 1][var27 + 1] = var35;
            }

            if (var26 < var17 - 1 && var27 < var18 - 1 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 1] & 19136992) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
               var21[var30] = var24 + 1;
               var22[var30] = var25 + 1;
               var30 = var30 + 1 & var23;
               var20[var26 + 1][var27 + 1] = 12;
               var19[var26 + 1][var27 + 1] = var35;
            }
         }

         var15 = var16;
      } else {
         byte var43;
         if (var2 == 2) {
            var17 = var8.method4230();
            var18 = var8.method4227();
            var19 = var8.method4229();
            var20 = var8.method4245();
            var21 = var8.method4225();
            var22 = var8.method4221();
            var23 = var8.method4232();
            var24 = var0;
            var25 = var1;
            var26 = var17 >> 1;
            var27 = var18 >> 1;
            var28 = var0 - var26;
            var29 = var1 - var27;
            var20[var26][var27] = 99;
            var19[var26][var27] = 0;
            var43 = 0;
            var31 = 0;
            var21[var43] = var0;
            var30 = var43 + 1;
            var22[var43] = var1;
            var32 = var4.flags;

            while(true) {
               if (var30 == var31) {
                  var8.method4223(var24, var25);
                  var16 = false;
                  break;
               }

               var24 = var21[var31];
               var25 = var22[var31];
               var31 = var31 + 1 & var23;
               var26 = var24 - var28;
               var27 = var25 - var29;
               var33 = var24 - var4.xInset;
               var34 = var25 - var4.yInset;
               if (var3.hasArrived(2, var24, var25, var4)) {
                  var8.method4223(var24, var25);
                  var16 = true;
                  break;
               }

               var35 = var19[var26][var27] + 1;
               if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0) {
                  var21[var30] = var24 - 1;
                  var22[var30] = var25;
                  var30 = var30 + 1 & var23;
                  var20[var26 - 1][var27] = 2;
                  var19[var26 - 1][var27] = var35;
               }

               if (var26 < var17 - 2 && var20[var26 + 1][var27] == 0 && (var32[var33 + 2][var34] & 19136899) == 0 && (var32[var33 + 2][var34 + 1] & 19136992) == 0) {
                  var21[var30] = var24 + 1;
                  var22[var30] = var25;
                  var30 = var30 + 1 & var23;
                  var20[var26 + 1][var27] = 8;
                  var19[var26 + 1][var27] = var35;
               }

               if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0) {
                  var21[var30] = var24;
                  var22[var30] = var25 - 1;
                  var30 = var30 + 1 & var23;
                  var20[var26][var27 - 1] = 1;
                  var19[var26][var27 - 1] = var35;
               }

               if (var27 < var18 - 2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 2] & 19136824) == 0 && (var32[var33 + 1][var34 + 2] & 19136992) == 0) {
                  var21[var30] = var24;
                  var22[var30] = var25 + 1;
                  var30 = var30 + 1 & var23;
                  var20[var26][var27 + 1] = 4;
                  var19[var26][var27 + 1] = var35;
               }

               if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34] & 19136830) == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33][var34 - 1] & 19136911) == 0) {
                  var21[var30] = var24 - 1;
                  var22[var30] = var25 - 1;
                  var30 = var30 + 1 & var23;
                  var20[var26 - 1][var27 - 1] = 3;
                  var19[var26 - 1][var27 - 1] = var35;
               }

               if (var26 < var17 - 2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136911) == 0 && (var32[var33 + 2][var34 - 1] & 19136899) == 0 && (var32[var33 + 2][var34] & 19136995) == 0) {
                  var21[var30] = var24 + 1;
                  var22[var30] = var25 - 1;
                  var30 = var30 + 1 & var23;
                  var20[var26 + 1][var27 - 1] = 9;
                  var19[var26 + 1][var27 - 1] = var35;
               }

               if (var26 > 0 && var27 < var18 - 2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136830) == 0 && (var32[var33 - 1][var34 + 2] & 19136824) == 0 && (var32[var33][var34 + 2] & 19137016) == 0) {
                  var21[var30] = var24 - 1;
                  var22[var30] = var25 + 1;
                  var30 = var30 + 1 & var23;
                  var20[var26 - 1][var27 + 1] = 6;
                  var19[var26 - 1][var27 + 1] = var35;
               }

               if (var26 < var17 - 2 && var27 < var18 - 2 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 2] & 19137016) == 0 && (var32[var33 + 2][var34 + 2] & 19136992) == 0 && (var32[var33 + 2][var34 + 1] & 19136995) == 0) {
                  var21[var30] = var24 + 1;
                  var22[var30] = var25 + 1;
                  var30 = var30 + 1 & var23;
                  var20[var26 + 1][var27 + 1] = 12;
                  var19[var26 + 1][var27 + 1] = var35;
               }
            }

            var15 = var16;
         } else {
            var17 = var8.method4230();
            var18 = var8.method4227();
            var19 = var8.method4229();
            var20 = var8.method4245();
            var21 = var8.method4225();
            var22 = var8.method4221();
            var23 = var8.method4232();
            var24 = var0;
            var25 = var1;
            var26 = var17 >> 1;
            var27 = var18 >> 1;
            var28 = var0 - var26;
            var29 = var1 - var27;
            var20[var26][var27] = 99;
            var19[var26][var27] = 0;
            var43 = 0;
            var31 = 0;
            var21[var43] = var0;
            var30 = var43 + 1;
            var22[var43] = var1;
            var32 = var4.flags;

            label754:
            while(true) {
               label752:
               while(true) {
                  int var36;
                  do {
                     do {
                        do {
                           label729:
                           do {
                              if (var31 == var30) {
                                 var8.method4223(var24, var25);
                                 var16 = false;
                                 break label754;
                              }

                              var24 = var21[var31];
                              var25 = var22[var31];
                              var31 = var31 + 1 & var23;
                              var26 = var24 - var28;
                              var27 = var25 - var29;
                              var33 = var24 - var4.xInset;
                              var34 = var25 - var4.yInset;
                              if (var3.hasArrived(var2, var24, var25, var4)) {
                                 var8.method4223(var24, var25);
                                 var16 = true;
                                 break label754;
                              }

                              var35 = var19[var26][var27] + 1;
                              if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + var2 - 1] & 19136824) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2 - 1) {
                                       var21[var30] = var24 - 1;
                                       var22[var30] = var25;
                                       var30 = var30 + 1 & var23;
                                       var20[var26 - 1][var27] = 2;
                                       var19[var26 - 1][var27] = var35;
                                       break;
                                    }

                                    if ((var32[var33 - 1][var34 + var36] & 19136830) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var26 < var17 - var2 && var20[var26 + 1][var27] == 0 && (var32[var33 + var2][var34] & 19136899) == 0 && (var32[var33 + var2][var34 + var2 - 1] & 19136992) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2 - 1) {
                                       var21[var30] = var24 + 1;
                                       var22[var30] = var25;
                                       var30 = var30 + 1 & var23;
                                       var20[var26 + 1][var27] = 8;
                                       var19[var26 + 1][var27] = var35;
                                       break;
                                    }

                                    if ((var32[var33 + var2][var34 + var36] & 19136995) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + var2 - 1][var34 - 1] & 19136899) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2 - 1) {
                                       var21[var30] = var24;
                                       var22[var30] = var25 - 1;
                                       var30 = var30 + 1 & var23;
                                       var20[var26][var27 - 1] = 1;
                                       var19[var26][var27 - 1] = var35;
                                       break;
                                    }

                                    if ((var32[var36 + var33][var34 - 1] & 19136911) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var27 < var18 - var2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + var2] & 19136824) == 0 && (var32[var33 + var2 - 1][var34 + var2] & 19136992) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2 - 1) {
                                       var21[var30] = var24;
                                       var22[var30] = var25 + 1;
                                       var30 = var30 + 1 & var23;
                                       var20[var26][var27 + 1] = 4;
                                       var19[var26][var27 + 1] = var35;
                                       break;
                                    }

                                    if ((var32[var36 + var33][var34 + var2] & 19137016) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2) {
                                       var21[var30] = var24 - 1;
                                       var22[var30] = var25 - 1;
                                       var30 = var30 + 1 & var23;
                                       var20[var26 - 1][var27 - 1] = 3;
                                       var19[var26 - 1][var27 - 1] = var35;
                                       break;
                                    }

                                    if ((var32[var33 - 1][var36 + (var34 - 1)] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 - 1] & 19136911) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var26 < var17 - var2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + var2][var34 - 1] & 19136899) == 0) {
                                 var36 = 1;

                                 while(true) {
                                    if (var36 >= var2) {
                                       var21[var30] = var24 + 1;
                                       var22[var30] = var25 - 1;
                                       var30 = var30 + 1 & var23;
                                       var20[var26 + 1][var27 - 1] = 9;
                                       var19[var26 + 1][var27 - 1] = var35;
                                       break;
                                    }

                                    if ((var32[var33 + var2][var36 + (var34 - 1)] & 19136995) != 0 || (var32[var36 + var33][var34 - 1] & 19136911) != 0) {
                                       break;
                                    }

                                    ++var36;
                                 }
                              }

                              if (var26 > 0 && var27 < var18 - var2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + var2] & 19136824) == 0) {
                                 for(var36 = 1; var36 < var2; ++var36) {
                                    if ((var32[var33 - 1][var36 + var34] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 + var2] & 19137016) != 0) {
                                       continue label729;
                                    }
                                 }

                                 var21[var30] = var24 - 1;
                                 var22[var30] = var25 + 1;
                                 var30 = var30 + 1 & var23;
                                 var20[var26 - 1][var27 + 1] = 6;
                                 var19[var26 - 1][var27 + 1] = var35;
                              }
                           } while(var26 >= var17 - var2);
                        } while(var27 >= var18 - var2);
                     } while(var20[var26 + 1][var27 + 1] != 0);
                  } while((var32[var33 + var2][var34 + var2] & 19136992) != 0);

                  for(var36 = 1; var36 < var2; ++var36) {
                     if ((var32[var33 + var36][var34 + var2] & 19137016) != 0 || (var32[var33 + var2][var34 + var36] & 19136995) != 0) {
                        continue label752;
                     }
                  }

                  var21[var30] = var24 + 1;
                  var22[var30] = var25 + 1;
                  var30 = var30 + 1 & var23;
                  var20[var26 + 1][var27 + 1] = 12;
                  var19[var26 + 1][var27 + 1] = var35;
               }
            }

            var15 = var16;
         }
      }

      int var42 = var0 - (var9 >> 1);
      var17 = var1 - (var10 >> 1);
      var18 = var8.method4243();
      int var37 = var8.method4251();
      int var38;
      int var39;
      int var40;
      if (!var15) {
         var38 = Integer.MAX_VALUE;
         var39 = Integer.MAX_VALUE;
         var40 = 10;
         var23 = var3.approxDestinationX;
         var24 = var3.approxDestinationY;
         var25 = var3.approxDestinationSizeX;
         var26 = var3.approxDestinationSizeY;

         for(var27 = var23 - var40; var27 <= var23 + var40; ++var27) {
            for(var28 = var24 - var40; var28 <= var40 + var24; ++var28) {
               var29 = var27 - var42;
               var30 = var28 - var17;
               if (var29 >= 0 && var30 >= 0 && var29 < var9 && var30 < var10 && var11[var29][var30] < 100) {
                  var31 = 0;
                  if (var27 < var23) {
                     var31 = var23 - var27;
                  } else if (var27 > var25 + var23 - 1) {
                     var31 = var27 - (var25 + var23 - 1);
                  }

                  int var41 = 0;
                  if (var28 < var24) {
                     var41 = var24 - var28;
                  } else if (var28 > var24 + var26 - 1) {
                     var41 = var28 - (var26 + var24 - 1);
                  }

                  var33 = var41 * var41 + var31 * var31;
                  if (var33 < var38 || var33 == var38 && var11[var29][var30] < var39) {
                     var38 = var33;
                     var39 = var11[var29][var30];
                     var18 = var27;
                     var37 = var28;
                  }
               }
            }
         }

         if (var38 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var18 && var37 == var1) {
         var6[0] = var18;
         var7[0] = var37;
         return 0;
      } else {
         byte var44 = 0;
         var13[var44] = var18;
         var38 = var44 + 1;
         var14[var44] = var37;

         for(var39 = var40 = var12[var18 - var42][var37 - var17]; var0 != var18 || var37 != var1; var39 = var12[var18 - var42][var37 - var17]) {
            if (var39 != var40) {
               var40 = var39;
               var13[var38] = var18;
               var14[var38++] = var37;
            }

            if ((var39 & 2) != 0) {
               ++var18;
            } else if ((var39 & 8) != 0) {
               --var18;
            }

            if ((var39 & 1) != 0) {
               ++var37;
            } else if ((var39 & 4) != 0) {
               --var37;
            }
         }

         var23 = 0;

         while(var38-- > 0) {
            var6[var23] = var13[var38];
            var7[var23++] = var14[var38];
            if (var23 >= var6.length) {
               break;
            }
         }

         return var23;
      }
   }
}
