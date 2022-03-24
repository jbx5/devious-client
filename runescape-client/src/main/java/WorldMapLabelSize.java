import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lhh;")

	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lhh;")

	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lhh;")

	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	20552781)

	final int field2655;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1586043627)

	final int field2659;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1941962617)

	final int field2660;
	static 
	{
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2655 = var1;
		this.field2659 = var2;
		this.field2660 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(FI)Z", garbageValue = 
	"1896293500")

	boolean method4532(float var1) {
		return var1 >= ((float) (this.field2660));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Lhh;", garbageValue = 
	"316575905")

	static WorldMapLabelSize method4536(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{ WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium };
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2659) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;II)V", garbageValue = 
	"-2009640546")

	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[(++Players.Players_pendingUpdateCount) - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1109 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = ((var4.plane << 28) + ((class250.baseY + var4.pathY[0]) >> 13)) + (((ApproximateRouteStrategy.baseX + var4.pathX[0]) >> 13) << 14);
				if (var4.field1160 != (-1)) {
					Players.Players_orientations[var1] = var4.field1160;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class9.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
					var4.resetPath(var6, var7);
					var4.field1109 = false;
				} else if (var2) {
					var4.field1109 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1109 = false;
					var4.method2144(var6, var7, Players.field1285[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
					var4.resetPath(var6, var7);
					var4.field1109 = false;
				} else if (var2) {
					var4.field1109 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1109 = false;
					var4.method2144(var6, var7, Players.field1285[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = (var6 >> 5) & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
						var4.resetPath(var10, var11);
						var4.field1109 = false;
					} else if (var2) {
						var4.field1109 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1109 = false;
						var4.method2144(var10, var11, Players.field1285[var1]);
					}

					var4.plane = ((byte) ((var7 + var4.plane) & 3));
					if (Client.localPlayerIndex == var1) {
						class160.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = (var6 >> 14) & 16383;
					var9 = var6 & 16383;
					var10 = (((var8 + ApproximateRouteStrategy.baseX) + var4.pathX[0]) & 16383) - ApproximateRouteStrategy.baseX;
					var11 = (((var9 + class250.baseY) + var4.pathY[0]) & 16383) - class250.baseY;
					if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
						var4.resetPath(var10, var11);
						var4.field1109 = false;
					} else if (var2) {
						var4.field1109 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1109 = false;
						var4.method2144(var10, var11, Players.field1285[var1]);
					}

					var4.plane = ((byte) ((var7 + var4.plane) & 3));
					if (Client.localPlayerIndex == var1) {
						class160.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = 
	"(Lco;IB)V", garbageValue = 
	"-2")

	static final void method4533(Actor var0, int var1) {
		class10.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;IIB)V", garbageValue = 
	"-77")

	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if ((var0.buttonType == 2) && (!Client.isSpellSelected)) {
			var3 = InvDefinition.Widget_getSpellActionName(var0);
			if (var3 != null) {
				SecureRandomFuture.insertMenuItemNoShift(var3, ChatChannel.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			SecureRandomFuture.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if ((var0.buttonType == 6) && (Client.meslayerContinueWidget == null)) {
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var15 = 0; var15 < var0.width; ++var15) {
					int var16 = (var0.paddingX + 32) * var15;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var16 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if ((((var1 >= var16) && (var2 >= var7)) && (var1 < (var16 + 32))) && (var2 < (var7 + 32))) {
						Client.dragItemSlotDestination = var13;
						GrandExchangeEvent.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = class67.ItemDefinition_get(var0.itemIds[var13] - 1);
							if ((Client.isItemSelected == 1) && FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) {
								if ((var0.id != PendingSpawn.selectedItemWidget) || (var13 != class19.selectedItemSlot)) {
									SecureRandomFuture.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + ChatChannel.colorStartTag(16748608)) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) {
								if ((class154.selectedSpellFlags & 16) == 16) {
									SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + ChatChannel.colorStartTag(16748608)) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop) {
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								int var17;
								if (FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) {
									for (var17 = 4; var17 >= 3; --var17) {
										if (var10 != var17) {
											DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var17, false);
										}
									}
								}

								if (VarbitComposition.method3561(WorldMapSection2.getWidgetFlags(var0))) {
									SecureRandomFuture.insertMenuItemNoShift("Use", ChatChannel.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) {
									for (var17 = 2; var17 >= 0; --var17) {
										if (var10 != var17) {
											DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var17, false);
										}
									}

									if (var10 >= 0) {
										DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var17 = 4; var17 >= 0; --var17) {
										if (var9[var17] != null) {
											byte var12 = 0;
											if (var17 == 0) {
												var12 = 39;
											}

											if (var17 == 1) {
												var12 = 40;
											}

											if (var17 == 2) {
												var12 = 41;
											}

											if (var17 == 3) {
												var12 = 42;
											}

											if (var17 == 4) {
												var12 = 43;
											}

											SecureRandomFuture.insertMenuItemNoShift(var9[var17], ChatChannel.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = WorldMapSection2.getWidgetFlags(var0);
				boolean var18 = ((var4 >> 21) & 1) != 0;
				if (var18 && ((class154.selectedSpellFlags & 32) == 32)) {
					SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, (((Client.selectedSpellName + " ") + "->") + " ") + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var14;
					if ((!class142.method3004(WorldMapSection2.getWidgetFlags(var0), var13)) && (var0.onOp == null)) {
						var14 = null;
					} else if ((((var0.actions != null) && (var0.actions.length > var13)) && (var0.actions[var13] != null)) && (var0.actions[var13].trim().length() != 0)) {
						var14 = var0.actions[var13];
					} else {
						var14 = null;
					}

					if (var14 != null) {
						SecureRandomFuture.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = InvDefinition.Widget_getSpellActionName(var0);
				if (var3 != null) {
					SecureRandomFuture.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5;
					if ((!class142.method3004(WorldMapSection2.getWidgetFlags(var0), var4)) && (var0.onOp == null)) {
						var5 = null;
					} else if ((((var0.actions != null) && (var0.actions.length > var4)) && (var0.actions[var4] != null)) && (var0.actions[var4].trim().length() != 0)) {
						var5 = var0.actions[var4];
					} else {
						var5 = null;
					}

					if (var5 != null) {
						DynamicObject.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (class431.method7673(WorldMapSection2.getWidgetFlags(var0))) {
					SecureRandomFuture.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;IIII)V", garbageValue = 
	"-809248194")

	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		MouseHandler.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if ((Client.minimapState != 2) && (Client.minimapState != 5)) {
				int var5 = Client.camAngleY & 2047;
				int var6 = (class19.localPlayer.x / 32) + 48;
				int var7 = 464 - (class19.localPlayer.y / 32);
				MusicPatchNode2.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = ((Client.mapIconXs[var8] * 4) + 2) - (class19.localPlayer.x / 32);
					var10 = ((Client.mapIconYs[var8] * 4) + 2) - (class19.localPlayer.y / 32);
					Messages.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class160.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = ((var8 * 4) + 2) - (class19.localPlayer.x / 32);
							var12 = ((var16 * 4) + 2) - (class19.localPlayer.y / 32);
							Messages.drawSpriteOnMinimap(var1, var2, var11, var12, class142.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if ((var9 != null) && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if ((var18 != null) && (var18.transforms != null)) {
							var18 = var18.transform();
						}

						if (((var18 != null) && var18.drawMapDot) && var18.isInteractable) {
							var11 = (var9.x / 32) - (class19.localPlayer.x / 32);
							var12 = (var9.y / 32) - (class19.localPlayer.y / 32);
							Messages.drawSpriteOnMinimap(var1, var2, var11, var12, class142.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if ((((var15 != null) && var15.isVisible()) && (!var15.isHidden)) && (var15 != class19.localPlayer)) {
						var12 = (var15.x / 32) - (class19.localPlayer.x / 32);
						int var13 = (var15.y / 32) - (class19.localPlayer.y / 32);
						if (var15.isFriend()) {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[3], var4);
						} else if (((class19.localPlayer.team != 0) && (var15.team != 0)) && (var15.team == class19.localPlayer.team)) {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[6], var4);
						} else {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[2], var4);
						}
					}
				}

				if ((Client.hintArrowType != 0) && ((Client.cycle % 20) < 10)) {
					if (((Client.hintArrowType == 1) && (Client.hintArrowNpcIndex >= 0)) && (Client.hintArrowNpcIndex < Client.npcs.length)) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = (var19.x / 32) - (class19.localPlayer.x / 32);
							var12 = (var19.y / 32) - (class19.localPlayer.y / 32);
							NetFileRequest.worldToMinimap(var1, var2, var11, var12, class17.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = (((Client.hintArrowX * 4) - (ApproximateRouteStrategy.baseX * 4)) + 2) - (class19.localPlayer.x / 32);
						var11 = (((Client.hintArrowY * 4) - (class250.baseY * 4)) + 2) - (class19.localPlayer.y / 32);
						NetFileRequest.worldToMinimap(var1, var2, var10, var11, class17.mapMarkerSprites[1], var4);
					}

					if (((Client.hintArrowType == 10) && (Client.hintArrowPlayerIndex >= 0)) && (Client.hintArrowPlayerIndex < Client.players.length)) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = (var20.x / 32) - (class19.localPlayer.x / 32);
							var12 = (var20.y / 32) - (class19.localPlayer.y / 32);
							NetFileRequest.worldToMinimap(var1, var2, var11, var12, class17.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = ((Client.destinationX * 4) + 2) - (class19.localPlayer.x / 32);
					var11 = ((Client.destinationY * 4) + 2) - (class19.localPlayer.y / 32);
					Messages.drawSpriteOnMinimap(var1, var2, var10, var11, class17.mapMarkerSprites[0], var4);
				}

				if (!class19.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(((var4.width / 2) + var1) - 1, ((var4.height / 2) + var2) - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field651[var3] = true;
		}
	}
}