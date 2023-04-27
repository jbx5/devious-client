import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sh")
public class class478 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   public static final class478 field4948 = new class478(1, 0, Integer.class, new class475());
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   public static final class478 field4947 = new class478(0, 1, Long.class, new class477());
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   public static final class478 field4946 = new class478(2, 2, String.class, new class479());
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -22191699
   )
   public final int field4949;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 454796803
   )
   public final int field4950;
   @ObfuscatedName("ab")
   public final Class field4951;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lss;"
   )
   final class474 field4952;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/Class;Lss;)V"
   )
   class478(int var1, int var2, Class var3, class474 var4) {
      this.field4949 = var1;
      this.field4950 = var2;
      this.field4951 = var3;
      this.field4952 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4950;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)Ljava/lang/Object;",
      garbageValue = "-1183771146"
   )
   public Object method8895(Buffer var1) {
      return this.field4952.vmethod8913(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "435790040"
   )
   public static void method8904(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
      if (var0.isValidFileName(var1, var2)) {
         int var5 = var0.getGroupId(var1);
         int var6 = var0.getFileId(var5, var2);
         Message.method1201(var0, var5, var6, var3, var4);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(S)Llg;",
      garbageValue = "-11844"
   )
   public static PacketBufferNode method8886() {
      PacketBufferNode var0 = SpotAnimationDefinition.method3844();
      var0.clientPacket = null;
      var0.clientPacketLength = 0;
      var0.packetBuffer = new PacketBuffer(5000);
      return var0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Lsh;",
      garbageValue = "-1831694021"
   )
   public static class478[] method8889() {
      return new class478[]{field4948, field4947, field4946};
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;S)Lsh;",
      garbageValue = "-16288"
   )
   public static class478 method8888(Class var0) {
      class478[] var1 = method8889();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class478 var3 = var1[var2];
         if (var3.field4951 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lsg;I)V",
      garbageValue = "779443646"
   )
   public static void method8906(Object var0, Buffer var1) {
      class474 var2 = method8890(var0.getClass());
      var2.vmethod8910(var0, var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;I)Lss;",
      garbageValue = "-1458293291"
   )
   static class474 method8890(Class var0) {
      class478 var1 = method8888(var0);
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return var1.field4952;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "0"
   )
   static final int method8903(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "0"
   )
   static int method8902(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
         if (ItemComposition.guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
            class133.field1597 = ItemComposition.guestClanSettings;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (Client.currentClanSettings[var3] != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               class133.field1597 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.name;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1728;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1717;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1718;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1709;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.memberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.memberNames[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.memberRanks[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.bannedMemberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.bannedMemberNames[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
               Interpreter.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.method3303(var3, var6, var5);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.currentOwner;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1733;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.method3302(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class133.field1597.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               WorldMapScaleHandler.method5589(var6, var3);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1725[var3];
               return 1;
            } else {
               if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                  var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  Clock.method3627(var5, var3, var4);
               }

               if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1734[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                  if (MouseHandler.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     class147.field1694 = MouseHandler.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     class147.field1694 = Client.currentClanChannels[var3];
                     Login.field927 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class147.field1694.name;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.field1774;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.field1768;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.method3416();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).username.getName();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).rank;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).world;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  class151.method3363(Login.field927, var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.method3415(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                  Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class147.field1694.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Players.field1339 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("nm")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "90"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (UserComparator5.friendsChat != null) {
         PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
