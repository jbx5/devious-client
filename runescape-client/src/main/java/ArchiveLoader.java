import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ArchiveLoader")
public class ArchiveLoader {
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   static IndexedSprite field1017;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive")
   final Archive archive;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1881935603
   )
   @Export("groupCount")
   final int groupCount;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -533081883
   )
   @Export("loadedCount")
   int loadedCount = 0;

   @ObfuscatedSignature(
      descriptor = "(Lmx;Ljava/lang/String;)V"
   )
   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2011929420"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      this.loadedCount = 0;

      for(int var1 = 0; var1 < this.groupCount; ++var1) {
         if (!this.archive.method6393(var1) || this.archive.method6422(var1)) {
            ++this.loadedCount;
         }
      }

      return this.loadedCount >= this.groupCount;
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(Ldq;IIIIII)V",
      garbageValue = "16777215"
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
         boolean var8 = var1 < var75;
         int var9 = -2;
         if (var0.overheadText != null && (!var8 || !var0.field1161 && (Client.publicChatMode == 4 || !var0.field1160 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            PendingSpawn.method2355(var0, var0.defaultHeight);
            if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
               Client.overheadTextXOffsets[Client.overheadTextCount] = class7.fontBold12.stringWidth(var0.overheadText) / 2;
               Client.overheadTextAscents[Client.overheadTextCount] = class7.fontBold12.ascent;
               Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
               Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
               Client.overheadTextColors[Client.overheadTextCount] = var0.field1163;
               Client.overheadTextEffects[Client.overheadTextCount] = var0.field1156;
               Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadText[Client.overheadTextCount] = var0.overheadText;
               ++Client.overheadTextCount;
               var9 += 12;
            }
         }

         int var15;
         int var22;
         int var23;
         if (!var0.healthBars.method6738()) {
            PendingSpawn.method2355(var0, var0.defaultHeight + 15);

            for(HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
               HealthBarUpdate var11 = var10.get(Client.cycle);
               if (var11 == null) {
                  if (var10.isEmpty()) {
                     var10.remove();
                  }
               } else {
                  HealthBarDefinition var12 = var10.definition;
                  SpritePixels var79 = var12.getBackSprite();
                  SpritePixels var83 = var12.getFrontSprite();
                  int var84 = 0;
                  if (var79 != null && var83 != null) {
                     if (var12.widthPadding * 2 < var83.subWidth) {
                        var84 = var12.widthPadding;
                     }

                     var15 = var83.subWidth - var84 * 2;
                  } else {
                     var15 = var12.width;
                  }

                  int var81 = 255;
                  boolean var85 = true;
                  int var86 = Client.cycle - var11.cycle;
                  int var87 = var15 * var11.health2 / var12.width;
                  int var88;
                  int var98;
                  if (var11.cycleOffset > var86) {
                     var88 = var12.field1942 == 0 ? 0 : var12.field1942 * (var86 / var12.field1942);
                     var22 = var15 * var11.health / var12.width;
                     var98 = var88 * (var87 - var22) / var11.cycleOffset + var22;
                  } else {
                     var98 = var87;
                     var88 = var12.int5 + var11.cycleOffset - var86;
                     if (var12.int3 >= 0) {
                        var81 = (var88 << 8) / (var12.int5 - var12.int3);
                     }
                  }

                  if (var11.health2 > 0 && var98 < 1) {
                     var98 = 1;
                  }

                  if (var79 != null && var83 != null) {
                     if (var15 == var98) {
                        var98 += var84 * 2;
                     } else {
                        var98 += var84;
                     }

                     var88 = var79.subHeight;
                     var9 += var88;
                     var22 = var2 + Client.viewportTempX - (var15 >> 1);
                     var23 = var3 + Client.viewportTempY - var9;
                     var22 -= var84;
                     if (var81 >= 0 && var81 < 255) {
                        var79.drawTransAt(var22, var23, var81);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88);
                        var83.drawTransAt(var22, var23, var81);
                     } else {
                        var79.drawTransBgAt(var22, var23);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88);
                        var83.drawTransBgAt(var22, var23);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
                     var9 += 2;
                  } else {
                     var9 += 5;
                     if (Client.viewportTempX > -1) {
                        var88 = var2 + Client.viewportTempX - (var15 >> 1);
                        var22 = var3 + Client.viewportTempY - var9;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680);
                     }

                     var9 += 2;
                  }
               }
            }
         }

         if (var9 == -2) {
            var9 += 7;
         }

         Player var89;
         if (var8 && var0.playerCycle == Client.cycle && SoundCache.method853((Player)var0)) {
            var89 = (Player)var0;
            if (var8) {
               PendingSpawn.method2355(var0, var0.defaultHeight + 15);
               AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
               var9 += 4;
               var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
               var9 += 18;
            }
         }

         if (var8) {
            var89 = (Player)var0;
            if (var89.isHidden) {
               return;
            }

            if (var89.headIconPk != -1 || var89.headIconPrayer != -1) {
               PendingSpawn.method2355(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  if (var89.headIconPk != -1) {
                     var9 += 25;
                     class315.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }

                  if (var89.headIconPrayer != -1) {
                     var9 += 25;
                     class287.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }
               }
            }

            if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
               PendingSpawn.method2355(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  var9 += EnumComposition.headIconHintSprites[1].subHeight;
                  EnumComposition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
               }
            }
         } else {
            NPC var91 = (NPC)var0;
            int[] var92 = var91.method2560();
            short[] var93 = var91.method2561();
            if (var93 != null && var92 != null) {
               for(int var13 = 0; var13 < var93.length; ++var13) {
                  if (var93[var13] >= 0 && var92[var13] >= 0) {
                     long var14 = (long)var92[var13] << 8 | (long)var93[var13];
                     SpritePixels var16 = (SpritePixels)Client.archive5.method7414(var14);
                     if (var16 == null) {
                        SpritePixels[] var17 = class70.method2046(class143.archive8, var92[var13], 0);
                        if (var17 != null && var93[var13] < var17.length) {
                           var16 = var17[var93[var13]];
                           Client.archive5.method7427(var14, var16);
                        }
                     }

                     if (var16 != null) {
                        PendingSpawn.method2355(var0, var0.defaultHeight + 15);
                        if (Client.viewportTempX > -1) {
                           var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
                        }
                     }
                  }
               }
            }

            if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
               PendingSpawn.method2355(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  EnumComposition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
               }
            }
         }

         for(int var76 = 0; var76 < 4; ++var76) {
            int var77 = var0.hitSplatCycles[var76];
            int var78 = var0.hitSplatTypes[var76];
            HitSplatDefinition var96 = null;
            int var80 = 0;
            if (var78 >= 0) {
               if (var77 <= Client.cycle) {
                  continue;
               }

               var96 = NewStuff.method3664(var0.hitSplatTypes[var76]);
               var80 = var96.field2107;
               if (var96 != null && var96.transforms != null) {
                  var96 = var96.transform();
                  if (var96 == null) {
                     var0.hitSplatCycles[var76] = -1;
                     continue;
                  }
               }
            } else if (var77 < 0) {
               continue;
            }

            var15 = var0.hitSplatTypes2[var76];
            HitSplatDefinition var94 = null;
            if (var15 >= 0) {
               var94 = NewStuff.method3664(var15);
               if (var94 != null && var94.transforms != null) {
                  var94 = var94.transform();
               }
            }

            if (var77 - var80 <= Client.cycle) {
               if (var96 == null) {
                  var0.hitSplatCycles[var76] = -1;
               } else {
                  PendingSpawn.method2355(var0, var0.defaultHeight / 2);
                  if (Client.viewportTempX > -1) {
                     boolean var97 = true;
                     if (var76 == 1) {
                        Client.viewportTempY -= 20;
                     }

                     if (var76 == 2) {
                        Client.viewportTempX -= 15;
                        Client.viewportTempY -= 10;
                     }

                     if (var76 == 3) {
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
                     var18 = var96.method3853();
                     int var43;
                     if (var18 != null) {
                        var22 = var18.subWidth;
                        var43 = var18.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var18.xOffset;
                     }

                     var19 = var96.method3833();
                     if (var19 != null) {
                        var23 = var19.subWidth;
                        var43 = var19.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var19.xOffset;
                     }

                     var20 = var96.method3828();
                     if (var20 != null) {
                        var24 = var20.subWidth;
                        var43 = var20.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var20.xOffset;
                     }

                     var21 = var96.method3829();
                     if (var21 != null) {
                        var25 = var21.subWidth;
                        var43 = var21.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var21.xOffset;
                     }

                     if (var94 != null) {
                        var30 = var94.method3853();
                        if (var30 != null) {
                           var34 = var30.subWidth;
                           var43 = var30.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.xOffset;
                        }

                        var31 = var94.method3833();
                        if (var31 != null) {
                           var35 = var31.subWidth;
                           var43 = var31.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.xOffset;
                        }

                        var32 = var94.method3828();
                        if (var32 != null) {
                           var36 = var32.subWidth;
                           var43 = var32.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.xOffset;
                        }

                        var33 = var94.method3829();
                        if (var33 != null) {
                           var37 = var33.subWidth;
                           var43 = var33.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.xOffset;
                        }
                     }

                     Font var82 = var96.getFont();
                     if (var82 == null) {
                        var82 = Calendar.fontPlain11;
                     }

                     Font var44;
                     if (var94 != null) {
                        var44 = var94.getFont();
                        if (var44 == null) {
                           var44 = Calendar.fontPlain11;
                        }
                     } else {
                        var44 = Calendar.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var96.getString(var0.hitSplatValues[var76]);
                     int var95 = var82.stringWidth(var45);
                     if (var94 != null) {
                        var46 = var94.getString(var0.hitSplatValues2[var76]);
                        var48 = var44.stringWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var20 == null && var21 == null) {
                           var49 = 1;
                        } else {
                           var49 = var95 / var23 + 1;
                        }
                     }

                     if (var94 != null && var35 > 0) {
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
                        var56 = var23 * var49;
                        var51 += var56;
                        var55 += (var56 - var95) / 2;
                     } else {
                        var51 += var95;
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
                     if (var94 != null) {
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
                           var62 = var35 * var50;
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

                     var62 = var0.hitSplatCycles[var76] - Client.cycle;
                     int var63 = var96.field2112 - var62 * var96.field2112 / var96.field2107;
                     int var64 = var62 * var96.field2122 / var96.field2107 + -var96.field2122;
                     int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.viewportTempY - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var96.field2106 + 15;
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
                     if (var94 != null) {
                        var72 = var66 + var94.field2106 + 15;
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
                     if (var96.field2114 >= 0) {
                        var73 = (var62 << 8) / (var96.field2107 - var96.field2114);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var18 != null) {
                           var18.drawTransAt(var52 + var65 - var26, var66, var73);
                        }

                        if (var20 != null) {
                           var20.drawTransAt(var53 + var65 - var28, var66, var73);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransAt(var56 + var65 - var29, var66, var73);
                        }

                        var82.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73);
                        if (var94 != null) {
                           if (var30 != null) {
                              var30.drawTransAt(var65 + var57 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.drawTransAt(var65 + var58 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransAt(var60 + var65 - var41, var66, var73);
                           }

                           var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73);
                        }
                     } else {
                        if (var18 != null) {
                           var18.drawTransBgAt(var65 + var52 - var26, var66);
                        }

                        if (var20 != null) {
                           var20.drawTransBgAt(var65 + var53 - var28, var66);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransBgAt(var65 + var56 - var29, var66);
                        }

                        var82.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0);
                        if (var94 != null) {
                           if (var30 != null) {
                              var30.drawTransBgAt(var65 + var57 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.drawTransBgAt(var65 + var58 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransBgAt(var65 + var60 - var41, var66);
                           }

                           var44.draw(var46, var61 + var65, var72, var94.textColor | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
