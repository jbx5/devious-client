import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lhc;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1268897243
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1921368533
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1784132243
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ae")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 397258493
	)
	public int field1914;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1728470679
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("an")
	public boolean field1907;
	@ObfuscatedName("ao")
	public boolean field1916;
	@ObfuscatedName("af")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ab")
	int[] field1909;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1618005437
	)
	int field1925;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1425936225
	)
	int field1922;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1050741551
	)
	int field1923;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1769685375
	)
	int field1924;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aq")
	int[] field1927;
	@ObfuscatedName("al")
	byte[] field1928;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1418002937
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1907 = true;
		this.field1916 = false;
		this.menuActions = new String[5];
		this.field1925 = Integer.MAX_VALUE;
		this.field1922 = Integer.MAX_VALUE;
		this.field1923 = Integer.MIN_VALUE;
		this.field1924 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1927142328"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "1549450730"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1914 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1907 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1916 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1909 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1909[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1927 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1927.length; ++var5) {
					this.field1927[var5] = var1.readInt();
				}

				this.field1928 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1928[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1989, HorizontalAlignment.field1990, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)class177.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class177.findEnumerated(class452.method8781(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1548392015"
	)
	void method3888() {
		if (this.field1909 != null) {
			for (int var1 = 0; var1 < this.field1909.length; var1 += 2) {
				if (this.field1909[var1] < this.field1925) {
					this.field1925 = this.field1909[var1];
				} else if (this.field1909[var1] > this.field1923) {
					this.field1923 = this.field1909[var1];
				}

				if (this.field1909[var1 + 1] < this.field1922) {
					this.field1922 = this.field1909[var1 + 1];
				} else if (this.field1909[var1 + 1] > this.field1924) {
					this.field1924 = this.field1909[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvv;",
		garbageValue = "2095704154"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lvv;",
		garbageValue = "1841171800"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class496.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1719633819"
	)
	public static void method3900() {
		class204.field1909.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Ltt;ZII)V",
		garbageValue = "1585937887"
	)
	static void method3902(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Login.clearLoginScreen) {
			if (var4 == 4) {
				class6.updateLoginIndex(4);
			}

		} else {
			if (var4 == 0) {
				ClientPacket.updateLoginStatusUsernameRemembered(var3);
			} else {
				class6.updateLoginIndex(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			IntHashTable.leftTitleSprite = ClanMate.readSpritePixelsFromBytes(var5);
			class544.rightTitleSprite = IntHashTable.leftTitleSprite.mirrorHorizontally();
			UrlRequest.method3258(var1, Client.worldProperties);
			class230.titleboxSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			SoundSystem.titlebuttonSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class268.field2981 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field944 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = ArchiveDiskActionHandler.getFont(var1, "runes", "");
			DbTableType.title_muteSprite = ArchiveDiskActionHandler.getFont(var1, "title_mute", "");
			class33.options_buttons_0Sprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class77.field919 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			UserList.options_buttons_2Sprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			IntHashTable.field5625 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class134.field1573 = class33.options_buttons_0Sprite.subWidth;
			class280.field3075 = class33.options_buttons_0Sprite.subHeight;
			Timer.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite, var2.field5111);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field943 = new String[8];
				Login.field930 = 0;
			}

			class333.otpMedium = 0;
			Huffman.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!TaskHandler.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var6 = new ArrayList();
				var6.add(new MusicSong(MouseHandler.archive6, "scape main", "", 255, false));
				ParamComposition.method4154(var6, 0, 0, 0, 100, false);
			} else {
				class167.method3766(0, 0);
			}

			class182.method3872();
			JagNetThread var7 = class376.field4123;
			var7.method7706(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (HttpRequestTask.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			DevicePcmPlayerProvider.loginBoxCenter = Login.loginBoxX + 180;
			IntHashTable.leftTitleSprite.drawAt(Login.xPadding, 0);
			class544.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			TriBool.logoSprite.drawAt(Login.xPadding + 382 - TriBool.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIB)V",
		garbageValue = "19"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method7437() || class171.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (SecureRandomFuture.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != PcmPlayer.mousedOverWidgetIf1 && SecureRandomFuture.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method7323(class416.widgetDefinition, class278.urlRequester)) {
						if (var9.method7409()) {
							class110.invalidateWidget(var9);
							SoundCache.revalidateWidgetScroll(var9.children, var9, true);
							var9.method7320().method4471().method4561(3, var9.method7320().method4424());
						}

						if (var9.field3991 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3991;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method7329(class416.widgetDefinition)) {
					class110.invalidateWidget(var9);
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var26 + var9.width;
					int var19 = var11 + var9.height;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width;
					var17 = var11 + var9.height;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field691 = true;
					Client.field686 = var26;
					Client.field521 = var11;
				}

				boolean var34 = false;
				if (var9.field3957) {
					switch(Client.field667) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field668 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field668) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field1098) {
										var27.remove();
										var27.widget.field4022 = false;
									}
								}

								WorldMapRegion.method6109();
								if (InterfaceParent.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldMapID.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1098 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							class164.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						FloorDecoration.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							LoginState.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								LoginState.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								Login.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3958.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3958[var20] != null) {
									for (var23 = 0; var23 < var9.field3958[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field4030 != null) {
											var24 = Client.indexCheck.isValidIndexInRange(var9.field3958[var20][var23]);
										}

										if (WorldMapLabelSize.method5878(var9.field3958[var20][var23]) || var24) {
											var21 = true;
											if (var9.field4030 != null && var9.field4030[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3959[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var33 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var33 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var33 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										class145.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										ModeWhere.method7865();
										class93.method2596(var9.id, var9.childIndex, class93.Widget_unpackTargetMask(class171.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class227.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class204.colorStartTag(16777215);
									}

									var23 = var9.field3995[var20];
									if (var9.field4030 == null) {
										var9.field4030 = new int[var9.field3958.length];
									}

									if (var9.field3961 == null) {
										var9.field3961 = new int[var9.field3958.length];
									}

									if (var23 != 0) {
										if (var9.field4030[var20] == 0) {
											var9.field4030[var20] = var23 + Client.cycle + var9.field3961[var20];
										} else {
											var9.field4030[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field4030[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field4030 != null) {
									var9.field4030[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class416.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method7300()) {
								if (var21) {
									Client.field711.addFirst(new class268(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field711.addFirst(new class268(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								LoginState.worldMap.method9530(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && HorizontalAlignment.method3988(class171.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field558 = true;
								Client.field758 = var26;
								Client.field684 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1098 = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field4023 && var21) {
									var9.field4023 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1098 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4023 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1098 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4023 && !var36) {
									var9.field4023 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1098 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1098 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field4022 && var35) {
									var9.field4022 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1098 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4022 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1098 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4022 && !var35) {
									var9.field4022 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1098 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.scriptEvents2.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field4025) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field4025 <= 32) {
										label824:
										for (var39 = var9.field4025; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label824;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4025 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field778 > var9.field4014) {
									if (var9.invTransmitTriggers != null && Client.field778 - var9.field4014 <= 32) {
										label800:
										for (var39 = var9.field4014; var39 < Client.field778; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label800;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4014 = Client.field778;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3999) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3999 <= 32) {
										label776:
										for (var39 = var9.field3999; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label776;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3999 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field4024 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field586 > var9.field4024 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field700 > var9.field4024 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field701 > var9.field4024 && var9.field3965 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3965;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field702 > var9.field4024 && var9.field4001 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field4001;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field703 > var9.field4024 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field704 > var9.field4024 && var9.field4007 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field4007;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field705 > var9.field4024 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field4024 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field735; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field737[var39];
										var32.keyPressed = Client.field736[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3916 != null) {
									var38 = Client.indexCheck.method5654();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3916;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3997 != null) {
									var38 = Client.indexCheck.method5655();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3997;
										Client.scriptEvents.addFirst(var31);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									PcmPlayer.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									PcmPlayer.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								WorldMapArchiveLoader.field5242 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								AbstractWorldMapData.method6263(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var29 != null) {
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var30.field1098) {
											var30.remove();
											var30.widget.field4022 = false;
										}
									}

									if (InterfaceParent.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										WorldMapID.addCancelMenuEntry();
									}
								}

								class167.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
