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

@ObfuscatedName("nk")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("az")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("ah")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("af")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length;
		this.masks = new int[var2];
		this.bits = var1;
		int[] var3 = new int[33];
		this.keys = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			byte var6 = var1[var5];
			if (var6 != 0) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.masks[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;

					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}

						var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (var10 = var6 + 1; var10 <= 32; ++var10) {
					if (var8 == var3[var10]) {
						var3[var10] = var9;
					}
				}

				var10 = 0;

				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (this.keys[var10] == 0) {
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10];
					} else {
						++var10;
					}

					if (var10 >= this.keys.length) {
						int[] var13 = new int[this.keys.length * 2];

						for (int var14 = 0; var14 < this.keys.length; ++var14) {
							var13[var14] = this.keys[var14];
						}

						this.keys = var13;
					}

					var12 >>>= 1;
				}

				this.keys[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII[BII)I",
		garbageValue = "-1453891319"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			int var13 = (var10 + var12 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = (byte)(var6 |= var9 >>> var12);
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I",
		garbageValue = "-1825869816"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 64) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 16) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 1) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				++var7;
			}

			return var7 + 1 - var2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "-1274553546"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4347, PlayerType.field4346, PlayerType.field4341, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4339, PlayerType.field4342, PlayerType.field4345, PlayerType.field4348, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.field4344, PlayerType.field4350, PlayerType.field4352, PlayerType.field4343, PlayerType.PlayerType_playerModerator};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbx;Lpx;Lpx;I)V",
		garbageValue = "1403933499"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var10;
		int var37;
		boolean var41;
		if (Login.worldSelectOpen) {
			IndexCheck var35 = class522.method9126();

			while (true) {
				if (!var35.method4337()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class412.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var4 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(0, 1);
						break;
					}

					int var36 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var36 && MouseHandler.MouseHandler_lastPressedX <= var36 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var36 + 15 && MouseHandler.MouseHandler_lastPressedX <= var36 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(1, 1);
						break;
					}

					var6 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(2, 1);
						break;
					}

					var37 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var37 && MouseHandler.MouseHandler_lastPressedX <= var37 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var37 + 15 && MouseHandler.MouseHandler_lastPressedX <= var37 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						DynamicObject.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Varps.method6255();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var8 = World.World_worlds[Login.hoveredWorldIndex];
						var10 = Client.worldProperties;
						class530 var11 = class530.field5203;
						boolean var38 = (var10 & var11.rsOrdinal()) != 0;
						var41 = var8.isDeadman();
						ScriptFrame.field460 = var41;
						var8.field831 = var41 ? "beta" : var8.field831;
						class30.changeWorld(var8);
						Varps.method6255();
						if (var38 != var41) {
							class441.method7995();
						}
					} else {
						if (Login.worldSelectPage > 0 && UserComparator2.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= UserComparator2.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class342.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class342.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class148.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class148.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class342.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class342.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var35.field2440 == 13) {
					Varps.method6255();
					break;
				}

				if (var35.field2440 == 96) {
					if (Login.worldSelectPage > 0 && UserComparator2.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var35.field2440 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				NPC.clientPreferences.updateTitleMusicDisabled(!NPC.clientPreferences.isTitleMusicDisabled());
				if (!NPC.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(UserComparator6.archive6, "scape main", "", 255, false));
					Renderable.method4881(var3, 0, 0, 0, 100, false);
				} else {
					class11.method108(0, 0);
				}

				UserComparator5.method2897();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field959) {
					Login.field959 = VerticalAlignment.method3924() + 1000L;
				}

				long var21 = VerticalAlignment.method3924();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var23 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var23.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && -1L == Login.field960) {
					Login.field960 = var21;
					if (Login.field960 > Login.field959) {
						Login.field959 = Login.field960;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (GraphicsObject.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var6 = Login.xPadding + 5;
							short var7 = 463;
							byte var24 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var24 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var9 + var7) {
								class127.method2958();
								return;
							}
						}

						if (class529.World_request != null) {
							class127.method2958();
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton;
					var37 = MouseHandler.MouseHandler_lastPressedX;
					int var48 = MouseHandler.MouseHandler_lastPressedY;
					if (var6 == 0) {
						var37 = MouseHandler.MouseHandler_x;
						var48 = MouseHandler.MouseHandler_y;
					}

					if (!class412.mouseCam && var6 == 4) {
						var6 = 1;
					}

					IndexCheck var25 = class522.method9126();
					short var40;
					int var50;
					if (Login.loginIndex == 0) {
						boolean var47 = false;

						while (var25.method4337()) {
							if (var25.field2440 == 84) {
								var47 = true;
							}
						}

						var50 = ReflectionCheck.loginBoxCenter - 80;
						var40 = 291;
						if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) {
							class129.openURL(WorldMapData_0.method5235("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var50 = ReflectionCheck.loginBoxCenter + 80;
						if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20 || var47) {
							IndexCheck.method4350();
						}
					} else {
						short var26;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var25.method4337()) {
									var10 = ReflectionCheck.loginBoxCenter - 80;
									var26 = 321;
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
										class130.Login_promptCredentials(false);
									}

									var10 = ReflectionCheck.loginBoxCenter + 80;
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
										class210.method3930(0);
									}
									break;
								}

								if (var25.field2440 == 84) {
									class130.Login_promptCredentials(false);
								} else if (var25.field2440 == 13) {
									class210.method3930(0);
								}
							}
						} else {
							int var14;
							int var15;
							short var39;
							if (Login.loginIndex == 2) {
								var39 = 201;
								var10 = var39 + 52;
								if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) {
									Login.currentLoginField = 0;
								}

								var10 += 15;
								if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) {
									Login.currentLoginField = 1;
								}

								var10 += 15;
								var39 = 361;
								if (Players.field1381 != null) {
									var50 = Players.field1381.highX / 2;
									if (var6 == 1 && var37 >= Players.field1381.lowX - var50 && var37 <= var50 + Players.field1381.lowX && var48 >= var39 - 15 && var48 < var39) {
										switch(Login.field938) {
										case 1:
											class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class129.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var50 = ReflectionCheck.loginBoxCenter - 80;
								var40 = 321;
								if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class59.setLoginResponseString("", "Please enter your username/email address.", "");
									} else if (Login.Login_password.length() == 0) {
										class59.setLoginResponseString("", "Please enter your password.", "");
									} else {
										class59.setLoginResponseString("", "Connecting to server...", "");
										class27.setAuthenticationScheme(false);
										FaceNormal.updateGameState(20);
									}

									return;
								}

								var50 = Login.loginBoxX + 180 + 80;
								if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) {
									class210.method3930(0);
									Login.Login_username = "";
									Login.Login_password = "";
									SpriteMask.otpMedium = 0;
									class27.otp = "";
									Login.rememberUsername = true;
								}

								var50 = ReflectionCheck.loginBoxCenter + -117;
								var40 = 277;
								Login.field949 = var37 >= var50 && var37 < var50 + MouseHandler.field228 && var48 >= var40 && var48 < var40 + class227.field2427;
								if (var6 == 1 && Login.field949) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && NPC.clientPreferences.getRememberedUsername() != null) {
										NPC.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var50 = ReflectionCheck.loginBoxCenter + 24;
								var40 = 277;
								Login.field950 = var37 >= var50 && var37 < var50 + MouseHandler.field228 && var48 >= var40 && var48 < var40 + class227.field2427;
								if (var6 == 1 && Login.field950) {
									NPC.clientPreferences.updateHideUsername(!NPC.clientPreferences.isUsernameHidden());
									if (!NPC.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										NPC.clientPreferences.updateRememberedUsername((String)null);
										Friend.method8099();
									}
								}

								label1501:
								while (true) {
									Transferable var51;
									do {
										while (true) {
											label1465:
											do {
												while (true) {
													while (var25.method4337()) {
														if (var25.field2440 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1465;
															}

															char var42 = var25.field2428;

															for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
															}

															if (var25.field2440 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var25.field2440 == 84 || var25.field2440 == 80) {
																Login.currentLoginField = 1;
															}

															char var44 = var25.field2428;
															boolean var45 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1;
															if (var45 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var25.field2428;
															}
														} else {
															class210.method3930(0);
															Login.Login_username = "";
															Login.Login_password = "";
															SpriteMask.otpMedium = 0;
															class27.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var25.field2440 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var25.field2440 == 84 || var25.field2440 == 80) {
												Login.currentLoginField = 0;
												if (var25.field2440 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class59.setLoginResponseString("", "Please enter your username/email address.", "");
													} else if (Login.Login_password.length() == 0) {
														class59.setLoginResponseString("", "Please enter your password.", "");
													} else {
														class59.setLoginResponseString("", "Connecting to server...", "");
														class27.setAuthenticationScheme(false);
														FaceNormal.updateGameState(20);
													}

													return;
												}
											}

											if ((var25.isValidIndexInRange(82) || var25.isValidIndexInRange(87)) && var25.field2440 == 67) {
												Clipboard var49 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var51 = var49.getContents(UrlRequest.client);
												var15 = 20 - Login.Login_password.length();
												break;
											}

											if (HealthBar.method2576(var25.field2428)) {
												char var46 = var25.field2428;
												var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1;
												if (var41 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var25.field2428;
												}
											}
										}
									} while(var15 <= 0);

									try {
										String var16 = (String)var51.getTransferData(DataFlavor.stringFlavor);
										int var17 = Math.min(var15, var16.length());
										int var18 = 0;

										while (true) {
											if (var18 >= var17) {
												Login.Login_password = Login.Login_password + var16.substring(0, var17);
												continue label1501;
											}

											if (!HealthBar.method2576(var16.charAt(var18))) {
												break;
											}

											char var20 = var16.charAt(var18);
											boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
											if (!var19) {
												break;
											}

											++var18;
										}

										class210.method3930(3);
										return;
									} catch (UnsupportedFlavorException var33) {
									} catch (IOException var34) {
									}
								}
							} else {
								Bounds var29;
								if (Login.loginIndex == 3) {
									var10 = Login.loginBoxX + 180;
									var26 = 241;
									var29 = var1.method7662(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var26);
									if (var6 == 1 && var29.method8344(var37, var48)) {
										class129.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var10 = Login.loginBoxX + 180;
									var26 = 276;
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
										class172.method3497(false);
									}

									var10 = Login.loginBoxX + 180;
									var26 = 326;
									if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
										class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) {
										var10 = Login.loginBoxX + 180 - 80;
										var26 = 321;
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
											class27.otp.trim();
											if (class27.otp.length() != 6) {
												class59.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											} else {
												SpriteMask.otpMedium = Integer.parseInt(class27.otp);
												class27.otp = "";
												class27.setAuthenticationScheme(true);
												class59.setLoginResponseString("", "Connecting to server...", "");
												FaceNormal.updateGameState(20);
											}

											return;
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var48 >= 263 && var48 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var48 >= 351 && var48 <= 363) {
											class129.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
											class210.method3930(0);
											Login.Login_username = "";
											Login.Login_password = "";
											SpriteMask.otpMedium = 0;
											class27.otp = "";
										}

										while (var25.method4337()) {
											boolean var12 = false;

											for (var13 = 0; var13 < "1234567890".length(); ++var13) {
												if (var25.field2428 == "1234567890".charAt(var13)) {
													var12 = true;
													break;
												}
											}

											if (var25.field2440 == 13) {
												class210.method3930(0);
												Login.Login_username = "";
												Login.Login_password = "";
												SpriteMask.otpMedium = 0;
												class27.otp = "";
											} else {
												if (var25.field2440 == 85 && class27.otp.length() > 0) {
													class27.otp = class27.otp.substring(0, class27.otp.length() - 1);
												}

												if (var25.field2440 == 84) {
													class27.otp.trim();
													if (class27.otp.length() != 6) {
														class59.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													} else {
														SpriteMask.otpMedium = Integer.parseInt(class27.otp);
														class27.otp = "";
														class27.setAuthenticationScheme(true);
														class59.setLoginResponseString("", "Connecting to server...", "");
														FaceNormal.updateGameState(20);
													}

													return;
												}

												if (var12 && class27.otp.length() < 6) {
													class27.otp = class27.otp + var25.field2428;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var10 = Login.loginBoxX + 180 - 80;
										var26 = 321;
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
											WorldMapIcon_0.method5610();
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
											class130.Login_promptCredentials(true);
										}

										var40 = 361;
										if (class136.field1626 != null) {
											var13 = class136.field1626.highX / 2;
											if (var6 == 1 && var37 >= class136.field1626.lowX - var13 && var37 <= var13 + class136.field1626.lowX && var48 >= var40 - 15 && var48 < var40) {
												class129.openURL(WorldMapData_0.method5235("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var25.method4337()) {
											var41 = false;

											for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
												if (var25.field2428 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
													var41 = true;
													break;
												}
											}

											if (var25.field2440 == 13) {
												class130.Login_promptCredentials(true);
											} else {
												if (var25.field2440 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var25.field2440 == 84) {
													WorldMapIcon_0.method5610();
													return;
												}

												if (var41 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var25.field2428;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (WorldMapRectangle.field3108 && !Client.onMobile) {
												var10 = ReflectionCheck.loginBoxCenter - 150;
												var50 = var10 + 40 + 240 + 25;
												var40 = 231;
												var13 = var40 + 40;
												if (var6 == 1 && var37 >= var10 && var37 <= var50 && var48 >= var40 && var48 <= var13) {
													var15 = var10;
													int var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var14 = 0;
															break;
														}

														if (var37 <= var15 + 30) {
															var14 = var30;
															break;
														}

														var15 += 30;
														var15 += var30 != 1 && var30 != 3 ? 5 : 20;
														++var30;
													}

													Login.field946 = var14;
												}

												var14 = Login.loginBoxX + 180 - 80;
												short var43 = 321;
												boolean var52;
												if (var6 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) {
													var52 = class130.method3011();
													if (var52) {
														FaceNormal.updateGameState(50);
														return;
													}
												}

												var14 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) {
													Login.field931 = new String[8];
													class130.Login_promptCredentials(true);
												}

												while (var25.method4337()) {
													if (var25.field2440 == 101) {
														Login.field931[Login.field946] = null;
													}

													if (var25.field2440 == 85) {
														if (Login.field931[Login.field946] == null && Login.field946 > 0) {
															--Login.field946;
														}

														Login.field931[Login.field946] = null;
													}

													if (var25.field2428 >= '0' && var25.field2428 <= '9') {
														Login.field931[Login.field946] = "" + var25.field2428;
														if (Login.field946 < 7) {
															++Login.field946;
														}
													}

													if (var25.field2440 == 84) {
														var52 = class130.method3011();
														if (var52) {
															FaceNormal.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80;
												var26 = 321;
												if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
													class129.openURL(WorldMapData_0.method5235("secure", true) + "m=dob/set_dob.ws", true, false);
													class59.setLoginResponseString("", "Page has opened in the browser.", "");
													class210.method3930(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
													class130.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var10 = Login.loginBoxX + 180 - 80;
											var26 = 321;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class129.openURL("https://www.jagex.com/terms/privacy", true, false);
												class59.setLoginResponseString("", "Page has opened in the browser.", "");
												class210.method3930(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class130.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var10 = Login.loginBoxX + 180;
											var26 = 311;
											if (var25.field2440 == 84 || var25.field2440 == 13 || var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class172.method3497(false);
											}
										} else if (Login.loginIndex == 10) {
											var10 = Login.loginBoxX + 180;
											var26 = 209;
											if (var25.field2440 == 84 || var6 == 1 && var37 >= var10 - 109 && var37 <= var10 + 109 && var48 >= var26 && var48 <= var26 + 68) {
												class59.setLoginResponseString("", "Connecting to server...", "");
												Client.field810 = class539.field5285;
												class27.setAuthenticationScheme(false);
												FaceNormal.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var10 = ReflectionCheck.loginBoxCenter;
											var26 = 233;
											var29 = var2.method7662(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26);
											Bounds var27 = var2.method7662(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26);
											Bounds var28 = var2.method7662(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var26);
											var50 = var26 + 17;
											Bounds var31 = var2.method7662(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var50);
											if (var6 == 1) {
												if (var29.method8344(var37, var48)) {
													class129.openURL("https://www.jagex.com/terms", true, false);
												} else if (var27.method8344(var37, var48)) {
													class129.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var28.method8344(var37, var48) || var31.method8344(var37, var48)) {
													class129.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = ReflectionCheck.loginBoxCenter - 80;
											var26 = 311;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												NPC.clientPreferences.method2478(Client.field513);
												class172.method3497(true);
											}

											var10 = ReflectionCheck.loginBoxCenter + 80;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var10 = ReflectionCheck.loginBoxCenter;
											var26 = 321;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class172.method3497(true);
											}
										} else if (Login.loginIndex == 14) {
											String var32 = "";
											switch(Login.Login_banType) {
											case 0:
												var32 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class130.Login_promptCredentials(false);
											}

											var50 = Login.loginBoxX + 180;
											var40 = 276;
											if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) {
												class129.openURL(var32, true, false);
												class59.setLoginResponseString("", "Page has opened in the browser.", "");
												class210.method3930(6);
												return;
											}

											var50 = Login.loginBoxX + 180;
											var40 = 326;
											if (var6 == 1 && var37 >= var50 - 75 && var37 <= var50 + 75 && var48 >= var40 - 20 && var48 <= var40 + 20) {
												class130.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var10 = Login.loginBoxX + 180;
											var26 = 301;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class172.method3497(false);
											}
										} else if (Login.loginIndex == 32) {
											var10 = Login.loginBoxX + 180 - 80;
											var26 = 321;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class129.openURL(WorldMapData_0.method5235("secure", true) + "m=dob/set_dob.ws", true, false);
												class59.setLoginResponseString("", "Page has opened in the browser.", "");
												class210.method3930(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class130.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var10 = Login.loginBoxX + 180;
											var26 = 276;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class129.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var10 = Login.loginBoxX + 180;
											var26 = 326;
											if (var6 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var48 >= var26 - 20 && var48 <= var26 + 20) {
												class130.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var25.method4337()) {
													var39 = 321;
													if (var6 == 1 && var48 >= var39 - 20 && var48 <= var39 + 20) {
														class130.Login_promptCredentials(true);
													}

													return;
												}
											} while(var25.field2440 != 84 && var25.field2440 != 13);

											class130.Login_promptCredentials(true);
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
