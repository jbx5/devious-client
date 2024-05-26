import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1376794951
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -574457265
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2076155761
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)Lic;",
		garbageValue = "-17677"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-66402262"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class358.topLevelWorldView.scene.field2707 = Client.cycle;
		if (class17.localPlayer.x >> 7 == Client.destinationX && class17.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		class74.method2114(class358.topLevelWorldView);
		class210.method4021(class358.topLevelWorldView);
		class7.addNpcsToScene(class358.topLevelWorldView, true);
		WorldView var4 = class358.topLevelWorldView;
		int var5 = var4.playerUpdateManager.playerCount;
		int[] var6 = var4.playerUpdateManager.playerIndices;

		int var7;
		for (var7 = 0; var7 < var5; ++var7) {
			if (var6[var7] != Client.combatTargetPlayerIndex && var6[var7] != Client.localPlayerIndex) {
				class425.addPlayerToScene(var4, var6[var7], true);
			}
		}

		class7.addNpcsToScene(class358.topLevelWorldView, false);
		WorldView var40 = class358.topLevelWorldView;

		int var9;
		int var11;
		int var41;
		for (var41 = 0; var41 < var40.worldEntityCount; ++var41) {
			WorldEntity var46 = var40.worldEntities[var40.worldEntityIndices[var41]];
			if (var46 != null) {
				var46.field4946 = SoundSystem.getTileHeight(var40, var46.field4943, var46.field4945, var40.plane);
				var46.worldView.scene.field2707 = Client.cycle;
				var46.method8761();
				var40.scene.drawEntity(var40.plane, var46.field4943, var46.field4945, var46.field4946, 60, var46.worldView.scene, var46.field4939, 0L, false);
				class74.method2114(var46.worldView);
				class210.method4021(var46.worldView);
				class7.addNpcsToScene(var46.worldView, true);
				WorldView var47 = var46.worldView;
				var9 = var47.playerUpdateManager.playerCount;
				int[] var48 = var47.playerUpdateManager.playerIndices;

				for (var11 = 0; var11 < var9; ++var11) {
					if (var48[var11] != Client.combatTargetPlayerIndex && var48[var11] != Client.localPlayerIndex) {
						class425.addPlayerToScene(var47, var48[var11], true);
					}
				}

				class7.addNpcsToScene(var46.worldView, false);
				class170.method3484(var46.worldView);
				class237.method4552(var46.worldView);
			}
		}

		class170.method3484(class358.topLevelWorldView);
		class237.method4552(class358.topLevelWorldView);
		MidiPcmStream.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9994();
		var41 = Client.camAngleX;
		if (Client.field610 / 256 > var41) {
			var41 = Client.field610 / 256;
		}

		if (Client.field598[4] && Client.field714[4] + 128 > var41) {
			var41 = Client.field714[4] + 128;
		}

		var7 = Client.camAngleY & 2047;
		int var8 = class33.oculusOrbFocalPointX;
		var9 = TextureProvider.oculusOrbFocalPointZ;
		int var10 = class76.oculusOrbFocalPointY;
		var11 = var41 * 3 + 600;
		int var14 = var3 - 334;
		if (var14 < 0) {
			var14 = 0;
		} else if (var14 > 100) {
			var14 = 100;
		}

		int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
		int var13 = var15 * var11 / 256;
		var14 = 2048 - var41 & 2047;
		var15 = 2048 - var7 & 2047;
		int var16 = 0;
		int var17 = 0;
		int var18 = var13;
		int var19;
		int var20;
		int var21;
		if (var14 != 0) {
			var19 = Rasterizer3D.Rasterizer3D_sine[var14];
			var20 = Rasterizer3D.Rasterizer3D_cosine[var14];
			var21 = var20 * var17 - var13 * var19 >> 16;
			var18 = var13 * var20 + var17 * var19 >> 16;
			var17 = var21;
		}

		if (var15 != 0) {
			var19 = Rasterizer3D.Rasterizer3D_sine[var15];
			var20 = Rasterizer3D.Rasterizer3D_cosine[var15];
			var21 = var20 * var16 + var19 * var18 >> 16;
			var18 = var20 * var18 - var19 * var16 >> 16;
			var16 = var21;
		}

		if (Client.isCameraLocked) {
			class350.field3738 = var8 - var16;
			class17.field86 = var9 - var17;
			class31.field166 = var10 - var18;
			class47.field332 = var41;
			Tile.field2641 = var7;
		} else {
			PlayerComposition.cameraX = var8 - var16;
			class171.cameraY = var9 - var17;
			UserComparator4.cameraZ = var10 - var18;
			Actor.cameraPitch = var41;
			class206.cameraYaw = var7;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class33.oculusOrbFocalPointX >> 7 != class17.localPlayer.x >> 7 || class76.oculusOrbFocalPointY >> 7 != class17.localPlayer.y >> 7)) {
			var19 = class17.localPlayer.plane;
			var20 = (class33.oculusOrbFocalPointX >> 7) + class358.topLevelWorldView.baseX;
			var21 = (class76.oculusOrbFocalPointY >> 7) + class358.topLevelWorldView.baseY;
			PacketBufferNode var22 = WorldMapElement.getPacketBufferNode(ClientPacket.field3336, Client.packetWriter.isaacCipher);
			var22.packetBuffer.writeByteNeg(var19);
			var22.packetBuffer.writeShortAddLE(var21);
			var22.packetBuffer.writeIntIME(Client.revision);
			var22.packetBuffer.writeShort(var20);
			Client.packetWriter.addNode(var22);
		}

		int var24;
		int var25;
		int var42;
		if (!Client.isCameraLocked) {
			if (class459.clientPreferences.isRoofsHidden()) {
				var14 = class358.topLevelWorldView.plane;
			} else {
				label636: {
					var15 = 3;
					var16 = Interpreter.field899.vmethod8779() >> 7;
					var17 = Interpreter.field899.vmethod8773() >> 7;
					if (Actor.cameraPitch < 310) {
						label626: {
							if (Client.oculusOrbState == 1) {
								var18 = class33.oculusOrbFocalPointX >> 7;
								var19 = class76.oculusOrbFocalPointY >> 7;
							} else {
								var18 = var16;
								var19 = var17;
							}

							var20 = PlayerComposition.cameraX >> 7;
							var21 = UserComparator4.cameraZ >> 7;
							if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
								if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
									if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var20][var21] & 4) != 0) {
										var15 = class358.topLevelWorldView.plane;
									}

									if (var18 > var20) {
										var42 = var18 - var20;
									} else {
										var42 = var20 - var18;
									}

									int var23;
									if (var19 > var21) {
										var23 = var19 - var21;
									} else {
										var23 = var21 - var19;
									}

									if (var42 > var23) {
										var24 = var23 * 65536 / var42;
										var25 = 32768;

										while (true) {
											if (var18 == var20) {
												break label626;
											}

											if (var20 < var18) {
												++var20;
											} else if (var20 > var18) {
												--var20;
											}

											if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var20][var21] & 4) != 0) {
												var15 = class358.topLevelWorldView.plane;
											}

											var25 += var24;
											if (var25 >= 65536) {
												var25 -= 65536;
												if (var21 < var19) {
													++var21;
												} else if (var21 > var19) {
													--var21;
												}

												if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var20][var21] & 4) != 0) {
													var15 = class358.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var23 > 0) {
											var24 = var42 * 65536 / var23;
											var25 = 32768;

											while (var21 != var19) {
												if (var21 < var19) {
													++var21;
												} else if (var21 > var19) {
													--var21;
												}

												if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var20][var21] & 4) != 0) {
													var15 = class358.topLevelWorldView.plane;
												}

												var25 += var24;
												if (var25 >= 65536) {
													var25 -= 65536;
													if (var20 < var18) {
														++var20;
													} else if (var20 > var18) {
														--var20;
													}

													if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var20][var21] & 4) != 0) {
														var15 = class358.topLevelWorldView.plane;
													}
												}
											}
										}
										break label626;
									}
								}

								var14 = class358.topLevelWorldView.plane;
								break label636;
							}

							var14 = class358.topLevelWorldView.plane;
							break label636;
						}
					}

					if (var16 >= 0 && var17 >= 0 && var16 < 13312 && var17 < 13312) {
						if ((class358.topLevelWorldView.tileSettings[class358.topLevelWorldView.plane][var16][var17] & 4) != 0) {
							var15 = class358.topLevelWorldView.plane;
						}

						var14 = var15;
					} else {
						var14 = class358.topLevelWorldView.plane;
					}
				}
			}

			var13 = var14;
		} else {
			var13 = class440.method8290();
		}

		var14 = PlayerComposition.cameraX;
		var15 = class171.cameraY;
		var16 = UserComparator4.cameraZ;
		var17 = Actor.cameraPitch;
		var18 = class206.cameraYaw;

		for (var19 = 0; var19 < 5; ++var19) {
			if (Client.field598[var19]) {
				var20 = (int)(Math.random() * (double)(Client.field744[var19] * 2 + 1) - (double)Client.field744[var19] + Math.sin((double)Client.field709[var19] * ((double)Client.field798[var19] / 100.0D)) * (double)Client.field714[var19]);
				if (var19 == 0) {
					PlayerComposition.cameraX += var20;
				}

				if (var19 == 1) {
					class171.cameraY += var20;
				}

				if (var19 == 2) {
					UserComparator4.cameraZ += var20;
				}

				if (var19 == 3) {
					class206.cameraYaw = var20 + class206.cameraYaw & 2047;
				}

				if (var19 == 4) {
					Actor.cameraPitch += var20;
					if (Actor.cameraPitch < 128) {
						Actor.cameraPitch = 128;
					}

					if (Actor.cameraPitch > 383) {
						Actor.cameraPitch = 383;
					}
				}
			}
		}

		var19 = MouseHandler.MouseHandler_x;
		var20 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var19 = MouseHandler.MouseHandler_lastPressedX;
			var20 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var19 >= var0 && var19 < var0 + var2 && var20 >= var1 && var20 < var3 + var1) {
			Projection.method5163(var19 - var0, var20 - var1);
		} else {
			class142.method3192();
		}

		class212.method4031();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class212.method4031();
		var21 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4698(class188.client.field203);
		Rasterizer3D.clips.field2976 = Client.viewportZoom;
		class358.topLevelWorldView.scene.draw(PlayerComposition.cameraX, class171.cameraY, UserComparator4.cameraZ, Actor.cameraPitch, class206.cameraYaw, var13);
		Rasterizer3D.method4698(false);
		if (Client.z) {
			Rasterizer2D.method9995();
		}

		Rasterizer3D.clips.field2976 = var21;
		class212.method4031();
		class358.topLevelWorldView.scene.setViewportWalking();

		for (var42 = 0; var42 < class358.topLevelWorldView.worldEntityCount; ++var42) {
			WorldEntity var45 = class358.topLevelWorldView.worldEntities[class358.topLevelWorldView.worldEntityIndices[var42]];
			if (var45 != null) {
				var45.worldView.scene.setViewportWalking();
			}
		}

		WorldView var49 = class358.topLevelWorldView;
		Client.overheadTextCount = 0;
		boolean var50 = false;
		var24 = -1;
		var25 = -1;
		int var26 = var49.playerUpdateManager.playerCount;
		int[] var27 = var49.playerUpdateManager.playerIndices;

		int var28;
		for (var28 = 0; var28 < var26 + var49.npcCount; ++var28) {
			Object var44;
			if (var28 < var26) {
				var44 = var49.players[var27[var28]];
				if (var27[var28] == Client.combatTargetPlayerIndex) {
					var50 = true;
					var24 = var28;
					continue;
				}

				if (var44 == class17.localPlayer) {
					var25 = var28;
					continue;
				}
			} else {
				var44 = var49.npcs[var49.npcIndices[var28 - var26]];
			}

			class47.drawActor2d(var49, (Actor)var44, var28, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var25 != -1) {
			class47.drawActor2d(var49, class17.localPlayer, var25, var0, var1, var2, var3);
		}

		if (var50) {
			class47.drawActor2d(var49, var49.players[Client.combatTargetPlayerIndex], var24, var0, var1, var2, var3);
		}

		for (var28 = 0; var28 < Client.overheadTextCount; ++var28) {
			int var29 = Client.overheadTextXs[var28];
			int var30 = Client.overheadTextYs[var28];
			int var31 = Client.overheadTextXOffsets[var28];
			int var32 = Client.overheadTextAscents[var28];
			boolean var33 = true;

			while (var33) {
				var33 = false;

				for (int var43 = 0; var43 < var28; ++var43) {
					if (var30 + 2 > Client.overheadTextYs[var43] - Client.overheadTextAscents[var43] && var30 - var32 < Client.overheadTextYs[var43] + 2 && var29 - var31 < Client.overheadTextXOffsets[var43] + Client.overheadTextXs[var43] && var31 + var29 > Client.overheadTextXs[var43] - Client.overheadTextXOffsets[var43] && Client.overheadTextYs[var43] - Client.overheadTextAscents[var43] < var30) {
						var30 = Client.overheadTextYs[var43] - Client.overheadTextAscents[var43];
						var33 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var28];
			Client.viewportTempY = Client.overheadTextYs[var28] = var30;
			String var34 = Client.overheadText[var28];
			if (Client.chatEffects == 0) {
				int var35 = 16776960;
				if (Client.overheadTextColors[var28] < 6) {
					var35 = Client.field825[Client.overheadTextColors[var28]];
				}

				if (Client.overheadTextColors[var28] == 6) {
					var35 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var28] == 7) {
					var35 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var28] == 8) {
					var35 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var36;
				if (Client.overheadTextColors[var28] == 9) {
					var36 = 150 - Client.overheadTextCyclesRemaining[var28];
					if (var36 < 50) {
						var35 = var36 * 1280 + 16711680;
					} else if (var36 < 100) {
						var35 = 16776960 - (var36 - 50) * 327680;
					} else if (var36 < 150) {
						var35 = (var36 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var28] == 10) {
					var36 = 150 - Client.overheadTextCyclesRemaining[var28];
					if (var36 < 50) {
						var35 = var36 * 5 + 16711680;
					} else if (var36 < 100) {
						var35 = 16711935 - (var36 - 50) * 327680;
					} else if (var36 < 150) {
						var35 = (var36 - 100) * 327680 + 255 - (var36 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var28] == 11) {
					var36 = 150 - Client.overheadTextCyclesRemaining[var28];
					if (var36 < 50) {
						var35 = 16777215 - var36 * 327685;
					} else if (var36 < 100) {
						var35 = (var36 - 50) * 327685 + 65280;
					} else if (var36 < 150) {
						var35 = 16777215 - (var36 - 100) * 327680;
					}
				}

				int var37;
				if (Client.overheadTextColors[var28] == 12 && Client.field787[var28] == null) {
					var36 = var34.length();
					Client.field787[var28] = new int[var36];

					for (var37 = 0; var37 < var36; ++var37) {
						int var38 = (int)((float)var37 / (float)var36 * 64.0F);
						int var39 = var38 << 10 | 896 | 64;
						Client.field787[var28][var37] = class497.field5035[var39];
					}
				}

				if (Client.overheadTextEffects[var28] == 0) {
					WorldMapRenderer.fontBold12.method8149(var34, var0 + Client.viewportTempX, Client.viewportTempY + var1, var35, 0, Client.field787[var28]);
				}

				if (Client.overheadTextEffects[var28] == 1) {
					WorldMapRenderer.fontBold12.method8206(var34, var0 + Client.viewportTempX, Client.viewportTempY + var1, var35, 0, Client.viewportDrawCount, Client.field787[var28]);
				}

				if (Client.overheadTextEffects[var28] == 2) {
					WorldMapRenderer.fontBold12.method8188(var34, var0 + Client.viewportTempX, Client.viewportTempY + var1, var35, 0, Client.viewportDrawCount, Client.field787[var28]);
				}

				if (Client.overheadTextEffects[var28] == 3) {
					WorldMapRenderer.fontBold12.method8148(var34, var0 + Client.viewportTempX, Client.viewportTempY + var1, var35, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var28], Client.field787[var28]);
				}

				if (Client.overheadTextEffects[var28] == 4) {
					var36 = (150 - Client.overheadTextCyclesRemaining[var28]) * (WorldMapRenderer.fontBold12.stringWidth(var34) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					WorldMapRenderer.fontBold12.method8150(var34, var0 + Client.viewportTempX + 50 - var36, Client.viewportTempY + var1, var35, 0, Client.field787[var28]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var28] == 5) {
					var36 = 150 - Client.overheadTextCyclesRemaining[var28];
					var37 = 0;
					if (var36 < 25) {
						var37 = var36 - 25;
					} else if (var36 > 125) {
						var37 = var36 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - WorldMapRenderer.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					WorldMapRenderer.fontBold12.method8149(var34, var0 + Client.viewportTempX, var37 + Client.viewportTempY + var1, var35, 0, Client.field787[var28]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				WorldMapRenderer.fontBold12.drawCentered(var34, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		class319.method6168(class358.topLevelWorldView, var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class365.method7116();
		PlayerComposition.cameraX = var14;
		class171.cameraY = var15;
		UserComparator4.cameraZ = var16;
		Actor.cameraPitch = var17;
		class206.cameraYaw = var18;
		if (Client.isLoading && HttpMethod.field32.method7330(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			IgnoreList.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
