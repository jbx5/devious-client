import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1965058737
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ao")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkp;",
		garbageValue = "12"
	)
	static WorldMapSectionType[] method5645() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1};
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1568358623"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class316.fontPlain12.lineWidth(var0, 250);
			int var6 = class316.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			class316.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			GrandExchangeOfferWorldComparator.invalidateWidgetsUnder(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
			if (var1) {
				UserComparator9.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
						Client.field816[var11] = true;
					}
				}
			}

		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2112871261"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class133.localPlayer.x >> 7 == Client.destinationX && class133.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		NPC.method2650();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class167.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		ServerPacket.addNpcsToScene(true);
		NPCComposition.method3903();
		ServerPacket.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == class172.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					NPC var17;
					Player var18;
					if (!var4.isMoving && var4.field979 != 0) {
						if (var4.field979 > 0) {
							var17 = Client.npcs[var4.field979 - 1];
							if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) {
								var4.sourceX = var17.x;
								var4.sourceY = var17.y;
								var4.setDestination(var4.field972, var4.field973, var4.field974, Client.cycle);
							}
						} else {
							var6 = -var4.field979 - 1;
							if (var6 == Client.localPlayerIndex) {
								var18 = class133.localPlayer;
							} else {
								var18 = Client.players[var6];
							}

							if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) {
								var4.sourceX = var18.x;
								var4.sourceY = var18.y;
								var4.setDestination(var4.field972, var4.field973, var4.field974, Client.cycle);
							}
						}
					}

					if (var4.targetIndex > 0) {
						var17 = Client.npcs[var4.targetIndex - 1];
						if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) {
							var4.setDestination(var17.x, var17.y, Canvas.getTileHeight(var17.x, var17.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						if (var6 == Client.localPlayerIndex) {
							var18 = class133.localPlayer;
						} else {
							var18 = Client.players[var6];
						}

						if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) {
							var4.setDestination(var18.x, var18.y, Canvas.getTileHeight(var18.x, var18.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.graphicsCycle);
					LoginType.scene.drawEntity(class172.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		class421.method7808();
		SecureRandomFuture.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9619();
		int var16 = Client.camAngleX;
		if (Client.field612 / 256 > var16) {
			var16 = Client.field612 / 256;
		}

		if (Client.field780[4] && Client.field782[4] + 128 > var16) {
			var16 = Client.field782[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		class128.method2989(class185.oculusOrbFocalPointX, FloorUnderlayDefinition.field2198, Skeleton.oculusOrbFocalPointY, var16, var5, UserComparator5.method2898(var16), var3);
		int var7;
		int var8;
		if (!Client.isCameraLocked) {
			var6 = ObjectComposition.method4130();
		} else {
			if (NPC.clientPreferences.isRoofsHidden()) {
				var7 = class172.Client_plane;
			} else {
				var8 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane);
				if (var8 - MouseHandler.cameraY < 800 && (Tiles.Tiles_renderFlags[class172.Client_plane][WorldMapLabelSize.cameraX >> 7][class193.cameraZ >> 7] & 4) != 0) {
					var7 = class172.Client_plane;
				} else {
					var7 = 3;
				}
			}

			var6 = var7;
		}

		var7 = WorldMapLabelSize.cameraX;
		var8 = MouseHandler.cameraY;
		int var9 = class193.cameraZ;
		int var10 = UserComparator10.cameraPitch;
		int var11 = class17.cameraYaw;

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field780[var12]) {
				var13 = (int)(Math.random() * (double)(Client.field744[var12] * 2 + 1) - (double)Client.field744[var12] + Math.sin((double)Client.field784[var12] * ((double)Client.field548[var12] / 100.0D)) * (double)Client.field782[var12]);
				if (var12 == 0) {
					WorldMapLabelSize.cameraX += var13;
				}

				if (var12 == 1) {
					MouseHandler.cameraY += var13;
				}

				if (var12 == 2) {
					class193.cameraZ += var13;
				}

				if (var12 == 3) {
					class17.cameraYaw = var13 + class17.cameraYaw & 2047;
				}

				if (var12 == 4) {
					UserComparator10.cameraPitch += var13;
					if (UserComparator10.cameraPitch < 128) {
						UserComparator10.cameraPitch = 128;
					}

					if (UserComparator10.cameraPitch > 383) {
						UserComparator10.cameraPitch = 383;
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

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
			var14 = var12 - var0;
			int var15 = var13 - var1;
			ViewportMouse.ViewportMouse_x = var14;
			ViewportMouse.ViewportMouse_y = var15;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class167.method3417();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class167.method3417();
		var14 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4562(UrlRequest.client.field172);
		Rasterizer3D.clips.field2889 = Client.viewportZoom;
		LoginType.scene.draw(WorldMapLabelSize.cameraX, MouseHandler.cameraY, class193.cameraZ, UserComparator10.cameraPitch, class17.cameraYaw, var6);
		Rasterizer3D.method4562(false);
		if (Client.z) {
			Rasterizer2D.method9605();
		}

		Rasterizer3D.clips.field2889 = var14;
		class167.method3417();
		LoginType.scene.clearTempGameObjects();
		HealthBar.method2578(var0, var1, var2, var3);
		class53.method1052(var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class36.method664(var0, var1, var2, var3);
		WorldMapLabelSize.cameraX = var7;
		MouseHandler.cameraY = var8;
		class193.cameraZ = var9;
		UserComparator10.cameraPitch = var10;
		class17.cameraYaw = var11;
		if (Client.isLoading && ChatChannel.field1023.method7059(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
