import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 898492289
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lbm;",
		garbageValue = "1809873212"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1228613678"
	)
	static void method320() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "121"
	)
	static final boolean method321(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-225099103"
	)
	static int method322(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			class430.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class96.Interpreter_intStackSize -= 2;
			class402.performPlayerAnimation(SpriteMask.localPlayer, Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field863) {
				Interpreter.field855 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				var15 = 0;
				if (class298.isNumber(var7)) {
					var15 = class27.method437(var7);
				}

				PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					var11 = class113.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					var11 = class113.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
						class138.method3482(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class96.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
						Widget var14 = class416.widgetDefinition.method6911(var9);
						class416.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class96.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
						class416.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class150.mouseCam = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = TaskHandler.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						TaskHandler.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						GrandExchangeOfferAgeComparator.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var11 = class113.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						class208.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class113.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + World.stringCp1252NullTerminatedByteSize(var4) + World.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByteAdd(var3);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class96.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class153.setTapToDrop(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class96.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class96.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class96.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = HttpRequestTask.canvasWidth;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class268.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class96.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class96.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field667 = 3;
						Client.field668 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field667 = 2;
						Client.field668 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field667 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field667 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field667 = 3;
						Client.field668 = var2 ? UserComparator2.scriptDotWidget.id : HttpRequestTask.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							TaskHandler.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = TaskHandler.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								TaskHandler.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							TaskHandler.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = TaskHandler.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ReflectionCheck.method697();
							return 1;
						} else if (var0 == 3155) {
							--class208.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class96.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class96.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class96.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class208.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class96.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class96.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class96.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class96.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class96.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class96.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class96.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class96.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class208.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class208.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class168.method3772(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = HttpResponse.method296();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							TaskHandler.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = TaskHandler.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							HttpHeaders.method8867(var3);
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
