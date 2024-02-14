import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oi")
public enum class371 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4333(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4332(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4329(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4330(3);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1315094487
	)
	public final int field4331;

	class371(int var3) {
		this.field4331 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4331;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "1597878920"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class404.field4534[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class404.field4534[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class404.field4534[(var6 & 15) << 2 | var7 >>> 6]).append(class404.field4534[var7 & 63]);
				} else {
					var3.append(class404.field4534[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class404.field4534[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "8"
	)
	static int method7024(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var0.method6814(var1);
			return 1;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "519993372"
	)
	static int method7019(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class223.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
				class53.field363 = class223.guestClanSettings;
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
					class53.field363 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1746;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1748;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1743;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1742;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.method3381(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1753;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.method3390(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class53.field363.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					class133.method3113(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1750[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						HealthBar.method2653(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1751[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class316.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							SecureRandomSSLSocket.field53 = class316.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							SecureRandomSSLSocket.field53 = Client.currentClanChannels[var3];
							Interpreter.field884 = var3;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = SecureRandomSSLSocket.field53.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field53.field1801;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field53.field1806;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field53.method3481();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field53.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field53.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field53.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class93.method2442(Interpreter.field884, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field53.method3487(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field53.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class73.field920 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1764737119"
	)
	static void method7026() {
		Client.field718 = true;
		if (ScriptFrame.varcs != null && ScriptFrame.varcs.hasUnwrittenChanges()) {
			ScriptFrame.varcs.write();
		}

		HttpMethod.method80();
		Message.method1173();
		if (ByteArrayPool.mouseRecorder != null) {
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		class133.clear();
		LoginPacket.method3200();
		if (Actor.scene != null) {
			Actor.scene.clear();
		}

		for (int var1 = 0; var1 < Client.collisionMaps.length; ++var1) {
			if (Client.collisionMaps[var1] != null) {
				Client.collisionMaps[var1].clear();
			}
		}

		Tiles.worldMap = null;
		class169.method3521(0, 0);
		GrandExchangeOfferOwnWorldComparator.method1192();
		Client.playingJingle = false;
		InterfaceParent.method2350();
		if (AuthenticationScheme.pcmPlayer1 != null) {
			AuthenticationScheme.pcmPlayer1.shutdown();
		}

		class356.field3897.method7213();
		class193.method3781();
		if (InvDefinition.urlRequester != null) {
			InvDefinition.urlRequester.close();
		}

		class94.method2451();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class173.JagexCache_idxFiles = null;
		class136.method3140();
		class155.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field786 = 0;
		class356.field3897 = new JagNetThread();
		InvDefinition.urlRequester = new SecureUrlRequester(class193.client.https, 220);

		try {
			class30.method422("oldschool", class28.field152, class129.field1536.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class155.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		class193.client.method490();
		WorldMapDecoration.method5033(class93.field1165);
		Interpreter.updateGameState(0);
	}
}
