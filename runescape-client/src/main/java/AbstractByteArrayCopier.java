import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1554576635"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1596326651"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbz;Lqi;Lqi;B)V",
		garbageValue = "2"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			StructComposition.method4156(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				TaskHandler.clientPreferences.updateTitleMusicDisabled(!TaskHandler.clientPreferences.isTitleMusicDisabled());
				if (!TaskHandler.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(MouseHandler.archive6, "scape main", "", 255, false));
					ParamComposition.method4154(var3, 0, 0, 0, 100, false);
				} else {
					class167.method3766(0, 0);
				}

				class182.method3872();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field937) {
					Login.field937 = class77.method2338() + 1000L;
				}

				long var21 = class77.method2338();
				if (LoginState.method1291() && -1L == Login.field957) {
					Login.field957 = var21;
					if (Login.field957 > Login.field937) {
						Login.field937 = Login.field957;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var5;
					if (WorldMapCacheName.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) {
								if (class330.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (Friend.World_request != null && class330.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var32 = MouseHandler.MouseHandler_lastPressedX;
					int var33 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var32 = MouseHandler.MouseHandler_x;
						var33 = MouseHandler.MouseHandler_y;
					}

					if (!class150.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var23 = Client.indexCheck;
					IndexCheck var9 = var23;
					short var35;
					int var36;
					if (Login.loginIndex == 0) {
						boolean var43 = false;

						while (var9.method5650()) {
							if (var9.field2988 == 84) {
								var43 = true;
							}
						}

						var36 = DevicePcmPlayerProvider.loginBoxCenter - 80;
						var35 = 291;
						if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20) {
							GrandExchangeOfferAgeComparator.openURL(Messages.method3176("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var36 = DevicePcmPlayerProvider.loginBoxCenter + 80;
						if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20 || var43) {
							class159.method3642();
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var9.method5650()) {
									var10 = DevicePcmPlayerProvider.loginBoxCenter - 80;
									var11 = 321;
									if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
										FontName.Login_promptCredentials(false);
									}

									var10 = DevicePcmPlayerProvider.loginBoxCenter + 80;
									if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
										class6.updateLoginIndex(0);
									}
									break;
								}

								if (var9.field2988 == 84) {
									FontName.Login_promptCredentials(false);
								} else if (var9.field2988 == 13) {
									class6.updateLoginIndex(0);
								}
							}
						} else {
							int var14;
							int var15;
							short var34;
							boolean var37;
							if (Login.loginIndex == 2) {
								var34 = 201;
								var10 = var34 + 52;
								if (var5 == 1 && var33 >= var10 - 12 && var33 < var10 + 2) {
									Login.currentLoginField = 0;
								}

								var10 += 15;
								if (var5 == 1 && var33 >= var10 - 12 && var33 < var10 + 2) {
									Login.currentLoginField = 1;
								}

								var10 += 15;
								var34 = 361;
								if (ScriptFrame.field446 != null) {
									var36 = ScriptFrame.field446.highX / 2;
									if (var5 == 1 && var32 >= ScriptFrame.field446.lowX - var36 && var32 <= var36 + ScriptFrame.field446.lowX && var33 >= var34 - 15 && var33 < var34) {
										switch(Login.field938) {
										case 1:
											GrandExchangeOfferAgeComparator.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											GrandExchangeOfferAgeComparator.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var36 = DevicePcmPlayerProvider.loginBoxCenter - 80;
								var35 = 321;
								if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20) {
									class357.method6925();
									return;
								}

								var36 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20) {
									class6.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class333.otpMedium = 0;
									Huffman.otp = "";
									Login.rememberUsername = true;
								}

								var36 = DevicePcmPlayerProvider.loginBoxCenter + -117;
								var35 = 277;
								Login.field956 = var32 >= var36 && var32 < var36 + class134.field1573 && var33 >= var35 && var33 < var35 + class280.field3075;
								if (var5 == 1 && Login.field956) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && TaskHandler.clientPreferences.getRememberedUsername() != null) {
										TaskHandler.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var36 = DevicePcmPlayerProvider.loginBoxCenter + 24;
								var35 = 277;
								Login.field947 = var32 >= var36 && var32 < var36 + class134.field1573 && var33 >= var35 && var33 < var35 + class280.field3075;
								if (var5 == 1 && Login.field947) {
									TaskHandler.clientPreferences.updateHideUsername(!TaskHandler.clientPreferences.isUsernameHidden());
									if (!TaskHandler.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										TaskHandler.clientPreferences.updateRememberedUsername((String)null);
										class96.focusPasswordWhenUsernameFilled();
									}
								}

								label1282:
								while (true) {
									Transferable var45;
									do {
										while (true) {
											label1246:
											do {
												while (true) {
													while (var9.method5650()) {
														if (var9.field2988 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1246;
															}

															char var38 = var9.field2996;

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var38 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
															}

															if (var9.field2988 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var9.field2988 == 84 || var9.field2988 == 80) {
																Login.currentLoginField = 1;
															}

															char var40 = var9.field2996;
															boolean var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var40) != -1;
															if (var41 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var9.field2996;
															}
														} else {
															class6.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class333.otpMedium = 0;
															Huffman.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var9.field2988 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var9.field2988 == 84 || var9.field2988 == 80) {
												Login.currentLoginField = 0;
												if (var9.field2988 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class132.setLoginResponseString("", "Please enter your username/email address.", "");
													} else if (Login.Login_password.length() == 0) {
														class132.setLoginResponseString("", "Please enter your password.", "");
													} else {
														class132.setLoginResponseString("", "Connecting to server...", "");
														Client.authenticationScheme = TaskHandler.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
														BuddyRankComparator.updateGameState(20);
													}

													return;
												}
											}

											if ((var9.isValidIndexInRange(82) || var9.isValidIndexInRange(87)) && var9.field2988 == 67) {
												Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var45 = var44.getContents(Projectile.client);
												var15 = 20 - Login.Login_password.length();
												break;
											}

											if (Skills.method7515(var9.field2996)) {
												char var42 = var9.field2996;
												var37 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var42) != -1;
												if (var37 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var9.field2996;
												}
											}
										}
									} while(var15 <= 0);

									try {
										String var16 = (String)var45.getTransferData(DataFlavor.stringFlavor);
										int var17 = Math.min(var15, var16.length());
										int var18 = 0;

										while (true) {
											if (var18 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17);
												continue label1282;
											}

											if (!Skills.method7515(var16.charAt(var18))) {
												break;
											}

											char var20 = var16.charAt(var18);
											boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
											if (!var19) {
												break;
											}

											++var18;
										}

										class6.updateLoginIndex(3);
										return;
									} catch (UnsupportedFlavorException var30) {
									} catch (IOException var31) {
									}
								}
							} else {
								Bounds var26;
								if (Login.loginIndex == 3) {
									var10 = Login.loginBoxX + 180;
									var11 = 241;
									var26 = var1.method8598(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
									if (var5 == 1 && var26.method8142(var32, var33)) {
										GrandExchangeOfferAgeComparator.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 276;
									if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
										ClientPacket.updateLoginStatusUsernameRemembered(false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 326;
									if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
										GrandExchangeOfferAgeComparator.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
											class77.method2340();
											return;
										}

										if (var5 == 1 && var32 >= Login.loginBoxX + 180 - 9 && var32 <= Login.loginBoxX + 180 + 130 && var33 >= 263 && var33 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var32 >= Login.loginBoxX + 180 - 34 && var32 <= Login.loginBoxX + 34 + 180 && var33 >= 351 && var33 <= 363) {
											GrandExchangeOfferAgeComparator.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
											class6.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class333.otpMedium = 0;
											Huffman.otp = "";
										}

										while (var9.method5650()) {
											boolean var12 = false;

											for (var13 = 0; var13 < "1234567890".length(); ++var13) {
												if (var9.field2996 == "1234567890".charAt(var13)) {
													var12 = true;
													break;
												}
											}

											if (var9.field2988 == 13) {
												class6.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class333.otpMedium = 0;
												Huffman.otp = "";
											} else {
												if (var9.field2988 == 85 && Huffman.otp.length() > 0) {
													Huffman.otp = Huffman.otp.substring(0, Huffman.otp.length() - 1);
												}

												if (var9.field2988 == 84) {
													Huffman.otp.trim();
													if (Huffman.otp.length() != 6) {
														class132.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													} else {
														class333.otpMedium = Integer.parseInt(Huffman.otp);
														Huffman.otp = "";
														Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
														class132.setLoginResponseString("", "Connecting to server...", "");
														BuddyRankComparator.updateGameState(20);
													}

													return;
												}

												if (var12 && Huffman.otp.length() < 6) {
													Huffman.otp = Huffman.otp + var9.field2996;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
											WorldMapSectionType.method6251();
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
											FontName.Login_promptCredentials(true);
										}

										var35 = 361;
										if (class213.field2344 != null) {
											var13 = class213.field2344.highX / 2;
											if (var5 == 1 && var32 >= class213.field2344.lowX - var13 && var32 <= var13 + class213.field2344.lowX && var33 >= var35 - 15 && var33 < var35) {
												GrandExchangeOfferAgeComparator.openURL(Messages.method3176("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var9.method5650()) {
											var37 = false;

											for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
												if (var9.field2996 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
													var37 = true;
													break;
												}
											}

											if (var9.field2988 == 13) {
												FontName.Login_promptCredentials(true);
											} else {
												if (var9.field2988 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var9.field2988 == 84) {
													WorldMapSectionType.method6251();
													return;
												}

												if (var37 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var9.field2996;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (class417.field4741 && !Client.onMobile) {
												var10 = DevicePcmPlayerProvider.loginBoxCenter - 150;
												var36 = var10 + 40 + 240 + 25;
												var35 = 231;
												var13 = var35 + 40;
												if (var5 == 1 && var32 >= var10 && var32 <= var36 && var33 >= var35 && var33 <= var13) {
													var15 = var10;
													int var27 = 0;

													while (true) {
														if (var27 >= 8) {
															var14 = 0;
															break;
														}

														if (var32 <= var15 + 30) {
															var14 = var27;
															break;
														}

														var15 += 30;
														var15 += var27 != 1 && var27 != 3 ? 5 : 20;
														++var27;
													}

													Login.field930 = var14;
												}

												var14 = Login.loginBoxX + 180 - 80;
												short var39 = 321;
												boolean var46;
												if (var5 == 1 && var32 >= var14 - 75 && var32 <= var14 + 75 && var33 >= var39 - 20 && var33 <= var39 + 20) {
													var46 = FriendSystem.method2013();
													if (var46) {
														BuddyRankComparator.updateGameState(50);
														return;
													}
												}

												var14 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var32 >= var14 - 75 && var32 <= var14 + 75 && var33 >= var39 - 20 && var33 <= var39 + 20) {
													Login.field943 = new String[8];
													FontName.Login_promptCredentials(true);
												}

												while (var9.method5650()) {
													if (var9.field2988 == 101) {
														Login.field943[Login.field930] = null;
													}

													if (var9.field2988 == 85) {
														if (Login.field943[Login.field930] == null && Login.field930 > 0) {
															--Login.field930;
														}

														Login.field943[Login.field930] = null;
													}

													if (var9.field2996 >= '0' && var9.field2996 <= '9') {
														Login.field943[Login.field930] = "" + var9.field2996;
														if (Login.field930 < 7) {
															++Login.field930;
														}
													}

													if (var9.field2988 == 84) {
														var46 = FriendSystem.method2013();
														if (var46) {
															BuddyRankComparator.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
													GrandExchangeOfferAgeComparator.openURL(Messages.method3176("secure", true) + "m=dob/set_dob.ws", true, false);
													class132.setLoginResponseString("", "Page has opened in the browser.", "");
													class6.updateLoginIndex(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
													FontName.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												GrandExchangeOfferAgeComparator.openURL("https://www.jagex.com/terms/privacy", true, false);
												class132.setLoginResponseString("", "Page has opened in the browser.", "");
												class6.updateLoginIndex(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												FontName.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var10 = Login.loginBoxX + 180;
											var11 = 311;
											if (var23.field2988 == 84 || var23.field2988 == 13 || var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												ClientPacket.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var10 = Login.loginBoxX + 180;
											var11 = 209;
											if (var23.field2988 == 84 || var5 == 1 && var32 >= var10 - 109 && var32 <= var10 + 109 && var33 >= var11 && var33 <= var11 + 68) {
												class132.setLoginResponseString("", "Connecting to server...", "");
												Client.field616 = class562.field5517;
												Client.authenticationScheme = TaskHandler.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
												BuddyRankComparator.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var10 = DevicePcmPlayerProvider.loginBoxCenter;
											var11 = 233;
											var26 = var2.method8598(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var24 = var2.method8598(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var25 = var2.method8598(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											var36 = var11 + 17;
											Bounds var28 = var2.method8598(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var36);
											if (var5 == 1) {
												if (var26.method8142(var32, var33)) {
													GrandExchangeOfferAgeComparator.openURL("https://www.jagex.com/terms", true, false);
												} else if (var24.method8142(var32, var33)) {
													GrandExchangeOfferAgeComparator.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var25.method8142(var32, var33) || var28.method8142(var32, var33)) {
													GrandExchangeOfferAgeComparator.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = DevicePcmPlayerProvider.loginBoxCenter - 80;
											var11 = 311;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												class177.method3844();
												ClientPacket.updateLoginStatusUsernameRemembered(true);
											}

											var10 = DevicePcmPlayerProvider.loginBoxCenter + 80;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var10 = DevicePcmPlayerProvider.loginBoxCenter;
											var11 = 321;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												ClientPacket.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var29 = "";
											switch(Login.Login_banType) {
											case 0:
												var29 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var29 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var29 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												FontName.Login_promptCredentials(false);
											}

											var36 = Login.loginBoxX + 180;
											var35 = 276;
											if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20) {
												GrandExchangeOfferAgeComparator.openURL(var29, true, false);
												class132.setLoginResponseString("", "Page has opened in the browser.", "");
												class6.updateLoginIndex(6);
												return;
											}

											var36 = Login.loginBoxX + 180;
											var35 = 326;
											if (var5 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var33 >= var35 - 20 && var33 <= var35 + 20) {
												FontName.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var10 = Login.loginBoxX + 180;
											var11 = 301;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												ClientPacket.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												GrandExchangeOfferAgeComparator.openURL(Messages.method3176("secure", true) + "m=dob/set_dob.ws", true, false);
												class132.setLoginResponseString("", "Page has opened in the browser.", "");
												class6.updateLoginIndex(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												FontName.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												GrandExchangeOfferAgeComparator.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var5 == 1 && var32 >= var10 - 75 && var32 <= var10 + 75 && var33 >= var11 - 20 && var33 <= var11 + 20) {
												FontName.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var9.method5650()) {
													var34 = 321;
													if (var5 == 1 && var33 >= var34 - 20 && var33 <= var34 + 20) {
														FontName.Login_promptCredentials(true);
													}

													return;
												}
											} while(var9.field2988 != 84 && var9.field2988 != 13);

											FontName.Login_promptCredentials(true);
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

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636480379"
	)
	static final void method7493() {
		if (Client.field578 != class198.topLevelWorldView.plane) {
			Client.field578 = class198.topLevelWorldView.plane;
			class28.method443(class198.topLevelWorldView.plane);
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static final void method7492() {
		int var0;
		int var1;
		int var2;
		if (!Client.field648) {
			var0 = Coord.method6854(ClanChannel.field1843);
			var1 = Coord.method6854(UserComparator6.field1525);
			var2 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var0, var1, class198.topLevelWorldView.plane) - class319.field3307;
			FloorOverlayDefinition.method4353(var0, var2, var1);
		} else if (Client.field761 != null) {
			AsyncHttpResponse.cameraX = Client.field761.vmethod9495();
			PlayerType.cameraZ = Client.field761.vmethod9498();
			if (Client.field760) {
				FloorOverlayDefinition.cameraY = Client.field761.vmethod9496();
			} else {
				FloorOverlayDefinition.cameraY = ScriptFrame.getTileHeight(class198.topLevelWorldView, AsyncHttpResponse.cameraX, PlayerType.cameraZ, class198.topLevelWorldView.plane) - Client.field761.vmethod9496();
			}

			Client.field761.method9503();
		}

		if (!Client.field738) {
			var0 = Coord.method6854(GrandExchangeOfferOwnWorldComparator.field468);
			var1 = Coord.method6854(class390.field4583);
			var2 = ScriptFrame.getTileHeight(class198.topLevelWorldView, var0, var1, class198.topLevelWorldView.plane) - HorizontalAlignment.field1997;
			int var3 = var0 - AsyncHttpResponse.cameraX;
			int var4 = var2 - FloorOverlayDefinition.cameraY;
			int var5 = var1 - PlayerType.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			class138.method3480(var7, var8);
		} else {
			if (Client.field763 != null) {
				class323.cameraPitch = Client.field763.method9491();
				class323.cameraPitch = Math.min(Math.max(class323.cameraPitch, 128), 383);
				Client.field763.method9503();
			}

			if (Client.field504 != null) {
				class390.cameraYaw = Client.field504.method9491() & 2047;
				Client.field504.method9503();
			}
		}

	}
}
