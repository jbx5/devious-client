import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class93 {
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "0"
	)
	static boolean method2441(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1995690305"
	)
	public static int method2439(int var0) {
		return class135.method3149(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "789556251"
	)
	static int method2440(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			GrandExchangeEvents.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			UserComparator6.Interpreter_intStackSize -= 2;
			class358.performPlayerAnimation(KeyHandler.localPlayer, Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field858) {
				Interpreter.field857 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				var15 = 0;
				if (Login.isNumber(var7)) {
					var15 = HealthBar.method2644(var7);
				}

				PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					var11 = class482.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					var11 = class482.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
						class482.method8744(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						UserComparator6.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
						Widget var14 = class380.widgetDefinition.method6348(var9);
						class220.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						UserComparator6.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
						class220.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						SoundCache.mouseCam = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						class217.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = class482.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						class211.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class482.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + CollisionMap.stringCp1252NullTerminatedByteSize(var4) + CollisionMap.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByteAdd(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--UserComparator6.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						WorldMapSectionType.setTapToDrop(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class126.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						UserComparator6.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						UserComparator6.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--UserComparator6.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class524.canvasWidth;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--UserComparator6.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						UserComparator6.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field798 = 3;
						Client.field673 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field798 = 2;
						Client.field673 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field798 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field798 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field798 = 3;
						Client.field673 = var2 ? class31.scriptDotWidget.id : class185.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Widget.method6823();
							return 1;
						} else if (var0 == 3155) {
							--class211.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							UserComparator6.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--UserComparator6.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--UserComparator6.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class211.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--UserComparator6.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--UserComparator6.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							UserComparator6.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							UserComparator6.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							UserComparator6.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--UserComparator6.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--UserComparator6.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--UserComparator6.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class211.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class211.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							Huffman.method6901(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class89.method2378();
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							AbstractWorldMapData.method4988(var3);
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
