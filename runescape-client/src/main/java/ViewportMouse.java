import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hn")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("o")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport = false;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1258022703)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x = 0;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -864705353)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y = 0;

	@ObfuscatedName("u")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0 = false;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -969610827)
	static int field2587;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1888655975)
	static int field2580;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 919199359)
	static int field2586;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 109490241)
	static int field2583;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1680997135)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount = 0;

	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags = new long[1000];

	@ObfuscatedName("jn")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V", garbageValue = "-165029587")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "18")
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			StructComposition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}
		long var4 = -1L;
		long var6 = -1L;
		int var8;
		for (var8 = 0; var8 < InterfaceParent.method2160(); ++var8) {
			long var22 = Tiles.method2115(var8);
			if (var22 != var6) {
				var6 = var22;
				int var24 = ItemComposition.method3764(var8);
				int var12 = class17.method263(ViewportMouse_entityTags[var8]);
				int var13 = var12;
				int var14 = class128.method2897(var8);
				int var15 = class82.method2179(var8);
				int var19;
				if (var14 == 2 && Decimator.scene.getObjectFlags(FriendSystem.Client_plane, var24, var12, var22) >= 0) {
					ObjectComposition var16 = WorldMapDecoration.getObjectDefinition(var15);
					if (var16.transforms != null) {
						var16 = var16.transform();
					}
					if (var16 == null) {
						continue;
					}
					if (Client.isItemSelected == 1) {
						StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(65535) + var16.name, 1, var15, var24, var12);
					} else if (Client.isSpellSelected) {
						if ((Coord.selectedSpellFlags & 4) == 4) {
							StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(65535) + var16.name, 2, var15, var24, var12);
						}
					} else {
						String[] var17 = var16.actions;
						if (var17 != null) {
							for (int var18 = 4; var18 >= 0; --var18) {
								if (var17[var18] != null) {
									var19 = 0;
									if (var18 == 0) {
										var19 = 3;
									}
									if (var18 == 1) {
										var19 = 4;
									}
									if (var18 == 2) {
										var19 = 5;
									}
									if (var18 == 3) {
										var19 = 6;
									}
									if (var18 == 4) {
										var19 = 1001;
									}
									StructComposition.insertMenuItemNoShift(var17[var18], class82.colorStartTag(65535) + var16.name, var19, var15, var24, var13);
								}
							}
						}
						StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(65535) + var16.name, 1002, var16.id, var24, var13);
					}
				}
				Player var20;
				int var25;
				NPC var26;
				int[] var33;
				if (var14 == 1) {
					NPC var29 = Client.npcs[var15];
					if (var29 == null) {
						continue;
					}
					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) {
						for (var25 = 0; var25 < Client.npcCount; ++var25) {
							var26 = Client.npcs[Client.npcIndices[var25]];
							if (var26 != null && var29 != var26 && var26.definition.size == 1 && var29.x == var26.x && var29.y == var26.y) {
								WorldMapIcon_0.addNpcToMenu(var26, Client.npcIndices[var25], var24, var13);
							}
						}
						var25 = Players.Players_count;
						var33 = Players.Players_indices;
						for (var19 = 0; var19 < var25; ++var19) {
							var20 = Client.players[var33[var19]];
							if (var20 != null && var29.x == var20.x && var20.y == var29.y) {
								Script.addPlayerToMenu(var20, var33[var19], var24, var13);
							}
						}
					}
					WorldMapIcon_0.addNpcToMenu(var29, var15, var24, var13);
				}
				if (var14 == 0) {
					Player var30 = Client.players[var15];
					if (var30 == null) {
						continue;
					}
					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) {
						for (var25 = 0; var25 < Client.npcCount; ++var25) {
							var26 = Client.npcs[Client.npcIndices[var25]];
							if (var26 != null && var26.definition.size == 1 && var30.x == var26.x && var26.y == var30.y) {
								WorldMapIcon_0.addNpcToMenu(var26, Client.npcIndices[var25], var24, var13);
							}
						}
						var25 = Players.Players_count;
						var33 = Players.Players_indices;
						for (var19 = 0; var19 < var25; ++var19) {
							var20 = Client.players[var33[var19]];
							if (var20 != null && var20 != var30 && var20.x == var30.x && var30.y == var20.y) {
								Script.addPlayerToMenu(var20, var33[var19], var24, var13);
							}
						}
					}
					if (var15 != Client.combatTargetPlayerIndex) {
						Script.addPlayerToMenu(var30, var15, var24, var13);
					} else {
						var4 = var22;
					}
				}
				if (var14 == 3) {
					NodeDeque var32 = Client.groundItems[FriendSystem.Client_plane][var24][var13];
					if (var32 != null) {
						for (TileItem var31 = ((TileItem) (var32.first())); var31 != null; var31 = ((TileItem) (var32.next()))) {
							ItemComposition var34 = class258.ItemDefinition_get(var31.id);
							if (Client.isItemSelected == 1) {
								StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16748608) + var34.name, 16, var31.id, var24, var13);
							} else if (Client.isSpellSelected) {
								if ((Coord.selectedSpellFlags & 1) == 1) {
									StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16748608) + var34.name, 17, var31.id, var24, var13);
								}
							} else {
								String[] var27 = var34.groundActions;
								for (int var28 = 4; var28 >= 0; --var28) {
									if (var27 != null && var27[var28] != null) {
										byte var21 = 0;
										if (var28 == 0) {
											var21 = 18;
										}
										if (var28 == 1) {
											var21 = 19;
										}
										if (var28 == 2) {
											var21 = 20;
										}
										if (var28 == 3) {
											var21 = 21;
										}
										if (var28 == 4) {
											var21 = 22;
										}
										StructComposition.insertMenuItemNoShift(var27[var28], class82.colorStartTag(16748608) + var34.name, var21, var31.id, var24, var13);
									} else if (var28 == 2) {
										StructComposition.insertMenuItemNoShift("Take", class82.colorStartTag(16748608) + var34.name, 20, var31.id, var24, var13);
									}
								}
								StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16748608) + var34.name, 1004, var31.id, var24, var13);
							}
						}
					}
				}
			}
		}
		if (-1L != var4) {
			var8 = ((int) (var4 >>> 0 & 127L));
			int var10 = class17.method263(var4);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			Script.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(descriptor = "(Lku;IIII)V", garbageValue = "-2140670217")
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class12.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class28.localPlayer.x / 32 + 48;
				int var7 = 464 - class28.localPlayer.y / 32;
				SceneTilePaint.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);
				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class28.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class28.localPlayer.y / 32;
					Canvas.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}
				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[FriendSystem.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class28.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class28.localPlayer.y / 32;
							Canvas.drawSpriteOnMinimap(var1, var2, var11, var12, class65.mapDotSprites[0], var4);
						}
					}
				}
				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}
						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class28.localPlayer.x / 32;
							var12 = var9.y / 32 - class28.localPlayer.y / 32;
							Canvas.drawSpriteOnMinimap(var1, var2, var11, var12, class65.mapDotSprites[1], var4);
						}
					}
				}
				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;
				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class28.localPlayer) {
						var12 = var15.x / 32 - class28.localPlayer.x / 32;
						int var13 = var15.y / 32 - class28.localPlayer.y / 32;
						if (var15.isFriend()) {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[3], var4);
						} else if (class28.localPlayer.team != 0 && var15.team != 0 && var15.team == class28.localPlayer.team) {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[6], var4);
						} else {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[2], var4);
						}
					}
				}
				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class28.localPlayer.x / 32;
							var12 = var19.y / 32 - class28.localPlayer.y / 32;
							WorldMapSection2.worldToMinimap(var1, var2, var11, var12, WorldMapSection2.mapMarkerSprites[1], var4);
						}
					}
					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class300.baseX * 32 + 2 - class28.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - Message.baseY * 256 + 2 - class28.localPlayer.y / 32;
						WorldMapSection2.worldToMinimap(var1, var2, var10, var11, WorldMapSection2.mapMarkerSprites[1], var4);
					}
					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class28.localPlayer.x / 32;
							var12 = var20.y / 32 - class28.localPlayer.y / 32;
							WorldMapSection2.worldToMinimap(var1, var2, var11, var12, WorldMapSection2.mapMarkerSprites[1], var4);
						}
					}
				}
				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class28.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class28.localPlayer.y / 32;
					Canvas.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapSection2.mapMarkerSprites[0], var4);
				}
				if (!class28.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
			Client.field691[var3] = true;
		}
	}
}