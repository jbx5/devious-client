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
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class194 {
	@ObfuscatedName("h")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("g")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1600759589)

	static int field2202;
	@ObfuscatedName("f")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("u")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"[Lpz;")

	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("db")
	@ObfuscatedSignature(descriptor = 
	"Lfn;")

	@Export("js5SocketTask")
	static Task js5SocketTask;
	static 
	{
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Law;Lmr;I)V", garbageValue = 
	"847036111")

	static void method3894(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) {
			MouseHandler.method621(var0);
		} else {
			int var4;
			if ((((MouseHandler.MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= ((Login.xPadding + 765) - 50))) && (MouseHandler.MouseHandler_lastPressedY >= 453)) {
				Interpreter.clientPreferences.method2258(!Interpreter.clientPreferences.method2259());
				if (!Interpreter.clientPreferences.method2259()) {
					Archive var2 = ArchiveLoader.archive6;
					int var3 = var2.getGroupId("scape main");
					var4 = var2.getFileId(var3, "");
					WorldMapSection2.method4561(var2, var3, var4, 255, false);
				} else {
					WorldMapEvent.midiPcmStream.clear();
					class273.musicPlayerStatus = 1;
					class147.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if ((-1L) == Login.field911) {
					Login.field911 = WorldMapSprite.getServerTime() + 1000L;
				}

				long var21 = WorldMapSprite.getServerTime();
				if (class149.method3079() && (Login.field912 == (-1L))) {
					Login.field912 = var21;
					if (Login.field912 > Login.field911) {
						Login.field911 = Login.field912;
					}
				}

				if ((Client.gameState == 10) || (Client.gameState == 11)) {
					if (Language.Language_EN == FriendSystem.clientLanguage) {
						if ((MouseHandler.MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) {
							var4 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if ((((MouseHandler.MouseHandler_lastPressedX >= var4) && (MouseHandler.MouseHandler_lastPressedX <= (var6 + var4))) && (MouseHandler.MouseHandler_lastPressedY >= var5)) && (MouseHandler.MouseHandler_lastPressedY <= (var7 + var5))) {
								FloorUnderlayDefinition.method3548();
								return;
							}
						}

						if (class345.World_request != null) {
							FloorUnderlayDefinition.method3548();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					int var51 = MouseHandler.MouseHandler_lastPressedX;
					int var52 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var51 = MouseHandler.MouseHandler_x;
						var52 = MouseHandler.MouseHandler_y;
					}

					if ((!UserComparator5.mouseCam) && (var4 == 4)) {
						var4 = 1;
					}

					int var55;
					short var56;
					if (Login.loginIndex == 0) {
						boolean var68 = false;

						while (class16.isKeyDown()) {
							if (class241.field2833 == 84) {
								var68 = true;
							}
						} 

						var55 = class134.loginBoxCenter - 80;
						var56 = 291;
						if (((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) {
							class11.openURL(class129.method2849("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var55 = class134.loginBoxCenter + 80;
						if ((((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) || var68) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class150.method3089(1);
								if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
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
								class150.method3089(1);
								if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class150.method3089(1);
								if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								class127.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var53;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class16.isKeyDown()) {
									var53 = class134.loginBoxCenter - 80;
									var8 = 321;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										class127.Login_promptCredentials(false);
									}

									var53 = class134.loginBoxCenter + 80;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										class150.method3089(0);
									}
									break;
								}

								if (class241.field2833 == 84) {
									class127.Login_promptCredentials(false);
								} else if (class241.field2833 == 13) {
									class150.method3089(0);
								}
							} 
						} else {
							int var11;
							int var12;
							int var19;
							int var27;
							short var54;
							boolean var58;
							if (Login.loginIndex == 2) {
								var54 = 201;
								var53 = var54 + 52;
								if (((var4 == 1) && (var52 >= (var53 - 12))) && (var52 < (var53 + 2))) {
									Login.currentLoginField = 0;
								}

								var53 += 15;
								if (((var4 == 1) && (var52 >= (var53 - 12))) && (var52 < (var53 + 2))) {
									Login.currentLoginField = 1;
								}

								var53 += 15;
								var54 = 361;
								if (DynamicObject.field973 != null) {
									var55 = DynamicObject.field973.highX / 2;
									if (((((var4 == 1) && (var51 >= (DynamicObject.field973.lowX - var55))) && (var51 <= (var55 + DynamicObject.field973.lowX))) && (var52 >= (var54 - 15))) && (var52 < var54)) {
										switch (Login.field897) {
											case 1 :
												GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												class150.method3089(5);
												return;
											case 2 :
												class11.openURL("https://support.runescape.com/hc/en-gb", true, false);}

									}
								}

								var55 = class134.loginBoxCenter - 80;
								var56 = 321;
								if (((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										GrandExchangeEvent.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										GrandExchangeEvent.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", "");
									Varcs.method2462(false);
									InterfaceParent.updateGameState(20);
									return;
								}

								var55 = (Login.loginBoxX + 180) + 80;
								if (((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) {
									class150.method3089(0);
									Login.Login_username = "";
									Login.Login_password = "";
									UrlRequest.field1346 = 0;
									class452.otp = "";
									Login.field903 = true;
								}

								var55 = class134.loginBoxCenter + (-117);
								var56 = 277;
								Login.field901 = (((var51 >= var55) && (var51 < (var55 + Message.field458))) && (var52 >= var56)) && (var52 < (var56 + KeyHandler.field140));
								if ((var4 == 1) && Login.field901) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if ((!Client.Login_isUsernameRemembered) && (Interpreter.clientPreferences.method2273() != null)) {
										Interpreter.clientPreferences.method2316(((String) (null)));
									}
								}

								var55 = class134.loginBoxCenter + 24;
								var56 = 277;
								Login.field902 = (((var51 >= var55) && (var51 < (var55 + Message.field458))) && (var52 >= var56)) && (var52 < (var56 + KeyHandler.field140));
								if ((var4 == 1) && Login.field902) {
									Interpreter.clientPreferences.method2256(!Interpreter.clientPreferences.method2257());
									if (!Interpreter.clientPreferences.method2257()) {
										Login.Login_username = "";
										Interpreter.clientPreferences.method2316(((String) (null)));
										if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}
								}

								label1490 : while (
								true) {
									Transferable var75;
									do {
										while (true) {
											label1404 : do 
											{
												while (true) {
													while (class16.isKeyDown()) {
														if (class241.field2833 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1404;
															}

															char var59 = class1.field3;

															for (var11 = 0; (var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length()) && (var59 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)); ++var11) {
															}

															if ((class241.field2833 == 85) && (Login.Login_username.length() > 0)) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if ((class241.field2833 == 84) || (class241.field2833 == 80)) {
																Login.currentLoginField = 1;
															}

															char var61 = class1.field3;
															boolean var65 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var61) != (-1);
															if (var65 && (Login.Login_username.length() < 320)) {
																Login.Login_username = Login.Login_username + class1.field3;
															}
														} else {
															class150.method3089(0);
															Login.Login_username = "";
															Login.Login_password = "";
															UrlRequest.field1346 = 0;
															class452.otp = "";
															Login.field903 = true;
														}
													} 

													return;
												} 
											} while (Login.currentLoginField != 1 );

											if ((class241.field2833 == 85) && (Login.Login_password.length() > 0)) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if ((class241.field2833 == 84) || (class241.field2833 == 80)) {
												Login.currentLoginField = 0;
												if (class241.field2833 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														GrandExchangeEvent.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														GrandExchangeEvent.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", "");
													Varcs.method2462(false);
													InterfaceParent.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && (class241.field2833 == 67)) {
												Clipboard var74 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var75 = var74.getContents(UserComparator10.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											char var66 = class1.field3;
											if ((((var66 >= ' ') && (var66 < 127)) || ((var66 > 127) && (var66 < 160))) || ((var66 > 160) && (var66 <= 255))) {
												var58 = true;
											} else {
												label1661 : {
													if (var66 != 0) {
														char[] var77 = class345.cp1252AsciiExtension;

														for (var27 = 0; var27 < var77.length; ++var27) {
															char var14 = var77[var27];
															if (var66 == var14) {
																var58 = true;
																break label1661;
															}
														}
													}

													var58 = false;
												}
											}

											if (var58) {
												char var86 = class1.field3;
												boolean var63 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var86) != (-1);
												if (var63 && (Login.Login_password.length() < 20)) {
													Login.Login_password = Login.Login_password + class1.field3;
												}
											}
										} 
									} while (var12 <= 0 );

									try {
										String var62 = ((String) (var75.getTransferData(DataFlavor.stringFlavor)));
										int var64 = Math.min(var12, var62.length());
										int var67 = 0;

										while (true) {
											if (var67 >= var64) {
												Login.Login_password = Login.Login_password + var62.substring(0, var64);
												continue label1490;
											}

											char var70 = var62.charAt(var67);
											boolean var16;
											if ((((var70 >= ' ') && (var70 < 127)) || ((var70 > 127) && (var70 < 160))) || ((var70 > 160) && (var70 <= 255))) {
												var16 = true;
											} else {
												label1662 : {
													if (var70 != 0) {
														char[] var72 = class345.cp1252AsciiExtension;

														for (var19 = 0; var19 < var72.length; ++var19) {
															char var20 = var72[var19];
															if (var70 == var20) {
																var16 = true;
																break label1662;
															}
														}
													}

													var16 = false;
												}
											}

											if (!var16) {
												break;
											}

											char var73 = var62.charAt(var67);
											boolean var25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var73) != (-1);
											if (!var25) {
												break;
											}

											++var67;
										} 

										class150.method3089(3);
										return;
									} catch (UnsupportedFlavorException var49) {
									} catch (IOException var50) {
									}
								} 
							} else if (Login.loginIndex == 3) {
								var53 = Login.loginBoxX + 180;
								var8 = 276;
								if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
									class230.method4894(false);
								}

								var53 = Login.loginBoxX + 180;
								var8 = 326;
								if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
									GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									class150.method3089(5);
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var53 = (Login.loginBoxX + 180) - 80;
									var8 = 321;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										class452.otp.trim();
										if (class452.otp.length() != 6) {
											GrandExchangeEvent.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										UrlRequest.field1346 = Integer.parseInt(class452.otp);
										class452.otp = "";
										Varcs.method2462(true);
										GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", "");
										InterfaceParent.updateGameState(20);
										return;
									}

									if (((((var4 == 1) && (var51 >= ((Login.loginBoxX + 180) - 9))) && (var51 <= ((Login.loginBoxX + 180) + 130))) && (var52 >= 263)) && (var52 <= 296)) {
										Login.field903 = !Login.field903;
									}

									if (((((var4 == 1) && (var51 >= ((Login.loginBoxX + 180) - 34))) && (var51 <= ((Login.loginBoxX + 34) + 180))) && (var52 >= 351)) && (var52 <= 363)) {
										class11.openURL(class129.method2849("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var53 = (Login.loginBoxX + 180) + 80;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										class150.method3089(0);
										Login.Login_username = "";
										Login.Login_password = "";
										UrlRequest.field1346 = 0;
										class452.otp = "";
									}

									while (class16.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (class1.field3 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (class241.field2833 == 13) {
											class150.method3089(0);
											Login.Login_username = "";
											Login.Login_password = "";
											UrlRequest.field1346 = 0;
											class452.otp = "";
										} else {
											if ((class241.field2833 == 85) && (class452.otp.length() > 0)) {
												class452.otp = class452.otp.substring(0, class452.otp.length() - 1);
											}

											if (class241.field2833 == 84) {
												class452.otp.trim();
												if (class452.otp.length() != 6) {
													GrandExchangeEvent.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												UrlRequest.field1346 = Integer.parseInt(class452.otp);
												class452.otp = "";
												Varcs.method2462(true);
												GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", "");
												InterfaceParent.updateGameState(20);
												return;
											}

											if (var9 && (class452.otp.length() < 6)) {
												class452.otp = class452.otp + class1.field3;
											}
										}
									} 
								} else if (Login.loginIndex == 5) {
									var53 = (Login.loginBoxX + 180) - 80;
									var8 = 321;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										Login.Login_username = Login.Login_username.trim();
										if (Login.Login_username.length() == 0) {
											GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										} else {
											long var31;
											try {
												URL var26 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws");
												URLConnection var13 = var26.openConnection();
												var13.setRequestProperty("connection", "close");
												var13.setDoInput(true);
												var13.setDoOutput(true);
												var13.setConnectTimeout(5000);
												OutputStreamWriter var79 = new OutputStreamWriter(var13.getOutputStream());
												var79.write("data1=req");
												var79.flush();
												InputStream var81 = var13.getInputStream();
												Buffer var83 = new Buffer(new byte[1000]);

												while (true) {
													int var17 = var81.read(var83.array, var83.offset, 1000 - var83.offset);
													if (var17 == (-1)) {
														var83.offset = 0;
														long var33 = var83.readLong();
														var31 = var33;
														break;
													}

													var83.offset += var17;
													if (var83.offset >= 1000) {
														var31 = 0L;
														break;
													}
												} 
											} catch (Exception var45) {
												var31 = 0L;
											}

											int var57;
											if (0L == var31) {
												var57 = 5;
											} else {
												var57 = class141.method2990(var31, Login.Login_username);
											}

											switch (var57) {
												case 2 :
													GrandExchangeEvent.setLoginResponseString(Strings.field3645, Strings.field3870, Strings.field3871);
													class150.method3089(6);
													break;
												case 3 :
													GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 4 :
													GrandExchangeEvent.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
													break;
												case 5 :
													GrandExchangeEvent.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
													break;
												case 6 :
													GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 7 :
													GrandExchangeEvent.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");}

										}

										return;
									}

									var53 = (Login.loginBoxX + 180) + 80;
									if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
										class127.Login_promptCredentials(true);
									}

									var56 = 361;
									if (Projectile.field946 != null) {
										var10 = Projectile.field946.highX / 2;
										if (((((var4 == 1) && (var51 >= (Projectile.field946.lowX - var10))) && (var51 <= (var10 + Projectile.field946.lowX))) && (var52 >= (var56 - 15))) && (var52 < var56)) {
											class11.openURL(class129.method2849("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (class16.isKeyDown()) {
										var58 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
											if (class1.field3 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
												var58 = true;
												break;
											}
										}

										if (class241.field2833 == 13) {
											class127.Login_promptCredentials(true);
										} else {
											if ((class241.field2833 == 85) && (Login.Login_username.length() > 0)) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class241.field2833 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var35;
													try {
														URL var28 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws");
														URLConnection var29 = var28.openConnection();
														var29.setRequestProperty("connection", "close");
														var29.setDoInput(true);
														var29.setDoOutput(true);
														var29.setConnectTimeout(5000);
														OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
														var30.write("data1=req");
														var30.flush();
														InputStream var37 = var29.getInputStream();
														Buffer var18 = new Buffer(new byte[1000]);

														while (true) {
															var19 = var37.read(var18.array, var18.offset, 1000 - var18.offset);
															if (var19 == (-1)) {
																var18.offset = 0;
																long var38 = var18.readLong();
																var35 = var38;
																break;
															}

															var18.offset += var19;
															if (var18.offset >= 1000) {
																var35 = 0L;
																break;
															}
														} 
													} catch (Exception var46) {
														var35 = 0L;
													}

													if (0L == var35) {
														var11 = 5;
													} else {
														var11 = class141.method2990(var35, Login.Login_username);
													}

													switch (var11) {
														case 2 :
															GrandExchangeEvent.setLoginResponseString(Strings.field3645, Strings.field3870, Strings.field3871);
															class150.method3089(6);
															break;
														case 3 :
															GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 4 :
															GrandExchangeEvent.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
															break;
														case 5 :
															GrandExchangeEvent.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
															break;
														case 6 :
															GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 7 :
															GrandExchangeEvent.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");}

												}

												return;
											}

											if (var58 && (Login.Login_username.length() < 320)) {
												Login.Login_username = Login.Login_username + class1.field3;
											}
										}
									} 
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (class260.field2888 && (!Client.onMobile)) {
											var53 = class134.loginBoxCenter - 150;
											var55 = ((var53 + 40) + 240) + 25;
											var56 = 231;
											var10 = var56 + 40;
											if (((((var4 == 1) && (var51 >= var53)) && (var51 <= var55)) && (var52 >= var56)) && (var52 <= var10)) {
												var12 = var53;
												var27 = 0;

												while (true) {
													if (var27 >= 8) {
														var11 = 0;
														break;
													}

													if (var51 <= (var12 + 30)) {
														var11 = var27;
														break;
													}

													var12 += 30;
													var12 += ((var27 != 1) && (var27 != 3)) ? 5 : 20;
													++var27;
												} 

												Login.field899 = var11;
											}

											var11 = (Login.loginBoxX + 180) - 80;
											short var60 = 321;
											boolean var15;
											String var42;
											boolean var69;
											String[] var71;
											boolean var78;
											Date var80;
											Date var82;
											SimpleDateFormat var84;
											java.util.Calendar var85;
											StringBuilder var87;
											Date var88;
											if (((((var4 == 1) && (var51 >= (var11 - 75))) && (var51 <= (var11 + 75))) && (var52 >= (var60 - 20))) && (var52 <= (var60 + 20))) {
												label1256 : {
													try {
														var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
														var84.setLenient(false);
														var87 = new StringBuilder();
														var71 = Login.field900;
														var19 = 0;

														while (true) {
															if (var19 < var71.length) {
																var42 = var71[var19];
																if (var42 != null) {
																	var87.append(var42);
																	++var19;
																	continue;
																}

																class150.method3092("Date not valid.", "Please ensure all characters are populated.", "");
																var82 = null;
															} else {
																var87.append("12");
																var82 = var84.parse(var87.toString());
															}

															var80 = var82;
															break;
														} 
													} catch (ParseException var48) {
														class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
														var78 = false;
														break label1256;
													}

													if (var80 == null) {
														var78 = false;
													} else {
														var85 = java.util.Calendar.getInstance();
														var85.set(1, var85.get(1) - 13);
														var88 = var85.getTime();
														var15 = var80.before(var88);
														var69 = GraphicsObject.method1864(var80);
														if (!var69) {
															class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var78 = false;
														} else {
															if (!var15) {
																class9.field35 = 8388607;
															} else {
																class9.field35 = ((int) ((var80.getTime() / 86400000L) - 11745L));
															}

															var78 = true;
														}
													}
												}

												if (var78) {
													InterfaceParent.updateGameState(50);
													return;
												}
											}

											var11 = (Login.loginBoxX + 180) + 80;
											if (((((var4 == 1) && (var51 >= (var11 - 75))) && (var51 <= (var11 + 75))) && (var52 >= (var60 - 20))) && (var52 <= (var60 + 20))) {
												Login.field900 = new String[8];
												class127.Login_promptCredentials(true);
											}

											while (class16.isKeyDown()) {
												if (class241.field2833 == 101) {
													Login.field900[Login.field899] = null;
												}

												if (class241.field2833 == 85) {
													if ((Login.field900[Login.field899] == null) && (Login.field899 > 0)) {
														--Login.field899;
													}

													Login.field900[Login.field899] = null;
												}

												if ((class1.field3 >= '0') && (class1.field3 <= '9')) {
													Login.field900[Login.field899] = "" + class1.field3;
													if (Login.field899 < 7) {
														++Login.field899;
													}
												}

												if (class241.field2833 == 84) {
													label1185 : {
														try {
															var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var84.setLenient(false);
															var87 = new StringBuilder();
															var71 = Login.field900;
															var19 = 0;

															while (true) {
																if (var19 >= var71.length) {
																	var87.append("12");
																	var82 = var84.parse(var87.toString());
																	break;
																}

																var42 = var71[var19];
																if (var42 == null) {
																	class150.method3092("Date not valid.", "Please ensure all characters are populated.", "");
																	var82 = null;
																	break;
																}

																var87.append(var42);
																++var19;
															} 

															var80 = var82;
														} catch (ParseException var47) {
															class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var78 = false;
															break label1185;
														}

														if (var80 == null) {
															var78 = false;
														} else {
															var85 = java.util.Calendar.getInstance();
															var85.set(1, var85.get(1) - 13);
															var88 = var85.getTime();
															var15 = var80.before(var88);
															var69 = GraphicsObject.method1864(var80);
															if (!var69) {
																class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var78 = false;
															} else {
																if (!var15) {
																	class9.field35 = 8388607;
																} else {
																	class9.field35 = ((int) ((var80.getTime() / 86400000L) - 11745L));
																}

																var78 = true;
															}
														}
													}

													if (var78) {
														InterfaceParent.updateGameState(50);
													}

													return;
												}
											} 
										} else {
											var53 = (Login.loginBoxX + 180) - 80;
											var8 = 321;
											if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
												class11.openURL(class129.method2849("secure", true) + "m=dob/set_dob.ws", true, false);
												GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class150.method3089(6);
												return;
											}

											var53 = (Login.loginBoxX + 180) + 80;
											if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
												class127.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var53 = (Login.loginBoxX + 180) - 80;
										var8 = 321;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class11.openURL("https://www.jagex.com/terms/privacy", true, false);
											GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class150.method3089(6);
											return;
										}

										var53 = (Login.loginBoxX + 180) + 80;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class127.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var53 = Login.loginBoxX + 180;
										var8 = 311;
										if (((class241.field2833 == 84) || (class241.field2833 == 13)) || (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20)))) {
											class230.method4894(false);
										}
									} else if (Login.loginIndex == 10) {
										var53 = Login.loginBoxX + 180;
										var8 = 209;
										if ((class241.field2833 == 84) || (((((var4 == 1) && (var51 >= (var53 - 109))) && (var51 <= (var53 + 109))) && (var52 >= var8)) && (var52 <= (var8 + 68)))) {
											GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", "");
											Client.field517 = class441.field4667;
											Varcs.method2462(false);
											InterfaceParent.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var53 = class134.loginBoxCenter;
										var8 = 233;
										Bounds var43 = var1.method6432(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8);
										Bounds var23 = var1.method6432(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8);
										Bounds var24 = var1.method6432(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8);
										var55 = var8 + 17;
										Bounds var76 = var1.method6432(0, 34, "<col=ffd200>agreement (EULA)</col>.", var53, var55);
										if (var4 == 1) {
											if (var43.method6983(var51, var52)) {
												class11.openURL("https://www.jagex.com/terms", true, false);
											} else if (var23.method6983(var51, var52)) {
												class11.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var24.method6983(var51, var52) || var76.method6983(var51, var52)) {
												class11.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var53 = class134.loginBoxCenter - 80;
										var8 = 311;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											Interpreter.clientPreferences.method2274(Client.field484);
											class230.method4894(true);
										}

										var53 = class134.loginBoxCenter + 80;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var53 = class134.loginBoxCenter;
										var8 = 321;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class230.method4894(true);
										}
									} else if (Login.loginIndex == 14) {
										String var44 = "";
										switch (Login.Login_banType) {
											case 0 :
												var44 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1 :
												var44 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											default :
												class127.Login_promptCredentials(false);}


										var55 = Login.loginBoxX + 180;
										var56 = 276;
										if (((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) {
											class11.openURL(var44, true, false);
											GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											class150.method3089(6);
											return;
										}

										var55 = Login.loginBoxX + 180;
										var56 = 326;
										if (((((var4 == 1) && (var51 >= (var55 - 75))) && (var51 <= (var55 + 75))) && (var52 >= (var56 - 20))) && (var52 <= (var56 + 20))) {
											class127.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var53 = Login.loginBoxX + 180;
										var8 = 301;
										if (((((var4 == 1) && (var51 >= (var53 - 75))) && (var51 <= (var53 + 75))) && (var52 >= (var8 - 20))) && (var52 <= (var8 + 20))) {
											class230.method4894(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!class16.isKeyDown()) {
												var54 = 321;
												if (((var4 == 1) && (var52 >= (var54 - 20))) && (var52 <= (var54 + 20))) {
													class127.Login_promptCredentials(true);
												}

												return;
											}
										} while ((class241.field2833 != 84) && (class241.field2833 != 13) );

										class127.Login_promptCredentials(true);
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