import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1980182519
   )
   static int field4284;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1953927973
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 2110626999825614057L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmi;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("s")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("z")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Lrd;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method6719(2);
      this.grandExchangeOffer.method6710(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1767360922"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-36"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }

   @ObfuscatedName("r")
   static final void method6700(long var0) {
      ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(Lcl;IILhz;I)V",
      garbageValue = "-992361699"
   )
   static final void method6704(Player var0, int var1, int var2, class208 var3) {
      int var4 = var0.pathX[0];
      int var5 = var0.pathY[0];
      int var6 = var0.transformedSize();
      if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.transformedSize();
            RouteStrategy var9 = class322.method6431(var1, var2);
            CollisionMap var10 = Client.collisionMaps[var0.plane];
            int[] var11 = Client.field802;
            int[] var12 = Client.field785;

            int var13;
            int var14;
            for(var13 = 0; var13 < 128; ++var13) {
               for(var14 = 0; var14 < 128; ++var14) {
                  class209.directions[var13][var14] = 0;
                  class209.distances[var13][var14] = 99999999;
               }
            }

            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var24;
            int var25;
            int var26;
            int var27;
            boolean var33;
            byte var36;
            if (var8 == 1) {
               var33 = ClanSettings.method3235(var4, var5, var9, var10);
            } else {
               int[][] var23;
               boolean var34;
               if (var8 == 2) {
                  var15 = var4;
                  var16 = var5;
                  var17 = 64;
                  var18 = 64;
                  var19 = var4 - var17;
                  var20 = var5 - var18;
                  class209.directions[var17][var18] = 99;
                  class209.distances[var17][var18] = 0;
                  var21 = 0;
                  var22 = 0;
                  class209.bufferX[var21] = var4;
                  class209.bufferY[var21++] = var5;
                  var23 = var10.flags;

                  while(true) {
                     if (var21 == var22) {
                        class209.field2371 = var15;
                        class209.field2372 = var16;
                        var34 = false;
                        break;
                     }

                     var15 = class209.bufferX[var22];
                     var16 = class209.bufferY[var22];
                     var22 = var22 + 1 & 4095;
                     var17 = var15 - var19;
                     var18 = var16 - var20;
                     var24 = var15 - var10.xInset;
                     var25 = var16 - var10.yInset;
                     if (var9.hasArrived(2, var15, var16, var10)) {
                        class209.field2371 = var15;
                        class209.field2372 = var16;
                        var34 = true;
                        break;
                     }

                     var26 = class209.distances[var17][var18] + 1;
                     if (var17 > 0 && class209.directions[var17 - 1][var18] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0) {
                        class209.bufferX[var21] = var15 - 1;
                        class209.bufferY[var21] = var16;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 - 1][var18] = 2;
                        class209.distances[var17 - 1][var18] = var26;
                     }

                     if (var17 < 126 && class209.directions[var17 + 1][var18] == 0 && (var23[var24 + 2][var25] & 19136899) == 0 && (var23[var24 + 2][var25 + 1] & 19136992) == 0) {
                        class209.bufferX[var21] = var15 + 1;
                        class209.bufferY[var21] = var16;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 + 1][var18] = 8;
                        class209.distances[var17 + 1][var18] = var26;
                     }

                     if (var18 > 0 && class209.directions[var17][var18 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0) {
                        class209.bufferX[var21] = var15;
                        class209.bufferY[var21] = var16 - 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17][var18 - 1] = 1;
                        class209.distances[var17][var18 - 1] = var26;
                     }

                     if (var18 < 126 && class209.directions[var17][var18 + 1] == 0 && (var23[var24][var25 + 2] & 19136824) == 0 && (var23[var24 + 1][var25 + 2] & 19136992) == 0) {
                        class209.bufferX[var21] = var15;
                        class209.bufferY[var21] = var16 + 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17][var18 + 1] = 4;
                        class209.distances[var17][var18 + 1] = var26;
                     }

                     if (var17 > 0 && var18 > 0 && class209.directions[var17 - 1][var18 - 1] == 0 && (var23[var24 - 1][var25] & 19136830) == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24][var25 - 1] & 19136911) == 0) {
                        class209.bufferX[var21] = var15 - 1;
                        class209.bufferY[var21] = var16 - 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 - 1][var18 - 1] = 3;
                        class209.distances[var17 - 1][var18 - 1] = var26;
                     }

                     if (var17 < 126 && var18 > 0 && class209.directions[var17 + 1][var18 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136911) == 0 && (var23[var24 + 2][var25 - 1] & 19136899) == 0 && (var23[var24 + 2][var25] & 19136995) == 0) {
                        class209.bufferX[var21] = var15 + 1;
                        class209.bufferY[var21] = var16 - 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 + 1][var18 - 1] = 9;
                        class209.distances[var17 + 1][var18 - 1] = var26;
                     }

                     if (var17 > 0 && var18 < 126 && class209.directions[var17 - 1][var18 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136830) == 0 && (var23[var24 - 1][var25 + 2] & 19136824) == 0 && (var23[var24][var25 + 2] & 19137016) == 0) {
                        class209.bufferX[var21] = var15 - 1;
                        class209.bufferY[var21] = var16 + 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 - 1][var18 + 1] = 6;
                        class209.distances[var17 - 1][var18 + 1] = var26;
                     }

                     if (var17 < 126 && var18 < 126 && class209.directions[var17 + 1][var18 + 1] == 0 && (var23[var24 + 1][var25 + 2] & 19137016) == 0 && (var23[var24 + 2][var25 + 2] & 19136992) == 0 && (var23[var24 + 2][var25 + 1] & 19136995) == 0) {
                        class209.bufferX[var21] = var15 + 1;
                        class209.bufferY[var21] = var16 + 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 + 1][var18 + 1] = 12;
                        class209.distances[var17 + 1][var18 + 1] = var26;
                     }
                  }

                  var33 = var34;
               } else {
                  var15 = var4;
                  var16 = var5;
                  byte var35 = 64;
                  var36 = 64;
                  var19 = var4 - var35;
                  var20 = var5 - var36;
                  class209.directions[var35][var36] = 99;
                  class209.distances[var35][var36] = 0;
                  byte var38 = 0;
                  var22 = 0;
                  class209.bufferX[var38] = var4;
                  var21 = var38 + 1;
                  class209.bufferY[var38] = var5;
                  var23 = var10.flags;

                  label664:
                  while(true) {
                     label662:
                     while(true) {
                        do {
                           do {
                              do {
                                 label639:
                                 do {
                                    if (var22 == var21) {
                                       class209.field2371 = var15;
                                       class209.field2372 = var16;
                                       var34 = false;
                                       break label664;
                                    }

                                    var15 = class209.bufferX[var22];
                                    var16 = class209.bufferY[var22];
                                    var22 = var22 + 1 & 4095;
                                    var17 = var15 - var19;
                                    var18 = var16 - var20;
                                    var24 = var15 - var10.xInset;
                                    var25 = var16 - var10.yInset;
                                    if (var9.hasArrived(var8, var15, var16, var10)) {
                                       class209.field2371 = var15;
                                       class209.field2372 = var16;
                                       var34 = true;
                                       break label664;
                                    }

                                    var26 = class209.distances[var17][var18] + 1;
                                    if (var17 > 0 && class209.directions[var17 - 1][var18] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8 - 1) {
                                             class209.bufferX[var21] = var15 - 1;
                                             class209.bufferY[var21] = var16;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17 - 1][var18] = 2;
                                             class209.distances[var17 - 1][var18] = var26;
                                             break;
                                          }

                                          if ((var23[var24 - 1][var27 + var25] & 19136830) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var17 < 128 - var8 && class209.directions[var17 + 1][var18] == 0 && (var23[var8 + var24][var25] & 19136899) == 0 && (var23[var8 + var24][var25 + var8 - 1] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8 - 1) {
                                             class209.bufferX[var21] = var15 + 1;
                                             class209.bufferY[var21] = var16;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17 + 1][var18] = 8;
                                             class209.distances[var17 + 1][var18] = var26;
                                             break;
                                          }

                                          if ((var23[var8 + var24][var27 + var25] & 19136995) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var18 > 0 && class209.directions[var17][var18 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + var8 - 1][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8 - 1) {
                                             class209.bufferX[var21] = var15;
                                             class209.bufferY[var21] = var16 - 1;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17][var18 - 1] = 1;
                                             class209.distances[var17][var18 - 1] = var26;
                                             break;
                                          }

                                          if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var18 < 128 - var8 && class209.directions[var17][var18 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var24 + var8 - 1][var8 + var25] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8 - 1) {
                                             class209.bufferX[var21] = var15;
                                             class209.bufferY[var21] = var16 + 1;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17][var18 + 1] = 4;
                                             class209.distances[var17][var18 + 1] = var26;
                                             break;
                                          }

                                          if ((var23[var27 + var24][var8 + var25] & 19137016) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var17 > 0 && var18 > 0 && class209.directions[var17 - 1][var18 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8) {
                                             class209.bufferX[var21] = var15 - 1;
                                             class209.bufferY[var21] = var16 - 1;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17 - 1][var18 - 1] = 3;
                                             class209.distances[var17 - 1][var18 - 1] = var26;
                                             break;
                                          }

                                          if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var17 < 128 - var8 && var18 > 0 && class209.directions[var17 + 1][var18 - 1] == 0 && (var23[var8 + var24][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if (var27 >= var8) {
                                             class209.bufferX[var21] = var15 + 1;
                                             class209.bufferY[var21] = var16 - 1;
                                             var21 = var21 + 1 & 4095;
                                             class209.directions[var17 + 1][var18 - 1] = 9;
                                             class209.distances[var17 + 1][var18 - 1] = var26;
                                             break;
                                          }

                                          if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if (var17 > 0 && var18 < 128 - var8 && class209.directions[var17 - 1][var18 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) {
                                       for(var27 = 1; var27 < var8; ++var27) {
                                          if ((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) {
                                             continue label639;
                                          }
                                       }

                                       class209.bufferX[var21] = var15 - 1;
                                       class209.bufferY[var21] = var16 + 1;
                                       var21 = var21 + 1 & 4095;
                                       class209.directions[var17 - 1][var18 + 1] = 6;
                                       class209.distances[var17 - 1][var18 + 1] = var26;
                                    }
                                 } while(var17 >= 128 - var8);
                              } while(var18 >= 128 - var8);
                           } while(class209.directions[var17 + 1][var18 + 1] != 0);
                        } while((var23[var8 + var24][var25 + var8] & 19136992) != 0);

                        for(var27 = 1; var27 < var8; ++var27) {
                           if ((var23[var24 + var27][var8 + var25] & 19137016) != 0 || (var23[var8 + var24][var25 + var27] & 19136995) != 0) {
                              continue label662;
                           }
                        }

                        class209.bufferX[var21] = var15 + 1;
                        class209.bufferY[var21] = var16 + 1;
                        var21 = var21 + 1 & 4095;
                        class209.directions[var17 + 1][var18 + 1] = 12;
                        class209.distances[var17 + 1][var18 + 1] = var26;
                     }
                  }

                  var33 = var34;
               }
            }

            int var7;
            label712: {
               var14 = var4 - 64;
               var15 = var5 - 64;
               var16 = class209.field2371;
               var17 = class209.field2372;
               if (!var33) {
                  var18 = Integer.MAX_VALUE;
                  var19 = Integer.MAX_VALUE;
                  byte var37 = 10;
                  var21 = var9.approxDestinationX;
                  var22 = var9.approxDestinationY;
                  int var32 = var9.approxDestinationSizeX;
                  var24 = var9.approxDestinationSizeY;

                  for(var25 = var21 - var37; var25 <= var37 + var21; ++var25) {
                     for(var26 = var22 - var37; var26 <= var22 + var37; ++var26) {
                        var27 = var25 - var14;
                        int var28 = var26 - var15;
                        if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class209.distances[var27][var28] < 100) {
                           int var29 = 0;
                           if (var25 < var21) {
                              var29 = var21 - var25;
                           } else if (var25 > var21 + var32 - 1) {
                              var29 = var25 - (var21 + var32 - 1);
                           }

                           int var30 = 0;
                           if (var26 < var22) {
                              var30 = var22 - var26;
                           } else if (var26 > var24 + var22 - 1) {
                              var30 = var26 - (var22 + var24 - 1);
                           }

                           int var31 = var30 * var30 + var29 * var29;
                           if (var31 < var18 || var31 == var18 && class209.distances[var27][var28] < var19) {
                              var18 = var31;
                              var19 = class209.distances[var27][var28];
                              var16 = var25;
                              var17 = var26;
                           }
                        }
                     }
                  }

                  if (var18 == Integer.MAX_VALUE) {
                     var7 = -1;
                     break label712;
                  }
               }

               if (var16 == var4 && var17 == var5) {
                  var11[0] = var16;
                  var12[0] = var17;
                  var7 = 0;
               } else {
                  var36 = 0;
                  class209.bufferX[var36] = var16;
                  var18 = var36 + 1;
                  class209.bufferY[var36] = var17;

                  for(var19 = var20 = class209.directions[var16 - var14][var17 - var15]; var16 != var4 || var5 != var17; var19 = class209.directions[var16 - var14][var17 - var15]) {
                     if (var20 != var19) {
                        var20 = var19;
                        class209.bufferX[var18] = var16;
                        class209.bufferY[var18++] = var17;
                     }

                     if ((var19 & 2) != 0) {
                        ++var16;
                     } else if ((var19 & 8) != 0) {
                        --var16;
                     }

                     if ((var19 & 1) != 0) {
                        ++var17;
                     } else if ((var19 & 4) != 0) {
                        --var17;
                     }
                  }

                  var21 = 0;

                  while(var18-- > 0) {
                     var11[var21] = class209.bufferX[var18];
                     var12[var21++] = class209.bufferY[var18];
                     if (var21 >= var11.length) {
                        break;
                     }
                  }

                  var7 = var21;
               }
            }

            var13 = var7;
            if (var7 >= 1) {
               for(var14 = 0; var14 < var13 - 1; ++var14) {
                  var0.method2390(Client.field802[var14], Client.field785[var14], var3);
               }

            }
         }
      }
   }
}
