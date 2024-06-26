import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 278122099
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1988862967
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1153683831
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-822815307"
	)
	static void method5685(int var0) {
		class424.field4705 = var0;
		class424.field4704 = new class424[var0];
		class424.field4706 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbs;Lqh;Lqh;B)V",
		garbageValue = "-59"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			WorldMapAreaData.method5107(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class105.clientPreferences.updateTitleMusicDisabled(!class105.clientPreferences.isTitleMusicDisabled());
				class47.method900();
				WorldMapIcon_1.method4578();
			}

			if (Client.gameState != 5) {
				if (Login.field953 == -1L) {
					Login.field953 = WorldMapData_1.method4861() + 1000L;
				}

				long var3 = WorldMapData_1.method4861();
				if (TileItem.method2805() && -1L == Login.field954) {
					Login.field954 = var3;
					if (Login.field954 > Login.field953) {
						Login.field953 = Login.field954;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var5;
					if (Language.Language_EN == BuddyRankComparator.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) {
								Language.method7421();
								return;
							}
						}

						if (PlayerCompositionColorTextureOverride.World_request != null) {
							Language.method7421();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var40 = MouseHandler.MouseHandler_lastPressedX;
					int var41 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var40 = MouseHandler.MouseHandler_x;
						var41 = MouseHandler.MouseHandler_y;
					}

					if (!World.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var23 = class134.method3133();
					short var43;
					int var44;
					if (Login.loginIndex == 0) {
						boolean var50 = false;

						while (var23.method4382()) {
							if (var23.field2460 == 84) {
								var50 = true;
							}
						}

						var44 = Login.loginBoxCenter - 80;
						var43 = 291;
						if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) {
							class421.openURL(LoginState.method1248("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var44 = Login.loginBoxCenter + 80;
						if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20 || var50) {
							ArchiveLoader.method2359();
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var23.method4382()) {
									var9 = Login.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class155.Login_promptCredentials(false);
									}

									var9 = Login.loginBoxCenter + 80;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class163.updateLoginIndex(0);
									}
									break;
								}

								if (var23.field2460 == 84) {
									class155.Login_promptCredentials(false);
								} else if (var23.field2460 == 13) {
									class163.updateLoginIndex(0);
								}
							}
						} else {
							int var13;
							int var14;
							short var42;
							if (Login.loginIndex == 2) {
								var42 = 201;
								var9 = var42 + 52;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var42 = 361;
								if (class193.field2035 != null) {
									var44 = class193.field2035.highX / 2;
									if (var5 == 1 && var40 >= class193.field2035.lowX - var44 && var40 <= var44 + class193.field2035.lowX && var41 >= var42 - 15 && var41 < var42) {
										switch(Login.field932) {
										case 1:
											class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class421.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var44 = Login.loginBoxCenter - 80;
								var43 = 321;
								if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) {
									class28.method432();
									return;
								}

								var44 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) {
									class163.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class6.otpMedium = 0;
									class146.otp = "";
									Login.rememberUsername = true;
								}

								var44 = Login.loginBoxCenter + -117;
								var43 = 277;
								Login.field943 = var40 >= var44 && var40 < var44 + class522.field5244 && var41 >= var43 && var41 < var43 + HttpRequest.field58;
								if (var5 == 1 && Login.field943) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class105.clientPreferences.getRememberedUsername() != null) {
										class105.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var44 = Login.loginBoxCenter + 24;
								var43 = 277;
								Login.field959 = var40 >= var44 && var40 < var44 + class522.field5244 && var41 >= var43 && var41 < var43 + HttpRequest.field58;
								if (var5 == 1 && Login.field959) {
									class105.clientPreferences.updateHideUsername(!class105.clientPreferences.isUsernameHidden());
									if (!class105.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class105.clientPreferences.updateRememberedUsername((String)null);
										UserComparator4.focusPasswordWhenUsernameFilled();
									}
								}

								while (true) {
									Transferable var54;
									do {
										while (true) {
											label1252:
											do {
												while (true) {
													while (var23.method4382()) {
														if (var23.field2460 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1252;
															}

															char var46 = var23.field2459;

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var46 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) {
															}

															if (var23.field2460 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var23.field2460 == 84 || var23.field2460 == 80) {
																Login.currentLoginField = 1;
															}

															if (KeyHandler.method386(var23.field2459) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var23.field2459;
															}
														} else {
															class163.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class6.otpMedium = 0;
															class146.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var23.field2460 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var23.field2460 == 84 || var23.field2460 == 80) {
												Login.currentLoginField = 0;
												if (var23.field2460 == 84) {
													class28.method432();
													return;
												}
											}

											if ((var23.isValidIndexInRange(82) || var23.isValidIndexInRange(87)) && var23.field2460 == 67) {
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var54 = var53.getContents(class415.client);
												var14 = 20 - Login.Login_password.length();
												break;
											}

											if (class212.method4116(var23.field2459) && KeyHandler.method386(var23.field2459) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var23.field2459;
											}
										}
									} while(var14 <= 0);

									try {
										String var15 = (String)var54.getTransferData(DataFlavor.stringFlavor);
										int var16 = Math.min(var14, var15.length());

										for (int var48 = 0; var48 < var16; ++var48) {
											if (!class212.method4116(var15.charAt(var48)) || !KeyHandler.method386(var15.charAt(var48))) {
												class163.updateLoginIndex(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var16);
									} catch (UnsupportedFlavorException var38) {
									} catch (IOException var39) {
									}
								}
							} else {
								Bounds var26;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var26 = var1.method8086(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var26.method7678(var40, var41)) {
										class421.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										UserComparator8.updateLoginStatusUsernameRemembered(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											WorldMapLabelSize.method4567();
											return;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) {
											class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class163.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class6.otpMedium = 0;
											class146.otp = "";
										}

										while (var23.method4382()) {
											boolean var11 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var23.field2459 == "1234567890".charAt(var12)) {
													var11 = true;
													break;
												}
											}

											if (var23.field2460 == 13) {
												class163.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class6.otpMedium = 0;
												class146.otp = "";
											} else {
												if (var23.field2460 == 85 && class146.otp.length() > 0) {
													class146.otp = class146.otp.substring(0, class146.otp.length() - 1);
												}

												if (var23.field2460 == 84) {
													WorldMapLabelSize.method4567();
													return;
												}

												if (var11 && class146.otp.length() < 6) {
													class146.otp = class146.otp + var23.field2459;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class6.method36();
											return;
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class155.Login_promptCredentials(true);
										}

										var43 = 361;
										if (WorldMapSection0.field2657 != null) {
											var12 = WorldMapSection0.field2657.highX / 2;
											if (var5 == 1 && var40 >= WorldMapSection0.field2657.lowX - var12 && var40 <= var12 + WorldMapSection0.field2657.lowX && var41 >= var43 - 15 && var41 < var43) {
												class421.openURL(LoginState.method1248("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var23.method4382()) {
											boolean var45 = false;

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
												if (var23.field2459 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
													var45 = true;
													break;
												}
											}

											if (var23.field2460 == 13) {
												class155.Login_promptCredentials(true);
											} else {
												if (var23.field2460 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var23.field2460 == 84) {
													class6.method36();
													return;
												}

												if (var45 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var23.field2459;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (UserComparator3.field1501 && !Client.onMobile) {
												var9 = Login.loginBoxCenter - 150;
												var44 = var9 + 40 + 240 + 25;
												var43 = 231;
												var12 = var43 + 40;
												if (var5 == 1 && var40 >= var9 && var40 <= var44 && var41 >= var43 && var41 <= var12) {
													var14 = var9;
													int var27 = 0;

													while (true) {
														if (var27 >= 8) {
															var13 = 0;
															break;
														}

														if (var40 <= var14 + 30) {
															var13 = var27;
															break;
														}

														var14 += 30;
														var14 += var27 != 1 && var27 != 3 ? 5 : 20;
														++var27;
													}

													Login.field950 = var13;
												}

												var13 = Login.loginBoxX + 180 - 80;
												short var47 = 321;
												boolean var17;
												SimpleDateFormat var18;
												StringBuilder var19;
												String[] var20;
												int var21;
												String var22;
												Date var28;
												Date var29;
												java.util.Calendar var31;
												boolean var32;
												java.util.Calendar var49;
												Date var51;
												Date var52;
												boolean var55;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var47 - 20 && var41 <= var47 + 20) {
													label1123: {
														try {
															var18 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var18.setLenient(false);
															var19 = new StringBuilder();
															var20 = Login.field941;
															var21 = 0;

															while (true) {
																if (var21 < var20.length) {
																	var22 = var20[var21];
																	if (var22 != null) {
																		var19.append(var22);
																		++var21;
																		continue;
																	}

																	class163.updateLoginIndex(7);
																	VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
																	var28 = null;
																} else {
																	var19.append("12");
																	var28 = var18.parse(var19.toString());
																}

																var29 = var28;
																break;
															}
														} catch (ParseException var37) {
															class163.updateLoginIndex(7);
															VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var55 = false;
															break label1123;
														}

														if (var29 == null) {
															var55 = false;
														} else {
															var49 = java.util.Calendar.getInstance();
															var49.set(1, var49.get(1) - 13);
															var49.set(5, var49.get(5) + 1);
															var49.set(11, 0);
															var49.set(12, 0);
															var49.set(13, 0);
															var49.set(14, 0);
															var51 = var49.getTime();
															var17 = var29.before(var51);
															var31 = java.util.Calendar.getInstance();
															var31.set(2, 0);
															var31.set(5, 1);
															var31.set(1, 1900);
															var52 = var31.getTime();
															var32 = var29.after(var52);
															if (!var32) {
																class163.updateLoginIndex(7);
																VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var55 = false;
															} else {
																if (!var17) {
																	class164.field1812 = 8388607;
																} else {
																	class164.field1812 = (int)(var29.getTime() / 86400000L - 11745L);
																}

																var55 = true;
															}
														}
													}

													if (var55) {
														ClanChannelMember.updateGameState(50);
														return;
													}
												}

												var13 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var47 - 20 && var41 <= var47 + 20) {
													Login.field941 = new String[8];
													class155.Login_promptCredentials(true);
												}

												while (var23.method4382()) {
													if (var23.field2460 == 101) {
														Login.field941[Login.field950] = null;
													}

													if (var23.field2460 == 85) {
														if (Login.field941[Login.field950] == null && Login.field950 > 0) {
															--Login.field950;
														}

														Login.field941[Login.field950] = null;
													}

													if (var23.field2459 >= '0' && var23.field2459 <= '9') {
														Login.field941[Login.field950] = "" + var23.field2459;
														if (Login.field950 < 7) {
															++Login.field950;
														}
													}

													if (var23.field2460 == 84) {
														label1052: {
															try {
																var18 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var18.setLenient(false);
																var19 = new StringBuilder();
																var20 = Login.field941;
																var21 = 0;

																while (true) {
																	if (var21 < var20.length) {
																		var22 = var20[var21];
																		if (var22 != null) {
																			var19.append(var22);
																			++var21;
																			continue;
																		}

																		class163.updateLoginIndex(7);
																		VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
																		var28 = null;
																	} else {
																		var19.append("12");
																		var28 = var18.parse(var19.toString());
																	}

																	var29 = var28;
																	break;
																}
															} catch (ParseException var36) {
																class163.updateLoginIndex(7);
																VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var55 = false;
																break label1052;
															}

															if (var29 == null) {
																var55 = false;
															} else {
																var49 = java.util.Calendar.getInstance();
																var49.set(1, var49.get(1) - 13);
																var49.set(5, var49.get(5) + 1);
																var49.set(11, 0);
																var49.set(12, 0);
																var49.set(13, 0);
																var49.set(14, 0);
																var51 = var49.getTime();
																var17 = var29.before(var51);
																var31 = java.util.Calendar.getInstance();
																var31.set(2, 0);
																var31.set(5, 1);
																var31.set(1, 1900);
																var52 = var31.getTime();
																var32 = var29.after(var52);
																if (!var32) {
																	class163.updateLoginIndex(7);
																	VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var55 = false;
																} else {
																	if (!var17) {
																		class164.field1812 = 8388607;
																	} else {
																		class164.field1812 = (int)(var29.getTime() / 86400000L - 11745L);
																	}

																	var55 = true;
																}
															}
														}

														if (var55) {
															ClanChannelMember.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class421.openURL(LoginState.method1248("secure", true) + "m=dob/set_dob.ws", true, false);
													VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", "");
													class163.updateLoginIndex(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class155.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class421.openURL("https://www.jagex.com/terms/privacy", true, false);
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", "");
												class163.updateLoginIndex(6);
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class155.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var9 = Login.loginBoxX + 180;
											var10 = 311;
											if (var23.field2460 == 84 || var23.field2460 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												UserComparator8.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var9 = Login.loginBoxX + 180;
											var10 = 209;
											if (var23.field2460 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) {
												VerticalAlignment.setLoginResponseString("", "Connecting to server...", "");
												Client.field676 = class551.field5417;
												class213.setAuthenticationScheme(false);
												ClanChannelMember.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var9 = Login.loginBoxCenter;
											var10 = 233;
											var26 = var2.method8086(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											Bounds var24 = var2.method8086(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											Bounds var25 = var2.method8086(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											var44 = var10 + 17;
											Bounds var34 = var2.method8086(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var44);
											if (var5 == 1) {
												if (var26.method7678(var40, var41)) {
													class421.openURL("https://www.jagex.com/terms", true, false);
												} else if (var24.method7678(var40, var41)) {
													class421.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var25.method7678(var40, var41) || var34.method7678(var40, var41)) {
													class421.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var9 = Login.loginBoxCenter - 80;
											var10 = 311;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class105.clientPreferences.updateEULA(Client.field637);
												UserComparator8.updateLoginStatusUsernameRemembered(true);
											}

											var9 = Login.loginBoxCenter + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var9 = Login.loginBoxCenter;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												UserComparator8.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var35 = "";
											switch(Login.Login_banType) {
											case 0:
												var35 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var35 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var35 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class155.Login_promptCredentials(false);
											}

											var44 = Login.loginBoxX + 180;
											var43 = 276;
											if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) {
												class421.openURL(var35, true, false);
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", "");
												class163.updateLoginIndex(6);
												return;
											}

											var44 = Login.loginBoxX + 180;
											var43 = 326;
											if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) {
												class155.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var9 = Login.loginBoxX + 180;
											var10 = 301;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												UserComparator8.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class421.openURL(LoginState.method1248("secure", true) + "m=dob/set_dob.ws", true, false);
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", "");
												class163.updateLoginIndex(6);
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class155.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var9 = Login.loginBoxX + 180;
											var10 = 276;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class421.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var9 = Login.loginBoxX + 180;
											var10 = 326;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class155.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var23.method4382()) {
													var42 = 321;
													if (var5 == 1 && var41 >= var42 - 20 && var41 <= var42 + 20) {
														class155.Login_promptCredentials(true);
													}

													return;
												}
											} while(var23.field2460 != 84 && var23.field2460 != 13);

											class155.Login_promptCredentials(true);
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

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	static void method5686(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = HttpResponse.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}
}
