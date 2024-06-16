import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ez")
public class class129 {
	@ObfuscatedName("az")
	public static final float field1541;
	@ObfuscatedName("af")
	public static final float field1542;
	@ObfuscatedName("aa")
	static float[] field1544;
	@ObfuscatedName("at")
	static float[] field1539;

	static {
		field1541 = Math.ulp(1.0F);
		field1542 = 2.0F * field1541;
		field1544 = new float[4];
		field1539 = new float[5];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1634802693"
	)
	public static final synchronized long method3033() {
		long var0 = System.currentTimeMillis();
		if (var0 < class325.field3553) {
			class532.field5262 += class325.field3553 - var0;
		}

		class325.field3553 = var0;
		return var0 + class532.field5262;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lor;IB)Lvl;",
		garbageValue = "-33"
	)
	public static IndexedSprite method3040(AbstractArchive var0, int var1) {
		if (!DelayFadeTask.updateExternalPlayer(var0, var1)) {
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite();
			var3.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var3.height = class351.SpriteBuffer_spriteHeight;
			var3.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var3.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
			var3.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var3.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0] * -1603996197;
			var3.palette = UrlRequest.SpriteBuffer_spritePalette;
			var3.pixels = PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[0];
			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			UrlRequest.SpriteBuffer_spritePalette = null;
			PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
			return var3;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "92"
	)
	static int method3039(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (KitDefinition.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
				class333.field3642 = KitDefinition.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					class333.field3642 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class333.field3642.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1767;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1768;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1773;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1770;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class333.field3642.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class333.field3642.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class13.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.method3386(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1779;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.method3340(Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = class333.field3642.getSortedMembers()[Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					AABB.method5096(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class13.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
						UserComparator5.method2975(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class333.field3642.field1777[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (Language.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
							ConcurrentMidiTask.field4800 = Language.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
							ConcurrentMidiTask.field4800 = Client.currentClanChannels[var3];
							WorldMapLabel.field3204 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = ConcurrentMidiTask.field4800.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ConcurrentMidiTask.field4800.field1829;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ConcurrentMidiTask.field4800.field1828;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ConcurrentMidiTask.field4800.method3453();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ConcurrentMidiTask.field4800.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((ClanChannelMember)ConcurrentMidiTask.field4800.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ((ClanChannelMember)ConcurrentMidiTask.field4800.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Tiles.method2269(WorldMapLabel.field3204, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ConcurrentMidiTask.field4800.method3456(Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = ConcurrentMidiTask.field4800.getSortedMembers()[Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = MouseHandler.field242 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-116"
	)
	static int method3037() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field828;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	static final void method3038() {
		class91.method2339(class350.field3738, class17.field86, class31.field166);
		class316.method6165(class47.field332, Tile.field2641);
		if (class350.field3738 == PlayerComposition.cameraX && class17.field86 == class171.cameraY && class31.field166 == UserComparator4.cameraZ && class47.field332 == Actor.cameraPitch && class206.cameraYaw == Tile.field2641) {
			Client.field794 = false;
			Client.isCameraLocked = false;
			Client.field788 = false;
			Client.field789 = false;
			class315.field3269 = 0;
			class284.field3133 = 0;
			UserComparator7.field1502 = 0;
			Varcs.field1450 = 0;
			GameObject.field3031 = 0;
			Huffman.field3967 = 0;
			UserComparator7.field1505 = 0;
			class76.field938 = 0;
			Varps.field3707 = 0;
			class459.field4880 = 0;
			Client.field791 = null;
			Client.field793 = null;
			Client.field792 = null;
		}

	}
}
