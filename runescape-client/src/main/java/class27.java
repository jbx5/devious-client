import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class27 {
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive20")
   static Archive archive20;
   @ObfuscatedName("pw")
   @ObfuscatedGetter(
      intValue = 1959084887
   )
   @Export("widgetDragDuration")
   static int widgetDragDuration;
   @ObfuscatedName("i")
   int[] field162 = new int[112];
   @ObfuscatedName("n")
   int[] field161 = new int[192];

   public class27() {
      Arrays.fill(this.field162, 3);
      Arrays.fill(this.field161, 3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1922919708"
   )
   public void method391(int var1, int var2) {
      if (this.method399(var1) && this.method401(var2)) {
         this.field162[var1] = var2;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(CII)V",
      garbageValue = "2116821772"
   )
   public void method417(char var1, int var2) {
      if (this.method423(var1) && this.method401(var2)) {
         this.field161[var1] = var2;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "969220450"
   )
   public int method393(int var1) {
      return this.method399(var1) ? this.field162[var1] : 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(CI)I",
      garbageValue = "2077314756"
   )
   public int method394(char var1) {
      return this.method423(var1) ? this.field161[var1] : 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "100"
   )
   public boolean method416(int var1) {
      return this.method399(var1) && (this.field162[var1] == 1 || this.field162[var1] == 3);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(CS)Z",
      garbageValue = "-12278"
   )
   public boolean method396(char var1) {
      return this.method423(var1) && (this.field161[var1] == 1 || this.field161[var1] == 3);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1145062404"
   )
   public boolean method411(int var1) {
      return this.method399(var1) && (this.field162[var1] == 2 || this.field162[var1] == 3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "25"
   )
   public boolean method398(char var1) {
      return this.method423(var1) && (this.field161[var1] == 2 || this.field161[var1] == 3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1719071766"
   )
   boolean method399(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "2"
   )
   boolean method423(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1586560827"
   )
   boolean method401(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)[Ljs;",
      garbageValue = "-94"
   )
   public static class280[] method424() {
      return new class280[]{class280.field3179, class280.field3172, class280.field3173, class280.field3174, class280.field3175, class280.field3178, class280.field3176, class280.field3171, class280.field3183, class280.field3180, class280.field3181, class280.field3182, class280.field3177};
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "([Lkz;IIIIIIIIB)V",
      garbageValue = "101"
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
            if (!var10.isIf3 || !class160.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  DbRowType.method8572(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     MouseHandler.field262 = var0;
                     class288.field3342 = var6;
                     class366.field4370 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field692) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field795) {
                        var15 = Client.field795;
                     }

                     if (var15 + var10.width > Client.field795 + Client.clickedWidgetParent.width) {
                        var15 = Client.field795 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field803) {
                        var16 = Client.field803;
                     }

                     if (var16 + var10.height > Client.field803 + Client.clickedWidgetParent.height) {
                        var16 = Client.field803 + Client.clickedWidgetParent.height - var10.height;
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
                        if (PacketWriter.clientPreferences.method2489()) {
                           var13 += 15;
                           MenuAction.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var46 = Runtime.getRuntime();
                           var20 = (int)((var46.totalMemory() - var46.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           MenuAction.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        VarpDefinition.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field725[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        WorldMapSectionType.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        CollisionMap.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        GrandExchangeOfferUnitPriceComparator.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        GrandExchangeOfferUnitPriceComparator.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        class305.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && class160.isComponentHidden(var10) && var10 != KeyHandler.mousedOverWidgetIf1) {
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
                        class97.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  } else if (var10.type == 11) {
                     if (class160.isComponentHidden(var10) && var10 != KeyHandler.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  }

                  if (Client.isResizable || Client.field560[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        ParamComposition.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
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
                                       } else if (Widget.field3579) {
                                          LoginScreenAnimation.invalidateWidget(var10);
                                       }
                                    }
                                 } else {
                                    boolean var40 = false;
                                    boolean var41 = false;
                                    var26 = var10.itemIds[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == WorldMapLabelSize.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
                                       SpritePixels var38;
                                       if (Client.isItemSelected == 1 && var19 == WorldMapIcon_0.selectedItemSlot && var10.id == WorldMapLabel.selectedItemWidget) {
                                          var38 = TextureProvider.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                       } else {
                                          var38 = TextureProvider.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                       }

                                       if (var38 != null) {
                                          if (var10 == WorldMapLabelSize.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
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

                                             var38.drawTransAt(var24 + var22, var25 + var23, 128);
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
                                                   LoginScreenAnimation.invalidateWidget(var28);
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
                                                   LoginScreenAnimation.invalidateWidget(var28);
                                                }
                                             }
                                          } else if (var10 == class378.field4437 && var19 == Client.field619) {
                                             var38.drawTransAt(var22, var23, 128);
                                          } else {
                                             var38.drawTransBgAt(var22, var23);
                                          }
                                       } else {
                                          LoginScreenAnimation.invalidateWidget(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.type == 3) {
                           if (UserComparator5.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == KeyHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == KeyHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch (var10.fillMode.field5015) {
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
                                 if (Widget.field3579) {
                                    LoginScreenAnimation.invalidateWidget(var10);
                                 }
                              } else {
                                 String var48 = var10.text;
                                 if (UserComparator5.runCs1(var10)) {
                                    var20 = var10.color2;
                                    if (var10 == KeyHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                       var20 = var10.mouseOverColor2;
                                    }

                                    if (var10.text2.length() > 0) {
                                       var48 = var10.text2;
                                    }
                                 } else {
                                    var20 = var10.color;
                                    if (var10 == KeyHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                       var20 = var10.mouseOverColor;
                                    }
                                 }

                                 if (var10.isIf3 && var10.itemId != -1) {
                                    ItemComposition var49 = TileItem.ItemDefinition_get(var10.itemId);
                                    var48 = var49.name;
                                    if (var48 == null) {
                                       var48 = "null";
                                    }

                                    if ((var49.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var48 = class149.colorStartTag(16748608) + var48 + "</col>" + " " + 'x' + WorldMapCacheName.formatItemStacks(var10.itemQuantity);
                                    }
                                 }

                                 if (var10 == Client.meslayerContinueWidget) {
                                    var48 = "Please wait...";
                                    var20 = var10.color;
                                 }

                                 if (!var10.isIf3) {
                                    var48 = FloorDecoration.method4312(var48, var10);
                                 }

                                 var42.drawLines(var48, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                              }
                           } else if (var10.type == 5) {
                              SpritePixels var44;
                              if (!var10.isIf3) {
                                 var44 = var10.getSprite(UserComparator5.runCs1(var10), class245.urlRequester);
                                 if (var44 != null) {
                                    var44.drawTransBgAt(var12, var13);
                                 } else if (Widget.field3579) {
                                    LoginScreenAnimation.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var44 = TextureProvider.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var44 = var10.getSprite(false, class245.urlRequester);
                                 }

                                 if (var44 == null) {
                                    if (Widget.field3579) {
                                       LoginScreenAnimation.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var44.width;
                                    var21 = var44.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var44.method9135(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
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
                                                var44.method9135(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var44.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
                                             } else {
                                                var44.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25);
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
                                 boolean var39 = UserComparator5.runCs1(var10);
                                 if (var39) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var45 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    var33 = TileItem.ItemDefinition_get(var10.itemId);
                                    if (var33 != null) {
                                       var33 = var33.getCountObj(var10.itemQuantity);
                                       var45 = var33.getModel(1);
                                       if (var45 != null) {
                                          var45.calculateBoundsCylinder();
                                          var22 = var45.height / 2;
                                       } else {
                                          LoginScreenAnimation.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var45 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var45 = class387.localPlayer.getModel();
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
                                             var51 = var36.method2633();
                                          }
                                       }
                                    }

                                    SequenceDefinition var37 = null;
                                    var26 = -1;
                                    if (var20 != -1) {
                                       var37 = class85.SequenceDefinition_get(var20);
                                       var26 = var10.modelFrame;
                                    }

                                    var45 = var10.getModel(var37, var26, var39, class387.localPlayer.appearance, var50, var51);
                                    if (var45 == null && Widget.field3579) {
                                       LoginScreenAnimation.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method4417(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var45 != null) {
                                    if (!var10.isIf3) {
                                       var45.method4706(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var45.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var45.method4794(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var45.method4706(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 if (var10.type == 7) {
                                    var42 = var10.getFont();
                                    if (var42 == null) {
                                       if (Widget.field3579) {
                                          LoginScreenAnimation.invalidateWidget(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.rawHeight; ++var21) {
                                       for(var22 = 0; var22 < var10.rawWidth; ++var22) {
                                          if (var10.itemIds[var20] > 0) {
                                             var33 = TileItem.ItemDefinition_get(var10.itemIds[var20] - 1);
                                             String var35;
                                             if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
                                                var35 = class149.colorStartTag(16748608) + var33.name + "</col>";
                                             } else {
                                                var35 = class149.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapCacheName.formatItemStacks(var10.itemQuantities[var20]);
                                             }

                                             var25 = var12 + var22 * (var10.paddingX + 115);
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
                                 if (var10.type == 8 && var10 == class18.field102 && Client.field666 == Client.field665) {
                                    var19 = 0;
                                    var20 = 0;
                                    var31 = MenuAction.fontPlain12;
                                    String var32 = var10.text;

                                    String var47;
                                    for(var32 = FloorDecoration.method4312(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
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

                                    for(var32 = FloorDecoration.method4312(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
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
                                    if (var10.field3606) {
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
                                       class17.method229(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 } else if (var10.type == 12) {
                                    class307 var43 = var10.method6235();
                                    class302 var34 = var10.method6226();
                                    if (var43 != null && var34 != null && var43.method5979()) {
                                       var31 = var10.getFont();
                                       if (var31 != null) {
                                          Client.field717.method9237(var12, var13, var10.width, var10.height, var43.method5980(), var43.method6041(), 0, 0, var43.method6145(), var43.method5978(), var43.method5976());
                                          var22 = var10.textShadowed ? var10.spriteShadow : -1;
                                          if (!var43.method5974() && var43.method5971().method7076()) {
                                             Client.field717.method9232(var34.field3467, var22, var34.field3465, var34.field3470);
                                             Client.field717.method9236(var43.method6128(), var31);
                                          } else {
                                             Client.field717.method9232(var10.color, var22, var34.field3465, var34.field3470);
                                             Client.field717.method9236(var43.method5971(), var31);
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
