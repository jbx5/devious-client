import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class169 extends class147 {
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 139559131
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7094035019809500935L
	)
	long field1833;
	@ObfuscatedName("ad")
	String field1830;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class169(class150 var1) {
		this.this$0 = var1;
		this.field1833 = -1L;
		this.field1830 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1833 = var1.readLong();
		}

		this.field1830 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3358(this.field1833, this.field1830);
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2086937635"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class511.topLevelWorldView.scene.field2966 = Client.cycle;
		if (SoundCache.localPlayer.x >> 7 == Client.destinationX && SoundCache.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		WorldView var4 = class511.topLevelWorldView;
		if (Client.renderSelf) {
			class341.addPlayerToScene(var4, Client.localPlayerIndex, false);
		}

		WorldView var5 = class511.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var5.players[Client.combatTargetPlayerIndex] != null) {
			class341.addPlayerToScene(var5, Client.combatTargetPlayerIndex, false);
		}

		class238.addNpcsToScene(class511.topLevelWorldView, true);
		WorldView var6 = class511.topLevelWorldView;
		int var7 = var6.playerUpdateManager.playerCount;
		int[] var8 = var6.playerUpdateManager.playerIndices;

		int var9;
		for (var9 = 0; var9 < var7; ++var9) {
			if (var8[var9] != Client.combatTargetPlayerIndex && var8[var9] != Client.localPlayerIndex) {
				class341.addPlayerToScene(var6, var8[var9], true);
			}
		}

		class238.addNpcsToScene(class511.topLevelWorldView, false);
		WorldView var30 = class511.topLevelWorldView;

		int var12;
		for (int var31 = 0; var31 < var30.worldEntityCount; ++var31) {
			WorldEntity var32 = var30.worldEntities[var30.worldEntityIndices[var31]];
			if (var32 != null) {
				var32.field4973 = getTileHeight(var30, var32.field4967, var32.field4969, var30.plane);
				var32.worldView.scene.field2966 = Client.cycle;
				var32.method8669();
				var30.scene.drawEntity(var30.plane, var32.field4967, var32.field4969, var32.field4973, 60, var32.worldView.scene, var32.field4970, 0L, false);
				ClanChannel.method3505(var32.worldView);
				WorldView var35 = var32.worldView;
				if (Client.combatTargetPlayerIndex >= 0 && var35.players[Client.combatTargetPlayerIndex] != null) {
					class341.addPlayerToScene(var35, Client.combatTargetPlayerIndex, false);
				}

				class238.addNpcsToScene(var32.worldView, true);
				WorldView var36 = var32.worldView;
				var12 = var36.playerUpdateManager.playerCount;
				int[] var37 = var36.playerUpdateManager.playerIndices;

				for (int var14 = 0; var14 < var12; ++var14) {
					if (var37[var14] != Client.combatTargetPlayerIndex && var37[var14] != Client.localPlayerIndex) {
						class341.addPlayerToScene(var36, var37[var14], true);
					}
				}

				class238.addNpcsToScene(var32.worldView, false);
				WorldMapSection1.method5042(var32.worldView);
				WorldView var38 = var32.worldView;

				for (GraphicsObject var41 = (GraphicsObject)var38.graphicsObjects.last(); var41 != null; var41 = (GraphicsObject)var38.graphicsObjects.previous()) {
					if (var38.plane == var41.plane && !var41.isFinished) {
						if (Client.cycle >= var41.cycleStart) {
							var41.advance(Client.graphicsCycle);
							if (var41.isFinished) {
								var41.remove();
							} else {
								var38.scene.drawEntity(var41.plane, var41.x, var41.y, var41.z, 60, var41, 0, -1L, false);
							}
						}
					} else {
						var41.remove();
					}
				}
			}
		}

		WorldMapSection1.method5042(class511.topLevelWorldView);
		WorldView var39 = class511.topLevelWorldView;

		for (GraphicsObject var40 = (GraphicsObject)var39.graphicsObjects.last(); var40 != null; var40 = (GraphicsObject)var39.graphicsObjects.previous()) {
			if (var40.plane == var39.plane && !var40.isFinished) {
				if (Client.cycle >= var40.cycleStart) {
					var40.advance(Client.graphicsCycle);
					if (var40.isFinished) {
						var40.remove();
					} else {
						var39.scene.drawEntity(var40.plane, var40.x, var40.y, var40.z, 60, var40, 0, -1L, false);
					}
				}
			} else {
				var40.remove();
			}
		}

		PacketWriter.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9906();
		var9 = Client.camAngleX;
		if (Client.field605 / 256 > var9) {
			var9 = Client.field605 / 256;
		}

		if (Client.field771[4] && Client.field664[4] + 128 > var9) {
			var9 = Client.field664[4] + 128;
		}

		int var10 = Client.camAngleY & 2047;
		int var11 = class371.oculusOrbFocalPointX;
		var12 = BoundaryObject.oculusOrbFocalPointZ;
		int var13 = PacketBufferNode.oculusOrbFocalPointY;
		int var16 = var9 * 3 + 600;
		Canvas.method323(var11, var12, var13, var9, var10, var16, var3);
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		if (!Client.isCameraLocked) {
			if (class105.clientPreferences.isRoofsHidden()) {
				var18 = class511.topLevelWorldView.plane;
			} else {
				label485: {
					var19 = 3;
					var20 = StudioGame.field4084.vmethod8670() >> 7;
					var21 = StudioGame.field4084.vmethod8671() >> 7;
					if (Language.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var22 = class371.oculusOrbFocalPointX >> 7;
							var23 = PacketBufferNode.oculusOrbFocalPointY >> 7;
						} else {
							var22 = var20;
							var23 = var21;
						}

						var24 = class47.cameraX >> 7;
						var25 = class60.cameraZ >> 7;
						if (var24 < 0 || 104 <= var24 || var25 < 0 || 104 <= var25) {
							var18 = class511.topLevelWorldView.plane;
							break label485;
						}

						if (var22 < 0 || 104 <= var22 || var23 < 0 || 104 <= var23) {
							var18 = class511.topLevelWorldView.plane;
							break label485;
						}

						if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var24][var25] & 4) != 0) {
							var19 = class511.topLevelWorldView.plane;
						}

						if (var22 > var24) {
							var26 = var22 - var24;
						} else {
							var26 = var24 - var22;
						}

						if (var23 > var25) {
							var27 = var23 - var25;
						} else {
							var27 = var25 - var23;
						}

						int var29;
						if (var26 > var27) {
							var28 = var27 * 65536 / var26;
							var29 = 32768;

							while (var22 != var24) {
								if (var24 < var22) {
									++var24;
								} else if (var24 > var22) {
									--var24;
								}

								if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var24][var25] & 4) != 0) {
									var19 = class511.topLevelWorldView.plane;
								}

								var29 += var28;
								if (var29 >= 65536) {
									var29 -= 65536;
									if (var25 < var23) {
										++var25;
									} else if (var25 > var23) {
										--var25;
									}

									if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var24][var25] & 4) != 0) {
										var19 = class511.topLevelWorldView.plane;
									}
								}
							}
						} else if (var27 > 0) {
							var28 = var26 * 65536 / var27;
							var29 = 32768;

							while (var23 != var25) {
								if (var25 < var23) {
									++var25;
								} else if (var25 > var23) {
									--var25;
								}

								if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var24][var25] & 4) != 0) {
									var19 = class511.topLevelWorldView.plane;
								}

								var29 += var28;
								if (var29 >= 65536) {
									var29 -= 65536;
									if (var24 < var22) {
										++var24;
									} else if (var24 > var22) {
										--var24;
									}

									if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var24][var25] & 4) != 0) {
										var19 = class511.topLevelWorldView.plane;
									}
								}
							}
						}
					}

					if (var20 >= 0 && 104 > var20 && var21 >= 0 && 104 > var21) {
						if ((class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][var20][var21] & 4) != 0) {
							var19 = class511.topLevelWorldView.plane;
						}

						var18 = var19;
					} else {
						var18 = class511.topLevelWorldView.plane;
					}
				}
			}

			var17 = var18;
		} else {
			if (class105.clientPreferences.isRoofsHidden()) {
				var18 = class511.topLevelWorldView.plane;
			} else {
				var19 = getTileHeight(class511.topLevelWorldView, class47.cameraX, class60.cameraZ, class511.topLevelWorldView.plane);
				if (var19 - class328.cameraY < 800 && (class511.topLevelWorldView.tileSettings[class511.topLevelWorldView.plane][class47.cameraX >> 7][class60.cameraZ >> 7] & 4) != 0) {
					var18 = class511.topLevelWorldView.plane;
				} else {
					var18 = 3;
				}
			}

			var17 = var18;
		}

		var18 = class47.cameraX;
		var19 = class328.cameraY;
		var20 = class60.cameraZ;
		var21 = Language.cameraPitch;
		var22 = class337.cameraYaw;

		for (var23 = 0; var23 < 5; ++var23) {
			if (Client.field771[var23]) {
				var24 = (int)(Math.random() * (double)(Client.field772[var23] * 2 + 1) - (double)Client.field772[var23] + Math.sin((double)Client.field774[var23] / 100.0D * (double)Client.field498[var23]) * (double)Client.field664[var23]);
				if (var23 == 0) {
					class47.cameraX += var24;
				}

				if (var23 == 1) {
					class328.cameraY += var24;
				}

				if (var23 == 2) {
					class60.cameraZ += var24;
				}

				if (var23 == 3) {
					class337.cameraYaw = var24 + class337.cameraYaw & 2047;
				}

				if (var23 == 4) {
					Language.cameraPitch += var24;
					if (Language.cameraPitch < 128) {
						Language.cameraPitch = 128;
					}

					if (Language.cameraPitch > 383) {
						Language.cameraPitch = 383;
					}
				}
			}
		}

		var23 = MouseHandler.MouseHandler_x;
		var24 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var23 = MouseHandler.MouseHandler_lastPressedX;
			var24 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var23 >= var0 && var23 < var0 + var2 && var24 >= var1 && var24 < var3 + var1) {
			var25 = var23 - var0;
			var26 = var24 - var1;
			ViewportMouse.ViewportMouse_x = var25;
			ViewportMouse.ViewportMouse_y = var26;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			class180.method3580();
		}

		class157.method3347();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class157.method3347();
		var25 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method5325(class415.client.field187);
		Rasterizer3D.clips.field3184 = Client.viewportZoom;
		class511.topLevelWorldView.scene.draw(class47.cameraX, class328.cameraY, class60.cameraZ, Language.cameraPitch, class337.cameraYaw, var17);
		Rasterizer3D.method5325(false);
		if (Client.z) {
			Rasterizer2D.method9907();
		}

		Rasterizer3D.clips.field3184 = var25;
		class157.method3347();
		class511.topLevelWorldView.scene.setViewportWalking();

		WorldEntity var34;
		for (var26 = 0; var26 < class511.topLevelWorldView.worldEntityCount; ++var26) {
			var34 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var26]];
			if (var34 != null) {
				var34.worldView.scene.setViewportWalking();
			}
		}

		User.method8567(class511.topLevelWorldView, var0, var1, var2, var3);

		for (var26 = 0; var26 < class511.topLevelWorldView.worldEntityCount; ++var26) {
			var34 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var26]];
			if (var34 != null) {
				User.method8567(var34.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var33 = class511.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			var27 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var33.baseX << 7);
			var28 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var33.baseY << 7);
			class426.worldToScreen(var33, var27, var28, var27, var28, Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class337.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class315.method6088(var0, var1, var2, var3);
		class47.cameraX = var18;
		class328.cameraY = var19;
		class60.cameraZ = var20;
		Language.cameraPitch = var21;
		class337.cameraYaw = var22;
		if (Client.isLoading && class233.field2486.method7278(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class59.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIB)I",
		garbageValue = "-104"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4][var5] * (128 - var7) + var0.tileHeights[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) + var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}
}
