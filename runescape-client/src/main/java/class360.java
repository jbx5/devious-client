import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
class class360 implements Comparator {
	@ObfuscatedName("fj")
	static String field4209;

	@ObfuscatedSignature(descriptor = 
	"Lmg;")

	final class361 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lmg;)V")

	class360(class361 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lmv;Lmv;I)I", garbageValue = 
	"1269106031")

	int method6585(class362 var1, class362 var2) {
		if (var1.field4222 > var2.field4222) {
			return 1;
		} else {
			return var1.field4222 < var2.field4222 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6585(((class362) (var1)), ((class362) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IIILgj;II)V", garbageValue = 
	"-1591189890")

	static void method6589(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if ((var4 == 1) || (var4 == 3)) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field814 = var3.int7 * 128;
		var5.field818 = var3.int5;
		var5.field810 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field821 = var5.field818 + ((int) (Math.random() * ((double) (var5.field810 - var5.field818))));
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lao;Lmd;B)V", garbageValue = 
	"3")

	static void method6592(GameEngine var0, Font var1) {
		int var4;
		int var38;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!SecureRandomCallable.isKeyDown()) {
					if ((MouseHandler.MouseHandler_lastButton != 1) && (GameBuild.mouseCam || (MouseHandler.MouseHandler_lastButton != 4))) {
						break;
					}

					int var2 = Login.xPadding + 280;
					if ((((MouseHandler.MouseHandler_lastPressedX >= var2) && (MouseHandler.MouseHandler_lastPressedX <= (var2 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(0, 0);
						break;
					}

					if ((((MouseHandler.MouseHandler_lastPressedX >= (var2 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var2 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(0, 1);
						break;
					}

					int var3 = Login.xPadding + 390;
					if ((((MouseHandler.MouseHandler_lastPressedX >= var3) && (MouseHandler.MouseHandler_lastPressedX <= (var3 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(1, 0);
						break;
					}

					if ((((MouseHandler.MouseHandler_lastPressedX >= (var3 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var3 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(1, 1);
						break;
					}

					var4 = Login.xPadding + 500;
					if ((((MouseHandler.MouseHandler_lastPressedX >= var4) && (MouseHandler.MouseHandler_lastPressedX <= (var4 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(2, 0);
						break;
					}

					if ((((MouseHandler.MouseHandler_lastPressedX >= (var4 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var4 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(2, 1);
						break;
					}

					var38 = Login.xPadding + 610;
					if ((((MouseHandler.MouseHandler_lastPressedX >= var38) && (MouseHandler.MouseHandler_lastPressedX <= (var38 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(3, 0);
						break;
					}

					if ((((MouseHandler.MouseHandler_lastPressedX >= (var38 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var38 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
						Players.changeWorldSelectSorting(3, 1);
						break;
					}

					if ((((MouseHandler.MouseHandler_lastPressedX >= (Login.xPadding + 708)) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedX <= ((Login.xPadding + 708) + 50))) && (MouseHandler.MouseHandler_lastPressedY <= 20)) {
						Login.worldSelectOpen = false;
						class17.leftTitleSprite.drawAt(Login.xPadding, 0);
						ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Decimator.logoSprite.drawAt((Login.xPadding + 382) - (Decimator.logoSprite.subWidth / 2), 18);
						break;
					}

					if (Login.hoveredWorldIndex != (-1)) {
						World var6 = DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex];
						PlatformInfo.changeWorld(var6);
						Login.worldSelectOpen = false;
						class17.leftTitleSprite.drawAt(Login.xPadding, 0);
						ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Decimator.logoSprite.drawAt((Login.xPadding + 382) - (Decimator.logoSprite.subWidth / 2), 18);
					} else {
						if ((((((Login.worldSelectPage > 0) && (class54.worldSelectLeftSprite != null)) && (MouseHandler.MouseHandler_lastPressedX >= 0)) && (MouseHandler.MouseHandler_lastPressedX <= class54.worldSelectLeftSprite.subWidth)) && (MouseHandler.MouseHandler_lastPressedY >= ((class321.canvasHeight / 2) - 50))) && (MouseHandler.MouseHandler_lastPressedY <= ((class321.canvasHeight / 2) + 50))) {
							--Login.worldSelectPage;
						}

						if ((((((Login.worldSelectPage < Login.worldSelectPagesCount) && (AttackOption.worldSelectRightSprite != null)) && (MouseHandler.MouseHandler_lastPressedX >= ((InvDefinition.canvasWidth - AttackOption.worldSelectRightSprite.subWidth) - 5))) && (MouseHandler.MouseHandler_lastPressedX <= InvDefinition.canvasWidth)) && (MouseHandler.MouseHandler_lastPressedY >= ((class321.canvasHeight / 2) - 50))) && (MouseHandler.MouseHandler_lastPressedY <= ((class321.canvasHeight / 2) + 50))) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (GameEngine.field218 == 13) {
					Login.worldSelectOpen = false;
					class17.leftTitleSprite.drawAt(Login.xPadding, 0);
					ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Decimator.logoSprite.drawAt((Login.xPadding + 382) - (Decimator.logoSprite.subWidth / 2), 18);
					break;
				}

				if (GameEngine.field218 == 96) {
					if ((Login.worldSelectPage > 0) && (class54.worldSelectLeftSprite != null)) {
						--Login.worldSelectPage;
					}
				} else if (((GameEngine.field218 == 97) && (Login.worldSelectPage < Login.worldSelectPagesCount)) && (AttackOption.worldSelectRightSprite != null)) {
					++Login.worldSelectPage;
				}
			} 

		} else {
			if ((((MouseHandler.MouseHandler_lastButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= ((Login.xPadding + 765) - 50))) && (MouseHandler.MouseHandler_lastPressedY >= 453)) {
				class131.clientPreferences.method2237(!class131.clientPreferences.method2279());
				if (!class131.clientPreferences.method2279()) {
					MidiPcmStream.method5368(class16.archive6, "scape main", "", 255, false);
				} else {
					class273.midiPcmStream.clear();
					class273.musicPlayerStatus = 1;
					class273.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if ((-1L) == Login.field915) {
					Login.field915 = class136.method2931() + 1000L;
				}

				long var20 = class136.method2931();
				if (PendingSpawn.method2166() && ((-1L) == Login.field916)) {
					Login.field916 = var20;
					if (Login.field916 > Login.field915) {
						Login.field915 = Login.field916;
					}
				}

				if ((Client.gameState == 10) || (Client.gameState == 11)) {
					if (Language.Language_EN == Skills.clientLanguage) {
						if ((MouseHandler.MouseHandler_lastButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) {
							var4 = Login.xPadding + 5;
							short var5 = 463;
							byte var22 = 100;
							byte var7 = 35;
							if ((((MouseHandler.MouseHandler_lastPressedX >= var4) && (MouseHandler.MouseHandler_lastPressedX <= (var4 + var22))) && (MouseHandler.MouseHandler_lastPressedY >= var5)) && (MouseHandler.MouseHandler_lastPressedY <= (var7 + var5))) {
								SoundCache.method768();
								return;
							}
						}

						if (class293.World_request != null) {
							SoundCache.method768();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					var38 = MouseHandler.MouseHandler_lastPressedX;
					int var52 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var38 = MouseHandler.MouseHandler_x;
						var52 = MouseHandler.MouseHandler_y;
					}

					if ((!GameBuild.mouseCam) && (var4 == 4)) {
						var4 = 1;
					}

					int var41;
					short var42;
					if (Login.loginIndex == 0) {
						boolean var50 = false;

						while (SecureRandomCallable.isKeyDown()) {
							if (GameEngine.field218 == 84) {
								var50 = true;
							}
						} 

						var41 = HealthBarDefinition.loginBoxCenter - 80;
						var42 = 291;
						if (((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) {
							class391.openURL(ArchiveLoader.method2063("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var41 = HealthBarDefinition.loginBoxCenter + 80;
						if ((((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) || var50) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Ignored.method6828(1);
								class12.method157();
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
								Ignored.method6828(1);
								class12.method157();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Ignored.method6828(1);
								class12.method157();
							} else {
								Messages.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var39;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!SecureRandomCallable.isKeyDown()) {
									var39 = HealthBarDefinition.loginBoxCenter - 80;
									var8 = 321;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										Messages.Login_promptCredentials(false);
									}

									var39 = HealthBarDefinition.loginBoxCenter + 80;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										Ignored.method6828(0);
									}
									break;
								}

								if (GameEngine.field218 == 84) {
									Messages.Login_promptCredentials(false);
								} else if (GameEngine.field218 == 13) {
									Ignored.method6828(0);
								}
							} 
						} else {
							int var11;
							int var12;
							short var40;
							boolean var43;
							if (Login.loginIndex == 2) {
								var40 = 201;
								var39 = var40 + 52;
								if (((var4 == 1) && (var52 >= (var39 - 12))) && (var52 < (var39 + 2))) {
									Login.currentLoginField = 0;
								}

								var39 += 15;
								if (((var4 == 1) && (var52 >= (var39 - 12))) && (var52 < (var39 + 2))) {
									Login.currentLoginField = 1;
								}

								var39 += 15;
								var40 = 361;
								if (class113.field1378 != null) {
									var41 = class113.field1378.highX / 2;
									if (((((var4 == 1) && (var38 >= (class113.field1378.lowX - var41))) && (var38 <= (var41 + class113.field1378.lowX))) && (var52 >= (var40 - 15))) && (var52 < var40)) {
										switch (Login.field895) {
											case 1 :
												class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												Ignored.method6828(5);
												return;
											case 2 :
												class391.openURL("https://support.runescape.com/hc/en-gb", true, false);}

									}
								}

								var41 = HealthBarDefinition.loginBoxCenter - 80;
								var42 = 321;
								if (((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class4.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class4.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class4.setLoginResponseString("", "Connecting to server...", "");
									class302.method5766(false);
									Decimator.updateGameState(20);
									return;
								}

								var41 = (Login.loginBoxX + 180) + 80;
								if (((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) {
									Ignored.method6828(0);
									Login.Login_username = "";
									Login.Login_password = "";
									WorldMapID.field2386 = 0;
									HealthBar.otp = "";
									Login.field907 = true;
								}

								var41 = HealthBarDefinition.loginBoxCenter + (-117);
								var42 = 277;
								Login.field909 = (((var38 >= var41) && (var38 < (var41 + AbstractSocket.field4275))) && (var52 >= var42)) && (var52 < (var42 + Occluder.field2687));
								if ((var4 == 1) && Login.field909) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if ((!Client.Login_isUsernameRemembered) && (class131.clientPreferences.method2247() != null)) {
										class131.clientPreferences.method2286(((String) (null)));
									}
								}

								var41 = HealthBarDefinition.loginBoxCenter + 24;
								var42 = 277;
								Login.field906 = (((var38 >= var41) && (var38 < (var41 + AbstractSocket.field4275))) && (var52 >= var42)) && (var52 < (var42 + Occluder.field2687));
								if ((var4 == 1) && Login.field906) {
									class131.clientPreferences.method2230(!class131.clientPreferences.method2317());
									if (!class131.clientPreferences.method2317()) {
										Login.Login_username = "";
										class131.clientPreferences.method2286(((String) (null)));
										class12.method157();
									}
								}

								label1472 : while (
								true) {
									Transferable var54;
									do {
										while (true) {
											label1436 : do 
											{
												while (true) {
													while (SecureRandomCallable.isKeyDown()) {
														if (GameEngine.field218 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1436;
															}

															char var44 = ItemComposition.field2121;

															for (var11 = 0; (var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length()) && (var44 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)); ++var11) {
															}

															if ((GameEngine.field218 == 85) && (Login.Login_username.length() > 0)) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if ((GameEngine.field218 == 84) || (GameEngine.field218 == 80)) {
																Login.currentLoginField = 1;
															}

															char var46 = ItemComposition.field2121;
															boolean var47 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var46) != (-1);
															if (var47 && (Login.Login_username.length() < 320)) {
																Login.Login_username = Login.Login_username + ItemComposition.field2121;
															}
														} else {
															Ignored.method6828(0);
															Login.Login_username = "";
															Login.Login_password = "";
															WorldMapID.field2386 = 0;
															HealthBar.otp = "";
															Login.field907 = true;
														}
													} 

													return;
												} 
											} while (Login.currentLoginField != 1 );

											if ((GameEngine.field218 == 85) && (Login.Login_password.length() > 0)) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if ((GameEngine.field218 == 84) || (GameEngine.field218 == 80)) {
												Login.currentLoginField = 0;
												if (GameEngine.field218 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class4.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class4.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class4.setLoginResponseString("", "Connecting to server...", "");
													class302.method5766(false);
													Decimator.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && (GameEngine.field218 == 67)) {
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var54 = var53.getContents(class127.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											if (WorldMapSection0.method4303(ItemComposition.field2121)) {
												char var48 = ItemComposition.field2121;
												var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var48) != (-1);
												if (var43 && (Login.Login_password.length() < 20)) {
													Login.Login_password = Login.Login_password + ItemComposition.field2121;
												}
											}
										} 
									} while (var12 <= 0 );

									try {
										String var13 = ((String) (var54.getTransferData(DataFlavor.stringFlavor)));
										int var14 = Math.min(var12, var13.length());
										int var49 = 0;

										while (true) {
											if (var49 >= var14) {
												Login.Login_password = Login.Login_password + var13.substring(0, var14);
												continue label1472;
											}

											if (!WorldMapSection0.method4303(var13.charAt(var49))) {
												break;
											}

											char var51 = var13.charAt(var49);
											boolean var16 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var51) != (-1);
											if (!var16) {
												break;
											}

											++var49;
										} 

										Ignored.method6828(3);
										return;
									} catch (UnsupportedFlavorException var36) {
									} catch (IOException var37) {
									}
								} 
							} else if (Login.loginIndex == 3) {
								var39 = Login.loginBoxX + 180;
								var8 = 276;
								if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
									class348.method6505(false);
								}

								var39 = Login.loginBoxX + 180;
								var8 = 326;
								if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
									class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Ignored.method6828(5);
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var39 = (Login.loginBoxX + 180) - 80;
									var8 = 321;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										HealthBar.otp.trim();
										if (HealthBar.otp.length() != 6) {
											class4.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										WorldMapID.field2386 = Integer.parseInt(HealthBar.otp);
										HealthBar.otp = "";
										class302.method5766(true);
										class4.setLoginResponseString("", "Connecting to server...", "");
										Decimator.updateGameState(20);
										return;
									}

									if (((((var4 == 1) && (var38 >= ((Login.loginBoxX + 180) - 9))) && (var38 <= ((Login.loginBoxX + 180) + 130))) && (var52 >= 263)) && (var52 <= 296)) {
										Login.field907 = !Login.field907;
									}

									if (((((var4 == 1) && (var38 >= ((Login.loginBoxX + 180) - 34))) && (var38 <= ((Login.loginBoxX + 34) + 180))) && (var52 >= 351)) && (var52 <= 363)) {
										class391.openURL(ArchiveLoader.method2063("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var39 = (Login.loginBoxX + 180) + 80;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										Ignored.method6828(0);
										Login.Login_username = "";
										Login.Login_password = "";
										WorldMapID.field2386 = 0;
										HealthBar.otp = "";
									}

									while (SecureRandomCallable.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (ItemComposition.field2121 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (GameEngine.field218 == 13) {
											Ignored.method6828(0);
											Login.Login_username = "";
											Login.Login_password = "";
											WorldMapID.field2386 = 0;
											HealthBar.otp = "";
										} else {
											if ((GameEngine.field218 == 85) && (HealthBar.otp.length() > 0)) {
												HealthBar.otp = HealthBar.otp.substring(0, HealthBar.otp.length() - 1);
											}

											if (GameEngine.field218 == 84) {
												HealthBar.otp.trim();
												if (HealthBar.otp.length() != 6) {
													class4.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												WorldMapID.field2386 = Integer.parseInt(HealthBar.otp);
												HealthBar.otp = "";
												class302.method5766(true);
												class4.setLoginResponseString("", "Connecting to server...", "");
												Decimator.updateGameState(20);
												return;
											}

											if (var9 && (HealthBar.otp.length() < 6)) {
												HealthBar.otp = HealthBar.otp + ItemComposition.field2121;
											}
										}
									} 
								} else if (Login.loginIndex == 5) {
									var39 = (Login.loginBoxX + 180) - 80;
									var8 = 321;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										DynamicObject.method2003();
										return;
									}

									var39 = (Login.loginBoxX + 180) + 80;
									if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										Messages.Login_promptCredentials(true);
									}

									var42 = 361;
									if (class260.field2892 != null) {
										var10 = class260.field2892.highX / 2;
										if (((((var4 == 1) && (var38 >= (class260.field2892.lowX - var10))) && (var38 <= (var10 + class260.field2892.lowX))) && (var52 >= (var42 - 15))) && (var52 < var42)) {
											class391.openURL(ArchiveLoader.method2063("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (SecureRandomCallable.isKeyDown()) {
										var43 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
											if (ItemComposition.field2121 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
												var43 = true;
												break;
											}
										}

										if (GameEngine.field218 == 13) {
											Messages.Login_promptCredentials(true);
										} else {
											if ((GameEngine.field218 == 85) && (Login.Login_username.length() > 0)) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (GameEngine.field218 == 84) {
												DynamicObject.method2003();
												return;
											}

											if (var43 && (Login.Login_username.length() < 320)) {
												Login.Login_username = Login.Login_username + ItemComposition.field2121;
											}
										}
									} 
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (Client.field504 && (!Client.onMobile)) {
											var39 = HealthBarDefinition.loginBoxCenter - 150;
											var41 = ((var39 + 40) + 240) + 25;
											var42 = 231;
											var10 = var42 + 40;
											if (((((var4 == 1) && (var38 >= var39)) && (var38 <= var41)) && (var52 >= var42)) && (var52 <= var10)) {
												var12 = var39;
												int var25 = 0;

												while (true) {
													if (var25 >= 8) {
														var11 = 0;
														break;
													}

													if (var38 <= (var12 + 30)) {
														var11 = var25;
														break;
													}

													var12 += 30;
													var12 += ((var25 != 1) && (var25 != 3)) ? 5 : 20;
													++var25;
												} 

												Login.field903 = var11;
											}

											var11 = (Login.loginBoxX + 180) - 80;
											short var45 = 321;
											boolean var15;
											boolean var17;
											Date var18;
											java.util.Calendar var19;
											Date var26;
											java.util.Calendar var28;
											Date var29;
											boolean var55;
											if (((((var4 == 1) && (var38 >= (var11 - 75))) && (var38 <= (var11 + 75))) && (var52 >= (var45 - 20))) && (var52 <= (var45 + 20))) {
												label1307 : {
													try {
														var26 = class345.method6441();
													} catch (ParseException var35) {
														Ignored.method6828(7);
														class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
														var55 = false;
														break label1307;
													}

													if (var26 == null) {
														var55 = false;
													} else {
														var28 = java.util.Calendar.getInstance();
														var28.set(1, var28.get(1) - 13);
														var29 = var28.getTime();
														var15 = var26.before(var29);
														var19 = java.util.Calendar.getInstance();
														var19.set(2, 0);
														var19.set(5, 1);
														var19.set(1, 1900);
														var18 = var19.getTime();
														var17 = var26.after(var18);
														if (!var17) {
															Ignored.method6828(7);
															class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var55 = false;
														} else {
															if (!var15) {
																WorldMapSectionType.field2321 = 8388607;
															} else {
																WorldMapSectionType.field2321 = ((int) ((var26.getTime() / 86400000L) - 11745L));
															}

															var55 = true;
														}
													}
												}

												if (var55) {
													Decimator.updateGameState(50);
													return;
												}
											}

											var11 = (Login.loginBoxX + 180) + 80;
											if (((((var4 == 1) && (var38 >= (var11 - 75))) && (var38 <= (var11 + 75))) && (var52 >= (var45 - 20))) && (var52 <= (var45 + 20))) {
												Login.field904 = new String[8];
												Messages.Login_promptCredentials(true);
											}

											while (SecureRandomCallable.isKeyDown()) {
												if (GameEngine.field218 == 101) {
													Login.field904[Login.field903] = null;
												}

												if (GameEngine.field218 == 85) {
													if ((Login.field904[Login.field903] == null) && (Login.field903 > 0)) {
														--Login.field903;
													}

													Login.field904[Login.field903] = null;
												}

												if ((ItemComposition.field2121 >= '0') && (ItemComposition.field2121 <= '9')) {
													Login.field904[Login.field903] = "" + ItemComposition.field2121;
													if (Login.field903 < 7) {
														++Login.field903;
													}
												}

												if (GameEngine.field218 == 84) {
													label1243 : {
														try {
															var26 = class345.method6441();
														} catch (ParseException var34) {
															Ignored.method6828(7);
															class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var55 = false;
															break label1243;
														}

														if (var26 == null) {
															var55 = false;
														} else {
															var28 = java.util.Calendar.getInstance();
															var28.set(1, var28.get(1) - 13);
															var29 = var28.getTime();
															var15 = var26.before(var29);
															var19 = java.util.Calendar.getInstance();
															var19.set(2, 0);
															var19.set(5, 1);
															var19.set(1, 1900);
															var18 = var19.getTime();
															var17 = var26.after(var18);
															if (!var17) {
																Ignored.method6828(7);
																class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var55 = false;
															} else {
																if (!var15) {
																	WorldMapSectionType.field2321 = 8388607;
																} else {
																	WorldMapSectionType.field2321 = ((int) ((var26.getTime() / 86400000L) - 11745L));
																}

																var55 = true;
															}
														}
													}

													if (var55) {
														Decimator.updateGameState(50);
													}

													return;
												}
											} 
										} else {
											var39 = (Login.loginBoxX + 180) - 80;
											var8 = 321;
											if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
												class391.openURL(ArchiveLoader.method2063("secure", true) + "m=dob/set_dob.ws", true, false);
												class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												Ignored.method6828(6);
												return;
											}

											var39 = (Login.loginBoxX + 180) + 80;
											if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
												Messages.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var39 = (Login.loginBoxX + 180) - 80;
										var8 = 321;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class391.openURL("https://www.jagex.com/terms/privacy", true, false);
											class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Ignored.method6828(6);
											return;
										}

										var39 = (Login.loginBoxX + 180) + 80;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											Messages.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var39 = Login.loginBoxX + 180;
										var8 = 311;
										if (((GameEngine.field218 == 84) || (GameEngine.field218 == 13)) || (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20)))) {
											class348.method6505(false);
										}
									} else if (Login.loginIndex == 10) {
										var39 = Login.loginBoxX + 180;
										var8 = 209;
										if ((GameEngine.field218 == 84) || (((((var4 == 1) && (var38 >= (var39 - 109))) && (var38 <= (var39 + 109))) && (var52 >= var8)) && (var52 <= (var8 + 68)))) {
											class4.setLoginResponseString("", "Connecting to server...", "");
											Client.field532 = class441.field4671;
											class302.method5766(false);
											Decimator.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var39 = HealthBarDefinition.loginBoxCenter;
										var8 = 233;
										Bounds var31 = var1.method6333(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8);
										Bounds var23 = var1.method6333(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8);
										Bounds var24 = var1.method6333(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8);
										var41 = var8 + 17;
										Bounds var32 = var1.method6333(0, 34, "<col=ffd200>agreement (EULA)</col>.", var39, var41);
										if (var4 == 1) {
											if (var31.method6944(var38, var52)) {
												class391.openURL("https://www.jagex.com/terms", true, false);
											} else if (var23.method6944(var38, var52)) {
												class391.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var24.method6944(var38, var52) || var32.method6944(var38, var52)) {
												class391.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var39 = HealthBarDefinition.loginBoxCenter - 80;
										var8 = 311;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class131.clientPreferences.method2248(Client.field617);
											class348.method6505(true);
										}

										var39 = HealthBarDefinition.loginBoxCenter + 80;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var39 = HealthBarDefinition.loginBoxCenter;
										var8 = 321;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class348.method6505(true);
										}
									} else if (Login.loginIndex == 14) {
										String var33 = "";
										switch (Login.Login_banType) {
											case 0 :
												var33 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1 :
												var33 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											default :
												Messages.Login_promptCredentials(false);}


										var41 = Login.loginBoxX + 180;
										var42 = 276;
										if (((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) {
											class391.openURL(var33, true, false);
											class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Ignored.method6828(6);
											return;
										}

										var41 = Login.loginBoxX + 180;
										var42 = 326;
										if (((((var4 == 1) && (var38 >= (var41 - 75))) && (var38 <= (var41 + 75))) && (var52 >= (var42 - 20))) && (var52 <= (var42 + 20))) {
											Messages.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var39 = Login.loginBoxX + 180;
										var8 = 301;
										if (((((var4 == 1) && (var38 >= (var39 - 75))) && (var38 <= (var39 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class348.method6505(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!SecureRandomCallable.isKeyDown()) {
												var40 = 321;
												if (((var4 == 1) && (var52 >= (var40 - 20))) && (var52 <= (var40 + 20))) {
													Messages.Login_promptCredentials(true);
												}

												return;
											}
										} while ((GameEngine.field218 != 84) && (GameEngine.field218 != 13) );

										Messages.Login_promptCredentials(true);
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