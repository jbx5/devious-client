import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("at")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("an")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("oa")
   @ObfuscatedGetter(
      intValue = -540054147
   )
   static int field1820;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lgu;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lgu;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("ax")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("ap")
   @Export("isClosed")
   boolean isClosed = false;

   public TaskHandler() {
      javaVendor = "Unknown";
      javaVersion = "1.6";

      try {
         javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.isClosed = false;
      this.thread = new Thread(this);
      this.thread.setPriority(10);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1272500882"
   )
   @Export("close")
   public final void close() {
      synchronized(this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;I)Lgu;",
      garbageValue = "122006443"
   )
   @Export("newTask")
   final Task newTask(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.type = var1;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized(this) {
         if (this.task != null) {
            this.task.next = var5;
            this.task = var5;
         } else {
            this.task = this.current = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Lgu;",
      garbageValue = "1393829156"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lgu;",
      garbageValue = "1287584329"
   )
   @Export("newThreadTask")
   public final Task newThreadTask(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         Task var1;
         synchronized(this) {
            while(true) {
               if (this.isClosed) {
                  return;
               }

               if (this.current != null) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }
         }

         try {
            int var5 = var1.type;
            if (var5 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var5 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Lfz;",
      garbageValue = "624885159"
   )
   static class136 method3484(int var0) {
      class136 var2 = HealthBar.method2553(var0);
      int var1;
      if (var2 == null) {
         var1 = 2;
      } else {
         var1 = var2.method3051() ? 0 : 1;
      }

      return var1 != 0 ? null : HealthBar.method2553(var0);
   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "([Lmb;IIIIIIIIS)V",
      garbageValue = "-13451"
   )
   @Export("drawInterface")
   static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      Rasterizer3D.method4382();

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
            if (!var10.isIf3 || !UserComparator9.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  class36.method658(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     class134.field1575 = var0;
                     class74.field911 = var6;
                     class171.field1825 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field639) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field534) {
                        var15 = Client.field534;
                     }

                     if (var15 + var10.width > Client.field534 + Client.clickedWidgetParent.width) {
                        var15 = Client.field534 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field692) {
                        var16 = Client.field692;
                     }

                     if (var16 + var10.height > Client.field692 + Client.clickedWidgetParent.height) {
                        var16 = Client.field692 + Client.clickedWidgetParent.height - var10.height;
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
               if (var10.type == 9) {
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
                        if (class10.clientPreferences.method2448()) {
                           var13 += 15;
                           class404.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var41 = Runtime.getRuntime();
                           var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           class404.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        Skeleton.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field723[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        Decimator.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        HealthBarUpdate.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        ScriptFrame.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        ScriptFrame.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        class237.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && UserComparator9.isComponentHidden(var10) && var10 != ClanChannel.mousedOverWidgetIf1) {
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

                     InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
                     if (var28 != null) {
                        Renderable.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.method4382();
                  } else if (var10.type == 11) {
                     if (UserComparator9.isComponentHidden(var10) && var10 != ClanChannel.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.method4382();
                  }

                  if (Client.isResizable || Client.field743[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        WorldMapLabelSize.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                     }

                     if (var10.type != 1) {
                        if (var10.type == 3) {
                           if (ItemComposition.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch (var10.fillMode.field5101) {
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
                        } else if (var10.type == 4) {
                           Font var40 = var10.getFont();
                           if (var40 == null) {
                              if (Widget.field3600) {
                                 Messages.invalidateWidget(var10);
                              }
                           } else {
                              String var42 = var10.text;
                              if (ItemComposition.runCs1(var10)) {
                                 var20 = var10.color2;
                                 if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                    var20 = var10.mouseOverColor2;
                                 }

                                 if (var10.text2.length() > 0) {
                                    var42 = var10.text2;
                                 }
                              } else {
                                 var20 = var10.color;
                                 if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                    var20 = var10.mouseOverColor;
                                 }
                              }

                              if (var10.isIf3 && var10.itemId != -1) {
                                 ItemComposition var43 = class300.ItemDefinition_get(var10.itemId);
                                 var42 = var43.name;
                                 if (var42 == null) {
                                    var42 = "null";
                                 }

                                 if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                    var42 = Strings.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class346.formatItemStacks(var10.itemQuantity);
                                 }
                              }

                              if (var10 == Client.meslayerContinueWidget) {
                                 var42 = "Please wait...";
                                 var20 = var10.color;
                              }

                              if (!var10.isIf3) {
                                 var42 = BuddyRankComparator.method2892(var42, var10);
                              }

                              var40.method7431(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class388.method7210(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                           }
                        } else {
                           int var23;
                           int var24;
                           int var25;
                           if (var10.type == 5) {
                              SpritePixels var38;
                              if (!var10.isIf3) {
                                 var38 = var10.getSprite(ItemComposition.runCs1(var10), class47.urlRequester);
                                 if (var38 != null) {
                                    var38.drawTransBgAt(var12, var13);
                                 } else if (Widget.field3600) {
                                    Messages.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var38 = ScriptEvent.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var38 = var10.getSprite(false, class47.urlRequester);
                                 }

                                 if (var38 == null) {
                                    if (Widget.field3600) {
                                       Messages.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var38.width;
                                    var21 = var38.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var38.method9438(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
                                       } else if (var14 != 0) {
                                          var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if (var20 == var10.width && var21 == var10.height) {
                                          var38.drawTransBgAt(var12, var13);
                                       } else {
                                          var38.drawScaledAt(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.spriteAngle != 0) {
                                                var38.method9438(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var38.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
                                             } else {
                                                var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var26;
                              if (var10.type == 6) {
                                 boolean var36 = ItemComposition.runCs1(var10);
                                 if (var36) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var39 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    ItemComposition var44 = class300.ItemDefinition_get(var10.itemId);
                                    if (var44 != null) {
                                       var44 = var44.getCountObj(var10.itemQuantity);
                                       var39 = var44.getModel(1);
                                       if (var39 != null) {
                                          var39.calculateBoundsCylinder();
                                          var22 = var39.height / 2;
                                       } else {
                                          Messages.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var39 = Projectile.localPlayer.getModel();
                                    }
                                 } else if (var10.modelType == 7) {
                                    var39 = var10.field3631.getModel((SequenceDefinition)null, -1, WorldMapLabelSize.SequenceDefinition_get(Projectile.localPlayer.idleSequence), Projectile.localPlayer.movementFrame);
                                 } else {
                                    NPCComposition var45 = null;
                                    NewStuff var33 = null;
                                    if (var10.modelType == 6) {
                                       var25 = var10.modelId;
                                       if (var25 >= 0 && var25 < Client.npcs.length) {
                                          NPC var34 = Client.npcs[var25];
                                          if (var34 != null) {
                                             var45 = var34.definition;
                                             var33 = var34.method2586();
                                          }
                                       }
                                    }

                                    SequenceDefinition var35 = null;
                                    var26 = -1;
                                    if (var20 != -1) {
                                       var35 = WorldMapLabelSize.SequenceDefinition_get(var20);
                                       var26 = var10.modelFrame;
                                    }

                                    var39 = var10.getModel(var35, var26, var36, Projectile.localPlayer.appearance, var45, var33);
                                    if (var39 == null && Widget.field3600) {
                                       Messages.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method4387(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var39 != null) {
                                    if (!var10.isIf3) {
                                       var39.method4798(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var39.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var39.method4799(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var39.method4798(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.method4386();
                              } else {
                                 Font var29;
                                 if (var10.type == 8 && var10 == class19.field99 && Client.field665 == Client.field664) {
                                    var19 = 0;
                                    var20 = 0;
                                    var29 = class404.fontPlain12;
                                    String var30 = var10.text;

                                    String var31;
                                    for(var30 = BuddyRankComparator.method2892(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
                                       var24 = var30.indexOf("<br>");
                                       if (var24 != -1) {
                                          var31 = var30.substring(0, var24);
                                          var30 = var30.substring(var24 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var25 = var29.stringWidth(var31);
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

                                    if (var19 + var24 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if (var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
                                    var30 = var10.text;
                                    var26 = var25 + var29.ascent + 2;

                                    for(var30 = BuddyRankComparator.method2892(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
                                       int var27 = var30.indexOf("<br>");
                                       if (var27 != -1) {
                                          var31 = var30.substring(0, var27);
                                          var30 = var30.substring(var27 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var29.draw(var31, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.type == 9) {
                                    if (var10.field3658) {
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
                                       class129.method3001(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 } else if (var10.type == 12) {
                                    class327 var37 = var10.method6380();
                                    class322 var32 = var10.method6381();
                                    if (var37 != null && var32 != null && var37.method6238()) {
                                       var29 = var10.getFont();
                                       if (var29 != null) {
                                          Client.field715.method9539(var12, var13, var10.width, var10.height, var37.method6157(), var37.method6114(), var37.method6239(), var37.method6232(), var37.method6109());
                                          var22 = var10.textShadowed ? var10.spriteShadow : -1;
                                          if (!var37.method6107() && var37.method6163().method7410()) {
                                             Client.field715.method9547(var32.field3520, var22, var32.field3522, var32.field3519);
                                             Client.field715.method9545(var37.method6105(), var29);
                                          } else {
                                             Client.field715.method9547(var10.color, var22, var32.field3522, var32.field3519);
                                             Client.field715.method9545(var37.method6163(), var29);
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
