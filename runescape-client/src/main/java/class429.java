import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class429 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1041183919
	)
	int field4637;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1790801963
	)
	int field4642;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 216391257
	)
	int field4639;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 965742671
	)
	int field4640;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4637).length();
		int var3 = 10 - Integer.toString(this.field4639).length();
		int var4 = 10 - Integer.toString(this.field4642).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4637 + var5 + "Created: " + this.field4642 + var7 + "Total used: " + this.field4639 + var6 + "Max-In-Use: " + this.field4640;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpb;Lpb;I)V",
		garbageValue = "-1632590840"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			class202.method3919(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class30.clientPreferences.updateTitleMusicDisabled(!class30.clientPreferences.isTitleMusicDisabled());
				if (!class30.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(Renderable.archive6, "scape main", "", 255, false));
					PacketWriter.method2891(var3, 0, 0, 0, 100, false);
				} else {
					class169.method3521(0, 0);
				}

				GrandExchangeOfferOwnWorldComparator.method1192();
			}

			if (Client.gameState != 5) {
				if (Login.field974 == -1L) {
					Login.field974 = SecureRandomCallable.method2320() + 1000L;
				}

				long var24 = SecureRandomCallable.method2320();
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

				if (var5 && Login.field975 == -1L) {
					Login.field975 = var24;
					if (Login.field975 > Login.field974) {
						Login.field974 = Login.field975;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var26;
					if (WorldMapCacheName.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var26 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var26 && MouseHandler.MouseHandler_lastPressedX <= var8 + var26 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) {
								if (FileSystem.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (PacketBufferNode.World_request != null && FileSystem.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var26 = MouseHandler.MouseHandler_lastButton;
					int var54 = MouseHandler.MouseHandler_lastPressedX;
					int var55 = MouseHandler.MouseHandler_lastPressedY;
					if (var26 == 0) {
						var54 = MouseHandler.MouseHandler_x;
						var55 = MouseHandler.MouseHandler_y;
					}

					if (!DbTableType.mouseCam && var26 == 4) {
						var26 = 1;
					}

					class228 var27 = PacketBufferNode.method6051();
					short var57;
					int var58;
					if (Login.loginIndex == 0) {
						boolean var67 = false;

						while (var27.method4431()) {
							if (var27.field2434 == 84) {
								var67 = true;
							}
						}

						var58 = Login.loginBoxCenter - 80;
						var57 = 291;
						if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) {
							class137.openURL(class317.method6073("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var58 = Login.loginBoxCenter + 80;
						if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20 || var67) {
							class485.method8806();
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var27.method4431()) {
									var10 = Login.loginBoxCenter - 80;
									var11 = 321;
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
										class148.Login_promptCredentials(false);
									}

									var10 = Login.loginBoxCenter + 80;
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
										JagexCache.method4224(0);
									}
									break;
								}

								if (var27.field2434 == 84) {
									class148.Login_promptCredentials(false);
								} else if (var27.field2434 == 13) {
									JagexCache.method4224(0);
								}
							}
						} else {
							int var14;
							short var56;
							if (Login.loginIndex == 2) {
								var56 = 201;
								var10 = var56 + 52;
								if (var26 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) {
									Login.currentLoginField = 0;
								}

								var10 += 15;
								if (var26 == 1 && var55 >= var10 - 12 && var55 < var10 + 2) {
									Login.currentLoginField = 1;
								}

								var10 += 15;
								var56 = 361;
								if (HttpMethod.field35 != null) {
									var58 = HttpMethod.field35.highX / 2;
									if (var26 == 1 && var54 >= HttpMethod.field35.lowX - var58 && var54 <= var58 + HttpMethod.field35.lowX && var55 >= var56 - 15 && var55 < var56) {
										switch(Login.field977) {
										case 1:
											class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class137.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var58 = Login.loginBoxCenter - 80;
								var57 = 321;
								if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) {
									class109.method2796();
									return;
								}

								var58 = Login.loginBoxX + 180 + 80;
								if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) {
									JagexCache.method4224(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class36.otpMedium = 0;
									MenuAction.otp = "";
									Login.rememberUsername = true;
								}

								var58 = Login.loginBoxCenter + -117;
								var57 = 277;
								Login.field979 = var54 >= var58 && var54 < var58 + FriendSystem.field859 && var55 >= var57 && var55 < var57 + class316.field3448;
								if (var26 == 1 && Login.field979) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class30.clientPreferences.getRememberedUsername() != null) {
										class30.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var58 = Login.loginBoxCenter + 24;
								var57 = 277;
								Login.field965 = var54 >= var58 && var54 < var58 + FriendSystem.field859 && var55 >= var57 && var55 < var57 + class316.field3448;
								if (var26 == 1 && Login.field965) {
									class30.clientPreferences.updateHideUsername(!class30.clientPreferences.isUsernameHidden());
									if (!class30.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class30.clientPreferences.updateRememberedUsername((String)null);
										Message.method1182();
									}
								}

								while (true) {
									int var62;
									Transferable var70;
									do {
										while (true) {
											label1349:
											do {
												while (true) {
													while (var27.method4431()) {
														if (var27.field2434 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1349;
															}

															char var61 = var27.field2428;

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var61 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
															}

															if (var27.field2434 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var27.field2434 == 84 || var27.field2434 == 80) {
																Login.currentLoginField = 1;
															}

															if (HorizontalAlignment.method3688(var27.field2428) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var27.field2428;
															}
														} else {
															JagexCache.method4224(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class36.otpMedium = 0;
															MenuAction.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var27.field2434 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var27.field2434 == 84 || var27.field2434 == 80) {
												Login.currentLoginField = 0;
												if (var27.field2434 == 84) {
													class109.method2796();
													return;
												}
											}

											if ((var27.method4466(82) || var27.method4466(87)) && var27.field2434 == 67) {
												Clipboard var69 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var70 = var69.getContents(class193.client);
												var62 = 20 - Login.Login_password.length();
												break;
											}

											if (class344.method6465(var27.field2428) && HorizontalAlignment.method3688(var27.field2428) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var27.field2428;
											}
										}
									} while(var62 <= 0);

									try {
										String var63 = (String)var70.getTransferData(DataFlavor.stringFlavor);
										int var17 = Math.min(var62, var63.length());

										for (int var64 = 0; var64 < var17; ++var64) {
											if (!class344.method6465(var63.charAt(var64)) || !HorizontalAlignment.method3688(var63.charAt(var64))) {
												JagexCache.method4224(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var63.substring(0, var17);
									} catch (UnsupportedFlavorException var52) {
									} catch (IOException var53) {
									}
								}
							} else {
								Bounds var30;
								if (Login.loginIndex == 3) {
									var10 = Login.loginBoxX + 180;
									var11 = 241;
									var30 = var1.method7882(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
									if (var26 == 1 && var30.method8552(var54, var55)) {
										class137.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 276;
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
										PacketBufferNode.method6050(false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 326;
									if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
										class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
											ChatChannel.method2249();
											return;
										}

										if (var26 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var26 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) {
											class137.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
											JagexCache.method4224(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class36.otpMedium = 0;
											MenuAction.otp = "";
										}

										while (var27.method4431()) {
											boolean var12 = false;

											for (var13 = 0; var13 < "1234567890".length(); ++var13) {
												if (var27.field2428 == "1234567890".charAt(var13)) {
													var12 = true;
													break;
												}
											}

											if (var27.field2434 == 13) {
												JagexCache.method4224(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class36.otpMedium = 0;
												MenuAction.otp = "";
											} else {
												if (var27.field2434 == 85 && MenuAction.otp.length() > 0) {
													MenuAction.otp = MenuAction.otp.substring(0, MenuAction.otp.length() - 1);
												}

												if (var27.field2434 == 84) {
													ChatChannel.method2249();
													return;
												}

												if (var12 && MenuAction.otp.length() < 6) {
													MenuAction.otp = MenuAction.otp + var27.field2428;
												}
											}
										}
									} else {
										int var22;
										if (Login.loginIndex == 5) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													SecureUrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var34;
													try {
														URL var31 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws");
														URLConnection var16 = var31.openConnection();
														var16.setRequestProperty("connection", "close");
														var16.setDoInput(true);
														var16.setDoOutput(true);
														var16.setConnectTimeout(5000);
														OutputStreamWriter var72 = new OutputStreamWriter(var16.getOutputStream());
														var72.write("data1=req");
														var72.flush();
														InputStream var74 = var16.getInputStream();
														Buffer var65 = new Buffer(new byte[1000]);

														while (true) {
															int var20 = var74.read(var65.array, var65.offset, 1000 - var65.offset);
															if (var20 == -1) {
																var65.offset = 0;
																long var36 = var65.readLong();
																var34 = var36;
																break;
															}

															var65.offset += var20;
															if (var65.offset >= 1000) {
																var34 = 0L;
																break;
															}
														}
													} catch (Exception var48) {
														var34 = 0L;
													}

													int var59;
													if (0L == var34) {
														var59 = 5;
													} else {
														var59 = class196.method3817(var34, Login.Login_username);
													}

													switch(var59) {
													case 2:
														SecureUrlRequester.setLoginResponseString(Strings.field4272, Strings.field4088, Strings.field4274);
														JagexCache.method4224(6);
														break;
													case 3:
														SecureUrlRequester.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 4:
														SecureUrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
														break;
													case 5:
														SecureUrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
														break;
													case 6:
														SecureUrlRequester.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 7:
														SecureUrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}

												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
												class148.Login_promptCredentials(true);
											}

											var57 = 361;
											if (SpriteMask.field3613 != null) {
												var13 = SpriteMask.field3613.highX / 2;
												if (var26 == 1 && var54 >= SpriteMask.field3613.lowX - var13 && var54 <= var13 + SpriteMask.field3613.lowX && var55 >= var57 - 15 && var55 < var57) {
													class137.openURL(class317.method6073("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var27.method4431()) {
												boolean var60 = false;

												for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
													if (var27.field2428 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
														var60 = true;
														break;
													}
												}

												if (var27.field2434 == 13) {
													class148.Login_promptCredentials(true);
												} else {
													if (var27.field2434 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var27.field2434 == 84) {
														Login.Login_username = Login.Login_username.trim();
														if (Login.Login_username.length() == 0) {
															SecureUrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
														} else {
															long var38;
															try {
																URL var32 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws");
																URLConnection var33 = var32.openConnection();
																var33.setRequestProperty("connection", "close");
																var33.setDoInput(true);
																var33.setDoOutput(true);
																var33.setConnectTimeout(5000);
																OutputStreamWriter var19 = new OutputStreamWriter(var33.getOutputStream());
																var19.write("data1=req");
																var19.flush();
																InputStream var40 = var33.getInputStream();
																Buffer var21 = new Buffer(new byte[1000]);

																while (true) {
																	var22 = var40.read(var21.array, var21.offset, 1000 - var21.offset);
																	if (var22 == -1) {
																		var21.offset = 0;
																		long var41 = var21.readLong();
																		var38 = var41;
																		break;
																	}

																	var21.offset += var22;
																	if (var21.offset >= 1000) {
																		var38 = 0L;
																		break;
																	}
																}
															} catch (Exception var49) {
																var38 = 0L;
															}

															if (var38 == 0L) {
																var14 = 5;
															} else {
																var14 = class196.method3817(var38, Login.Login_username);
															}

															switch(var14) {
															case 2:
																SecureUrlRequester.setLoginResponseString(Strings.field4272, Strings.field4088, Strings.field4274);
																JagexCache.method4224(6);
																break;
															case 3:
																SecureUrlRequester.setLoginResponseString("", "Error connecting to server.", "");
																break;
															case 4:
																SecureUrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
																break;
															case 5:
																SecureUrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
																break;
															case 6:
																SecureUrlRequester.setLoginResponseString("", "Error connecting to server.", "");
																break;
															case 7:
																SecureUrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
															}
														}

														return;
													}

													if (var60 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var27.field2428;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (GameObject.field3131 && !Client.onMobile) {
													var10 = Login.loginBoxCenter - 150;
													var58 = var10 + 40 + 240 + 25;
													var57 = 231;
													var13 = var57 + 40;
													if (var26 == 1 && var54 >= var10 && var54 <= var58 && var55 >= var57 && var55 <= var13) {
														Login.field961 = class93.method2441(var10, var54);
													}

													var14 = Login.loginBoxX + 180 - 80;
													short var15 = 321;
													boolean var18;
													String var23;
													boolean var45;
													boolean var46;
													SimpleDateFormat var66;
													String[] var68;
													Date var73;
													Date var75;
													StringBuilder var76;
													Date var77;
													if (var26 == 1 && var54 >= var14 - 75 && var54 <= var14 + 75 && var55 >= var15 - 20 && var55 <= var15 + 20) {
														label1244: {
															try {
																var66 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var66.setLenient(false);
																var76 = new StringBuilder();
																var68 = Login.field962;
																var22 = 0;

																while (true) {
																	if (var22 >= var68.length) {
																		var76.append("12");
																		var75 = var66.parse(var76.toString());
																		break;
																	}

																	var23 = var68[var22];
																	if (var23 == null) {
																		class36.method659("Date not valid.", "Please ensure all characters are populated.", "");
																		var75 = null;
																		break;
																	}

																	var76.append(var23);
																	++var22;
																}

																var73 = var75;
															} catch (ParseException var51) {
																class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var45 = false;
																break label1244;
															}

															if (var73 == null) {
																var45 = false;
															} else {
																var18 = class209.method4123(var73);
																var77 = RestClientThreadFactory.method192();
																var46 = var73.after(var77);
																if (!var46) {
																	class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var45 = false;
																} else {
																	if (!var18) {
																		class318.field3457 = 8388607;
																	} else {
																		class318.field3457 = (int)(var73.getTime() / 86400000L - 11745L);
																	}

																	var45 = true;
																}
															}
														}

														if (var45) {
															Interpreter.updateGameState(50);
															return;
														}
													}

													var14 = Login.loginBoxX + 180 + 80;
													if (var26 == 1 && var54 >= var14 - 75 && var54 <= var14 + 75 && var55 >= var15 - 20 && var55 <= var15 + 20) {
														Login.field962 = new String[8];
														class148.Login_promptCredentials(true);
													}

													while (var27.method4431()) {
														if (var27.field2434 == 101) {
															Login.field962[Login.field961] = null;
														}

														if (var27.field2434 == 85) {
															if (Login.field962[Login.field961] == null && Login.field961 > 0) {
																--Login.field961;
															}

															Login.field962[Login.field961] = null;
														}

														if (var27.field2428 >= '0' && var27.field2428 <= '9') {
															Login.field962[Login.field961] = "" + var27.field2428;
															if (Login.field961 < 7) {
																++Login.field961;
															}
														}

														if (var27.field2434 == 84) {
															label1172: {
																try {
																	var66 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																	var66.setLenient(false);
																	var76 = new StringBuilder();
																	var68 = Login.field962;
																	var22 = 0;

																	while (true) {
																		if (var22 < var68.length) {
																			var23 = var68[var22];
																			if (var23 != null) {
																				var76.append(var23);
																				++var22;
																				continue;
																			}

																			class36.method659("Date not valid.", "Please ensure all characters are populated.", "");
																			var75 = null;
																		} else {
																			var76.append("12");
																			var75 = var66.parse(var76.toString());
																		}

																		var73 = var75;
																		break;
																	}
																} catch (ParseException var50) {
																	class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var45 = false;
																	break label1172;
																}

																if (var73 == null) {
																	var45 = false;
																} else {
																	var18 = class209.method4123(var73);
																	var77 = RestClientThreadFactory.method192();
																	var46 = var73.after(var77);
																	if (!var46) {
																		class36.method659("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var45 = false;
																	} else {
																		if (!var18) {
																			class318.field3457 = 8388607;
																		} else {
																			class318.field3457 = (int)(var73.getTime() / 86400000L - 11745L);
																		}

																		var45 = true;
																	}
																}
															}

															if (var45) {
																Interpreter.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var10 = Login.loginBoxX + 180 - 80;
													var11 = 321;
													if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
														class137.openURL(class317.method6073("secure", true) + "m=dob/set_dob.ws", true, false);
														SecureUrlRequester.setLoginResponseString("", "Page has opened in the browser.", "");
														JagexCache.method4224(6);
														return;
													}

													var10 = Login.loginBoxX + 180 + 80;
													if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
														class148.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class137.openURL("https://www.jagex.com/terms/privacy", true, false);
													SecureUrlRequester.setLoginResponseString("", "Page has opened in the browser.", "");
													JagexCache.method4224(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class148.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var10 = Login.loginBoxX + 180;
												var11 = 311;
												if (var27.field2434 == 84 || var27.field2434 == 13 || var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													PacketBufferNode.method6050(false);
												}
											} else if (Login.loginIndex == 10) {
												var10 = Login.loginBoxX + 180;
												var11 = 209;
												if (var27.field2434 == 84 || var26 == 1 && var54 >= var10 - 109 && var54 <= var10 + 109 && var55 >= var11 && var55 <= var11 + 68) {
													SecureUrlRequester.setLoginResponseString("", "Connecting to server...", "");
													Client.field563 = class538.field5253;
													ScriptEvent.setAuthenticationScheme(false);
													Interpreter.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var10 = Login.loginBoxCenter;
												var11 = 233;
												var30 = var2.method7882(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												Bounds var28 = var2.method7882(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												Bounds var29 = var2.method7882(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												var58 = var11 + 17;
												Bounds var71 = var2.method7882(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var58);
												if (var26 == 1) {
													if (var30.method8552(var54, var55)) {
														class137.openURL("https://www.jagex.com/terms", true, false);
													} else if (var28.method8552(var54, var55)) {
														class137.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var29.method8552(var54, var55) || var71.method8552(var54, var55)) {
														class137.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var10 = Login.loginBoxCenter - 80;
												var11 = 311;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class36.reinitializeClient();
													PacketBufferNode.method6050(true);
												}

												var10 = Login.loginBoxCenter + 80;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var10 = Login.loginBoxCenter;
												var11 = 321;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													PacketBufferNode.method6050(true);
												}
											} else if (Login.loginIndex == 14) {
												String var47 = "";
												switch(Login.Login_banType) {
												case 0:
													var47 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var47 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var47 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													class148.Login_promptCredentials(false);
												}

												var58 = Login.loginBoxX + 180;
												var57 = 276;
												if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) {
													class137.openURL(var47, true, false);
													SecureUrlRequester.setLoginResponseString("", "Page has opened in the browser.", "");
													JagexCache.method4224(6);
													return;
												}

												var58 = Login.loginBoxX + 180;
												var57 = 326;
												if (var26 == 1 && var54 >= var58 - 75 && var54 <= var58 + 75 && var55 >= var57 - 20 && var55 <= var57 + 20) {
													class148.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var10 = Login.loginBoxX + 180;
												var11 = 301;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													PacketBufferNode.method6050(false);
												}
											} else if (Login.loginIndex == 32) {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class137.openURL(class317.method6073("secure", true) + "m=dob/set_dob.ws", true, false);
													SecureUrlRequester.setLoginResponseString("", "Page has opened in the browser.", "");
													JagexCache.method4224(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class148.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var10 = Login.loginBoxX + 180;
												var11 = 276;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class137.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var10 = Login.loginBoxX + 180;
												var11 = 326;
												if (var26 == 1 && var54 >= var10 - 75 && var54 <= var10 + 75 && var55 >= var11 - 20 && var55 <= var11 + 20) {
													class148.Login_promptCredentials(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var27.method4431()) {
														var56 = 321;
														if (var26 == 1 && var55 >= var56 - 20 && var55 <= var56 + 20) {
															class148.Login_promptCredentials(true);
														}

														return;
													}
												} while(var27.field2434 != 84 && var27.field2434 != 13);

												class148.Login_promptCredentials(true);
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

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lng;S)I",
		garbageValue = "-146"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
