import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 227775
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 5047651792030600117L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("am")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ax")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lvf;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method7702(2);
		this.grandExchangeOffer.method7703(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "103"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1431655765"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1618136761"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		ClientPreferences.topLevelWorldView.scene.cycle = Client.cycle;
		class106.method2957();
		IgnoreList.method8786(ClientPreferences.topLevelWorldView);
		WorldView var4 = ClientPreferences.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var4.players[Client.combatTargetPlayerIndex] != null) {
			Decimator.addPlayerToScene(var4, Client.combatTargetPlayerIndex, false);
		}

		class132.addNpcsToScene(ClientPreferences.topLevelWorldView, true);
		WorldView var5 = ClientPreferences.topLevelWorldView;
		int var6 = Client.playerUpdateManager.playerCount;
		int[] var7 = Client.playerUpdateManager.playerIndices;

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			if (var7[var8] != Client.combatTargetPlayerIndex && var7[var8] != Client.localPlayerIndex) {
				Decimator.addPlayerToScene(var5, var7[var8], true);
			}
		}

		class132.addNpcsToScene(ClientPreferences.topLevelWorldView, false);
		SecureRandomFuture.method2379(ClientPreferences.topLevelWorldView);
		class7.method55(ClientPreferences.topLevelWorldView);
		WorldView var30 = ClientPreferences.topLevelWorldView;

		for (GraphicsObject var34 = (GraphicsObject)var30.graphicsObjects.last(); var34 != null; var34 = (GraphicsObject)var30.graphicsObjects.previous()) {
			if (var30.plane == var34.plane && !var34.isFinished) {
				if (Client.cycle >= var34.cycleStart) {
					var34.advance(Client.graphicsCycle);
					if (var34.isFinished) {
						var34.remove();
					} else {
						var30.scene.drawEntity(var34.plane, var34.x, var34.y, var34.z, 60, var34, 0, -1L, false);
					}
				}
			} else {
				var34.remove();
			}
		}

		class191.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var31 = Client.camAngleX;
		if (Client.field760 / 256 > var31) {
			var31 = Client.field760 / 256;
		}

		if (Client.field577[4] && Client.field782[4] + 128 > var31) {
			var31 = Client.field782[4] + 128;
		}

		var8 = Client.camAngleY & 2047;
		int var9 = UserComparator6.oculusOrbFocalPointX;
		int var10 = class147.oculusOrbFocalPointZ;
		int var11 = AsyncHttpResponse.oculusOrbFocalPointY;
		int var14 = var31 * 3 + 600;
		HealthBarDefinition.method3907(var9, var10, var11, var31, var8, var14, var3);
		int var15;
		if (!Client.isCameraLocked) {
			var15 = StructComposition.method4114();
		} else {
			var15 = ApproximateRouteStrategy.method1255();
		}

		int var16 = class301.cameraX;
		int var17 = ArchiveLoader.cameraY;
		int var18 = class33.cameraZ;
		int var19 = class463.cameraPitch;
		int var20 = class267.cameraYaw;

		int var21;
		int var22;
		for (var21 = 0; var21 < 5; ++var21) {
			if (Client.field577[var21]) {
				var22 = (int)(Math.random() * (double)(Client.field781[var21] * 2 + 1) - (double)Client.field781[var21] + Math.sin((double)Client.field518[var21] * ((double)Client.field589[var21] / 100.0D)) * (double)Client.field782[var21]);
				if (var21 == 0) {
					class301.cameraX += var22;
				}

				if (var21 == 1) {
					ArchiveLoader.cameraY += var22;
				}

				if (var21 == 2) {
					class33.cameraZ += var22;
				}

				if (var21 == 3) {
					class267.cameraYaw = var22 + class267.cameraYaw & 2047;
				}

				if (var21 == 4) {
					class463.cameraPitch += var22;
					if (class463.cameraPitch < 128) {
						class463.cameraPitch = 128;
					}

					if (class463.cameraPitch > 383) {
						class463.cameraPitch = 383;
					}
				}
			}
		}

		var21 = MouseHandler.MouseHandler_x;
		var22 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var21 = MouseHandler.MouseHandler_lastPressedX;
			var22 = MouseHandler.MouseHandler_lastPressedY;
		}

		int var23;
		int var24;
		if (var21 >= var0 && var21 < var0 + var2 && var22 >= var1 && var22 < var3 + var1) {
			var23 = var21 - var0;
			var24 = var22 - var1;
			ViewportMouse.ViewportMouse_x = var23;
			ViewportMouse.ViewportMouse_y = var24;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		GrandExchangeOffer.method7712();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		GrandExchangeOffer.method7712();
		var23 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4803(class1.client.field172);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		var24 = ClanSettings.entity.getX();
		int var25 = ClanSettings.entity.getY();
		class232 var26 = HealthBarUpdate.field1304 == -1 ? class232.field2470 : class232.field2471;
		ClientPreferences.topLevelWorldView.scene.method4931(var26);
		ClientPreferences.topLevelWorldView.scene.draw(class301.cameraX, ArchiveLoader.cameraY, class33.cameraZ, class463.cameraPitch, class267.cameraYaw, var15, var24, var25, Client.isCameraLocked);
		Rasterizer3D.method4803(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var23;
		GrandExchangeOffer.method7712();
		ClientPreferences.topLevelWorldView.scene.setViewportWalking();

		int var27;
		WorldEntity var33;
		for (var27 = 0; var27 < ClientPreferences.topLevelWorldView.worldEntityCount; ++var27) {
			var33 = ClientPreferences.topLevelWorldView.worldEntities[ClientPreferences.topLevelWorldView.worldEntityIndices[var27]];
			if (var33 != null) {
				var33.worldView.scene.setViewportWalking();
			}
		}

		class153.method3503(ClientPreferences.topLevelWorldView, var0, var1, var2, var3);

		for (var27 = 0; var27 < ClientPreferences.topLevelWorldView.worldEntityCount; ++var27) {
			var33 = ClientPreferences.topLevelWorldView.worldEntities[ClientPreferences.topLevelWorldView.worldEntityIndices[var27]];
			if (var33 != null) {
				class153.method3503(var33.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var32 = ClientPreferences.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var28 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var32.baseX << 7);
			int var29 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var32.baseY << 7);
			class36.worldToScreen(var32, var28, var29, var28, var29, Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class301.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class7.method57(var0, var1, var2, var3);
		class301.cameraX = var16;
		ArchiveLoader.cameraY = var17;
		class33.cameraZ = var18;
		class463.cameraPitch = var19;
		class267.cameraYaw = var20;
		if (Client.isLoading && FontName.field5260.method7624(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class328.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
