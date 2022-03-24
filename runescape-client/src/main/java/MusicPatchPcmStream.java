



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lje;")

	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Laa;")

	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(descriptor = 
	"(Lje;)V")

	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lju;[IIIII)V", garbageValue = 
	"710104322")

	void method5470(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if (((this.superStream.field3200[var1.field3240] & 4) != 0) && (var1.field3253 < 0)) {
			int var6 = this.superStream.field3202[var1.field3240] / SecureRandomFuture.field949;

			while (true) {
				int var7 = ((var6 + 1048575) - var1.field3239) / var6;
				if (var7 > var4) {
					var1.field3239 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3239 += (var7 * var6) - 1048576;
				int var8 = SecureRandomFuture.field949 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3190[var1.field3240] == 0) {
					var1.stream = RawPcmStream.method924(var1.rawSound, var10.method838(), var10.method865(), var10.method822());
				} else {
					var1.stream = RawPcmStream.method924(var1.rawSound, var10.method838(), 0, var10.method822());
					this.superStream.method5285(var1, var1.patch.field3228[var1.field3244] < 0);
					var1.stream.method826(var8, var10.method865());
				}

				if (var1.patch.field3228[var1.field3244] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method828(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method832()) {
					this.mixer.addSubStream(var10);
				}
			} 
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lju;IB)V", garbageValue = 
	"0")

	void method5471(MusicPatchNode var1, int var2) {
		if (((this.superStream.field3200[var1.field3240] & 4) != 0) && (var1.field3253 < 0)) {
			int var3 = this.superStream.field3202[var1.field3240] / SecureRandomFuture.field949;
			int var4 = ((var3 + 1048575) - var1.field3239) / var3;
			var1.field3239 = ((var3 * var2) + var1.field3239) & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3190[var1.field3240] == 0) {
					var1.stream = RawPcmStream.method924(var1.rawSound, var1.stream.method838(), var1.stream.method865(), var1.stream.method822());
				} else {
					var1.stream = RawPcmStream.method924(var1.rawSound, var1.stream.method838(), 0, var1.stream.method822());
					this.superStream.method5285(var1, var1.patch.field3228[var1.field3244] < 0);
				}

				if (var1.patch.field3228[var1.field3244] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3239 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
		if (var1 == null) {
			return null;
		} else {
			return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = ((MusicPatchNode) (this.queue.previous()));
			if (var1 == null) {
				return null;
			}
		} while (var1.stream == null );

		return var1.stream;
	}

	@ObfuscatedName("f")
	protected int vmethod5476() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5307(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3256) {
						this.method5470(var6, var1, var4, var5, var5 + var4);
						var6.field3256 -= var5;
						break;
					}

					this.method5470(var6, var1, var4, var6.field3256, var5 + var4);
					var4 += var6.field3256;
					var5 -= var6.field3256;
				} while (!this.superStream.method5396(var6, var1, var4, var5) );
			}
		}

	}

	@ObfuscatedName("k")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5307(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3256) {
						this.method5471(var3, var2);
						var3.field3256 -= var2;
						break;
					}

					this.method5471(var3, var3.field3256);
					var2 -= var3.field3256;
				} while (!this.superStream.method5396(var3, ((int[]) (null)), 0, var2) );
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZB)I", garbageValue = 
	"96")

	static int method5485(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class134.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
				class129.field1535 = class134.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					class129.field1535 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class129.field1535.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class129.field1535.allowGuests) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1602;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1603;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1604;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1613;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class129.field1535.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class129.field1535.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class295.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.method2915(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1614;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.method2979(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class129.field1535.getSortedMembers()[Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class295.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					UrlRequest.method2555(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class129.field1535.field1611[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class295.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
						class147.method3051(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class129.field1535.field1600[var3]) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class83.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
							UrlRequest.field1344 = class83.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
							UrlRequest.field1344 = Client.currentClanChannels[var3];
							class307.field3588 = var3;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = UrlRequest.field1344.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = UrlRequest.field1344.field1669;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = UrlRequest.field1344.field1666;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = UrlRequest.field1344.method3056();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = ((ClanChannelMember) (UrlRequest.field1344.members.get(var3))).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (UrlRequest.field1344.members.get(var3))).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (UrlRequest.field1344.members.get(var3))).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						class19.method307(class307.field3588, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = UrlRequest.field1344.method3057(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.getSortedMembers()[Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (GameEngine.field205 != null) ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}