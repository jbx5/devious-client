import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("jq")
	static int[] field3968;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2135110721"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-14"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbx;Lqe;Lqe;I)V",
		garbageValue = "1201562824"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			Tile.method3726(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				TileItem.clientPreferences.updateTitleMusicDisabled(!TileItem.clientPreferences.isTitleMusicDisabled());
				if (!TileItem.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(class33.archive6, "scape main", "", 255, false));
					class53.method1051(var3, 0, 0, 0, 100, false);
				} else {
					class92.method2440(0, 0);
				}

				class147.method3342();
			}

			if (Client.gameState != 5) {
				if (Login.field934 == -1L) {
					Login.field934 = RouteStrategy.method5439() + 1000L;
				}

				long var21 = RouteStrategy.method5439();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var6 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var6.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && Login.field939 == -1L) {
					Login.field939 = var21;
					if (Login.field939 > Login.field934) {
						Login.field934 = Login.field939;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var23;
					if (RestClientThreadFactory.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var23 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var23 && MouseHandler.MouseHandler_lastPressedX <= var23 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) {
								if (class222.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (SoundCache.World_request != null && class222.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var23 = MouseHandler.MouseHandler_lastButton;
					int var37 = MouseHandler.MouseHandler_lastPressedX;
					int var38 = MouseHandler.MouseHandler_lastPressedY;
					if (var23 == 0) {
						var37 = MouseHandler.MouseHandler_x;
						var38 = MouseHandler.MouseHandler_y;
					}

					if (!class429.mouseCam && var23 == 4) {
						var23 = 1;
					}

					IndexCheck var24 = class230.method4774();
					short var40;
					int var41;
					if (Login.loginIndex == 0) {
						boolean var49 = false;

						while (var24.method5375()) {
							if (var24.field2930 == 84) {
								var49 = true;
							}
						}

						var41 = class248.loginBoxCenter - 80;
						var40 = 291;
						if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
							SequenceDefinition.openURL(class329.method6181("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var41 = class248.loginBoxCenter + 80;
						if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20 || var49) {
							ApproximateRouteStrategy.method1192();
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var24.method5375()) {
									var10 = class248.loginBoxCenter - 80;
									var11 = 321;
									if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										HttpRequest.Login_promptCredentials(false);
									}

									var10 = class248.loginBoxCenter + 80;
									if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										class532.updateLoginIndex(0);
									}
									break;
								}

								if (var24.field2930 == 84) {
									HttpRequest.Login_promptCredentials(false);
								} else if (var24.field2930 == 13) {
									class532.updateLoginIndex(0);
								}
							}
						} else {
							int var14;
							int var15;
							boolean var19;
							short var39;
							boolean var42;
							if (Login.loginIndex == 2) {
								var39 = 201;
								var10 = var39 + 52;
								if (var23 == 1 && var38 >= var10 - 12 && var38 < var10 + 2) {
									Login.currentLoginField = 0;
								}

								var10 += 15;
								if (var23 == 1 && var38 >= var10 - 12 && var38 < var10 + 2) {
									Login.currentLoginField = 1;
								}

								var10 += 15;
								var39 = 361;
								if (GrandExchangeOfferAgeComparator.field4548 != null) {
									var41 = GrandExchangeOfferAgeComparator.field4548.highX / 2;
									if (var23 == 1 && var37 >= GrandExchangeOfferAgeComparator.field4548.lowX - var41 && var37 <= var41 + GrandExchangeOfferAgeComparator.field4548.lowX && var38 >= var39 - 15 && var38 < var39) {
										switch(Login.field941) {
										case 1:
											SequenceDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											SequenceDefinition.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var41 = class248.loginBoxCenter - 80;
								var40 = 321;
								if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class130.setLoginResponseString("", "Please enter your username/email address.", "");
									} else if (Login.Login_password.length() == 0) {
										class130.setLoginResponseString("", "Please enter your password.", "");
									} else {
										class130.setLoginResponseString("", "Connecting to server...", "");
										Client.authenticationScheme = TileItem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
										UserComparator3.updateGameState(20);
									}

									return;
								}

								var41 = Login.loginBoxX + 180 + 80;
								if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
									class532.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									FadeOutTask.otpMedium = 0;
									class135.otp = "";
									Login.rememberUsername = true;
								}

								var41 = class248.loginBoxCenter + -117;
								var40 = 277;
								Login.field927 = var37 >= var41 && var37 < var41 + MouseHandler.field214 && var38 >= var40 && var38 < var40 + class223.field2423;
								if (var23 == 1 && Login.field927) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && TileItem.clientPreferences.getRememberedUsername() != null) {
										TileItem.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var41 = class248.loginBoxCenter + 24;
								var40 = 277;
								Login.field914 = var37 >= var41 && var37 < var41 + MouseHandler.field214 && var38 >= var40 && var38 < var40 + class223.field2423;
								if (var23 == 1 && Login.field914) {
									TileItem.clientPreferences.updateHideUsername(!TileItem.clientPreferences.isUsernameHidden());
									if (!TileItem.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										TileItem.clientPreferences.updateRememberedUsername((String)null);
										class33.focusPasswordWhenUsernameFilled();
									}
								}

								label1333:
								while (true) {
									Transferable var51;
									do {
										while (true) {
											label1297:
											do {
												while (true) {
													while (var24.method5375()) {
														if (var24.field2930 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1297;
															}

															char var43 = var24.field2931;

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var43 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
															}

															if (var24.field2930 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var24.field2930 == 84 || var24.field2930 == 80) {
																Login.currentLoginField = 1;
															}

															char var45 = var24.field2931;
															boolean var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var45) != -1;
															if (var46 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var24.field2931;
															}
														} else {
															class532.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															FadeOutTask.otpMedium = 0;
															class135.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var24.field2930 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var24.field2930 == 84 || var24.field2930 == 80) {
												Login.currentLoginField = 0;
												if (var24.field2930 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class130.setLoginResponseString("", "Please enter your username/email address.", "");
													} else if (Login.Login_password.length() == 0) {
														class130.setLoginResponseString("", "Please enter your password.", "");
													} else {
														class130.setLoginResponseString("", "Connecting to server...", "");
														Client.authenticationScheme = TileItem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
														UserComparator3.updateGameState(20);
													}

													return;
												}
											}

											if ((var24.isValidIndexInRange(82) || var24.isValidIndexInRange(87)) && var24.field2930 == 67) {
												Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var51 = var50.getContents(DynamicObject.client);
												var15 = 20 - Login.Login_password.length();
												break;
											}

											if (GrandExchangeEvents.method7388(var24.field2931)) {
												char var47 = var24.field2931;
												var42 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var47) != -1;
												if (var42 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var24.field2931;
												}
											}
										}
									} while(var15 <= 0);

									try {
										String var16 = (String)var51.getTransferData(DataFlavor.stringFlavor);
										int var17 = Math.min(var15, var16.length());
										int var48 = 0;

										while (true) {
											if (var48 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17);
												continue label1333;
											}

											if (!GrandExchangeEvents.method7388(var16.charAt(var48))) {
												break;
											}

											char var20 = var16.charAt(var48);
											var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
											if (!var19) {
												break;
											}

											++var48;
										}

										class532.updateLoginIndex(3);
										return;
									} catch (UnsupportedFlavorException var35) {
									} catch (IOException var36) {
									}
								}
							} else {
								Bounds var27;
								if (Login.loginIndex == 3) {
									var10 = Login.loginBoxX + 180;
									var11 = 241;
									var27 = var1.method8161(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
									if (var23 == 1 && var27.method7772(var37, var38)) {
										SequenceDefinition.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 276;
									if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										Client.updateLoginStatusUsernameRemembered(false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 326;
									if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										SequenceDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											HttpMethod.method78();
											return;
										}

										if (var23 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var38 >= 263 && var38 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var23 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var38 >= 351 && var38 <= 363) {
											SequenceDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class532.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											FadeOutTask.otpMedium = 0;
											class135.otp = "";
										}

										while (var24.method5375()) {
											boolean var12 = false;

											for (var13 = 0; var13 < "1234567890".length(); ++var13) {
												if (var24.field2931 == "1234567890".charAt(var13)) {
													var12 = true;
													break;
												}
											}

											if (var24.field2930 == 13) {
												class532.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												FadeOutTask.otpMedium = 0;
												class135.otp = "";
											} else {
												if (var24.field2930 == 85 && class135.otp.length() > 0) {
													class135.otp = class135.otp.substring(0, class135.otp.length() - 1);
												}

												if (var24.field2930 == 84) {
													HttpMethod.method78();
													return;
												}

												if (var12 && class135.otp.length() < 6) {
													class135.otp = class135.otp + var24.field2931;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class149.method3360();
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											HttpRequest.Login_promptCredentials(true);
										}

										var40 = 361;
										if (LoginPacket.field1671 != null) {
											var13 = LoginPacket.field1671.highX / 2;
											if (var23 == 1 && var37 >= LoginPacket.field1671.lowX - var13 && var37 <= var13 + LoginPacket.field1671.lowX && var38 >= var40 - 15 && var38 < var40) {
												SequenceDefinition.openURL(class329.method6181("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var24.method5375()) {
											var42 = false;

											for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
												if (var24.field2931 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
													var42 = true;
													break;
												}
											}

											if (var24.field2930 == 13) {
												HttpRequest.Login_promptCredentials(true);
											} else {
												if (var24.field2930 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var24.field2930 == 84) {
													class149.method3360();
													return;
												}

												if (var42 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var24.field2931;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (class288.field3118 && !Client.onMobile) {
												var10 = class248.loginBoxCenter - 150;
												var41 = var10 + 40 + 240 + 25;
												var40 = 231;
												var13 = var40 + 40;
												if (var23 == 1 && var37 >= var10 && var37 <= var41 && var38 >= var40 && var38 <= var13) {
													var15 = var10;
													int var28 = 0;

													while (true) {
														if (var28 >= 8) {
															var14 = 0;
															break;
														}

														if (var37 <= var15 + 30) {
															var14 = var28;
															break;
														}

														var15 += 30;
														var15 += var28 != 1 && var28 != 3 ? 5 : 20;
														++var28;
													}

													Login.field915 = var14;
												}

												var14 = Login.loginBoxX + 180 - 80;
												short var44 = 321;
												boolean var18;
												Date var29;
												boolean var52;
												if (var23 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var38 >= var44 - 20 && var38 <= var44 + 20) {
													label1168: {
														try {
															var29 = class36.method668();
														} catch (ParseException var34) {
															Buddy.method8736("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var52 = false;
															break label1168;
														}

														if (var29 == null) {
															var52 = false;
														} else {
															var18 = HealthBarConfig.method2743(var29);
															var19 = class219.method4650(var29);
															if (!var19) {
																Buddy.method8736("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var52 = false;
															} else {
																if (!var18) {
																	class490.field5018 = 8388607;
																} else {
																	class490.field5018 = (int)(var29.getTime() / 86400000L - 11745L);
																}

																var52 = true;
															}
														}
													}

													if (var52) {
														UserComparator3.updateGameState(50);
														return;
													}
												}

												var14 = Login.loginBoxX + 180 + 80;
												if (var23 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var38 >= var44 - 20 && var38 <= var44 + 20) {
													Login.field925 = new String[8];
													HttpRequest.Login_promptCredentials(true);
												}

												while (var24.method5375()) {
													if (var24.field2930 == 101) {
														Login.field925[Login.field915] = null;
													}

													if (var24.field2930 == 85) {
														if (Login.field925[Login.field915] == null && Login.field915 > 0) {
															--Login.field915;
														}

														Login.field925[Login.field915] = null;
													}

													if (var24.field2931 >= '0' && var24.field2931 <= '9') {
														Login.field925[Login.field915] = "" + var24.field2931;
														if (Login.field915 < 7) {
															++Login.field915;
														}
													}

													if (var24.field2930 == 84) {
														label1104: {
															try {
																var29 = class36.method668();
															} catch (ParseException var33) {
																Buddy.method8736("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var52 = false;
																break label1104;
															}

															if (var29 == null) {
																var52 = false;
															} else {
																var18 = HealthBarConfig.method2743(var29);
																var19 = class219.method4650(var29);
																if (!var19) {
																	Buddy.method8736("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var52 = false;
																} else {
																	if (!var18) {
																		class490.field5018 = 8388607;
																	} else {
																		class490.field5018 = (int)(var29.getTime() / 86400000L - 11745L);
																	}

																	var52 = true;
																}
															}
														}

														if (var52) {
															UserComparator3.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
													SequenceDefinition.openURL(class329.method6181("secure", true) + "m=dob/set_dob.ws", true, false);
													class130.setLoginResponseString("", "Page has opened in the browser.", "");
													class532.updateLoginIndex(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
													HttpRequest.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												SequenceDefinition.openURL("https://www.jagex.com/terms/privacy", true, false);
												class130.setLoginResponseString("", "Page has opened in the browser.", "");
												class532.updateLoginIndex(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												HttpRequest.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var10 = Login.loginBoxX + 180;
											var11 = 311;
											if (var24.field2930 == 84 || var24.field2930 == 13 || var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												Client.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var10 = Login.loginBoxX + 180;
											var11 = 209;
											if (var24.field2930 == 84 || var23 == 1 && var37 >= var10 - 109 && var37 <= var10 + 109 && var38 >= var11 && var38 <= var11 + 68) {
												class130.setLoginResponseString("", "Connecting to server...", "");
												Client.field545 = class553.field5434;
												Client.authenticationScheme = TileItem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
												UserComparator3.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var10 = class248.loginBoxCenter;
											var11 = 233;
											var27 = var2.method8161(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var25 = var2.method8161(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var26 = var2.method8161(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											var41 = var11 + 17;
											Bounds var31 = var2.method8161(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var41);
											if (var23 == 1) {
												if (var27.method7772(var37, var38)) {
													SequenceDefinition.openURL("https://www.jagex.com/terms", true, false);
												} else if (var25.method7772(var37, var38)) {
													SequenceDefinition.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var26.method7772(var37, var38) || var31.method7772(var37, var38)) {
													SequenceDefinition.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = class248.loginBoxCenter - 80;
											var11 = 311;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												Canvas.method298();
												Client.updateLoginStatusUsernameRemembered(true);
											}

											var10 = class248.loginBoxCenter + 80;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var10 = class248.loginBoxCenter;
											var11 = 321;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												Client.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var32 = "";
											switch(Login.Login_banType) {
											case 0:
												var32 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												HttpRequest.Login_promptCredentials(false);
											}

											var41 = Login.loginBoxX + 180;
											var40 = 276;
											if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
												SequenceDefinition.openURL(var32, true, false);
												class130.setLoginResponseString("", "Page has opened in the browser.", "");
												class532.updateLoginIndex(6);
												return;
											}

											var41 = Login.loginBoxX + 180;
											var40 = 326;
											if (var23 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
												HttpRequest.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var10 = Login.loginBoxX + 180;
											var11 = 301;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												Client.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												SequenceDefinition.openURL(class329.method6181("secure", true) + "m=dob/set_dob.ws", true, false);
												class130.setLoginResponseString("", "Page has opened in the browser.", "");
												class532.updateLoginIndex(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												HttpRequest.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												SequenceDefinition.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var23 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												HttpRequest.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var24.method5375()) {
													var39 = 321;
													if (var23 == 1 && var38 >= var39 - 20 && var38 <= var39 + 20) {
														HttpRequest.Login_promptCredentials(true);
													}

													return;
												}
											} while(var24.field2930 != 84 && var24.field2930 != 13);

											HttpRequest.Login_promptCredentials(true);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lvc;",
		garbageValue = "1397659310"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = Player.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = Player.ItemDefinition_get(var10);
			}
		}

		Model var20 = var9.getModel(1);
		if (var20 == null) {
			return null;
		} else {
			SpritePixels var21 = null;
			if (var9.noteTemplate != -1) {
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var21 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var21 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var21 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.Rasterizer2D_brightness;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method3739(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.setCustomClipBounds(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var20.calculateBoundsCylinder();
			var20.drawFrustum(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method3739(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				class510.ItemDefinition_fontPlain11.draw(class134.method3220(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method3739(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}
}
