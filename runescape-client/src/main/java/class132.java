import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class132 implements MouseWheel {
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		longValue = 7705364222102297647L
	)
	static long field1605;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1588;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1584;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1585;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1586;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1592;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1604;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1589;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1590;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1601;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1594;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1593;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1591;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1595;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1587;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1597;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1598;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1599;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 803648421
	)
	final int field1600;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1043805279
	)
	final int field1583;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1848773117
	)
	final int field1602;

	static {
		field1588 = new class132(0, 0, (String)null, -1, -1);
		field1584 = new class132(1, 1, (String)null, 0, 2);
		field1585 = new class132(2, 2, (String)null, 1, 2);
		field1586 = new class132(3, 3, (String)null, 2, 2);
		field1592 = new class132(4, 4, (String)null, 3, 1);
		field1604 = new class132(5, 5, (String)null, 4, 1);
		field1589 = new class132(6, 6, (String)null, 5, 1);
		field1590 = new class132(7, 7, (String)null, 6, 3);
		field1601 = new class132(8, 8, (String)null, 7, 3);
		field1594 = new class132(9, 9, (String)null, 8, 3);
		field1593 = new class132(10, 10, (String)null, 0, 7);
		field1591 = new class132(11, 11, (String)null, 1, 7);
		field1595 = new class132(12, 12, (String)null, 2, 7);
		field1587 = new class132(13, 13, (String)null, 3, 7);
		field1597 = new class132(14, 14, (String)null, 4, 7);
		field1598 = new class132(15, 15, (String)null, 5, 7);
		field1599 = new class132(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class132(int var1, int var2, String var3, int var4, int var5) {
		this.field1600 = var1;
		this.field1583 = var2;
		this.field1602 = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1552695494"
	)
	int method3036() {
		return this.field1602;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1583;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lis;I)V",
		garbageValue = "388906105"
	)
	static final void method3038(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) {
			for (var12 = 0; var12 < 8; ++var12) {
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var19 = new Buffer(var0);

		for (var12 = 0; var12 < 4; ++var12) {
			for (int var13 = 0; var13 < 64; ++var13) {
				for (int var14 = 0; var14 < 64; ++var14) {
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) {
						int var15 = var2 + class85.method2273(var13 & 7, var14 & 7, var7);
						int var16 = var3 + class144.method3118(var13 & 7, var14 & 7, var7);
						int var17 = (var13 & 7) + var8 + var2;
						int var18 = var3 + (var14 & 7) + var9;
						SecureRandomFuture.loadTerrain(var19, var1, var15, var16, var17, var18, var7);
					} else {
						SecureRandomFuture.loadTerrain(var19, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1398962204"
	)
	static int method3045(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-124816622"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (VarbitComposition.localPlayer.x >> 7 == Client.destinationX && VarbitComposition.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		RouteStrategy.method4187();
		InterfaceParent.method2278();
		WorldMapData_0.addNpcsToScene(true);
		class147.method3137();
		WorldMapData_0.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == HealthBar.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					NPC var39;
					Player var41;
					if (!var4.isMoving && var4.field988 != 0) {
						if (var4.field988 > 0) {
							var39 = Client.npcs[var4.field988 - 1];
							if (var39 != null && var39.x >= 0 && var39.x < 13312 && var39.y >= 0 && var39.y < 13312) {
								var4.sourceX = var39.x;
								var4.sourceY = var39.y;
								var4.setDestination(var4.field978, var4.field979, var4.field980, Client.cycle);
							}
						} else {
							var6 = -var4.field988 - 1;
							if (var6 == Client.localPlayerIndex) {
								var41 = VarbitComposition.localPlayer;
							} else {
								var41 = Client.players[var6];
							}

							if (var41 != null && var41.x >= 0 && var41.x < 13312 && var41.y >= 0 && var41.y < 13312) {
								var4.sourceX = var41.x;
								var4.sourceY = var41.y;
								var4.setDestination(var4.field978, var4.field979, var4.field980, Client.cycle);
							}
						}
					}

					if (var4.targetIndex > 0) {
						var39 = Client.npcs[var4.targetIndex - 1];
						if (var39 != null && var39.x >= 0 && var39.x < 13312 && var39.y >= 0 && var39.y < 13312) {
							var4.setDestination(var39.x, var39.y, class18.getTileHeight(var39.x, var39.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						if (var6 == Client.localPlayerIndex) {
							var41 = VarbitComposition.localPlayer;
						} else {
							var41 = Client.players[var6];
						}

						if (var41 != null && var41.x >= 0 && var41.x < 13312 && var41.y >= 0 && var41.y < 13312) {
							var4.setDestination(var41.x, var41.y, class18.getTileHeight(var41.x, var41.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.graphicsCycle);
					class130.scene.drawEntity(HealthBar.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		class167.method3342();
		GrandExchangeOfferOwnWorldComparator.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.method4389();
		Rasterizer2D.method9389();
		int var36 = Client.camAngleX;
		if (Client.field668 / 256 > var36) {
			var36 = Client.field668 / 256;
		}

		if (Client.field795[4] && Client.field748[4] + 128 > var36) {
			var36 = Client.field748[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		var6 = FriendLoginUpdate.oculusOrbFocalPointX;
		int var7 = class125.field1494;
		int var8 = HealthBar.oculusOrbFocalPointY;
		int var9 = class172.method3459(var36);
		int var11 = var3 - 334;
		if (var11 < 0) {
			var11 = 0;
		} else if (var11 > 100) {
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
		int var10 = var12 * var9 / 256;
		var11 = 2048 - var36 & 2047;
		var12 = 2048 - var5 & 2047;
		int var13 = 0;
		int var14 = 0;
		int var15 = var10;
		int var16;
		int var17;
		int var18;
		if (var11 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var11];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var18 = var17 * var14 - var16 * var10 >> 16;
			var15 = var17 * var10 + var16 * var14 >> 16;
			var14 = var18;
		}

		if (var12 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var12];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var18 = var16 * var15 + var13 * var17 >> 16;
			var15 = var17 * var15 - var13 * var16 >> 16;
			var13 = var18;
		}

		if (Client.isCameraLocked) {
			FontName.field4962 = var6 - var13;
			KeyHandler.field124 = var7 - var14;
			class31.field173 = var8 - var15;
			UserComparator4.field1459 = var36;
			VertexNormal.field2800 = var5;
		} else {
			NPCComposition.cameraX = var6 - var13;
			class133.cameraY = var7 - var14;
			class139.cameraZ = var8 - var15;
			class129.cameraPitch = var36;
			UserComparator10.cameraYaw = var5;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (FriendLoginUpdate.oculusOrbFocalPointX >> 7 != VarbitComposition.localPlayer.x >> 7 || HealthBar.oculusOrbFocalPointY >> 7 != VarbitComposition.localPlayer.y >> 7)) {
			var16 = VarbitComposition.localPlayer.plane;
			var17 = UrlRequester.baseX * 64 + (FriendLoginUpdate.oculusOrbFocalPointX >> 7);
			var18 = class47.baseY * 64 + (HealthBar.oculusOrbFocalPointY >> 7);
			NPC.method2637(var17, var18, var16, true);
		}

		int var20;
		if (!Client.isCameraLocked) {
			if (class449.clientPreferences.method2448()) {
				var11 = HealthBar.Client_plane;
			} else {
				label670: {
					var12 = 3;
					if (class129.cameraPitch < 310) {
						label662: {
							if (Client.oculusOrbState == 1) {
								var13 = FriendLoginUpdate.oculusOrbFocalPointX >> 7;
								var14 = HealthBar.oculusOrbFocalPointY >> 7;
							} else {
								var13 = VarbitComposition.localPlayer.x >> 7;
								var14 = VarbitComposition.localPlayer.y >> 7;
							}

							var15 = NPCComposition.cameraX >> 7;
							var16 = class139.cameraZ >> 7;
							if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
								if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
									if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) {
										var12 = HealthBar.Client_plane;
									}

									if (var13 > var15) {
										var17 = var13 - var15;
									} else {
										var17 = var15 - var13;
									}

									if (var14 > var16) {
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14;
									}

									int var19;
									if (var17 > var18) {
										var19 = var18 * 65536 / var17;
										var20 = 32768;

										while (true) {
											if (var15 == var13) {
												break label662;
											}

											if (var15 < var13) {
												++var15;
											} else if (var15 > var13) {
												--var15;
											}

											if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) {
												var12 = HealthBar.Client_plane;
											}

											var20 += var19;
											if (var20 >= 65536) {
												var20 -= 65536;
												if (var16 < var14) {
													++var16;
												} else if (var16 > var14) {
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) {
													var12 = HealthBar.Client_plane;
												}
											}
										}
									} else {
										if (var18 > 0) {
											var19 = var17 * 65536 / var18;
											var20 = 32768;

											while (var14 != var16) {
												if (var16 < var14) {
													++var16;
												} else if (var16 > var14) {
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) {
													var12 = HealthBar.Client_plane;
												}

												var20 += var19;
												if (var20 >= 65536) {
													var20 -= 65536;
													if (var15 < var13) {
														++var15;
													} else if (var15 > var13) {
														--var15;
													}

													if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) {
														var12 = HealthBar.Client_plane;
													}
												}
											}
										}
										break label662;
									}
								}

								var11 = HealthBar.Client_plane;
								break label670;
							}

							var11 = HealthBar.Client_plane;
							break label670;
						}
					}

					if (VarbitComposition.localPlayer.x >= 0 && VarbitComposition.localPlayer.y >= 0 && VarbitComposition.localPlayer.x < 13312 && VarbitComposition.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][VarbitComposition.localPlayer.x >> 7][VarbitComposition.localPlayer.y >> 7] & 4) != 0) {
							var12 = HealthBar.Client_plane;
						}

						var11 = var12;
					} else {
						var11 = HealthBar.Client_plane;
					}
				}
			}

			var10 = var11;
		} else {
			var10 = StructComposition.method3845();
		}

		var11 = NPCComposition.cameraX;
		var12 = class133.cameraY;
		var13 = class139.cameraZ;
		var14 = class129.cameraPitch;
		var15 = UserComparator10.cameraYaw;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field795[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field588[var16] * 2 + 1) - (double)Client.field588[var16] + Math.sin((double)Client.field658[var16] / 100.0D * (double)Client.field744[var16]) * (double)Client.field748[var16]);
				if (var16 == 0) {
					NPCComposition.cameraX += var17;
				}

				if (var16 == 1) {
					class133.cameraY += var17;
				}

				if (var16 == 2) {
					class139.cameraZ += var17;
				}

				if (var16 == 3) {
					UserComparator10.cameraYaw = var17 + UserComparator10.cameraYaw & 2047;
				}

				if (var16 == 4) {
					class129.cameraPitch += var17;
					if (class129.cameraPitch < 128) {
						class129.cameraPitch = 128;
					}

					if (class129.cameraPitch > 383) {
						class129.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x;
		var17 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var16 = MouseHandler.MouseHandler_lastPressedX;
			var17 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
			MenuAction.method2083(var16 - var0, var17 - var1);
		} else {
			Players.method2706();
		}

		class301.method5721();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class301.method5721();
		var18 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4390(class219.client.field215);
		Rasterizer3D.clips.field2815 = Client.viewportZoom;
		class130.scene.draw(NPCComposition.cameraX, class133.cameraY, class139.cameraZ, class129.cameraPitch, UserComparator10.cameraYaw, var10);
		Rasterizer3D.method4390(false);
		if (Client.renderSelf) {
			Rasterizer2D.method9390();
		}

		Rasterizer3D.clips.field2815 = var18;
		class301.method5721();
		class130.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var40 = false;
		var20 = -1;
		int var21 = -1;
		int var22 = Players.Players_count;
		int[] var23 = Players.Players_indices;

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) {
			Object var38;
			if (var24 < var22) {
				var38 = Client.players[var23[var24]];
				if (var23[var24] == Client.combatTargetPlayerIndex) {
					var40 = true;
					var20 = var24;
					continue;
				}

				if (var38 == VarbitComposition.localPlayer) {
					var21 = var24;
					continue;
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var24 - var22]];
			}

			PcmPlayer.drawActor2d((Actor)var38, var24, var0, var1, var2, var3);
		}

		if (Client.field764 && var21 != -1) {
			PcmPlayer.drawActor2d(VarbitComposition.localPlayer, var21, var0, var1, var2, var3);
		}

		if (var40) {
			PcmPlayer.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3);
		}

		for (var24 = 0; var24 < Client.overheadTextCount; ++var24) {
			int var25 = Client.overheadTextXs[var24];
			int var26 = Client.overheadTextYs[var24];
			int var27 = Client.overheadTextXOffsets[var24];
			int var28 = Client.overheadTextAscents[var24];
			boolean var29 = true;

			while (var29) {
				var29 = false;

				for (int var37 = 0; var37 < var24; ++var37) {
					if (var26 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var26 - var28 < Client.overheadTextYs[var37] + 2 && var25 - var27 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var25 + var27 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var26) {
						var26 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37];
						var29 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var24];
			Client.viewportTempY = Client.overheadTextYs[var24] = var26;
			String var30 = Client.overheadText[var24];
			if (Client.chatEffects == 0) {
				int var31 = 16776960;
				if (Client.overheadTextColors[var24] < 6) {
					var31 = Client.field758[Client.overheadTextColors[var24]];
				}

				if (Client.overheadTextColors[var24] == 6) {
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var24] == 7) {
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var24] == 8) {
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.overheadTextColors[var24] == 9) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) {
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var24] == 10) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) {
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var24] == 11) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) {
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) {
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				int var33;
				if (Client.overheadTextColors[var24] == 12 && Client.field535[var24] == null) {
					var32 = var30.length();
					Client.field535[var24] = new int[var32];

					for (var33 = 0; var33 < var32; ++var33) {
						int var34 = (int)(64.0F * ((float)var33 / (float)var32));
						int var35 = var34 << 10 | 896 | 64;
						Client.field535[var24][var33] = class466.field4795[var35];
					}
				}

				if (Client.overheadTextEffects[var24] == 0) {
					class59.fontBold12.method7441(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.field535[var24]);
				}

				if (Client.overheadTextEffects[var24] == 1) {
					class59.fontBold12.method7459(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field535[var24]);
				}

				if (Client.overheadTextEffects[var24] == 2) {
					class59.fontBold12.method7439(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field535[var24]);
				}

				if (Client.overheadTextEffects[var24] == 3) {
					class59.fontBold12.method7481(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var24], Client.field535[var24]);
				}

				if (Client.overheadTextEffects[var24] == 4) {
					var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (class59.fontBold12.stringWidth(var30) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class59.fontBold12.method7489(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0, Client.field535[var24]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var24] == 5) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					var33 = 0;
					if (var32 < 25) {
						var33 = var32 - 25;
					} else if (var32 > 125) {
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class59.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class59.fontBold12.method7441(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0, Client.field535[var24]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class59.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		ItemContainer.method2271(var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class153.method3173(var0, var1, var2, var3);
		NPCComposition.cameraX = var11;
		class133.cameraY = var12;
		class139.cameraZ = var13;
		class129.cameraPitch = var14;
		UserComparator10.cameraYaw = var15;
		if (Client.isLoading && class308.field3462.method6810(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			FadeInTask.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
