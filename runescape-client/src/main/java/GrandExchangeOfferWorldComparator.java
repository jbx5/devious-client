import java.util.Comparator;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lf")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 658311943)
    static int field3948;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lld;Lld;I)I", garbageValue = "-1656511923")
    @Export("compare_bridged")
    int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
        return var1.world < var2.world ? -1 : var2.world == var1.world ? 0 : 1;
    }

    public int compare(Object var1, Object var2) {
        return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "2040028636")
    static int method5724(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
            if (UserComparator7.guestClanSettings != null) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                WorldMapSection0.field2713 = UserComparator7.guestClanSettings;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            }
            return 1;
        } else {
            int var3;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if (Client.currentClanSettings[var3] != null) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    WorldMapSection0.field2713 = Client.currentClanSettings[var3];
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                }
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = WorldMapSection0.field2713.name;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (WorldMapSection0.field2713.allowGuests) ? 1 : 0;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1593;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1594;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1595;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1596;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.memberCount;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = WorldMapSection0.field2713.memberNames[var3];
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.memberRanks[var3];
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.bannedMemberCount;
                return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = WorldMapSection0.field2713.bannedMemberNames[var3];
                return 1;
            } else {
                int var5;
                int var6;
                if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
                    Interpreter.Interpreter_intStackSize -= 3;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                    var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.method2849(var3, var6, var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.currentOwner;
                    return 1;
                } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1591;
                    return 1;
                } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.method2848(Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]);
                    return 1;
                } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
                    Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
                    return 1;
                } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                    var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    class117.method2654(var6, var3);
                    return 1;
                } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSection0.field2713.field1602[var3];
                    return 1;
                } else {
                    if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                        Interpreter.Interpreter_intStackSize -= 3;
                        var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                        var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                        HealthBarDefinition.method3225(var5, var3, var4);
                    }
                    if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (WorldMapSection0.field2713.field1611[var3]) ? 1 : 0;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                        if (InterfaceParent.guestClanChannel != null) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                            class13.field78 = InterfaceParent.guestClanChannel;
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        }
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        if (Client.currentClanChannels[var3] != null) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                            class13.field78 = Client.currentClanChannels[var3];
                            Decimator.field412 = var3;
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        }
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = class13.field78.name;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class13.field78.field1658;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class13.field78.field1656;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class13.field78.method2982();
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = ((ClanChannelMember) (class13.field78.members.get(var3))).username.getName();
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (class13.field78.members.get(var3))).rank;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (class13.field78.members.get(var3))).world;
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        StructComposition.method3410(Decimator.field412, var3);
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class13.field78.method2984(Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]);
                        return 1;
                    } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                        Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class13.field78.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
                        return 1;
                    } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class221.field2680 != null) ? 1 : 0;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }
}