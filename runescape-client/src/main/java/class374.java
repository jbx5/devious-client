import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class374 {
   @ObfuscatedName("f")
   public char field4411;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1789311753
   )
   public int field4408 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1330423029
   )
   public int field4410 = 0;

   class374() {
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "115"
   )
   static final void method7187() {
      if (WorldMapSectionType.ClanChat_inClanChat) {
         if (class463.friendsChat != null) {
            class463.friendsChat.sort();
         }

         PacketBufferNode.method5557();
         WorldMapSectionType.ClanChat_inClanChat = false;
      }

   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(Lcb;IIIIII)V",
      garbageValue = "1942155419"
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
         if (var0.overheadText != null && (!var8 || !var0.field1166 && (Client.publicChatMode == 4 || !var0.field1181 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            class31.method468(var0, var0.defaultHeight);
            if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
               Client.overheadTextXOffsets[Client.overheadTextCount] = class19.fontBold12.stringWidth(var0.overheadText) / 2;
               Client.overheadTextAscents[Client.overheadTextCount] = class19.fontBold12.ascent;
               Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
               Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
               Client.overheadTextColors[Client.overheadTextCount] = var0.field1161;
               Client.overheadTextEffects[Client.overheadTextCount] = var0.field1185;
               Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadText[Client.overheadTextCount] = var0.overheadText;
               ++Client.overheadTextCount;
               var9 += 12;
            }
         }

         int var15;
         int var22;
         int var23;
         if (!var0.healthBars.method6900()) {
            class31.method468(var0, var0.defaultHeight + 15);

            for(HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
               HealthBarUpdate var11 = var10.get(Client.cycle);
               if (var11 == null) {
                  if (var10.isEmpty()) {
                     var10.remove();
                  }
               } else {
                  HealthBarDefinition var77 = var10.definition;
                  SpritePixels var78 = var77.getBackSprite();
                  SpritePixels var84 = var77.getFrontSprite();
                  int var85 = 0;
                  if (var78 != null && var84 != null) {
                     if (var77.widthPadding * 2 < var84.subWidth) {
                        var85 = var77.widthPadding;
                     }

                     var15 = var84.subWidth - var85 * 2;
                  } else {
                     var15 = var77.width;
                  }

                  int var82 = 255;
                  boolean var86 = true;
                  int var87 = Client.cycle - var11.cycle;
                  int var88 = var15 * var11.health2 / var77.width;
                  int var89;
                  int var105;
                  if (var11.cycleOffset > var87) {
                     var89 = var77.field1984 == 0 ? 0 : var77.field1984 * (var87 / var77.field1984);
                     var22 = var15 * var11.health / var77.width;
                     var105 = var89 * (var88 - var22) / var11.cycleOffset + var22;
                  } else {
                     var105 = var88;
                     var89 = var77.int5 + var11.cycleOffset - var87;
                     if (var77.int3 >= 0) {
                        var82 = (var89 << 8) / (var77.int5 - var77.int3);
                     }
                  }

                  if (var11.health2 > 0 && var105 < 1) {
                     var105 = 1;
                  }

                  if (var78 != null && var84 != null) {
                     if (var15 == var105) {
                        var105 += var85 * 2;
                     } else {
                        var105 += var85;
                     }

                     var89 = var78.subHeight;
                     var9 += var89;
                     var22 = var2 + Client.viewportTempX - (var15 >> 1);
                     var23 = var3 + Client.viewportTempY - var9;
                     var22 -= var85;
                     if (var82 >= 0 && var82 < 255) {
                        var78.drawTransAt(var22, var23, var82);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var89 + var23);
                        var84.drawTransAt(var22, var23, var82);
                     } else {
                        var78.drawTransBgAt(var22, var23);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var23 + var89);
                        var84.drawTransBgAt(var22, var23);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
                     var9 += 2;
                  } else {
                     var9 += 5;
                     if (Client.viewportTempX > -1) {
                        var89 = var2 + Client.viewportTempX - (var15 >> 1);
                        var22 = var3 + Client.viewportTempY - var9;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var89, var22, var105, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var105 + var89, var22, var15 - var105, 5, 16711680);
                     }

                     var9 += 2;
                  }
               }
            }
         }

         if (var9 == -2) {
            var9 += 7;
         }

         if (var8 && var0.playerCycle == Client.cycle) {
            Player var92 = (Player)var0;
            boolean var76;
            if (Client.drawPlayerNames == 0) {
               var76 = false;
            } else if (var92 == class387.localPlayer) {
               var76 = BuddyRankComparator.method2958();
            } else {
               boolean var12 = DirectByteArrayCopier.method6408();
               boolean var13;
               if (!var12) {
                  var13 = (Client.drawPlayerNames & 1) != 0;
                  var12 = var13 && var92.isFriend();
               }

               var13 = var12;
               if (!var12) {
                  boolean var14 = (Client.drawPlayerNames & 2) != 0;
                  var13 = var14 && var92.isFriendsChatMember();
               }

               var76 = var13;
            }

            if (var76) {
               Player var99 = (Player)var0;
               if (var8) {
                  class31.method468(var0, var0.defaultHeight + 15);
                  AbstractFont var102 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
                  var9 += 4;
                  var102.drawCentered(var99.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
                  var9 += 18;
               }
            }
         }

         if (var8) {
            Player var90 = (Player)var0;
            if (var90.isHidden) {
               return;
            }

            if (var90.headIconPk != -1 || var90.headIconPrayer != -1) {
               class31.method468(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  if (var90.headIconPk != -1) {
                     var9 += 25;
                     ClanChannel.headIconPkSprites[var90.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }

                  if (var90.headIconPrayer != -1) {
                     var9 += 25;
                     class367.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }
               }
            }

            if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
               class31.method468(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  var9 += WorldMapSectionType.headIconHintSprites[1].subHeight;
                  WorldMapSectionType.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
               }
            }
         } else {
            NPC var91 = (NPC)var0;
            int[] var93 = var91.method2655();
            short[] var101 = var91.method2643();
            if (var101 != null && var93 != null) {
               for(int var95 = 0; var95 < var101.length; ++var95) {
                  if (var101[var95] >= 0 && var93[var95] >= 0) {
                     long var79 = (long)var93[var95] << 8 | (long)var101[var95];
                     SpritePixels var16 = (SpritePixels)Client.archive5.method7483(var79);
                     if (var16 == null) {
                        SpritePixels[] var17 = AABB.method4629(WorldMapEvent.archive8, var93[var95], 0);
                        if (var17 != null && var101[var95] < var17.length) {
                           var16 = var17[var101[var95]];
                           Client.archive5.method7484(var79, var16);
                        }
                     }

                     if (var16 != null) {
                        class31.method468(var0, var0.defaultHeight + 15);
                        if (Client.viewportTempX > -1) {
                           var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
                        }
                     }
                  }
               }
            }

            if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
               class31.method468(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  WorldMapSectionType.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
               }
            }
         }

         for(int var100 = 0; var100 < 4; ++var100) {
            int var81 = var0.hitSplatCycles[var100];
            int var94 = var0.hitSplatTypes[var100];
            HitSplatDefinition var103 = null;
            int var96 = 0;
            if (var94 >= 0) {
               if (var81 <= Client.cycle) {
                  continue;
               }

               var103 = ChatChannel.method2224(var0.hitSplatTypes[var100]);
               var96 = var103.field2142;
               if (var103 != null && var103.transforms != null) {
                  var103 = var103.transform();
                  if (var103 == null) {
                     var0.hitSplatCycles[var100] = -1;
                     continue;
                  }
               }
            } else if (var81 < 0) {
               continue;
            }

            var15 = var0.hitSplatTypes2[var100];
            HitSplatDefinition var97 = null;
            if (var15 >= 0) {
               var97 = ChatChannel.method2224(var15);
               if (var97 != null && var97.transforms != null) {
                  var97 = var97.transform();
               }
            }

            if (var81 - var96 <= Client.cycle) {
               if (var103 == null) {
                  var0.hitSplatCycles[var100] = -1;
               } else {
                  class31.method468(var0, var0.defaultHeight / 2);
                  if (Client.viewportTempX > -1) {
                     boolean var104 = true;
                     if (var100 == 1) {
                        Client.viewportTempY -= 20;
                     }

                     if (var100 == 2) {
                        Client.viewportTempX -= 15;
                        Client.viewportTempY -= 10;
                     }

                     if (var100 == 3) {
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
                     var18 = var103.method3877();
                     int var43;
                     if (var18 != null) {
                        var22 = var18.subWidth;
                        var43 = var18.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var18.xOffset;
                     }

                     var19 = var103.method3879();
                     if (var19 != null) {
                        var23 = var19.subWidth;
                        var43 = var19.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var19.xOffset;
                     }

                     var20 = var103.method3884();
                     if (var20 != null) {
                        var24 = var20.subWidth;
                        var43 = var20.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var20.xOffset;
                     }

                     var21 = var103.method3875();
                     if (var21 != null) {
                        var25 = var21.subWidth;
                        var43 = var21.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var21.xOffset;
                     }

                     if (var97 != null) {
                        var30 = var97.method3877();
                        if (var30 != null) {
                           var34 = var30.subWidth;
                           var43 = var30.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.xOffset;
                        }

                        var31 = var97.method3879();
                        if (var31 != null) {
                           var35 = var31.subWidth;
                           var43 = var31.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.xOffset;
                        }

                        var32 = var97.method3884();
                        if (var32 != null) {
                           var36 = var32.subWidth;
                           var43 = var32.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.xOffset;
                        }

                        var33 = var97.method3875();
                        if (var33 != null) {
                           var37 = var33.subWidth;
                           var43 = var33.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.xOffset;
                        }
                     }

                     Font var83 = var103.getFont();
                     if (var83 == null) {
                        var83 = class276.fontPlain11;
                     }

                     Font var44;
                     if (var97 != null) {
                        var44 = var97.getFont();
                        if (var44 == null) {
                           var44 = class276.fontPlain11;
                        }
                     } else {
                        var44 = class276.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var103.getString(var0.hitSplatValues[var100]);
                     int var98 = var83.stringWidth(var45);
                     if (var97 != null) {
                        var46 = var97.getString(var0.hitSplatValues2[var100]);
                        var48 = var44.stringWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var20 == null && var21 == null) {
                           var49 = 1;
                        } else {
                           var49 = var98 / var23 + 1;
                        }
                     }

                     if (var97 != null && var35 > 0) {
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
                        var55 += (var56 - var98) / 2;
                     } else {
                        var51 += var98;
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
                     if (var97 != null) {
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

                     var62 = var0.hitSplatCycles[var100] - Client.cycle;
                     int var63 = var103.field2141 - var62 * var103.field2141 / var103.field2142;
                     int var64 = var62 * var103.field2148 / var103.field2142 + -var103.field2148;
                     int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.viewportTempY - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var103.field2146 + 15;
                     int var70 = var69 - var83.maxAscent;
                     int var71 = var69 + var83.maxDescent;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var97 != null) {
                        var72 = var66 + var97.field2146 + 15;
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
                     if (var103.field2143 >= 0) {
                        var73 = (var62 << 8) / (var103.field2142 - var103.field2143);
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
                              var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransAt(var56 + var65 - var29, var66, var73);
                        }

                        var83.drawAlpha(var45, var65 + var55, var69, var103.textColor, 0, var73);
                        if (var97 != null) {
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

                           var44.drawAlpha(var46, var65 + var61, var72, var97.textColor, 0, var73);
                        }
                     } else {
                        if (var18 != null) {
                           var18.drawTransBgAt(var52 + var65 - var26, var66);
                        }

                        if (var20 != null) {
                           var20.drawTransBgAt(var53 + var65 - var28, var66);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransBgAt(var65 + var56 - var29, var66);
                        }

                        var83.draw(var45, var65 + var55, var69, var103.textColor | -16777216, 0);
                        if (var97 != null) {
                           if (var30 != null) {
                              var30.drawTransBgAt(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.drawTransBgAt(var65 + var58 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransBgAt(var60 + var65 - var41, var66);
                           }

                           var44.draw(var46, var61 + var65, var72, var97.textColor | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "([Lkz;IIIZI)V",
      garbageValue = "2029451863"
   )
   @Export("resizeInterface")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            Client.alignWidgetSize(var6, var2, var3, var4);
            Client.alignWidgetPosition(var6, var2, var3);
            if (var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if (var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if (var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if (var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if (var6.type == 0) {
               AbstractWorldMapData.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }
}
