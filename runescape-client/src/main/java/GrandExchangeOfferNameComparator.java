import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;B)I",
		garbageValue = "2"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1685080965"
	)
	static int method7670(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (WorldMapSectionType.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
				DirectByteArrayCopier.field4026 = WorldMapSectionType.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					DirectByteArrayCopier.field4026 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field4026.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1769;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1770;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1771;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1772;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field4026.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field4026.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class320.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.method3578(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1781;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.method3605(Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.getSortedMembers()[Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					class215.method4393(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class320.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
						SoundCache.method888(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field4026.field1779[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class166.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
							PendingSpawn.field1220 = class166.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
							PendingSpawn.field1220 = Client.currentClanChannels[var3];
							class60.field428 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = PendingSpawn.field1220.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = PendingSpawn.field1220.field1833;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = PendingSpawn.field1220.field1839;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = PendingSpawn.field1220.method3726();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = ((ClanChannelMember)PendingSpawn.field1220.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((ClanChannelMember)PendingSpawn.field1220.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ((ClanChannelMember)PendingSpawn.field1220.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						WorldMapLabelSize.method5757(class60.field428, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = PendingSpawn.field1220.method3727(Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = PendingSpawn.field1220.getSortedMembers()[Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = WorldMapData_0.field3064 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
