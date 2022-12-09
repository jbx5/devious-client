import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class144 extends class152 {
   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -604673245
   )
   int field1703;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   final class153 this$0;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class144(class153 var1) {
      this.this$0 = var1;
      this.field1703 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "468341515"
   )
   void vmethod3336(Buffer var1) {
      this.field1703 = var1.readUnsignedShort();
      var1.readUnsignedByte();
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1227548281"
   )
   void vmethod3337(ClanChannel var1) {
      var1.removeMember(this.field1703);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-714698284"
   )
   static int method3145(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "127"
   )
   static int method3143(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         class87.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         LoginScreenAnimation.privateChatMode = SceneTilePaint.method4808(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
         if (LoginScreenAnimation.privateChatMode == null) {
            LoginScreenAnimation.privateChatMode = PrivateChatMode.field5047;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
         PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
         var13.packetBuffer.writeByte(Client.publicChatMode);
         var13.packetBuffer.writeByte(LoginScreenAnimation.privateChatMode.field5050);
         var13.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var13);
         return 1;
      } else {
         PacketBufferNode var6;
         int var7;
         String var8;
         int var9;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            class87.Interpreter_intStackSize -= 2;
            var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var6 = class136.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
            var6.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var8) + 2);
            var6.packetBuffer.writeStringCp1252NullTerminated(var8);
            var6.packetBuffer.writeByte(var7 - 1);
            var6.packetBuffer.writeByte(var9);
            Client.packetWriter.addNode(var6);
            return 1;
         } else {
            int var3;
            Message var5;
            if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var5 = class130.Messages_getByChannelAndID(var3, var7);
               if (var5 != null) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.count;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.cycle;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               Message var4;
               if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var4 = Script.Messages_getMessage(var3);
                  if (var4 != null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.type;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.cycle;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                  if (LoginScreenAnimation.privateChatMode == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = LoginScreenAnimation.privateChatMode.field5050;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                     var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     var12 = class467.method8803(var7, var8, class173.clientLanguage, -1);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                     Interpreter.Interpreter_stringStackSize -= 2;
                     var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     var12 = class136.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var10 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                     BufferedSource.method7683(var12.packetBuffer, var11);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                     var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     class87.Interpreter_intStackSize -= 2;
                     var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var6 = class467.method8803(var7, var8, class173.clientLanguage, var9);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                     if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                        var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class137.Messages_getHistorySize(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                        var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class313.Messages_getLastChatID(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                        var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DynamicObject.method2141(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.DOCHEAT) {
                        var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                        class152.doCheat(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                        Client.field744 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field744;
                        return 1;
                     } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                        var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                        class87.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                        var5 = class130.Messages_getByChannelAndID(var3, var7);
                        if (var5 != null) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.count;
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.cycle;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                        var4 = Script.Messages_getMessage(var3);
                        if (var4 != null) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.type;
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.cycle;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (class155.localPlayer != null && class155.localPlayer.username != null) {
                        var8 = class155.localPlayer.username.getName();
                     } else {
                        var8 = "";
                     }

                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "([Lkd;IIIIIIII)V",
      garbageValue = "-1314248659"
   )
   @Export("updateInterface")
   static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && var9.parentId == var1 && (var9.method6298() || Clock.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
            if (var9.isIf3) {
               if (FriendSystem.isComponentHidden(var9)) {
                  continue;
               }
            } else if (var9.type == 0 && var9 != WorldMapScaleHandler.mousedOverWidgetIf1 && FriendSystem.isComponentHidden(var9)) {
               continue;
            }

            if (var9.type == 11) {
               if (var9.method6281(TaskHandler.urlRequester)) {
                  if (var9.method6172()) {
                     class69.invalidateWidget(var9);
                     class169.revalidateWidgetScroll(var9.children, var9, true);
                  }

                  if (var9.field3670 != null) {
                     ScriptEvent var10 = new ScriptEvent();
                     var10.widget = var9;
                     var10.args = var9.field3670;
                     Client.scriptEvents.addFirst(var10);
                  }
               }
            } else if (var9.type == 12 && var9.method6242()) {
               class69.invalidateWidget(var9);
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
               Client.field701 = true;
               Client.field519 = var26;
               Client.field703 = var11;
            }

            boolean var34 = false;
            if (var9.field3621) {
               switch (Client.field791) {
                  case 0:
                     var34 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (Client.field683 == var9.id >>> 16) {
                        var34 = true;
                     }
                     break;
                  case 3:
                     if (var9.id == Client.field683) {
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

                        ClientPacket.method5481();
                        if (class87.widgetDragDuration == 0) {
                           Client.clickedWidget = null;
                           Client.clickedWidgetParent = null;
                        }

                        if (!Client.isMenuOpen) {
                           FriendsChat.addCancelMenuEntry();
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
                     class17.addSceneMenuOptions(var17, var18, var12, var13);
                  }
               } else if (var9.contentType == 1338) {
                  DevicePcmPlayerProvider.checkIfMinimapClicked(var9, var26, var11);
               } else {
                  if (var9.contentType == 1400) {
                     KitDefinition.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
                  }

                  if (!Client.isMenuOpen && var35) {
                     if (var9.contentType == 1400) {
                        KitDefinition.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
                     } else {
                        class273.Widget_addToMenu(var9, var17 - var26, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var34) {
                     for(int var20 = 0; var20 < var9.field3622.length; ++var20) {
                        var21 = false;
                        boolean var28 = false;
                        if (!var21 && var9.field3622[var20] != null) {
                           for(var23 = 0; var23 < var9.field3622[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field3692 != null) {
                                 var24 = Client.field747.method4106(var9.field3622[var20][var23]);
                              }

                              if (class281.method5501(var9.field3622[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field3692 != null && var9.field3692[var20] > Client.cycle) {
                                    break;
                                 }

                                 byte var33 = var9.field3623[var20][var23];
                                 if (var33 == 0 || ((var33 & 8) == 0 || !Client.field747.method4106(86) && !Client.field747.method4106(82) && !Client.field747.method4106(81)) && ((var33 & 2) == 0 || Client.field747.method4106(86)) && ((var33 & 1) == 0 || Client.field747.method4106(82)) && ((var33 & 4) == 0 || Client.field747.method4106(81))) {
                                    var28 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var28) {
                           if (var20 < 10) {
                              ModelData0.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                           } else if (var20 == 10) {
                              Widget.Widget_runOnTargetLeave();
                              class32.selectSpell(var9.id, var9.childIndex, PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var9)), var9.itemId);
                              Client.selectedSpellActionName = ArchiveLoader.Widget_getSpellActionName(var9);
                              if (Client.selectedSpellActionName == null) {
                                 Client.selectedSpellActionName = "null";
                              }

                              Client.selectedSpellName = var9.dataText + MouseRecorder.colorStartTag(16777215);
                           }

                           var23 = var9.field3630[var20];
                           if (var9.field3692 == null) {
                              var9.field3692 = new int[var9.field3622.length];
                           }

                           if (var9.field3625 == null) {
                              var9.field3625 = new int[var9.field3622.length];
                           }

                           if (var23 != 0) {
                              if (var9.field3692[var20] == 0) {
                                 var9.field3692[var20] = var23 + Client.cycle + var9.field3625[var20];
                              } else {
                                 var9.field3692[var20] = var23 + Client.cycle;
                              }
                           } else {
                              var9.field3692[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field3692 != null) {
                           var9.field3692[var20] = 0;
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
                     if ((MouseHandler.MouseHandler_currentButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
                        var36 = true;
                     }

                     var21 = false;
                     if ((MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        class18.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
                     }

                     if (var9.method6225()) {
                        if (var21) {
                           Client.field727.addFirst(new class200(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }

                        if (var36) {
                           Client.field727.addFirst(new class200(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
                        }
                     }

                     if (var9.contentType == 1400) {
                        KitDefinition.worldMap.method7991(var17, var18, var35 & var36, var35 & var21);
                     }

                     if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class136.method3075(Clock.getWidgetFlags(var9))) {
                        Client.draggedOnWidget = var9;
                     }

                     if (var9 == Client.clickedWidgetParent) {
                        Client.field745 = true;
                        Client.field699 = var26;
                        Client.field613 = var11;
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

                        if (Client.clickedWidget != null || class368.dragInventoryWidget != null || Client.isMenuOpen) {
                           var21 = false;
                           var36 = false;
                           var35 = false;
                        }

                        if (!var9.field3610 && var21) {
                           var9.field3610 = true;
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

                        if (var9.field3610 && var36 && var9.onClickRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var26;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onClickRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.field3610 && !var36) {
                           var9.field3610 = false;
                           if (var9.onRelease != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var26;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onRelease;
                              Client.field726.addFirst(var22);
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
                              Client.field726.addFirst(var22);
                           }
                        }

                        if (var9.onTimer != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onTimer;
                           Client.field725.addFirst(var22);
                        }

                        ScriptEvent var25;
                        int var37;
                        int var39;
                        if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3645) {
                           if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3645 <= 32) {
                              label833:
                              for(var39 = var9.field3645; var39 < Client.changedVarpCount; ++var39) {
                                 var23 = Client.changedVarps[var39 & 31];

                                 for(var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.varTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onVarTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label833;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onVarTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3645 = Client.changedVarpCount;
                        }

                        if (var9.onInvTransmit != null && Client.field709 > var9.field3668) {
                           if (var9.invTransmitTriggers != null && Client.field709 - var9.field3668 <= 32) {
                              label809:
                              for(var39 = var9.field3668; var39 < Client.field709; ++var39) {
                                 var23 = Client.changedItemContainers[var39 & 31];

                                 for(var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.invTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onInvTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label809;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onInvTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3668 = Client.field709;
                        }

                        if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3637) {
                           if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3637 <= 32) {
                              label785:
                              for(var39 = var9.field3637; var39 < Client.changedSkillsCount; ++var39) {
                                 var23 = Client.changedSkills[var39 & 31];

                                 for(var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
                                    if (var23 == var9.statTransmitTriggers[var37]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onStatTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label785;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onStatTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field3637 = Client.changedSkillsCount;
                        }

                        if (Client.chatCycle > var9.field3572 && var9.onChatTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onChatTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field715 > var9.field3572 && var9.onFriendTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onFriendTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field610 > var9.field3572 && var9.onClanTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onClanTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field717 > var9.field3572 && var9.field3553 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3553;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field513 > var9.field3572 && var9.field3663 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3663;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field777 > var9.field3572 && var9.onStockTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onStockTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field720 > var9.field3572 && var9.field3567 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field3567;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field721 > var9.field3572 && var9.onMiscTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onMiscTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        var9.field3572 = Client.cycleCntr;
                        if (var9.onKey != null) {
                           for(var39 = 0; var39 < Client.field710; ++var39) {
                              ScriptEvent var32 = new ScriptEvent();
                              var32.widget = var9;
                              var32.keyTyped = Client.field751[var39];
                              var32.keyPressed = Client.field774[var39];
                              var32.args = var9.onKey;
                              Client.scriptEvents.addFirst(var32);
                           }
                        }

                        ScriptEvent var31;
                        int[] var38;
                        if (var9.field3658 != null) {
                           var38 = Client.field747.method4108();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3658;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }

                        if (var9.field3653 != null) {
                           var38 = Client.field747.method4109();

                           for(var23 = 0; var23 < var38.length; ++var23) {
                              var31 = new ScriptEvent();
                              var31.widget = var9;
                              var31.keyTyped = var38[var23];
                              var31.args = var9.field3653;
                              Client.scriptEvents.addFirst(var31);
                           }
                        }
                     }
                  }

                  if (!var9.isIf3) {
                     if (Client.clickedWidget != null || class368.dragInventoryWidget != null || Client.isMenuOpen) {
                        continue;
                     }

                     if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        if (var9.mouseOverRedirect >= 0) {
                           WorldMapScaleHandler.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                        } else {
                           WorldMapScaleHandler.mousedOverWidgetIf1 = var9;
                        }
                     }

                     if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        class380.field4470 = var9;
                     }

                     if (var9.scrollHeight > var9.height) {
                        SoundSystem.method867(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

                           if (class87.widgetDragDuration == 0) {
                              Client.clickedWidget = null;
                              Client.clickedWidgetParent = null;
                           }

                           if (!Client.isMenuOpen) {
                              FriendsChat.addCancelMenuEntry();
                           }
                        }

                        class378.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
