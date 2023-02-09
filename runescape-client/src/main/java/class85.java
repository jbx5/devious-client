import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public enum class85 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   field1089(0, -1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   field1083(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   field1084(2, 7),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   field1092(3, 8),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   field1086(4, 9);

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("scriptActiveWidget")
   static Widget scriptActiveWidget;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1980862443
   )
   final int field1087;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 131803117
   )
   final int field1090;

   class85(int var3, int var4) {
      this.field1087 = var3;
      this.field1090 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1090;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;I)Z",
      garbageValue = "-473707369"
   )
   public static boolean method2337(AbstractArchive var0, AbstractArchive var1) {
      WorldMapElement.WorldMapElement_archive = var1;
      if (!var0.isFullyLoaded()) {
         return false;
      } else {
         class361.WorldMapElement_count = var0.getGroupFileCount(35);
         GrandExchangeOfferNameComparator.WorldMapElement_cached = new WorldMapElement[class361.WorldMapElement_count];

         for(int var2 = 0; var2 < class361.WorldMapElement_count; ++var2) {
            byte[] var3 = var0.takeFile(35, var2);
            GrandExchangeOfferNameComparator.WorldMapElement_cached[var2] = new WorldMapElement(var2);
            if (var3 != null) {
               GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].decode(new Buffer(var3));
               GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].method3602();
            }
         }

         return true;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lge;",
      garbageValue = "-224639764"
   )
   @Export("SequenceDefinition_get")
   public static SequenceDefinition SequenceDefinition_get(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
         var1 = new SequenceDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lru;I)V",
      garbageValue = "2050951825"
   )
   static final void method2328(PacketBuffer var0) {
      int var1 = 0;
      var0.importIndex();

      byte[] var10000;
      int var2;
      int var4;
      int var5;
      for(var2 = 0; var2 < Players.Players_count; ++var2) {
         var5 = Players.Players_indices[var2];
         if ((Players.field1353[var5] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               var10000 = Players.field1353;
               var10000[var5] = (byte)(var10000[var5] | 2);
            } else {
               var4 = var0.readBits(1);
               if (var4 == 0) {
                  var1 = ArchiveLoader.method2283(var0);
                  var10000 = Players.field1353;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  class137.readPlayerUpdate(var0, var5);
               }
            }
         }
      }

      var0.exportIndex();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.importIndex();

         for(var2 = 0; var2 < Players.Players_count; ++var2) {
            var5 = Players.Players_indices[var2];
            if ((Players.field1353[var5] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  var10000 = Players.field1353;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  var4 = var0.readBits(1);
                  if (var4 == 0) {
                     var1 = ArchiveLoader.method2283(var0);
                     var10000 = Players.field1353;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     class137.readPlayerUpdate(var0, var5);
                  }
               }
            }
         }

         var0.exportIndex();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.importIndex();

            for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
               var5 = Players.Players_emptyIndices[var2];
               if ((Players.field1353[var5] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     var10000 = Players.field1353;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     var4 = var0.readBits(1);
                     if (var4 == 0) {
                        var1 = ArchiveLoader.method2283(var0);
                        var10000 = Players.field1353;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else if (class285.updateExternalPlayer(var0, var5)) {
                        var10000 = Players.field1353;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     }
                  }
               }
            }

            var0.exportIndex();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.importIndex();

               for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                  var5 = Players.Players_emptyIndices[var2];
                  if ((Players.field1353[var5] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        var10000 = Players.field1353;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else {
                        var4 = var0.readBits(1);
                        if (var4 == 0) {
                           var1 = ArchiveLoader.method2283(var0);
                           var10000 = Players.field1353;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        } else if (class285.updateExternalPlayer(var0, var5)) {
                           var10000 = Players.field1353;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        }
                     }
                  }
               }

               var0.exportIndex();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  Players.Players_count = 0;
                  Players.Players_emptyIdxCount = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     var10000 = Players.field1353;
                     var10000[var2] = (byte)(var10000[var2] >> 1);
                     Player var3 = Client.players[var2];
                     if (var3 != null) {
                        Players.Players_indices[++Players.Players_count - 1] = var2;
                     } else {
                        Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1902403336"
   )
   public static void method2339() {
      WorldMapElement.WorldMapElement_cachedSprites.clear();
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "([Lkz;IIIIIIII)V",
      garbageValue = "1937534206"
   )
   @Export("updateInterface")
   static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && var9.parentId == var1 && (var9.method6209() || class173.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
            if (var9.isIf3) {
               if (class160.isComponentHidden(var9)) {
                  continue;
               }
            } else if (var9.type == 0 && var9 != KeyHandler.mousedOverWidgetIf1 && class160.isComponentHidden(var9)) {
               continue;
            }

            if (var9.type == 11) {
               if (var9.method6222(class245.urlRequester)) {
                  if (var9.method6351()) {
                     LoginScreenAnimation.invalidateWidget(var9);
                     AbstractWorldMapData.revalidateWidgetScroll(var9.children, var9, true);
                  }

                  if (var9.field3680 != null) {
                     ScriptEvent var10 = new ScriptEvent();
                     var10.widget = var9;
                     var10.args = var9.field3680;
                     Client.scriptEvents.addFirst(var10);
                  }
               }
            } else if (var9.type == 12 && var9.method6339()) {
               LoginScreenAnimation.invalidateWidget(var9);
            }

            int var26 = var9.x + var6;
            int var11 = var7 + var9.y;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if (var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if (var9.type == 9) {
                  var16 = var26;
                  var17 = var11;
                  var18 = var26 + var9.width;
                  int var19 = var11 + var9.height;
                  if (var18 < var26) {
                     var16 = var18;
                     var18 = var26;
                  }

                  if (var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2 ? var16 : var2;
                  var13 = var17 > var3 ? var17 : var3;
                  var14 = var18 < var4 ? var18 : var4;
                  var15 = var19 < var5 ? var19 : var5;
               } else {
                  var16 = var26 + var9.width;
                  var17 = var11 + var9.height;
                  var12 = var26 > var2 ? var26 : var2;
                  var13 = var11 > var3 ? var11 : var3;
                  var14 = var16 < var4 ? var16 : var4;
                  var15 = var17 < var5 ? var17 : var5;
               }
            }

            if (var9 == Client.clickedWidget) {
               Client.field695 = true;
               Client.field735 = var26;
               Client.field554 = var11;
            }

            boolean var34 = false;
            if (var9.field3631) {
               switch (Client.field798) {
                  case 0:
                     var34 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (Client.field677 == var9.id >>> 16) {
                        var34 = true;
                     }
                     break;
                  case 3:
                     if (var9.id == Client.field677) {
                        var34 = true;
                     }
               }
            }

            if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
               if (var9.isIf3) {
                  ScriptEvent var27;
                  if (var9.noClickThrough) {
                     if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        for(var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
                           if (var27.isMouseInputEvent) {
                              var27.remove();
                              var27.widget.containsMouse = false;
                           }
                        }

                        class308.method6192();
                        if (class27.widgetDragDuration == 0) {
                           Client.clickedWidget = null;
                           Client.clickedWidgetParent = null;
                        }

                        if (!Client.isMenuOpen) {
                           class174.addCancelMenuEntry();
                        }
                     }
                  } else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                     for(var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
                        if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) {
                           var27.remove();
                        }
                     }
                  }
               }

               var17 = MouseHandler.MouseHandler_x;
               var18 = MouseHandler.MouseHandler_y;
               if (MouseHandler.MouseHandler_lastButton != 0) {
                  var17 = MouseHandler.MouseHandler_lastPressedX;
                  var18 = MouseHandler.MouseHandler_lastPressedY;
               }

               boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if (var9.contentType == 1337) {
                  if (!Client.isLoading && !Client.isMenuOpen && var35) {
                     MouseRecorder.addSceneMenuOptions(var17, var18, var12, var13);
                  }
               } else if (var9.contentType == 1338) {
                  Frames.checkIfMinimapClicked(var9, var26, var11);
               } else {
                  if (var9.contentType == 1400) {
                     GrandExchangeOfferUnitPriceComparator.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
                  }

                  if (!Client.isMenuOpen && var35) {
                     if (var9.contentType == 1400) {
                        GrandExchangeOfferUnitPriceComparator.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
                     } else {
                        class103.Widget_addToMenu(var9, var17 - var26, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var34) {
                     for(int var20 = 0; var20 < var9.field3632.length; ++var20) {
                        var21 = false;
                        boolean var28 = false;
                        if (!var21 && var9.field3632[var20] != null) {
                           for(var23 = 0; var23 < var9.field3632[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field3594 != null) {
                                 var24 = Client.field702.method4143(var9.field3632[var20][var23]);
                              }

                              if (EnumComposition.method3710(var9.field3632[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field3594 != null && var9.field3594[var20] > Client.cycle) {
                                    break;
                                 }

                                 byte var33 = var9.field3633[var20][var23];
                                 if (var33 == 0 || ((var33 & 8) == 0 || !Client.field702.method4143(86) && !Client.field702.method4143(82) && !Client.field702.method4143(81)) && ((var33 & 2) == 0 || Client.field702.method4143(86)) && ((var33 & 1) == 0 || Client.field702.method4143(82)) && ((var33 & 4) == 0 || Client.field702.method4143(81))) {
                                    var28 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var28) {
                           if (var20 < 10) {
                              class16.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                           } else if (var20 == 10) {
                              class18.Widget_runOnTargetLeave();
                              ClanChannel.selectSpell(var9.id, var9.childIndex, MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var9)), var9.itemId);
                              Client.selectedSpellActionName = class317.Widget_getSpellActionName(var9);
                              if (Client.selectedSpellActionName == null) {
                                 Client.selectedSpellActionName = "null";
                              }

                              Client.selectedSpellName = var9.dataText + class149.colorStartTag(16777215);
                           }

                           var23 = var9.field3634[var20];
                           if (var9.field3594 == null) {
                              var9.field3594 = new int[var9.field3632.length];
                           }

                           if (var9.field3635 == null) {
                              var9.field3635 = new int[var9.field3632.length];
                           }

                           if (var23 != 0) {
                              if (var9.field3594[var20] == 0) {
                                 var9.field3594[var20] = var23 + Client.cycle + var9.field3635[var20];
                              } else {
                                 var9.field3594[var20] = var23 + Client.cycle;
                              }
                           } else {
                              var9.field3594[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field3594 != null) {
                           var9.field3594[var20] = 0;
                        }
                     }
                  }

                  if (var9.isIf3) {
                     if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        var35 = true;
                     } else {
                        var35 = false;
                     }

                     boolean var36 = false;
                     if ((MouseHandler.MouseHandler_currentButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
                        var36 = true;
                     }

                     var21 = false;
                     if ((MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        UserComparator9.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
                     }

                     if (var9.method6210()) {
                        if (var21) {
                           Client.field721.addFirst(new class204(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }

                        if (var36) {
                           Client.field721.addFirst(new class204(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }
                     }

                     if (var9.contentType == 1400) {
                        GrandExchangeOfferUnitPriceComparator.worldMap.method8115(var17, var18, var35 & var36, var35 & var21);
                     }

                     if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && AbstractArchive.method6619(class173.getWidgetFlags(var9))) {
                        Client.draggedOnWidget = var9;
                     }

                     if (var9 == Client.clickedWidgetParent) {
                        Client.field692 = true;
                        Client.field795 = var26;
                        Client.field803 = var11;
                     }

                     if (var9.hasListener) {
                        ScriptEvent var22;
                        if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseY = Client.mouseWheelRotation;
                           var22.args = var9.onScroll;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.clickedWidget != null || WorldMapLabelSize.dragInventoryWidget != null || Client.isMenuOpen) {
                           var21 = false;
                           var36 = false;
                           var35 = false;
                        }

                        if (!var9.field3674 && var21) {
                           var9.field3674 = true;
                           if (var9.onClick != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
                              var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
                              var22.args = var9.onClick;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.field3674 && var36 && var9.onClickRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onClickRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3674 && !var36) {
                           var9.field3674 = false;
                           if (var9.onRelease != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onRelease;
                              Client.field720.addFirst(var22);
                           }
                        }

                        if (var36 && var9.onHold != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onHold;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (!var9.containsMouse && var35) {
                           var9.containsMouse = true;
                           if (var9.onMouseOver != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseOver;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.containsMouse && var35 && var9.onMouseRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onMouseRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.containsMouse && !var35) {
                           var9.containsMouse = false;
                           if (var9.onMouseLeave != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseLeave;
                              Client.field720.addFirst(var22);
                           }
                        }

                        if (var9.onTimer != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onTimer;
                           Client.field768.addFirst(var22);
                        }

                        ScriptEvent var25;
                        int var37;
                        int var39;
                        if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3697) {
                           if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3697 <= 32) {
                              label844:
                              for(var39 = var9.field3697; var39 < Client.changedVarpCount; ++var39) {
                                 var23 = Client.changedVarps[var39 & 31];

                                 for(var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.varTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onVarTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label844;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onVarTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3697 = Client.changedVarpCount;
                        }

                        if (var9.onInvTransmit != null && Client.field524 > var9.field3698) {
                           if (var9.invTransmitTriggers != null && Client.field524 - var9.field3698 <= 32) {
                              label820:
                              for(var39 = var9.field3698; var39 < Client.field524; ++var39) {
                                 var23 = Client.changedItemContainers[var39 & 31];

                                 for(var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.invTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onInvTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label820;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onInvTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3698 = Client.field524;
                        }

                        if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3699) {
                           if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3699 <= 32) {
                              label796:
                              for(var39 = var9.field3699; var39 < Client.changedSkillsCount; ++var39) {
                                 var23 = Client.changedSkills[var39 & 31];

                                 for(var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.statTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onStatTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label796;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onStatTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3699 = Client.changedSkillsCount;
                        }

                        if (Client.chatCycle > var9.field3696 && var9.onChatTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onChatTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field709 > var9.field3696 && var9.onFriendTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onFriendTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field637 > var9.field3696 && var9.onClanTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onClanTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field694 > var9.field3696 && var9.field3672 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3672;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field693 > var9.field3696 && var9.field3673 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3673;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field713 > var9.field3696 && var9.onStockTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onStockTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field804 > var9.field3696 && var9.field3679 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3679;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field761 > var9.field3696 && var9.onMiscTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onMiscTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        var9.field3696 = Client.cycleCntr;
                        if (var9.onKey != null) {
                           for(var39 = 0; var39 < Client.field759; ++var39) {
                              ScriptEvent var32 = new ScriptEvent();
                              var32.widget = var9;
                              var32.keyTyped = Client.field745[var39];
                              var32.keyPressed = Client.field753[var39];
                              var32.args = var9.onKey;
                              Client.scriptEvents.addFirst(var32);
                           }
                        }

                        ScriptEvent var31;
                        int[] var38;
                        if (var9.field3604 != null) {
                           var38 = Client.field702.method4177();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3604;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }

                        if (var9.field3669 != null) {
                           var38 = Client.field702.method4145();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3669;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }
                     }
                  }

                  if (!var9.isIf3) {
                     if (Client.clickedWidget != null || WorldMapLabelSize.dragInventoryWidget != null || Client.isMenuOpen) {
                        continue;
                     }

                     if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        if (var9.mouseOverRedirect >= 0) {
                           KeyHandler.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                        } else {
                           KeyHandler.mousedOverWidgetIf1 = var9;
                        }
                     }

                     if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        class18.field102 = var9;
                     }

                     if (var9.scrollHeight > var9.height) {
                        World.method1791(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
                     }
                  }

                  if (var9.type == 0) {
                     updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
                     if (var9.children != null) {
                        updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
                     }

                     InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
                     if (var29 != null) {
                        if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
                           for(ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
                              if (var30.isMouseInputEvent) {
                                 var30.remove();
                                 var30.widget.containsMouse = false;
                              }
                           }

                           if (class27.widgetDragDuration == 0) {
                              Client.clickedWidget = null;
                              Client.clickedWidgetParent = null;
                           }

                           if (!Client.isMenuOpen) {
                              class174.addCancelMenuEntry();
                           }
                        }

                        class144.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
