import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bb")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 416329001)
	@Export("count")
	int count;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1438497145)
	@Export("cycle")
	int cycle;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1486723785)
	@Export("type")
	int type;

	@ObfuscatedName("v")
	@Export("sender")
	String sender;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("senderUsername")
	Username senderUsername;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("isFromFriend0")
	TriBool isFromFriend0;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	@ObfuscatedName("k")
	@Export("prefix")
	String prefix;

	@ObfuscatedName("o")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "-865547233")
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Tiles.method1973();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "80")
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "14")
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}
		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-121")
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = (class321.friendSystem.friendsList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-28")
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "324")
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}
		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-631698220")
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = (class321.friendSystem.ignoreList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1796016513")
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(WorldMapSection0.method4870(this.sender), StructComposition.loginType);
		} else {
			this.senderUsername = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "896718913")
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)Lqe;", garbageValue = "791659901")
	static IndexedSprite method1044() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class457.SpriteBuffer_spriteWidth;
		var0.height = class457.SpriteBuffer_spriteHeight;
		var0.xOffset = class457.SpriteBuffer_xOffsets[0];
		var0.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0];
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SoundCache.SpriteBuffer_spriteHeights[0];
		var0.palette = class457.SpriteBuffer_spritePalette;
		var0.pixels = class181.SpriteBuffer_pixels[0];
		class457.SpriteBuffer_xOffsets = null;
		InterfaceParent.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		SoundCache.SpriteBuffer_spriteHeights = null;
		class457.SpriteBuffer_spritePalette = null;
		class181.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1955729170")
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class352.method6437();
		if (Client.renderSelf) {
			class9.addPlayerToScene(ScriptFrame.localPlayer, false);
		}
		class347.method6250();
		class132.addNpcsToScene(true);
		PcmPlayer.method689();
		class132.addNpcsToScene(false);
		int var6;
		for (Projectile var4 = ((Projectile) (Client.projectiles.last())); var4 != null; var4 = ((Projectile) (Client.projectiles.previous()))) {
			if (var4.plane == class268.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var37 = Client.npcs[var4.targetIndex - 1];
						if (var37 != null && var37.x >= 0 && var37.x < 13312 && var37.y >= 0 && var37.y < 13312) {
							var4.setDestination(var37.x, var37.y, ObjectComposition.getTileHeight(var37.x, var37.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}
					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var40;
						if (var6 == Client.localPlayerIndex) {
							var40 = ScriptFrame.localPlayer;
						} else {
							var40 = Client.players[var6];
						}
						if (var40 != null && var40.x >= 0 && var40.x < 13312 && var40.y >= 0 && var40.y < 13312) {
							var4.setDestination(var40.x, var40.y, ObjectComposition.getTileHeight(var40.x, var40.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}
					var4.advance(Client.field599);
					class12.scene.drawEntity(class268.Client_plane, ((int) (var4.x)), ((int) (var4.y)), ((int) (var4.z)), 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}
		for (GraphicsObject var38 = ((GraphicsObject) (Client.graphicsObjects.last())); var38 != null; var38 = ((GraphicsObject) (Client.graphicsObjects.previous()))) {
			if (var38.plane == class268.Client_plane && !var38.isFinished) {
				if (Client.cycle >= var38.cycleStart) {
					var38.advance(Client.field599);
					if (var38.isFinished) {
						var38.remove();
					} else {
						class12.scene.drawEntity(var38.plane, var38.x, var38.y, var38.z, 60, var38, 0, -1L, false);
					}
				}
			} else {
				var38.remove();
			}
		}
		class134.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var34 = Client.camAngleX;
		if (Client.field658 / 256 > var34) {
			var34 = Client.field658 / 256;
		}
		if (Client.field738[4] && Client.field740[4] + 128 > var34) {
			var34 = Client.field740[4] + 128;
		}
		int var5 = Client.camAngleY & 2047;
		var6 = FloorOverlayDefinition.oculusOrbFocalPointX;
		int var7 = EnumComposition.field1891;
		int var8 = AbstractUserComparator.oculusOrbFocalPointY;
		int var9 = HealthBarUpdate.method2170(var34);
		var9 = World.method1624(var9, var3);
		int var10 = 2048 - var34 & 2047;
		int var11 = 2048 - var5 & 2047;
		int var12 = 0;
		int var13 = 0;
		int var14 = var9;
		int var15;
		int var16;
		int var17;
		if (var10 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var10];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
			var17 = var16 * var13 - var9 * var15 >> 16;
			var14 = var16 * var9 + var15 * var13 >> 16;
			var13 = var17;
		}
		if (var11 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var11];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var17 = var15 * var14 + var16 * var12 >> 16;
			var14 = var16 * var14 - var15 * var12 >> 16;
			var12 = var17;
		}
		if (Client.isCameraLocked) {
			SoundCache.field323 = var6 - var12;
			class402.field4448 = var7 - var13;
			NetCache.field4039 = var8 - var14;
			ItemContainer.field1003 = var34;
			class291.field3324 = var5;
		} else {
			class16.cameraX = var6 - var12;
			WorldMapLabel.cameraY = var7 - var13;
			class269.cameraZ = var8 - var14;
			class82.cameraPitch = var34;
			ClientPreferences.cameraYaw = var5;
		}
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (FloorOverlayDefinition.oculusOrbFocalPointX >> 7 != ScriptFrame.localPlayer.x >> 7 || AbstractUserComparator.oculusOrbFocalPointY >> 7 != ScriptFrame.localPlayer.y >> 7)) {
			var15 = ScriptFrame.localPlayer.plane;
			var16 = Decimator.baseX * 8 + (FloorOverlayDefinition.oculusOrbFocalPointX >> 7);
			var17 = class7.baseY * 64 + (AbstractUserComparator.oculusOrbFocalPointY >> 7);
			class9.method79(var16, var17, var15, true);
		}
		if (!Client.isCameraLocked) {
			var10 = class116.method2682();
		} else {
			var10 = class133.method2846();
		}
		var11 = class16.cameraX;
		var12 = WorldMapLabel.cameraY;
		var13 = class269.cameraZ;
		var14 = class82.cameraPitch;
		var15 = ClientPreferences.cameraYaw;
		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field738[var16]) {
				var17 = ((int) (Math.random() * ((double) (Client.field739[var16] * 2 + 1)) - ((double) (Client.field739[var16])) + Math.sin(((double) (Client.field615[var16])) * (((double) (Client.field758[var16])) / 100.0)) * ((double) (Client.field740[var16]))));
				if (var16 == 0) {
					class16.cameraX += var17;
				}
				if (var16 == 1) {
					WorldMapLabel.cameraY += var17;
				}
				if (var16 == 2) {
					class269.cameraZ += var17;
				}
				if (var16 == 3) {
					ClientPreferences.cameraYaw = var17 + ClientPreferences.cameraYaw & 2047;
				}
				if (var16 == 4) {
					class82.cameraPitch += var17;
					if (class82.cameraPitch < 128) {
						class82.cameraPitch = 128;
					}
					if (class82.cameraPitch > 383) {
						class82.cameraPitch = 383;
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
			class342.method6200(var16 - var0, var17 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}
		class83.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class83.playPcmPlayers();
		int var18 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		class12.scene.draw(class16.cameraX, WorldMapLabel.cameraY, class269.cameraZ, class82.cameraPitch, ClientPreferences.cameraYaw, var10);
		Rasterizer3D.Rasterizer3D_zoom = var18;
		class83.playPcmPlayers();
		class12.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var19 = false;
		int var20 = -1;
		int var21 = -1;
		int var22 = Players.Players_count;
		int[] var23 = Players.Players_indices;
		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) {
			Object var36;
			if (var24 < var22) {
				var36 = Client.players[var23[var24]];
				if (var23[var24] == Client.combatTargetPlayerIndex) {
					var19 = true;
					var20 = var24;
					continue;
				}
				if (var36 == ScriptFrame.localPlayer) {
					var21 = var24;
					continue;
				}
			} else {
				var36 = Client.npcs[Client.npcIndices[var24 - var22]];
			}
			TileItem.drawActor2d(((Actor) (var36)), var24, var0, var1, var2, var3);
		}
		if (Client.renderSelf && var21 != -1) {
			TileItem.drawActor2d(ScriptFrame.localPlayer, var21, var0, var1, var2, var3);
		}
		if (var19) {
			TileItem.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3);
		}
		for (var24 = 0; var24 < Client.overheadTextCount; ++var24) {
			int var25 = Client.overheadTextXs[var24];
			int var26 = Client.overheadTextYs[var24];
			int var27 = Client.overheadTextXOffsets[var24];
			int var28 = Client.overheadTextAscents[var24];
			boolean var29 = true;
			while (var29) {
				var29 = false;
				for (int var35 = 0; var35 < var24; ++var35) {
					if (var26 + 2 > Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] && var26 - var28 < Client.overheadTextYs[var35] + 2 && var25 - var27 < Client.overheadTextXs[var35] + Client.overheadTextXOffsets[var35] && var25 + var27 > Client.overheadTextXs[var35] - Client.overheadTextXOffsets[var35] && Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] < var26) {
						var26 = Client.overheadTextYs[var35] - Client.overheadTextAscents[var35];
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
					var31 = Client.field768[Client.overheadTextColors[var24]];
				}
				if (Client.overheadTextColors[var24] == 6) {
					var31 = (Client.viewportDrawCount % 20 < 10) ? 16711680 : 16776960;
				}
				if (Client.overheadTextColors[var24] == 7) {
					var31 = (Client.viewportDrawCount % 20 < 10) ? 255 : '￿';
				}
				if (Client.overheadTextColors[var24] == 8) {
					var31 = (Client.viewportDrawCount % 20 < 10) ? '뀀' : 8454016;
				}
				int var32;
				if (Client.overheadTextColors[var24] == 9) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) {
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 5 + '＀';
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
						var31 = (var32 - 50) * 327685 + '＀';
					} else if (var32 < 150) {
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}
				if (Client.overheadTextEffects[var24] == 0) {
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0);
				}
				if (Client.overheadTextEffects[var24] == 1) {
					WorldMapSection2.fontBold12.drawCenteredWave(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}
				if (Client.overheadTextEffects[var24] == 2) {
					WorldMapSection2.fontBold12.drawCenteredWave2(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}
				if (Client.overheadTextEffects[var24] == 3) {
					WorldMapSection2.fontBold12.drawCenteredShake(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var24]);
				}
				if (Client.overheadTextEffects[var24] == 4) {
					var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (WorldMapSection2.fontBold12.stringWidth(var30) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					WorldMapSection2.fontBold12.draw(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
				if (Client.overheadTextEffects[var24] == 5) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					int var33 = 0;
					if (var32 < 25) {
						var33 = var32 - 25;
					} else if (var32 > 125) {
						var33 = var32 - 125;
					}
					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - WorldMapSection2.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}
		UserComparator6.method2611(var0, var1);
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).animate(Client.field599);
		class301.method5663(var0, var1, var2, var3);
		class16.cameraX = var11;
		WorldMapLabel.cameraY = var12;
		class269.cameraZ = var13;
		class82.cameraPitch = var14;
		ClientPreferences.cameraYaw = var15;
		if (Client.isLoading) {
			byte var39 = 0;
			var20 = var39 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
			if (var20 == 0) {
				Client.isLoading = false;
			}
		}
		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class20.drawLoadingMessage("Loading - please wait.", false);
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(descriptor = "(IIIIIIIII)V", garbageValue = "2050182663")
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ParamComposition.loadInterface(var0)) {
			GraphicsObject.field840 = null;
			FileSystem.drawInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (GraphicsObject.field840 != null) {
				FileSystem.drawInterface(GraphicsObject.field840, -1412584499, var1, var2, var3, var4, HealthBar.field1249, UserComparator7.field1374, var7);
				GraphicsObject.field840 = null;
			}
		} else if (var7 != -1) {
			Client.field643[var7] = true;
		} else {
			for (int var8 = 0; var8 < 100; ++var8) {
				Client.field643[var8] = true;
			}
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(descriptor = "(Lkn;IIZI)V", garbageValue = "-251504851")
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}
		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}
		if (var0.widthAlignment == 4) {
			var0.width = var0.field3350 * var0.height / var0.field3375;
		}
		if (var0.heightAlignment == 4) {
			var0.height = var0.field3375 * var0.width / var0.field3350;
		}
		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}
		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(descriptor = "(II)Lpz;", garbageValue = "1435072995")
	static class437 method1060(int var0) {
		class437 var1 = ((class437) (Client.DBTableIndex_cache.get(((long) (var0)))));
		if (var1 == null) {
			var1 = new class437(Timer.field4232, class145.method3023(var0), ClanSettings.method2909(var0));
			Client.DBTableIndex_cache.put(var1, ((long) (var0)));
		}
		return var1;
	}
}