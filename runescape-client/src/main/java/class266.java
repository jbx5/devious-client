import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ko")
public class class266 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "36"
	)
	static int method5209(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
			class411.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2;
			WorldMapEvent.performPlayerAnimation(TextureProvider.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field883) {
				Interpreter.field882 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
				var15 = 0;
				if (AttackOption.isNumber(var7)) {
					var15 = class36.method686(var7);
				}

				PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
					var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
					var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
						GrandExchangeOfferTotalQuantityComparator.method7051(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var14 = class33.widgetDefinition.method6240(var9);
						TaskHandler.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class416.scriptDotWidget : class306.scriptActiveWidget;
						TaskHandler.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator8.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2502() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class91.clientPreferences.method2558(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						VertexNormal.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class180.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class478.stringCp1252NullTerminatedByteSize(var4) + class478.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteNeg(var3);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field648 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class154.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class47.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class340.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class491.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field691 = 3;
						Client.field692 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field691 = 2;
						Client.field692 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field691 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field691 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field691 = 3;
						Client.field692 = var2 ? class416.scriptDotWidget.id : class306.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class91.clientPreferences.method2531(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2504() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class91.clientPreferences.method2520("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class91.clientPreferences.method2505(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2503() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class138.method3083();
							return 1;
						} else if (var0 == 3155) {
							--class180.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class180.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class180.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class180.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							FontName.method8851(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FaceNormal.method4845();
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							class462.method8308(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "-277761006"
	)
	static final boolean method5208(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null;

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
				var5 = var6;
				break;
			}
		}

		if (var5 != null) {
			var5.field1180 = var4;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1820839232"
	)
	static void method5210(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class424.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
