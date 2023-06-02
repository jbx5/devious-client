import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 183701023
   )
   public static int field1903;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("VarpDefinition_cached")
   static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 984856865
   )
   static int field1905;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 437669515
   )
   @Export("type")
   public int type = 0;

   VarpDefinition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "-36"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "-47"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-612390217"
   )
   public static void method3584() {
      HealthBarDefinition.HealthBarDefinition_cached.clear();
      HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Liz;[Lic;I)V",
      garbageValue = "2146886129"
   )
   static final void method3573(Scene var0, CollisionMap[] var1) {
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
         byte[][] var47 = class305.Tiles_underlays2[var2];
         boolean var56 = true;
         boolean var57 = true;
         boolean var6 = true;
         boolean var7 = true;
         boolean var8 = true;
         var9 = (int)Math.sqrt(5100.0);
         var10 = var9 * 768 >> 8;

         int var19;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
               var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
               int var55 = (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11 + 1] >> 3) + (var47[var12][var11] >> 1);
               Canvas.field116[var12][var11] = var19 - var55;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            UserComparator5.Tiles_hue[var11] = 0;
            class210.Tiles_saturation[var11] = 0;
            Tiles.Tiles_lightness[var11] = 0;
            class149.Tiles_hueMultiplier[var11] = 0;
            Tiles.field1019[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  long var51 = (long)Math.pow(2.0, 15.0) - 1L;
                  var16 = (int)var51;
                  var17 = FaceNormal.Tiles_underlays[var2][var13][var12] & var16;
                  if (var17 > 0) {
                     FloorUnderlayDefinition var53 = class183.method3553(var17 - 1);
                     var10000 = UserComparator5.Tiles_hue;
                     var10000[var12] += var53.hue;
                     var10000 = class210.Tiles_saturation;
                     var10000[var12] += var53.saturation;
                     var10000 = Tiles.Tiles_lightness;
                     var10000[var12] += var53.lightness;
                     var10000 = class149.Tiles_hueMultiplier;
                     var10000[var12] += var53.hueMultiplier;
                     var10002 = Tiles.field1019[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)class215.method4252(15);
                  var16 = FaceNormal.Tiles_underlays[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     FloorUnderlayDefinition var54 = class183.method3553(var16 - 1);
                     var10000 = UserComparator5.Tiles_hue;
                     var10000[var12] -= var54.hue;
                     var10000 = class210.Tiles_saturation;
                     var10000[var12] -= var54.saturation;
                     var10000 = Tiles.Tiles_lightness;
                     var10000[var12] -= var54.lightness;
                     var10000 = class149.Tiles_hueMultiplier;
                     var10000[var12] -= var54.hueMultiplier;
                     var10002 = Tiles.field1019[var12]--;
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
                     var12 += UserComparator5.Tiles_hue[var18];
                     var13 += class210.Tiles_saturation[var18];
                     var14 += Tiles.Tiles_lightness[var18];
                     var15 += class149.Tiles_hueMultiplier[var18];
                     var16 += Tiles.field1019[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= UserComparator5.Tiles_hue[var19];
                     var13 -= class210.Tiles_saturation[var19];
                     var14 -= Tiles.Tiles_lightness[var19];
                     var15 -= class149.Tiles_hueMultiplier[var19];
                     var16 -= Tiles.field1019[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
                     if (var2 < Tiles.Tiles_minPlane) {
                        Tiles.Tiles_minPlane = var2;
                     }

                     long var20 = (long)Math.pow(2.0, 15.0) - 1L;
                     int var22 = (int)var20;
                     int var23 = FaceNormal.Tiles_underlays[var2][var11][var17] & var22;
                     int var24 = class74.Tiles_overlays[var2][var11][var17] & var22;
                     if (var23 > 0 || var24 > 0) {
                        int var25 = Tiles.Tiles_heights[var2][var11][var17];
                        int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
                        int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
                        int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
                        int var29 = Canvas.field116[var11][var17];
                        int var30 = Canvas.field116[var11 + 1][var17];
                        int var31 = Canvas.field116[var11 + 1][var17 + 1];
                        int var32 = Canvas.field116[var11][var17 + 1];
                        int var33 = -1;
                        int var34 = -1;
                        int var35;
                        int var36;
                        int var37;
                        if (var23 > 0) {
                           var35 = var12 * 256 / var15;
                           var36 = var13 / var16;
                           var37 = var14 / var16;
                           var33 = GameEngine.hslToRgb(var35, var36, var37);
                           var35 = var35 + Tiles.rndHue & 255;
                           var37 += Tiles.rndLightness;
                           if (var37 < 0) {
                              var37 = 0;
                           } else if (var37 > 255) {
                              var37 = 255;
                           }

                           var34 = GameEngine.hslToRgb(var35, var36, var37);
                        }

                        FloorOverlayDefinition var38;
                        if (var2 > 0) {
                           boolean var62 = true;
                           if (var23 == 0 && Player.Tiles_shapes[var2][var11][var17] != 0) {
                              var62 = false;
                           }

                           if (var24 > 0) {
                              var37 = var24 - 1;
                              var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
                              FloorOverlayDefinition var48;
                              if (var38 != null) {
                                 var48 = var38;
                              } else {
                                 byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
                                 var38 = new FloorOverlayDefinition();
                                 if (var39 != null) {
                                    var38.decode(new Buffer(var39), var37);
                                 }

                                 var38.postDecode();
                                 FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37);
                                 var48 = var38;
                              }

                              if (!var48.hideUnderlay) {
                                 var62 = false;
                              }
                           }

                           if (var62 && var25 == var26 && var25 == var27 && var25 == var28) {
                              var10000 = Tiles.field1020[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var35 = 0;
                        if (var34 != -1) {
                           var35 = Rasterizer3D.Rasterizer3D_colorPalette[ItemContainer.method2230(var34, 96)];
                        }

                        if (var24 == 0) {
                           var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ItemContainer.method2230(var33, var29), ItemContainer.method2230(var33, var30), ItemContainer.method2230(var33, var31), ItemContainer.method2230(var33, var32), 0, 0, 0, 0, var35, 0);
                        } else {
                           var36 = Player.Tiles_shapes[var2][var11][var17] + 1;
                           byte var63 = Tiles.field1018[var2][var11][var17];
                           int var49 = var24 - 1;
                           FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var49);
                           if (var40 != null) {
                              var38 = var40;
                           } else {
                              byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var49);
                              var40 = new FloorOverlayDefinition();
                              if (var41 != null) {
                                 var40.decode(new Buffer(var41), var49);
                              }

                              var40.postDecode();
                              FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var49);
                              var38 = var40;
                           }

                           int var50 = var38.texture;
                           int var42;
                           int var43;
                           int var44;
                           int var45;
                           if (var50 >= 0) {
                              var43 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var50);
                              var42 = -1;
                           } else if (var38.primaryRgb == 16711935) {
                              var42 = -2;
                              var50 = -1;
                              var43 = -2;
                           } else {
                              var42 = GameEngine.hslToRgb(var38.hue, var38.saturation, var38.lightness);
                              var44 = var38.hue + Tiles.rndHue & 255;
                              var45 = var38.lightness + Tiles.rndLightness;
                              if (var45 < 0) {
                                 var45 = 0;
                              } else if (var45 > 255) {
                                 var45 = 255;
                              }

                              var43 = GameEngine.hslToRgb(var44, var38.saturation, var45);
                           }

                           var44 = 0;
                           if (var43 != -2) {
                              var44 = Rasterizer3D.Rasterizer3D_colorPalette[AbstractSocket.method7958(var43, 96)];
                           }

                           if (var38.secondaryRgb != -1) {
                              var45 = var38.secondaryHue + Tiles.rndHue & 255;
                              int var46 = var38.secondaryLightness + Tiles.rndLightness;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var43 = GameEngine.hslToRgb(var45, var38.secondarySaturation, var46);
                              var44 = Rasterizer3D.Rasterizer3D_colorPalette[AbstractSocket.method7958(var43, 96)];
                           }

                           var0.addTile(var2, var11, var17, var36, var63, var50, var25, var26, var27, var28, ItemContainer.method2230(var33, var29), ItemContainer.method2230(var33, var30), ItemContainer.method2230(var33, var31), ItemContainer.method2230(var33, var32), AbstractSocket.method7958(var42, var29), AbstractSocket.method7958(var42, var30), AbstractSocket.method7958(var42, var31), AbstractSocket.method7958(var42, var32), var35, var44);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var0.setTileMinPlane(var2, var12, var11, class135.method3045(var2, var12, var11));
            }
         }

         FaceNormal.Tiles_underlays[var2] = null;
         class74.Tiles_overlays[var2] = null;
         Player.Tiles_shapes[var2] = null;
         Tiles.field1018[var2] = null;
         class305.Tiles_underlays2[var2] = null;
      }

      var0.method4543(-50, -10, -50);

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

         for(int var58 = 0; var58 <= var5; ++var58) {
            for(int var59 = 0; var59 <= 104; ++var59) {
               for(int var60 = 0; var60 <= 104; ++var60) {
                  short var61;
                  if ((Tiles.field1020[var58][var60][var59] & var2) != 0) {
                     var9 = var59;
                     var10 = var59;
                     var11 = var58;

                     for(var12 = var58; var9 > 0 && (Tiles.field1020[var58][var60][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (Tiles.field1020[var58][var60][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label448:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((Tiles.field1020[var11 - 1][var60][var13] & var2) == 0) {
                              break label448;
                           }
                        }

                        --var11;
                     }

                     label437:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((Tiles.field1020[var12 + 1][var60][var13] & var2) == 0) {
                              break label437;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
                     if (var13 >= 8) {
                        var61 = 240;
                        var15 = Tiles.Tiles_heights[var12][var60][var9] - var61;
                        var16 = Tiles.Tiles_heights[var11][var60][var9];
                        Scene.Scene_addOccluder(var5, 1, var60 * 128, var60 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = Tiles.field1020[var17][var60];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((Tiles.field1020[var58][var60][var59] & var3) != 0) {
                     var9 = var60;
                     var10 = var60;
                     var11 = var58;

                     for(var12 = var58; var9 > 0 && (Tiles.field1020[var58][var9 - 1][var59] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && (Tiles.field1020[var58][var10 + 1][var59] & var3) != 0) {
                        ++var10;
                     }

                     label501:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((Tiles.field1020[var11 - 1][var13][var59] & var3) == 0) {
                              break label501;
                           }
                        }

                        --var11;
                     }

                     label490:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((Tiles.field1020[var12 + 1][var13][var59] & var3) == 0) {
                              break label490;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var61 = 240;
                        var15 = Tiles.Tiles_heights[var12][var9][var59] - var61;
                        var16 = Tiles.Tiles_heights[var11][var9][var59];
                        Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var59 * 128, var59 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = Tiles.field1020[var17][var18];
                              var10000[var59] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((Tiles.field1020[var58][var60][var59] & var4) != 0) {
                     var9 = var60;
                     var10 = var60;
                     var11 = var59;

                     for(var12 = var59; var11 > 0 && (Tiles.field1020[var58][var60][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && (Tiles.field1020[var58][var60][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label554:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((Tiles.field1020[var58][var9 - 1][var13] & var4) == 0) {
                              break label554;
                           }
                        }

                        --var9;
                     }

                     label543:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((Tiles.field1020[var58][var10 + 1][var13] & var4) == 0) {
                              break label543;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
                        var13 = Tiles.Tiles_heights[var58][var9][var11];
                        Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = Tiles.field1020[var58][var14];
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-264833117"
   )
   static int method3586(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.CC_GETOP) {
         if (var0 == ScriptOpcodes.CC_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      descriptor = "(IIII)Ldx;",
      garbageValue = "-2122334075"
   )
   static final InterfaceParent method3580(int var0, int var1, int var2) {
      InterfaceParent var3 = new InterfaceParent();
      var3.group = var1;
      var3.type = var2;
      Client.interfaceParents.put(var3, (long)var0);
      class136.Widget_resetModelFrames(var1);
      Widget var4 = FriendSystem.getWidget(var0);
      Messages.invalidateWidget(var4);
      if (Client.meslayerContinueWidget != null) {
         Messages.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var0 >> 16], var4, false);
      class149.runWidgetOnLoadListener(var1);
      if (Client.rootInterface != -1) {
         class453.runIntfCloseListeners(Client.rootInterface, 1);
      }

      return var3;
   }
}
