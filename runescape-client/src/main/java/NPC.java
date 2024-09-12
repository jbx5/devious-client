import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -800104513
	)
	static int field1389;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1884753935
	)
	static int field1388;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1676803291
	)
	int field1380;
	@ObfuscatedName("ag")
	String field1381;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -634357041
	)
	int field1390;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	class551 field1384;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1389 = 1;
		field1388 = 1;
	}

	NPC() {
		this.field1381 = "";
		this.field1390 = 31;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "371855163"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.field1380;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HealthBarUpdate.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : HealthBarUpdate.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = AddRequestTask.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2649(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1285 != 0 && Client.cycle >= super.field1284 && Client.cycle < super.field1258) {
					var3.overrideHue = super.field1259;
					var3.overrideSaturation = super.field1287;
					var3.overrideLuminance = super.field1288;
					var3.overrideAmount = super.field1285;
					var3.field2834 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1260258008"
	)
	void method2914(String var1) {
		this.field1381 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	void method2932(int var1) {
		this.field1390 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1447098857"
	)
	boolean method2875(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1390 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1498508647"
	)
	final String method2876() {
		if (!this.field1381.isEmpty()) {
			return this.field1381;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILkk;I)V",
		garbageValue = "1164691915"
	)
	final void method2877(int var1, MoveSpeed var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && HealthBarUpdate.SequenceDefinition_get(super.sequence).field2327 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2082581627"
	)
	final void method2872(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && HealthBarUpdate.SequenceDefinition_get(super.sequence).field2327 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = MoveSpeed.field3036;
				return;
			}
		}

		super.pathLength = 0;
		super.field1298 = 0;
		super.field1290 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1227 * 64 + super.pathX[0] * 128;
		super.y = super.field1227 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "84"
	)
	int[] method2946() {
		return this.field1384 != null ? this.field1384.method10174() : this.definition.method3973();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1652722274"
	)
	short[] method2882() {
		return this.field1384 != null ? this.field1384.method10181() : this.definition.method3975();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "70"
	)
	void method2883(int var1, int var2, short var3) {
		if (this.field1384 == null) {
			this.field1384 = new class551(this.definition);
		}

		this.field1384.method10176(var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "94"
	)
	void method2873(int[] var1, short[] var2) {
		if (this.field1384 == null) {
			this.field1384 = new class551(this.definition);
		}

		this.field1384.method10177(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1070811061"
	)
	void method2885() {
		this.field1384 = null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I)V",
		garbageValue = "-2044406295"
	)
	void method2938(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lhp;",
		garbageValue = "650025099"
	)
	NpcOverrides method2943() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I)V",
		garbageValue = "2102444819"
	)
	void method2888(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "960965429"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1014325098"
	)
	void method2889() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2022510148"
	)
	void method2890() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1338439449"
	)
	int vmethod2891() {
		return this.definition.field2049 == -1 ? super.defaultHeight : this.definition.field2049;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "844691753"
	)
	public static VarcInt method2922(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3849(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lba;Lqu;Lqu;I)V",
		garbageValue = "-2088389164"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var11;
		int var38;
		int var39;
		boolean var43;
		if (Login.worldSelectOpen) {
			IndexCheck var36 = Client.indexCheck;
			IndexCheck var4 = var36;

			while (true) {
				if (!var4.method5573()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (Varcs.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var37 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var37 && MouseHandler.MouseHandler_lastPressedX <= var37 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var37 + 15 && MouseHandler.MouseHandler_lastPressedX <= var37 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(0, 1);
						break;
					}

					var6 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(1, 1);
						break;
					}

					var38 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var38 && MouseHandler.MouseHandler_lastPressedX <= var38 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var38 + 15 && MouseHandler.MouseHandler_lastPressedX <= var38 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(2, 1);
						break;
					}

					var39 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var39 && MouseHandler.MouseHandler_lastPressedX <= var39 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var39 + 15 && MouseHandler.MouseHandler_lastPressedX <= var39 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class150.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						class331.leftTitleSprite.drawAt(Login.xPadding, 0);
						WorldMapCacheName.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						UserComparator8.logoSprite.drawAt(Login.xPadding + 382 - UserComparator8.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var40 = SoundSystem.World_worlds[Login.hoveredWorldIndex];
						var11 = Client.worldProperties;
						class545 var12 = class545.field5380;
						boolean var10 = (var11 & var12.rsOrdinal()) != 0;
						var43 = var40.isDeadman();
						class492.field5083 = var43;
						var40.field834 = var43 ? "beta" : var40.field834;
						class431.changeWorld(var40);
						Login.worldSelectOpen = false;
						class331.leftTitleSprite.drawAt(Login.xPadding, 0);
						WorldMapCacheName.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						UserComparator8.logoSprite.drawAt(Login.xPadding + 382 - UserComparator8.logoSprite.subWidth / 2, 18);
						if (var43 != var10) {
							class337.method6698();
						}
					} else {
						if (Login.worldSelectPage > 0 && class178.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class178.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= UrlRequester.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= UrlRequester.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && HorizontalAlignment.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class154.canvasWidth - HorizontalAlignment.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class154.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= UrlRequester.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= UrlRequester.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var4.field2991 == 13) {
					Login.worldSelectOpen = false;
					class331.leftTitleSprite.drawAt(Login.xPadding, 0);
					WorldMapCacheName.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					UserComparator8.logoSprite.drawAt(Login.xPadding + 382 - UserComparator8.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var4.field2991 == 96) {
					if (Login.worldSelectPage > 0 && class178.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var4.field2991 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && HorizontalAlignment.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Varcs.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class461.clientPreferences.updateTitleMusicDisabled(!class461.clientPreferences.isTitleMusicDisabled());
				if (!class461.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(HorizontalAlignment.archive6, "scape main", "", 255, false));
					class180.method3804(var3, 0, 0, 0, 100, false);
				} else {
					AbstractWorldMapIcon.method6257(0, 0);
				}

				SoundCache.method889();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field981) {
					Login.field981 = WorldMapElement.method3843() + 1000L;
				}

				long var22 = WorldMapElement.method3843();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var24.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && -1L == Login.field957) {
					Login.field957 = var22;
					if (Login.field957 > Login.field981) {
						Login.field981 = Login.field957;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (LoginScreenAnimation.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Varcs.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var6 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var25 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var8 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var25) {
								if (class169.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (VarbitComposition.World_request != null && class169.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton;
					var38 = MouseHandler.MouseHandler_lastPressedX;
					var39 = MouseHandler.MouseHandler_lastPressedY;
					if (var6 == 0) {
						var38 = MouseHandler.MouseHandler_x;
						var39 = MouseHandler.MouseHandler_y;
					}

					if (!Varcs.mouseCam && var6 == 4) {
						var6 = 1;
					}

					IndexCheck var9 = Client.indexCheck;
					IndexCheck var26 = var9;
					short var42;
					int var51;
					if (Login.loginIndex == 0) {
						boolean var49 = false;

						while (var26.method5573()) {
							if (var26.field2991 == 84) {
								var49 = true;
							}
						}

						var51 = AbstractByteArrayCopier.loginBoxCenter - 80;
						var42 = 291;
						if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20) {
							FloorOverlayDefinition.openURL(class354.method6858("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var51 = AbstractByteArrayCopier.loginBoxCenter + 80;
						if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20 || var49) {
							class191.method3951();
						}
					} else {
						short var27;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var26.method5573()) {
									var11 = AbstractByteArrayCopier.loginBoxCenter - 80;
									var27 = 321;
									if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
										RouteStrategy.Login_promptCredentials(false);
									}

									var11 = AbstractByteArrayCopier.loginBoxCenter + 80;
									if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
										LoginState.updateLoginIndex(0);
									}
									break;
								}

								if (var26.field2991 == 84) {
									RouteStrategy.Login_promptCredentials(false);
								} else if (var26.field2991 == 13) {
									LoginState.updateLoginIndex(0);
								}
							}
						} else {
							int var15;
							int var16;
							short var41;
							if (Login.loginIndex == 2) {
								var41 = 201;
								var11 = var41 + 52;
								if (var6 == 1 && var39 >= var11 - 12 && var39 < var11 + 2) {
									Login.currentLoginField = 0;
								}

								var11 += 15;
								if (var6 == 1 && var39 >= var11 - 12 && var39 < var11 + 2) {
									Login.currentLoginField = 1;
								}

								var11 += 15;
								var41 = 361;
								if (class53.field349 != null) {
									var51 = class53.field349.highX / 2;
									if (var6 == 1 && var38 >= class53.field349.lowX - var51 && var38 <= var51 + class53.field349.lowX && var39 >= var41 - 15 && var39 < var41) {
										switch(Login.field960) {
										case 1:
											FloorOverlayDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											FloorOverlayDefinition.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var51 = AbstractByteArrayCopier.loginBoxCenter - 80;
								var42 = 321;
								if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20) {
									class30.method450();
									return;
								}

								var51 = Login.loginBoxX + 180 + 80;
								if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20) {
									LoginState.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class53.otpMedium = 0;
									Language.otp = "";
									Login.rememberUsername = true;
								}

								var51 = AbstractByteArrayCopier.loginBoxCenter + -117;
								var42 = 277;
								Login.field971 = var38 >= var51 && var38 < var51 + class59.field418 && var39 >= var42 && var39 < var42 + PacketBufferNode.field3426;
								if (var6 == 1 && Login.field971) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class461.clientPreferences.getRememberedUsername() != null) {
										class461.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var51 = AbstractByteArrayCopier.loginBoxCenter + 24;
								var42 = 277;
								Login.field972 = var38 >= var51 && var38 < var51 + class59.field418 && var39 >= var42 && var39 < var42 + PacketBufferNode.field3426;
								if (var6 == 1 && Login.field972) {
									class461.clientPreferences.updateHideUsername(!class461.clientPreferences.isUsernameHidden());
									if (!class461.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class461.clientPreferences.updateRememberedUsername((String)null);
										class107.focusPasswordWhenUsernameFilled();
									}
								}

								label1502:
								while (true) {
									Transferable var52;
									do {
										while (true) {
											label1466:
											do {
												while (true) {
													while (var26.method5573()) {
														if (var26.field2991 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1466;
															}

															char var44 = var26.field2990;

															for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var44 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) {
															}

															if (var26.field2991 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var26.field2991 == 84 || var26.field2991 == 80) {
																Login.currentLoginField = 1;
															}

															char var46 = var26.field2990;
															boolean var47 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1;
															if (var47 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var26.field2990;
															}
														} else {
															LoginState.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class53.otpMedium = 0;
															Language.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var26.field2991 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var26.field2991 == 84 || var26.field2991 == 80) {
												Login.currentLoginField = 0;
												if (var26.field2991 == 84) {
													class30.method450();
													return;
												}
											}

											if ((var26.isValidIndexInRange(82) || var26.isValidIndexInRange(87)) && var26.field2991 == 67) {
												Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var52 = var50.getContents(class1.client);
												var16 = 20 - Login.Login_password.length();
												break;
											}

											if (Actor.method2687(var26.field2990)) {
												char var48 = var26.field2990;
												var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var48) != -1;
												if (var43 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var26.field2990;
												}
											}
										}
									} while(var16 <= 0);

									try {
										String var17 = (String)var52.getTransferData(DataFlavor.stringFlavor);
										int var18 = Math.min(var16, var17.length());
										int var19 = 0;

										while (true) {
											if (var19 >= var18) {
												Login.Login_password = Login.Login_password + var17.substring(0, var18);
												continue label1502;
											}

											if (!Actor.method2687(var17.charAt(var19))) {
												break;
											}

											char var21 = var17.charAt(var19);
											boolean var20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var21) != -1;
											if (!var20) {
												break;
											}

											++var19;
										}

										LoginState.updateLoginIndex(3);
										return;
									} catch (UnsupportedFlavorException var34) {
									} catch (IOException var35) {
									}
								}
							} else {
								Bounds var30;
								if (Login.loginIndex == 3) {
									var11 = Login.loginBoxX + 180;
									var27 = 241;
									var30 = var1.method8429(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var27);
									if (var6 == 1 && var30.method8033(var38, var39)) {
										FloorOverlayDefinition.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var11 = Login.loginBoxX + 180;
									var27 = 276;
									if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
										class150.updateLoginStatusUsernameRemembered(false);
									}

									var11 = Login.loginBoxX + 180;
									var27 = 326;
									if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
										FloorOverlayDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) {
										var11 = Login.loginBoxX + 180 - 80;
										var27 = 321;
										if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
											Language.otp.trim();
											if (Language.otp.length() != 6) {
												Login.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											} else {
												class53.otpMedium = Integer.parseInt(Language.otp);
												Language.otp = "";
												class162.setAuthenticationScheme(true);
												Login.setLoginResponseString("", "Connecting to server...", "");
												class464.updateGameState(20);
											}

											return;
										}

										if (var6 == 1 && var38 >= Login.loginBoxX + 180 - 9 && var38 <= Login.loginBoxX + 180 + 130 && var39 >= 263 && var39 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var6 == 1 && var38 >= Login.loginBoxX + 180 - 34 && var38 <= Login.loginBoxX + 34 + 180 && var39 >= 351 && var39 <= 363) {
											FloorOverlayDefinition.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var11 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
											LoginState.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class53.otpMedium = 0;
											Language.otp = "";
										}

										while (var26.method5573()) {
											boolean var13 = false;

											for (var14 = 0; var14 < "1234567890".length(); ++var14) {
												if (var26.field2990 == "1234567890".charAt(var14)) {
													var13 = true;
													break;
												}
											}

											if (var26.field2991 == 13) {
												LoginState.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class53.otpMedium = 0;
												Language.otp = "";
											} else {
												if (var26.field2991 == 85 && Language.otp.length() > 0) {
													Language.otp = Language.otp.substring(0, Language.otp.length() - 1);
												}

												if (var26.field2991 == 84) {
													Language.otp.trim();
													if (Language.otp.length() != 6) {
														Login.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													} else {
														class53.otpMedium = Integer.parseInt(Language.otp);
														Language.otp = "";
														class162.setAuthenticationScheme(true);
														Login.setLoginResponseString("", "Connecting to server...", "");
														class464.updateGameState(20);
													}

													return;
												}

												if (var13 && Language.otp.length() < 6) {
													Language.otp = Language.otp + var26.field2990;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var11 = Login.loginBoxX + 180 - 80;
										var27 = 321;
										if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
											UserComparator7.method3196();
											return;
										}

										var11 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
											RouteStrategy.Login_promptCredentials(true);
										}

										var42 = 361;
										if (World.field824 != null) {
											var14 = World.field824.highX / 2;
											if (var6 == 1 && var38 >= World.field824.lowX - var14 && var38 <= var14 + World.field824.lowX && var39 >= var42 - 15 && var39 < var42) {
												FloorOverlayDefinition.openURL(class354.method6858("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var26.method5573()) {
											var43 = false;

											for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) {
												if (var26.field2990 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) {
													var43 = true;
													break;
												}
											}

											if (var26.field2991 == 13) {
												RouteStrategy.Login_promptCredentials(true);
											} else {
												if (var26.field2991 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var26.field2991 == 84) {
													UserComparator7.method3196();
													return;
												}

												if (var43 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var26.field2990;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (KeyHandler.field109 && !Client.onMobile) {
												var11 = AbstractByteArrayCopier.loginBoxCenter - 150;
												var51 = var11 + 40 + 240 + 25;
												var42 = 231;
												var14 = var42 + 40;
												if (var6 == 1 && var38 >= var11 && var38 <= var51 && var39 >= var42 && var39 <= var14) {
													var16 = var11;
													int var31 = 0;

													while (true) {
														if (var31 >= 8) {
															var15 = 0;
															break;
														}

														if (var38 <= var16 + 30) {
															var15 = var31;
															break;
														}

														var16 += 30;
														var16 += var31 != 1 && var31 != 3 ? 5 : 20;
														++var31;
													}

													Login.field982 = var15;
												}

												var15 = Login.loginBoxX + 180 - 80;
												short var45 = 321;
												boolean var53;
												if (var6 == 1 && var38 >= var15 - 75 && var38 <= var15 + 75 && var39 >= var45 - 20 && var39 <= var45 + 20) {
													var53 = class146.method3430();
													if (var53) {
														class464.updateGameState(50);
														return;
													}
												}

												var15 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var38 >= var15 - 75 && var38 <= var15 + 75 && var39 >= var45 - 20 && var39 <= var45 + 20) {
													Login.field970 = new String[8];
													RouteStrategy.Login_promptCredentials(true);
												}

												while (var26.method5573()) {
													if (var26.field2991 == 101) {
														Login.field970[Login.field982] = null;
													}

													if (var26.field2991 == 85) {
														if (Login.field970[Login.field982] == null && Login.field982 > 0) {
															--Login.field982;
														}

														Login.field970[Login.field982] = null;
													}

													if (var26.field2990 >= '0' && var26.field2990 <= '9') {
														Login.field970[Login.field982] = "" + var26.field2990;
														if (Login.field982 < 7) {
															++Login.field982;
														}
													}

													if (var26.field2991 == 84) {
														var53 = class146.method3430();
														if (var53) {
															class464.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var11 = Login.loginBoxX + 180 - 80;
												var27 = 321;
												if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
													FloorOverlayDefinition.openURL(class354.method6858("secure", true) + "m=dob/set_dob.ws", true, false);
													Login.setLoginResponseString("", "Page has opened in the browser.", "");
													LoginState.updateLoginIndex(6);
													return;
												}

												var11 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
													RouteStrategy.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var11 = Login.loginBoxX + 180 - 80;
											var27 = 321;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												FloorOverlayDefinition.openURL("https://www.jagex.com/terms/privacy", true, false);
												Login.setLoginResponseString("", "Page has opened in the browser.", "");
												LoginState.updateLoginIndex(6);
												return;
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												RouteStrategy.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var11 = Login.loginBoxX + 180;
											var27 = 311;
											if (var9.field2991 == 84 || var9.field2991 == 13 || var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												class150.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var11 = Login.loginBoxX + 180;
											var27 = 209;
											if (var9.field2991 == 84 || var6 == 1 && var38 >= var11 - 109 && var38 <= var11 + 109 && var39 >= var27 && var39 <= var27 + 68) {
												Login.setLoginResponseString("", "Connecting to server...", "");
												Client.field558 = class555.field5467;
												class162.setAuthenticationScheme(false);
												class464.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var11 = AbstractByteArrayCopier.loginBoxCenter;
											var27 = 233;
											var30 = var2.method8429(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var27);
											Bounds var28 = var2.method8429(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var27);
											Bounds var29 = var2.method8429(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var27);
											var51 = var27 + 17;
											Bounds var32 = var2.method8429(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var51);
											if (var6 == 1) {
												if (var30.method8033(var38, var39)) {
													FloorOverlayDefinition.openURL("https://www.jagex.com/terms", true, false);
												} else if (var28.method8033(var38, var39)) {
													FloorOverlayDefinition.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var29.method8033(var38, var39) || var32.method8033(var38, var39)) {
													FloorOverlayDefinition.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var11 = AbstractByteArrayCopier.loginBoxCenter - 80;
											var27 = 311;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												ChatChannel.method2418();
												class150.updateLoginStatusUsernameRemembered(true);
											}

											var11 = AbstractByteArrayCopier.loginBoxCenter + 80;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var11 = AbstractByteArrayCopier.loginBoxCenter;
											var27 = 321;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												class150.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var33 = "";
											switch(Login.Login_banType) {
											case 0:
												var33 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var33 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var33 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												RouteStrategy.Login_promptCredentials(false);
											}

											var51 = Login.loginBoxX + 180;
											var42 = 276;
											if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20) {
												FloorOverlayDefinition.openURL(var33, true, false);
												Login.setLoginResponseString("", "Page has opened in the browser.", "");
												LoginState.updateLoginIndex(6);
												return;
											}

											var51 = Login.loginBoxX + 180;
											var42 = 326;
											if (var6 == 1 && var38 >= var51 - 75 && var38 <= var51 + 75 && var39 >= var42 - 20 && var39 <= var42 + 20) {
												RouteStrategy.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var11 = Login.loginBoxX + 180;
											var27 = 301;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												class150.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var11 = Login.loginBoxX + 180 - 80;
											var27 = 321;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												FloorOverlayDefinition.openURL(class354.method6858("secure", true) + "m=dob/set_dob.ws", true, false);
												Login.setLoginResponseString("", "Page has opened in the browser.", "");
												LoginState.updateLoginIndex(6);
												return;
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												RouteStrategy.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var11 = Login.loginBoxX + 180;
											var27 = 276;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												FloorOverlayDefinition.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var11 = Login.loginBoxX + 180;
											var27 = 326;
											if (var6 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var39 >= var27 - 20 && var39 <= var27 + 20) {
												RouteStrategy.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var26.method5573()) {
													var41 = 321;
													if (var6 == 1 && var39 >= var41 - 20 && var39 <= var41 + 20) {
														RouteStrategy.Login_promptCredentials(true);
													}

													return;
												}
											} while(var26.field2991 != 84 && var26.field2991 != 13);

											RouteStrategy.Login_promptCredentials(true);
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

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-692803835"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = ClientPreferences.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class225.method4527(var6)) {
				var11 = var4;
			}

			int[] var12 = Tiles.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = class213.Entity_unpackID(var6);
			ObjectComposition var15 = class273.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class281.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight * -117168624) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class213.Entity_unpackID(var6);
			ObjectComposition var25 = class273.getObjectDefinition(var11);
			int var20;
			if (var25.mapSceneId != -1) {
				IndexedSprite var21 = class281.mapSceneSprites[var25.mapSceneId];
				if (var21 != null) {
					var14 = (var25.sizeX * 4 - var21.subWidth) / 2;
					var20 = (var25.sizeY * 4 - var21.subHeight * -117168624) / 2;
					var21.drawAt(var1 * 4 + var14 + 48, (104 - var2 - var25.sizeY) * 4 + var20 + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class225.method4527(var6)) {
					var13 = 15597568;
				}

				int[] var19 = Tiles.sceneMinimapSprite.pixels;
				var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var19[var20] = var13;
					var19[var20 + 1 + 512] = var13;
					var19[var20 + 1024 + 2] = var13;
					var19[var20 + 1536 + 3] = var13;
				} else {
					var19[var20 + 1536] = var13;
					var19[var20 + 1 + 1024] = var13;
					var19[var20 + 512 + 2] = var13;
					var19[var20 + 3] = var13;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class213.Entity_unpackID(var6);
			ObjectComposition var22 = class273.getObjectDefinition(var8);
			if (var22.mapSceneId != -1) {
				IndexedSprite var23 = class281.mapSceneSprites[var22.mapSceneId];
				if (var23 != null) {
					var11 = (var22.sizeX * 4 - var23.subWidth) / 2;
					int var24 = (var22.sizeY * 4 - var23.subHeight * -117168624) / 2;
					var23.drawAt(var11 + var1 * 4 + 48, (104 - var2 - var22.sizeY) * 4 + var24 + 48);
				}
			}
		}

	}
}
