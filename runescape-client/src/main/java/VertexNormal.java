import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jx")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1399236901
   )
   @Export("x")
   int x;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -817517075
   )
   @Export("y")
   int y;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -760419501
   )
   @Export("z")
   int z;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -180792829
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Ljx;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(DDIS)[D",
      garbageValue = "512"
   )
   public static double[] method4921(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         double var15 = ((double)var7 - var0) / var2;
         double var13 = Math.exp(-var15 * var15 / 2.0) / Math.sqrt(6.283185307179586);
         double var11 = var13 / var2;
         var6[var8] = var11;
         ++var7;
      }

      return var6;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1596696575"
   )
   static final int method4920() {
      return ViewportMouse.ViewportMouse_x;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1251567358"
   )
   static int method4922(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
         if (class389.guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
            class309.field3452 = class389.guestClanSettings;
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
               class309.field3452 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.name;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1694;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1695;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1709;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1697;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.memberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.memberNames[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.memberRanks[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.bannedMemberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.bannedMemberNames[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
               Interpreter.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.method3266(var3, var6, var5);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.currentOwner;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1706;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.method3200(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class309.field3452.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               ChatChannel.method2157(var6, var3);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1703[var3];
               return 1;
            } else {
               if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                  var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  GrandExchangeOfferOwnWorldComparator.method1194(var5, var3, var4);
               }

               if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1704[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                  if (VerticalAlignment.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     Interpreter.field872 = VerticalAlignment.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     Interpreter.field872 = Client.currentClanChannels[var3];
                     Interpreter.field865 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.field872.name;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.field1767;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.field1766;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.method3346();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).username.getName();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).rank;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).world;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  class300.method5688(Interpreter.field865, var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.method3338(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                  Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class127.field1495 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2021351329"
   )
   static final void method4919() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            DirectByteArrayCopier.method6568(var0);
         } else {
            var0.remove();
         }
      }

   }
}
