




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("uq")
	@ObfuscatedSignature(descriptor = 
	"Lov;")

	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lbd;")

	@Export("script")
	Script script;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1104135589)

	@Export("pc")
	int pc;
	@ObfuscatedName("i")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("f")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"74")

	static int method1085(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (TileItem.loadWorlds()) ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = SecureRandomCallable.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.id;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var9.activity;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.location;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.population;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class305.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.id;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var9.activity;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.location;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.population;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == DevicePcmPlayerProvider.World_worlds[var8].id) {
							var7 = DevicePcmPlayerProvider.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.id;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.activity;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.location;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.population;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					class204.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = class151.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = KeyHandler.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = KeyHandler.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = class151.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = class146.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class146.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = class151.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = class19.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class19.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = class151.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = ObjectComposition.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ObjectComposition.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.onMobile) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class122.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class122.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.field498;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if ((var3 >= 0) && (var3 < World.World_count)) {
						var7 = DevicePcmPlayerProvider.World_worlds[var3];
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.id;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.activity;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.location;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.population;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"377425883")

	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == (-3)) {
			class4.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == (-2)) {
			class4.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == (-1)) {
			class4.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Ignored.method6828(3);
			Login.field895 = 1;
		} else if (var0 == 4) {
			class267.method5196(0);
		} else if (var0 == 5) {
			Login.field895 = 2;
			class4.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if ((var0 == 68) || ((!Client.onMobile) && (var0 == 6))) {
			class4.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class4.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class4.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class4.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class4.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class4.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class4.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class4.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class4.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class4.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			class4.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			class267.method5196(1);
		} else if (var0 == 19) {
			class4.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class4.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class4.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class4.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class4.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class4.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class4.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class4.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class4.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class4.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			class4.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class4.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Ignored.method6828(8);
		} else {
			if (var0 == 56) {
				class4.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				Decimator.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class4.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				Decimator.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class4.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				Ignored.method6828(7);
			} else {
				if (var0 == 62) {
					Decimator.updateGameState(10);
					Ignored.method6828(9);
					class4.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					Decimator.updateGameState(10);
					Ignored.method6828(9);
					class4.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if ((var0 == 65) || (var0 == 67)) {
					Decimator.updateGameState(10);
					Ignored.method6828(9);
					class4.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					Decimator.updateGameState(10);
					Ignored.method6828(7);
					class4.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else {
					class4.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		Decimator.updateGameState(10);
		if (Client.field532.method7928()) {
			Ignored.method6828(9);
		}

	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;IIIIII)V", garbageValue = 
	"692099527")

	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var0 != null) && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC) (var0)).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			if (((var1 < var75) && (var0.playerCycle == Client.cycle)) && PacketBufferNode.method5188(((Player) (var0)))) {
				Player var9 = ((Player) (var0));
				if (var1 < var75) {
					class93.method2376(var0, var0.defaultHeight + 15);
					AbstractFont var10 = ((AbstractFont) (Client.fontsMap.get(FontName.FontName_plain12)));
					byte var11 = 9;
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, (var3 + Client.viewportTempY) - var11, 16777215, 0);
					var8 = 18;
				}
			}

			int var76 = -2;
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6164()) {
				class93.method2376(var0, var0.defaultHeight + 15);

				for (HealthBar var87 = ((HealthBar) (var0.healthBars.last())); var87 != null; var87 = ((HealthBar) (var0.healthBars.previous()))) {
					HealthBarUpdate var79 = var87.get(Client.cycle);
					if (var79 == null) {
						if (var87.isEmpty()) {
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition;
						SpritePixels var13 = var80.getBackSprite();
						SpritePixels var81 = var80.getFrontSprite();
						int var82 = 0;
						if ((var13 != null) && (var81 != null)) {
							if ((var80.widthPadding * 2) < var81.subWidth) {
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - (var82 * 2);
						} else {
							var15 = var80.width;
						}

						int var17 = 255;
						boolean var83 = true;
						int var84 = Client.cycle - var79.cycle;
						int var85 = (var15 * var79.health2) / var80.width;
						int var86;
						int var93;
						if (var79.cycleOffset > var84) {
							var86 = (var80.field1866 == 0) ? 0 : var80.field1866 * (var84 / var80.field1866);
							var22 = (var15 * var79.health) / var80.width;
							var93 = ((var86 * (var85 - var22)) / var79.cycleOffset) + var22;
						} else {
							var93 = var85;
							var86 = (var80.int5 + var79.cycleOffset) - var84;
							if (var80.int3 >= 0) {
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if ((var79.health2 > 0) && (var93 < 1)) {
							var93 = 1;
						}

						if ((var13 != null) && (var81 != null)) {
							if (var15 == var93) {
								var93 += var82 * 2;
							} else {
								var93 += var82;
							}

							var86 = var13.subHeight;
							var76 += var86;
							var22 = (var2 + Client.viewportTempX) - (var15 >> 1);
							var23 = (var3 + Client.viewportTempY) - var76;
							var22 -= var82;
							if ((var17 >= 0) && (var17 < 255)) {
								var13.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var93, var86 + var23);
								var81.drawTransAt(var22, var23, var17);
							} else {
								var13.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var93, var86 + var23);
								var81.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var76 += 2;
						} else {
							var76 += 5;
							if (Client.viewportTempX > (-1)) {
								var86 = (var2 + Client.viewportTempX) - (var15 >> 1);
								var22 = (var3 + Client.viewportTempY) - var76;
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var93, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var93, var22, var15 - var93, 5, 16711680);
							}

							var76 += 2;
						}
					}
				}
			}

			if (var76 == (-2)) {
				var76 += 7;
			}

			var76 += var8;
			if (var1 < var75) {
				Player var88 = ((Player) (var0));
				if (var88.isHidden) {
					return;
				}

				if ((var88.headIconPk != (-1)) || (var88.headIconPrayer != (-1))) {
					class93.method2376(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > (-1)) {
						if (var88.headIconPk != (-1)) {
							var76 += 25;
							class150.headIconPkSprites[var88.headIconPk].drawTransBgAt((var2 + Client.viewportTempX) - 12, (var3 + Client.viewportTempY) - var76);
						}

						if (var88.headIconPrayer != (-1)) {
							var76 += 25;
							WallDecoration.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt((var2 + Client.viewportTempX) - 12, (var3 + Client.viewportTempY) - var76);
						}
					}
				}

				if (((var1 >= 0) && (Client.hintArrowType == 10)) && (var7[var1] == Client.hintArrowPlayerIndex)) {
					class93.method2376(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > (-1)) {
						var76 += InvDefinition.headIconHintSprites[1].subHeight;
						InvDefinition.headIconHintSprites[1].drawTransBgAt((var2 + Client.viewportTempX) - 12, (var3 + Client.viewportTempY) - var76);
					}
				}
			} else {
				NPCComposition var89 = ((NPC) (var0)).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if ((var89.headIconPrayer >= 0) && (var89.headIconPrayer < WallDecoration.headIconPrayerSprites.length)) {
					class93.method2376(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > (-1)) {
						WallDecoration.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt((var2 + Client.viewportTempX) - 12, (var3 + Client.viewportTempY) - 30);
					}
				}

				if (((Client.hintArrowType == 1) && (Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex)) && ((Client.cycle % 20) < 10)) {
					class93.method2376(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > (-1)) {
						InvDefinition.headIconHintSprites[0].drawTransBgAt((var2 + Client.viewportTempX) - 12, (var3 + Client.viewportTempY) - 28);
					}
				}
			}

			if ((var0.overheadText != null) && ((var1 >= var75) || ((!var0.field1130) && ((Client.publicChatMode == 4) || ((!var0.isAutoChatting) && (((Client.publicChatMode == 0) || (Client.publicChatMode == 3)) || ((Client.publicChatMode == 1) && ((Player) (var0)).isFriend()))))))) {
				class93.method2376(var0, var0.defaultHeight);
				if ((Client.viewportTempX > (-1)) && (Client.overheadTextCount < Client.overheadTextLimit)) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = RouteStrategy.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = RouteStrategy.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var90 = var0.hitSplatCycles[var77];
				int var12 = var0.hitSplatTypes[var77];
				HitSplatDefinition var91 = null;
				int var14 = 0;
				if (var12 >= 0) {
					if (var90 <= Client.cycle) {
						continue;
					}

					var91 = UserComparator3.method2602(var0.hitSplatTypes[var77]);
					var14 = var91.field1998;
					if ((var91 != null) && (var91.transforms != null)) {
						var91 = var91.transform();
						if (var91 == null) {
							var0.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var90 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var77];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = UserComparator3.method2602(var15);
					if ((var16 != null) && (var16.transforms != null)) {
						var16 = var16.transform();
					}
				}

				if ((var90 - var14) <= Client.cycle) {
					if (var91 == null) {
						var0.hitSplatCycles[var77] = -1;
					} else {
						class93.method2376(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > (-1)) {
							if (var77 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var77 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var91.method3625();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var91.method3640();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var91.method3626();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var91.method3627();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var16 != null) {
								var30 = var16.method3625();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var16.method3640();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3626();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method3627();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var78 = var91.getFont();
							if (var78 == null) {
								var78 = class113.fontPlain11;
							}

							Font var44;
							if (var16 != null) {
								var44 = var16.getFont();
								if (var44 == null) {
									var44 = class113.fontPlain11;
								}
							} else {
								var44 = class113.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var91.getString(var0.hitSplatValues[var77]);
							int var92 = var78.stringWidth(var45);
							if (var16 != null) {
								var46 = var16.getString(var0.hitSplatValues2[var77]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if ((var20 == null) && (var21 == null)) {
									var49 = 1;
								} else {
									var49 = (var92 / var23) + 1;
								}
							}

							if ((var16 != null) && (var35 > 0)) {
								if ((var32 == null) && (var33 == null)) {
									var50 = 1;
								} else {
									var50 = (var48 / var35) + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var23 * var49;
								var51 += var56;
								var55 += (var56 - var92) / 2;
							} else {
								var51 += var92;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var16 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle;
							int var63 = var91.field2003 - ((var62 * var91.field2003) / var91.field1998);
							int var64 = ((var62 * var91.field2004) / var91.field1998) + (-var91.field2004);
							int var65 = var63 + ((var2 + Client.viewportTempX) - (var51 >> 1));
							int var66 = var64 + ((var3 + Client.viewportTempY) - 12);
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = (var66 + var91.field2011) + 15;
							int var70 = var69 - var78.maxAscent;
							int var71 = var69 + var78.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var16 != null) {
								var72 = (var66 + var16.field2011) + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {

								}

								if (var74 > var68) {

								}
							}

							var73 = 255;
							if (var91.field2005 >= 0) {
								var73 = (var62 << 8) / (var91.field1998 - var91.field2005);
							}

							if ((var73 >= 0) && (var73 < 255)) {
								if (var18 != null) {
									var18.drawTransAt((var65 + var52) - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt((var53 + var65) - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt((var74 * var23) + ((var54 + var65) - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt((var65 + var56) - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransAt((var65 + var57) - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt((var65 + var58) - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt((var74 * var35) + ((var59 + var65) - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt((var60 + var65) - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt((var52 + var65) - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt((var53 + var65) - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt((var23 * var74) + ((var54 + var65) - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt((var56 + var65) - var29, var66);
								}

								var78.draw(var45, var55 + var65, var69, var91.textColor | (-16777216), 0);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransBgAt((var57 + var65) - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt((var58 + var65) - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt((var35 * var74) + ((var65 + var59) - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt((var65 + var60) - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | (-16777216), 0);
								}
							}
						}
					}
				}
			}

		}
	}
}