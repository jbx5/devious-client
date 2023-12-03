import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1768632755
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 108763597
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ac")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("al")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 30174039
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1397081557
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1175567269
	)
	@Export("population")
	int population;
	@ObfuscatedName("as")
	@Export("host")
	String host;
	@ObfuscatedName("ay")
	@Export("activity")
	String activity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -411506225
	)
	@Export("location")
	int location;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1981623765
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field808;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-98"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class522.field5096.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class522.field5109.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "25"
	)
	boolean method1853() {
		return (class522.field5114.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092493983"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class522.field5095.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1744253846"
	)
	boolean method1896() {
		return (class522.field5108.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1917"
	)
	boolean method1856() {
		return (class522.field5122.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1429834032"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class522.field5111.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "893660966"
	)
	boolean method1858() {
		return (class522.field5123.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	boolean method1859() {
		return (class522.field5094.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	boolean method1869() {
		return (class522.field5120.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1248471414"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class396.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1960092148"
	)
	static int method1899(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
			GrandExchangeOfferUnitPriceComparator.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			DbTableType.Interpreter_intStackSize -= 2;
			WorldMapLabelSize.performPlayerAnimation(class229.localPlayer, Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) {
				Interpreter.field846 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
				var15 = 0;
				if (ClientPacket.isNumber(var7)) {
					var15 = Huffman.method6840(var7);
				}

				PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					var11 = class113.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					var11 = class113.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
						class402.method7472(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						DbTableType.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
						Widget var14 = HealthBarDefinition.widgetDefinition.method6285(var9);
						HorizontalAlignment.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						DbTableType.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
						HorizontalAlignment.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class19.mouseCam = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapIcon_1.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						HealthBar.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var11 = class113.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						class127.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class113.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + ClanChannel.stringCp1252NullTerminatedByteSize(var4) + ClanChannel.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByteAdd(var3);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--DbTableType.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						IgnoreList.setTapToDrop(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Strings.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						DbTableType.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						DbTableType.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--DbTableType.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Language.canvasWidth;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class47.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--DbTableType.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						DbTableType.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field659 = 3;
						Client.field660 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field659 = 2;
						Client.field660 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field659 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field659 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field659 = 3;
						Client.field660 = var2 ? Interpreter.scriptDotWidget.id : HealthBar.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							WorldMapIcon_1.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								WorldMapIcon_1.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							WorldMapIcon_1.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapData_1.method4797();
							return 1;
						} else if (var0 == 3155) {
							--class127.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							DbTableType.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--DbTableType.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--DbTableType.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class127.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--DbTableType.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--DbTableType.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							DbTableType.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							DbTableType.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							DbTableType.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--DbTableType.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--DbTableType.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--DbTableType.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class127.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class127.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class311.method5940(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class216.method4235();
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							class240.method4808(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}
}
