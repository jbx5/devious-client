import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Lqg;I)I",
      garbageValue = "1689179887"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.world != var1.world) {
         return this.reversed ? var1.world - var2.world : var2.world - var1.world;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "455985244"
   )
   @Export("Messages_getHistorySize")
   static int Messages_getHistorySize(int var0) {
      ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var1 == null ? 0 : var1.size();
   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "([Lmb;IIIIIIII)V",
      garbageValue = "-1666219635"
   )
   @Export("updateInterface")
   static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && var9.parentId == var1 && (var9.method6456() || StudioGame.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
            if (var9.isIf3) {
               if (UserComparator9.isComponentHidden(var9)) {
                  continue;
               }
            } else if (var9.type == 0 && var9 != ClanChannel.mousedOverWidgetIf1 && UserComparator9.isComponentHidden(var9)) {
               continue;
            }

            if (var9.type == 11) {
               if (var9.method6377(class47.urlRequester)) {
                  if (var9.method6359()) {
                     Messages.invalidateWidget(var9);
                     Projectile.revalidateWidgetScroll(var9.children, var9, true);
                  }

                  if (var9.field3703 != null) {
                     ScriptEvent var10 = new ScriptEvent();
                     var10.widget = var9;
                     var10.args = var9.field3703;
                     Client.scriptEvents.addFirst(var10);
                  }
               }
            } else if (var9.type == 12 && var9.method6429()) {
               Messages.invalidateWidget(var9);
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
               Client.field693 = true;
               Client.field694 = var26;
               Client.field735 = var11;
            }

            boolean var34 = false;
            if (var9.field3677) {
               switch (Client.field517) {
                  case 0:
                     var34 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (Client.field613 == var9.id >>> 16) {
                        var34 = true;
                     }
                     break;
                  case 3:
                     if (var9.id == Client.field613) {
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
                           if (var27.field1062) {
                              var27.remove();
                              var27.widget.field3740 = false;
                           }
                        }

                        ChatChannel.method2159();
                        if (class348.widgetDragDuration == 0) {
                           Client.clickedWidget = null;
                           Client.clickedWidgetParent = null;
                        }

                        if (!Client.isMenuOpen) {
                           class442.addCancelMenuEntry();
                        }
                     }
                  } else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                     for(var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
                        if (var27.field1062 && var27.widget.onScroll == var27.args) {
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
                     class163.addSceneMenuOptions(var17, var18, var12, var13);
                  }
               } else if (var9.contentType == 1338) {
                  Friend.checkIfMinimapClicked(var9, var26, var11);
               } else {
                  if (var9.contentType == 1400) {
                     ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
                  }

                  if (!Client.isMenuOpen && var35) {
                     if (var9.contentType == 1400) {
                        ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
                     } else {
                        ModeWhere.Widget_addToMenu(var9);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var34) {
                     for(int var20 = 0; var20 < var9.field3678.length; ++var20) {
                        var21 = false;
                        boolean var28 = false;
                        if (!var21 && var9.field3678[var20] != null) {
                           for(var23 = 0; var23 < var9.field3678[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field3669 != null) {
                                 var24 = Client.field739.method4134(var9.field3678[var20][var23]);
                              }

                              if (FaceNormal.method4720(var9.field3678[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field3669 != null && var9.field3669[var20] > Client.cycle) {
                                    break;
                                 }

                                 byte var33 = var9.field3671[var20][var23];
                                 if (var33 == 0 || ((var33 & 8) == 0 || !Client.field739.method4134(86) && !Client.field739.method4134(82) && !Client.field739.method4134(81)) && ((var33 & 2) == 0 || Client.field739.method4134(86)) && ((var33 & 1) == 0 || Client.field739.method4134(82)) && ((var33 & 4) == 0 || Client.field739.method4134(81))) {
                                    var28 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var28) {
                           if (var20 < 10) {
                              InvDefinition.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                           } else if (var20 == 10) {
                              FriendsList.Widget_runOnTargetLeave();
                              FriendLoginUpdate.selectSpell(var9.id, var9.childIndex, LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var9)), var9.itemId);
                              Client.selectedSpellActionName = BuddyRankComparator.Widget_getSpellActionName(var9);
                              if (Client.selectedSpellActionName == null) {
                                 Client.selectedSpellActionName = "null";
                              }

                              Client.selectedSpellName = var9.dataText + Strings.colorStartTag(16777215);
                           }

                           var23 = var9.field3639[var20];
                           if (var9.field3669 == null) {
                              var9.field3669 = new int[var9.field3678.length];
                           }

                           if (var9.field3681 == null) {
                              var9.field3681 = new int[var9.field3678.length];
                           }

                           if (var23 != 0) {
                              if (var9.field3669[var20] == 0) {
                                 var9.field3669[var20] = var23 + Client.cycle + var9.field3681[var20];
                              } else {
                                 var9.field3669[var20] = var23 + Client.cycle;
                              }
                           } else {
                              var9.field3669[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field3669 != null) {
                           var9.field3669[var20] = 0;
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
                     if ((MouseHandler.MouseHandler_currentButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
                        var36 = true;
                     }

                     var21 = false;
                     if ((MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        UserComparator10.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
                     }

                     if (var9.method6363()) {
                        if (var21) {
                           Client.field742.addFirst(new class210(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }

                        if (var36) {
                           Client.field742.addFirst(new class210(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }
                     }

                     if (var9.contentType == 1400) {
                        ScriptFrame.worldMap.method8389(var17, var18, var35 & var36, var35 & var21);
                     }

                     if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class145.method3147(StudioGame.getWidgetFlags(var9))) {
                        Client.draggedOnWidget = var9;
                     }

                     if (var9 == Client.clickedWidgetParent) {
                        Client.field639 = true;
                        Client.field534 = var26;
                        Client.field692 = var11;
                     }

                     if (var9.hasListener) {
                        ScriptEvent var22;
                        if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
                           var22 = new ScriptEvent();
                           var22.field1062 = true;
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

                        if (!var9.field3741 && var21) {
                           var9.field3741 = true;
                           if (var9.onClick != null) {
                              var22 = new ScriptEvent();
                              var22.field1062 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
                              var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
                              var22.args = var9.onClick;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.field3741 && var36 && var9.onClickRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.field1062 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onClickRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3741 && !var36) {
                           var9.field3741 = false;
                           if (var9.onRelease != null) {
                              var22 = new ScriptEvent();
                              var22.field1062 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onRelease;
                              Client.field710.addFirst(var22);
                           }
                        }

                        if (var36 && var9.onHold != null) {
                           var22 = new ScriptEvent();
                           var22.field1062 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onHold;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (!var9.field3740 && var35) {
                           var9.field3740 = true;
                           if (var9.onMouseOver != null) {
                              var22 = new ScriptEvent();
                              var22.field1062 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseOver;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.field3740 && var35 && var9.onMouseRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.field1062 = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onMouseRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3740 && !var35) {
                           var9.field3740 = false;
                           if (var9.onMouseLeave != null) {
                              var22 = new ScriptEvent();
                              var22.field1062 = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseLeave;
                              Client.field710.addFirst(var22);
                           }
                        }

                        if (var9.onTimer != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onTimer;
                           Client.field717.addFirst(var22);
                        }

                        ScriptEvent var25;
                        int var37;
                        int var39;
                        if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3743) {
                           if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3743 <= 32) {
                              label827:
                              for(var39 = var9.field3743; var39 < Client.changedVarpCount; ++var39) {
                                 var23 = Client.changedVarps[var39 & 31];

                                 for(var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.varTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onVarTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label827;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onVarTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3743 = Client.changedVarpCount;
                        }

                        if (var9.onInvTransmit != null && Client.field701 > var9.field3744) {
                           if (var9.invTransmitTriggers != null && Client.field701 - var9.field3744 <= 32) {
                              label803:
                              for(var39 = var9.field3744; var39 < Client.field701; ++var39) {
                                 var23 = Client.changedItemContainers[var39 & 31];

                                 for(var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.invTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onInvTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label803;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onInvTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3744 = Client.field701;
                        }

                        if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3601) {
                           if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3601 <= 32) {
                              label779:
                              for(var39 = var9.field3601; var39 < Client.changedSkillsCount; ++var39) {
                                 var23 = Client.changedSkills[var39 & 31];

                                 for(var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.statTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onStatTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label779;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onStatTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3601 = Client.changedSkillsCount;
                        }

                        if (Client.chatCycle > var9.field3742 && var9.onChatTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onChatTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field707 > var9.field3742 && var9.onFriendTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onFriendTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field766 > var9.field3742 && var9.onClanTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onClanTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field709 > var9.field3742 && var9.field3718 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3718;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field690 > var9.field3742 && var9.field3719 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3719;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field734 > var9.field3742 && var9.onStockTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onStockTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field712 > var9.field3742 && var9.field3725 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3725;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field711 > var9.field3742 && var9.onMiscTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onMiscTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        var9.field3742 = Client.cycleCntr;
                        if (var9.onKey != null) {
                           for(var39 = 0; var39 < Client.field741; ++var39) {
                              ScriptEvent var32 = new ScriptEvent();
                              var32.widget = var9;
                              var32.keyTyped = Client.field545[var39];
                              var32.keyPressed = Client.field676[var39];
                              var32.args = var9.onKey;
                              Client.scriptEvents.addFirst(var32);
                           }
                        }

                        ScriptEvent var31;
                        int[] var38;
                        if (var9.field3714 != null) {
                           var38 = Client.field739.method4136();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3714;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }

                        if (var9.field3715 != null) {
                           var38 = Client.field739.method4137();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3715;
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
                           ClanChannel.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                        } else {
                           ClanChannel.mousedOverWidgetIf1 = var9;
                        }
                     }

                     if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        class19.field99 = var9;
                     }

                     if (var9.scrollHeight > var9.height) {
                        class20.method304(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
                              if (var30.field1062) {
                                 var30.remove();
                                 var30.widget.field3740 = false;
                              }
                           }

                           if (class348.widgetDragDuration == 0) {
                              Client.clickedWidget = null;
                              Client.clickedWidgetParent = null;
                           }

                           if (!Client.isMenuOpen) {
                              class442.addCancelMenuEntry();
                           }
                        }

                        RouteStrategy.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
