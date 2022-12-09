import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
   @ObfuscatedName("l")
   @Export("ByteArrayPool_arrays")
   public static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("db")
   @Export("mouseCam")
   static boolean mouseCam;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 15870629
   )
   @Export("swColor")
   int swColor;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1110971815
   )
   @Export("seColor")
   int seColor;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -489464065
   )
   @Export("neColor")
   int neColor;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -542131165
   )
   @Export("nwColor")
   int nwColor;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -813926199
   )
   @Export("texture")
   int texture;
   @ObfuscatedName("q")
   @Export("isFlat")
   boolean isFlat = true;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -235347683
   )
   @Export("rgb")
   int rgb;

   SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.swColor = var1;
      this.seColor = var2;
      this.neColor = var3;
      this.nwColor = var4;
      this.texture = var5;
      this.rgb = var6;
      this.isFlat = var7;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lrt;",
      garbageValue = "631994565"
   )
   public static PrivateChatMode method4808(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5048, PrivateChatMode.field5052, PrivateChatMode.field5047};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field5050) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "-3"
   )
   static int method4807(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
         if (class20.guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
            class126.field1573 = class20.guestClanSettings;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (Client.currentClanSettings[var3] != null) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               class126.field1573 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.name;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1728;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1729;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1734;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1731;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.memberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.memberNames[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.memberRanks[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.bannedMemberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.bannedMemberNames[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
               class87.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.method3167(var3, var6, var5);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.currentOwner;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1740;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.method3164(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = class126.field1573.getSortedMembers()[Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
               class87.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               Archive.method6455(var6, var3);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1720[var3];
               return 1;
            } else {
               if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                  class87.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                  boolean var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1;
                  var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
                  FaceNormal.method4620(var5, var3, var4);
               }

               if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1724[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                  if (VarcInt.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
                     VarcInt.field1956 = VarcInt.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
                     VarcInt.field1956 = Client.currentClanChannels[var3];
                     class13.field78 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = VarcInt.field1956.name;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.field1799;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.field1796;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.method3312();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).username.getName();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).rank;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).world;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  ScriptFrame.method1171(class13.field78, var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.method3313(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                  Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = VarcInt.field1956.getSortedMembers()[Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = LoginScreenAnimation.field1286 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
