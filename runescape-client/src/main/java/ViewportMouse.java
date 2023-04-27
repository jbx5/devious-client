import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ViewportMouse")
public class ViewportMouse {
   @ObfuscatedName("af")
   @Export("ViewportMouse_isInViewport")
   public static boolean ViewportMouse_isInViewport = false;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 2139535413
   )
   @Export("ViewportMouse_x")
   public static int ViewportMouse_x = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 148198745
   )
   @Export("ViewportMouse_y")
   public static int ViewportMouse_y = 0;
   @ObfuscatedName("ac")
   @Export("ViewportMouse_false0")
   public static boolean ViewportMouse_false0 = false;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1874962943
   )
   static int field2767;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1672023491
   )
   static int field2768;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1677061457
   )
   static int field2769;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1926934503
   )
   static int field2771;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1048050201
   )
   @Export("ViewportMouse_entityCount")
   public static int ViewportMouse_entityCount = 0;
   @ObfuscatedName("ag")
   @Export("ViewportMouse_entityTags")
   public static long[] ViewportMouse_entityTags = new long[1000];
   @ObfuscatedName("hv")
   static String field2774;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-119"
   )
   static int method4908(int var0) {
      return class28.KeyHandler_keyCodes[var0];
   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "([Lmq;IIIIIIII)V",
      garbageValue = "1611526345"
   )
   @Export("updateInterface")
   static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && var9.parentId == var1 && (var9.method6374() || KeyHandler.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
            if (var9.isIf3) {
               if (class393.isComponentHidden(var9)) {
                  continue;
               }
            } else if (var9.type == 0 && var9 != MidiPcmStream.mousedOverWidgetIf1 && class393.isComponentHidden(var9)) {
               continue;
            }

            if (var9.type == 11) {
               if (var9.method6415(class14.urlRequester)) {
                  if (var9.method6382()) {
                     class144.invalidateWidget(var9);
                     WallDecoration.revalidateWidgetScroll(var9.children, var9, true);
                  }

                  if (var9.field3653 != null) {
                     ScriptEvent var10 = new ScriptEvent();
                     var10.widget = var9;
                     var10.args = var9.field3653;
                     Client.scriptEvents.addFirst(var10);
                  }
               }
            } else if (var9.type == 12 && var9.method6440()) {
               class144.invalidateWidget(var9);
            }

            int var26 = var9.x + var6;
            int var11 = var7 + var9.y;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
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

            if (var9 == Client.clickedWidget) {
               Client.field755 = true;
               Client.field676 = var26;
               Client.field677 = var11;
            }

            boolean var34 = false;
            if (var9.field3581) {
               switch (Client.field595) {
                  case 0:
                     var34 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (Client.field658 == var9.id >>> 16) {
                        var34 = true;
                     }
                     break;
                  case 3:
                     if (var9.id == Client.field658) {
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
                           if (var27.field1039) {
                              var27.remove();
                              var27.widget.field3671 = false;
                           }
                        }

                        WorldMapData_1.method5345();
                        if (class96.widgetDragDuration == 0) {
                           Client.clickedWidget = null;
                           Client.clickedWidgetParent = null;
                        }

                        if (!Client.isMenuOpen) {
                           class156.addCancelMenuEntry();
                        }
                     }
                  } else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                     for(var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
                        if (var27.field1039 && var27.widget.onScroll == var27.args) {
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
                     ScriptFrame.addSceneMenuOptions(var17, var18, var12, var13);
                  }
               } else if (var9.contentType == 1338) {
                  MusicPatchNode.checkIfMinimapClicked(var9, var26, var11);
               } else {
                  if (var9.contentType == 1400) {
                     class126.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
                  }

                  if (!Client.isMenuOpen && var35) {
                     if (var9.contentType == 1400) {
                        class126.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
                     } else {
                        class335.Widget_addToMenu(var9);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var34) {
                     for(int var20 = 0; var20 < var9.field3645.length; ++var20) {
                        var21 = false;
                        boolean var28 = false;
                        if (!var21 && var9.field3645[var20] != null) {
                           for(var23 = 0; var23 < var9.field3645[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field3643 != null) {
                                 var24 = Client.field721.method4229(var9.field3645[var20][var23]);
                              }

                              if (class81.method2249(var9.field3645[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field3643 != null && var9.field3643[var20] > Client.cycle) {
                                    break;
                                 }

                                 byte var33 = var9.field3646[var20][var23];
                                 if (var33 == 0 || ((var33 & 8) == 0 || !Client.field721.method4229(86) && !Client.field721.method4229(82) && !Client.field721.method4229(81)) && ((var33 & 2) == 0 || Client.field721.method4229(86)) && ((var33 & 1) == 0 || Client.field721.method4229(82)) && ((var33 & 4) == 0 || Client.field721.method4229(81))) {
                                    var28 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var28) {
                           if (var20 < 10) {
                              Message.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                           } else if (var20 == 10) {
                              class166.Widget_runOnTargetLeave();
                              class18.selectSpell(var9.id, var9.childIndex, class195.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var9)), var9.itemId);
                              Client.selectedSpellActionName = MusicPatchNode.Widget_getSpellActionName(var9);
                              if (Client.selectedSpellActionName == null) {
                                 Client.selectedSpellActionName = "null";
                              }

                              Client.selectedSpellName = var9.dataText + class383.colorStartTag(16777215);
                           }

                           var23 = var9.field3627[var20];
                           if (var9.field3643 == null) {
                              var9.field3643 = new int[var9.field3645.length];
                           }

                           if (var9.field3670 == null) {
                              var9.field3670 = new int[var9.field3645.length];
                           }

                           if (var23 != 0) {
                              if (var9.field3643[var20] == 0) {
                                 var9.field3643[var20] = var23 + Client.cycle + var9.field3670[var20];
                              } else {
                                 var9.field3643[var20] = var23 + Client.cycle;
                              }
                           } else {
                              var9.field3643[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field3643 != null) {
                           var9.field3643[var20] = 0;
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
                     if ((MouseHandler.MouseHandler_currentButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
                        var36 = true;
                     }

                     var21 = false;
                     if ((MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        class370.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
                     }

                     if (var9.method6383()) {
                        if (var21) {
                           Client.field701.addFirst(new class206(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }

                        if (var36) {
                           Client.field701.addFirst(new class206(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }
                     }

                     if (var9.contentType == 1400) {
                        class126.worldMap.method8473(var17, var18, var35 & var36, var35 & var21);
                     }

                     if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && MusicPatchNode.method5983(KeyHandler.getWidgetFlags(var9))) {
                        Client.draggedOnWidget = var9;
                     }

                     if (var9 == Client.clickedWidgetParent) {
                        Client.field672 = true;
                        Client.field627 = var26;
                        Client.field674 = var11;
                     }

                     if (var9.hasListener) {
                        ScriptEvent var22;
                        if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
                           var22 = new ScriptEvent();
                           var22.field1039 = true;
                           var22.widget = var9;
                           var22.mouseY = Client.mouseWheelRotation;
                           var22.args = var9.onScroll;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.clickedWidget != null || Client.isMenuOpen) {
                           var21 = false;
                           var36 = false;
                           var35 = false;
                        }

                        if (!var9.field3662 && var21) {
                           var9.field3662 = true;
                           if (var9.onClick != null) {
                              var22 = new ScriptEvent();
                              var22.field1039 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
                              var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
                              var22.args = var9.onClick;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.field3662 && var36 && var9.onClickRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.field1039 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onClickRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3662 && !var36) {
                           var9.field3662 = false;
                           if (var9.onRelease != null) {
                              var22 = new ScriptEvent();
                              var22.field1039 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onRelease;
                              Client.field700.addFirst(var22);
                           }
                        }

                        if (var36 && var9.onHold != null) {
                           var22 = new ScriptEvent();
                           var22.field1039 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onHold;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (!var9.field3671 && var35) {
                           var9.field3671 = true;
                           if (var9.onMouseOver != null) {
                              var22 = new ScriptEvent();
                              var22.field1039 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseOver;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.field3671 && var35 && var9.onMouseRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.field1039 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onMouseRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3671 && !var35) {
                           var9.field3671 = false;
                           if (var9.onMouseLeave != null) {
                              var22 = new ScriptEvent();
                              var22.field1039 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseLeave;
                              Client.field700.addFirst(var22);
                           }
                        }

                        if (var9.onTimer != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onTimer;
                           Client.field699.addFirst(var22);
                        }

                        ScriptEvent var25;
                        int var37;
                        int var39;
                        if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3560) {
                           if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3560 <= 32) {
                              label829:
                              for(var39 = var9.field3560; var39 < Client.changedVarpCount; ++var39) {
                                 var23 = Client.changedVarps[var39 & 31];

                                 for(var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.varTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onVarTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label829;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onVarTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3560 = Client.changedVarpCount;
                        }

                        if (var9.onInvTransmit != null && Client.field683 > var9.field3711) {
                           if (var9.invTransmitTriggers != null && Client.field683 - var9.field3711 <= 32) {
                              label805:
                              for(var39 = var9.field3711; var39 < Client.field683; ++var39) {
                                 var23 = Client.changedItemContainers[var39 & 31];

                                 for(var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.invTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onInvTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label805;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onInvTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3711 = Client.field683;
                        }

                        if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3700) {
                           if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3700 <= 32) {
                              label781:
                              for(var39 = var9.field3700; var39 < Client.changedSkillsCount; ++var39) {
                                 var23 = Client.changedSkills[var39 & 31];

                                 for(var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.statTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onStatTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label781;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onStatTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3700 = Client.changedSkillsCount;
                        }

                        if (Client.chatCycle > var9.field3709 && var9.onChatTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onChatTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field689 > var9.field3709 && var9.onFriendTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onFriendTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field690 > var9.field3709 && var9.onClanTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onClanTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field691 > var9.field3709 && var9.field3637 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3637;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field692 > var9.field3709 && var9.field3566 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3566;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field762 > var9.field3709 && var9.onStockTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onStockTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field768 > var9.field3709 && var9.field3692 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3692;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field565 > var9.field3709 && var9.onMiscTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onMiscTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        var9.field3709 = Client.cycleCntr;
                        if (var9.onKey != null) {
                           for(var39 = 0; var39 < Client.field487; ++var39) {
                              ScriptEvent var32 = new ScriptEvent();
                              var32.widget = var9;
                              var32.keyTyped = Client.field556[var39];
                              var32.keyPressed = Client.field724[var39];
                              var32.args = var9.onKey;
                              Client.scriptEvents.addFirst(var32);
                           }
                        }

                        ScriptEvent var31;
                        int[] var38;
                        if (var9.field3681 != null) {
                           var38 = Client.field721.method4216();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3681;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }

                        if (var9.field3582 != null) {
                           var38 = Client.field721.method4213();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3582;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }
                     }
                  }

                  if (!var9.isIf3) {
                     if (Client.clickedWidget != null || Client.isMenuOpen) {
                        continue;
                     }

                     if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        if (var9.mouseOverRedirect >= 0) {
                           MidiPcmStream.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                        } else {
                           MidiPcmStream.mousedOverWidgetIf1 = var9;
                        }
                     }

                     if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        class130.field1574 = var9;
                     }

                     if (var9.scrollHeight > var9.height) {
                        class166.method3547(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
                              if (var30.field1039) {
                                 var30.remove();
                                 var30.widget.field3671 = false;
                              }
                           }

                           if (class96.widgetDragDuration == 0) {
                              Client.clickedWidget = null;
                              Client.clickedWidgetParent = null;
                           }

                           if (!Client.isMenuOpen) {
                              class156.addCancelMenuEntry();
                           }
                        }

                        ReflectionCheck.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
