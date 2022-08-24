import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.text.DecimalFormat;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bc")
@Implements("Login")
public class Login {
	@ObfuscatedName("h")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 143934889)
	@Export("xPadding")
	static int xPadding = 0;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lqe;")
	static IndexedSprite field872;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lqn;")
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("d")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lqe;")
	static IndexedSprite field874;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -117827515)
	@Export("loginBoxX")
	static int loginBoxX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1356153485)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1175847013)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;

	@ObfuscatedName("j")
	@Export("Login_loadingText")
	static String Login_loadingText;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = -385916361)
	@Export("Login_banType")
	static int Login_banType;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -1490840701)
	static int field875;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 1607677011)
	@Export("loginIndex")
	static int loginIndex;

	@ObfuscatedName("bq")
	@Export("Login_response0")
	static String Login_response0;

	@ObfuscatedName("bn")
	@Export("Login_response1")
	static String Login_response1;

	@ObfuscatedName("bl")
	@Export("Login_response2")
	static String Login_response2;

	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;

	@ObfuscatedName("bu")
	@Export("Login_username")
	static String Login_username;

	@ObfuscatedName("bb")
	@Export("Login_password")
	static String Login_password;

	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = 206786913)
	static int field891;

	@ObfuscatedName("bd")
	static String[] field892;

	@ObfuscatedName("bz")
	static boolean field868;

	@ObfuscatedName("bo")
	static boolean field894;

	@ObfuscatedName("be")
	static boolean field895;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 1084940731)
	@Export("currentLoginField")
	static int currentLoginField;

	@ObfuscatedName("co")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = -1240701521)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;

	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = -2103334835)
	@Export("worldSelectPage")
	static int worldSelectPage;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = -979458741)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(longValue = 2792997058446921493L)
	static long field889;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(longValue = 7709479161078177483L)
	static long field910;

	@ObfuscatedName("cs")
	static String[] field901;

	@ObfuscatedName("cy")
	static String[] field906;

	static {
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field875 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field891 = 0;
		field892 = new String[8];
		field868 = false;
		field894 = false;
		field895 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field889 = -1L;
		field910 = -1L;
		field901 = new String[]{ "title.jpg" };
		field906 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqz;II)V", garbageValue = "517279501")
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();
		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1297[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1297;
					var10000[var7] = ((byte) (var10000[var7] | 2));
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = MusicPatch.method5371(var0);
						var10000 = Players.field1297;
						var10000[var7] = ((byte) (var10000[var7] | 2));
					} else {
						class13.readPlayerUpdate(var0, var7);
					}
				}
			}
		}
		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();
			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1297[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1297;
						var10000[var7] = ((byte) (var10000[var7] | 2));
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = MusicPatch.method5371(var0);
							var10000 = Players.field1297;
							var10000[var7] = ((byte) (var10000[var7] | 2));
						} else {
							class13.readPlayerUpdate(var0, var7);
						}
					}
				}
			}
			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();
				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1297[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1297;
							var10000[var7] = ((byte) (var10000[var7] | 2));
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = MusicPatch.method5371(var0);
								var10000 = Players.field1297;
								var10000[var7] = ((byte) (var10000[var7] | 2));
							} else if (class118.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1297;
								var10000[var7] = ((byte) (var10000[var7] | 2));
							}
						}
					}
				}
				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();
					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1297[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1297;
								var10000[var7] = ((byte) (var10000[var7] | 2));
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = MusicPatch.method5371(var0);
									var10000 = Players.field1297;
									var10000[var7] = ((byte) (var10000[var7] | 2));
								} else if (class118.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1297;
									var10000[var7] = ((byte) (var10000[var7] | 2));
								}
							}
						}
					}
					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1297;
							var10000[var4] = ((byte) (var10000[var4] >> 1));
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}
						class126.method2789(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(ILbz;ZB)I", garbageValue = "-15")
	static int method1879(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			User.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			Player.privateChatMode = class299.method5660(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
			if (Player.privateChatMode == null) {
				Player.privateChatMode = PrivateChatMode.field4823;
			}
			Client.tradeChatMode = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(Player.privateChatMode.field4824);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				User.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var6 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					User.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
					var5 = class282.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = ClientPreferences.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (Player.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Player.privateChatMode.field4824;
						}
						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							var12 = class259.method5125(var7, var8, MilliClock.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							UserComparator8.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
							var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							WorldMapScaleHandler.method5045(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							User.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var6 = class259.method5125(var7, var8, MilliClock.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = WorldMapManager.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class16.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = FontName.method7322(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
								ReflectionCheck.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field711 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Client.field711;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--User.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++User.Interpreter_intStackSize;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
								var5 = class282.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								var4 = ClientPreferences.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else {
								return 2;
							}
						} else {
							if (ScriptFrame.localPlayer != null && ScriptFrame.localPlayer.username != null) {
								var8 = ScriptFrame.localPlayer.username.getName();
							} else {
								var8 = "";
							}
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "455630942")
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CLAN_LEAVECHAT, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}