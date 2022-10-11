import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 990985137
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -38943471
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 285552363
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1008615281
	)
	static int field4250;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1069808971
	)
	static int field4251;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1833319861
	)
	static int field4252;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1710772269
	)
	static int field4253;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1226776487
	)
	static int field4254;
	@ObfuscatedName("h")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("d")
	static byte[][] field4245;
	@ObfuscatedName("e")
	static ArrayList field4259;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4250 = 0; // L: 16
		field4251 = 1000; // L: 17
		field4252 = 250; // L: 18
		field4253 = 100; // L: 19
		field4254 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4245 = new byte[50][]; // L: 24
		field4259 = new ArrayList(); // L: 28
		FriendSystem.method1807(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "938167543"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 70
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 71
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 72
			return var4; // L: 73
		}

		if (var0 != 5000) { // L: 75
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 76
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 77
			return var4; // L: 78
		}

		if (var0 != 10000) { // L: 80
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 81
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 82
			return var4; // L: 83
		}

		if (var0 != 30000) { // L: 85
			if (var0 < 30000) {
			}
		} else if (field4250 > 0) {
			var4 = field4245[--field4250]; // L: 86
			field4245[field4250] = null; // L: 87
			return var4; // L: 88
		}

		if (UrlRequest.ByteArrayPool_arrays != null) { // L: 90
			for (int var2 = 0; var2 < ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
				if (ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 92
					if (var0 < ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class137.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = UrlRequest.ByteArrayPool_arrays[var2][--class137.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
					UrlRequest.ByteArrayPool_arrays[var2][class137.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
					return var3; // L: 95
				}
			}
		}

		return new byte[var0]; // L: 108
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lai;Lmv;I)V",
		garbageValue = "1971727150"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 304
			ClanChannelMember.method3026(var0); // L: 305
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 308
				Player.clientPreferences.method2392(!Player.clientPreferences.method2393()); // L: 309
				if (!Player.clientPreferences.method2393()) { // L: 310
					Archive var2 = class14.archive6; // L: 311
					int var3 = var2.getGroupId("scape main"); // L: 313
					int var4 = var2.getFileId(var3, ""); // L: 314
					Message.method1164(var2, var3, var4, 255, false); // L: 315
				} else {
					class17.method267(); // L: 318
				}
			}

			if (Client.gameState != 5) { // L: 320
				if (-1L == Login.field924) { // L: 321
					Login.field924 = Language.method6232() + 1000L; // L: 322
				}

				long var22 = Language.method6232(); // L: 324
				boolean var37;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 327
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 331
							var37 = true; // L: 339
							break;
						}

						ArchiveLoader var5 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 332
						if (!var5.isLoaded()) { // L: 333
							var37 = false; // L: 334
							break; // L: 335
						}

						++Client.archiveLoadersDone; // L: 337
					}
				} else {
					var37 = true; // L: 328
				}

				if (var37 && -1L == Login.field918) { // L: 341 342
					Login.field918 = var22; // L: 343
					if (Login.field918 > Login.field924) { // L: 344
						Login.field924 = Login.field918; // L: 345
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 349
					int var24;
					if (Language.Language_EN == class271.clientLanguage) { // L: 350
						if (MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 351
							var24 = Login.xPadding + 5; // L: 352
							short var6 = 463; // L: 353
							byte var7 = 100; // L: 354
							byte var8 = 35; // L: 355
							if (MouseHandler.MouseHandler_lastPressedX >= var24 && MouseHandler.MouseHandler_lastPressedX <= var24 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) { // L: 356
								if (UserComparator9.loadWorlds()) { // L: 358
									Login.worldSelectOpen = true; // L: 359
									Login.worldSelectPage = 0; // L: 360
									Login.worldSelectPagesCount = 0; // L: 361
								}

								return; // L: 364
							}
						}

						if (Frames.World_request != null && UserComparator9.loadWorlds()) { // L: 367 368
							Login.worldSelectOpen = true; // L: 369
							Login.worldSelectPage = 0; // L: 370
							Login.worldSelectPagesCount = 0; // L: 371
						}
					}

					var24 = MouseHandler.MouseHandler_lastButton; // L: 375
					int var38 = MouseHandler.MouseHandler_lastPressedX; // L: 376
					int var39 = MouseHandler.MouseHandler_lastPressedY; // L: 377
					if (var24 == 0) { // L: 378
						var38 = MouseHandler.MouseHandler_x; // L: 379
						var39 = MouseHandler.MouseHandler_y; // L: 380
					}

					if (!Renderable.mouseCam && var24 == 4) { // L: 382
						var24 = 1;
					}

					int var42;
					short var43;
					if (Login.loginIndex == 0) { // L: 383
						boolean var50 = false; // L: 384

						while (class28.isKeyDown()) { // L: 385
							if (class142.field1665 == 84) { // L: 386
								var50 = true; // L: 387
							}
						}

						var42 = ModeWhere.loginBoxCenter - 80; // L: 390
						var43 = 291; // L: 391
						if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20) { // L: 392
							CollisionMap.openURL(SecureRandomCallable.method2205("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 393
						}

						var42 = ModeWhere.loginBoxCenter + 80; // L: 395
						if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20 || var50) { // L: 396
							if ((Client.worldProperties & 33554432) != 0) { // L: 397
								Login.Login_response0 = ""; // L: 398
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 399
								Login.Login_response2 = "Your normal account will not be affected."; // L: 400
								Login.Login_response3 = ""; // L: 401
								class139.method3101(1); // L: 402
								class65.method2029(); // L: 403
							} else if ((Client.worldProperties & 4) != 0) { // L: 405
								if ((Client.worldProperties & 1024) != 0) { // L: 406
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 407
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 408
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 409
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 412
									Login.Login_response2 = "Players can attack each other"; // L: 413
									Login.Login_response3 = "almost everywhere."; // L: 414
								}

								Login.Login_response0 = "Warning!"; // L: 416
								class139.method3101(1); // L: 417
								class65.method2029(); // L: 418
							} else if ((Client.worldProperties & 1024) != 0) { // L: 420
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 421
								Login.Login_response2 = "The Protect Item prayer will"; // L: 422
								Login.Login_response3 = "not work on this world."; // L: 423
								Login.Login_response0 = "Warning!"; // L: 424
								class139.method3101(1); // L: 425
								class65.method2029(); // L: 426
							} else {
								Calendar.Login_promptCredentials(false); // L: 429
							}
						}
					} else {
						short var9;
						int var40;
						if (Login.loginIndex == 1) { // L: 433
							while (true) {
								if (!class28.isKeyDown()) { // L: 434
									var40 = ModeWhere.loginBoxCenter - 80; // L: 442
									var9 = 321; // L: 443
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 444
										Calendar.Login_promptCredentials(false); // L: 445
									}

									var40 = ModeWhere.loginBoxCenter + 80; // L: 447
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 448
										class139.method3101(0); // L: 449
									}
									break;
								}

								if (class142.field1665 == 84) { // L: 435
									Calendar.Login_promptCredentials(false); // L: 436
								} else if (class142.field1665 == 13) { // L: 438
									class139.method3101(0); // L: 439
								}
							}
						} else {
							int var12;
							short var41;
							boolean var45;
							if (Login.loginIndex == 2) { // L: 452
								var41 = 201; // L: 453
								var40 = var41 + 52; // L: 454
								if (var24 == 1 && var39 >= var40 - 12 && var39 < var40 + 2) { // L: 455
									Login.currentLoginField = 0;
								}

								var40 += 15; // L: 456
								if (var24 == 1 && var39 >= var40 - 12 && var39 < var40 + 2) { // L: 457
									Login.currentLoginField = 1;
								}

								var40 += 15; // L: 458
								var41 = 361; // L: 459
								if (class269.field3195 != null) { // L: 460
									var42 = class269.field3195.highX / 2; // L: 461
									if (var24 == 1 && var38 >= class269.field3195.lowX - var42 && var38 <= var42 + class269.field3195.lowX && var39 >= var41 - 15 && var39 < var41) { // L: 462
										switch(Login.field903) { // L: 463
										case 1:
											SecureRandomCallable.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 466
											class139.method3101(5); // L: 467
											return; // L: 468
										case 2:
											CollisionMap.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 472
										}
									}
								}

								var42 = ModeWhere.loginBoxCenter - 80; // L: 478
								var43 = 321; // L: 479
								if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20) { // L: 480
									Login.Login_username = Login.Login_username.trim(); // L: 481
									if (Login.Login_username.length() == 0) { // L: 482
										SecureRandomCallable.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 483
										return; // L: 484
									}

									if (Login.Login_password.length() == 0) { // L: 486
										SecureRandomCallable.setLoginResponseString("", "Please enter your password.", ""); // L: 487
										return; // L: 488
									}

									SecureRandomCallable.setLoginResponseString("", "Connecting to server...", ""); // L: 490
									PacketWriter.method2673(false); // L: 491
									Coord.updateGameState(20); // L: 492
									return; // L: 493
								}

								var42 = Login.loginBoxX + 180 + 80; // L: 495
								if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20) { // L: 496
									class139.method3101(0); // L: 497
									Login.Login_username = ""; // L: 498
									Login.Login_password = ""; // L: 499
									class347.field4201 = 0; // L: 500
									class28.otp = ""; // L: 501
									Login.field916 = true; // L: 502
								}

								var42 = ModeWhere.loginBoxCenter + -117; // L: 504
								var43 = 277; // L: 505
								Login.field925 = var38 >= var42 && var38 < var42 + ReflectionCheck.field256 && var39 >= var43 && var39 < var43 + WorldMapID.field2874; // L: 506
								if (var24 == 1 && Login.field925) { // L: 507
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 508
									if (!Client.Login_isUsernameRemembered && Player.clientPreferences.method2407() != null) { // L: 509
										Player.clientPreferences.method2406((String)null); // L: 510
									}
								}

								var42 = ModeWhere.loginBoxCenter + 24; // L: 513
								var43 = 277; // L: 514
								Login.field920 = var38 >= var42 && var38 < var42 + ReflectionCheck.field256 && var39 >= var43 && var39 < var43 + WorldMapID.field2874; // L: 515
								if (var24 == 1 && Login.field920) { // L: 516
									Player.clientPreferences.method2390(!Player.clientPreferences.method2397()); // L: 517
									if (!Player.clientPreferences.method2397()) { // L: 518
										Login.Login_username = ""; // L: 519
										Player.clientPreferences.method2406((String)null); // L: 520
										class65.method2029(); // L: 521
									}
								}

								while (true) {
									int var47;
									Transferable var52;
									do {
										while (true) {
											label1266:
											do {
												while (true) {
													while (class28.isKeyDown()) { // L: 524
														if (class142.field1665 != 13) { // L: 525
															if (Login.currentLoginField != 0) { // L: 534
																continue label1266;
															}

															char var46 = class229.field2794; // L: 535

															for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var46 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12); ++var12) { // L: 537 538
															}

															if (class142.field1665 == 85 && Login.Login_username.length() > 0) { // L: 541
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class142.field1665 == 84 || class142.field1665 == 80) { // L: 542
																Login.currentLoginField = 1;
															}

															if (class118.method2893(class229.field2794) && Login.Login_username.length() < 320) { // L: 543
																Login.Login_username = Login.Login_username + class229.field2794;
															}
														} else {
															class139.method3101(0); // L: 526
															Login.Login_username = ""; // L: 527
															Login.Login_password = ""; // L: 528
															class347.field4201 = 0; // L: 529
															class28.otp = ""; // L: 530
															Login.field916 = true; // L: 531
														}
													}

													return; // L: 1016
												}
											} while(Login.currentLoginField != 1); // L: 545

											if (class142.field1665 == 85 && Login.Login_password.length() > 0) { // L: 546
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 547
											} else if (class142.field1665 == 84 || class142.field1665 == 80) { // L: 549
												Login.currentLoginField = 0; // L: 550
												if (class142.field1665 == 84) { // L: 551
													Login.Login_username = Login.Login_username.trim(); // L: 552
													if (Login.Login_username.length() == 0) { // L: 553
														SecureRandomCallable.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 554
														return; // L: 555
													}

													if (Login.Login_password.length() == 0) { // L: 557
														SecureRandomCallable.setLoginResponseString("", "Please enter your password.", ""); // L: 558
														return; // L: 559
													}

													SecureRandomCallable.setLoginResponseString("", "Connecting to server...", ""); // L: 561
													PacketWriter.method2673(false); // L: 562
													Coord.updateGameState(20); // L: 563
													return; // L: 564
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class142.field1665 == 67) { // L: 567
												Clipboard var51 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 568
												var52 = var51.getContents(IgnoreList.client); // L: 569
												var47 = 20 - Login.Login_password.length(); // L: 570
												break;
											}

											char var48 = class229.field2794; // L: 612
											if (var48 >= ' ' && var48 < 127 || var48 > 127 && var48 < 160 || var48 > 160 && var48 <= 255) { // L: 614
												var45 = true; // L: 615
											} else {
												label1491: {
													if (var48 != 0) { // L: 618
														char[] var53 = class342.cp1252AsciiExtension; // L: 620

														for (int var54 = 0; var54 < var53.length; ++var54) { // L: 621
															char var15 = var53[var54]; // L: 622
															if (var15 == var48) { // L: 624
																var45 = true; // L: 625
																break label1491; // L: 626
															}
														}
													}

													var45 = false; // L: 632
												}
											}

											if (var45 && class118.method2893(class229.field2794) && Login.Login_password.length() < 20) { // L: 634
												Login.Login_password = Login.Login_password + class229.field2794; // L: 635
											}
										}
									} while(var47 <= 0); // L: 571

									try {
										String var14 = (String)var52.getTransferData(DataFlavor.stringFlavor); // L: 573
										int var49 = Math.min(var47, var14.length()); // L: 574

										for (int var16 = 0; var16 < var49; ++var16) { // L: 575
											char var18 = var14.charAt(var16); // L: 577
											boolean var17;
											if ((var18 < ' ' || var18 >= 127) && (var18 <= 127 || var18 >= 160) && (var18 <= 160 || var18 > 255)) { // L: 579
												label1478: {
													if (var18 != 0) { // L: 583
														char[] var19 = class342.cp1252AsciiExtension; // L: 585

														for (int var20 = 0; var20 < var19.length; ++var20) { // L: 586
															char var21 = var19[var20]; // L: 587
															if (var21 == var18) { // L: 589
																var17 = true; // L: 590
																break label1478; // L: 591
															}
														}
													}

													var17 = false; // L: 597
												}
											} else {
												var17 = true; // L: 580
											}

											if (!var17 || !class118.method2893(var14.charAt(var16))) { // L: 599
												class139.method3101(3); // L: 600
												return; // L: 601
											}
										}

										Login.Login_password = Login.Login_password + var14.substring(0, var49); // L: 604
									} catch (UnsupportedFlavorException var35) { // L: 606
									} catch (IOException var36) { // L: 607
									}
								}
							} else if (Login.loginIndex == 3) { // L: 642
								var40 = Login.loginBoxX + 180; // L: 643
								var9 = 276; // L: 644
								if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 645
									ObjectSound.method1848(false); // L: 646
								}

								var40 = Login.loginBoxX + 180; // L: 648
								var9 = 326; // L: 649
								if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 650
									SecureRandomCallable.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 651
									class139.method3101(5); // L: 652
									return; // L: 653
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) { // L: 656
									var40 = Login.loginBoxX + 180 - 80; // L: 657
									var9 = 321; // L: 658
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 659
										class28.otp.trim(); // L: 660
										if (class28.otp.length() != 6) { // L: 661
											SecureRandomCallable.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 662
											return; // L: 663
										}

										class347.field4201 = Integer.parseInt(class28.otp); // L: 665
										class28.otp = ""; // L: 666
										PacketWriter.method2673(true); // L: 667
										SecureRandomCallable.setLoginResponseString("", "Connecting to server...", ""); // L: 668
										Coord.updateGameState(20); // L: 669
										return; // L: 670
									}

									if (var24 == 1 && var38 >= Login.loginBoxX + 180 - 9 && var38 <= Login.loginBoxX + 180 + 130 && var39 >= 263 && var39 <= 296) { // L: 672
										Login.field916 = !Login.field916; // L: 673
									}

									if (var24 == 1 && var38 >= Login.loginBoxX + 180 - 34 && var38 <= Login.loginBoxX + 34 + 180 && var39 >= 351 && var39 <= 363) { // L: 675
										CollisionMap.openURL(SecureRandomCallable.method2205("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 676
									}

									var40 = Login.loginBoxX + 180 + 80; // L: 678
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 679
										class139.method3101(0); // L: 680
										Login.Login_username = ""; // L: 681
										Login.Login_password = ""; // L: 682
										class347.field4201 = 0; // L: 683
										class28.otp = ""; // L: 684
									}

									while (class28.isKeyDown()) { // L: 686
										boolean var10 = false; // L: 687

										for (var11 = 0; var11 < "1234567890".length(); ++var11) { // L: 688
											if (class229.field2794 == "1234567890".charAt(var11)) { // L: 689
												var10 = true; // L: 690
												break; // L: 691
											}
										}

										if (class142.field1665 == 13) { // L: 694
											class139.method3101(0); // L: 695
											Login.Login_username = ""; // L: 696
											Login.Login_password = ""; // L: 697
											class347.field4201 = 0; // L: 698
											class28.otp = ""; // L: 699
										} else {
											if (class142.field1665 == 85 && class28.otp.length() > 0) { // L: 702
												class28.otp = class28.otp.substring(0, class28.otp.length() - 1);
											}

											if (class142.field1665 == 84) { // L: 703
												class28.otp.trim(); // L: 704
												if (class28.otp.length() != 6) { // L: 705
													SecureRandomCallable.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 706
													return; // L: 707
												}

												class347.field4201 = Integer.parseInt(class28.otp); // L: 709
												class28.otp = ""; // L: 710
												PacketWriter.method2673(true); // L: 711
												SecureRandomCallable.setLoginResponseString("", "Connecting to server...", ""); // L: 712
												Coord.updateGameState(20); // L: 713
												return; // L: 714
											}

											if (var10 && class28.otp.length() < 6) { // L: 716
												class28.otp = class28.otp + class229.field2794;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 720
									var40 = Login.loginBoxX + 180 - 80; // L: 721
									var9 = 321; // L: 722
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 723
										Login.Login_username = Login.Login_username.trim(); // L: 725
										if (Login.Login_username.length() == 0) { // L: 726
											SecureRandomCallable.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 727
										} else {
											long var29 = class33.method630(); // L: 731
											int var44;
											if (0L == var29) { // L: 732
												var44 = 5;
											} else {
												var44 = class13.method185(var29, Login.Login_username); // L: 733
											}

											switch(var44) { // L: 734
											case 2:
												SecureRandomCallable.setLoginResponseString(Strings.field3934, Strings.field3855, Strings.field3883); // L: 742
												class139.method3101(6); // L: 743
												break; // L: 744
											case 3:
												SecureRandomCallable.setLoginResponseString("", "Error connecting to server.", ""); // L: 749
												break; // L: 750
											case 4:
												SecureRandomCallable.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 739
												break; // L: 740
											case 5:
												SecureRandomCallable.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 752
												break;
											case 6:
												SecureRandomCallable.setLoginResponseString("", "Error connecting to server.", ""); // L: 746
												break; // L: 747
											case 7:
												SecureRandomCallable.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 736
											}
										}

										return; // L: 756
									}

									var40 = Login.loginBoxX + 180 + 80; // L: 758
									if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 759
										Calendar.Login_promptCredentials(true); // L: 760
									}

									var43 = 361; // L: 762
									if (Projectile.field957 != null) { // L: 763
										var11 = Projectile.field957.highX / 2; // L: 764
										if (var24 == 1 && var38 >= Projectile.field957.lowX - var11 && var38 <= var11 + Projectile.field957.lowX && var39 >= var43 - 15 && var39 < var43) { // L: 765
											CollisionMap.openURL(SecureRandomCallable.method2205("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 766
										}
									}

									while (class28.isKeyDown()) { // L: 769
										var45 = false; // L: 770

										for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var12) { // L: 771
											if (class229.field2794 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12)) { // L: 772
												var45 = true; // L: 773
												break; // L: 774
											}
										}

										if (class142.field1665 == 13) { // L: 777
											Calendar.Login_promptCredentials(true); // L: 778
										} else {
											if (class142.field1665 == 85 && Login.Login_username.length() > 0) { // L: 781
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class142.field1665 == 84) { // L: 782
												Login.Login_username = Login.Login_username.trim(); // L: 784
												if (Login.Login_username.length() == 0) { // L: 785
													SecureRandomCallable.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 786
												} else {
													long var31 = class33.method630(); // L: 790
													if (0L == var31) { // L: 791
														var12 = 5;
													} else {
														var12 = class13.method185(var31, Login.Login_username); // L: 792
													}

													switch(var12) { // L: 793
													case 2:
														SecureRandomCallable.setLoginResponseString(Strings.field3934, Strings.field3855, Strings.field3883); // L: 801
														class139.method3101(6); // L: 802
														break; // L: 803
													case 3:
														SecureRandomCallable.setLoginResponseString("", "Error connecting to server.", ""); // L: 798
														break; // L: 799
													case 4:
														SecureRandomCallable.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 808
														break; // L: 809
													case 5:
														SecureRandomCallable.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 811
														break;
													case 6:
														SecureRandomCallable.setLoginResponseString("", "Error connecting to server.", ""); // L: 805
														break; // L: 806
													case 7:
														SecureRandomCallable.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 795
													}
												}

												return; // L: 815
											}

											if (var45 && Login.Login_username.length() < 320) { // L: 817
												Login.Login_username = Login.Login_username + class229.field2794;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 821
									if (Login.loginIndex == 7) { // L: 832
										if (UserComparator9.field1387 && !Client.onMobile) { // L: 833
											var40 = ModeWhere.loginBoxCenter - 150; // L: 834
											var42 = var40 + 40 + 240 + 25; // L: 835
											var43 = 231; // L: 836
											var11 = var43 + 40; // L: 837
											if (var24 == 1 && var38 >= var40 && var38 <= var42 && var39 >= var43 && var39 <= var11) { // L: 838
												Login.field891 = ItemContainer.method2230(var40, var38); // L: 839
											}

											var12 = Login.loginBoxX + 180 - 80; // L: 841
											short var13 = 321; // L: 842
											boolean var28;
											if (var24 == 1 && var38 >= var12 - 75 && var38 <= var12 + 75 && var39 >= var13 - 20 && var39 <= var13 + 20) { // L: 843
												var28 = Skeleton.method4257(); // L: 844
												if (var28) { // L: 845
													Coord.updateGameState(50); // L: 846
													return; // L: 847
												}
											}

											var12 = Login.loginBoxX + 180 + 80; // L: 850
											if (var24 == 1 && var38 >= var12 - 75 && var38 <= var12 + 75 && var39 >= var13 - 20 && var39 <= var13 + 20) { // L: 851
												Login.field907 = new String[8]; // L: 852
												Calendar.Login_promptCredentials(true); // L: 853
											}

											while (class28.isKeyDown()) { // L: 855
												if (class142.field1665 == 101) { // L: 856
													Login.field907[Login.field891] = null; // L: 857
												}

												if (class142.field1665 == 85) { // L: 859
													if (Login.field907[Login.field891] == null && Login.field891 > 0) { // L: 860
														--Login.field891; // L: 861
													}

													Login.field907[Login.field891] = null; // L: 863
												}

												if (class229.field2794 >= '0' && class229.field2794 <= '9') { // L: 865
													Login.field907[Login.field891] = "" + class229.field2794; // L: 866
													if (Login.field891 < 7) { // L: 867
														++Login.field891; // L: 868
													}
												}

												if (class142.field1665 == 84) { // L: 871
													var28 = Skeleton.method4257(); // L: 872
													if (var28) { // L: 873
														Coord.updateGameState(50); // L: 874
													}

													return; // L: 876
												}
											}
										} else {
											var40 = Login.loginBoxX + 180 - 80; // L: 881
											var9 = 321; // L: 882
											if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 883
												CollisionMap.openURL(SecureRandomCallable.method2205("secure", true) + "m=dob/set_dob.ws", true, false); // L: 884
												SecureRandomCallable.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 885
												class139.method3101(6); // L: 886
												return; // L: 887
											}

											var40 = Login.loginBoxX + 180 + 80; // L: 889
											if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 890
												Calendar.Login_promptCredentials(true); // L: 891
											}
										}
									} else if (Login.loginIndex == 8) { // L: 895
										var40 = Login.loginBoxX + 180 - 80; // L: 896
										var9 = 321; // L: 897
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 898
											CollisionMap.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 899
											SecureRandomCallable.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 900
											class139.method3101(6); // L: 901
											return; // L: 902
										}

										var40 = Login.loginBoxX + 180 + 80; // L: 904
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 905
											Calendar.Login_promptCredentials(true); // L: 906
										}
									} else if (Login.loginIndex == 9) { // L: 909
										var40 = Login.loginBoxX + 180; // L: 910
										var9 = 311; // L: 911
										if (class142.field1665 == 84 || class142.field1665 == 13 || var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 912
											ObjectSound.method1848(false); // L: 913
										}
									} else if (Login.loginIndex == 10) { // L: 916
										var40 = Login.loginBoxX + 180; // L: 917
										var9 = 209; // L: 918
										if (class142.field1665 == 84 || var24 == 1 && var38 >= var40 - 109 && var38 <= var40 + 109 && var39 >= var9 && var39 <= var9 + 68) { // L: 919
											SecureRandomCallable.setLoginResponseString("", "Connecting to server...", ""); // L: 920
											Client.field639 = class448.field4785; // L: 921
											PacketWriter.method2673(false); // L: 922
											Coord.updateGameState(20); // L: 923
										}
									} else if (Login.loginIndex == 12) { // L: 926
										var40 = ModeWhere.loginBoxCenter; // L: 927
										var9 = 233; // L: 928
										Bounds var33 = var1.method6558(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var40, var9); // L: 929
										Bounds var25 = var1.method6558(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var40, var9); // L: 930
										Bounds var26 = var1.method6558(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var40, var9); // L: 931
										var42 = var9 + 17; // L: 932
										Bounds var27 = var1.method6558(0, 34, "<col=ffd200>agreement (EULA)</col>.", var40, var42); // L: 933
										if (var24 == 1) { // L: 934
											if (var33.method7113(var38, var39)) { // L: 935
												CollisionMap.openURL("https://www.jagex.com/terms", true, false); // L: 936
											} else if (var25.method7113(var38, var39)) { // L: 938
												CollisionMap.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 939
											} else if (var26.method7113(var38, var39) || var27.method7113(var38, var39)) { // L: 941
												CollisionMap.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 942
											}
										}

										var40 = ModeWhere.loginBoxCenter - 80; // L: 945
										var9 = 311; // L: 946
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 947
											Player.clientPreferences.method2408(Client.field497); // L: 949
											ObjectSound.method1848(true); // L: 951
										}

										var40 = ModeWhere.loginBoxCenter + 80; // L: 953
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 954
											Login.loginIndex = 13; // L: 955
										}
									} else if (Login.loginIndex == 13) { // L: 958
										var40 = ModeWhere.loginBoxCenter; // L: 959
										var9 = 321; // L: 960
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 961
											ObjectSound.method1848(true); // L: 962
										}
									} else if (Login.loginIndex == 14) { // L: 965
										String var34 = ""; // L: 966
										switch(Login.Login_banType) { // L: 967
										case 0:
											var34 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 969
											break; // L: 970
										case 1:
											var34 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 972
											break; // L: 973
										case 2:
											var34 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 975
											break; // L: 976
										default:
											Calendar.Login_promptCredentials(false); // L: 978
										}

										var42 = Login.loginBoxX + 180; // L: 981
										var43 = 276; // L: 982
										if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20) { // L: 983
											CollisionMap.openURL(var34, true, false); // L: 984
											SecureRandomCallable.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 985
											class139.method3101(6); // L: 986
											return; // L: 987
										}

										var42 = Login.loginBoxX + 180; // L: 989
										var43 = 326; // L: 990
										if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var43 - 20 && var39 <= var43 + 20) { // L: 991
											Calendar.Login_promptCredentials(false); // L: 992
										}
									} else if (Login.loginIndex == 24) { // L: 995
										var40 = Login.loginBoxX + 180; // L: 996
										var9 = 301; // L: 997
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 998
											ObjectSound.method1848(false); // L: 999
										}
									} else if (Login.loginIndex == 26) { // L: 1002
										var40 = Login.loginBoxX + 180 - 80; // L: 1003
										var9 = 321; // L: 1004
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 1005
											CollisionMap.openURL(SecureRandomCallable.method2205("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1006
											SecureRandomCallable.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1007
											class139.method3101(6); // L: 1008
											return; // L: 1009
										}

										var40 = Login.loginBoxX + 180 + 80; // L: 1011
										if (var24 == 1 && var38 >= var40 - 75 && var38 <= var40 + 75 && var39 >= var9 - 20 && var39 <= var9 + 20) { // L: 1012
											Calendar.Login_promptCredentials(true); // L: 1013
										}
									}
								} else {
									while (true) {
										do {
											if (!class28.isKeyDown()) { // L: 822
												var41 = 321; // L: 827
												if (var24 == 1 && var39 >= var41 - 20 && var39 <= var41 + 20) { // L: 828
													Calendar.Login_promptCredentials(true); // L: 829
												}

												return;
											}
										} while(class142.field1665 != 84 && class142.field1665 != 13); // L: 823

										Calendar.Login_promptCredentials(true); // L: 824
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 306

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	static final void method6699() {
		Client.field701 = Client.cycleCntr; // L: 11942
		class142.ClanChat_inClanChat = true; // L: 11943
	} // L: 11944
}
