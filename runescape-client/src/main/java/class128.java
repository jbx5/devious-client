import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class128 implements class120 {
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = 1444608091
   )
   @Export("cameraYaw")
   static int cameraYaw;

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(Lct;IIIIIB)V",
      garbageValue = "0"
   )
   @Export("drawActor2d")
   static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.isVisible()) {
         if (var0 instanceof NPC) {
            NPCComposition var6 = ((NPC)var0).definition;
            if (var6.transforms != null) {
               var6 = var6.transform();
            }

            if (var6 == null) {
               return;
            }
         }

         int var75 = Players.Players_count;
         int[] var7 = Players.Players_indices;
         byte var8 = 0;
         Player var10;
         int var13;
         if (var1 < var75 && var0.playerCycle == Client.cycle) {
            var10 = (Player)var0;
            boolean var9;
            if (Client.drawPlayerNames == 0) {
               var9 = false;
            } else if (var10 != class155.localPlayer) {
               boolean var11 = (Client.drawPlayerNames & 4) != 0;
               var9 = var11 || SoundCache.method890() && var10.isFriend() || class121.method2887() && var10.isFriendsChatMember();
            } else {
               var9 = GraphicsObject.method2026();
            }

            if (var9) {
               Player var76 = (Player)var0;
               if (var1 < var75) {
                  ClientPreferences.method2513(var0, var0.defaultHeight + 15);
                  AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
                  var13 = 9;
                  var12.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var13, 16777215, 0);
                  var8 = 18;
               }
            }
         }

         int var89 = -2;
         int var15;
         int var22;
         int var23;
         if (!var0.healthBars.method6774()) {
            ClientPreferences.method2513(var0, var0.defaultHeight + 15);

            for(HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) {
               HealthBarUpdate var97 = var90.get(Client.cycle);
               if (var97 == null) {
                  if (var90.isEmpty()) {
                     var90.remove();
                  }
               } else {
                  HealthBarDefinition var93 = var90.definition;
                  SpritePixels var79 = var93.getBackSprite();
                  SpritePixels var83 = var93.getFrontSprite();
                  int var84 = 0;
                  if (var79 != null && var83 != null) {
                     if (var93.widthPadding * 2 < var83.subWidth) {
                        var84 = var93.widthPadding;
                     }

                     var15 = var83.subWidth - var84 * 2;
                  } else {
                     var15 = var93.width;
                  }

                  int var81 = 255;
                  boolean var85 = true;
                  int var86 = Client.cycle - var97.cycle;
                  int var87 = var15 * var97.health2 / var93.width;
                  int var88;
                  int var101;
                  if (var97.cycleOffset > var86) {
                     var88 = var93.field1976 == 0 ? 0 : var93.field1976 * (var86 / var93.field1976);
                     var22 = var15 * var97.health / var93.width;
                     var101 = var88 * (var87 - var22) / var97.cycleOffset + var22;
                  } else {
                     var101 = var87;
                     var88 = var93.int5 + var97.cycleOffset - var86;
                     if (var93.int3 >= 0) {
                        var81 = (var88 << 8) / (var93.int5 - var93.int3);
                     }
                  }

                  if (var97.health2 > 0 && var101 < 1) {
                     var101 = 1;
                  }

                  if (var79 != null && var83 != null) {
                     if (var101 == var15) {
                        var101 += var84 * 2;
                     } else {
                        var101 += var84;
                     }

                     var88 = var79.subHeight;
                     var89 += var88;
                     var22 = var2 + Client.viewportTempX - (var15 >> 1);
                     var23 = var3 + Client.viewportTempY - var89;
                     var22 -= var84;
                     if (var81 >= 0 && var81 < 255) {
                        var79.drawTransAt(var22, var23, var81);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var101, var88 + var23);
                        var83.drawTransAt(var22, var23, var81);
                     } else {
                        var79.drawTransBgAt(var22, var23);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var101, var88 + var23);
                        var83.drawTransBgAt(var22, var23);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
                     var89 += 2;
                  } else {
                     var89 += 5;
                     if (Client.viewportTempX > -1) {
                        var88 = var2 + Client.viewportTempX - (var15 >> 1);
                        var22 = var3 + Client.viewportTempY - var89;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var101, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var101, var22, var15 - var101, 5, 16711680);
                     }

                     var89 += 2;
                  }
               }
            }
         }

         if (var89 == -2) {
            var89 += 7;
         }

         var89 += var8;
         if (var1 < var75) {
            var10 = (Player)var0;
            if (var10.isHidden) {
               return;
            }

            if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
               ClientPreferences.method2513(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  if (var10.headIconPk != -1) {
                     var89 += 25;
                     World.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
                  }

                  if (var10.headIconPrayer != -1) {
                     var89 += 25;
                     class410.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
                  }
               }
            }

            if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
               ClientPreferences.method2513(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  var89 += class358.headIconHintSprites[1].subHeight;
                  class358.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
               }
            }
         } else {
            NPC var91 = (NPC)var0;
            int[] var98 = var91.method2546();
            short[] var94 = var91.method2538();
            if (var94 != null && var98 != null) {
               for(var13 = 0; var13 < var94.length; ++var13) {
                  if (var94[var13] >= 0 && var98[var13] >= 0) {
                     long var14 = (long)var98[var13] << 8 | (long)var94[var13];
                     SpritePixels var16 = (SpritePixels)Client.archive5.method7386(var14);
                     if (var16 == null) {
                        SpritePixels[] var17 = SequenceDefinition.method4064(ClientPreferences.archive8, var98[var13], 0);
                        if (var17 != null && var94[var13] < var17.length) {
                           var16 = var17[var94[var13]];
                           Client.archive5.method7374(var14, var16);
                        }
                     }

                     if (var16 != null) {
                        ClientPreferences.method2513(var0, var0.defaultHeight + 15);
                        if (Client.viewportTempX > -1) {
                           var3 -= var16.subHeight;
                           var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), var3 + Client.viewportTempY);
                           var3 -= 2;
                        }
                     }
                  }
               }
            }

            if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
               ClientPreferences.method2513(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  class358.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
               }
            }
         }

         if (var0.overheadText != null && (var1 >= var75 || !var0.field1187 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            ClientPreferences.method2513(var0, var0.defaultHeight + 15);
            if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
               Client.overheadTextXOffsets[Client.overheadTextCount] = class146.fontBold12.stringWidth(var0.overheadText) / 2;
               Client.overheadTextAscents[Client.overheadTextCount] = class146.fontBold12.ascent;
               Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
               Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var89;
               Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
               Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
               Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadText[Client.overheadTextCount] = var0.overheadText;
               ++Client.overheadTextCount;
               var89 += 12;
            }
         }

         for(int var77 = 0; var77 < 4; ++var77) {
            int var92 = var0.hitSplatCycles[var77];
            int var78 = var0.hitSplatTypes[var77];
            HitSplatDefinition var99 = null;
            int var80 = 0;
            if (var78 >= 0) {
               if (var92 <= Client.cycle) {
                  continue;
               }

               var99 = class364.method6987(var0.hitSplatTypes[var77]);
               var80 = var99.field2132;
               if (var99 != null && var99.transforms != null) {
                  var99 = var99.transform();
                  if (var99 == null) {
                     var0.hitSplatCycles[var77] = -1;
                     continue;
                  }
               }
            } else if (var92 < 0) {
               continue;
            }

            var15 = var0.hitSplatTypes2[var77];
            HitSplatDefinition var95 = null;
            if (var15 >= 0) {
               var95 = class364.method6987(var15);
               if (var95 != null && var95.transforms != null) {
                  var95 = var95.transform();
               }
            }

            if (var92 - var80 <= Client.cycle) {
               if (var99 == null) {
                  var0.hitSplatCycles[var77] = -1;
               } else {
                  ClientPreferences.method2513(var0, var0.defaultHeight / 2);
                  if (Client.viewportTempX > -1) {
                     boolean var100 = true;
                     if (var77 == 1) {
                        Client.viewportTempY -= 20;
                     }

                     if (var77 == 2) {
                        Client.viewportTempX -= 15;
                        Client.viewportTempY -= 10;
                     }

                     if (var77 == 3) {
                        Client.viewportTempX += 15;
                        Client.viewportTempY -= 10;
                     }

                     SpritePixels var18 = null;
                     SpritePixels var19 = null;
                     SpritePixels var20 = null;
                     SpritePixels var21 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     SpritePixels var30 = null;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     SpritePixels var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var18 = var99.method3827();
                     int var43;
                     if (var18 != null) {
                        var22 = var18.subWidth;
                        var43 = var18.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var18.xOffset;
                     }

                     var19 = var99.method3828();
                     if (var19 != null) {
                        var23 = var19.subWidth;
                        var43 = var19.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var19.xOffset;
                     }

                     var20 = var99.method3862();
                     if (var20 != null) {
                        var24 = var20.subWidth;
                        var43 = var20.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var20.xOffset;
                     }

                     var21 = var99.method3830();
                     if (var21 != null) {
                        var25 = var21.subWidth;
                        var43 = var21.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var21.xOffset;
                     }

                     if (var95 != null) {
                        var30 = var95.method3827();
                        if (var30 != null) {
                           var34 = var30.subWidth;
                           var43 = var30.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.xOffset;
                        }

                        var31 = var95.method3828();
                        if (var31 != null) {
                           var35 = var31.subWidth;
                           var43 = var31.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.xOffset;
                        }

                        var32 = var95.method3862();
                        if (var32 != null) {
                           var36 = var32.subWidth;
                           var43 = var32.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.xOffset;
                        }

                        var33 = var95.method3830();
                        if (var33 != null) {
                           var37 = var33.subWidth;
                           var43 = var33.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.xOffset;
                        }
                     }

                     Font var82 = var99.getFont();
                     if (var82 == null) {
                        var82 = class151.fontPlain11;
                     }

                     Font var44;
                     if (var95 != null) {
                        var44 = var95.getFont();
                        if (var44 == null) {
                           var44 = class151.fontPlain11;
                        }
                     } else {
                        var44 = class151.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var99.getString(var0.hitSplatValues[var77]);
                     int var96 = var82.stringWidth(var45);
                     if (var95 != null) {
                        var46 = var95.getString(var0.hitSplatValues2[var77]);
                        var48 = var44.stringWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var20 == null && var21 == null) {
                           var49 = 1;
                        } else {
                           var49 = var96 / var23 + 1;
                        }
                     }

                     if (var95 != null && var35 > 0) {
                        if (var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if (var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if (var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if (var23 > 0) {
                        var56 = var49 * var23;
                        var51 += var56;
                        var55 += (var56 - var96) / 2;
                     } else {
                        var51 += var96;
                     }

                     var56 = var51;
                     if (var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if (var95 != null) {
                        var51 += 2;
                        var57 = var51;
                        if (var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if (var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if (var35 > 0) {
                           var62 = var50 * var35;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if (var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.hitSplatCycles[var77] - Client.cycle;
                     int var63 = var99.field2142 - var62 * var99.field2142 / var99.field2132;
                     int var64 = var62 * var99.field2137 / var99.field2132 + -var99.field2137;
                     int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
                     int var66 = var3 + Client.viewportTempY - 12 + var64;
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var99.field2147 + 15;
                     int var70 = var69 - var82.maxAscent;
                     int var71 = var69 + var82.maxDescent;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var95 != null) {
                        var72 = var66 + var95.field2147 + 15;
                        var73 = var72 - var44.maxAscent;
                        var74 = var72 + var44.maxDescent;
                        if (var73 < var67) {
                           ;
                        }

                        if (var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if (var99.field2144 >= 0) {
                        var73 = (var62 << 8) / (var99.field2132 - var99.field2144);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var18 != null) {
                           var18.drawTransAt(var65 + var52 - var26, var66, var73);
                        }

                        if (var20 != null) {
                           var20.drawTransAt(var53 + var65 - var28, var66, var73);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransAt(var56 + var65 - var29, var66, var73);
                        }

                        var82.drawAlpha(var45, var55 + var65, var69, var99.textColor, 0, var73);
                        if (var95 != null) {
                           if (var30 != null) {
                              var30.drawTransAt(var57 + var65 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.drawTransAt(var58 + var65 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransAt(var60 + var65 - var41, var66, var73);
                           }

                           var44.drawAlpha(var46, var61 + var65, var72, var95.textColor, 0, var73);
                        }
                     } else {
                        if (var18 != null) {
                           var18.drawTransBgAt(var65 + var52 - var26, var66);
                        }

                        if (var20 != null) {
                           var20.drawTransBgAt(var53 + var65 - var28, var66);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransBgAt(var56 + var65 - var29, var66);
                        }

                        var82.draw(var45, var65 + var55, var69, var99.textColor | -16777216, 0);
                        if (var95 != null) {
                           if (var30 != null) {
                              var30.drawTransBgAt(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.drawTransBgAt(var65 + var58 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransBgAt(var60 + var65 - var41, var66);
                           }

                           var44.draw(var46, var65 + var61, var72, var95.textColor | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
