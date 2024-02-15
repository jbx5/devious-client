import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class366 {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1754226121"
	)
	static int method7007(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4466(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4450(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4440(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "31"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		FontName.method9111();
		KeyHandler.method342();
		class442.method8216();
		GameObject.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				class475.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		GameObject.addNpcsToScene(false);

		for (Projectile var17 = (Projectile)Client.projectiles.last(); var17 != null; var17 = (Projectile)Client.projectiles.previous()) {
			if (var17.plane == class473.Client_plane && Client.cycle <= var17.cycleEnd) {
				if (Client.cycle >= var17.cycleStart) {
					NPC var19;
					Player var20;
					if (!var17.isMoving && var17.field993 != 0) {
						if (var17.field993 > 0) {
							var19 = Client.npcs[var17.field993 - 1];
							if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) {
								var17.sourceX = var19.x;
								var17.sourceY = var19.y;
								var17.setDestination(var17.field1008, var17.field987, var17.field988, Client.cycle);
							}
						} else {
							var6 = -var17.field993 - 1;
							if (var6 == Client.localPlayerIndex) {
								var20 = VarpDefinition.localPlayer;
							} else {
								var20 = Client.players[var6];
							}

							if (var20 != null && var20.x >= 0 && var20.x < 13312 && var20.y >= 0 && var20.y < 13312) {
								var17.sourceX = var20.x;
								var17.sourceY = var20.y;
								var17.setDestination(var17.field1008, var17.field987, var17.field988, Client.cycle);
							}
						}
					}

					if (var17.targetIndex > 0) {
						var19 = Client.npcs[var17.targetIndex - 1];
						if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) {
							var17.setDestination(var19.x, var19.y, class272.getTileHeight(var19.x, var19.y, var17.plane) - var17.endHeight, Client.cycle);
						}
					}

					if (var17.targetIndex < 0) {
						var6 = -var17.targetIndex - 1;
						if (var6 == Client.localPlayerIndex) {
							var20 = VarpDefinition.localPlayer;
						} else {
							var20 = Client.players[var6];
						}

						if (var20 != null && var20.x >= 0 && var20.x < 13312 && var20.y >= 0 && var20.y < 13312) {
							var17.setDestination(var20.x, var20.y, class272.getTileHeight(var20.x, var20.y, var17.plane) - var17.endHeight, Client.cycle);
						}
					}

					var17.advance(Client.graphicsCycle);
					Actor.scene.drawEntity(class473.Client_plane, (int)var17.x, (int)var17.y, (int)var17.z, 60, var17, var17.yaw, -1L, false);
				}
			} else {
				var17.remove();
			}
		}

		for (GraphicsObject var21 = (GraphicsObject)Client.graphicsObjects.last(); var21 != null; var21 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var21.plane == class473.Client_plane && !var21.isFinished) {
				if (Client.cycle >= var21.cycleStart) {
					var21.advance(Client.graphicsCycle);
					if (var21.isFinished) {
						var21.remove();
					} else {
						Actor.scene.drawEntity(var21.plane, var21.x, var21.y, var21.z, 60, var21, 0, -1L, false);
					}
				}
			} else {
				var21.remove();
			}
		}

		class148.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9801();
		var4 = Client.camAngleX;
		if (Client.field795 / 256 > var4) {
			var4 = Client.field795 / 256;
		}

		if (Client.field797[4] && Client.field799[4] + 128 > var4) {
			var4 = Client.field799[4] + 128;
		}

		int var18 = Client.camAngleY & 2047;
		FadeInTask.method8010(Friend.oculusOrbFocalPointX, GrandExchangeOfferWorldComparator.field4449, class59.oculusOrbFocalPointY, var4, var18, WorldMapCacheName.method5111(var4), var3);
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) {
			if (class30.clientPreferences.isRoofsHidden()) {
				var7 = class473.Client_plane;
			} else {
				label468: {
					var8 = 3;
					if (FriendSystem.cameraPitch < 310) {
						label465: {
							if (Client.oculusOrbState == 1) {
								var9 = Friend.oculusOrbFocalPointX >> 7;
								var10 = class59.oculusOrbFocalPointY >> 7;
							} else {
								var9 = VarpDefinition.localPlayer.x >> 7;
								var10 = VarpDefinition.localPlayer.y >> 7;
							}

							var11 = ClanMate.cameraX >> 7;
							var12 = class317.cameraZ >> 7;
							if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
									if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) {
										var8 = class473.Client_plane;
									}

									if (var9 > var11) {
										var13 = var9 - var11;
									} else {
										var13 = var11 - var9;
									}

									if (var10 > var12) {
										var14 = var10 - var12;
									} else {
										var14 = var12 - var10;
									}

									int var15;
									int var16;
									if (var13 > var14) {
										var15 = var14 * 65536 / var13;
										var16 = 32768;

										while (true) {
											if (var11 == var9) {
												break label465;
											}

											if (var11 < var9) {
												++var11;
											} else if (var11 > var9) {
												--var11;
											}

											if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) {
												var8 = class473.Client_plane;
											}

											var16 += var15;
											if (var16 >= 65536) {
												var16 -= 65536;
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) {
													var8 = class473.Client_plane;
												}
											}
										}
									} else {
										if (var14 > 0) {
											var15 = var13 * 65536 / var14;
											var16 = 32768;

											while (var12 != var10) {
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) {
													var8 = class473.Client_plane;
												}

												var16 += var15;
												if (var16 >= 65536) {
													var16 -= 65536;
													if (var11 < var9) {
														++var11;
													} else if (var11 > var9) {
														--var11;
													}

													if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) {
														var8 = class473.Client_plane;
													}
												}
											}
										}
										break label465;
									}
								}

								var7 = class473.Client_plane;
								break label468;
							}

							var7 = class473.Client_plane;
							break label468;
						}
					}

					if (VarpDefinition.localPlayer.x >= 0 && VarpDefinition.localPlayer.y >= 0 && VarpDefinition.localPlayer.x < 13312 && VarpDefinition.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[class473.Client_plane][VarpDefinition.localPlayer.x >> 7][VarpDefinition.localPlayer.y >> 7] & 4) != 0) {
							var8 = class473.Client_plane;
						}

						var7 = var8;
					} else {
						var7 = class473.Client_plane;
					}
				}
			}

			var6 = var7;
		} else {
			if (class30.clientPreferences.isRoofsHidden()) {
				var7 = class473.Client_plane;
			} else {
				var8 = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane);
				if (var8 - AsyncHttpResponse.cameraY < 800 && (Tiles.Tiles_renderFlags[class473.Client_plane][ClanMate.cameraX >> 7][class317.cameraZ >> 7] & 4) != 0) {
					var7 = class473.Client_plane;
				} else {
					var7 = 3;
				}
			}

			var6 = var7;
		}

		var7 = ClanMate.cameraX;
		var8 = AsyncHttpResponse.cameraY;
		var9 = class317.cameraZ;
		var10 = FriendSystem.cameraPitch;
		var11 = Script.cameraYaw;

		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field797[var12]) {
				var13 = (int)(Math.random() * (double)(Client.field798[var12] * 2 + 1) - (double)Client.field798[var12] + Math.sin((double)Client.field754[var12] * ((double)Client.field800[var12] / 100.0D)) * (double)Client.field799[var12]);
				if (var12 == 0) {
					ClanMate.cameraX += var13;
				}

				if (var12 == 1) {
					AsyncHttpResponse.cameraY += var13;
				}

				if (var12 == 2) {
					class317.cameraZ += var13;
				}

				if (var12 == 3) {
					Script.cameraYaw = var13 + Script.cameraYaw & 2047;
				}

				if (var12 == 4) {
					FriendSystem.cameraPitch += var13;
					if (FriendSystem.cameraPitch < 128) {
						FriendSystem.cameraPitch = 128;
					}

					if (FriendSystem.cameraPitch > 383) {
						FriendSystem.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x;
		var13 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var12 = MouseHandler.MouseHandler_lastPressedX;
			var13 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
			class164.method3467(var12 - var0, var13 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class190.method3774();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class190.method3774();
		var14 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method5278(class193.client.field200);
		Rasterizer3D.clips.field3089 = Client.viewportZoom;
		Actor.scene.draw(ClanMate.cameraX, AsyncHttpResponse.cameraY, class317.cameraZ, FriendSystem.cameraPitch, Script.cameraYaw, var6);
		Rasterizer3D.method5278(false);
		if (Client.z) {
			Rasterizer2D.method9802();
		}

		Rasterizer3D.clips.field3089 = var14;
		class190.method3774();
		Actor.scene.clearTempGameObjects();
		class317.method6071(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			ClanChannelMember.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - Projectile.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - GameEngine.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				ChatChannel.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class407.method7643();
		ClanMate.cameraX = var7;
		AsyncHttpResponse.cameraY = var8;
		class317.cameraZ = var9;
		FriendSystem.cameraPitch = var10;
		Script.cameraYaw = var11;
		if (Client.isLoading && class356.field3897.method7211(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			RouteStrategy.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
