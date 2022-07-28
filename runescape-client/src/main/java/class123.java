import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.awt.datatransfer.Clipboard;
import java.text.ParseException;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("di")
public enum class123 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1511(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1503(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1504(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1505(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1506(4, 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1507(5, 5),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1508(6, 6),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1509(7, 7),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldi;")
	field1510(8, 8);
	@ObfuscatedName("ji")
	@ObfuscatedGetter(intValue = 1097174801)
	@Export("cameraY")
	static int cameraY;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1329363673)
	final int field1512;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1617021773)
	final int field1514;

	class123(int var3, int var4) {
		this.field1512 = var3;
		this.field1514 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1514;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Las;Lmx;I)V", garbageValue = "447657503")
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!WorldMapSectionType.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (ObjectSound.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}
					int var2 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(0, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(0, 1);
						break;
					}
					int var3 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(1, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(1, 1);
						break;
					}
					int var41 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(2, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(2, 1);
						break;
					}
					var5 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(3, 0);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class155.changeWorldSelectSorting(3, 1);
						break;
					}
					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0);
						class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
						break;
					}
					if (Login.hoveredWorldIndex != -1) {
						World var6 = class93.World_worlds[Login.hoveredWorldIndex];
						FriendSystem.changeWorld(var6);
						Login.worldSelectOpen = false;
						SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0);
						class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
					} else {
						if (Login.worldSelectPage > 0 && class118.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class118.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class228.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class228.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}
						if (Login.worldSelectPage < Login.worldSelectPagesCount && class33.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class352.canvasWidth - class33.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class352.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class228.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class228.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}
				if (SequenceDefinition.field2176 == 13) {
					Login.worldSelectOpen = false;
					SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0);
					class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
					break;
				}
				if (SequenceDefinition.field2176 == 96) {
					if (Login.worldSelectPage > 0 && class118.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (SequenceDefinition.field2176 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class33.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			} 
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class260.clientPreferences.method2347(!class260.clientPreferences.method2316());
				if (!class260.clientPreferences.method2316()) {
					class154.method3167(MouseHandler.archive6, "scape main", "", 255, false);
				} else {
					LoginPacket.method5207();
				}
			}
			if (Client.gameState != 5) {
				if (Login.field928 == -1L) {
					Login.field928 = class131.method2916() + 1000L;
				}
				long var22 = class131.method2916();
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
				if (var4 && Login.field929 == -1L) {
					Login.field929 = var22;
					if (Login.field929 > Login.field928) {
						Login.field928 = Login.field929;
					}
				}
				if (Client.gameState == 10 || Client.gameState == 11) {
					int var7;
					int var8;
					int var25;
					if (Language.Language_EN == class21.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							var25 = 463;
							var7 = 100;
							var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var25 + var8) {
								class282.method5487();
								return;
							}
						}
						if (class144.World_request != null) {
							class282.method5487();
						}
					}
					var5 = MouseHandler.MouseHandler_lastButton;
					var25 = MouseHandler.MouseHandler_lastPressedX;
					var7 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var25 = MouseHandler.MouseHandler_x;
						var7 = MouseHandler.MouseHandler_y;
					}
					if (!ObjectSound.mouseCam && var5 == 4) {
						var5 = 1;
					}
					int var9;
					short var43;
					if (Login.loginIndex == 0) {
						boolean var50 = false;
						while (WorldMapSectionType.isKeyDown()) {
							if (SequenceDefinition.field2176 == 84) {
								var50 = true;
							}
						} 
						var9 = Login.loginBoxCenter - 80;
						var43 = 291;
						if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20) {
							class238.openURL(ScriptFrame.method1055("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}
						var9 = Login.loginBoxCenter + 80;
						if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20 || var50) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								UserComparator6.method2701(1);
								FloorOverlayDefinition.method3799();
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
								UserComparator6.method2701(1);
								FloorOverlayDefinition.method3799();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								UserComparator6.method2701(1);
								FloorOverlayDefinition.method3799();
							} else {
								class152.Login_promptCredentials(false);
							}
						}
					} else {
						short var44;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!WorldMapSectionType.isKeyDown()) {
									var8 = Login.loginBoxCenter - 80;
									var44 = 321;
									if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
										class152.Login_promptCredentials(false);
									}
									var8 = Login.loginBoxCenter + 80;
									if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
										UserComparator6.method2701(0);
									}
									break;
								}
								if (SequenceDefinition.field2176 == 84) {
									class152.Login_promptCredentials(false);
								} else if (SequenceDefinition.field2176 == 13) {
									UserComparator6.method2701(0);
								}
							} 
						} else {
							int var13;
							int var30;
							short var42;
							boolean var45;
							if (Login.loginIndex == 2) {
								var42 = 201;
								var8 = var42 + 52;
								if (var5 == 1 && var7 >= var8 - 12 && var7 < var8 + 2) {
									Login.currentLoginField = 0;
								}
								var8 += 15;
								if (var5 == 1 && var7 >= var8 - 12 && var7 < var8 + 2) {
									Login.currentLoginField = 1;
								}
								var8 += 15;
								var42 = 361;
								if (KitDefinition.field1860 != null) {
									var9 = KitDefinition.field1860.highX / 2;
									if (var5 == 1 && var25 >= KitDefinition.field1860.lowX - var9 && var25 <= var9 + KitDefinition.field1860.lowX && var7 >= var42 - 15 && var7 < var42) {
										switch (Login.field919) {
											case 1 :
												HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												UserComparator6.method2701(5);
												return;
											case 2 :
												class238.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}
								var9 = Login.loginBoxCenter - 80;
								var43 = 321;
								if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										HealthBarUpdate.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}
									if (Login.Login_password.length() == 0) {
										HealthBarUpdate.setLoginResponseString("", "Please enter your password.", "");
										return;
									}
									HealthBarUpdate.setLoginResponseString("", "Connecting to server...", "");
									FriendSystem.method1762(false);
									class82.updateGameState(20);
									return;
								}
								var9 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20) {
									UserComparator6.method2701(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class260.field2908 = 0;
									Login.otp = "";
									Login.field893 = true;
								}
								var9 = Login.loginBoxCenter + -117;
								var43 = 277;
								Login.field892 = var25 >= var9 && var25 < var9 + WorldMapCacheName.field2862 && var7 >= var43 && var7 < var43 + HealthBarDefinition.field1864;
								if (var5 == 1 && Login.field892) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class260.clientPreferences.method2331() != null) {
										class260.clientPreferences.method2330(((String) (null)));
									}
								}
								var9 = Login.loginBoxCenter + 24;
								var43 = 277;
								Login.field918 = var25 >= var9 && var25 < var9 + WorldMapCacheName.field2862 && var7 >= var43 && var7 < var43 + HealthBarDefinition.field1864;
								if (var5 == 1 && Login.field918) {
									class260.clientPreferences.method2389(!class260.clientPreferences.method2326());
									if (!class260.clientPreferences.method2326()) {
										Login.Login_username = "";
										class260.clientPreferences.method2330(((String) (null)));
										FloorOverlayDefinition.method3799();
									}
								}
								label1582 : while (true) {
									int var15;
									Transferable var54;
									do {
										while (true) {
											char var47;
											label1498 : do {
												while (true) {
													while (WorldMapSectionType.isKeyDown()) {
														if (SequenceDefinition.field2176 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1498;
															}
															class7.method50(Clock.field1797);
															if (SequenceDefinition.field2176 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}
															if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 80) {
																Login.currentLoginField = 1;
															}
															var47 = Clock.field1797;
															var45 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var47) != -1;
															if (var45 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + Clock.field1797;
															}
														} else {
															UserComparator6.method2701(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class260.field2908 = 0;
															Login.otp = "";
															Login.field893 = true;
														}
													} 
													return;
												} 
											} while (Login.currentLoginField != 1 );
											if (SequenceDefinition.field2176 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 80) {
												Login.currentLoginField = 0;
												if (SequenceDefinition.field2176 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														HealthBarUpdate.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}
													if (Login.Login_password.length() == 0) {
														HealthBarUpdate.setLoginResponseString("", "Please enter your password.", "");
														return;
													}
													HealthBarUpdate.setLoginResponseString("", "Connecting to server...", "");
													FriendSystem.method1762(false);
													class82.updateGameState(20);
													return;
												}
											}
											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SequenceDefinition.field2176 == 67) {
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var54 = var53.getContents(class329.client);
												var13 = 20 - Login.Login_password.length();
												break;
											}
											var47 = Clock.field1797;
											if ((var47 < ' ' || var47 >= 127) && (var47 <= 127 || var47 >= 160) && (var47 <= 160 || var47 > 255)) {
												label1733 : {
													if (var47 != 0) {
														char[] var55 = class341.cp1252AsciiExtension;
														for (var30 = 0; var30 < var55.length; ++var30) {
															var15 = var55[var30];
															if (var47 == var15) {
																var45 = true;
																break label1733;
															}
														}
													}
													var45 = false;
												}
											} else {
												var45 = true;
											}
											if (var45) {
												char var57 = Clock.field1797;
												boolean var48 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var57) != -1;
												if (var48 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + Clock.field1797;
												}
											}
										} 
									} while (var13 <= 0 );
									try {
										String var14 = ((String) (var54.getTransferData(DataFlavor.stringFlavor)));
										var15 = Math.min(var13, var14.length());
										int var49 = 0;
										while (true) {
											if (var49 >= var15) {
												Login.Login_password = Login.Login_password + var14.substring(0, var15);
												continue label1582;
											}
											char var51 = var14.charAt(var49);
											boolean var17;
											if (var51 >= ' ' && var51 < 127 || var51 > 127 && var51 < 160 || var51 > 160 && var51 <= 255) {
												var17 = true;
											} else {
												label1751 : {
													if (var51 != 0) {
														char[] var19 = class341.cp1252AsciiExtension;
														for (int var20 = 0; var20 < var19.length; ++var20) {
															char var21 = var19[var20];
															if (var51 == var21) {
																var17 = true;
																break label1751;
															}
														}
													}
													var17 = false;
												}
											}
											if (!var17) {
												break;
											}
											char var52 = var14.charAt(var49);
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var52) != -1;
											if (!var28) {
												break;
											}
											++var49;
										} 
										UserComparator6.method2701(3);
										return;
									} catch (UnsupportedFlavorException var39) {
									} catch (IOException var40) {
									}
								} 
							} else if (Login.loginIndex == 3) {
								var8 = Login.loginBoxX + 180;
								var9 = 276;
								if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
									WorldMapID.method4981(false);
								}
								var8 = Login.loginBoxX + 180;
								var9 = 326;
								if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
									HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									UserComparator6.method2701(5);
									return;
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) {
									var8 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
										Login.otp.trim();
										if (Login.otp.length() != 6) {
											HealthBarUpdate.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}
										class260.field2908 = Integer.parseInt(Login.otp);
										Login.otp = "";
										FriendSystem.method1762(true);
										HealthBarUpdate.setLoginResponseString("", "Connecting to server...", "");
										class82.updateGameState(20);
										return;
									}
									if (var5 == 1 && var25 >= Login.loginBoxX + 180 - 9 && var25 <= Login.loginBoxX + 180 + 130 && var7 >= 263 && var7 <= 296) {
										Login.field893 = !Login.field893;
									}
									if (var5 == 1 && var25 >= Login.loginBoxX + 180 - 34 && var25 <= Login.loginBoxX + 34 + 180 && var7 >= 351 && var7 <= 363) {
										class238.openURL(ScriptFrame.method1055("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}
									var8 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
										UserComparator6.method2701(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class260.field2908 = 0;
										Login.otp = "";
									}
									while (WorldMapSectionType.isKeyDown()) {
										boolean var10 = false;
										for (var11 = 0; var11 < "1234567890".length(); ++var11) {
											if (Clock.field1797 == "1234567890".charAt(var11)) {
												var10 = true;
												break;
											}
										}
										if (SequenceDefinition.field2176 == 13) {
											UserComparator6.method2701(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class260.field2908 = 0;
											Login.otp = "";
										} else {
											if (SequenceDefinition.field2176 == 85 && Login.otp.length() > 0) {
												Login.otp = Login.otp.substring(0, Login.otp.length() - 1);
											}
											if (SequenceDefinition.field2176 == 84) {
												Login.otp.trim();
												if (Login.otp.length() != 6) {
													HealthBarUpdate.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}
												class260.field2908 = Integer.parseInt(Login.otp);
												Login.otp = "";
												FriendSystem.method1762(true);
												HealthBarUpdate.setLoginResponseString("", "Connecting to server...", "");
												class82.updateGameState(20);
												return;
											}
											if (var10 && Login.otp.length() < 6) {
												Login.otp = Login.otp + Clock.field1797;
											}
										}
									} 
								} else {
									int var12;
									if (Login.loginIndex == 5) {
										var8 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
											MouseHandler.method597();
											return;
										}
										var8 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
											class152.Login_promptCredentials(true);
										}
										var43 = 361;
										if (WorldMapSectionType.field2781 != null) {
											var11 = WorldMapSectionType.field2781.highX / 2;
											if (var5 == 1 && var25 >= WorldMapSectionType.field2781.lowX - var11 && var25 <= var11 + WorldMapSectionType.field2781.lowX && var7 >= var43 - 15 && var7 < var43) {
												class238.openURL(ScriptFrame.method1055("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}
										while (WorldMapSectionType.isKeyDown()) {
											var45 = false;
											for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var12) {
												if (Clock.field1797 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var12)) {
													var45 = true;
													break;
												}
											}
											if (SequenceDefinition.field2176 == 13) {
												class152.Login_promptCredentials(true);
											} else {
												if (SequenceDefinition.field2176 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}
												if (SequenceDefinition.field2176 == 84) {
													MouseHandler.method597();
													return;
												}
												if (var45 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + Clock.field1797;
												}
											}
										} 
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (FriendsChat.field4305 && !Client.onMobile) {
												var8 = Login.loginBoxCenter - 150;
												var9 = var8 + 40 + 240 + 25;
												var43 = 231;
												var11 = var43 + 40;
												if (var5 == 1 && var25 >= var8 && var25 <= var9 && var7 >= var43 && var7 <= var11) {
													var13 = var8;
													var30 = 0;
													while (true) {
														if (var30 >= 8) {
															var12 = 0;
															break;
														}
														if (var25 <= var13 + 30) {
															var12 = var30;
															break;
														}
														var13 += 30;
														var13 += (var30 != 1 && var30 != 3) ? 5 : 20;
														++var30;
													} 
													Login.field912 = var12;
												}
												var12 = Login.loginBoxX + 180 - 80;
												short var46 = 321;
												boolean var16;
												boolean var18;
												Date var31;
												java.util.Calendar var33;
												Date var34;
												boolean var56;
												if (var5 == 1 && var25 >= var12 - 75 && var25 <= var12 + 75 && var7 >= var46 - 20 && var7 <= var46 + 20) {
													label1377 : {
														try {
															var31 = SecureRandomCallable.method2118();
														} catch (ParseException var38) {
															PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var56 = false;
															break label1377;
														}
														if (var31 == null) {
															var56 = false;
														} else {
															var33 = java.util.Calendar.getInstance();
															var33.set(1, var33.get(1) - 13);
															var33.set(5, var33.get(5) + 1);
															var33.set(11, 0);
															var33.set(12, 0);
															var33.set(13, 0);
															var33.set(14, 0);
															var34 = var33.getTime();
															var16 = var31.before(var34);
															var18 = class388.method7052(var31);
															if (!var18) {
																PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var56 = false;
															} else {
																if (!var16) {
																	Projectile.field950 = 8388607;
																} else {
																	Projectile.field950 = ((int) (var31.getTime() / 86400000L - 11745L));
																}
																var56 = true;
															}
														}
													}
													if (var56) {
														class82.updateGameState(50);
														return;
													}
												}
												var12 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var25 >= var12 - 75 && var25 <= var12 + 75 && var7 >= var46 - 20 && var7 <= var46 + 20) {
													Login.field901 = new String[8];
													class152.Login_promptCredentials(true);
												}
												while (WorldMapSectionType.isKeyDown()) {
													if (SequenceDefinition.field2176 == 101) {
														Login.field901[Login.field912] = null;
													}
													if (SequenceDefinition.field2176 == 85) {
														if (Login.field901[Login.field912] == null && Login.field912 > 0) {
															--Login.field912;
														}
														Login.field901[Login.field912] = null;
													}
													if (Clock.field1797 >= '0' && Clock.field1797 <= '9') {
														Login.field901[Login.field912] = "" + Clock.field1797;
														if (Login.field912 < 7) {
															++Login.field912;
														}
													}
													if (SequenceDefinition.field2176 == 84) {
														label1313 : {
															try {
																var31 = SecureRandomCallable.method2118();
															} catch (ParseException var37) {
																PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var56 = false;
																break label1313;
															}
															if (var31 == null) {
																var56 = false;
															} else {
																var33 = java.util.Calendar.getInstance();
																var33.set(1, var33.get(1) - 13);
																var33.set(5, var33.get(5) + 1);
																var33.set(11, 0);
																var33.set(12, 0);
																var33.set(13, 0);
																var33.set(14, 0);
																var34 = var33.getTime();
																var16 = var31.before(var34);
																var18 = class388.method7052(var31);
																if (!var18) {
																	PendingSpawn.method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var56 = false;
																} else {
																	if (!var16) {
																		Projectile.field950 = 8388607;
																	} else {
																		Projectile.field950 = ((int) (var31.getTime() / 86400000L - 11745L));
																	}
																	var56 = true;
																}
															}
														}
														if (var56) {
															class82.updateGameState(50);
														}
														return;
													}
												} 
											} else {
												var8 = Login.loginBoxX + 180 - 80;
												var9 = 321;
												if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
													class238.openURL(ScriptFrame.method1055("secure", true) + "m=dob/set_dob.ws", true, false);
													HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
													UserComparator6.method2701(6);
													return;
												}
												var8 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
													class152.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var8 = Login.loginBoxX + 180 - 80;
											var44 = 321;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												class238.openURL("https://www.jagex.com/terms/privacy", true, false);
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												UserComparator6.method2701(6);
												return;
											}
											var8 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												class152.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var8 = Login.loginBoxX + 180;
											var44 = 311;
											if (SequenceDefinition.field2176 == 84 || SequenceDefinition.field2176 == 13 || var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												WorldMapID.method4981(false);
											}
										} else if (Login.loginIndex == 10) {
											var8 = Login.loginBoxX + 180;
											var44 = 209;
											if (SequenceDefinition.field2176 == 84 || var5 == 1 && var25 >= var8 - 109 && var25 <= var8 + 109 && var7 >= var44 && var7 <= var44 + 68) {
												HealthBarUpdate.setLoginResponseString("", "Connecting to server...", "");
												Client.field741 = class447.field4761;
												FriendSystem.method1762(false);
												class82.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var8 = Login.loginBoxCenter;
											var44 = 233;
											Bounds var35 = var1.method6408(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var8, var44);
											Bounds var26 = var1.method6408(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var8, var44);
											Bounds var27 = var1.method6408(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var8, var44);
											var9 = var44 + 17;
											Bounds var29 = var1.method6408(0, 34, "<col=ffd200>agreement (EULA)</col>.", var8, var9);
											if (var5 == 1) {
												if (var35.method6950(var25, var7)) {
													class238.openURL("https://www.jagex.com/terms", true, false);
												} else if (var26.method6950(var25, var7)) {
													class238.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var27.method6950(var25, var7) || var29.method6950(var25, var7)) {
													class238.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}
											var8 = Login.loginBoxCenter - 80;
											var44 = 311;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												FaceNormal.method4304();
												WorldMapID.method4981(true);
											}
											var8 = Login.loginBoxCenter + 80;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var8 = Login.loginBoxCenter;
											var44 = 321;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												WorldMapID.method4981(true);
											}
										} else if (Login.loginIndex == 14) {
											String var36 = "";
											switch (Login.field906) {
												case 0 :
													var36 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
													break;
												case 1 :
													var36 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
													break;
												case 2 :
													var36 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default :
													class152.Login_promptCredentials(false);
											}
											var9 = Login.loginBoxX + 180;
											var43 = 276;
											if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20) {
												class238.openURL(var36, true, false);
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												UserComparator6.method2701(6);
												return;
											}
											var9 = Login.loginBoxX + 180;
											var43 = 326;
											if (var5 == 1 && var25 >= var9 - 75 && var25 <= var9 + 75 && var7 >= var43 - 20 && var7 <= var43 + 20) {
												class152.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var8 = Login.loginBoxX + 180;
											var44 = 301;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												WorldMapID.method4981(false);
											}
										} else if (Login.loginIndex == 26) {
											var8 = Login.loginBoxX + 180 - 80;
											var44 = 321;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												class238.openURL(ScriptFrame.method1055("secure", true) + "m=dob/set_dob.ws", true, false);
												HealthBarUpdate.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												UserComparator6.method2701(6);
												return;
											}
											var8 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var7 >= var44 - 20 && var7 <= var44 + 20) {
												class152.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!WorldMapSectionType.isKeyDown()) {
													var42 = 321;
													if (var5 == 1 && var7 >= var42 - 20 && var7 <= var42 + 20) {
														class152.Login_promptCredentials(true);
													}
													return;
												}
											} while (SequenceDefinition.field2176 != 84 && SequenceDefinition.field2176 != 13 );
											class152.Login_promptCredentials(true);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "967533715")
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.previousDual)).count;
		}
	}
}