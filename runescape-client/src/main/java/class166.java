import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class166 extends class148 {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1028545603
	)
	static int field1793;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1049969155
	)
	int field1790;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -654544907
	)
	int field1788;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class166(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1790 = var1.readInt();
		this.field1788 = var1.readInt();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3451(this.field1790, this.field1788);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lbb;B)V",
		garbageValue = "-36"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-95712584"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		ConcurrentMidiTask.topLevelWorldView.scene.cycle = Client.cycle;
		SoundCache.method843();
		WorldView var4 = ConcurrentMidiTask.topLevelWorldView;
		if (Client.renderSelf) {
			KitDefinition.addPlayerToScene(var4, Client.localPlayerIndex, false);
		}

		class87.method2400(ConcurrentMidiTask.topLevelWorldView);
		class170.addNpcsToScene(ConcurrentMidiTask.topLevelWorldView, true);
		class211.method4557(ConcurrentMidiTask.topLevelWorldView);
		class170.addNpcsToScene(ConcurrentMidiTask.topLevelWorldView, false);
		ClientPreferences.method2705(ConcurrentMidiTask.topLevelWorldView);
		class87.method2407(ConcurrentMidiTask.topLevelWorldView);
		PcmPlayer.method801(ConcurrentMidiTask.topLevelWorldView);
		class59.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var5 = Client.camAngleX;
		if (Client.field501 / 256 > var5) {
			var5 = Client.field501 / 256;
		}

		if (Client.field764[4] && Client.field768[4] + 128 > var5) {
			var5 = Client.field768[4] + 128;
		}

		int var6 = Client.camAngleY & 2047;
		int var7 = class130.oculusOrbFocalPointX;
		int var8 = Actor.oculusOrbFocalPointZ;
		int var9 = class499.oculusOrbFocalPointY;
		int var12 = var5 * 3 + 600;
		Skeleton.method3882(var7, var8, var9, var5, var6, var12, var3);
		int var13;
		if (!Client.isCameraLocked) {
			var13 = class330.method6206();
		} else {
			var13 = class359.method6933();
		}

		int var14 = class433.cameraX;
		int var15 = RestClientThreadFactory.cameraY;
		int var16 = WorldMapSection0.cameraZ;
		int var17 = UserComparator6.cameraPitch;
		int var18 = class264.cameraYaw;

		int var19;
		int var20;
		for (var19 = 0; var19 < 5; ++var19) {
			if (Client.field764[var19]) {
				var20 = (int)(Math.random() * (double)(Client.field508[var19] * 2 + 1) - (double)Client.field508[var19] + Math.sin((double)Client.field769[var19] / 100.0D * (double)Client.field770[var19]) * (double)Client.field768[var19]);
				if (var19 == 0) {
					class433.cameraX += var20;
				}

				if (var19 == 1) {
					RestClientThreadFactory.cameraY += var20;
				}

				if (var19 == 2) {
					WorldMapSection0.cameraZ += var20;
				}

				if (var19 == 3) {
					class264.cameraYaw = var20 + class264.cameraYaw & 2047;
				}

				if (var19 == 4) {
					UserComparator6.cameraPitch += var20;
					if (UserComparator6.cameraPitch < 128) {
						UserComparator6.cameraPitch = 128;
					}

					if (UserComparator6.cameraPitch > 383) {
						UserComparator6.cameraPitch = 383;
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
			class141.method3257(var19 - var0, var20 - var1);
		} else {
			LoginPacket.method3325();
		}

		ClanChannelMember.method3363();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		ClanChannelMember.method3363();
		int var21 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method3727(DynamicObject.client.field177);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		int var22 = class354.entity.getX();
		int var23 = class354.entity.getY();
		ConcurrentMidiTask.topLevelWorldView.scene.draw(class433.cameraX, RestClientThreadFactory.cameraY, WorldMapSection0.cameraZ, UserComparator6.cameraPitch, class264.cameraYaw, var13, var22, var23, Client.isCameraLocked);
		Rasterizer3D.method3727(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var21;
		ClanChannelMember.method3363();
		ConcurrentMidiTask.topLevelWorldView.scene.setViewportWalking();

		int var24;
		WorldEntity var28;
		for (var24 = 0; var24 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var24) {
			var28 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var24]];
			if (var28 != null) {
				var28.worldView.scene.setViewportWalking();
			}
		}

		Timer.method8412(ConcurrentMidiTask.topLevelWorldView, var0, var1, var2, var3);

		for (var24 = 0; var24 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var24) {
			var28 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var24]];
			if (var28 != null) {
				Timer.method8412(var28.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var27 = ConcurrentMidiTask.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var25 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var27.baseX << 7);
			int var26 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var27.baseY << 7);
			class87.worldToScreen(var27, var25, var26, var25, var26, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class218.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		ClanSettings.method3478();
		class433.cameraX = var14;
		RestClientThreadFactory.cameraY = var15;
		WorldMapSection0.cameraZ = var16;
		UserComparator6.cameraPitch = var17;
		class264.cameraYaw = var18;
		if (Client.isLoading && SecureRandomFuture.field980.method7375(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			HorizontalAlignment.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
