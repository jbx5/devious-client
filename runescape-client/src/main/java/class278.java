import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public final class class278 {
   @ObfuscatedName("tg")
   @ObfuscatedGetter(
      intValue = 112345088
   )
   static int field3264;
   @ObfuscatedName("c")
   static final HashMap field3260 = new HashMap();
   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;

   static {
      TimeZone var0;
      synchronized(field3260) {
         TimeZone var2 = (TimeZone)field3260.get("Europe/London");
         if (var2 == null) {
            var2 = TimeZone.getTimeZone("Europe/London");
            field3260.put("Europe/London", var2);
         }

         var0 = var2;
      }

      java.util.Calendar.getInstance(var0);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "951493136"
   )
   @Export("changeWorldSelectSorting")
   static void changeWorldSelectSorting(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (World.World_sortOption1[var5] != var0) {
            var2[var4] = World.World_sortOption1[var5];
            var3[var4] = World.World_sortOption2[var5];
            ++var4;
         }
      }

      World.World_sortOption1 = var2;
      World.World_sortOption2 = var3;
      class10.sortWorlds(class412.World_worlds, 0, class412.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Ljc;",
      garbageValue = "-685608574"
   )
   public static PacketBufferNode method5404() {
      PacketBufferNode var0 = WorldMapLabelSize.method4683();
      var0.clientPacket = null;
      var0.clientPacketLength = 0;
      var0.packetBuffer = new PacketBuffer(5000);
      return var0;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "([Lkn;IIIIIIIIB)V",
      garbageValue = "-38"
   )
   @Export("drawInterface")
   static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
            int var11;
            if (var8 == -1) {
               Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
               Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
               Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
               Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
               var11 = ++Client.rootWidgetCount - 1;
            } else {
               var11 = var8;
            }

            var10.rootIndex = var11;
            var10.cycle = Client.cycle;
            if (!var10.isIf3 || !class6.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  method5406(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     Script.field971 = var0;
                     class380.field4439 = var6;
                     SoundSystem.field332 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field684) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field603) {
                        var15 = Client.field603;
                     }

                     if (var15 + var10.width > Client.field603 + Client.clickedWidgetParent.width) {
                        var15 = Client.field603 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field686) {
                        var16 = Client.field686;
                     }

                     if (var16 + var10.height > Client.field686 + Client.clickedWidgetParent.height) {
                        var16 = Client.field686 + Client.clickedWidgetParent.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if (!var10.isScrollBar) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var10.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if (var10.type == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.width;
                  var22 = var13 + var10.height;
                  if (var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2 ? var19 : var2;
                  var16 = var20 > var3 ? var20 : var3;
                  var17 = var21 < var4 ? var21 : var4;
                  var18 = var22 < var5 ? var22 : var5;
               } else {
                  var19 = var12 + var10.width;
                  var20 = var13 + var10.height;
                  var15 = var12 > var2 ? var12 : var2;
                  var16 = var13 > var3 ? var13 : var3;
                  var17 = var19 < var4 ? var19 : var4;
                  var18 = var20 < var5 ? var20 : var5;
               }

               if (!var10.isIf3 || var15 < var17 && var16 < var18) {
                  if (var10.contentType != 0) {
                     if (var10.contentType == 1336) {
                        if (BufferedSink.clientPreferences.method2386()) {
                           var13 += 15;
                           Language.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var44 = Runtime.getRuntime();
                           var20 = (int)((var44.totalMemory() - var44.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           Language.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        class21.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field717[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        MenuAction.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        class108.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        class7.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        class7.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        GraphicsObject.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && class6.isComponentHidden(var10) && var10 != Occluder.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (!var10.isIf3) {
                        if (var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if (var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
                     if (var30 != null) {
                        class4444.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  } else if (var10.type == 11) {
                     if (class6.isComponentHidden(var10) && var10 != Occluder.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  }

                  if (Client.isResizable || Client.field657[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        ClientPreferences.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                     }

                     if (var10.type != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if (var10.type == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.rawHeight; ++var20) {
                              for(var21 = 0; var21 < var10.rawWidth; ++var21) {
                                 var22 = var12 + var21 * (var10.paddingX + 32);
                                 var23 = var13 + var20 * (var10.paddingY + 32);
                                 if (var19 < 20) {
                                    var22 += var10.inventoryXOffsets[var19];
                                    var23 += var10.inventoryYOffsets[var19];
                                 }

                                 if (var10.itemIds[var19] <= 0) {
                                    if (var10.inventorySprites != null && var19 < 20) {
                                       SpritePixels var49 = var10.getInventorySprite(var19);
                                       if (var49 != null) {
                                          var49.drawTransBgAt(var22, var23);
                                       } else if (Widget.field3479) {
                                          class143.invalidateWidget(var10);
                                       }
                                    }
                                 } else {
                                    boolean var38 = false;
                                    boolean var39 = false;
                                    var26 = var10.itemIds[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                       SpritePixels var36;
                                       if (Client.isItemSelected == 1 && var19 == class1.selectedItemSlot && var10.id == class230.selectedItemWidget) {
                                          var36 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                       } else {
                                          var36 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                       }

                                       if (var36 != null) {
                                          if (var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                             var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
                                             var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
                                             if (var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (Client.itemDragDuration < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var36.drawTransAt(var22 + var24, var23 + var25, 128);
                                             if (var1 != -1) {
                                                Widget var28 = var0[var1 & '\uffff'];
                                                int var29;
                                                if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
                                                   var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.graphicsCycle / 3;
                                                   if (var29 > Client.graphicsCycle * 10) {
                                                      var29 = Client.graphicsCycle * 10;
                                                   }

                                                   if (var29 > var28.scrollY) {
                                                      var29 = var28.scrollY;
                                                   }

                                                   var28.scrollY -= var29;
                                                   Client.draggedWidgetY += var29;
                                                   class143.invalidateWidget(var28);
                                                }

                                                if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
                                                   var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.graphicsCycle / 3;
                                                   if (var29 > Client.graphicsCycle * 10) {
                                                      var29 = Client.graphicsCycle * 10;
                                                   }

                                                   if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
                                                      var29 = var28.scrollHeight - var28.height - var28.scrollY;
                                                   }

                                                   var28.scrollY += var29;
                                                   Client.draggedWidgetY -= var29;
                                                   class143.invalidateWidget(var28);
                                                }
                                             }
                                          } else if (var10 == class133.field1575 && var19 == Client.field745) {
                                             var36.drawTransAt(var22, var23, 128);
                                          } else {
                                             var36.drawTransBgAt(var22, var23);
                                          }
                                       } else {
                                          class143.invalidateWidget(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.type == 3) {
                           if (MouseHandler.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch (var10.fillMode.field4947) {
                                 case 1:
                                    Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
                                    break;
                                 case 2:
                                    Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
                                    break;
                                 default:
                                    if (var14 == 0) {
                                       Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
                                    } else {
                                       Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                    }
                              }
                           } else if (var14 == 0) {
                              Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                           }
                        } else {
                           Font var40;
                           if (var10.type == 4) {
                              var40 = var10.getFont();
                              if (var40 == null) {
                                 if (Widget.field3479) {
                                    class143.invalidateWidget(var10);
                                 }
                              } else {
                                 String var46 = var10.text;
                                 if (MouseHandler.runCs1(var10)) {
                                    var20 = var10.color2;
                                    if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                       var20 = var10.mouseOverColor2;
                                    }

                                    if (var10.text2.length() > 0) {
                                       var46 = var10.text2;
                                    }
                                 } else {
                                    var20 = var10.color;
                                    if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                       var20 = var10.mouseOverColor;
                                    }
                                 }

                                 if (var10.isIf3 && var10.itemId != -1) {
                                    ItemComposition var47 = MidiPcmStream.ItemDefinition_get(var10.itemId);
                                    var46 = var47.name;
                                    if (var46 == null) {
                                       var46 = "null";
                                    }

                                    if ((var47.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var46 = GameObject.colorStartTag(16748608) + var46 + "</col>" + " " + 'x' + class28.formatItemStacks(var10.itemQuantity);
                                    }
                                 }

                                 if (var10 == Client.meslayerContinueWidget) {
                                    var46 = "Please wait...";
                                    var20 = var10.color;
                                 }

                                 if (!var10.isIf3) {
                                    var46 = Canvas.method319(var46, var10);
                                 }

                                 var40.drawLines(var46, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                              }
                           } else if (var10.type == 5) {
                              SpritePixels var42;
                              if (!var10.isIf3) {
                                 var42 = var10.getSprite(MouseHandler.runCs1(var10), PcmPlayer.urlRequester);
                                 if (var42 != null) {
                                    var42.drawTransBgAt(var12, var13);
                                 } else if (Widget.field3479) {
                                    class143.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var42 = ChatChannel.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var42 = var10.getSprite(false, PcmPlayer.urlRequester);
                                 }

                                 if (var42 == null) {
                                    if (Widget.field3479) {
                                       class143.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var42.width;
                                    var21 = var42.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var42.method8854(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
                                       } else if (var14 != 0) {
                                          var42.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if (var20 == var10.width && var21 == var10.height) {
                                          var42.drawTransBgAt(var12, var13);
                                       } else {
                                          var42.drawScaledAt(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.spriteAngle != 0) {
                                                var42.method8854(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var42.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var42.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemComposition var33;
                              if (var10.type == 6) {
                                 boolean var37 = MouseHandler.runCs1(var10);
                                 if (var37) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var43 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    var33 = MidiPcmStream.ItemDefinition_get(var10.itemId);
                                    if (var33 != null) {
                                       var33 = var33.getCountObj(var10.itemQuantity);
                                       var43 = var33.getModel(1);
                                       if (var43 != null) {
                                          var43.calculateBoundsCylinder();
                                          var22 = var43.height / 2;
                                       } else {
                                          class143.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var43 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var43 = class296.localPlayer.getModel();
                                    }
                                 } else if (var20 == -1) {
                                    var43 = var10.getModel((SequenceDefinition)null, -1, var37, class296.localPlayer.appearance);
                                    if (var43 == null && Widget.field3479) {
                                       class143.invalidateWidget(var10);
                                    }
                                 } else {
                                    SequenceDefinition var48 = WorldMapElement.SequenceDefinition_get(var20);
                                    var43 = var10.getModel(var48, var10.modelFrame, var37, class296.localPlayer.appearance);
                                    if (var43 == null && Widget.field3479) {
                                       class143.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method4192(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var43 != null) {
                                    if (!var10.isIf3) {
                                       var43.method4590(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var43.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var43.method4512(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var43.method4590(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 if (var10.type == 7) {
                                    var40 = var10.getFont();
                                    if (var40 == null) {
                                       if (Widget.field3479) {
                                          class143.invalidateWidget(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.rawHeight; ++var21) {
                                       for(var22 = 0; var22 < var10.rawWidth; ++var22) {
                                          if (var10.itemIds[var20] > 0) {
                                             var33 = MidiPcmStream.ItemDefinition_get(var10.itemIds[var20] - 1);
                                             String var35;
                                             if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
                                                var35 = GameObject.colorStartTag(16748608) + var33.name + "</col>";
                                             } else {
                                                var35 = GameObject.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + class28.formatItemStacks(var10.itemQuantities[var20]);
                                             }

                                             var25 = var12 + var22 * (var10.paddingX + 115);
                                             var26 = (var10.paddingY + 12) * var21 + var13;
                                             if (var10.textXAlignment == 0) {
                                                var40.draw(var35, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else if (var10.textXAlignment == 1) {
                                                var40.drawCentered(var35, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else {
                                                var40.drawRightAligned(var35, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 Font var31;
                                 if (var10.type == 8 && var10 == Occluder.field2556 && Client.field786 == Client.field527) {
                                    var19 = 0;
                                    var20 = 0;
                                    var31 = Language.fontPlain12;
                                    String var32 = var10.text;

                                    String var45;
                                    for(var32 = Canvas.method319(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
                                       var24 = var32.indexOf("<br>");
                                       if (var24 != -1) {
                                          var45 = var32.substring(0, var24);
                                          var32 = var32.substring(var24 + 4);
                                       } else {
                                          var45 = var32;
                                          var32 = "";
                                       }

                                       var25 = var31.stringWidth(var45);
                                       if (var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.width - 5 - var19;
                                    var25 = var13 + var10.height + 5;
                                    if (var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if (var24 + var19 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if (var20 + var25 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
                                    var32 = var10.text;
                                    var26 = var25 + var31.ascent + 2;

                                    for(var32 = Canvas.method319(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
                                       int var27 = var32.indexOf("<br>");
                                       if (var27 != -1) {
                                          var45 = var32.substring(0, var27);
                                          var32 = var32.substring(var27 + 4);
                                       } else {
                                          var45 = var32;
                                          var32 = "";
                                       }

                                       var31.draw(var45, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.type == 9) {
                                    if (var10.field3515) {
                                       var19 = var12;
                                       var20 = var13 + var10.height;
                                       var21 = var12 + var10.width;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.width;
                                       var22 = var13 + var10.height;
                                    }

                                    if (var10.lineWid == 1) {
                                       Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
                                    } else {
                                       Friend.method7293(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 } else if (var10.type == 12) {
                                    class300 var41 = var10.method6076();
                                    class295 var34 = var10.method6153();
                                    if (var41 != null && var34 != null && var41.method5906()) {
                                       var31 = var10.getFont();
                                       if (var31 != null) {
                                          Client.field709.method8980(var12, var13, var10.width, var10.height, var41.method5824(), var41.method5892(), 0, 0, var41.method5821(), var41.method5898(), var41.method5820());
                                          var22 = var10.textShadowed ? var10.spriteShadow : -1;
                                          if (!var41.method5800() && var41.method5962().method6883()) {
                                             Client.field709.method8981(var34.field3400, var22, var34.field3399, var34.field3401);
                                             Client.field709.method8979(var41.method5816(), var31);
                                          } else {
                                             Client.field709.method8981(var10.color, var22, var34.field3399, var34.field3401);
                                             Client.field709.method8979(var41.method5962(), var31);
                                          }

                                          Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
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
         }
      }

   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)V",
      garbageValue = "-305440002"
   )
   static final void method5406(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field539 == -1) {
            Client.field539 = var0.spriteId2;
            Client.field543 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field539;
         } else {
            var0.spriteId2 = Client.field543;
         }

      } else if (var1 == 325) {
         if (Client.field539 == -1) {
            Client.field539 = var0.spriteId2;
            Client.field543 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field543;
         } else {
            var0.spriteId2 = Client.field539;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }
}
