import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gh")
public class class168 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "692637456"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "677617915"
	)
	static int method3511(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class142.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
				class562.field5476 = class142.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					class562.field5476 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1766;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1767;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1768;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1769;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class130.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.method3352(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1784;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.method3409(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = class562.field5476.getSortedMembers()[Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					Projection.method5746(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class130.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
						UrlRequest.method2985(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1776[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (Tile.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
							HorizontalAlignment.field1973 = Tile.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
							HorizontalAlignment.field1973 = Client.currentClanChannels[var3];
							class534.field5285 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = HorizontalAlignment.field1973.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.field1817;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.field1823;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.method3501();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						class108.method2811(class534.field5285, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.method3484(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.getSortedMembers()[Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = PendingSpawn.field1171 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "27920"
	)
	static void method3509(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
