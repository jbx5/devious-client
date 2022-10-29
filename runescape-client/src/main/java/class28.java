import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ah")
public class class28 {
   @ObfuscatedName("y")
   int[] field147 = new int[112];
   @ObfuscatedName("d")
   int[] field150 = new int[192];

   public class28() {
      Arrays.fill(this.field147, 3);
      Arrays.fill(this.field150, 3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1269143537"
   )
   public void method406(int var1, int var2) {
      if (this.method414(var1) && this.method416(var2)) {
         this.field147[var1] = var2;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(CIB)V",
      garbageValue = "0"
   )
   public void method407(char var1, int var2) {
      if (this.method415(var1) && this.method416(var2)) {
         this.field150[var1] = var2;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "972993186"
   )
   public int method408(int var1) {
      return this.method414(var1) ? this.field147[var1] : 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(CI)I",
      garbageValue = "1124483937"
   )
   public int method409(char var1) {
      return this.method415(var1) ? this.field150[var1] : 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "116"
   )
   public boolean method410(int var1) {
      return this.method414(var1) && (this.field147[var1] == 1 || this.field147[var1] == 3);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-180910111"
   )
   public boolean method411(char var1) {
      return this.method415(var1) && (this.field150[var1] == 1 || this.field150[var1] == 3);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "24"
   )
   public boolean method429(int var1) {
      return this.method414(var1) && (this.field147[var1] == 2 || this.field147[var1] == 3);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "-81"
   )
   public boolean method426(char var1) {
      return this.method415(var1) && (this.field150[var1] == 2 || this.field150[var1] == 3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1950313002"
   )
   boolean method414(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1876294645"
   )
   boolean method415(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-932884797"
   )
   boolean method416(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)Ljava/lang/String;",
      garbageValue = "-1762701914"
   )
   static String method435(Buffer var0, int var1) {
      try {
         int var2 = var0.readUShortSmart();
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class305.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
         String var4 = class125.decodeStringCp1252(var3, 0, var2);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "302513748"
   )
   public static int method442(int var0, int var1, int var2) {
      int var3 = Archive.method6338(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "588461440"
   )
   static int method412(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (WallDecoration.friendSystem.field814 == 0) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -2;
         } else if (WallDecoration.friendSystem.field814 == 1) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WallDecoration.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (WallDecoration.friendSystem.method1818() && var3 >= 0 && var3 < WallDecoration.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)WallDecoration.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (WallDecoration.friendSystem.method1818() && var3 >= 0 && var3 < WallDecoration.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)WallDecoration.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (WallDecoration.friendSystem.method1818() && var3 >= 0 && var3 < WallDecoration.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)WallDecoration.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               int var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               KitDefinition.method3475(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               WallDecoration.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               WallDecoration.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               WallDecoration.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               WallDecoration.friendSystem.removeIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               var5 = ItemLayer.method4055(var5);
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WallDecoration.friendSystem.isFriended(new Username(var5, ViewportMouse.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (MenuAction.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (MenuAction.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)MenuAction.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)MenuAction.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChat != null ? MenuAction.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               DevicePcmPlayerProvider.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChat != null ? MenuAction.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               class197.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               class130.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!WallDecoration.friendSystem.method1818()) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WallDecoration.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (WallDecoration.friendSystem.method1818() && var3 >= 0 && var3 < WallDecoration.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)WallDecoration.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               var5 = ItemLayer.method4055(var5);
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WallDecoration.friendSystem.isIgnored(new Username(var5, ViewportMouse.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize() && MenuAction.friendsChat.get(var3).getUsername().equals(class296.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (MenuAction.friendsChat != null && MenuAction.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize() && ((ClanMate)MenuAction.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  WallDecoration.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     WallDecoration.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     WallDecoration.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     WallDecoration.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     WallDecoration.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (MenuAction.friendsChat != null) {
                        MenuAction.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (MenuAction.friendsChat != null && var3 < MenuAction.friendsChat.getSize() && ((ClanMate)MenuAction.friendsChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1989988479"
   )
   @Export("load")
   static void load() {
      int var29;
      if (Client.titleLoadingStage == 0) {
         class139.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var29 = 0; var29 < 4; ++var29) {
            Client.collisionMaps[var29] = new CollisionMap(104, 104);
         }

         Calendar.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         class150.archive5 = Varps.newArchive(0, false, true, true, false);
         MouseHandler.field251 = Varps.newArchive(1, false, true, true, false);
         class157.archive2 = Varps.newArchive(2, true, false, true, false);
         PlayerType.archive7 = Varps.newArchive(3, false, true, true, false);
         Canvas.archive4 = Varps.newArchive(4, false, true, true, false);
         SecureRandomFuture.archive9 = Varps.newArchive(5, true, true, true, false);
         ReflectionCheck.archive6 = Varps.newArchive(6, true, true, true, false);
         WorldMapSectionType.archive11 = Varps.newArchive(7, false, true, true, false);
         class142.archive8 = Varps.newArchive(8, false, true, true, false);
         Client.field522 = Varps.newArchive(9, false, true, true, false);
         WorldMapRegion.archive10 = Varps.newArchive(10, false, true, true, false);
         class7.field32 = Varps.newArchive(11, false, true, true, false);
         class188.archive12 = Varps.newArchive(12, false, true, true, false);
         class143.archive13 = Varps.newArchive(13, true, false, true, false);
         ChatChannel.archive14 = Varps.newArchive(14, false, true, true, false);
         ClanChannel.archive15 = Varps.newArchive(15, false, true, true, false);
         class382.archive17 = Varps.newArchive(17, true, true, true, false);
         NetCache.archive18 = Varps.newArchive(18, false, true, true, false);
         class310.archive19 = Varps.newArchive(19, false, true, true, false);
         class139.archive20 = Varps.newArchive(20, false, true, true, false);
         class250.field2930 = Varps.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage == 40) {
         byte var39 = 0;
         var29 = var39 + class150.archive5.percentage() * 4 / 100;
         var29 += MouseHandler.field251.percentage() * 4 / 100;
         var29 += class157.archive2.percentage() * 2 / 100;
         var29 += PlayerType.archive7.percentage() * 2 / 100;
         var29 += Canvas.archive4.percentage() * 6 / 100;
         var29 += SecureRandomFuture.archive9.percentage() * 4 / 100;
         var29 += ReflectionCheck.archive6.percentage() * 2 / 100;
         var29 += WorldMapSectionType.archive11.percentage() * 55 / 100;
         var29 += class142.archive8.percentage() * 2 / 100;
         var29 += Client.field522.percentage() * 2 / 100;
         var29 += WorldMapRegion.archive10.percentage() * 2 / 100;
         var29 += class7.field32.percentage() * 2 / 100;
         var29 += class188.archive12.percentage() * 2 / 100;
         var29 += class143.archive13.percentage() * 2 / 100;
         var29 += ChatChannel.archive14.percentage() * 2 / 100;
         var29 += ClanChannel.archive15.percentage() * 2 / 100;
         var29 += class310.archive19.percentage() / 100;
         var29 += NetCache.archive18.percentage() / 100;
         var29 += class139.archive20.percentage() / 100;
         var29 += class250.field2930.percentage() / 100;
         var29 += class382.archive17.method6294() && class382.archive17.isFullyLoaded() ? 1 : 0;
         if (var29 != 100) {
            if (var29 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var29 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            WorldMapID.method5166(class150.archive5, "Animations");
            WorldMapID.method5166(MouseHandler.field251, "Skeletons");
            WorldMapID.method5166(Canvas.archive4, "Sound FX");
            WorldMapID.method5166(SecureRandomFuture.archive9, "Maps");
            WorldMapID.method5166(ReflectionCheck.archive6, "Music Tracks");
            WorldMapID.method5166(WorldMapSectionType.archive11, "Models");
            WorldMapID.method5166(class142.archive8, "Sprites");
            WorldMapID.method5166(class7.field32, "Music Jingles");
            WorldMapID.method5166(ChatChannel.archive14, "Music Samples");
            WorldMapID.method5166(ClanChannel.archive15, "Music Patches");
            WorldMapID.method5166(class310.archive19, "World Map");
            WorldMapID.method5166(NetCache.archive18, "World Map Geography");
            WorldMapID.method5166(class139.archive20, "World Map Ground");
            PlayerCompositionColorTextureOverride.spriteIds = new GraphicsDefaults();
            PlayerCompositionColorTextureOverride.spriteIds.decode(class382.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      } else if (Client.titleLoadingStage == 45) {
         class157.method3235(22050, !Client.isLowDetail, 2);
         MidiPcmStream var36 = new MidiPcmStream();
         var36.method5480(9, 128);
         HealthBar.pcmPlayer0 = TextureProvider.method4500(GameEngine.taskHandler, 0, 22050);
         HealthBar.pcmPlayer0.setStream(var36);
         class248.method5161(ClanChannel.archive15, ChatChannel.archive14, Canvas.archive4, var36);
         class86.pcmPlayer1 = TextureProvider.method4500(GameEngine.taskHandler, 1, 2048);
         class453.pcmStreamMixer = new PcmStreamMixer();
         class86.pcmPlayer1.setStream(class453.pcmStreamMixer);
         FaceNormal.decimator = new Decimator(22050, SoundCache.field337);
         Login.Login_loadingText = "Prepared sound engine";
         Login.Login_loadingPercent = 35;
         Client.titleLoadingStage = 50;
         class87.WorldMapElement_fonts = new Fonts(class142.archive8, class143.archive13);
      } else if (Client.titleLoadingStage == 50) {
         var29 = FontName.method8076().length;
         Client.fontsMap = class87.WorldMapElement_fonts.createMap(FontName.method8076());
         if (Client.fontsMap.size() < var29) {
            Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var29 + "%";
            Login.Login_loadingPercent = 40;
         } else {
            ModeWhere.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
            Language.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
            UserComparator3.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
            class202.platformInfo = Client.platformInfoProvider.get();
            Login.Login_loadingText = "Loaded fonts";
            Login.Login_loadingPercent = 40;
            Client.titleLoadingStage = 60;
         }
      } else {
         int var3;
         Archive var30;
         Archive var31;
         int var37;
         if (Client.titleLoadingStage == 60) {
            var30 = WorldMapRegion.archive10;
            var31 = class142.archive8;
            var3 = 0;
            String[] var33 = Login.field928;

            int var34;
            String var38;
            for(var34 = 0; var34 < var33.length; ++var34) {
               var38 = var33[var34];
               if (var30.tryLoadFileByNames(var38, "")) {
                  ++var3;
               }
            }

            var33 = Login.field911;

            for(var34 = 0; var34 < var33.length; ++var34) {
               var38 = var33[var34];
               if (var31.tryLoadFileByNames(var38, "")) {
                  ++var3;
               }
            }

            var37 = Login.field911.length + Login.field928.length;
            if (var3 < var37) {
               Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var37 + "%";
               Login.Login_loadingPercent = 50;
            } else {
               Login.Login_loadingText = "Loaded title screen";
               Login.Login_loadingPercent = 50;
               class21.updateGameState(5);
               Client.titleLoadingStage = 70;
            }
         } else if (Client.titleLoadingStage != 70) {
            if (Client.titleLoadingStage == 80) {
               var29 = 0;
               if (BuddyRankComparator.compass == null) {
                  BuddyRankComparator.compass = FriendsList.SpriteBuffer_getSprite(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.compass, 0);
               } else {
                  ++var29;
               }

               if (class150.redHintArrowSprite == null) {
                  class150.redHintArrowSprite = FriendsList.SpriteBuffer_getSprite(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4536, 0);
               } else {
                  ++var29;
               }

               if (HealthBar.mapSceneSprites == null) {
                  HealthBar.mapSceneSprites = class147.method3146(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.mapScenes, 0);
               } else {
                  ++var29;
               }

               if (Renderable.headIconPkSprites == null) {
                  Renderable.headIconPkSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.headIconsPk, 0);
               } else {
                  ++var29;
               }

               if (class278.headIconPrayerSprites == null) {
                  class278.headIconPrayerSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4538, 0);
               } else {
                  ++var29;
               }

               if (class162.headIconHintSprites == null) {
                  class162.headIconHintSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4539, 0);
               } else {
                  ++var29;
               }

               if (WorldMapLabelSize.mapMarkerSprites == null) {
                  WorldMapLabelSize.mapMarkerSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4540, 0);
               } else {
                  ++var29;
               }

               if (class199.crossSprites == null) {
                  class199.crossSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4541, 0);
               } else {
                  ++var29;
               }

               if (Decimator.mapDotSprites == null) {
                  Decimator.mapDotSprites = BufferedSource.method7532(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4542, 0);
               } else {
                  ++var29;
               }

               if (WorldMap.scrollBarSprites == null) {
                  WorldMap.scrollBarSprites = class147.method3146(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4543, 0);
               } else {
                  ++var29;
               }

               if (UserComparator4.modIconSprites == null) {
                  UserComparator4.modIconSprites = class147.method3146(class142.archive8, PlayerCompositionColorTextureOverride.spriteIds.field4544, 0);
               } else {
                  ++var29;
               }

               if (var29 < 11) {
                  Login.Login_loadingText = "Loading sprites - " + var29 * 100 / 12 + "%";
                  Login.Login_loadingPercent = 70;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = UserComparator4.modIconSprites;
                  class150.redHintArrowSprite.normalize();
                  int var1 = (int)(Math.random() * 21.0) - 10;
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  var3 = (int)(Math.random() * 21.0) - 10;
                  var37 = (int)(Math.random() * 41.0) - 20;
                  HealthBar.mapSceneSprites[0].shiftColors(var1 + var37, var2 + var37, var37 + var3);
                  Login.Login_loadingText = "Loaded sprites";
                  Login.Login_loadingPercent = 70;
                  Client.titleLoadingStage = 90;
               }
            } else if (Client.titleLoadingStage == 90) {
               if (!Client.field522.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading textures - " + "0%";
                  Login.Login_loadingPercent = 90;
               } else {
                  class6.textureProvider = new TextureProvider(Client.field522, class142.archive8, 20, BufferedSink.clientPreferences.method2392(), Client.isLowDetail ? 64 : 128);
                  Rasterizer3D.Rasterizer3D_setTextureLoader(class6.textureProvider);
                  Rasterizer3D.Rasterizer3D_setBrightness(BufferedSink.clientPreferences.method2392());
                  Client.titleLoadingStage = 100;
               }
            } else if (Client.titleLoadingStage == 100) {
               var29 = class6.textureProvider.getLoadedPercentage();
               if (var29 < 100) {
                  Login.Login_loadingText = "Loading textures - " + var29 + "%";
                  Login.Login_loadingPercent = 90;
               } else {
                  Login.Login_loadingText = "Loaded textures";
                  Login.Login_loadingPercent = 90;
                  Client.titleLoadingStage = 110;
               }
            } else if (Client.titleLoadingStage == 110) {
               GrandExchangeOfferOwnWorldComparator.mouseRecorder = new MouseRecorder();
               GameEngine.taskHandler.newThreadTask(GrandExchangeOfferOwnWorldComparator.mouseRecorder, 10);
               Login.Login_loadingText = "Loaded input handler";
               Login.Login_loadingPercent = 92;
               Client.titleLoadingStage = 120;
            } else if (Client.titleLoadingStage == 120) {
               if (!WorldMapRegion.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                  Login.Login_loadingPercent = 94;
               } else {
                  Huffman var35 = new Huffman(WorldMapRegion.archive10.takeFileByNames("huffman", ""));
                  class305.huffman = var35;
                  Login.Login_loadingText = "Loaded wordpack";
                  Login.Login_loadingPercent = 94;
                  Client.titleLoadingStage = 130;
               }
            } else if (Client.titleLoadingStage == 130) {
               if (!PlayerType.archive7.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + PlayerType.archive7.loadPercent() * 4 / 5 + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class188.archive12.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (80 + class188.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class143.archive13.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (96 + class143.archive13.loadPercent() / 50) + "%";
                  Login.Login_loadingPercent = 96;
               } else {
                  Login.Login_loadingText = "Loaded interfaces";
                  Login.Login_loadingPercent = 98;
                  Client.titleLoadingStage = 140;
               }
            } else if (Client.titleLoadingStage == 140) {
               Login.Login_loadingPercent = 100;
               if (!class310.archive19.tryLoadGroupByName(WorldMapCacheName.field2954.name)) {
                  Login.Login_loadingText = "Loading world map - " + class310.archive19.groupLoadPercentByName(WorldMapCacheName.field2954.name) / 10 + "%";
               } else {
                  if (class7.worldMap == null) {
                     class7.worldMap = new WorldMap();
                     class7.worldMap.init(class310.archive19, NetCache.archive18, class139.archive20, UserComparator3.fontBold12, Client.fontsMap, HealthBar.mapSceneSprites);
                  }

                  Login.Login_loadingText = "Loaded world map";
                  Client.titleLoadingStage = 150;
               }
            } else if (Client.titleLoadingStage == 150) {
               class21.updateGameState(10);
            }
         } else if (!class157.archive2.isFullyLoaded()) {
            Login.Login_loadingText = "Loading config - " + class157.archive2.loadPercent() + "%";
            Login.Login_loadingPercent = 60;
         } else if (!class250.field2930.isFullyLoaded()) {
            Login.Login_loadingText = "Loading config - " + (80 + class188.archive12.loadPercent() / 6) + "%";
            Login.Login_loadingPercent = 60;
         } else {
            WorldMapIcon_0.method5070(class157.archive2);
            class270.method5370(class157.archive2);
            Archive var0 = class157.archive2;
            var30 = WorldMapSectionType.archive11;
            KitDefinition.KitDefinition_archive = var0;
            KitDefinition.KitDefinition_modelsArchive = var30;
            KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
            var31 = class157.archive2;
            Archive var32 = WorldMapSectionType.archive11;
            boolean var4 = Client.isLowDetail;
            ObjectComposition.ObjectDefinition_archive = var31;
            ObjectComposition.ObjectDefinition_modelsArchive = var32;
            ObjectComposition.ObjectDefinition_isLowDetail = var4;
            Archive var5 = class157.archive2;
            Archive var6 = WorldMapSectionType.archive11;
            NPCComposition.NpcDefinition_archive = var5;
            NPCComposition.NpcDefinition_modelArchive = var6;
            Archive var7 = class157.archive2;
            StructComposition.StructDefinition_archive = var7;
            Archive var8 = class157.archive2;
            Archive var9 = WorldMapSectionType.archive11;
            boolean var10 = Client.isMembersWorld;
            Font var11 = ModeWhere.fontPlain11;
            SpriteMask.ItemDefinition_archive = var8;
            ItemComposition.ItemDefinition_modelArchive = var9;
            class1.ItemDefinition_inMembersWorld = var10;
            WorldMapArchiveLoader.ItemDefinition_fileCount = SpriteMask.ItemDefinition_archive.getGroupFileCount(10);
            class139.ItemDefinition_fontPlain11 = var11;
            Archive var12 = class157.archive2;
            Archive var13 = class150.archive5;
            Archive var14 = MouseHandler.field251;
            SequenceDefinition.SequenceDefinition_archive = var12;
            class34.SequenceDefinition_animationsArchive = var13;
            SequenceDefinition.SequenceDefinition_skeletonsArchive = var14;
            Archive var15 = class157.archive2;
            Archive var16 = WorldMapSectionType.archive11;
            SpotAnimationDefinition.SpotAnimationDefinition_archive = var15;
            SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var16;
            Players.method2587(class157.archive2);
            Archive var17 = class157.archive2;
            VarpDefinition.VarpDefinition_archive = var17;
            VarpDefinition.field1866 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
            Archive var18 = PlayerType.archive7;
            Archive var19 = WorldMapSectionType.archive11;
            Archive var20 = class142.archive8;
            Archive var21 = class143.archive13;
            UserComparator8.Widget_archive = var18;
            class188.Widget_modelsArchive = var19;
            MusicPatchPcmStream.Widget_spritesArchive = var20;
            WorldMapManager.Widget_fontsArchive = var21;
            Widget.Widget_interfaceComponents = new Widget[UserComparator8.Widget_archive.getGroupCount()][];
            MusicPatchPcmStream.Widget_loadedInterfaces = new boolean[UserComparator8.Widget_archive.getGroupCount()];
            ReflectionCheck.method716(class157.archive2);
            Archive var22 = class157.archive2;
            EnumComposition.EnumDefinition_archive = var22;
            class17.method228(class157.archive2);
            Archive var23 = class157.archive2;
            class277.method5401(class157.archive2);
            Archive var24 = class157.archive2;
            DbTableType.field4841 = var24;
            Friend.method7303(class157.archive2);
            PcmPlayer.HitSplatDefinition_cachedSprites = new class448(class376.field4411, 54, class103.clientLanguage, class157.archive2);
            class203.HitSplatDefinition_cached = new class448(class376.field4411, 47, class103.clientLanguage, class157.archive2);
            Projectile.varcs = new Varcs();
            class141.method3036(class157.archive2, class142.archive8, class143.archive13);
            ScriptFrame.method1134(class157.archive2, class142.archive8);
            Archive var25 = class157.archive2;
            Archive var26 = class142.archive8;
            WorldMapElement.WorldMapElement_archive = var26;
            if (var25.isFullyLoaded()) {
               WorldMapElement.WorldMapElement_count = var25.getGroupFileCount(35);
               WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

               for(int var27 = 0; var27 < WorldMapElement.WorldMapElement_count; ++var27) {
                  byte[] var28 = var25.takeFile(35, var27);
                  WorldMapElement.WorldMapElement_cached[var27] = new WorldMapElement(var27);
                  if (var28 != null) {
                     WorldMapElement.WorldMapElement_cached[var27].decode(new Buffer(var28));
                     WorldMapElement.WorldMapElement_cached[var27].method3436();
                  }
               }
            }

            Login.Login_loadingText = "Loaded config";
            Login.Login_loadingPercent = 60;
            Client.titleLoadingStage = 80;
         }
      }
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "92"
   )
   @Export("formatItemStacks")
   static final String formatItemStacks(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + GameObject.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + GameObject.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + GameObject.colorStartTag(16776960) + var1 + "</col>";
      }
   }
}
