import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.text.DecimalFormat;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bb")
@Implements("Login")
public class Login {
	@ObfuscatedName("q")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1411364875)
	@Export("xPadding")
	static int xPadding = 0;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lql;")
	static IndexedSprite field896;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1251453039)
	@Export("loginBoxX")
	static int loginBoxX;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1821993491)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1543148131)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;

	@ObfuscatedName("r")
	@Export("Login_loadingText")
	static String Login_loadingText;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 462202927)
	static int field906;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 1071854183)
	static int field919;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 1929273885)
	@Export("loginIndex")
	static int loginIndex;

	@ObfuscatedName("bz")
	@Export("Login_response0")
	static String Login_response0;

	@ObfuscatedName("bs")
	@Export("Login_response1")
	static String Login_response1;

	@ObfuscatedName("bg")
	@Export("Login_response2")
	static String Login_response2;

	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;

	@ObfuscatedName("ba")
	@Export("Login_username")
	static String Login_username;

	@ObfuscatedName("bd")
	@Export("Login_password")
	static String Login_password;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 1746648981)
	static int field912;

	@ObfuscatedName("bk")
	static String[] field901;

	@ObfuscatedName("bc")
	static boolean field892;

	@ObfuscatedName("bo")
	static boolean field918;

	@ObfuscatedName("bm")
	@Export("otp")
	static String otp;

	@ObfuscatedName("bl")
	static boolean field893;

	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = -2020053889)
	@Export("currentLoginField")
	static int currentLoginField;

	@ObfuscatedName("ci")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "Lql;")
	static IndexedSprite field931;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 111823069)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;

	@ObfuscatedName("cy")
	@ObfuscatedGetter(intValue = -1302811983)
	@Export("worldSelectPage")
	static int worldSelectPage;

	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = -1864267867)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(longValue = -1392885950958470859L)
	static long field928;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(longValue = 4805928807234507383L)
	static long field929;

	@ObfuscatedName("cl")
	static String[] field930;

	@ObfuscatedName("cn")
	static String[] field907;

	static {
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field906 = -1;
		field919 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field912 = 0;
		field901 = new String[8];
		field892 = false;
		field918 = false;
		field893 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field928 = -1L;
		field929 = -1L;
		field930 = new String[]{ "title.jpg" };
		field907 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;IZI)Ldj;", garbageValue = "1657905624")
	public static class122 method1972(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & '￿', var2 & '￿');
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}
			if (var7 == null) {
				var4 = false;
			}
			if (!var4) {
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "-47")
	static int method1996(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			TaskHandler.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			ItemLayer.privateChatMode = class119.method2819(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
			if (ItemLayer.privateChatMode == null) {
				ItemLayer.privateChatMode = PrivateChatMode.field4825;
			}
			Client.tradeChatMode = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(ItemLayer.privateChatMode.field4826);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				TaskHandler.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var6 = class433.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					TaskHandler.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
					var5 = class113.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = NPC.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (ItemLayer.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ItemLayer.privateChatMode.field4826;
						}
						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							var12 = class430.method7571(var7, var8, class21.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
							var12 = class433.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							ArchiveDiskAction.method5785(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							TaskHandler.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var6 = class430.method7571(var7, var8, class21.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = UserComparator9.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class123.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class142.method3067(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
								KeyHandler.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field719 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Client.field719;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--TaskHandler.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++TaskHandler.Interpreter_intStackSize;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								TaskHandler.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
								var5 = class113.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
								var4 = NPC.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else {
								return 2;
							}
						} else {
							if (class28.localPlayer != null && class28.localPlayer.username != null) {
								var8 = class28.localPlayer.username.getName();
							} else {
								var8 = "";
							}
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "5")
	static int method1940(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6809) {
				int var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				ObjectComposition var4 = WorldMapDecoration.getObjectDefinition(var3);
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (var4 != null) ? var4.name : "";
				return 1;
			} else if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-2130618157")
	static int method1999(int var0, Script var1, boolean var2) {
		if (var0 == 7600) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7601) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7602) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7603) {
			--TaskHandler.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7604) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7605) {
			--TaskHandler.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7606) {
			TaskHandler.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7607) {
			return 1;
		} else if (var0 == 7608) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7609) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7610) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7611) {
			--TaskHandler.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7612) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7613) {
			--TaskHandler.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7614) {
			return 1;
		} else if (var0 == 7615) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7616) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			TaskHandler.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7617) {
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else {
			return 2;
		}
	}
}