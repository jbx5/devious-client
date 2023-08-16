import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("bj")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -502599913
	)
	static int field855;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 213423769
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1140450119
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1180213293
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1579031469
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -587827913
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1981734327
	)
	int field861;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 775499377
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 96078857
	)
	int field867;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -448105717
	)
	int field865;
	@ObfuscatedName("aq")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2064097821
	)
	int field875;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1805200159"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field861 = var2.int7 * 128;
			this.field867 = var2.int5;
			this.field865 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field861 = 0;
			this.field867 = 0;
			this.field865 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class162.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	static void method1927() {
		Tiles.Tiles_underlays = null;
		class227.Tiles_overlays = null;
		class172.Tiles_shapes = null;
		ModelData0.field2833 = null;
		BufferedNetSocket.field4679 = null;
		class217.Tiles_underlays2 = null;
		class162.field1794 = null;
		Fonts.Tiles_hue = null;
		class466.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class128.Tiles_hueMultiplier = null;
		Interpreter.field888 = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "449179665"
	)
	static int method1930(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (Players.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
				class466.field4802 = Players.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
					class466.field4802 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1746;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1734;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1735;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1736;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					SoundCache.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.method3191(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1729;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.method3189(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = class466.field4802.getSortedMembers()[Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					SoundCache.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
					class386.method7205(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1742[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						SoundCache.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
						SoundSystem.method870(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1743[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (VerticalAlignment.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
							class396.field4477 = VerticalAlignment.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
							class396.field4477 = Client.currentClanChannels[var3];
							class113.field1452 = var3;
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class396.field4477.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.field1804;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.field1800;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.method3301();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						UserComparator10.method2907(class113.field1452, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.method3302(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = class396.field4477.getSortedMembers()[Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class139.field1654 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24646"
	)
	static void method1931() {
		Client.packetWriter.addNode(ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
