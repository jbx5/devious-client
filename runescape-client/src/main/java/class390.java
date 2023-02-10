import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oq")
class class390 implements Comparator {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   final class391 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lok;)V"
   )
   class390(class391 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loh;Loh;I)I",
      garbageValue = "-653612573"
   )
   int method7480(class392 var1, class392 var2) {
      if (var1.field4530 > var2.field4530) {
         return 1;
      } else {
         return var1.field4530 < var2.field4530 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method7480((class392)var1, (class392)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1626793735"
   )
   static int method7472(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (WorldMapElement.friendSystem.field824 == 0) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -2;
         } else if (WorldMapElement.friendSystem.field824 == 1) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)WorldMapElement.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)WorldMapElement.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)WorldMapElement.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               int var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               class385.method7407(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               WorldMapElement.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               WorldMapElement.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               WorldMapElement.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               WorldMapElement.friendSystem.removeIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               var5 = class6.method48(var5);
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.isFriended(new Username(var5, WorldMapCacheName.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (class463.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (class463.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)class463.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)class463.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChat != null ? class463.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               class160.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChat != null ? class463.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               ClanSettings.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               GrandExchangeOffer.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!WorldMapElement.friendSystem.method1907()) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)WorldMapElement.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               var5 = class6.method48(var5);
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.isIgnored(new Username(var5, WorldMapCacheName.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize() && class463.friendsChat.get(var3).getUsername().equals(class387.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (class463.friendsChat != null && class463.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize() && ((ClanMate)class463.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  WorldMapElement.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     WorldMapElement.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     WorldMapElement.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     WorldMapElement.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class463.friendsChat != null) {
                        class463.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class463.friendsChat != null) {
                        class463.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     WorldMapElement.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (class463.friendsChat != null) {
                        class463.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (class463.friendsChat != null && var3 < class463.friendsChat.getSize() && ((ClanMate)class463.friendsChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "([Lkz;II)V",
      garbageValue = "-133105136"
   )
   @Export("drawModelComponents")
   static final void drawModelComponents(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class160.isComponentHidden(var3))) {
            int var5;
            if (var3.type == 0) {
               if (!var3.isIf3 && class160.isComponentHidden(var3) && var3 != KeyHandler.mousedOverWidgetIf1) {
                  continue;
               }

               drawModelComponents(var0, var3.id);
               if (var3.children != null) {
                  drawModelComponents(var3.children, var3.id);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  var5 = var4.group;
                  if (class153.loadInterface(var5)) {
                     drawModelComponents(WorldMapLabel.Widget_interfaceComponents[var5], -1);
                  }
               }
            }

            if (var3.type == 6) {
               if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
                  boolean var8 = UserComparator5.runCs1(var3);
                  if (var8) {
                     var5 = var3.sequenceId2;
                  } else {
                     var5 = var3.sequenceId;
                  }

                  if (var5 != -1) {
                     SequenceDefinition var6 = class85.SequenceDefinition_get(var5);
                     if (!var6.isCachedModelIdSet()) {
                        for(var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; LoginScreenAnimation.invalidateWidget(var3)) {
                           var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
                           ++var3.modelFrame;
                           if (var3.modelFrame >= var6.frameIds.length) {
                              var3.modelFrame -= var6.frameCount;
                              if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
                                 var3.modelFrame = 0;
                              }
                           }
                        }
                     } else {
                        var3.modelFrame += Client.graphicsCycle;
                        int var7 = var6.method4055();
                        if (var3.modelFrame >= var7) {
                           var3.modelFrame -= var6.frameCount;
                           if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
                              var3.modelFrame = 0;
                           }
                        }

                        LoginScreenAnimation.invalidateWidget(var3);
                     }
                  }
               }

               if (var3.field3585 != 0 && !var3.isIf3) {
                  int var9 = var3.field3585 >> 16;
                  var5 = var3.field3585 << 16 >> 16;
                  var9 *= Client.graphicsCycle;
                  var5 *= Client.graphicsCycle;
                  var3.modelAngleX = var9 + var3.modelAngleX & 2047;
                  var3.modelAngleY = var5 + var3.modelAngleY & 2047;
                  LoginScreenAnimation.invalidateWidget(var3);
               }
            }
         }
      }

   }
}
