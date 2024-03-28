import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1754165711
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("az")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;B)I",
		garbageValue = "-58"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "3"
	)
	static int method1192(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class511.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
				HttpRequestTask.field84 = class511.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
					HttpRequestTask.field84 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequestTask.field84.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1752;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1740;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1749;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1741;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequestTask.field84.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequestTask.field84.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					HttpRequestTask.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.method3243(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1751;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.method3242(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.getSortedMembers()[Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					HttpRequestTask.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					class423.method7813(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1748[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						HttpRequestTask.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
						Client.method1565(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequestTask.field84.field1736[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (HttpRequestTask.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
							class126.field1513 = HttpRequestTask.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
							class126.field1513 = Client.currentClanChannels[var3];
							GrandExchangeOfferAgeComparator.field4472 = var3;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class126.field1513.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class126.field1513.field1799;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class126.field1513.field1801;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class126.field1513.method3394();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						class134.method3073(GrandExchangeOfferAgeComparator.field4472, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class126.field1513.method3383(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = class126.field1513.getSortedMembers()[Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = PendingSpawn.field1189 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-985921876"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = LoginType.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) {
			var7 = LoginType.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var11 = var5 != 0L && !class152.method3219(var5);
			if (var11) {
				var10 = var4;
			}

			int[] var12 = Interpreter.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = NpcOverrides.Entity_unpackID(var5);
			ObjectComposition var15 = MouseRecorder.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = CollisionMap.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 1) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var12[var13] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = LoginType.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = LoginType.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = NpcOverrides.Entity_unpackID(var5);
			ObjectComposition var19 = MouseRecorder.getObjectDefinition(var10);
			if (var19.mapSceneId != -1) {
				IndexedSprite var26 = CollisionMap.mapSceneSprites[var19.mapSceneId];
				if (var26 != null) {
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
					var26.drawAt(var13 + var1 * 4 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				int var20 = 15658734;
				boolean var27 = 0L != var5 && !class152.method3219(var5);
				if (var27) {
					var20 = 15597568;
				}

				int[] var21 = Interpreter.sceneMinimapSprite.pixels;
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var21[var22] = var20;
					var21[var22 + 1 + 512] = var20;
					var21[var22 + 1024 + 2] = var20;
					var21[var22 + 1536 + 3] = var20;
				} else {
					var21[var22 + 1536] = var20;
					var21[var22 + 1 + 1024] = var20;
					var21[var22 + 512 + 2] = var20;
					var21[var22 + 3] = var20;
				}
			}
		}

		var5 = LoginType.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = NpcOverrides.Entity_unpackID(var5);
			ObjectComposition var23 = MouseRecorder.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = CollisionMap.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var25 + 48);
				}
			}
		}

	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990596758"
	)
	static void method1199() {
		if (class135.field1621 != null) {
			Client.field808 = Client.cycle;
			class135.field1621.method7162();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class135.field1621.method7164(baseX * 64 + (Client.players[var0].x >> 7), DevicePcmPlayerProvider.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
