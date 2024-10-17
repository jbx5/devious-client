import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class143 {
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZS)I",
		garbageValue = "22250"
	)
	static int method3501(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (Client.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
				AccessFile.field5352 = Client.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
					AccessFile.field5352 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = AccessFile.field5352.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1772;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1776;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1790;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1775;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = AccessFile.field5352.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = AccessFile.field5352.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class96.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.method3701(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1784;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.method3695(Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = AccessFile.field5352.getSortedMembers()[Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					GrandExchangeOfferOwnWorldComparator.method1272(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class96.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
						class328.method6532(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = AccessFile.field5352.field1773[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class158.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
							SoundCache.field294 = class158.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
							SoundCache.field294 = Client.currentClanChannels[var3];
							Interpreter.field862 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = SoundCache.field294.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SoundCache.field294.field1845;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SoundCache.field294.field1841;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SoundCache.field294.method3786();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = ((ClanChannelMember)SoundCache.field294.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((ClanChannelMember)SoundCache.field294.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ((ClanChannelMember)SoundCache.field294.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						World.method2000(Interpreter.field862, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SoundCache.field294.method3791(Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = SoundCache.field294.getSortedMembers()[Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class544.field5379 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
