import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 110214667
	)
	static int field461;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -511622767
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1891269393
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1147765991
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@Export("sender")
	String sender;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("ae")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("am")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class106.method3032();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1773894804"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2077713235"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = ItemContainer.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1563795390"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-167147022"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = ItemContainer.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2037921186"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class267.method5641(this.sender), WorldMapScaleHandler.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldw;IIIIII)V",
		garbageValue = "898492289"
	)
	@Export("drawActor2d")
	static final void drawActor2d(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.isVisible()) {
			if (var1 instanceof NPC) {
				NPCComposition var7 = ((NPC)var1).definition;
				if (var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 == null) {
					return;
				}
			}

			int var76 = Client.playerUpdateManager.playerCount;
			int[] var8 = Client.playerUpdateManager.playerIndices;
			boolean var9 = var2 < var76;
			int var10 = -2;
			if (var1.overheadText != null && (!var9 || !var1.field1239 && (Client.publicChatMode == 4 || !var1.field1238 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				WorldMapDecoration.method6285(var0, var1, var1.vmethod2981());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = Calendar.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = Calendar.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1241;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1242;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field665[Client.overheadTextCount] = var1.field1243;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method7939()) {
				WorldMapDecoration.method6285(var0, var1, var1.vmethod2981() + 15);

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var13 = var11.definition;
						SpritePixels var80 = var13.getBackSprite();
						SpritePixels var84 = var13.getFrontSprite();
						int var85 = 0;
						if (var80 != null && var84 != null) {
							if (var13.widthPadding * 2 < var84.subWidth) {
								var85 = var13.widthPadding;
							}

							var16 = var84.subWidth - var85 * 2;
						} else {
							var16 = var13.width;
						}

						int var82 = 255;
						boolean var86 = true;
						int var87 = Client.cycle - var12.cycle;
						int var88 = var16 * var12.health2 / var13.width;
						int var89;
						int var99;
						if (var12.cycleOffset > var87) {
							var89 = var13.field1960 == 0 ? 0 : var13.field1960 * (var87 / var13.field1960);
							var23 = var16 * var12.health / var13.width;
							var99 = var89 * (var88 - var23) / var12.cycleOffset + var23;
						} else {
							var99 = var88;
							var89 = var12.cycleOffset + var13.int5 - var87;
							if (var13.int3 >= 0) {
								var82 = (var89 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var12.health2 > 0 && var99 < 1) {
							var99 = 1;
						}

						if (var80 != null && var84 != null) {
							if (var99 == var16) {
								var99 += var85 * 2;
							} else {
								var99 += var85;
							}

							var89 = var80.subHeight;
							var10 += var89;
							var23 = var3 + Client.viewportTempX - (var16 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var85;
							if (var82 >= 0 && var82 < 255) {
								var80.drawTransAt(var23, var24, var82);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var89 + var24);
								var84.drawTransAt(var23, var24, var82);
							} else {
								var80.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var99, var24 + var89);
								var84.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var89 = var3 + Client.viewportTempX - (var16 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var23, var99, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var89 + var99, var23, var16 - var99, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			Player var90;
			if (var9 && Client.cycle == var1.playerCycle && StructComposition.method4173((Player)var1)) {
				var90 = (Player)var1;
				if (var9) {
					WorldMapDecoration.method6285(var0, var1, var1.vmethod2981() + 15);
					AbstractFont var91 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var10 += 4;
					var91.drawCentered(var90.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
					var10 += 18;
				}
			}

			if (var9) {
				var90 = (Player)var1;
				if (var90.isHidden) {
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) {
					WorldMapDecoration.method6285(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var90.headIconPk != -1) {
							var10 += 25;
							class320.headIconPkSprites[var90.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var90.headIconPrayer != -1) {
							var10 += 25;
							class539.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrowType == 10 && var8[var2] == Client.hintArrowPlayerIndex) {
					WorldMapDecoration.method6285(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var10 += LoginState.headIconHintSprites[1].subHeight;
						LoginState.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var92 = (NPC)var1;
				int[] var93 = var92.method2989();
				short[] var94 = var92.method2972();
				if (var94 != null && var93 != null) {
					for (int var14 = 0; var14 < var94.length; ++var14) {
						if (var94[var14] >= 0 && var93[var14] >= 0) {
							long var15 = (long)var93[var14] << 8 | (long)var94[var14];
							SpritePixels var17 = (SpritePixels)Client.field789.method8892(var15);
							if (var17 == null) {
								SpritePixels[] var18 = UrlRequester.method3231(class450.archive8, var93[var14], 0);
								if (var18 != null && var94[var14] < var18.length) {
									var17 = var18[var94[var14]];
									Client.field789.method8895(var15, var17);
								}
							}

							if (var17 != null) {
								WorldMapDecoration.method6285(var0, var1, var1.vmethod2981() + 15);
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var14 + 1) * (var4 - var17.subHeight - 2) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && var0.npcIndices[var2 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					WorldMapDecoration.method6285(var0, var1, var1.vmethod2981() + 15);
					if (Client.viewportTempX > -1) {
						LoginState.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var78 = var1.hitSplatCycles[var77];
				int var79 = var1.hitSplatTypes[var77];
				HitSplatDefinition var97 = null;
				int var81 = 0;
				if (var79 >= 0) {
					if (var78 <= Client.cycle) {
						continue;
					}

					var97 = class551.method10024(var1.hitSplatTypes[var77]);
					var81 = var97.field2151;
					if (var97 != null && var97.transforms != null) {
						var97 = var97.transform();
						if (var97 == null) {
							var1.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var78 < 0) {
					continue;
				}

				var16 = var1.hitSplatTypes2[var77];
				HitSplatDefinition var95 = null;
				if (var16 >= 0) {
					var95 = class551.method10024(var16);
					if (var95 != null && var95.transforms != null) {
						var95 = var95.transform();
					}
				}

				if (var78 - var81 <= Client.cycle) {
					if (var97 == null) {
						var1.hitSplatCycles[var77] = -1;
					} else {
						WorldMapDecoration.method6285(var0, var1, var1.vmethod2981() / 2);
						if (Client.viewportTempX > -1) {
							boolean var98 = true;
							if (var77 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var77 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							SpritePixels var22 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							SpritePixels var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var19 = var97.method4180();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var97.method4181();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var97.method4182();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var97.method4178();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var95 != null) {
								var31 = var95.method4180();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var95.method4181();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var95.method4182();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var95.method4178();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var83 = var97.getFont();
							if (var83 == null) {
								var83 = class224.fontPlain11;
							}

							Font var45;
							if (var95 != null) {
								var45 = var95.getFont();
								if (var45 == null) {
									var45 = class224.fontPlain11;
								}
							} else {
								var45 = class224.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var97.getString(var1.hitSplatValues[var77]);
							int var96 = var83.stringWidth(var46);
							if (var95 != null) {
								var47 = var95.getString(var1.hitSplatValues2[var77]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var96 / var24 + 1;
								}
							}

							if (var95 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var50 * var24;
								var52 += var57;
								var56 += (var57 - var96) / 2;
							} else {
								var52 += var96;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var95 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var36 * var51;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var1.hitSplatCycles[var77] - Client.cycle;
							int var64 = var97.field2156 - var63 * var97.field2156 / var97.field2151;
							int var65 = var63 * var97.field2149 / var97.field2151 + -var97.field2149;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var97.field2158 + 15;
							int var71 = var70 - var83.maxAscent;
							int var72 = var70 + var83.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var95 != null) {
								var73 = var67 + var95.field2158 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var97.field2142 >= 0) {
								var74 = (var63 << 8) / (var97.field2151 - var97.field2142);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var66 + var54 - var29, var67, var74);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransAt(var75 * var24 + (var66 + var55 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var57 + var66 - var30, var67, var74);
								}

								var83.drawAlpha(var46, var66 + var56, var70, var97.textColor, 0, var74);
								if (var95 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var36 * var75 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var95.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var24 * var75 + (var66 + var55 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var83.draw(var46, var56 + var66, var70, var97.textColor | -16777216, 0);
								if (var95 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var36 * var75 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var95.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1312889159"
	)
	static final void method1253() {
		PacketBufferNode var0 = class113.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field863 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class421.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class110.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field863 = false;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "206392060"
	)
	static void method1254() {
		if (Client.field786 && SpriteMask.localPlayer != null) {
			int var0 = SpriteMask.localPlayer.pathX[0];
			int var1 = SpriteMask.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			ArchiveDisk.oculusOrbFocalPointX = SpriteMask.localPlayer.x;
			int var2 = ScriptFrame.getTileHeight(class198.topLevelWorldView, SpriteMask.localPlayer.x, SpriteMask.localPlayer.y, class198.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < Projectile.oculusOrbFocalPointZ) {
				Projectile.oculusOrbFocalPointZ = var2;
			}

			class298.oculusOrbFocalPointY = SpriteMask.localPlayer.y;
			Client.field786 = false;
		}

	}
}
