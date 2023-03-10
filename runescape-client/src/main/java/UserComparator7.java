import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("aq")
   public static ThreadPoolExecutor field1413;
   @ObfuscatedName("aj")
   @Export("reversed")
   final boolean reversed;

   public UserComparator7(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Lpt;B)I",
      garbageValue = "-38"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lir;[Liz;I)V",
      garbageValue = "1008245340"
   )
   static final void method2855(Scene var0, CollisionMap[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].setBlockedByFloor(var3, var4);
                  }
               }
            }
         }
      }

      Tiles.rndHue += (int)(Math.random() * 5.0) - 2;
      if (Tiles.rndHue < -8) {
         Tiles.rndHue = -8;
      }

      if (Tiles.rndHue > 8) {
         Tiles.rndHue = 8;
      }

      Tiles.rndLightness += (int)(Math.random() * 5.0) - 2;
      if (Tiles.rndLightness < -16) {
         Tiles.rndLightness = -16;
      }

      if (Tiles.rndLightness > 16) {
         Tiles.rndLightness = 16;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var43 = Decimator.Tiles_underlays2[var2];
         boolean var47 = true;
         boolean var48 = true;
         boolean var6 = true;
         boolean var7 = true;
         boolean var8 = true;
         var9 = (int)Math.sqrt(5100.0);
         var10 = var9 * 768 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
               var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
               var20 = (var43[var12][var11 + 1] >> 3) + (var43[var12 - 1][var11] >> 2) + (var43[var12][var11 - 1] >> 2) + (var43[var12 + 1][var11] >> 3) + (var43[var12][var11] >> 1);
               class306.field3445[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            Tiles.Tiles_hue[var11] = 0;
            class134.Tiles_saturation[var11] = 0;
            Language.Tiles_lightness[var11] = 0;
            TileItem.Tiles_hueMultiplier[var11] = 0;
            Interpreter.field840[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  var14 = (int)AbstractWorldMapData.method5218(15);
                  var15 = Tiles.Tiles_underlays[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     FloorUnderlayDefinition var45 = class134.method3068(var15 - 1);
                     var10000 = Tiles.Tiles_hue;
                     var10000[var12] += var45.hue;
                     var10000 = class134.Tiles_saturation;
                     var10000[var12] += var45.saturation;
                     var10000 = Language.Tiles_lightness;
                     var10000[var12] += var45.lightness;
                     var10000 = TileItem.Tiles_hueMultiplier;
                     var10000[var12] += var45.hueMultiplier;
                     var10002 = Interpreter.field840[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)AbstractWorldMapData.method5218(15);
                  var16 = Tiles.Tiles_underlays[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     FloorUnderlayDefinition var46 = class134.method3068(var16 - 1);
                     var10000 = Tiles.Tiles_hue;
                     var10000[var12] -= var46.hue;
                     var10000 = class134.Tiles_saturation;
                     var10000[var12] -= var46.saturation;
                     var10000 = Language.Tiles_lightness;
                     var10000[var12] -= var46.lightness;
                     var10000 = TileItem.Tiles_hueMultiplier;
                     var10000[var12] -= var46.hueMultiplier;
                     var10002 = Interpreter.field840[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if (var18 >= 0 && var18 < 104) {
                     var12 += Tiles.Tiles_hue[var18];
                     var13 += class134.Tiles_saturation[var18];
                     var14 += Language.Tiles_lightness[var18];
                     var15 += TileItem.Tiles_hueMultiplier[var18];
                     var16 += Interpreter.field840[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= Tiles.Tiles_hue[var19];
                     var13 -= class134.Tiles_saturation[var19];
                     var14 -= Language.Tiles_lightness[var19];
                     var15 -= TileItem.Tiles_hueMultiplier[var19];
                     var16 -= Interpreter.field840[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
                     if (var2 < Tiles.Tiles_minPlane) {
                        Tiles.Tiles_minPlane = var2;
                     }

                     var20 = (int)AbstractWorldMapData.method5218(15);
                     int var21 = Tiles.Tiles_underlays[var2][var11][var17] & var20;
                     int var22 = Tiles.Tiles_overlays[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = Tiles.Tiles_heights[var2][var11][var17];
                        int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17];
                        int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
                        int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1];
                        int var27 = class306.field3445[var11][var17];
                        int var28 = class306.field3445[var11 + 1][var17];
                        int var29 = class306.field3445[var11 + 1][var17 + 1];
                        int var30 = class306.field3445[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           int var35 = var14 / var16;
                           var31 = class122.hslToRgb(var33, var34, var35);
                           var33 = var33 + Tiles.rndHue & 255;
                           var35 += Tiles.rndLightness;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = class122.hslToRgb(var33, var34, var35);
                        }

                        if (var2 > 0) {
                           boolean var53 = true;
                           if (var21 == 0 && class16.Tiles_shapes[var2][var11][var17] != 0) {
                              var53 = false;
                           }

                           if (var22 > 0 && !class13.method160(var22 - 1).hideUnderlay) {
                              var53 = false;
                           }

                           if (var53 && var23 == var24 && var25 == var23 && var26 == var23) {
                              var10000 = class17.field88[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = Rasterizer3D.Rasterizer3D_colorPalette[Widget.method6151(var32, 96)];
                        }

                        if (var22 == 0) {
                           var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, Widget.method6151(var31, var27), Widget.method6151(var31, var28), Widget.method6151(var31, var29), Widget.method6151(var31, var30), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = class16.Tiles_shapes[var2][var11][var17] + 1;
                           byte var54 = Tiles.field997[var2][var11][var17];
                           FloorOverlayDefinition var36 = class13.method160(var22 - 1);
                           int var37 = var36.texture;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           if (var37 >= 0) {
                              var39 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var37);
                              var38 = -1;
                           } else if (var36.primaryRgb == 16711935) {
                              var38 = -2;
                              var37 = -1;
                              var39 = -2;
                           } else {
                              var38 = class122.hslToRgb(var36.hue, var36.saturation, var36.lightness);
                              var40 = var36.hue + Tiles.rndHue & 255;
                              var41 = var36.lightness + Tiles.rndLightness;
                              if (var41 < 0) {
                                 var41 = 0;
                              } else if (var41 > 255) {
                                 var41 = 255;
                              }

                              var39 = class122.hslToRgb(var40, var36.saturation, var41);
                           }

                           var40 = 0;
                           if (var39 != -2) {
                              var40 = Rasterizer3D.Rasterizer3D_colorPalette[class72.method2057(var39, 96)];
                           }

                           if (var36.secondaryRgb != -1) {
                              var41 = var36.secondaryHue + Tiles.rndHue & 255;
                              int var42 = var36.secondaryLightness + Tiles.rndLightness;
                              if (var42 < 0) {
                                 var42 = 0;
                              } else if (var42 > 255) {
                                 var42 = 255;
                              }

                              var39 = class122.hslToRgb(var41, var36.secondarySaturation, var42);
                              var40 = Rasterizer3D.Rasterizer3D_colorPalette[class72.method2057(var39, 96)];
                           }

                           var0.addTile(var2, var11, var17, var34, var54, var37, var23, var24, var25, var26, Widget.method6151(var31, var27), Widget.method6151(var31, var28), Widget.method6151(var31, var29), Widget.method6151(var31, var30), class72.method2057(var38, var27), class72.method2057(var38, var28), class72.method2057(var38, var29), class72.method2057(var38, var30), var33, var40);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
                  var17 = 0;
               } else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
                  var17 = var2 - 1;
               } else {
                  var17 = var2;
               }

               var0.setTileMinPlane(var2, var12, var11, var17);
            }
         }

         Tiles.Tiles_underlays[var2] = null;
         Tiles.Tiles_overlays[var2] = null;
         class16.Tiles_shapes[var2] = null;
         Tiles.field997[var2] = null;
         Decimator.Tiles_underlays2[var2] = null;
      }

      var0.method4434(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
               var0.setLinkBelow(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var49 = 0; var49 <= var5; ++var49) {
            for(int var50 = 0; var50 <= 104; ++var50) {
               for(int var51 = 0; var51 <= 104; ++var51) {
                  short var52;
                  if ((class17.field88[var49][var51][var50] & var2) != 0) {
                     var9 = var50;
                     var10 = var50;
                     var11 = var49;

                     for(var12 = var49; var9 > 0 && (class17.field88[var49][var51][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (class17.field88[var49][var51][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label428:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class17.field88[var11 - 1][var51][var13] & var2) == 0) {
                              break label428;
                           }
                        }

                        --var11;
                     }

                     label417:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class17.field88[var12 + 1][var51][var13] & var2) == 0) {
                              break label417;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = Tiles.Tiles_heights[var12][var51][var9] - var52;
                        var16 = Tiles.Tiles_heights[var11][var51][var9];
                        Scene.Scene_addOccluder(var5, 1, var51 * 128, var51 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = class17.field88[var17][var51];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((class17.field88[var49][var51][var50] & var3) != 0) {
                     var9 = var51;
                     var10 = var51;
                     var11 = var49;

                     for(var12 = var49; var9 > 0 && (class17.field88[var49][var9 - 1][var50] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && (class17.field88[var49][var10 + 1][var50] & var3) != 0) {
                        ++var10;
                     }

                     label481:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class17.field88[var11 - 1][var13][var50] & var3) == 0) {
                              break label481;
                           }
                        }

                        --var11;
                     }

                     label470:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class17.field88[var12 + 1][var13][var50] & var3) == 0) {
                              break label470;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = Tiles.Tiles_heights[var12][var9][var50] - var52;
                        var16 = Tiles.Tiles_heights[var11][var9][var50];
                        Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var50 * 128, var50 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = class17.field88[var17][var18];
                              var10000[var50] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((class17.field88[var49][var51][var50] & var4) != 0) {
                     var9 = var51;
                     var10 = var51;
                     var11 = var50;

                     for(var12 = var50; var11 > 0 && (class17.field88[var49][var51][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && (class17.field88[var49][var51][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label534:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((class17.field88[var49][var9 - 1][var13] & var4) == 0) {
                              break label534;
                           }
                        }

                        --var9;
                     }

                     label523:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((class17.field88[var49][var10 + 1][var13] & var4) == 0) {
                              break label523;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
                        var13 = Tiles.Tiles_heights[var49][var9][var11];
                        Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = class17.field88[var49][var14];
                              var10000[var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(Lcm;III)V",
      garbageValue = "1284745661"
   )
   static final void method2851(MenuAction var0, int var1, int var2) {
      if (var0 != null) {
         class287.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2);
      }

   }
}
