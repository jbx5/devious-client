import java.io.IOException;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("oy")
	@ObfuscatedGetter(intValue = 
	-1198609277)

	static int field1253;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lfj;")

	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILgv;I)V", garbageValue = 
	"-1208741979")

	final void method2357(int var1, class193 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if ((super.sequence != (-1)) && (ItemContainer.SequenceDefinition_get(super.sequence).field2171 == 1)) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Lhx;", garbageValue = 
	"63")

	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = ((super.sequence != (-1)) && (super.sequenceDelay == 0)) ? ItemContainer.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = ((super.movementSequence != (-1)) && ((super.movementSequence != super.idleSequence) || (var1 == null))) ? ItemContainer.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if ((super.spotAnimation != (-1)) && (super.spotAnimationFrame != (-1))) {
					Model var4 = class6.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						Model[] var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (((super.field1189 != 0) && (Client.cycle >= super.field1133)) && (Client.cycle < super.field1185)) {
					var3.overrideHue = super.field1146;
					var3.overrideSaturation = super.field1187;
					var3.overrideLuminance = super.field1188;
					var3.overrideAmount = super.field1189;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIZI)V", garbageValue = 
	"1745876062")

	final void method2353(int var1, int var2, boolean var3) {
		if ((super.sequence != (-1)) && (ItemContainer.SequenceDefinition_get(super.sequence).field2171 == 1)) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if ((((var4 >= (-8)) && (var4 <= 8)) && (var5 >= (-8))) && (var5 <= 8)) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class193.field2193;
				return;
			}
		}

		super.pathLength = 0;
		super.field1134 = 0;
		super.field1197 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = (super.field1145 * 64) + (super.pathX[0] * 128);
		super.y = (super.field1145 * 64) + (super.pathY[0] * 128);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-450224469")

	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"-22")

	public static void method2366(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/security/SecureRandom;", garbageValue = 
	"-1976233431")

	static SecureRandom method2364() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1011545908")

	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class144.method3014();
		VertexNormal.method4498();
		if ((Client.combatTargetPlayerIndex >= 0) && (Client.players[Client.combatTargetPlayerIndex] != null)) {
			class166.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		ItemContainer.addNpcsToScene(true);
		ItemComposition.method3751();
		ItemContainer.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = ((Projectile) (Client.projectiles.last())); var4 != null; var4 = ((Projectile) (Client.projectiles.previous()))) {
			if ((var4.plane == class160.Client_plane) && (Client.cycle <= var4.cycleEnd)) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var18 = Client.npcs[var4.targetIndex - 1];
						if (((((var18 != null) && (var18.x >= 0)) && (var18.x < 13312)) && (var18.y >= 0)) && (var18.y < 13312)) {
							var4.setDestination(var18.x, var18.y, Archive.getTileHeight(var18.x, var18.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = (-var4.targetIndex) - 1;
						Player var20;
						if (var6 == Client.localPlayerIndex) {
							var20 = class19.localPlayer;
						} else {
							var20 = Client.players[var6];
						}

						if (((((var20 != null) && (var20.x >= 0)) && (var20.x < 13312)) && (var20.y >= 0)) && (var20.y < 13312)) {
							var4.setDestination(var20.x, var20.y, Archive.getTileHeight(var20.x, var20.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field550);
					FriendSystem.scene.drawEntity(class160.Client_plane, ((int) (var4.x)), ((int) (var4.y)), ((int) (var4.z)), 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		class160.method3238();
		Language.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var17 = Client.camAngleX;
		if ((Client.field756 / 256) > var17) {
			var17 = Client.field756 / 256;
		}

		if (Client.field740[4] && ((Client.field549[4] + 128) > var17)) {
			var17 = Client.field549[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		class20.method324(Messages.oculusOrbFocalPointX, FloorOverlayDefinition.field2136, class115.oculusOrbFocalPointY, var17, var5, DevicePcmPlayerProvider.method385(var17), var3);
		if (!Client.isCameraLocked) {
			var6 = RouteStrategy.method3869();
		} else {
			var6 = GrandExchangeOfferOwnWorldComparator.method1133();
		}

		int var7 = EnumComposition.cameraX;
		int var8 = FriendSystem.cameraY;
		int var9 = CollisionMap.cameraZ;
		int var10 = Language.cameraPitch;
		int var11 = MusicPatchNode2.cameraYaw;

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field740[var12]) {
				var13 = ((int) (((Math.random() * ((double) ((Client.field482[var12] * 2) + 1))) - ((double) (Client.field482[var12]))) + (Math.sin((((double) (Client.field766[var12])) / 100.0) * ((double) (Client.field744[var12]))) * ((double) (Client.field549[var12])))));
				if (var12 == 0) {
					EnumComposition.cameraX += var13;
				}

				if (var12 == 1) {
					FriendSystem.cameraY += var13;
				}

				if (var12 == 2) {
					CollisionMap.cameraZ += var13;
				}

				if (var12 == 3) {
					MusicPatchNode2.cameraYaw = (var13 + MusicPatchNode2.cameraYaw) & 2047;
				}

				if (var12 == 4) {
					Language.cameraPitch += var13;
					if (Language.cameraPitch < 128) {
						Language.cameraPitch = 128;
					}

					if (Language.cameraPitch > 383) {
						Language.cameraPitch = 383;
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
		int var15;
		if ((((var12 >= var0) && (var12 < (var0 + var2))) && (var13 >= var1)) && (var13 < (var3 + var1))) {
			var14 = var12 - var0;
			var15 = var13 - var1;
			ViewportMouse.ViewportMouse_x = var14;
			ViewportMouse.ViewportMouse_y = var15;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		MouseHandler.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		MouseHandler.playPcmPlayers();
		var14 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		FriendSystem.scene.draw(EnumComposition.cameraX, FriendSystem.cameraY, CollisionMap.cameraZ, Language.cameraPitch, MusicPatchNode2.cameraYaw, var6);
		Rasterizer3D.Rasterizer3D_zoom = var14;
		MouseHandler.playPcmPlayers();
		FriendSystem.scene.clearTempGameObjects();
		InterfaceParent.method2100(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			class10.worldToScreen(((Client.hintArrowX - ApproximateRouteStrategy.baseX) << 7) + Client.hintArrowSubX, ((Client.hintArrowY - class250.baseY) << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
			if ((Client.viewportTempX > (-1)) && ((Client.cycle % 20) < 10)) {
				VarpDefinition.headIconHintSprites[0].drawTransBgAt((var0 + Client.viewportTempX) - 12, (Client.viewportTempY + var1) - 28);
			}
		}

		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).animate(Client.field550);
		Client.field603 = 0;
		var15 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX;
		int var16 = (class19.localPlayer.y >> 7) + class250.baseY;
		if ((((var15 >= 3053) && (var15 <= 3156)) && (var16 >= 3056)) && (var16 <= 3136)) {
			Client.field603 = 1;
		}

		if ((((var15 >= 3072) && (var15 <= 3118)) && (var16 >= 9492)) && (var16 <= 9535)) {
			Client.field603 = 1;
		}

		if (((((Client.field603 == 1) && (var15 >= 3139)) && (var15 <= 3199)) && (var16 >= 3008)) && (var16 <= 3062)) {
			Client.field603 = 0;
		}

		EnumComposition.cameraX = var7;
		FriendSystem.cameraY = var8;
		CollisionMap.cameraZ = var9;
		Language.cameraPitch = var10;
		MusicPatchNode2.cameraYaw = var11;
		if (Client.isLoading) {
			byte var19 = 0;
			var16 = (var19 + NetCache.NetCache_pendingPriorityResponsesCount) + NetCache.NetCache_pendingPriorityWritesCount;
			if (var16 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class119.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"1005562855")

	static final String method2367(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}