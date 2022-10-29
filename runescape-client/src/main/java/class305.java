import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
public class class305 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("huffman")
   public static Huffman huffman;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Lmo;IB)Ljc;",
      garbageValue = "-37"
   )
   public static PacketBufferNode method6204(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3072, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByte(0);
      int var5 = var4.packetBuffer.offset;
      var4.packetBuffer.writeByte(var0);
      String var6 = var1.toLowerCase();
      byte var7 = 0;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("yellow:")) {
            var7 = 0;
            var1 = var1.substring("yellow:".length());
         } else if (var6.startsWith("red:")) {
            var7 = 1;
            var1 = var1.substring("red:".length());
         } else if (var6.startsWith("green:")) {
            var7 = 2;
            var1 = var1.substring("green:".length());
         } else if (var6.startsWith("cyan:")) {
            var7 = 3;
            var1 = var1.substring("cyan:".length());
         } else if (var6.startsWith("purple:")) {
            var7 = 4;
            var1 = var1.substring("purple:".length());
         } else if (var6.startsWith("white:")) {
            var7 = 5;
            var1 = var1.substring("white:".length());
         } else if (var6.startsWith("flash1:")) {
            var7 = 6;
            var1 = var1.substring("flash1:".length());
         } else if (var6.startsWith("flash2:")) {
            var7 = 7;
            var1 = var1.substring("flash2:".length());
         } else if (var6.startsWith("flash3:")) {
            var7 = 8;
            var1 = var1.substring("flash3:".length());
         } else if (var6.startsWith("glow1:")) {
            var7 = 9;
            var1 = var1.substring("glow1:".length());
         } else if (var6.startsWith("glow2:")) {
            var7 = 10;
            var1 = var1.substring("glow2:".length());
         } else if (var6.startsWith("glow3:")) {
            var7 = 11;
            var1 = var1.substring("glow3:".length());
         }
      }

      var6 = var1.toLowerCase();
      byte var8 = 0;
      if (var6.startsWith("wave:")) {
         var8 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var8 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var8 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var8 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var8 = 5;
         var1 = var1.substring("slide:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("wave:")) {
            var8 = 1;
            var1 = var1.substring("wave:".length());
         } else if (var6.startsWith("wave2:")) {
            var8 = 2;
            var1 = var1.substring("wave2:".length());
         } else if (var6.startsWith("shake:")) {
            var8 = 3;
            var1 = var1.substring("shake:".length());
         } else if (var6.startsWith("scroll:")) {
            var8 = 4;
            var1 = var1.substring("scroll:".length());
         } else if (var6.startsWith("slide:")) {
            var8 = 5;
            var1 = var1.substring("slide:".length());
         }
      }

      var4.packetBuffer.writeByte(var7);
      var4.packetBuffer.writeByte(var8);
      class281.method5418(var4.packetBuffer, var1);
      if (var0 == class310.field3664.rsOrdinal()) {
         var4.packetBuffer.writeByte(var3);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
      return var4;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lhf;[Lgr;S)V",
      garbageValue = "8272"
   )
   static final void method6206(Scene var0, CollisionMap[] var1) {
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
         byte[][] var45 = class32.Tiles_underlays[var2];
         boolean var55 = true;
         boolean var56 = true;
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
               Tiles.field995[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            class32.Tiles_hue[var11] = 0;
            FriendSystem.Tiles_saturation[var11] = 0;
            DefaultsGroup.Tiles_lightness[var11] = 0;
            ClanChannelMember.Tiles_hueMultiplier[var11] = 0;
            class410.field4590[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  var14 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15);
                  var15 = Tiles.Tiles_underlays[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     var17 = var15 - 1;
                     FloorUnderlayDefinition var50 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17);
                     FloorUnderlayDefinition var52;
                     if (var50 != null) {
                        var52 = var50;
                     } else {
                        byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
                        var50 = new FloorUnderlayDefinition();
                        if (var51 != null) {
                           var50.decode(new Buffer(var51), var17);
                        }

                        var50.postDecode();
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var50, (long)var17);
                        var52 = var50;
                     }

                     var10000 = class32.Tiles_hue;
                     var10000[var12] += var52.hue;
                     var10000 = FriendSystem.Tiles_saturation;
                     var10000[var12] += var52.saturation;
                     var10000 = DefaultsGroup.Tiles_lightness;
                     var10000[var12] += var52.lightness;
                     var10000 = ClanChannelMember.Tiles_hueMultiplier;
                     var10000[var12] += var52.hueMultiplier;
                     var10002 = class410.field4590[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15);
                  var16 = Tiles.Tiles_underlays[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     FloorUnderlayDefinition var63 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18);
                     FloorUnderlayDefinition var54;
                     if (var63 != null) {
                        var54 = var63;
                     } else {
                        byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var18);
                        var63 = new FloorUnderlayDefinition();
                        if (var53 != null) {
                           var63.decode(new Buffer(var53), var18);
                        }

                        var63.postDecode();
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var63, (long)var18);
                        var54 = var63;
                     }

                     var10000 = class32.Tiles_hue;
                     var10000[var12] -= var54.hue;
                     var10000 = FriendSystem.Tiles_saturation;
                     var10000[var12] -= var54.saturation;
                     var10000 = DefaultsGroup.Tiles_lightness;
                     var10000[var12] -= var54.lightness;
                     var10000 = ClanChannelMember.Tiles_hueMultiplier;
                     var10000[var12] -= var54.hueMultiplier;
                     var10002 = class410.field4590[var12]--;
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
                     var12 += class32.Tiles_hue[var18];
                     var13 += FriendSystem.Tiles_saturation[var18];
                     var14 += DefaultsGroup.Tiles_lightness[var18];
                     var15 += ClanChannelMember.Tiles_hueMultiplier[var18];
                     var16 += class410.field4590[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= class32.Tiles_hue[var19];
                     var13 -= FriendSystem.Tiles_saturation[var19];
                     var14 -= DefaultsGroup.Tiles_lightness[var19];
                     var15 -= ClanChannelMember.Tiles_hueMultiplier[var19];
                     var16 -= class410.field4590[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
                     if (var2 < Tiles.Tiles_minPlane) {
                        Tiles.Tiles_minPlane = var2;
                     }

                     var20 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15);
                     int var21 = Tiles.Tiles_underlays[var2][var11][var17] & var20;
                     int var22 = Tiles.Tiles_overlays[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = Tiles.Tiles_heights[var2][var11][var17];
                        int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17];
                        int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
                        int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1];
                        int var27 = Tiles.field995[var11][var17];
                        int var28 = Tiles.field995[var11 + 1][var17];
                        int var29 = Tiles.field995[var11 + 1][var17 + 1];
                        int var30 = Tiles.field995[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = UserComparator10.hslToRgb(var33, var34, var35);
                           var33 = var33 + Tiles.rndHue & 255;
                           var35 += Tiles.rndLightness;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = UserComparator10.hslToRgb(var33, var34, var35);
                        }

                        FloorOverlayDefinition var36;
                        if (var2 > 0) {
                           boolean var61 = true;
                           if (var21 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
                              var61 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35);
                              FloorOverlayDefinition var47;
                              if (var36 != null) {
                                 var47 = var36;
                              } else {
                                 byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35);
                                 var36 = new FloorOverlayDefinition();
                                 if (var37 != null) {
                                    var36.decode(new Buffer(var37), var35);
                                 }

                                 var36.postDecode();
                                 FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35);
                                 var47 = var36;
                              }

                              if (!var47.hideUnderlay) {
                                 var61 = false;
                              }
                           }

                           if (var61 && var23 == var24 && var25 == var23 && var26 == var23) {
                              var10000 = UserComparator7.field1410[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = Rasterizer3D.Rasterizer3D_colorPalette[Varps.method5679(var32, 96)];
                        }

                        if (var22 == 0) {
                           var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, Varps.method5679(var31, var27), Varps.method5679(var31, var28), Varps.method5679(var31, var29), Varps.method5679(var31, var30), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
                           byte var62 = PlayerCompositionColorTextureOverride.field1852[var2][var11][var17];
                           int var48 = var22 - 1;
                           FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var48);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var48);
                              var38 = new FloorOverlayDefinition();
                              if (var39 != null) {
                                 var38.decode(new Buffer(var39), var48);
                              }

                              var38.postDecode();
                              FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var48);
                              var36 = var38;
                           }

                           int var49 = var36.texture;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var49 >= 0) {
                              var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var49);
                              var40 = -1;
                           } else if (var36.primaryRgb == 16711935) {
                              var40 = -2;
                              var49 = -1;
                              var41 = -2;
                           } else {
                              var40 = UserComparator10.hslToRgb(var36.hue, var36.saturation, var36.lightness);
                              var42 = var36.hue + Tiles.rndHue & 255;
                              var43 = var36.lightness + Tiles.rndLightness;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = UserComparator10.hslToRgb(var42, var36.saturation, var43);
                           }

                           var42 = 0;
                           if (var41 != -2) {
                              var42 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method3516(var41, 96)];
                           }

                           if (var36.secondaryRgb != -1) {
                              var43 = var36.secondaryHue + Tiles.rndHue & 255;
                              int var44 = var36.secondaryLightness + Tiles.rndLightness;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var41 = UserComparator10.hslToRgb(var43, var36.secondarySaturation, var44);
                              var42 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method3516(var41, 96)];
                           }

                           var0.addTile(var2, var11, var17, var34, var62, var49, var23, var24, var25, var26, Varps.method5679(var31, var27), Varps.method5679(var31, var28), Varps.method5679(var31, var29), Varps.method5679(var31, var30), HealthBarDefinition.method3516(var40, var27), HealthBarDefinition.method3516(var40, var28), HealthBarDefinition.method3516(var40, var29), HealthBarDefinition.method3516(var40, var30), var33, var42);
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
         Tiles.Tiles_shapes[var2] = null;
         PlayerCompositionColorTextureOverride.field1852[var2] = null;
         class32.Tiles_underlays[var2] = null;
      }

      var0.method4302(-50, -10, -50);

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

         for(int var57 = 0; var57 <= var5; ++var57) {
            for(int var58 = 0; var58 <= 104; ++var58) {
               for(int var59 = 0; var59 <= 104; ++var59) {
                  short var60;
                  if ((UserComparator7.field1410[var57][var59][var58] & var2) != 0) {
                     var9 = var58;
                     var10 = var58;
                     var11 = var57;

                     for(var12 = var57; var9 > 0 && (UserComparator7.field1410[var57][var59][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (UserComparator7.field1410[var57][var59][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label490:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((UserComparator7.field1410[var11 - 1][var59][var13] & var2) == 0) {
                              break label490;
                           }
                        }

                        --var11;
                     }

                     label479:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((UserComparator7.field1410[var12 + 1][var59][var13] & var2) == 0) {
                              break label479;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var60 = 240;
                        var15 = Tiles.Tiles_heights[var12][var59][var9] - var60;
                        var16 = Tiles.Tiles_heights[var11][var59][var9];
                        Scene.Scene_addOccluder(var5, 1, var59 * 128, var59 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = UserComparator7.field1410[var17][var59];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((UserComparator7.field1410[var57][var59][var58] & var3) != 0) {
                     var9 = var59;
                     var10 = var59;
                     var11 = var57;

                     for(var12 = var57; var9 > 0 && (UserComparator7.field1410[var57][var9 - 1][var58] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && (UserComparator7.field1410[var57][var10 + 1][var58] & var3) != 0) {
                        ++var10;
                     }

                     label543:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((UserComparator7.field1410[var11 - 1][var13][var58] & var3) == 0) {
                              break label543;
                           }
                        }

                        --var11;
                     }

                     label532:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((UserComparator7.field1410[var12 + 1][var13][var58] & var3) == 0) {
                              break label532;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var60 = 240;
                        var15 = Tiles.Tiles_heights[var12][var9][var58] - var60;
                        var16 = Tiles.Tiles_heights[var11][var9][var58];
                        Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var58 * 128, var58 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = UserComparator7.field1410[var17][var18];
                              var10000[var58] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((UserComparator7.field1410[var57][var59][var58] & var4) != 0) {
                     var9 = var59;
                     var10 = var59;
                     var11 = var58;

                     for(var12 = var58; var11 > 0 && (UserComparator7.field1410[var57][var59][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && (UserComparator7.field1410[var57][var59][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label596:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((UserComparator7.field1410[var57][var9 - 1][var13] & var4) == 0) {
                              break label596;
                           }
                        }

                        --var9;
                     }

                     label585:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((UserComparator7.field1410[var57][var10 + 1][var13] & var4) == 0) {
                              break label585;
                           }
                        }

                        ++var10;
                     }

                     if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
                        var13 = Tiles.Tiles_heights[var57][var9][var11];
                        Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = UserComparator7.field1410[var57][var14];
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-1480605607"
   )
   static int method6209(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      }

      String var4 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]) {
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var9.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var9[var7] = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         } else {
            var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         }
      }

      var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
      if (var7 != -1) {
         var9[0] = new Integer(var7);
      } else {
         var9 = null;
      }

      if (var0 == ScriptOpcodes.CC_SETONCLICK) {
         var3.onClick = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
         var3.onHold = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
         var3.onRelease = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
         var3.onMouseOver = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
         var3.onMouseLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
         var3.onDrag = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
         var3.onTargetLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
         var3.onVarTransmit = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
         var3.onTimer = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONOP) {
         var3.onOp = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
         var3.onDragComplete = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
         var3.onClickRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
         var3.onMouseRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
         var3.onInvTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
         var3.onStatTransmit = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
         var3.onTargetEnter = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
         var3.onScroll = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
         var3.onChatTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONKEY) {
         var3.onKey = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
         var3.onFriendTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
         var3.onClanTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
         var3.onMiscTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
         var3.onDialogAbort = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
         var3.onSubChange = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1426) {
         var3.field3582 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
         var3.onResize = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
         var3.field3602 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
         var3.field3473 = var9;
      } else if (var0 == 1430) {
         var3.field3598 = var9;
      } else if (var0 == 1431) {
         var3.field3599 = var9;
      } else if (var0 == 1434) {
         var3.field3610 = var9;
      } else if (var0 == 1435) {
         var3.field3594 = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class298 var8 = var3.method6079();
         if (var8 != null) {
            if (var0 == 1436) {
               var8.field3413 = var9;
            } else if (var0 == 1437) {
               var8.field3414 = var9;
            } else if (var0 == 1438) {
               var8.field3416 = var9;
            } else if (var0 == 1439) {
               var8.field3415 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }
}
