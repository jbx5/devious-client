import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   @Export("js5Socket")
   static AbstractSocket js5Socket;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1999558433
   )
   @Export("objectDefId")
   final int objectDefId;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("region")
   final WorldMapRegion region;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2110951989
   )
   @Export("element")
   int element;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   @Export("label")
   WorldMapLabel label;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 342751675
   )
   @Export("subWidth")
   int subWidth;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1976189839
   )
   @Export("subHeight")
   int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;ILiy;)V"
   )
   WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.objectDefId = var3;
      this.region = var4;
      this.init();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-100"
   )
   @Export("init")
   void init() {
      this.element = VarpDefinition.getObjectDefinition(this.objectDefId).transform().mapIconId;
      this.label = this.region.createMapLabel(JagexCache.WorldMapElement_get(this.element));
      WorldMapElement var1 = JagexCache.WorldMapElement_get(this.getElement());
      SpritePixels var2 = var1.getSpriteBool(false);
      if (var2 != null) {
         this.subWidth = var2.subWidth;
         this.subHeight = var2.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2098413555"
   )
   @Export("getElement")
   public int getElement() {
      return this.element;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lii;",
      garbageValue = "849546905"
   )
   @Export("getLabel")
   WorldMapLabel getLabel() {
      return this.label;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-520723785"
   )
   @Export("getSubWidth")
   int getSubWidth() {
      return this.subWidth;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1290081241"
   )
   @Export("getSubHeight")
   int getSubHeight() {
      return this.subHeight;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;Lly;I)V",
      garbageValue = "-804046837"
   )
   public static void method4881(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      SequenceDefinition.SequenceDefinition_archive = var0;
      SequenceDefinition.SequenceDefinition_animationsArchive = var1;
      BuddyRankComparator.SequenceDefinition_skeletonsArchive = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;I)V",
      garbageValue = "-1454718201"
   )
   public static void method4880(AbstractArchive var0) {
      GrandExchangeOfferWorldComparator.EnumDefinition_archive = var0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "1397784753"
   )
   static char method4872(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (var0 == 223) {
         return 's';
      } else if (var0 == 338) {
         return 'E';
      } else {
         return (char)(var0 == 339 ? 'e' : '\u0000');
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lhc;[Lgw;I)V",
      garbageValue = "1985890925"
   )
   static final void method4878(Scene var0, CollisionMap[] var1) {
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
         byte[][] var45 = Canvas.Tiles_underlays[var2];
         boolean var51 = true;
         boolean var52 = true;
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
               var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
               var20 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1);
               Tiles.field1030[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            Tiles.Tiles_hue[var11] = 0;
            PcmPlayer.Tiles_saturation[var11] = 0;
            Tiles.Tiles_lightness[var11] = 0;
            NPC.Tiles_hueMultiplier[var11] = 0;
            MenuAction.field905[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  var14 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15);
                  var15 = Tiles.Tiles_underlays[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     FloorUnderlayDefinition var49 = class21.method304(var15 - 1);
                     var10000 = Tiles.Tiles_hue;
                     var10000[var12] += var49.hue;
                     var10000 = PcmPlayer.Tiles_saturation;
                     var10000[var12] += var49.saturation;
                     var10000 = Tiles.Tiles_lightness;
                     var10000[var12] += var49.lightness;
                     var10000 = NPC.Tiles_hueMultiplier;
                     var10000[var12] += var49.hueMultiplier;
                     var10002 = MenuAction.field905[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15);
                  var16 = Tiles.Tiles_underlays[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     FloorUnderlayDefinition var50 = class21.method304(var16 - 1);
                     var10000 = Tiles.Tiles_hue;
                     var10000[var12] -= var50.hue;
                     var10000 = PcmPlayer.Tiles_saturation;
                     var10000[var12] -= var50.saturation;
                     var10000 = Tiles.Tiles_lightness;
                     var10000[var12] -= var50.lightness;
                     var10000 = NPC.Tiles_hueMultiplier;
                     var10000[var12] -= var50.hueMultiplier;
                     var10002 = MenuAction.field905[var12]--;
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
                     var13 += PcmPlayer.Tiles_saturation[var18];
                     var14 += Tiles.Tiles_lightness[var18];
                     var15 += NPC.Tiles_hueMultiplier[var18];
                     var16 += MenuAction.field905[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= Tiles.Tiles_hue[var19];
                     var13 -= PcmPlayer.Tiles_saturation[var19];
                     var14 -= Tiles.Tiles_lightness[var19];
                     var15 -= NPC.Tiles_hueMultiplier[var19];
                     var16 -= MenuAction.field905[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
                     if (var2 < Tiles.Tiles_minPlane) {
                        Tiles.Tiles_minPlane = var2;
                     }

                     var20 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15);
                     int var21 = Tiles.Tiles_underlays[var2][var11][var17] & var20;
                     int var22 = class490.Tiles_overlays[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = Tiles.Tiles_heights[var2][var11][var17];
                        int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17];
                        int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
                        int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1];
                        int var27 = Tiles.field1030[var11][var17];
                        int var28 = Tiles.field1030[var11 + 1][var17];
                        int var29 = Tiles.field1030[var11 + 1][var17 + 1];
                        int var30 = Tiles.field1030[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = class374.hslToRgb(var33, var34, var35);
                           var33 = var33 + Tiles.rndHue & 255;
                           var35 += Tiles.rndLightness;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = class374.hslToRgb(var33, var34, var35);
                        }

                        FloorOverlayDefinition var36;
                        if (var2 > 0) {
                           boolean var57 = true;
                           if (var21 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
                              var57 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35);
                              FloorOverlayDefinition var46;
                              if (var36 != null) {
                                 var46 = var36;
                              } else {
                                 byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35);
                                 var36 = new FloorOverlayDefinition();
                                 if (var37 != null) {
                                    var36.decode(new Buffer(var37), var35);
                                 }

                                 var36.postDecode();
                                 FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35);
                                 var46 = var36;
                              }

                              if (!var46.hideUnderlay) {
                                 var57 = false;
                              }
                           }

                           if (var57 && var24 == var23 && var23 == var25 && var26 == var23) {
                              var10000 = class159.field1816[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = Rasterizer3D.Rasterizer3D_colorPalette[class182.method3635(var32, 96)];
                        }

                        if (var22 == 0) {
                           var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, class182.method3635(var31, var27), class182.method3635(var31, var28), class182.method3635(var31, var29), class182.method3635(var31, var30), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
                           byte var58 = class358.field4344[var2][var11][var17];
                           int var47 = var22 - 1;
                           FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var47);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var47);
                              var38 = new FloorOverlayDefinition();
                              if (var39 != null) {
                                 var38.decode(new Buffer(var39), var47);
                              }

                              var38.postDecode();
                              FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var47);
                              var36 = var38;
                           }

                           int var48 = var36.texture;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var48 >= 0) {
                              var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var48);
                              var40 = -1;
                           } else if (var36.primaryRgb == 16711935) {
                              var40 = -2;
                              var48 = -1;
                              var41 = -2;
                           } else {
                              var40 = class374.hslToRgb(var36.hue, var36.saturation, var36.lightness);
                              var42 = var36.hue + Tiles.rndHue & 255;
                              var43 = var36.lightness + Tiles.rndLightness;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = class374.hslToRgb(var42, var36.saturation, var43);
                           }

                           var42 = 0;
                           if (var41 != -2) {
                              var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapSectionType.method5234(var41, 96)];
                           }

                           if (var36.secondaryRgb != -1) {
                              var43 = var36.secondaryHue + Tiles.rndHue & 255;
                              int var44 = var36.secondaryLightness + Tiles.rndLightness;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var41 = class374.hslToRgb(var43, var36.secondarySaturation, var44);
                              var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapSectionType.method5234(var41, 96)];
                           }

                           var0.addTile(var2, var11, var17, var34, var58, var48, var23, var24, var25, var26, class182.method3635(var31, var27), class182.method3635(var31, var28), class182.method3635(var31, var29), class182.method3635(var31, var30), WorldMapSectionType.method5234(var40, var27), WorldMapSectionType.method5234(var40, var28), WorldMapSectionType.method5234(var40, var29), WorldMapSectionType.method5234(var40, var30), var33, var42);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var0.setTileMinPlane(var2, var12, var11, class262.method5406(var2, var12, var11));
            }
         }

         Tiles.Tiles_underlays[var2] = null;
         class490.Tiles_overlays[var2] = null;
         Tiles.Tiles_shapes[var2] = null;
         class358.field4344[var2] = null;
         Canvas.Tiles_underlays[var2] = null;
      }

      var0.method4461(-50, -10, -50);

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

         for(int var53 = 0; var53 <= var5; ++var53) {
            for(int var54 = 0; var54 <= 104; ++var54) {
               for(int var55 = 0; var55 <= 104; ++var55) {
                  short var56;
                  if ((class159.field1816[var53][var55][var54] & var2) != 0) {
                     var9 = var54;
                     var10 = var54;
                     var11 = var53;

                     for(var12 = var53; var9 > 0 && (class159.field1816[var53][var55][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (class159.field1816[var53][var55][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label459:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class159.field1816[var11 - 1][var55][var13] & var2) == 0) {
                              break label459;
                           }
                        }

                        --var11;
                     }

                     label448:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class159.field1816[var12 + 1][var55][var13] & var2) == 0) {
                              break label448;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var56 = 240;
                        var15 = Tiles.Tiles_heights[var12][var55][var9] - var56;
                        var16 = Tiles.Tiles_heights[var11][var55][var9];
                        Scene.Scene_addOccluder(var5, 1, var55 * 128, var55 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = class159.field1816[var17][var55];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((class159.field1816[var53][var55][var54] & var3) != 0) {
                     var9 = var55;
                     var10 = var55;
                     var11 = var53;

                     for(var12 = var53; var9 > 0 && (class159.field1816[var53][var9 - 1][var54] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && (class159.field1816[var53][var10 + 1][var54] & var3) != 0) {
                        ++var10;
                     }

                     label512:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class159.field1816[var11 - 1][var13][var54] & var3) == 0) {
                              break label512;
                           }
                        }

                        --var11;
                     }

                     label501:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((class159.field1816[var12 + 1][var13][var54] & var3) == 0) {
                              break label501;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
                     if (var13 >= 8) {
                        var56 = 240;
                        var15 = Tiles.Tiles_heights[var12][var9][var54] - var56;
                        var16 = Tiles.Tiles_heights[var11][var9][var54];
                        Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var54 * 128, var54 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = class159.field1816[var17][var18];
                              var10000[var54] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((class159.field1816[var53][var55][var54] & var4) != 0) {
                     var9 = var55;
                     var10 = var55;
                     var11 = var54;

                     for(var12 = var54; var11 > 0 && (class159.field1816[var53][var55][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && (class159.field1816[var53][var55][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label565:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((class159.field1816[var53][var9 - 1][var13] & var4) == 0) {
                              break label565;
                           }
                        }

                        --var9;
                     }

                     label554:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((class159.field1816[var53][var10 + 1][var13] & var4) == 0) {
                              break label554;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
                        var13 = Tiles.Tiles_heights[var53][var9][var11];
                        Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = class159.field1816[var53][var14];
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
}
