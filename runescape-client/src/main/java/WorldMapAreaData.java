import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kk")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
   @ObfuscatedName("jj")
   @Export("regions")
   static int[] regions;
   @ObfuscatedName("ax")
   @Export("worldMapData0Set")
   HashSet worldMapData0Set;
   @ObfuscatedName("ai")
   @Export("worldMapData1Set")
   HashSet worldMapData1Set;
   @ObfuscatedName("ag")
   @Export("iconList")
   List iconList;

   WorldMapAreaData() {
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(Lsg;Lsg;IZB)V",
      garbageValue = "-7"
   )
   @Export("init")
   void init(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.read(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.worldMapData0Set = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.worldMapData0Set.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.worldMapData1Set = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.worldMapData1Set.add(var8);
      }

      this.initIconsList(var2, var4);
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(Lsg;ZI)V",
      garbageValue = "1022421975"
   )
   @Export("initIconsList")
   void initIconsList(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.readNullableLargeSmart();
         Coord var6 = new Coord(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
         }
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "1038224910"
   )
   static int method5566(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (World.friendSystem.field812 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
         } else if (World.friendSystem.field812 == 1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)World.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)World.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)World.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               LoginScreenAnimation.method2441(var5, var9);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               World.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               World.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               World.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               boolean var6 = true;
               World.friendSystem.removeIgnore(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               var5 = ModeWhere.method6952(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.isFriended(new Username(var5, class70.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (UserComparator5.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (UserComparator5.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)UserComparator5.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)UserComparator5.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChat != null ? UserComparator5.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               class478.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChat != null ? UserComparator5.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               class379.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               WorldMapData_0.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!World.friendSystem.method1845()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)World.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               var5 = ModeWhere.method6952(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.isIgnored(new Username(var5, class70.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize() && UserComparator5.friendsChat.get(var3).getUsername().equals(MusicPatchNode.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (UserComparator5.friendsChat != null && UserComparator5.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize() && ((ClanMate)UserComparator5.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  World.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     World.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     World.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     World.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     World.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (UserComparator5.friendsChat != null) {
                        UserComparator5.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (UserComparator5.friendsChat != null && var3 < UserComparator5.friendsChat.getSize() && ((ClanMate)UserComparator5.friendsChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
