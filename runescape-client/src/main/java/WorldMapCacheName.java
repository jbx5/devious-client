import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   public static final WorldMapCacheName field3010 = new WorldMapCacheName("details");
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   public static final WorldMapCacheName field3005 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   public static final WorldMapCacheName field3009 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   static final WorldMapCacheName field3007 = new WorldMapCacheName("area");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   public static final WorldMapCacheName field3004 = new WorldMapCacheName("labels");
   @ObfuscatedName("q")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "1974028758"
   )
   static int method5339(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (DefaultsGroup.friendSystem.field833 == 0) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -2;
         } else if (DefaultsGroup.friendSystem.field833 == 1) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)DefaultsGroup.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)DefaultsGroup.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)DefaultsGroup.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               int var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               class159.method3339(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               DefaultsGroup.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               DefaultsGroup.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               DefaultsGroup.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               DefaultsGroup.friendSystem.removeIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var5 = class282.method5507(var5);
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.isFriended(new Username(var5, SecureRandomFuture.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (class281.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (class281.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)class281.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)class281.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChat != null ? class281.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               ReflectionCheck.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChat != null ? class281.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               Friend.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               class7.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!DefaultsGroup.friendSystem.method1827()) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)DefaultsGroup.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var5 = class282.method5507(var5);
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.isIgnored(new Username(var5, SecureRandomFuture.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize() && class281.friendsChat.get(var3).getUsername().equals(class155.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (class281.friendsChat != null && class281.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize() && ((ClanMate)class281.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  DefaultsGroup.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     DefaultsGroup.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     DefaultsGroup.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     DefaultsGroup.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class281.friendsChat != null) {
                        class281.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class281.friendsChat != null) {
                        class281.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     DefaultsGroup.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (class281.friendsChat != null) {
                        class281.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (class281.friendsChat != null && var3 < class281.friendsChat.getSize() && ((ClanMate)class281.friendsChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "-606090063"
   )
   @Export("decompressBytes")
   static final byte[] decompressBytes(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if (var3 < 0 || AbstractArchive.field4213 != 0 && var3 > AbstractArchive.field4213) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var6 = new byte[var3];
         var1.readBytes(var6, 0, var3);
         return var6;
      } else {
         int var4 = var1.readInt();
         if (var4 >= 0 && (AbstractArchive.field4213 == 0 || var4 <= AbstractArchive.field4213)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
            } else {
               AbstractArchive.gzipDecompressor.decompress(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
