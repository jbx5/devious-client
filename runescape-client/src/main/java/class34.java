import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class34 {
   @ObfuscatedName("te")
   @ObfuscatedGetter(
      intValue = -1813982848
   )
   static int field208;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -307686371
   )
   public static int field205;
   @ObfuscatedName("ga")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("HitSplatDefinition_cached")
   static class451 HitSplatDefinition_cached;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1855727059
   )
   int field200;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1617185935
   )
   int field202;

   class34(int var1, int var2) {
      this.field200 = var1;
      this.field202 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lav;I)Z",
      garbageValue = "-30387471"
   )
   boolean method487(class30 var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field200) {
            case 1:
               return var1.vmethod4138(this.field202);
            case 2:
               return var1.vmethod4099(this.field202);
            case 3:
               return var1.vmethod4097((char)this.field202);
            case 4:
               return var1.vmethod4102(this.field202 == 1);
            default:
               return false;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Ldz;",
      garbageValue = "-1802972375"
   )
   static class127 method490(int var0) {
      class127 var1 = (class127)World.findEnumerated(class182.method3636(), var0);
      if (var1 == null) {
         var1 = class127.field1589;
      }

      return var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "27440"
   )
   public static void method489() {
      PlayerComposition.PlayerAppearance_cachedModels.clear();
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-303589538"
   )
   static final void method485() {
      Scene.Scene_isLowDetail = false;
      Client.isLowDetail = false;
   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1908709885"
   )
   static String method491(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
      }
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "([Lkd;IIIIIIIIB)V",
      garbageValue = "-10"
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
            if (!var10.isIf3 || !FriendSystem.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  class413.method7860(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     MouseHandler.field268 = var0;
                     class142.field1691 = var6;
                     HealthBarDefinition.field1989 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field745) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field699) {
                        var15 = Client.field699;
                     }

                     if (var15 + var10.width > Client.field699 + Client.clickedWidgetParent.width) {
                        var15 = Client.field699 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field613) {
                        var16 = Client.field613;
                     }

                     if (var16 + var10.height > Client.field613 + Client.clickedWidgetParent.height) {
                        var16 = Client.field613 + Client.clickedWidgetParent.height - var10.height;
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
                        if (StructComposition.clientPreferences.method2419()) {
                           var13 += 15;
                           AbstractWorldMapData.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var46 = Runtime.getRuntime();
                           var20 = (int)((var46.totalMemory() - var46.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           AbstractWorldMapData.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        Projectile.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field731[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        Player.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        SoundCache.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        KitDefinition.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        KitDefinition.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        class154.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && FriendSystem.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) {
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
                        HealthBar.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  } else if (var10.type == 11) {
                     if (FriendSystem.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  }

                  if (Client.isResizable || Client.field733[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        Interpreter.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
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
                                       SpritePixels var52 = var10.getInventorySprite(var19);
                                       if (var52 != null) {
                                          var52.drawTransBgAt(var22, var23);
                                       } else if (Widget.field3539) {
                                          class69.invalidateWidget(var10);
                                       }
                                    }
                                 } else {
                                    boolean var40 = false;
                                    boolean var41 = false;
                                    var26 = var10.itemIds[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class368.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                       SpritePixels var38;
                                       if (Client.isItemSelected == 1 && var19 == class101.selectedItemSlot && var10.id == ModeWhere.selectedItemWidget) {
                                          var38 = class200.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                       } else {
                                          var38 = class200.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                       }

                                       if (var38 != null) {
                                          if (var10 == class368.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
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

                                             var38.drawTransAt(var22 + var24, var25 + var23, 128);
                                             if (var1 != -1) {
                                                Widget var28 = var0[var1 & '\uffff'];
                                                int var29;
                                                if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
                                                   var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.graphicsCycle / 3;
                                                   if (var29 > Client.graphicsCycle * 10) {
                                                      var29 = Client.graphicsCycle * 10;
                                                   }

                                                   if (var29 > var28.scrollY) {
                                                      var29 = var28.scrollY;
                                                   }

                                                   var28.scrollY -= var29;
                                                   Client.draggedWidgetY += var29;
                                                   class69.invalidateWidget(var28);
                                                }

                                                if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
                                                   var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.graphicsCycle / 3;
                                                   if (var29 > Client.graphicsCycle * 10) {
                                                      var29 = Client.graphicsCycle * 10;
                                                   }

                                                   if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
                                                      var29 = var28.scrollHeight - var28.height - var28.scrollY;
                                                   }

                                                   var28.scrollY += var29;
                                                   Client.draggedWidgetY -= var29;
                                                   class69.invalidateWidget(var28);
                                                }
                                             }
                                          } else if (var10 == MusicPatchPcmStream.field3411 && var19 == Client.field625) {
                                             var38.drawTransAt(var22, var23, 128);
                                          } else {
                                             var38.drawTransBgAt(var22, var23);
                                          }
                                       } else {
                                          class69.invalidateWidget(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.type == 3) {
                           if (KeyHandler.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch (var10.fillMode.field4995) {
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
                           Font var42;
                           if (var10.type == 4) {
                              var42 = var10.getFont();
                              if (var42 == null) {
                                 if (Widget.field3539) {
                                    class69.invalidateWidget(var10);
                                 }
                              } else {
                                 String var48 = var10.text;
                                 if (KeyHandler.runCs1(var10)) {
                                    var20 = var10.color2;
                                    if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                       var20 = var10.mouseOverColor2;
                                    }

                                    if (var10.text2.length() > 0) {
                                       var48 = var10.text2;
                                    }
                                 } else {
                                    var20 = var10.color;
                                    if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                       var20 = var10.mouseOverColor;
                                    }
                                 }

                                 if (var10.isIf3 && var10.itemId != -1) {
                                    ItemComposition var49 = NPCComposition.ItemDefinition_get(var10.itemId);
                                    var48 = var49.name;
                                    if (var48 == null) {
                                       var48 = "null";
                                    }

                                    if ((var49.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var48 = MouseRecorder.colorStartTag(16748608) + var48 + "</col>" + " " + 'x' + FontName.formatItemStacks(var10.itemQuantity);
                                    }
                                 }

                                 if (var10 == Client.meslayerContinueWidget) {
                                    var48 = "Please wait...";
                                    var20 = var10.color;
                                 }

                                 if (!var10.isIf3) {
                                    var48 = HealthBarDefinition.method3622(var48, var10);
                                 }

                                 var42.drawLines(var48, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                              }
                           } else if (var10.type == 5) {
                              SpritePixels var44;
                              if (!var10.isIf3) {
                                 var44 = var10.getSprite(KeyHandler.runCs1(var10), TaskHandler.urlRequester);
                                 if (var44 != null) {
                                    var44.drawTransBgAt(var12, var13);
                                 } else if (Widget.field3539) {
                                    class69.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var44 = class200.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var44 = var10.getSprite(false, TaskHandler.urlRequester);
                                 }

                                 if (var44 == null) {
                                    if (Widget.field3539) {
                                       class69.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var44.width;
                                    var21 = var44.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var44.method9030(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
                                       } else if (var14 != 0) {
                                          var44.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if (var20 == var10.width && var21 == var10.height) {
                                          var44.drawTransBgAt(var12, var13);
                                       } else {
                                          var44.drawScaledAt(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.spriteAngle != 0) {
                                                var44.method9030(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var44.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var44.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21);
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
                                 boolean var39 = KeyHandler.runCs1(var10);
                                 if (var39) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var45 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    var33 = NPCComposition.ItemDefinition_get(var10.itemId);
                                    if (var33 != null) {
                                       var33 = var33.getCountObj(var10.itemQuantity);
                                       var45 = var33.getModel(1);
                                       if (var45 != null) {
                                          var45.calculateBoundsCylinder();
                                          var22 = var45.height / 2;
                                       } else {
                                          class69.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var45 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var45 = class155.localPlayer.getModel();
                                    }
                                 } else {
                                    NPCComposition var50 = null;
                                    NewStuff var51 = null;
                                    if (var10.modelType == 6) {
                                       var25 = var10.modelId;
                                       if (var25 >= 0 && var25 < Client.npcs.length) {
                                          NPC var36 = Client.npcs[var25];
                                          if (var36 != null) {
                                             var50 = var36.definition;
                                             var51 = var36.method2543();
                                          }
                                       }
                                    }

                                    SequenceDefinition var37 = null;
                                    var26 = -1;
                                    if (var20 != -1) {
                                       var37 = AABB.SequenceDefinition_get(var20);
                                       var26 = var10.modelFrame;
                                    }

                                    var45 = var10.getModel(var37, var26, var39, class155.localPlayer.appearance, var50, var51);
                                    if (var45 == null && Widget.field3539) {
                                       class69.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method4395(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var45 != null) {
                                    if (!var10.isIf3) {
                                       var45.method4682(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var45.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var45.method4711(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var45.method4682(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 if (var10.type == 7) {
                                    var42 = var10.getFont();
                                    if (var42 == null) {
                                       if (Widget.field3539) {
                                          class69.invalidateWidget(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.rawHeight; ++var21) {
                                       for(var22 = 0; var22 < var10.rawWidth; ++var22) {
                                          if (var10.itemIds[var20] > 0) {
                                             var33 = NPCComposition.ItemDefinition_get(var10.itemIds[var20] - 1);
                                             String var35;
                                             if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
                                                var35 = MouseRecorder.colorStartTag(16748608) + var33.name + "</col>";
                                             } else {
                                                var35 = MouseRecorder.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + FontName.formatItemStacks(var10.itemQuantities[var20]);
                                             }

                                             var25 = var22 * (var10.paddingX + 115) + var12;
                                             var26 = (var10.paddingY + 12) * var21 + var13;
                                             if (var10.textXAlignment == 0) {
                                                var42.draw(var35, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else if (var10.textXAlignment == 1) {
                                                var42.drawCentered(var35, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             } else {
                                                var42.drawRightAligned(var35, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 Font var31;
                                 if (var10.type == 8 && var10 == class380.field4470 && Client.field521 == Client.field553) {
                                    var19 = 0;
                                    var20 = 0;
                                    var31 = AbstractWorldMapData.fontPlain12;
                                    String var32 = var10.text;

                                    String var47;
                                    for(var32 = HealthBarDefinition.method3622(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
                                       var24 = var32.indexOf("<br>");
                                       if (var24 != -1) {
                                          var47 = var32.substring(0, var24);
                                          var32 = var32.substring(var24 + 4);
                                       } else {
                                          var47 = var32;
                                          var32 = "";
                                       }

                                       var25 = var31.stringWidth(var47);
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

                                    for(var32 = HealthBarDefinition.method3622(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
                                       int var27 = var32.indexOf("<br>");
                                       if (var27 != -1) {
                                          var47 = var32.substring(0, var27);
                                          var32 = var32.substring(var27 + 4);
                                       } else {
                                          var47 = var32;
                                          var32 = "";
                                       }

                                       var31.draw(var47, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.type == 9) {
                                    if (var10.field3575) {
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
                                       Buddy.method7626(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 } else if (var10.type == 12) {
                                    class303 var43 = var10.method6167();
                                    class298 var34 = var10.method6293();
                                    if (var43 != null && var34 != null && var43.method6062()) {
                                       var31 = var10.getFont();
                                       if (var31 != null) {
                                          Client.field505.method9152(var12, var13, var10.width, var10.height, var43.method5937(), var43.method5938(), 0, 0, var43.method5934(), var43.method5913(), var43.method5933());
                                          var22 = var10.textShadowed ? var10.spriteShadow : -1;
                                          if (!var43.method5963() && var43.method6004().method7103()) {
                                             Client.field505.method9144(var34.field3455, var22, var34.field3454, var34.field3456);
                                             Client.field505.method9143(var43.method5893(), var31);
                                          } else {
                                             Client.field505.method9144(var10.color, var22, var34.field3454, var34.field3456);
                                             Client.field505.method9143(var43.method6004(), var31);
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
}
