import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import java.io.InputStream;
import java.io.IOException;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.net.URLConnection;
import java.awt.datatransfer.DataFlavor;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.io.OutputStreamWriter;
import net.runelite.mapping.Export;
@ObfuscatedName("h")
public class class16 implements ThreadFactory {
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	@ObfuscatedName("jn")
	@ObfuscatedGetter(intValue = 733600801)
	@Export("cameraY")
	static int cameraY;

	@ObfuscatedName("c")
	final ThreadGroup field93;

	@ObfuscatedName("v")
	final AtomicInteger field88;

	@ObfuscatedSignature(descriptor = "Lu;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Lu;)V")
	class16(class14 var1) {
		this.this$0 = var1;
		this.field88 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field93 = (var2 != null) ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field93, var1, this.this$0.field77 + "-rest-request-" + this.field88.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lap;Lmt;B)V", garbageValue = "5")
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) {
			class151.method3136(var0);
		} else {
			int var4;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class19.clientPreferences.method2248(!class19.clientPreferences.method2317());
				if (!class19.clientPreferences.method2317()) {
					Archive var2 = class121.archive6;
					int var3 = var2.getGroupId("scape main");
					var4 = var2.getFileId(var3, "");
					AttackOption.method2410(var2, var3, var4, 255, false);
				} else {
					ReflectionCheck.method579();
				}
			}
			if (Client.gameState != 5) {
				if (-1L == Login.field923) {
					Login.field923 = class115.method2692() + 1000L;
				}
				long var21 = class115.method2692();
				if (class342.method6312() && Login.field925 == -1L) {
					Login.field925 = var21;
					if (Login.field925 > Login.field923) {
						Login.field923 = Login.field925;
					}
				}
				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class134.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var4 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) {
								class118.method2738();
								return;
							}
						}
						if (class174.World_request != null) {
							class118.method2738();
						}
					}
					var4 = MouseHandler.MouseHandler_lastButton;
					int var48 = MouseHandler.MouseHandler_lastPressedX;
					int var49 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var48 = MouseHandler.MouseHandler_x;
						var49 = MouseHandler.MouseHandler_y;
					}
					if (!class122.mouseCam && var4 == 4) {
						var4 = 1;
					}
					int var52;
					short var53;
					if (Login.loginIndex == 0) {
						boolean var64 = false;
						while (class18.isKeyDown()) {
							if (class272.field3196 == 84) {
								var64 = true;
							}
						} 
						var52 = Canvas.loginBoxCenter - 80;
						var53 = 291;
						if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) {
							class258.openURL(ModeWhere.method6080("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}
						var52 = Canvas.loginBoxCenter + 80;
						if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20 || var64) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								WorldMapData_1.method4872(1);
								class29.method357();
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
								WorldMapData_1.method4872(1);
								class29.method357();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								WorldMapData_1.method4872(1);
								class29.method357();
							} else {
								class135.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var50;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class18.isKeyDown()) {
									var50 = Canvas.loginBoxCenter - 80;
									var8 = 321;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										class135.Login_promptCredentials(false);
									}
									var50 = Canvas.loginBoxCenter + 80;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										WorldMapData_1.method4872(0);
									}
									break;
								}
								if (class272.field3196 == 84) {
									class135.Login_promptCredentials(false);
								} else if (class272.field3196 == 13) {
									WorldMapData_1.method4872(0);
								}
							} 
						} else {
							int var11;
							int var19;
							short var51;
							boolean var55;
							if (Login.loginIndex == 2) {
								var51 = 201;
								var50 = var51 + 52;
								if (var4 == 1 && var49 >= var50 - 12 && var49 < var50 + 2) {
									Login.currentLoginField = 0;
								}
								var50 += 15;
								if (var4 == 1 && var49 >= var50 - 12 && var49 < var50 + 2) {
									Login.currentLoginField = 1;
								}
								var50 += 15;
								var51 = 361;
								if (ArchiveLoader.field1022 != null) {
									var52 = ArchiveLoader.field1022.highX / 2;
									if (var4 == 1 && var48 >= ArchiveLoader.field1022.lowX - var52 && var48 <= var52 + ArchiveLoader.field1022.lowX && var49 >= var51 - 15 && var49 < var51) {
										switch (Login.field902) {
											case 1 :
												class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												WorldMapData_1.method4872(5);
												return;
											case 2 :
												class258.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}
								var52 = Canvas.loginBoxCenter - 80;
								var53 = 321;
								if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class101.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}
									if (Login.Login_password.length() == 0) {
										class101.setLoginResponseString("", "Please enter your password.", "");
										return;
									}
									class101.setLoginResponseString("", "Connecting to server...", "");
									TriBool.method6791(false);
									HealthBarUpdate.updateGameState(20);
									return;
								}
								var52 = Login.loginBoxX + 180 + 80;
								if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) {
									WorldMapData_1.method4872(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class240.field2846 = 0;
									World.otp = "";
									Login.field895 = true;
								}
								var52 = Canvas.loginBoxCenter + -117;
								var53 = 277;
								Login.field912 = var48 >= var52 && var48 < var52 + ReflectionCheck.field247 && var49 >= var53 && var49 < var53 + MouseRecorder.field1064;
								if (var4 == 1 && Login.field912) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class19.clientPreferences.method2264() != null) {
										class19.clientPreferences.method2260(((String) (null)));
									}
								}
								var52 = Canvas.loginBoxCenter + 24;
								var53 = 277;
								Login.field913 = var48 >= var52 && var48 < var52 + ReflectionCheck.field247 && var49 >= var53 && var49 < var53 + MouseRecorder.field1064;
								if (var4 == 1 && Login.field913) {
									class19.clientPreferences.method2246(!class19.clientPreferences.method2247());
									if (!class19.clientPreferences.method2247()) {
										Login.Login_username = "";
										class19.clientPreferences.method2260(((String) (null)));
										class29.method357();
									}
								}
								label1389 : while (true) {
									int var59;
									Transferable var69;
									do {
										while (true) {
											label1307 : do {
												while (true) {
													while (class18.isKeyDown()) {
														if (class272.field3196 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1307;
															}
															char var56 = HealthBar.field1258;
															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length() && var56 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}
															if (class272.field3196 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}
															if (class272.field3196 == 84 || class272.field3196 == 80) {
																Login.currentLoginField = 1;
															}
															char var57 = HealthBar.field1258;
															boolean var61 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var57) != -1;
															if (var61 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + HealthBar.field1258;
															}
														} else {
															WorldMapData_1.method4872(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class240.field2846 = 0;
															World.otp = "";
															Login.field895 = true;
														}
													} 
													return;
												} 
											} while (Login.currentLoginField != 1 );
											if (class272.field3196 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class272.field3196 == 84 || class272.field3196 == 80) {
												Login.currentLoginField = 0;
												if (class272.field3196 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class101.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}
													if (Login.Login_password.length() == 0) {
														class101.setLoginResponseString("", "Please enter your password.", "");
														return;
													}
													class101.setLoginResponseString("", "Connecting to server...", "");
													TriBool.method6791(false);
													HealthBarUpdate.updateGameState(20);
													return;
												}
											}
											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class272.field3196 == 67) {
												Clipboard var68 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var69 = var68.getContents(class353.client);
												var59 = 20 - Login.Login_password.length();
												break;
											}
											char var62 = HealthBar.field1258;
											if ((var62 < ' ' || var62 >= 127) && (var62 <= 127 || var62 >= 160) && (var62 <= 160 || var62 > 255)) {
												label1514 : {
													if (var62 != 0) {
														char[] var71 = class340.cp1252AsciiExtension;
														for (int var72 = 0; var72 < var71.length; ++var72) {
															char var14 = var71[var72];
															if (var62 == var14) {
																var55 = true;
																break label1514;
															}
														}
													}
													var55 = false;
												}
											} else {
												var55 = true;
											}
											if (var55) {
												char var74 = HealthBar.field1258;
												boolean var58 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var74) != -1;
												if (var58 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + HealthBar.field1258;
												}
											}
										} 
									} while (var59 <= 0 );
									try {
										String var60 = ((String) (var69.getTransferData(DataFlavor.stringFlavor)));
										int var63 = Math.min(var59, var60.length());
										int var15 = 0;
										while (true) {
											if (var15 >= var63) {
												Login.Login_password = Login.Login_password + var60.substring(0, var63);
												continue label1389;
											}
											char var65 = var60.charAt(var15);
											boolean var16;
											if ((var65 < ' ' || var65 >= 127) && (var65 <= 127 || var65 >= 160) && (var65 <= 160 || var65 > 255)) {
												label1517 : {
													if (var65 != 0) {
														char[] var66 = class340.cp1252AsciiExtension;
														for (var19 = 0; var19 < var66.length; ++var19) {
															char var20 = var66[var19];
															if (var65 == var20) {
																var16 = true;
																break label1517;
															}
														}
													}
													var16 = false;
												}
											} else {
												var16 = true;
											}
											if (!var16) {
												break;
											}
											char var67 = var60.charAt(var15);
											boolean var25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var67) != -1;
											if (!var25) {
												break;
											}
											++var15;
										} 
										WorldMapData_1.method4872(3);
										return;
									} catch (UnsupportedFlavorException var46) {
									} catch (IOException var47) {
									}
								} 
							} else if (Login.loginIndex == 3) {
								var50 = Login.loginBoxX + 180;
								var8 = 276;
								if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
									class101.method2547(false);
								}
								var50 = Login.loginBoxX + 180;
								var8 = 326;
								if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
									class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									WorldMapData_1.method4872(5);
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var50 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										World.otp.trim();
										if (World.otp.length() != 6) {
											class101.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}
										class240.field2846 = Integer.parseInt(World.otp);
										World.otp = "";
										TriBool.method6791(true);
										class101.setLoginResponseString("", "Connecting to server...", "");
										HealthBarUpdate.updateGameState(20);
										return;
									}
									if (var4 == 1 && var48 >= Login.loginBoxX + 180 - 9 && var48 <= Login.loginBoxX + 180 + 130 && var49 >= 263 && var49 <= 296) {
										Login.field895 = !Login.field895;
									}
									if (var4 == 1 && var48 >= Login.loginBoxX + 180 - 34 && var48 <= Login.loginBoxX + 34 + 180 && var49 >= 351 && var49 <= 363) {
										class258.openURL(ModeWhere.method6080("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}
									var50 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										WorldMapData_1.method4872(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class240.field2846 = 0;
										World.otp = "";
									}
									while (class18.isKeyDown()) {
										boolean var9 = false;
										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (HealthBar.field1258 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}
										if (class272.field3196 == 13) {
											WorldMapData_1.method4872(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class240.field2846 = 0;
											World.otp = "";
										} else {
											if (class272.field3196 == 85 && World.otp.length() > 0) {
												World.otp = World.otp.substring(0, World.otp.length() - 1);
											}
											if (class272.field3196 == 84) {
												World.otp.trim();
												if (World.otp.length() != 6) {
													class101.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}
												class240.field2846 = Integer.parseInt(World.otp);
												World.otp = "";
												TriBool.method6791(true);
												class101.setLoginResponseString("", "Connecting to server...", "");
												HealthBarUpdate.updateGameState(20);
												return;
											}
											if (var9 && World.otp.length() < 6) {
												World.otp = World.otp + HealthBar.field1258;
											}
										}
									} 
								} else if (Login.loginIndex == 5) {
									var50 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										Login.Login_username = Login.Login_username.trim();
										if (Login.Login_username.length() == 0) {
											class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										} else {
											long var31;
											try {
												URL var26 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws");
												URLConnection var13 = var26.openConnection();
												var13.setRequestProperty("connection", "close");
												var13.setDoInput(true);
												var13.setDoOutput(true);
												var13.setConnectTimeout(5000);
												OutputStreamWriter var73 = new OutputStreamWriter(var13.getOutputStream());
												var73.write("data1=req");
												var73.flush();
												InputStream var75 = var13.getInputStream();
												Buffer var76 = new Buffer(new byte[1000]);
												while (true) {
													int var17 = var75.read(var76.array, var76.offset, 1000 - var76.offset);
													if (var17 == -1) {
														var76.offset = 0;
														long var33 = var76.readLong();
														var31 = var33;
														break;
													}
													var76.offset += var17;
													if (var76.offset >= 1000) {
														var31 = 0L;
														break;
													}
												} 
											} catch (Exception var44) {
												var31 = 0L;
											}
											int var54;
											if (var31 == 0L) {
												var54 = 5;
											} else {
												var54 = WorldMapAreaData.method5082(var31, Login.Login_username);
											}
											switch (var54) {
												case 2 :
													class101.setLoginResponseString(Strings.field3894, Strings.field3926, Strings.field3896);
													WorldMapData_1.method4872(6);
													break;
												case 3 :
													class101.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 4 :
													class101.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
													break;
												case 5 :
													class101.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
													break;
												case 6 :
													class101.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 7 :
													class101.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
											}
										}
										return;
									}
									var50 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
										class135.Login_promptCredentials(true);
									}
									var53 = 361;
									if (PcmPlayer.field294 != null) {
										var10 = PcmPlayer.field294.highX / 2;
										if (var4 == 1 && var48 >= PcmPlayer.field294.lowX - var10 && var48 <= var10 + PcmPlayer.field294.lowX && var49 >= var53 - 15 && var49 < var53) {
											class258.openURL(ModeWhere.method6080("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}
									while (class18.isKeyDown()) {
										var55 = false;
										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
											if (HealthBar.field1258 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
												var55 = true;
												break;
											}
										}
										if (class272.field3196 == 13) {
											class135.Login_promptCredentials(true);
										} else {
											if (class272.field3196 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}
											if (class272.field3196 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var35;
													try {
														URL var28 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws");
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
															if (var19 == -1) {
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
													} catch (Exception var45) {
														var35 = 0L;
													}
													if (var35 == 0L) {
														var11 = 5;
													} else {
														var11 = WorldMapAreaData.method5082(var35, Login.Login_username);
													}
													switch (var11) {
														case 2 :
															class101.setLoginResponseString(Strings.field3894, Strings.field3926, Strings.field3896);
															WorldMapData_1.method4872(6);
															break;
														case 3 :
															class101.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 4 :
															class101.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
															break;
														case 5 :
															class101.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
															break;
														case 6 :
															class101.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 7 :
															class101.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}
												return;
											}
											if (var55 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + HealthBar.field1258;
											}
										}
									} 
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (VarpDefinition.field1821 && !Client.onMobile) {
											var50 = Canvas.loginBoxCenter - 150;
											var52 = var50 + 40 + 240 + 25;
											var53 = 231;
											var10 = var53 + 40;
											if (var4 == 1 && var48 >= var50 && var48 <= var52 && var49 >= var53 && var49 <= var10) {
												Login.field910 = class119.method2757(var50, var48);
											}
											var11 = Login.loginBoxX + 180 - 80;
											short var12 = 321;
											boolean var27;
											if (var4 == 1 && var48 >= var11 - 75 && var48 <= var11 + 75 && var49 >= var12 - 20 && var49 <= var12 + 20) {
												var27 = GrandExchangeOfferUnitPriceComparator.method6031();
												if (var27) {
													HealthBarUpdate.updateGameState(50);
													return;
												}
											}
											var11 = Login.loginBoxX + 180 + 80;
											if (var4 == 1 && var48 >= var11 - 75 && var48 <= var11 + 75 && var49 >= var12 - 20 && var49 <= var12 + 20) {
												Login.field911 = new String[8];
												class135.Login_promptCredentials(true);
											}
											while (class18.isKeyDown()) {
												if (class272.field3196 == 101) {
													Login.field911[Login.field910] = null;
												}
												if (class272.field3196 == 85) {
													if (Login.field911[Login.field910] == null && Login.field910 > 0) {
														--Login.field910;
													}
													Login.field911[Login.field910] = null;
												}
												if (HealthBar.field1258 >= '0' && HealthBar.field1258 <= '9') {
													Login.field911[Login.field910] = "" + HealthBar.field1258;
													if (Login.field910 < 7) {
														++Login.field910;
													}
												}
												if (class272.field3196 == 84) {
													var27 = GrandExchangeOfferUnitPriceComparator.method6031();
													if (var27) {
														HealthBarUpdate.updateGameState(50);
													}
													return;
												}
											} 
										} else {
											var50 = Login.loginBoxX + 180 - 80;
											var8 = 321;
											if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
												class258.openURL(ModeWhere.method6080("secure", true) + "m=dob/set_dob.ws", true, false);
												class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												WorldMapData_1.method4872(6);
												return;
											}
											var50 = Login.loginBoxX + 180 + 80;
											if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
												class135.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var50 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class258.openURL("https://www.jagex.com/terms/privacy", true, false);
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											WorldMapData_1.method4872(6);
											return;
										}
										var50 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class135.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var50 = Login.loginBoxX + 180;
										var8 = 311;
										if (class272.field3196 == 84 || class272.field3196 == 13 || var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class101.method2547(false);
										}
									} else if (Login.loginIndex == 10) {
										var50 = Login.loginBoxX + 180;
										var8 = 209;
										if (class272.field3196 == 84 || var4 == 1 && var48 >= var50 - 109 && var48 <= var50 + 109 && var49 >= var8 && var49 <= var8 + 68) {
											class101.setLoginResponseString("", "Connecting to server...", "");
											Client.field516 = class446.field4750;
											TriBool.method6791(false);
											HealthBarUpdate.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var50 = Canvas.loginBoxCenter;
										var8 = 233;
										Bounds var42 = var1.method6372(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8);
										Bounds var23 = var1.method6372(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8);
										Bounds var24 = var1.method6372(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8);
										var52 = var8 + 17;
										Bounds var70 = var1.method6372(0, 34, "<col=ffd200>agreement (EULA)</col>.", var50, var52);
										if (var4 == 1) {
											if (var42.method6894(var48, var49)) {
												class258.openURL("https://www.jagex.com/terms", true, false);
											} else if (var23.method6894(var48, var49)) {
												class258.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var24.method6894(var48, var49) || var70.method6894(var48, var49)) {
												class258.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}
										var50 = Canvas.loginBoxCenter - 80;
										var8 = 311;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class19.clientPreferences.method2307(Client.field482);
											class101.method2547(true);
										}
										var50 = Canvas.loginBoxCenter + 80;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var50 = Canvas.loginBoxCenter;
										var8 = 321;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class101.method2547(true);
										}
									} else if (Login.loginIndex == 14) {
										String var43 = "";
										switch (Login.field897) {
											case 0 :
												var43 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1 :
												var43 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											default :
												class135.Login_promptCredentials(false);
										}
										var52 = Login.loginBoxX + 180;
										var53 = 276;
										if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) {
											class258.openURL(var43, true, false);
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											WorldMapData_1.method4872(6);
											return;
										}
										var52 = Login.loginBoxX + 180;
										var53 = 326;
										if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) {
											class135.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var50 = Login.loginBoxX + 180;
										var8 = 301;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class101.method2547(false);
										}
									} else if (Login.loginIndex == 26) {
										var50 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class258.openURL(ModeWhere.method6080("secure", true) + "m=dob/set_dob.ws", true, false);
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											WorldMapData_1.method4872(6);
											return;
										}
										var50 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) {
											class135.Login_promptCredentials(true);
										}
									}
								} else {
									while (true) {
										do {
											if (!class18.isKeyDown()) {
												var51 = 321;
												if (var4 == 1 && var49 >= var51 - 20 && var49 <= var51 + 20) {
													class135.Login_promptCredentials(true);
												}
												return;
											}
										} while (class272.field3196 != 84 && class272.field3196 != 13 );
										class135.Login_promptCredentials(true);
									} 
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2067958159")
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			ReflectionCheck.method579();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class19.clientPreferences.method2258() != 0 && !Client.playingJingle) {
			Archive var1 = class121.archive6;
			int var2 = class19.clientPreferences.method2258();
			class272.musicPlayerStatus = 1;
			class272.musicTrackArchive = var1;
			class272.musicTrackGroupId = var0;
			class151.musicTrackFileId = 0;
			class272.musicTrackVolume = var2;
			class11.musicTrackBoolean = false;
			class272.pcmSampleLength = 2;
		}
		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(descriptor = "(IIIIIIIS)V", garbageValue = "16886")
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapSection2.loadInterface(var0)) {
			class29.updateInterface(SoundCache.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}