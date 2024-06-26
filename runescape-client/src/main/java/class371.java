import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ot")
public class class371 {
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -45085545
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1026072818"
	)
	static int method7066(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			VarbitComposition.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class130.Interpreter_intStackSize -= 2;
			Canvas.performPlayerAnimation(SoundCache.localPlayer, Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field870) {
				Interpreter.field863 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				var15 = 0;
				if (HealthBarUpdate.isNumber(var7)) {
					var15 = GrandExchangeEvent.method7351(var7);
				}

				PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					var11 = class170.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					var11 = class170.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
						class47.method903(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class130.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
						Widget var14 = ModeWhere.widgetDefinition.method6519(var9);
						MouseHandler.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class130.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
						MouseHandler.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						World.mouseCam = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class105.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						class421.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = class170.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						class337.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class170.getPacketBufferNode(ClientPacket.field3327, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + Actor.stringCp1252NullTerminatedByteSize(var4) + Actor.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByte(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class130.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						setTapToDrop(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HttpResponse.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class130.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class130.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class130.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.canvasWidth;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class1.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class130.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class130.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field673 = 3;
						Client.field504 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field673 = 2;
						Client.field504 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field673 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field673 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field673 = 3;
						Client.field504 = var2 ? Interpreter.scriptDotWidget.id : class30.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class105.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class105.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							class105.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class487.method8812();
							return 1;
						} else if (var0 == 3155) {
							--class337.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class130.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class130.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class130.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class337.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class130.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class130.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class130.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class130.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class130.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class130.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class130.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class130.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class337.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class337.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class166.method3476(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapArea.method4653();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							class105.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class105.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							class180.method3579(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1628317125"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
