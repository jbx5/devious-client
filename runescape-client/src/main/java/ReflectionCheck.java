import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 722921933
   )
   static int field257;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = -162942915
   )
   @Export("oculusOrbFocalPointY")
   static int oculusOrbFocalPointY;
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      descriptor = "Lpa;"
   )
   @Export("friendsChat")
   static FriendsChat friendsChat;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1735261113
   )
   @Export("id")
   int id;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 944398989
   )
   @Export("size")
   int size;
   @ObfuscatedName("ac")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("ab")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("an")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("ao")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("av")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("aq")
   @Export("arguments")
   byte[][][] arguments;

   ReflectionCheck() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1961992517"
   )
   public static boolean method680(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (var0 != 0) {
            char[] var1 = class365.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-983265887"
   )
   static void method678() {
      if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
         Login.currentLoginField = 1;
      } else {
         Login.currentLoginField = 0;
      }

   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "-80"
   )
   static int method679(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
         if (WorldMapCacheName.guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
            class366.field4338 = WorldMapCacheName.guestClanSettings;
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
               class366.field4338 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.name;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1692;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1697;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1694;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1695;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.memberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.memberNames[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.memberRanks[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.bannedMemberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.bannedMemberNames[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
               Interpreter.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.method3196(var3, var6, var5);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.currentOwner;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1704;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.method3255(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class366.field4338.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               class199.method3798(var6, var3);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1701[var3];
               return 1;
            } else {
               if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                  var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  WorldMapArea.method4919(var5, var3, var4);
               }

               if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1702[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                  if (class19.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     class19.field107 = class19.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     class19.field107 = Client.currentClanChannels[var3];
                     class208.field2302 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class19.field107.name;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.field1761;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.field1758;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.method3329();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).username.getName();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).rank;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).world;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  class20.method291(class208.field2302, var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.method3337(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                  Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class19.field107.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class188.field1958 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
