import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
   @ObfuscatedName("aj")
   @Export("reversed")
   final boolean reversed;

   public UserComparator9(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Lpt;I)I",
      garbageValue = "-364074758"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lkb;Ltk;B)Lkp;",
      garbageValue = "-55"
   )
   @Export("getPacketBufferNode")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2;
      if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
         var2 = new PacketBufferNode();
      } else {
         var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
      }

      var2.clientPacket = var0;
      var2.clientPacketLength = var0.length;
      if (var2.clientPacketLength == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.clientPacketLength == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.clientPacketLength <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.clientPacketLength <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
      var2.index = 0;
      return var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Leu;",
      garbageValue = "367893193"
   )
   static class128 method2874(int var0) {
      class128 var1 = (class128)SpriteMask.findEnumerated(class133.method3040(), var0);
      if (var1 == null) {
         var1 = class128.field1523;
      }

      return var1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "-1029034306"
   )
   static int method2876(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (class6.friendSystem.field799 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
         } else if (class6.friendSystem.field799 == 1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)class6.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class6.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class6.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               VarbitComposition.method3766(var5, var9);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               class6.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               class6.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               class6.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               boolean var6 = true;
               class6.friendSystem.removeIgnore(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               var5 = ItemComposition.method3982(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.isFriended(new Username(var5, Occluder.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (ReflectionCheck.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (ReflectionCheck.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChat != null ? ReflectionCheck.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               SoundCache.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChat != null ? ReflectionCheck.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               class72.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               ClanChannelMember.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!class6.friendSystem.method1888()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)class6.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               var5 = ItemComposition.method3982(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.isIgnored(new Username(var5, Occluder.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize() && ReflectionCheck.friendsChat.get(var3).getUsername().equals(BuddyRankComparator.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (ReflectionCheck.friendsChat != null && ReflectionCheck.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize() && ((ClanMate)ReflectionCheck.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  class6.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     class6.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     class6.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     class6.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class6.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (ReflectionCheck.friendsChat != null) {
                        ReflectionCheck.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ReflectionCheck.friendsChat != null && var3 < ReflectionCheck.friendsChat.getSize() && ((ClanMate)ReflectionCheck.friendsChat.get(var3)).isIgnored()) {
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
