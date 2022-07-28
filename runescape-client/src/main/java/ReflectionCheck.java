import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
@ObfuscatedName("ah")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1004737745)
	@Export("id")
	int id;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 190483797)
	@Export("size")
	int size;

	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;

	@ObfuscatedName("u")
	@Export("operations")
	int[] operations;

	@ObfuscatedName("c")
	@Export("creationErrors")
	int[] creationErrors;

	@ObfuscatedName("w")
	@Export("fields")
	Field[] fields;

	@ObfuscatedName("z")
	@Export("methods")
	Method[] methods;

	@ObfuscatedName("j")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lno;", garbageValue = "-1227122759")
	public static class387 method612() {
		synchronized(class387.field4403) {
			if (class126.field1537 == 0) {
				return new class387();
			} else {
				class387.field4403[--class126.field1537].method6974();
				return class387.field4403[class126.field1537];
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1344069596")
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (GameObject.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!class228.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = class228.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				GameObject.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}
				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = class228.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}
				GameObject.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "4")
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class13.method173();
		UserComparator7.method2670();
		class10.method97();
		Skeleton.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;
		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				Tile.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}
		Skeleton.addNpcsToScene(false);
		WorldMapIcon_1.method4559();
		StudioGame.method5763();
		class115.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		var4 = Client.camAngleX;
		if (Client.field581 / 256 > var4) {
			var4 = Client.field581 / 256;
		}
		if (Client.field678[4] && Client.field654[4] + 128 > var4) {
			var4 = Client.field654[4] + 128;
		}
		int var35 = Client.camAngleY & 2047;
		var6 = ObjectSound.oculusOrbFocalPointX;
		int var7 = FileSystem.field1753;
		int var8 = class306.oculusOrbFocalPointY;
		int var9 = var4 * 3 + 600;
		int var10 = HitSplatDefinition.method3637(var9, var3);
		int var11 = 2048 - var4 & 2047;
		int var12 = 2048 - var35 & 2047;
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
			var18 = var16 * var15 + var17 * var13 >> 16;
			var15 = var17 * var15 - var16 * var13 >> 16;
			var13 = var18;
		}
		if (Client.isCameraLocked) {
			Tiles.field993 = var6 - var13;
			ScriptFrame.field461 = var7 - var14;
			class122.field1500 = var8 - var15;
			Canvas.field164 = var4;
			class263.field3029 = var35;
		} else {
			WorldMapLabelSize.cameraX = var6 - var13;
			class123.cameraY = var7 - var14;
			Widget.cameraZ = var8 - var15;
			UserComparator9.cameraPitch = var4;
			PendingSpawn.cameraYaw = var35;
		}
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ObjectSound.oculusOrbFocalPointX >> 7 != class28.localPlayer.x >> 7 || class306.oculusOrbFocalPointY >> 7 != class28.localPlayer.y >> 7)) {
			var16 = class28.localPlayer.plane;
			var17 = class300.baseX * 8 + (ObjectSound.oculusOrbFocalPointX >> 7);
			var18 = Message.baseY * 64 + (class306.oculusOrbFocalPointY >> 7);
			PacketBufferNode var19 = class433.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
			var19.packetBuffer.writeByteAdd(var16);
			var19.packetBuffer.writeIntIME(Client.field698);
			var19.packetBuffer.writeShortAddLE(var18);
			var19.packetBuffer.writeShortAddLE(var17);
			Client.packetWriter.addNode(var19);
		}
		int var20;
		int var21;
		int var36;
		if (!Client.isCameraLocked) {
			if (class260.clientPreferences.method2312()) {
				var12 = FriendSystem.Client_plane;
			} else {
				label560 : {
					var13 = 3;
					if (UserComparator9.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var14 = ObjectSound.oculusOrbFocalPointX >> 7;
							var15 = class306.oculusOrbFocalPointY >> 7;
						} else {
							var14 = class28.localPlayer.x >> 7;
							var15 = class28.localPlayer.y >> 7;
						}
						var16 = WorldMapLabelSize.cameraX >> 7;
						var17 = Widget.cameraZ >> 7;
						if (var16 < 0 || var17 < 0 || var16 >= 104 || var17 >= 104) {
							var12 = FriendSystem.Client_plane;
							break label560;
						}
						if (var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
							var12 = FriendSystem.Client_plane;
							break label560;
						}
						if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) {
							var13 = FriendSystem.Client_plane;
						}
						if (var14 > var16) {
							var18 = var14 - var16;
						} else {
							var18 = var16 - var14;
						}
						if (var15 > var17) {
							var36 = var15 - var17;
						} else {
							var36 = var17 - var15;
						}
						if (var18 > var36) {
							var20 = var36 * 65536 / var18;
							var21 = 32768;
							while (var16 != var14) {
								if (var16 < var14) {
									++var16;
								} else if (var16 > var14) {
									--var16;
								}
								if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) {
									var13 = FriendSystem.Client_plane;
								}
								var21 += var20;
								if (var21 >= 65536) {
									var21 -= 65536;
									if (var17 < var15) {
										++var17;
									} else if (var17 > var15) {
										--var17;
									}
									if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) {
										var13 = FriendSystem.Client_plane;
									}
								}
							} 
						} else if (var36 > 0) {
							var20 = var18 * 65536 / var36;
							var21 = 32768;
							while (var17 != var15) {
								if (var17 < var15) {
									++var17;
								} else if (var17 > var15) {
									--var17;
								}
								if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) {
									var13 = FriendSystem.Client_plane;
								}
								var21 += var20;
								if (var21 >= 65536) {
									var21 -= 65536;
									if (var16 < var14) {
										++var16;
									} else if (var16 > var14) {
										--var16;
									}
									if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) {
										var13 = FriendSystem.Client_plane;
									}
								}
							} 
						}
					}
					if (class28.localPlayer.x >= 0 && class28.localPlayer.y >= 0 && class28.localPlayer.x < 13312 && class28.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][class28.localPlayer.x >> 7][class28.localPlayer.y >> 7] & 4) != 0) {
							var13 = FriendSystem.Client_plane;
						}
						var12 = var13;
					} else {
						var12 = FriendSystem.Client_plane;
					}
				}
			}
			var11 = var12;
		} else {
			var11 = class162.method3283();
		}
		var12 = WorldMapLabelSize.cameraX;
		var13 = class123.cameraY;
		var14 = Widget.cameraZ;
		var15 = UserComparator9.cameraPitch;
		var16 = PendingSpawn.cameraYaw;
		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field678[var17]) {
				var18 = ((int) (Math.random() * ((double) (Client.field747[var17] * 2 + 1)) - ((double) (Client.field747[var17])) + Math.sin(((double) (Client.field749[var17])) / 100.0 * ((double) (Client.field653[var17]))) * ((double) (Client.field654[var17]))));
				if (var17 == 0) {
					WorldMapLabelSize.cameraX += var18;
				}
				if (var17 == 1) {
					class123.cameraY += var18;
				}
				if (var17 == 2) {
					Widget.cameraZ += var18;
				}
				if (var17 == 3) {
					PendingSpawn.cameraYaw = var18 + PendingSpawn.cameraYaw & 2047;
				}
				if (var17 == 4) {
					UserComparator9.cameraPitch += var18;
					if (UserComparator9.cameraPitch < 128) {
						UserComparator9.cameraPitch = 128;
					}
					if (UserComparator9.cameraPitch > 383) {
						UserComparator9.cameraPitch = 383;
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
		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			var36 = var17 - var0;
			var20 = var18 - var1;
			ViewportMouse.ViewportMouse_x = var36;
			ViewportMouse.ViewportMouse_y = var20;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			class93.method2461();
		}
		class12.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class12.playPcmPlayers();
		var36 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		Decimator.scene.draw(WorldMapLabelSize.cameraX, class123.cameraY, Widget.cameraZ, UserComparator9.cameraPitch, PendingSpawn.cameraYaw, var11);
		Rasterizer3D.Rasterizer3D_zoom = var36;
		class12.playPcmPlayers();
		Decimator.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var39 = false;
		var21 = -1;
		int var22 = -1;
		int var23 = Players.Players_count;
		int[] var24 = Players.Players_indices;
		int var25;
		for (var25 = 0; var25 < var23 + Client.npcCount; ++var25) {
			Object var38;
			if (var25 < var23) {
				var38 = Client.players[var24[var25]];
				if (var24[var25] == Client.combatTargetPlayerIndex) {
					var39 = true;
					var21 = var25;
					continue;
				}
				if (var38 == class28.localPlayer) {
					var22 = var25;
					continue;
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var25 - var23]];
			}
			ChatChannel.drawActor2d(((Actor) (var38)), var25, var0, var1, var2, var3);
		}
		if (Client.renderSelf && var22 != -1) {
			ChatChannel.drawActor2d(class28.localPlayer, var22, var0, var1, var2, var3);
		}
		if (var39) {
			ChatChannel.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3);
		}
		for (var25 = 0; var25 < Client.overheadTextCount; ++var25) {
			int var26 = Client.overheadTextXs[var25];
			int var27 = Client.overheadTextYs[var25];
			int var28 = Client.overheadTextXOffsets[var25];
			int var29 = Client.overheadTextAscents[var25];
			boolean var30 = true;
			while (var30) {
				var30 = false;
				for (int var37 = 0; var37 < var25; ++var37) {
					if (var27 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var27 - var29 < Client.overheadTextYs[var37] + 2 && var26 - var28 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var26 + var28 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var27) {
						var27 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37];
						var30 = true;
					}
				}
			} 
			Client.viewportTempX = Client.overheadTextXs[var25];
			Client.viewportTempY = Client.overheadTextYs[var25] = var27;
			String var31 = Client.overheadText[var25];
			if (Client.chatEffects == 0) {
				int var32 = 16776960;
				if (Client.overheadTextColors[var25] < 6) {
					var32 = Client.field555[Client.overheadTextColors[var25]];
				}
				if (Client.overheadTextColors[var25] == 6) {
					var32 = (Client.viewportDrawCount % 20 < 10) ? 16711680 : 16776960;
				}
				if (Client.overheadTextColors[var25] == 7) {
					var32 = (Client.viewportDrawCount % 20 < 10) ? 255 : '￿';
				}
				if (Client.overheadTextColors[var25] == 8) {
					var32 = (Client.viewportDrawCount % 20 < 10) ? '뀀' : 8454016;
				}
				int var33;
				if (Client.overheadTextColors[var25] == 9) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = var33 * 1280 + 16711680;
					} else if (var33 < 100) {
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 5 + '＀';
					}
				}
				if (Client.overheadTextColors[var25] == 10) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}
				if (Client.overheadTextColors[var25] == 11) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = (var33 - 50) * 327685 + '＀';
					} else if (var33 < 150) {
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}
				if (Client.overheadTextEffects[var25] == 0) {
					class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0);
				}
				if (Client.overheadTextEffects[var25] == 1) {
					class116.fontBold12.drawCenteredWave(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}
				if (Client.overheadTextEffects[var25] == 2) {
					class116.fontBold12.drawCenteredWave2(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}
				if (Client.overheadTextEffects[var25] == 3) {
					class116.fontBold12.drawCenteredShake(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var25]);
				}
				if (Client.overheadTextEffects[var25] == 4) {
					var33 = (150 - Client.overheadTextCyclesRemaining[var25]) * (class116.fontBold12.stringWidth(var31) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class116.fontBold12.draw(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
				if (Client.overheadTextEffects[var25] == 5) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					int var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}
					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class116.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}
		class127.method2887(var0, var1);
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).animate(Client.field744);
		class116.method2766(var0, var1, var2, var3);
		WorldMapLabelSize.cameraX = var12;
		class123.cameraY = var13;
		Widget.cameraZ = var14;
		UserComparator9.cameraPitch = var15;
		PendingSpawn.cameraYaw = var16;
		if (Client.isLoading) {
			byte var40 = 0;
			var21 = var40 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var21 == 0) {
				Client.isLoading = false;
			}
		}
		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class273.drawLoadingMessage("Loading - please wait.", false);
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "102")
	static final void method610(int var0) {
		if (loadInterface(var0)) {
			WorldMapLabelSize.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
		}
	}
}