import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lh")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ap")
	HashSet field3269;
	@ObfuscatedName("ab")
	HashSet field3267;
	@ObfuscatedName("az")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Lvf;IZI)V",
		garbageValue = "-1985419102"
	)
	void method6281(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method5805(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3269 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3269.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3267 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3267.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lvf;ZB)V",
		garbageValue = "115"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1193899610"
	)
	static int method6287(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
			StructComposition.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class320.Interpreter_intStackSize -= 2;
			class277.performPlayerAnimation(AddRequestTask.localPlayer, Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field886) {
				Interpreter.field882 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				var15 = 0;
				if (class213.isNumber(var7)) {
					var15 = TaskHandler.method4455(var7);
				}

				PacketBufferNode var13 = class141.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					var11 = class141.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					var11 = class141.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
						class172.method3746(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class320.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
						Widget var14 = TaskHandler.widgetDefinition.method6841(var9);
						LoginState.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class320.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
						LoginState.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Varcs.mouseCam = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class461.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class461.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						FloorOverlayDefinition.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = class141.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						class465.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class141.getPacketBufferNode(ClientPacket.field3364, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class536.stringCp1252NullTerminatedByteSize(var4) + class536.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteAdd(var3);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class320.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class172.setTapToDrop(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class153.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class320.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class320.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class320.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class154.canvasWidth;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = UrlRequester.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class320.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class320.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field682 = 3;
						Client.field629 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field682 = 2;
						Client.field629 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field682 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field682 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field682 = 3;
						Client.field629 = var2 ? Interpreter.scriptDotWidget.id : class464.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class461.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class461.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class461.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							class461.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class461.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = PlayerUpdateManager.method3015();
							return 1;
						} else if (var0 == 3155) {
							--class465.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class320.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class320.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class320.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class465.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class320.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class320.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class320.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class320.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class320.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class320.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class320.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class320.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class465.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class465.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							UserComparator5.method3204(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class149.method3467();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							class461.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class461.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							HttpMethod.method81(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-634178979"
	)
	static void method6283() {
		if (Client.field619 && AddRequestTask.localPlayer != null) {
			int var0 = AddRequestTask.localPlayer.pathX[0];
			int var1 = AddRequestTask.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			UserComparator6.oculusOrbFocalPointX = AddRequestTask.localPlayer.x;
			int var2 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, AddRequestTask.localPlayer.x, AddRequestTask.localPlayer.y, ClientPreferences.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < class147.oculusOrbFocalPointZ) {
				class147.oculusOrbFocalPointZ = var2;
			}

			AsyncHttpResponse.oculusOrbFocalPointY = AddRequestTask.localPlayer.y;
			Client.field619 = false;
		}

	}
}
