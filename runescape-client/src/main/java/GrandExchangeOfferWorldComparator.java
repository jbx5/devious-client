import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loz;Loz;I)I",
		garbageValue = "456180240"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldh;",
		garbageValue = "1291618963"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = ModeWhere.method6961(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var6 = (-3 - var2 << 8) + var0;
			var5 = ModeWhere.method6961(var6, var0);
			if (var5 != null) {
				return var5;
			} else {
				int var7 = var0 + -512;
				var5 = ModeWhere.method6961(var7, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpi;Lpi;I)V",
		garbageValue = "-567709199"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var35;
		int var36;
		boolean var45;
		if (Login.worldSelectOpen) {
			class212 var34 = AbstractWorldMapData.method5477();

			while (true) {
				if (!var34.method4124()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (PlayerCompositionColorTextureOverride.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var4 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(0, 1);
						break;
					}

					var5 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(1, 1);
						break;
					}

					var35 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(2, 1);
						break;
					}

					var36 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var36 && MouseHandler.MouseHandler_lastPressedX <= var36 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var36 + 15 && MouseHandler.MouseHandler_lastPressedX <= var36 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						WorldMapData_1.method5372();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var37 = class176.World_worlds[Login.hoveredWorldIndex];
						if (var37.isDeadman()) {
							var37.field847 = "beta";
						}

						var45 = false;
						if (var37.properties != Client.worldProperties) {
							boolean var46 = (Client.worldProperties & class510.field5077.rsOrdinal()) != 0;
							var11 = var37.isDeadman();
							if (var46 && !var11 || !var46 && var11) {
								var45 = true;
							}
						}

						ModeWhere.changeWorld(var37);
						WorldMapData_1.method5372();
						if (var45) {
							class415.method7708();
						}
					} else {
						if (Login.worldSelectPage > 0 && class85.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class85.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class177.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class177.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Skeleton.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class113.canvasWidth - Skeleton.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class113.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class177.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class177.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var34.field2369 == 13) {
					WorldMapData_1.method5372();
					break;
				}

				if (var34.field2369 == 96) {
					if (Login.worldSelectPage > 0 && class85.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var34.field2369 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Skeleton.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !PlayerCompositionColorTextureOverride.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class449.clientPreferences.method2474(!class449.clientPreferences.method2484());
				if (!class449.clientPreferences.method2484()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(class385.archive6, "scape main", "", 255, false));
					class53.method1097(var3, 0, 0, 0, 100, false);
				} else {
					Script.method2180(0, 0);
				}

				UrlRequester.method2829();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field955) {
					Login.field955 = GameEngine.method661() + 1000L;
				}

				long var23 = GameEngine.method661();
				if (ChatChannel.method2190() && -1L == Login.field966) {
					Login.field966 = var23;
					if (Login.field966 > Login.field955) {
						Login.field955 = Login.field966;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (ClanChannelMember.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !PlayerCompositionColorTextureOverride.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var25 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var25 + var6) {
								if (class125.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (WorldMapLabelSize.World_request != null) {
							class53.method1095();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var35 = MouseHandler.MouseHandler_lastPressedX;
					var36 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var35 = MouseHandler.MouseHandler_x;
						var36 = MouseHandler.MouseHandler_y;
					}

					if (!PlayerCompositionColorTextureOverride.mouseCam && var5 == 4) {
						var5 = 1;
					}

					class212 var8 = AbstractWorldMapData.method5477();
					short var39;
					int var40;
					if (Login.loginIndex == 0) {
						var45 = false;

						while (var8.method4124()) {
							if (var8.field2369 == 84) {
								var45 = true;
							}
						}

						var40 = class452.loginBoxCenter - 80;
						var39 = 291;
						if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
							class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var40 = class452.loginBoxCenter + 80;
						if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20 || var45) {
							if ((Client.worldProperties & class510.field5086.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								PcmPlayer.method838(1);
								ObjectComposition.method3936();
							} else if ((Client.worldProperties & class510.field5071.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class510.field5092.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								PcmPlayer.method838(1);
								ObjectComposition.method3936();
							} else if ((Client.worldProperties & class510.field5092.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								PcmPlayer.method838(1);
								ObjectComposition.method3936();
							} else {
								WorldMapAreaData.Login_promptCredentials(false);
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var8.method4124()) {
									var9 = class452.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
										WorldMapAreaData.Login_promptCredentials(false);
									}

									var9 = class452.loginBoxCenter + 80;
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
										PcmPlayer.method838(0);
									}
									break;
								}

								if (var8.field2369 == 84) {
									WorldMapAreaData.Login_promptCredentials(false);
								} else if (var8.field2369 == 13) {
									PcmPlayer.method838(0);
								}
							}
						} else {
							int var14;
							int var29;
							short var38;
							boolean var47;
							if (Login.loginIndex == 2) {
								var38 = 201;
								var9 = var38 + 52;
								if (var5 == 1 && var36 >= var9 - 12 && var36 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var36 >= var9 - 12 && var36 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var38 = 361;
								if (class102.field1343 != null) {
									var40 = class102.field1343.highX / 2;
									if (var5 == 1 && var35 >= class102.field1343.lowX - var40 && var35 <= var40 + class102.field1343.lowX && var36 >= var38 - 15 && var36 < var38) {
										switch(Login.field943) {
										case 1:
											class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class30.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var40 = class452.loginBoxCenter - 80;
								var39 = 321;
								if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class318.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class318.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class318.setLoginResponseString("", "Connecting to server...", "");
									PendingSpawn.method2368(false);
									MusicSong.updateGameState(20);
									return;
								}

								var40 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
									PcmPlayer.method838(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class503.field5039 = 0;
									class369.otp = "";
									Login.field956 = true;
								}

								var40 = class452.loginBoxCenter + -117;
								var39 = 277;
								Login.field935 = var35 >= var40 && var35 < var40 + class136.field1615 && var36 >= var39 && var36 < var39 + User.field4657;
								if (var5 == 1 && Login.field935) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class449.clientPreferences.method2466() != null) {
										class449.clientPreferences.method2465((String)null);
									}
								}

								var40 = class452.loginBoxCenter + 24;
								var39 = 277;
								Login.field963 = var35 >= var40 && var35 < var40 + class136.field1615 && var36 >= var39 && var36 < var39 + User.field4657;
								if (var5 == 1 && Login.field963) {
									class449.clientPreferences.method2494(!class449.clientPreferences.method2454());
									if (!class449.clientPreferences.method2454()) {
										Login.Login_username = "";
										class449.clientPreferences.method2465((String)null);
										ObjectComposition.method3936();
									}
								}

								while (true) {
									Transferable var42;
									do {
										while (true) {
											label1508:
											do {
												while (true) {
													while (var8.method4124()) {
														if (var8.field2369 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1508;
															}

															class148.method3144(var8.field2356);
															if (var8.field2369 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2369 == 84 || var8.field2369 == 80) {
																Login.currentLoginField = 1;
															}

															if (class157.method3256(var8.field2356) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var8.field2356;
															}
														} else {
															PcmPlayer.method838(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class503.field5039 = 0;
															class369.otp = "";
															Login.field956 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var8.field2369 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var8.field2369 == 84 || var8.field2369 == 80) {
												Login.currentLoginField = 0;
												if (var8.field2369 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class318.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class318.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class318.setLoginResponseString("", "Connecting to server...", "");
													PendingSpawn.method2368(false);
													MusicSong.updateGameState(20);
													return;
												}
											}

											if ((var8.method4120(82) || var8.method4120(87)) && var8.field2369 == 67) {
												Clipboard var41 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var42 = var41.getContents(class219.client);
												var14 = 20 - Login.Login_password.length();
												break;
											}

											char var48 = var8.field2356;
											if ((var48 < ' ' || var48 >= 127) && (var48 <= 127 || var48 >= 160) && (var48 <= 160 || var48 > 255)) {
												label1726: {
													if (var48 != 0) {
														char[] var49 = class384.cp1252AsciiExtension;

														for (var29 = 0; var29 < var49.length; ++var29) {
															char var16 = var49[var29];
															if (var16 == var48) {
																var47 = true;
																break label1726;
															}
														}
													}

													var47 = false;
												}
											} else {
												var47 = true;
											}

											if (var47 && class157.method3256(var8.field2356) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var8.field2356;
											}
										}
									} while(var14 <= 0);

									try {
										String var15 = (String)var42.getTransferData(DataFlavor.stringFlavor);
										int var44 = Math.min(var14, var15.length());

										for (int var17 = 0; var17 < var44; ++var17) {
											char var19 = var15.charAt(var17);
											boolean var18;
											if ((var19 < ' ' || var19 >= 127) && (var19 <= 127 || var19 >= 160) && (var19 <= 160 || var19 > 255)) {
												label1729: {
													if (var19 != 0) {
														char[] var20 = class384.cp1252AsciiExtension;

														for (int var21 = 0; var21 < var20.length; ++var21) {
															char var22 = var20[var21];
															if (var22 == var19) {
																var18 = true;
																break label1729;
															}
														}
													}

													var18 = false;
												}
											} else {
												var18 = true;
											}

											if (!var18 || !class157.method3256(var15.charAt(var17))) {
												PcmPlayer.method838(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var44);
									} catch (UnsupportedFlavorException var32) {
									} catch (IOException var33) {
									}
								}
							} else {
								Bounds var30;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var30 = var1.method7430(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var30.method8120(var35, var36)) {
										class30.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
										WorldMapAreaData.method5584(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
										class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var27;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
											class369.otp.trim();
											if (class369.otp.length() != 6) {
												class318.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												return;
											}

											class503.field5039 = Integer.parseInt(class369.otp);
											class369.otp = "";
											PendingSpawn.method2368(true);
											class318.setLoginResponseString("", "Connecting to server...", "");
											MusicSong.updateGameState(20);
											return;
										}

										if (var5 == 1 && var35 >= Login.loginBoxX + 180 - 9 && var35 <= Login.loginBoxX + 180 + 130 && var36 >= 263 && var36 <= 296) {
											Login.field956 = !Login.field956;
										}

										if (var5 == 1 && var35 >= Login.loginBoxX + 180 - 34 && var35 <= Login.loginBoxX + 34 + 180 && var36 >= 351 && var36 <= 363) {
											class30.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
											PcmPlayer.method838(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class503.field5039 = 0;
											class369.otp = "";
										}

										while (var8.method4124()) {
											var11 = false;

											for (var27 = 0; var27 < "1234567890".length(); ++var27) {
												if (var8.field2356 == "1234567890".charAt(var27)) {
													var11 = true;
													break;
												}
											}

											if (var8.field2369 == 13) {
												PcmPlayer.method838(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class503.field5039 = 0;
												class369.otp = "";
											} else {
												if (var8.field2369 == 85 && class369.otp.length() > 0) {
													class369.otp = class369.otp.substring(0, class369.otp.length() - 1);
												}

												if (var8.field2369 == 84) {
													class369.otp.trim();
													if (class369.otp.length() != 6) {
														class318.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
														return;
													}

													class503.field5039 = Integer.parseInt(class369.otp);
													class369.otp = "";
													PendingSpawn.method2368(true);
													class318.setLoginResponseString("", "Connecting to server...", "");
													MusicSong.updateGameState(20);
													return;
												}

												if (var11 && class369.otp.length() < 6) {
													class369.otp = class369.otp + var8.field2356;
												}
											}
										}
									} else {
										int var26;
										if (Login.loginIndex == 5) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
												class108.method2715();
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
												WorldMapAreaData.Login_promptCredentials(true);
											}

											var39 = 361;
											if (class90.field1117 != null) {
												var27 = class90.field1117.highX / 2;
												if (var5 == 1 && var35 >= class90.field1117.lowX - var27 && var35 <= var27 + class90.field1117.lowX && var36 >= var39 - 15 && var36 < var39) {
													class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var8.method4124()) {
												var47 = false;

												for (var26 = 0; var26 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var26) {
													if (var8.field2356 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var26)) {
														var47 = true;
														break;
													}
												}

												if (var8.field2369 == 13) {
													WorldMapAreaData.Login_promptCredentials(true);
												} else {
													if (var8.field2369 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2369 == 84) {
														class108.method2715();
														return;
													}

													if (var47 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var8.field2356;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (ModeWhere.field4404 && !Client.onMobile) {
													var9 = class452.loginBoxCenter - 150;
													var40 = var9 + 40 + 240 + 25;
													var39 = 231;
													var27 = var39 + 40;
													if (var5 == 1 && var35 >= var9 && var35 <= var40 && var36 >= var39 && var36 <= var27) {
														var14 = var9;
														var29 = 0;

														while (true) {
															if (var29 >= 8) {
																var26 = 0;
																break;
															}

															if (var35 <= var14 + 30) {
																var26 = var29;
																break;
															}

															var14 += 30;
															var14 += var29 != 1 && var29 != 3 ? 5 : 20;
															++var29;
														}

														Login.field951 = var26;
													}

													var26 = Login.loginBoxX + 180 - 80;
													short var43 = 321;
													boolean var50;
													if (var5 == 1 && var35 >= var26 - 75 && var35 <= var26 + 75 && var36 >= var43 - 20 && var36 <= var43 + 20) {
														var50 = UserComparator6.method2923();
														if (var50) {
															MusicSong.updateGameState(50);
															return;
														}
													}

													var26 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var35 >= var26 - 75 && var35 <= var26 + 75 && var36 >= var43 - 20 && var36 <= var43 + 20) {
														Login.field954 = new String[8];
														WorldMapAreaData.Login_promptCredentials(true);
													}

													while (var8.method4124()) {
														if (var8.field2369 == 101) {
															Login.field954[Login.field951] = null;
														}

														if (var8.field2369 == 85) {
															if (Login.field954[Login.field951] == null && Login.field951 > 0) {
																--Login.field951;
															}

															Login.field954[Login.field951] = null;
														}

														if (var8.field2356 >= '0' && var8.field2356 <= '9') {
															Login.field954[Login.field951] = "" + var8.field2356;
															if (Login.field951 < 7) {
																++Login.field951;
															}
														}

														if (var8.field2369 == 84) {
															var50 = UserComparator6.method2923();
															if (var50) {
																MusicSong.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80;
													var10 = 321;
													if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
														class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=dob/set_dob.ws", true, false);
														class318.setLoginResponseString("", "Page has opened in the browser.", "");
														PcmPlayer.method838(6);
														return;
													}

													var9 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
														WorldMapAreaData.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													class30.openURL("https://www.jagex.com/terms/privacy", true, false);
													class318.setLoginResponseString("", "Page has opened in the browser.", "");
													PcmPlayer.method838(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var9 = Login.loginBoxX + 180;
												var10 = 311;
												if (var8.field2369 == 84 || var8.field2369 == 13 || var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.method5584(false);
												}
											} else if (Login.loginIndex == 10) {
												var9 = Login.loginBoxX + 180;
												var10 = 209;
												if (var8.field2369 == 84 || var5 == 1 && var35 >= var9 - 109 && var35 <= var9 + 109 && var36 >= var10 && var36 <= var10 + 68) {
													class318.setLoginResponseString("", "Connecting to server...", "");
													Client.field571 = class519.field5164;
													PendingSpawn.method2368(false);
													MusicSong.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var9 = class452.loginBoxCenter;
												var10 = 233;
												var30 = var2.method7430(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var12 = var2.method7430(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var13 = var2.method7430(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												var40 = var10 + 17;
												Bounds var28 = var2.method7430(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var40);
												if (var5 == 1) {
													if (var30.method8120(var35, var36)) {
														class30.openURL("https://www.jagex.com/terms", true, false);
													} else if (var12.method8120(var35, var36)) {
														class30.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var13.method8120(var35, var36) || var28.method8120(var35, var36)) {
														class30.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var9 = class452.loginBoxCenter - 80;
												var10 = 311;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													class9.method75();
													WorldMapAreaData.method5584(true);
												}

												var9 = class452.loginBoxCenter + 80;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var9 = class452.loginBoxCenter;
												var10 = 321;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.method5584(true);
												}
											} else if (Login.loginIndex == 14) {
												String var31 = "";
												switch(Login.Login_banType) {
												case 0:
													var31 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var31 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var31 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													WorldMapAreaData.Login_promptCredentials(false);
												}

												var40 = Login.loginBoxX + 180;
												var39 = 276;
												if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
													class30.openURL(var31, true, false);
													class318.setLoginResponseString("", "Page has opened in the browser.", "");
													PcmPlayer.method838(6);
													return;
												}

												var40 = Login.loginBoxX + 180;
												var39 = 326;
												if (var5 == 1 && var35 >= var40 - 75 && var35 <= var40 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
													WorldMapAreaData.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var9 = Login.loginBoxX + 180;
												var10 = 301;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.method5584(false);
												}
											} else if (Login.loginIndex == 32) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													class30.openURL(HorizontalAlignment.method3682("secure", true) + "m=dob/set_dob.ws", true, false);
													class318.setLoginResponseString("", "Page has opened in the browser.", "");
													PcmPlayer.method838(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													class30.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var35 >= var9 - 75 && var35 <= var9 + 75 && var36 >= var10 - 20 && var36 <= var10 + 20) {
													WorldMapAreaData.Login_promptCredentials(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method4124()) {
														var38 = 321;
														if (var5 == 1 && var36 >= var38 - 20 && var36 <= var38 + 20) {
															WorldMapAreaData.Login_promptCredentials(true);
														}

														return;
													}
												} while(var8.field2369 != 84 && var8.field2369 != 13);

												WorldMapAreaData.Login_promptCredentials(true);
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
}
