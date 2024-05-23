import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("hx")
	static SecureRandom field120;
	@ObfuscatedName("ak")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-111"
	)
	static boolean method309(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbe;Lqb;Lqb;I)V",
		garbageValue = "-1041767614"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var42;
		int var43;
		if (Login.worldSelectOpen) {
			IndexCheck var41 = Client.indexCheck;
			IndexCheck var4 = var41;

			while (true) {
				if (!var4.method4439()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class105.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					var5 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(0, 1);
						break;
					}

					var42 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var42 && MouseHandler.MouseHandler_lastPressedX <= var42 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var42 + 15 && MouseHandler.MouseHandler_lastPressedX <= var42 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(1, 1);
						break;
					}

					var43 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var43 && MouseHandler.MouseHandler_lastPressedX <= var43 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var43 + 15 && MouseHandler.MouseHandler_lastPressedX <= var43 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(2, 1);
						break;
					}

					int var44 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var44 && MouseHandler.MouseHandler_lastPressedX <= var44 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var44 + 15 && MouseHandler.MouseHandler_lastPressedX <= var44 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class249.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						InvDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class91.logoSprite.drawAt(Login.xPadding + 382 - class91.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var45 = class415.World_worlds[Login.hoveredWorldIndex];
						boolean var53 = BoundaryObject.method5455(Client.worldProperties, class541.field5313);
						var11 = var45.isDeadman();
						GraphicsObject.field902 = var11;
						var45.field832 = var11 ? "beta" : var45.field832;
						WorldMapArchiveLoader.changeWorld(var45);
						Login.worldSelectOpen = false;
						InvDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class91.logoSprite.drawAt(Login.xPadding + 382 - class91.logoSprite.subWidth / 2, 18);
						if (var11 != var53) {
							HttpResponse.method277();
						}
					} else {
						if (Login.worldSelectPage > 0 && class342.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class342.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= DbTable.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= DbTable.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class166.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class166.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= DbTable.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= DbTable.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var4.field2476 == 13) {
					Login.worldSelectOpen = false;
					InvDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					class91.logoSprite.drawAt(Login.xPadding + 382 - class91.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var4.field2476 == 96) {
					if (Login.worldSelectPage > 0 && class342.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var4.field2476 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class166.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class105.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class459.clientPreferences.updateTitleMusicDisabled(!class459.clientPreferences.isTitleMusicDisabled());
				if (!class459.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(GameObject.archive6, "scape main", "", 255, false));
					ScriptFrame.method1169(var3, 0, 0, 0, 100, false);
				} else {
					Skills.method7123(0, 0);
				}

				SoundSystem.method851();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field951) {
					Login.field951 = class129.method3033() + 1000L;
				}

				long var21 = class129.method3033();
				if (class438.method8273() && Login.field939 == -1L) {
					Login.field939 = var21;
					if (Login.field939 > Login.field951) {
						Login.field951 = Login.field939;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (class188.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class105.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) {
								class74.method2113();
								return;
							}
						}

						if (World_request != null) {
							class74.method2113();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var42 = MouseHandler.MouseHandler_lastPressedX;
					var43 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var42 = MouseHandler.MouseHandler_x;
						var43 = MouseHandler.MouseHandler_y;
					}

					if (!class105.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var23 = Archive.method7223();
					short var46;
					int var47;
					if (Login.loginIndex == 0) {
						boolean var58 = false;

						while (var23.method4439()) {
							if (var23.field2476 == 84) {
								var58 = true;
							}
						}

						var47 = KeyHandler.loginBoxCenter - 80;
						var46 = 291;
						if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20) {
							class379.openURL(class449.method8387("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var47 = KeyHandler.loginBoxCenter + 80;
						if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20 || var58) {
							if ((Client.worldProperties & class541.field5322.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								ParamComposition.updateLoginIndex(1);
								ActorSpotAnim.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class541.field5299.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class541.field5324.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								ParamComposition.updateLoginIndex(1);
								ActorSpotAnim.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class541.field5324.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								ParamComposition.updateLoginIndex(1);
								ActorSpotAnim.focusPasswordWhenUsernameFilled();
							} else {
								WorldMapSectionType.Login_promptCredentials(false);
							}
						}
					} else {
						short var10;
						int var24;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var23.method4439()) {
									var24 = KeyHandler.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
										WorldMapSectionType.Login_promptCredentials(false);
									}

									var24 = KeyHandler.loginBoxCenter + 80;
									if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
										ParamComposition.updateLoginIndex(0);
									}
									break;
								}

								if (var23.field2476 == 84) {
									WorldMapSectionType.Login_promptCredentials(false);
								} else if (var23.field2476 == 13) {
									ParamComposition.updateLoginIndex(0);
								}
							}
						} else {
							boolean var49;
							short var56;
							if (Login.loginIndex == 2) {
								var56 = 201;
								var24 = var56 + 52;
								if (var5 == 1 && var43 >= var24 - 12 && var43 < var24 + 2) {
									Login.currentLoginField = 0;
								}

								var24 += 15;
								if (var5 == 1 && var43 >= var24 - 12 && var43 < var24 + 2) {
									Login.currentLoginField = 1;
								}

								var24 += 15;
								var56 = 361;
								if (Calendar.field3982 != null) {
									var47 = Calendar.field3982.highX / 2;
									if (var5 == 1 && var42 >= Calendar.field3982.lowX - var47 && var42 <= var47 + Calendar.field3982.lowX && var43 >= var56 - 15 && var43 < var56) {
										switch(Login.field949) {
										case 1:
											class379.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class379.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var47 = KeyHandler.loginBoxCenter - 80;
								var46 = 321;
								if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										WorldMapSection2.setLoginResponseString("", "Please enter your username/email address.", "");
									} else if (Login.Login_password.length() == 0) {
										WorldMapSection2.setLoginResponseString("", "Please enter your password.", "");
									} else {
										WorldMapSection2.setLoginResponseString("", "Connecting to server...", "");
										AbstractWorldMapIcon.setAuthenticationScheme(false);
										class105.updateGameState(20);
									}

									return;
								}

								var47 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20) {
									ParamComposition.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class414.otpMedium = 0;
									class285.otp = "";
									Login.rememberUsername = true;
								}

								var47 = KeyHandler.loginBoxCenter + -117;
								var46 = 277;
								Login.field967 = var42 >= var47 && var42 < var47 + FontName.field5196 && var43 >= var46 && var43 < var46 + ObjectSound.field866;
								if (var5 == 1 && Login.field967) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class459.clientPreferences.getRememberedUsername() != null) {
										class459.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var47 = KeyHandler.loginBoxCenter + 24;
								var46 = 277;
								Login.field963 = var42 >= var47 && var42 < var47 + FontName.field5196 && var43 >= var46 && var43 < var46 + ObjectSound.field866;
								if (var5 == 1 && Login.field963) {
									class459.clientPreferences.updateHideUsername(!class459.clientPreferences.isUsernameHidden());
									if (!class459.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class459.clientPreferences.updateRememberedUsername((String)null);
										ActorSpotAnim.focusPasswordWhenUsernameFilled();
									}
								}

								label1541:
								while (true) {
									int var51;
									Transferable var57;
									do {
										while (true) {
											char var50;
											label1505:
											do {
												while (true) {
													while (var23.method4439()) {
														if (var23.field2476 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1505;
															}

															class101.method2633(var23.field2464);
															if (var23.field2476 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var23.field2476 == 84 || var23.field2476 == 80) {
																Login.currentLoginField = 1;
															}

															var50 = var23.field2464;
															var49 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1;
															if (var49 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var23.field2464;
															}
														} else {
															ParamComposition.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class414.otpMedium = 0;
															class285.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var23.field2476 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var23.field2476 == 84 || var23.field2476 == 80) {
												Login.currentLoginField = 0;
												if (var23.field2476 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														WorldMapSection2.setLoginResponseString("", "Please enter your username/email address.", "");
													} else if (Login.Login_password.length() == 0) {
														WorldMapSection2.setLoginResponseString("", "Please enter your password.", "");
													} else {
														WorldMapSection2.setLoginResponseString("", "Connecting to server...", "");
														AbstractWorldMapIcon.setAuthenticationScheme(false);
														class105.updateGameState(20);
													}

													return;
												}
											}

											if ((var23.isValidIndexInRange(82) || var23.isValidIndexInRange(87)) && var23.field2476 == 67) {
												Clipboard var55 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var57 = var55.getContents(class188.client);
												var51 = 20 - Login.Login_password.length();
												break;
											}

											if (DbTableType.method9548(var23.field2464)) {
												var50 = var23.field2464;
												var49 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1;
												if (var49 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var23.field2464;
												}
											}
										}
									} while(var51 <= 0);

									try {
										String var15 = (String)var57.getTransferData(DataFlavor.stringFlavor);
										int var16 = Math.min(var51, var15.length());
										int var52 = 0;

										while (true) {
											if (var52 >= var16) {
												Login.Login_password = Login.Login_password + var15.substring(0, var16);
												continue label1541;
											}

											if (!DbTableType.method9548(var15.charAt(var52))) {
												break;
											}

											char var54 = var15.charAt(var52);
											boolean var18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var54) != -1;
											if (!var18) {
												break;
											}

											++var52;
										}

										ParamComposition.updateLoginIndex(3);
										return;
									} catch (UnsupportedFlavorException var39) {
									} catch (IOException var40) {
									}
								}
							} else {
								Bounds var27;
								if (Login.loginIndex == 3) {
									var24 = Login.loginBoxX + 180;
									var10 = 241;
									var27 = var1.method8136(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var24, var10);
									if (var5 == 1 && var27.method7773(var42, var43)) {
										class379.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var24 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
										PendingSpawn.method2411(false);
									}

									var24 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
										class379.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var24 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
											class285.otp.trim();
											if (class285.otp.length() != 6) {
												WorldMapSection2.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											} else {
												class414.otpMedium = Integer.parseInt(class285.otp);
												class285.otp = "";
												AbstractWorldMapIcon.setAuthenticationScheme(true);
												WorldMapSection2.setLoginResponseString("", "Connecting to server...", "");
												class105.updateGameState(20);
											}

											return;
										}

										if (var5 == 1 && var42 >= Login.loginBoxX + 180 - 9 && var42 <= Login.loginBoxX + 180 + 130 && var43 >= 263 && var43 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var42 >= Login.loginBoxX + 180 - 34 && var42 <= Login.loginBoxX + 34 + 180 && var43 >= 351 && var43 <= 363) {
											class379.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var24 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
											ParamComposition.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class414.otpMedium = 0;
											class285.otp = "";
										}

										while (var23.method4439()) {
											var11 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var23.field2464 == "1234567890".charAt(var12)) {
													var11 = true;
													break;
												}
											}

											if (var23.field2476 == 13) {
												ParamComposition.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class414.otpMedium = 0;
												class285.otp = "";
											} else {
												if (var23.field2476 == 85 && class285.otp.length() > 0) {
													class285.otp = class285.otp.substring(0, class285.otp.length() - 1);
												}

												if (var23.field2476 == 84) {
													class285.otp.trim();
													if (class285.otp.length() != 6) {
														WorldMapSection2.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													} else {
														class414.otpMedium = Integer.parseInt(class285.otp);
														class285.otp = "";
														AbstractWorldMapIcon.setAuthenticationScheme(true);
														WorldMapSection2.setLoginResponseString("", "Connecting to server...", "");
														class105.updateGameState(20);
													}

													return;
												}

												if (var11 && class285.otp.length() < 6) {
													class285.otp = class285.otp + var23.field2464;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) {
											var24 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													WorldMapSection2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var28 = class379.method7155();
													int var48;
													if (var28 == 0L) {
														var48 = 5;
													} else {
														var48 = class4.method12(var28, Login.Login_username);
													}

													switch(var48) {
													case 2:
														WorldMapSection2.setLoginResponseString(Strings.field4354, Strings.field4158, Strings.field4356);
														ParamComposition.updateLoginIndex(6);
														break;
													case 3:
														WorldMapSection2.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 4:
														WorldMapSection2.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
														break;
													case 5:
														WorldMapSection2.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
														break;
													case 6:
														WorldMapSection2.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 7:
														WorldMapSection2.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}

												return;
											}

											var24 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
												WorldMapSectionType.Login_promptCredentials(true);
											}

											var46 = 361;
											if (class413.field4655 != null) {
												var12 = class413.field4655.highX / 2;
												if (var5 == 1 && var42 >= class413.field4655.lowX - var12 && var42 <= var12 + class413.field4655.lowX && var43 >= var46 - 15 && var43 < var46) {
													class379.openURL(class449.method8387("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var23.method4439()) {
												var49 = false;

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
													if (var23.field2464 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
														var49 = true;
														break;
													}
												}

												if (var23.field2476 == 13) {
													WorldMapSectionType.Login_promptCredentials(true);
												} else {
													if (var23.field2476 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var23.field2476 == 84) {
														class457.method8469();
														return;
													}

													if (var49 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var23.field2464;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (AbstractByteArrayCopier.field3976 && !Client.onMobile) {
													var24 = KeyHandler.loginBoxCenter - 150;
													var47 = var24 + 40 + 240 + 25;
													var46 = 231;
													var12 = var46 + 40;
													if (var5 == 1 && var42 >= var24 && var42 <= var47 && var43 >= var46 && var43 <= var12) {
														Login.field973 = class31.method451(var24, var42);
													}

													var13 = Login.loginBoxX + 180 - 80;
													short var14 = 321;
													boolean var17;
													boolean var19;
													Date var20;
													Date var30;
													boolean var32;
													java.util.Calendar var33;
													Date var34;
													if (var5 == 1 && var42 >= var13 - 75 && var42 <= var13 + 75 && var43 >= var14 - 20 && var43 <= var14 + 20) {
														label1408: {
															try {
																var30 = LoginPacket.method3213();
															} catch (ParseException var38) {
																AbstractWorldMapData.method5932("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var32 = false;
																break label1408;
															}

															if (var30 == null) {
																var32 = false;
															} else {
																var33 = java.util.Calendar.getInstance();
																var33.set(1, var33.get(1) - 13);
																var33.set(5, var33.get(5) + 1);
																var33.set(11, 0);
																var33.set(12, 0);
																var33.set(13, 0);
																var33.set(14, 0);
																var34 = var33.getTime();
																var17 = var30.before(var34);
																var20 = class175.method3579();
																var19 = var30.after(var20);
																if (!var19) {
																	AbstractWorldMapData.method5932("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var32 = false;
																} else {
																	if (!var17) {
																		Script.field1026 = 8388607;
																	} else {
																		Script.field1026 = (int)(var30.getTime() / 86400000L - 11745L);
																	}

																	var32 = true;
																}
															}
														}

														if (var32) {
															class105.updateGameState(50);
															return;
														}
													}

													var13 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var42 >= var13 - 75 && var42 <= var13 + 75 && var43 >= var14 - 20 && var43 <= var14 + 20) {
														Login.field960 = new String[8];
														WorldMapSectionType.Login_promptCredentials(true);
													}

													while (var23.method4439()) {
														if (var23.field2476 == 101) {
															Login.field960[Login.field973] = null;
														}

														if (var23.field2476 == 85) {
															if (Login.field960[Login.field973] == null && Login.field973 > 0) {
																--Login.field973;
															}

															Login.field960[Login.field973] = null;
														}

														if (var23.field2464 >= '0' && var23.field2464 <= '9') {
															Login.field960[Login.field973] = "" + var23.field2464;
															if (Login.field973 < 7) {
																++Login.field973;
															}
														}

														if (var23.field2476 == 84) {
															label1344: {
																try {
																	var30 = LoginPacket.method3213();
																} catch (ParseException var37) {
																	AbstractWorldMapData.method5932("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var32 = false;
																	break label1344;
																}

																if (var30 == null) {
																	var32 = false;
																} else {
																	var33 = java.util.Calendar.getInstance();
																	var33.set(1, var33.get(1) - 13);
																	var33.set(5, var33.get(5) + 1);
																	var33.set(11, 0);
																	var33.set(12, 0);
																	var33.set(13, 0);
																	var33.set(14, 0);
																	var34 = var33.getTime();
																	var17 = var30.before(var34);
																	var20 = class175.method3579();
																	var19 = var30.after(var20);
																	if (!var19) {
																		AbstractWorldMapData.method5932("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var32 = false;
																	} else {
																		if (!var17) {
																			Script.field1026 = 8388607;
																		} else {
																			Script.field1026 = (int)(var30.getTime() / 86400000L - 11745L);
																		}

																		var32 = true;
																	}
																}
															}

															if (var32) {
																class105.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var24 = Login.loginBoxX + 180 - 80;
													var10 = 321;
													if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
														class379.openURL(class449.method8387("secure", true) + "m=dob/set_dob.ws", true, false);
														WorldMapSection2.setLoginResponseString("", "Page has opened in the browser.", "");
														ParamComposition.updateLoginIndex(6);
														return;
													}

													var24 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
														WorldMapSectionType.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var24 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													class379.openURL("https://www.jagex.com/terms/privacy", true, false);
													WorldMapSection2.setLoginResponseString("", "Page has opened in the browser.", "");
													ParamComposition.updateLoginIndex(6);
													return;
												}

												var24 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													WorldMapSectionType.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var24 = Login.loginBoxX + 180;
												var10 = 311;
												if (var23.field2476 == 84 || var23.field2476 == 13 || var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													PendingSpawn.method2411(false);
												}
											} else if (Login.loginIndex == 10) {
												var24 = Login.loginBoxX + 180;
												var10 = 209;
												if (var23.field2476 == 84 || var5 == 1 && var42 >= var24 - 109 && var42 <= var24 + 109 && var43 >= var10 && var43 <= var10 + 68) {
													WorldMapSection2.setLoginResponseString("", "Connecting to server...", "");
													Client.field569 = class550.field5396;
													AbstractWorldMapIcon.setAuthenticationScheme(false);
													class105.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var24 = KeyHandler.loginBoxCenter;
												var10 = 233;
												var27 = var2.method8136(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var10);
												Bounds var25 = var2.method8136(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var10);
												Bounds var26 = var2.method8136(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var10);
												var47 = var10 + 17;
												Bounds var36 = var2.method8136(0, 34, "<col=ffd200>agreement (EULA)</col>.", var24, var47);
												if (var5 == 1) {
													if (var27.method7773(var42, var43)) {
														class379.openURL("https://www.jagex.com/terms", true, false);
													} else if (var25.method7773(var42, var43)) {
														class379.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var26.method7773(var42, var43) || var36.method7773(var42, var43)) {
														class379.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var24 = KeyHandler.loginBoxCenter - 80;
												var10 = 311;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													Widget.method7057();
													PendingSpawn.method2411(true);
												}

												var24 = KeyHandler.loginBoxCenter + 80;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var24 = KeyHandler.loginBoxCenter;
												var10 = 321;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													PendingSpawn.method2411(true);
												}
											} else if (Login.loginIndex == 14) {
												String var9 = "";
												switch(Login.Login_banType) {
												case 0:
													var9 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var9 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var9 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													WorldMapSectionType.Login_promptCredentials(false);
												}

												var47 = Login.loginBoxX + 180;
												var46 = 276;
												if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20) {
													class379.openURL(var9, true, false);
													WorldMapSection2.setLoginResponseString("", "Page has opened in the browser.", "");
													ParamComposition.updateLoginIndex(6);
													return;
												}

												var47 = Login.loginBoxX + 180;
												var46 = 326;
												if (var5 == 1 && var42 >= var47 - 75 && var42 <= var47 + 75 && var43 >= var46 - 20 && var43 <= var46 + 20) {
													WorldMapSectionType.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var24 = Login.loginBoxX + 180;
												var10 = 301;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													PendingSpawn.method2411(false);
												}
											} else if (Login.loginIndex == 32) {
												var24 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													class379.openURL(class449.method8387("secure", true) + "m=dob/set_dob.ws", true, false);
													WorldMapSection2.setLoginResponseString("", "Page has opened in the browser.", "");
													ParamComposition.updateLoginIndex(6);
													return;
												}

												var24 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													WorldMapSectionType.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var24 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													class379.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var24 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var42 >= var24 - 75 && var42 <= var24 + 75 && var43 >= var10 - 20 && var43 <= var10 + 20) {
													WorldMapSectionType.Login_promptCredentials(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var23.method4439()) {
														var56 = 321;
														if (var5 == 1 && var43 >= var56 - 20 && var43 <= var56 + 20) {
															WorldMapSectionType.Login_promptCredentials(true);
														}

														return;
													}
												} while(var23.field2476 != 84 && var23.field2476 != 13);

												WorldMapSectionType.Login_promptCredentials(true);
											}
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "268666553"
	)
	protected static final void method311() {
		class557.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		AbstractSocket.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-670210274"
	)
	static void method307(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				Skills.method7123(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class329.field3579.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class329.field3579.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class459.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(GameObject.archive6, (Integer)var0.get(var8), 0, class459.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class329.field3579.clear();
						class329.field3579.addAll(var9);
						class146.method3226(var1, var2, var3, var4);
					} else {
						ScriptFrame.method1169(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "63"
	)
	static final void method310(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field746[var4] = true;
			}
		}

	}
}
