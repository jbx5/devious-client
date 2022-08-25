import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
import java.awt.datatransfer.Clipboard;
import java.text.ParseException;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.LinkedHashMap;
import java.awt.datatransfer.DataFlavor;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("fe")
public class class174 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lab;Lmg;I)V", garbageValue = "445754216")
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!ParamComposition.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (Bounds.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}
					int var2 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(0, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(0, 1);
						break;
					}
					int var3 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(1, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(1, 1);
						break;
					}
					int var40 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(2, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(2, 1);
						break;
					}
					var5 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(3, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						PlayerComposition.changeWorldSelectSorting(3, 1);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						class144.method3010();
						break;
					}
					if (Login.hoveredWorldIndex != -1) {
						World var6 = World.World_worlds[Login.hoveredWorldIndex];
						WorldMapID.changeWorld(var6);
						class144.method3010();
					} else {
						if (Login.worldSelectPage > 0 && class17.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class17.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WallDecoration.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WallDecoration.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}
						if (Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class7.canvasWidth - class14.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class7.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WallDecoration.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WallDecoration.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}
				if (class145.field1653 == 13) {
					class144.method3010();
					break;
				}
				if (class145.field1653 == 96) {
					if (Login.worldSelectPage > 0 && class17.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (class145.field1653 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class14.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			} 
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				ClanMate.clientPreferences.method2212(!ClanMate.clientPreferences.method2213());
				if (!ClanMate.clientPreferences.method2213()) {
					Renderable.method4229(PacketBuffer.archive6, "scape main", "", 255, false);
				} else {
					VarcInt.method3328();
				}
			}
			if (Client.gameState != 5) {
				if (-1L == Login.field889) {
					Login.field889 = class181.method3483() + 1000L;
				}
				long var22 = class181.method3483();
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var4 = true;
							break;
						}
						ArchiveLoader var24 = ((ArchiveLoader) (Client.archiveLoaders.get(Client.archiveLoadersDone)));
						if (!var24.isLoaded()) {
							var4 = false;
							break;
						}
						++Client.archiveLoadersDone;
					} 
				} else {
					var4 = true;
				}
				if (var4 && -1L == Login.field910) {
					Login.field910 = var22;
					if (Login.field910 > Login.field889) {
						Login.field889 = Login.field910;
					}
				}
				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == MilliClock.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var25 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var8 + var25) {
								if (class4.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}
								return;
							}
						}
						if (class258.World_request != null && class4.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}
					var5 = MouseHandler.MouseHandler_lastButton;
					int var54 = MouseHandler.MouseHandler_lastPressedX;
					int var41 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var54 = MouseHandler.MouseHandler_x;
						var41 = MouseHandler.MouseHandler_y;
					}
					if (!Bounds.mouseCam && var5 == 4) {
						var5 = 1;
					}
					int var44;
					short var45;
					if (Login.loginIndex == 0) {
						boolean var52 = false;
						while (ParamComposition.isKeyDown()) {
							if (class145.field1653 == 84) {
								var52 = true;
							}
						} 
						var44 = Login.loginBoxCenter - 80;
						var45 = 291;
						if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) {
							class400.openURL(ModeWhere.method6005("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}
						var44 = Login.loginBoxCenter + 80;
						if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20 || var52) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class116.method2683(1);
								ReflectionCheck.method580();
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}
								Login.Login_response0 = "Warning!";
								class116.method2683(1);
								ReflectionCheck.method580();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class116.method2683(1);
								ReflectionCheck.method580();
							} else {
								class6.Login_promptCredentials(false);
							}
						}
					} else {
						short var9;
						int var42;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!ParamComposition.isKeyDown()) {
									var42 = Login.loginBoxCenter - 80;
									var9 = 321;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										class6.Login_promptCredentials(false);
									}
									var42 = Login.loginBoxCenter + 80;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										class116.method2683(0);
									}
									break;
								}
								if (class145.field1653 == 84) {
									class6.Login_promptCredentials(false);
								} else if (class145.field1653 == 13) {
									class116.method2683(0);
								}
							} 
						} else {
							int var12;
							short var43;
							boolean var46;
							if (Login.loginIndex == 2) {
								var43 = 201;
								var42 = var43 + 52;
								if (var5 == 1 && var41 >= var42 - 12 && var41 < var42 + 2) {
									Login.currentLoginField = 0;
								}
								var42 += 15;
								if (var5 == 1 && var41 >= var42 - 12 && var41 < var42 + 2) {
									Login.currentLoginField = 1;
								}
								var42 += 15;
								var43 = 361;
								if (class11.field60 != null) {
									var44 = class11.field60.highX / 2;
									if (var5 == 1 && var54 >= class11.field60.lowX - var44 && var54 <= var44 + class11.field60.lowX && var41 >= var43 - 15 && var41 < var43) {
										switch (Login.field875) {
											case 1 :
												ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												class116.method2683(5);
												return;
											case 2 :
												class400.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}
								var44 = Login.loginBoxCenter - 80;
								var45 = 321;
								if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										ItemComposition.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}
									if (Login.Login_password.length() == 0) {
										ItemComposition.setLoginResponseString("", "Please enter your password.", "");
										return;
									}
									ItemComposition.setLoginResponseString("", "Connecting to server...", "");
									method3382(false);
									class4.updateGameState(20);
									return;
								}
								var44 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) {
									class116.method2683(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class19.field100 = 0;
									KeyHandler.otp = "";
									Login.field895 = true;
								}
								var44 = Login.loginBoxCenter + -117;
								var45 = 277;
								Login.field868 = var54 >= var44 && var54 < var44 + ClientPreferences.field1245 && var41 >= var45 && var41 < var45 + class141.field1635;
								if (var5 == 1 && Login.field868) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && ClanMate.clientPreferences.method2227() != null) {
										ClanMate.clientPreferences.method2268(((String) (null)));
									}
								}
								var44 = Login.loginBoxCenter + 24;
								var45 = 277;
								Login.field894 = var54 >= var44 && var54 < var44 + ClientPreferences.field1245 && var41 >= var45 && var41 < var45 + class141.field1635;
								if (var5 == 1 && Login.field894) {
									ClanMate.clientPreferences.method2210(!ClanMate.clientPreferences.method2211());
									if (!ClanMate.clientPreferences.method2211()) {
										Login.Login_username = "";
										ClanMate.clientPreferences.method2268(((String) (null)));
										ReflectionCheck.method580();
									}
								}
								while (true) {
									int var48;
									Transferable var56;
									do {
										while (true) {
											label1460 : do {
												while (true) {
													while (ParamComposition.isKeyDown()) {
														if (class145.field1653 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1460;
															}
															char var47 = BoundaryObject.field2636;
															for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length() && var47 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var12); ++var12) {
															}
															if (class145.field1653 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}
															if (class145.field1653 == 84 || class145.field1653 == 80) {
																Login.currentLoginField = 1;
															}
															if (WorldMapSectionType.method4879(BoundaryObject.field2636) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + BoundaryObject.field2636;
															}
														} else {
															class116.method2683(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class19.field100 = 0;
															KeyHandler.otp = "";
															Login.field895 = true;
														}
													} 
													return;
												} 
											} while (Login.currentLoginField != 1 );
											if (class145.field1653 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class145.field1653 == 84 || class145.field1653 == 80) {
												Login.currentLoginField = 0;
												if (class145.field1653 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														ItemComposition.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}
													if (Login.Login_password.length() == 0) {
														ItemComposition.setLoginResponseString("", "Please enter your password.", "");
														return;
													}
													ItemComposition.setLoginResponseString("", "Connecting to server...", "");
													method3382(false);
													class4.updateGameState(20);
													return;
												}
											}
											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class145.field1653 == 67) {
												Clipboard var55 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var56 = var55.getContents(AbstractByteArrayCopier.client);
												var48 = 20 - Login.Login_password.length();
												break;
											}
											char var49 = BoundaryObject.field2636;
											if (var49 >= ' ' && var49 < 127 || var49 > 127 && var49 < 160 || var49 > 160 && var49 <= 255) {
												var46 = true;
											} else {
												label1696 : {
													if (var49 != 0) {
														char[] var57 = class341.cp1252AsciiExtension;
														for (int var58 = 0; var58 < var57.length; ++var58) {
															char var15 = var57[var58];
															if (var15 == var49) {
																var46 = true;
																break label1696;
															}
														}
													}
													var46 = false;
												}
											}
											if (var46 && WorldMapSectionType.method4879(BoundaryObject.field2636) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + BoundaryObject.field2636;
											}
										} 
									} while (var48 <= 0 );
									try {
										String var14 = ((String) (var56.getTransferData(DataFlavor.stringFlavor)));
										int var50 = Math.min(var48, var14.length());
										for (int var51 = 0; var51 < var50; ++var51) {
											char var53 = var14.charAt(var51);
											boolean var17;
											if ((var53 < ' ' || var53 >= 127) && (var53 <= 127 || var53 >= 160) && (var53 <= 160 || var53 > 255)) {
												label1683 : {
													if (var53 != 0) {
														char[] var19 = class341.cp1252AsciiExtension;
														for (int var20 = 0; var20 < var19.length; ++var20) {
															char var21 = var19[var20];
															if (var21 == var53) {
																var17 = true;
																break label1683;
															}
														}
													}
													var17 = false;
												}
											} else {
												var17 = true;
											}
											if (!var17 || !WorldMapSectionType.method4879(var14.charAt(var51))) {
												class116.method2683(3);
												return;
											}
										}
										Login.Login_password = Login.Login_password + var14.substring(0, var50);
									} catch (UnsupportedFlavorException var38) {
									} catch (IOException var39) {
									}
								} 
							} else if (Login.loginIndex == 3) {
								var42 = Login.loginBoxX + 180;
								var9 = 276;
								if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
									class33.method572(false);
								}
								var42 = Login.loginBoxX + 180;
								var9 = 326;
								if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
									ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									class116.method2683(5);
									return;
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) {
									var42 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										KeyHandler.otp.trim();
										if (KeyHandler.otp.length() != 6) {
											ItemComposition.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}
										class19.field100 = Integer.parseInt(KeyHandler.otp);
										KeyHandler.otp = "";
										method3382(true);
										ItemComposition.setLoginResponseString("", "Connecting to server...", "");
										class4.updateGameState(20);
										return;
									}
									if (var5 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) {
										Login.field895 = !Login.field895;
									}
									if (var5 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) {
										class400.openURL(ModeWhere.method6005("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}
									var42 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										class116.method2683(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class19.field100 = 0;
										KeyHandler.otp = "";
									}
									while (ParamComposition.isKeyDown()) {
										boolean var10 = false;
										for (var11 = 0; var11 < "1234567890".length(); ++var11) {
											if (BoundaryObject.field2636 == "1234567890".charAt(var11)) {
												var10 = true;
												break;
											}
										}
										if (class145.field1653 == 13) {
											class116.method2683(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class19.field100 = 0;
											KeyHandler.otp = "";
										} else {
											if (class145.field1653 == 85 && KeyHandler.otp.length() > 0) {
												KeyHandler.otp = KeyHandler.otp.substring(0, KeyHandler.otp.length() - 1);
											}
											if (class145.field1653 == 84) {
												KeyHandler.otp.trim();
												if (KeyHandler.otp.length() != 6) {
													ItemComposition.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}
												class19.field100 = Integer.parseInt(KeyHandler.otp);
												KeyHandler.otp = "";
												method3382(true);
												ItemComposition.setLoginResponseString("", "Connecting to server...", "");
												class4.updateGameState(20);
												return;
											}
											if (var10 && KeyHandler.otp.length() < 6) {
												KeyHandler.otp = KeyHandler.otp + BoundaryObject.field2636;
											}
										}
									} 
								} else if (Login.loginIndex == 5) {
									var42 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										UserComparator7.method2558();
										return;
									}
									var42 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
										class6.Login_promptCredentials(true);
									}
									var45 = 361;
									if (UrlRequester.field1346 != null) {
										var11 = UrlRequester.field1346.highX / 2;
										if (var5 == 1 && var54 >= UrlRequester.field1346.lowX - var11 && var54 <= var11 + UrlRequester.field1346.lowX && var41 >= var45 - 15 && var41 < var45) {
											class400.openURL(ModeWhere.method6005("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}
									while (ParamComposition.isKeyDown()) {
										var46 = false;
										for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var12) {
											if (BoundaryObject.field2636 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var12)) {
												var46 = true;
												break;
											}
										}
										if (class145.field1653 == 13) {
											class6.Login_promptCredentials(true);
										} else {
											if (class145.field1653 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}
											if (class145.field1653 == 84) {
												UserComparator7.method2558();
												return;
											}
											if (var46 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + BoundaryObject.field2636;
											}
										}
									} 
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (class82.field1066 && !Client.onMobile) {
											var42 = Login.loginBoxCenter - 150;
											var44 = var42 + 40 + 240 + 25;
											var45 = 231;
											var11 = var45 + 40;
											if (var5 == 1 && var54 >= var42 && var54 <= var44 && var41 >= var45 && var41 <= var11) {
												Login.field891 = WorldMapSection0.method4869(var42, var54);
											}
											var12 = Login.loginBoxX + 180 - 80;
											short var13 = 321;
											boolean var16;
											boolean var18;
											boolean var29;
											Date var30;
											java.util.Calendar var32;
											Date var33;
											if (var5 == 1 && var54 >= var12 - 75 && var54 <= var12 + 75 && var41 >= var13 - 20 && var41 <= var13 + 20) {
												label1355 : {
													try {
														var30 = Friend.method6595();
													} catch (ParseException var37) {
														class116.method2683(7);
														ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
														var29 = false;
														break label1355;
													}
													if (var30 == null) {
														var29 = false;
													} else {
														var32 = java.util.Calendar.getInstance();
														var32.set(1, var32.get(1) - 13);
														var32.set(5, var32.get(5) + 1);
														var32.set(11, 0);
														var32.set(12, 0);
														var32.set(13, 0);
														var32.set(14, 0);
														var33 = var32.getTime();
														var16 = var30.before(var33);
														var18 = class134.method2858(var30);
														if (!var18) {
															class116.method2683(7);
															ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var29 = false;
														} else {
															if (!var16) {
																Bounds.field4379 = 8388607;
															} else {
																Bounds.field4379 = ((int) (var30.getTime() / 86400000L - 11745L));
															}
															var29 = true;
														}
													}
												}
												if (var29) {
													class4.updateGameState(50);
													return;
												}
											}
											var12 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var54 >= var12 - 75 && var54 <= var12 + 75 && var41 >= var13 - 20 && var41 <= var13 + 20) {
												Login.field892 = new String[8];
												class6.Login_promptCredentials(true);
											}
											while (ParamComposition.isKeyDown()) {
												if (class145.field1653 == 101) {
													Login.field892[Login.field891] = null;
												}
												if (class145.field1653 == 85) {
													if (Login.field892[Login.field891] == null && Login.field891 > 0) {
														--Login.field891;
													}
													Login.field892[Login.field891] = null;
												}
												if (BoundaryObject.field2636 >= '0' && BoundaryObject.field2636 <= '9') {
													Login.field892[Login.field891] = "" + BoundaryObject.field2636;
													if (Login.field891 < 7) {
														++Login.field891;
													}
												}
												if (class145.field1653 == 84) {
													label1291 : {
														try {
															var30 = Friend.method6595();
														} catch (ParseException var36) {
															class116.method2683(7);
															ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var29 = false;
															break label1291;
														}
														if (var30 == null) {
															var29 = false;
														} else {
															var32 = java.util.Calendar.getInstance();
															var32.set(1, var32.get(1) - 13);
															var32.set(5, var32.get(5) + 1);
															var32.set(11, 0);
															var32.set(12, 0);
															var32.set(13, 0);
															var32.set(14, 0);
															var33 = var32.getTime();
															var16 = var30.before(var33);
															var18 = class134.method2858(var30);
															if (!var18) {
																class116.method2683(7);
																ItemComposition.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var29 = false;
															} else {
																if (!var16) {
																	Bounds.field4379 = 8388607;
																} else {
																	Bounds.field4379 = ((int) (var30.getTime() / 86400000L - 11745L));
																}
																var29 = true;
															}
														}
													}
													if (var29) {
														class4.updateGameState(50);
													}
													return;
												}
											} 
										} else {
											var42 = Login.loginBoxX + 180 - 80;
											var9 = 321;
											if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
												class400.openURL(ModeWhere.method6005("secure", true) + "m=dob/set_dob.ws", true, false);
												ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class116.method2683(6);
												return;
											}
											var42 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
												class6.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var42 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class400.openURL("https://www.jagex.com/terms/privacy", true, false);
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class116.method2683(6);
											return;
										}
										var42 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class6.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var42 = Login.loginBoxX + 180;
										var9 = 311;
										if (class145.field1653 == 84 || class145.field1653 == 13 || var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class33.method572(false);
										}
									} else if (Login.loginIndex == 10) {
										var42 = Login.loginBoxX + 180;
										var9 = 209;
										if (class145.field1653 == 84 || var5 == 1 && var54 >= var42 - 109 && var54 <= var42 + 109 && var41 >= var9 && var41 <= var9 + 68) {
											ItemComposition.setLoginResponseString("", "Connecting to server...", "");
											Client.field512 = class447.field4757;
											method3382(false);
											class4.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var42 = Login.loginBoxCenter;
										var9 = 233;
										Bounds var34 = var1.method6357(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9);
										Bounds var26 = var1.method6357(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9);
										Bounds var27 = var1.method6357(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var42, var9);
										var44 = var9 + 17;
										Bounds var28 = var1.method6357(0, 34, "<col=ffd200>agreement (EULA)</col>.", var42, var44);
										if (var5 == 1) {
											if (var34.method6853(var54, var41)) {
												class400.openURL("https://www.jagex.com/terms", true, false);
											} else if (var26.method6853(var54, var41)) {
												class400.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var27.method6853(var54, var41) || var28.method6853(var54, var41)) {
												class400.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}
										var42 = Login.loginBoxCenter - 80;
										var9 = 311;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class1.method10();
											class33.method572(true);
										}
										var42 = Login.loginBoxCenter + 80;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var42 = Login.loginBoxCenter;
										var9 = 321;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class33.method572(true);
										}
									} else if (Login.loginIndex == 14) {
										String var35 = "";
										switch (Login.Login_banType) {
											case 0 :
												var35 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1 :
												var35 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											case 2 :
												var35 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default :
												class6.Login_promptCredentials(false);
										}
										var44 = Login.loginBoxX + 180;
										var45 = 276;
										if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) {
											class400.openURL(var35, true, false);
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class116.method2683(6);
											return;
										}
										var44 = Login.loginBoxX + 180;
										var45 = 326;
										if (var5 == 1 && var54 >= var44 - 75 && var54 <= var44 + 75 && var41 >= var45 - 20 && var41 <= var45 + 20) {
											class6.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var42 = Login.loginBoxX + 180;
										var9 = 301;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class33.method572(false);
										}
									} else if (Login.loginIndex == 26) {
										var42 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class400.openURL(ModeWhere.method6005("secure", true) + "m=dob/set_dob.ws", true, false);
											ItemComposition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class116.method2683(6);
											return;
										}
										var42 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var54 >= var42 - 75 && var54 <= var42 + 75 && var41 >= var9 - 20 && var41 <= var9 + 20) {
											class6.Login_promptCredentials(true);
										}
									}
								} else {
									while (true) {
										do {
											if (!ParamComposition.isKeyDown()) {
												var43 = 321;
												if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) {
													class6.Login_promptCredentials(true);
												}
												return;
											}
										} while (class145.field1653 != 84 && class145.field1653 != 13 );
										class6.Login_promptCredentials(true);
									} 
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-13")
	static final void method3382(boolean var0) {
		if (var0) {
			Client.field511 = (Login.field895) ? class124.field1522 : class124.field1520;
		} else {
			LinkedHashMap var1 = ClanMate.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;
			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}
			Client.field511 = (var1.containsKey(var5)) ? class124.field1519 : class124.field1521;
		}
	}
}