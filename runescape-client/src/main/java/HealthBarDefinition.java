import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field1884;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 572364811
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = -2022348301
	)
	static int field1890;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -178333295
	)
	public int field1887;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1866394181
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 416175397
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1684325795
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 164541499
	)
	public int field1885;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -784941667
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1134799675
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1718105153
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 30986119
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1305122669
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1885 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-468113938"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "2046176426"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "1785378248"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(field1884, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "-1259762005"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(field1884, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lby;Lpv;Lpv;B)V",
		garbageValue = "-63"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var40;
		int var41;
		boolean var51;
		if (Login.worldSelectOpen) {
			class226 var39 = SoundSystem.method879();

			while (true) {
				if (!var39.method4424()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (SoundCache.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
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

					var40 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(2, 1);
						break;
					}

					var41 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class153.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						Buddy.leftTitleSprite.drawAt(Login.xPadding, 0);
						SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var42 = World.World_worlds[Login.hoveredWorldIndex];
						if (var42.isDeadman()) {
							var42.field821 = "beta";
						}

						var51 = false;
						if (var42.properties != Client.worldProperties) {
							boolean var52 = (Client.worldProperties & class526.field5160.rsOrdinal()) != 0;
							var11 = var42.isDeadman();
							if (var52 && !var11 || !var52 && var11) {
								var51 = true;
							}
						}

						class465.changeWorld(var42);
						Login.worldSelectOpen = false;
						Buddy.leftTitleSprite.drawAt(Login.xPadding, 0);
						SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18);
						if (var51) {
							class281.reinitializeClient();
						}
					} else {
						if (Login.worldSelectPage > 0 && class174.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class174.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Login.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class524.canvasWidth - Login.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class524.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var39.field2393 == 13) {
					Login.worldSelectOpen = false;
					Buddy.leftTitleSprite.drawAt(Login.xPadding, 0);
					SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var39.field2393 == 96) {
					if (Login.worldSelectPage > 0 && class174.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var39.field2393 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Login.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class93.clientPreferences.updateTitleMusicDisabled(!class93.clientPreferences.isTitleMusicDisabled());
				if (!class93.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(WorldMapSection0.archive6, "scape main", "", 255, false));
					LoginScreenAnimation.method2528(var3, 0, 0, 0, 100, false);
				} else {
					Actor.method2488(0, 0);
				}

				FontName.method9049();
			}

			if (Client.gameState != 5) {
				if (Login.field939 == -1L) {
					Login.field939 = UserComparator9.method2973() + 1000L;
				}

				long var23 = UserComparator9.method2973();
				if (HttpRequest.method99() && -1L == Login.field940) {
					Login.field940 = var23;
					if (Login.field940 > Login.field939) {
						Login.field939 = Login.field940;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class92.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var25 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var25) {
								ItemContainer.method2350();
								return;
							}
						}

						if (class101.World_request != null) {
							ItemContainer.method2350();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var40 = MouseHandler.MouseHandler_lastPressedX;
					var41 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var40 = MouseHandler.MouseHandler_x;
						var41 = MouseHandler.MouseHandler_y;
					}

					if (!SoundCache.mouseCam && var5 == 4) {
						var5 = 1;
					}

					class226 var8 = SoundSystem.method879();
					short var44;
					int var45;
					if (Login.loginIndex == 0) {
						var51 = false;

						while (var8.method4424()) {
							if (var8.field2393 == 84) {
								var51 = true;
							}
						}

						var45 = class433.loginBoxCenter - 80;
						var44 = 291;
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
							class217.openURL(MouseRecorder.method2371("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var45 = class433.loginBoxCenter + 80;
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20 || var51) {
							if ((Client.worldProperties & class526.field5151.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Actor.method2489(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & class526.field5136.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class526.field5135.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Actor.method2489(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & class526.field5135.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Actor.method2489(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var8.method4424()) {
									var9 = class433.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
									}

									var9 = class433.loginBoxCenter + 80;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										Actor.method2489(0);
									}
									break;
								}

								if (var8.field2393 == 84) {
									GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
								} else if (var8.field2393 == 13) {
									Actor.method2489(0);
								}
							}
						} else {
							boolean var18;
							short var43;
							boolean var46;
							if (Login.loginIndex == 2) {
								var43 = 201;
								var9 = var43 + 52;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var43 = 361;
								if (WorldMapSection0.field2593 != null) {
									var45 = WorldMapSection0.field2593.highX / 2;
									if (var5 == 1 && var40 >= WorldMapSection0.field2593.lowX - var45 && var40 <= var45 + WorldMapSection0.field2593.lowX && var41 >= var43 - 15 && var41 < var43) {
										switch(Login.field916) {
										case 1:
											class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class217.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var45 = class433.loginBoxCenter - 80;
								var44 = 321;
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class142.setLoginResponseString("", "Please enter your username/email address.", "");
									} else if (Login.Login_password.length() == 0) {
										class142.setLoginResponseString("", "Please enter your password.", "");
									} else {
										class142.setLoginResponseString("", "Connecting to server...", "");
										ParamComposition.setAuthenticationScheme(false);
										class131.updateGameState(20);
									}

									return;
								}

								var45 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
									Actor.method2489(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class130.otpMedium = 0;
									class148.otp = "";
									Login.rememberUsername = true;
								}

								var45 = class433.loginBoxCenter + -117;
								var44 = 277;
								Login.field928 = var40 >= var45 && var40 < var45 + class31.field168 && var41 >= var44 && var41 < var44 + Skills.field3911;
								if (var5 == 1 && Login.field928) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class93.clientPreferences.getRememberedUsername() != null) {
										class93.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var45 = class433.loginBoxCenter + 24;
								var44 = 277;
								Login.field929 = var40 >= var45 && var40 < var45 + class31.field168 && var41 >= var44 && var41 < var44 + Skills.field3911;
								if (var5 == 1 && Login.field929) {
									class93.clientPreferences.updateHideUsername(!class93.clientPreferences.isUsernameHidden());
									if (!class93.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class93.clientPreferences.updateRememberedUsername((String)null);
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}
								}

								label1650:
								while (true) {
									int var48;
									Transferable var55;
									do {
										while (true) {
											char var47;
											label1566:
											do {
												while (true) {
													while (var8.method4424()) {
														if (var8.field2393 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1566;
															}

															MusicSong.method6302(var8.field2402);
															if (var8.field2393 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2393 == 84 || var8.field2393 == 80) {
																Login.currentLoginField = 1;
															}

															var47 = var8.field2402;
															var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var47) != -1;
															if (var46 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var8.field2402;
															}
														} else {
															Actor.method2489(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class130.otpMedium = 0;
															class148.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var8.field2393 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var8.field2393 == 84 || var8.field2393 == 80) {
												Login.currentLoginField = 0;
												if (var8.field2393 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class142.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class142.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class142.setLoginResponseString("", "Connecting to server...", "");
													ParamComposition.setAuthenticationScheme(false);
													class131.updateGameState(20);
													return;
												}
											}

											if ((var8.method4426(82) || var8.method4426(87)) && var8.field2393 == 67) {
												Clipboard var54 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var55 = var54.getContents(VertexNormal.client);
												var48 = 20 - Login.Login_password.length();
												break;
											}

											var47 = var8.field2402;
											if ((var47 < ' ' || var47 >= 127) && (var47 <= 127 || var47 >= 160) && (var47 <= 160 || var47 > 255)) {
												label1800: {
													if (var47 != 0) {
														char[] var56 = class400.cp1252AsciiExtension;

														for (int var57 = 0; var57 < var56.length; ++var57) {
															char var16 = var56[var57];
															if (var16 == var47) {
																var46 = true;
																break label1800;
															}
														}
													}

													var46 = false;
												}
											} else {
												var46 = true;
											}

											if (var46 && MouseHandler.method706(var8.field2402) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var8.field2402;
											}
										}
									} while(var48 <= 0);

									try {
										String var15 = (String)var55.getTransferData(DataFlavor.stringFlavor);
										int var49 = Math.min(var48, var15.length());
										int var50 = 0;

										while (true) {
											if (var50 >= var49) {
												Login.Login_password = Login.Login_password + var15.substring(0, var49);
												continue label1650;
											}

											char var19 = var15.charAt(var50);
											if (var19 >= ' ' && var19 < 127 || var19 > 127 && var19 < 160 || var19 > 160 && var19 <= 255) {
												var18 = true;
											} else {
												label1815: {
													if (var19 != 0) {
														char[] var20 = class400.cp1252AsciiExtension;

														for (int var21 = 0; var21 < var20.length; ++var21) {
															char var22 = var20[var21];
															if (var19 == var22) {
																var18 = true;
																break label1815;
															}
														}
													}

													var18 = false;
												}
											}

											if (!var18) {
												break;
											}

											char var53 = var15.charAt(var50);
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var53) != -1;
											if (!var28) {
												break;
											}

											++var50;
										}

										Actor.method2489(3);
										return;
									} catch (UnsupportedFlavorException var37) {
									} catch (IOException var38) {
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var31 = var1.method7761(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var31.method8481(var40, var41)) {
										class217.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class408.method7592(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class148.otp.trim();
											if (class148.otp.length() != 6) {
												class142.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												return;
											}

											class130.otpMedium = Integer.parseInt(class148.otp);
											class148.otp = "";
											ParamComposition.setAuthenticationScheme(true);
											class142.setLoginResponseString("", "Connecting to server...", "");
											class131.updateGameState(20);
											return;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) {
											class217.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											Actor.method2489(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class130.otpMedium = 0;
											class148.otp = "";
										}

										while (var8.method4424()) {
											var11 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var8.field2402 == "1234567890".charAt(var12)) {
													var11 = true;
													break;
												}
											}

											if (var8.field2393 == 13) {
												Actor.method2489(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class130.otpMedium = 0;
												class148.otp = "";
											} else {
												if (var8.field2393 == 85 && class148.otp.length() > 0) {
													class148.otp = class148.otp.substring(0, class148.otp.length() - 1);
												}

												if (var8.field2393 == 84) {
													class148.otp.trim();
													if (class148.otp.length() != 6) {
														class142.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
														return;
													}

													class130.otpMedium = Integer.parseInt(class148.otp);
													class148.otp = "";
													ParamComposition.setAuthenticationScheme(true);
													class142.setLoginResponseString("", "Connecting to server...", "");
													class131.updateGameState(20);
													return;
												}

												if (var11 && class148.otp.length() < 6) {
													class148.otp = class148.otp + var8.field2402;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												MusicPatchNode2.method6037();
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
											}

											var44 = 361;
											if (class126.field1486 != null) {
												var12 = class126.field1486.highX / 2;
												if (var5 == 1 && var40 >= class126.field1486.lowX - var12 && var40 <= var12 + class126.field1486.lowX && var41 >= var44 - 15 && var41 < var44) {
													class217.openURL(MouseRecorder.method2371("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var8.method4424()) {
												var46 = false;

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
													if (var8.field2402 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
														var46 = true;
														break;
													}
												}

												if (var8.field2393 == 13) {
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
												} else {
													if (var8.field2393 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2393 == 84) {
														MusicPatchNode2.method6037();
														return;
													}

													if (var46 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var8.field2402;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (class373.field4355 && !Client.onMobile) {
													var9 = class433.loginBoxCenter - 150;
													var45 = var9 + 40 + 240 + 25;
													var44 = 231;
													var12 = var44 + 40;
													if (var5 == 1 && var40 >= var9 && var40 <= var45 && var41 >= var44 && var41 <= var12) {
														Login.field924 = UrlRequester.method2902(var9, var40);
													}

													var13 = Login.loginBoxX + 180 - 80;
													short var14 = 321;
													boolean var17;
													boolean var30;
													Date var32;
													if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var14 - 20 && var41 <= var14 + 20) {
														label1450: {
															try {
																var32 = NPCComposition.method3743();
															} catch (ParseException var36) {
																ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var30 = false;
																break label1450;
															}

															if (var32 == null) {
																var30 = false;
															} else {
																var17 = class314.method6005(var32);
																var18 = class151.method3312(var32);
																if (!var18) {
																	ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var30 = false;
																} else {
																	if (!var17) {
																		class105.field1340 = 8388607;
																	} else {
																		class105.field1340 = (int)(var32.getTime() / 86400000L - 11745L);
																	}

																	var30 = true;
																}
															}
														}

														if (var30) {
															class131.updateGameState(50);
															return;
														}
													}

													var13 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var14 - 20 && var41 <= var14 + 20) {
														Login.field934 = new String[8];
														GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
													}

													while (var8.method4424()) {
														if (var8.field2393 == 101) {
															Login.field934[Login.field924] = null;
														}

														if (var8.field2393 == 85) {
															if (Login.field934[Login.field924] == null && Login.field924 > 0) {
																--Login.field924;
															}

															Login.field934[Login.field924] = null;
														}

														if (var8.field2402 >= '0' && var8.field2402 <= '9') {
															Login.field934[Login.field924] = "" + var8.field2402;
															if (Login.field924 < 7) {
																++Login.field924;
															}
														}

														if (var8.field2393 == 84) {
															label1386: {
																try {
																	var32 = NPCComposition.method3743();
																} catch (ParseException var35) {
																	ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var30 = false;
																	break label1386;
																}

																if (var32 == null) {
																	var30 = false;
																} else {
																	var17 = class314.method6005(var32);
																	var18 = class151.method3312(var32);
																	if (!var18) {
																		ScriptEvent.method2361("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var30 = false;
																	} else {
																		if (!var17) {
																			class105.field1340 = 8388607;
																		} else {
																			class105.field1340 = (int)(var32.getTime() / 86400000L - 11745L);
																		}

																		var30 = true;
																	}
																}
															}

															if (var30) {
																class131.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80;
													var10 = 321;
													if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
														class217.openURL(MouseRecorder.method2371("secure", true) + "m=dob/set_dob.ws", true, false);
														class142.setLoginResponseString("", "Page has opened in the browser.", "");
														Actor.method2489(6);
														return;
													}

													var9 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
														GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class217.openURL("https://www.jagex.com/terms/privacy", true, false);
													class142.setLoginResponseString("", "Page has opened in the browser.", "");
													Actor.method2489(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var9 = Login.loginBoxX + 180;
												var10 = 311;
												if (var8.field2393 == 84 || var8.field2393 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class408.method7592(false);
												}
											} else if (Login.loginIndex == 10) {
												var9 = Login.loginBoxX + 180;
												var10 = 209;
												if (var8.field2393 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) {
													class142.setLoginResponseString("", "Connecting to server...", "");
													Client.field626 = class535.field5233;
													ParamComposition.setAuthenticationScheme(false);
													class131.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var9 = class433.loginBoxCenter;
												var10 = 233;
												var31 = var2.method7761(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var26 = var2.method7761(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var27 = var2.method7761(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												var45 = var10 + 17;
												Bounds var29 = var2.method7761(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var45);
												if (var5 == 1) {
													if (var31.method8481(var40, var41)) {
														class217.openURL("https://www.jagex.com/terms", true, false);
													} else if (var26.method8481(var40, var41)) {
														class217.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var27.method8481(var40, var41) || var29.method8481(var40, var41)) {
														class217.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var9 = class433.loginBoxCenter - 80;
												var10 = 311;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													AbstractWorldMapData.method5016();
													class408.method7592(true);
												}

												var9 = class433.loginBoxCenter + 80;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var9 = class433.loginBoxCenter;
												var10 = 321;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class408.method7592(true);
												}
											} else if (Login.loginIndex == 14) {
												String var34 = "";
												switch(Login.Login_banType) {
												case 0:
													var34 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var34 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var34 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
												}

												var45 = Login.loginBoxX + 180;
												var44 = 276;
												if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
													class217.openURL(var34, true, false);
													class142.setLoginResponseString("", "Page has opened in the browser.", "");
													Actor.method2489(6);
													return;
												}

												var45 = Login.loginBoxX + 180;
												var44 = 326;
												if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var9 = Login.loginBoxX + 180;
												var10 = 301;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class408.method7592(false);
												}
											} else if (Login.loginIndex == 32) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class217.openURL(MouseRecorder.method2371("secure", true) + "m=dob/set_dob.ws", true, false);
													class142.setLoginResponseString("", "Page has opened in the browser.", "");
													Actor.method2489(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class217.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method4424()) {
														var43 = 321;
														if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) {
															GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
														}

														return;
													}
												} while(var8.field2393 != 84 && var8.field2393 != 13);

												GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(true);
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
