import java.io.IOException;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pl")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ab")
	final String field4602;
	@ObfuscatedName("ac")
	@Export("language")
	final String language;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -120687081
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4608, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4608, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4608, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4608, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4611, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4611, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4608, 6, "MX");
		Language[] var0 = method7476();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpe;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4602 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1647429252"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1733821469"
	)
	static final int method7482(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ldx;",
		garbageValue = "-10"
	)
	static ClientPreferences method7480() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = UserComparator8.getPreferencesFile("", class111.field1431.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpl;",
		garbageValue = "59"
	)
	static Language[] method7476() {
		return new Language[]{Language_DE, Language_ES_MX, Language_PT, Language_EN, Language_NL, Language_ES, Language_FR};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "1161143883"
	)
	public static Language method7462(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-69505760"
	)
	static int method7479(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
			UrlRequest.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class13.Interpreter_intStackSize -= 2;
			class162.performPlayerAnimation(class17.localPlayer, Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field895) {
				Interpreter.field891 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				var15 = 0;
				if (class206.isNumber(var7)) {
					var15 = class177.method3601(var7);
				}

				PacketBufferNode var13 = WorldMapElement.getPacketBufferNode(ClientPacket.field3316, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					var11 = WorldMapElement.getPacketBufferNode(ClientPacket.field3332, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					var11 = WorldMapElement.getPacketBufferNode(ClientPacket.field3373, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
						ChatChannel.method2226(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class13.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
						Widget var14 = AsyncRestClient.widgetDefinition.method6536(var9);
						class91.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class13.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
						class91.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class105.mouseCam = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class459.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class459.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						class379.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = WorldMapElement.getPacketBufferNode(ClientPacket.field3312, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						class166.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = WorldMapElement.getPacketBufferNode(ClientPacket.field3331, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class432.stringCp1252NullTerminatedByteSize(var4) + class432.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteSub(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class13.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class185.setTapToDrop(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class426.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class13.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class13.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class13.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = DbTable.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class13.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class13.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field697 = 3;
						Client.field698 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field697 = 2;
						Client.field698 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field697 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field697 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field697 = 3;
						Client.field698 = var2 ? Interpreter.scriptDotWidget.id : SecureRandomSSLSocket.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class459.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class459.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class459.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
							class459.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class459.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class129.method3037();
							return 1;
						} else if (var0 == 3155) {
							--class166.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class13.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class13.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class13.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class166.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class13.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class13.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class13.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class13.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class13.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class13.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class13.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class13.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class166.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class166.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class194.method3794(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = MouseHandler.method690();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							class459.clientPreferences.method2536(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class459.clientPreferences.method2577();
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Friend.method8588(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "858851508"
	)
	static boolean method7481() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
