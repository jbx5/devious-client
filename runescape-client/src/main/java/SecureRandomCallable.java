import java.util.Locale;
import java.text.SimpleDateFormat;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.text.ParseException;
import net.runelite.rs.ScriptOpcodes;
import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("bl")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(descriptor = "Lez;")
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	SecureRandomCallable() {
	}

	public Object call() {
		return LoginScreenAnimation.method2306();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1733340953")
	public static int method2126(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(CB)C", garbageValue = "7")
	static char method2122(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/Date;", garbageValue = "57")
	static Date method2118() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field901;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				PendingSpawn.method2249("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}
			var1.append(var4);
		}
		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-1171730535")
	static int method2120(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
				WorldMapDecoration.field2816 = guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					WorldMapDecoration.field2816 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (WorldMapDecoration.field2816.allowGuests) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1631;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1619;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1632;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1621;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					TaskHandler.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.method2975(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1630;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.method3042(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.getSortedMembers()[Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					TaskHandler.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
					class341.method6285(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1627[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						TaskHandler.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
						Coord.method5543(var5, var3, var4);
					}
					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (WorldMapDecoration.field2816.field1622[var3]) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class17.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
							class390.field4425 = class17.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
							class390.field4425 = Client.currentClanChannels[var3];
							Interpreter.field836 = var3;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class390.field4425.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.field1672;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.field1676;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.method3117();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ((ClanChannelMember) (class390.field4425.members.get(var3))).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((ClanChannelMember) (class390.field4425.members.get(var3))).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((ClanChannelMember) (class390.field4425.members.get(var3))).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						WorldMapLabel.method4977(Interpreter.field836, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.method3119(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.getSortedMembers()[Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (SoundCache.field327 != null) ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1214633459")
	static final void method2125() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}
					int[] var12 = Client.queuedSoundEffectDelays;
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}
				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - class28.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - class28.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}
						int var8 = var5 + var7 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var2 = (var3 - var8) * class260.clientPreferences.method2329() / var3;
					} else {
						var2 = class260.clientPreferences.method2348();
					}
					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(Tiles.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						StructComposition.pcmStreamMixer.addSubStream(var10);
					}
					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;
				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
				}
				--var0;
			}
		}
		if (Client.playingJingle && !Varcs.method2546()) {
			if (class260.clientPreferences.method2335() != 0 && Client.currentTrackGroupId != -1) {
				FriendsChat.method6678(MouseHandler.archive6, Client.currentTrackGroupId, 0, class260.clientPreferences.method2335(), false);
			}
			Client.playingJingle = false;
		}
	}
}