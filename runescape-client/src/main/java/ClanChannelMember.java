import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ap")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2139364207
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "290668091"
	)
	public static int method3586(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-283615403"
	)
	static int method3585(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			NPCComposition var6 = ActorSpotAnim.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				class96.Interpreter_intStackSize -= 2;
				var3 = ActorSpotAnim.getNpcDefinition(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.method3998(var4);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.method4005(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = ActorSpotAnim.getNpcDefinition(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-87"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class198.topLevelWorldView.scene.cycle = Client.cycle;
		if (SpriteMask.localPlayer.x >> 7 == Client.destinationX && SpriteMask.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		WorldView var4 = class198.topLevelWorldView;
		int var5 = MusicPatchPcmStream.method6792();
		int var8;
		int var9;
		int var12;
		int var13;
		int var14;
		if (var4 == class198.topLevelWorldView && var5 >= 0 && Client.menu.menuOpcodes[var5] == 60) {
			int var6 = Client.menu.menuIdentifiers[var5] * 128;
			boolean var7 = true;
			var8 = Math.max(384, 2000 - Client.viewportZoom * 2);
			var9 = GameEngine.entity.getX();
			double var10 = (double)class278.method5850(var6) / 65536.0D;
			var12 = var9 - (int)(var10 * (double)var8);
			var13 = GameEngine.entity.getY() - (int)(class458.method8816(var6) * (double)var8);
			var14 = ScriptFrame.getTileHeight(var4, GameEngine.entity.getX(), GameEngine.entity.getY(), GameEngine.entity.getPlane());
			var4.scene.drawEntity(var4.plane, var12, var13, var14, 60, GameObject.field2972, var6, 0L, false);
		}

		TriBool.method9141(class198.topLevelWorldView);
		WorldView var24 = class198.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var24.players[Client.combatTargetPlayerIndex] != null) {
			Friend.addPlayerToScene(var24, Client.combatTargetPlayerIndex, false);
		}

		WorldMapScaleHandler.addNpcsToScene(class198.topLevelWorldView, true);
		SoundSystem.method861(class198.topLevelWorldView);
		WorldMapScaleHandler.addNpcsToScene(class198.topLevelWorldView, false);
		WorldView var25 = class198.topLevelWorldView;
		int var34 = 0;

		int var15;
		for (var8 = 0; var8 < var25.worldEntityCount; ++var8) {
			WorldEntity var30 = var25.worldEntities[var25.worldEntityIndices[var8]];
			if (var30 != null) {
				boolean var26 = var30.worldView.id == class229.field2458;
				if (!var26) {
					boolean var11 = var34 < Client.field507;
					if (!var11) {
						continue;
					}

					++var34;
				}

				var30.field5030.method5774(ScriptFrame.getTileHeight(var25, var30.getX(), var30.getY(), var25.plane));
				var30.worldView.scene.cycle = Client.cycle;
				var30.updateMovement();
				var25.scene.drawEntity(var25.plane, var30.getX(), var30.getY(), var30.method9153(), var30.method9148() / 2, var30.worldView.scene, var30.method9147(), 0L, false);
				TriBool.method9141(var30.worldView);
				WorldView var31 = var30.worldView;
				if (Client.combatTargetPlayerIndex >= 0 && var31.players[Client.combatTargetPlayerIndex] != null) {
					Friend.addPlayerToScene(var31, Client.combatTargetPlayerIndex, false);
				}

				WorldMapScaleHandler.addNpcsToScene(var30.worldView, true);
				WorldView var32 = var30.worldView;
				var13 = Client.playerUpdateManager.playerCount;
				int[] var33 = Client.playerUpdateManager.playerIndices;

				for (var15 = 0; var15 < var13; ++var15) {
					if (var33[var15] != Client.combatTargetPlayerIndex && var33[var15] != Client.localPlayerIndex) {
						Friend.addPlayerToScene(var32, var33[var15], true);
					}
				}

				WorldMapScaleHandler.addNpcsToScene(var30.worldView, false);
				class92.method2577(var30.worldView);
				AsyncRestClient.method170(var30.worldView);
			}
		}

		class92.method2577(class198.topLevelWorldView);
		AsyncRestClient.method170(class198.topLevelWorldView);
		UserComparator7.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var34 = Client.camAngleX;
		if (Client.field607 / 256 > var34) {
			var34 = Client.field607 / 256;
		}

		if (Client.field765[4] && Client.field767[4] + 128 > var34) {
			var34 = Client.field767[4] + 128;
		}

		var8 = Client.camAngleY & 2047;
		method3584(ArchiveDisk.oculusOrbFocalPointX, Projectile.oculusOrbFocalPointZ, class298.oculusOrbFocalPointY, var34, var8, class208.method4212(var34), var3);
		if (!Client.isCameraLocked) {
			var9 = class141.method3496();
		} else {
			var9 = class354.method6914();
		}

		int var37 = AsyncHttpResponse.cameraX;
		int var35 = FloorOverlayDefinition.cameraY;
		var12 = PlayerType.cameraZ;
		var13 = class323.cameraPitch;
		var14 = class390.cameraYaw;

		int var16;
		for (var15 = 0; var15 < 5; ++var15) {
			if (Client.field765[var15]) {
				var16 = (int)(Math.random() * (double)(Client.field766[var15] * 2 + 1) - (double)Client.field766[var15] + Math.sin((double)Client.field768[var15] / 100.0D * (double)Client.field682[var15]) * (double)Client.field767[var15]);
				if (var15 == 0) {
					AsyncHttpResponse.cameraX += var16;
				}

				if (var15 == 1) {
					FloorOverlayDefinition.cameraY += var16;
				}

				if (var15 == 2) {
					PlayerType.cameraZ += var16;
				}

				if (var15 == 3) {
					class390.cameraYaw = var16 + class390.cameraYaw & 2047;
				}

				if (var15 == 4) {
					class323.cameraPitch += var16;
					if (class323.cameraPitch < 128) {
						class323.cameraPitch = 128;
					}

					if (class323.cameraPitch > 383) {
						class323.cameraPitch = 383;
					}
				}
			}
		}

		var15 = MouseHandler.MouseHandler_x;
		var16 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var15 = MouseHandler.MouseHandler_lastPressedX;
			var16 = MouseHandler.MouseHandler_lastPressedY;
		}

		int var17;
		int var18;
		if (var15 >= var0 && var15 < var0 + var2 && var16 >= var1 && var16 < var3 + var1) {
			var17 = var15 - var0;
			var18 = var16 - var1;
			ViewportMouse.ViewportMouse_x = var17;
			ViewportMouse.ViewportMouse_y = var18;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
			Iterator var19 = Client.worldViewManager.iterator();

			while (var19.hasNext()) {
				WorldView var20 = (WorldView)var19.next();
				var20.scene.method5036(var20.plane, var15, var16);
			}
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class149.method3569();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class149.method3569();
		var17 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4852(Projectile.client.field176);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		var18 = GameEngine.entity.getX();
		int var27 = GameEngine.entity.getY();
		class232 var36 = class229.field2458 == -1 ? class232.field2470 : class232.field2471;
		class198.topLevelWorldView.scene.method5037(var36);
		class198.topLevelWorldView.scene.draw(AsyncHttpResponse.cameraX, FloorOverlayDefinition.cameraY, PlayerType.cameraZ, class323.cameraPitch, class390.cameraYaw, var9, var18, var27, Client.isCameraLocked);
		Rasterizer3D.method4852(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var17;
		class149.method3569();
		class198.topLevelWorldView.scene.setViewportWalking();

		int var21;
		WorldEntity var29;
		for (var21 = 0; var21 < class198.topLevelWorldView.worldEntityCount; ++var21) {
			var29 = class198.topLevelWorldView.worldEntities[class198.topLevelWorldView.worldEntityIndices[var21]];
			if (var29 != null) {
				var29.worldView.scene.setViewportWalking();
			}
		}

		Client.method1954(class198.topLevelWorldView, var0, var1, var2, var3);

		for (var21 = 0; var21 < class198.topLevelWorldView.worldEntityCount; ++var21) {
			var29 = class198.topLevelWorldView.worldEntities[class198.topLevelWorldView.worldEntityIndices[var21]];
			if (var29 != null) {
				Client.method1954(var29.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var28 = class198.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var22 = (Client.hintArrowX - var28.baseX << 7) + Client.hintArrowSubX * 4096;
			int var23 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var28.baseY << 7);
			class150.worldToScreen(var28, var22, var23, var22, var23, Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				LoginState.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		WorldMapSection0.method6229(var0, var1, var2, var3);
		AsyncHttpResponse.cameraX = var37;
		FloorOverlayDefinition.cameraY = var35;
		PlayerType.cameraZ = var12;
		class323.cameraPitch = var13;
		class390.cameraYaw = var14;
		if (Client.isLoading && class376.field4123.method7730(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			ObjectComposition.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1159737027"
	)
	static final void method3584(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class426.method8219(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var5 * var12 >> 16;
			var11 = var12 * var10 + var13 * var5 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var11 * var12 + var9 * var13 >> 16;
			var11 = var11 * var13 - var12 * var9 >> 16;
			var9 = var14;
		}

		if (Client.isCameraLocked) {
			UserComparator10.field1521 = var0 - var9;
			HttpMethod.field34 = var1 - var10;
			IgnoreList.field4983 = var2 - var11;
			ClientPreferences.field1339 = var3;
			GrandExchangeOfferAgeComparator.field4651 = var4;
		} else {
			AsyncHttpResponse.cameraX = var0 - var9;
			FloorOverlayDefinition.cameraY = var1 - var10;
			PlayerType.cameraZ = var2 - var11;
			class323.cameraPitch = var3;
			class390.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ArchiveDisk.oculusOrbFocalPointX >> 7 != SpriteMask.localPlayer.x >> 7 || class298.oculusOrbFocalPointY >> 7 != SpriteMask.localPlayer.y >> 7)) {
			var12 = SpriteMask.localPlayer.plane;
			var13 = (ArchiveDisk.oculusOrbFocalPointX >> 7) + class198.topLevelWorldView.baseX;
			var14 = (class298.oculusOrbFocalPointY >> 7) + class198.topLevelWorldView.baseY;
			PacketBufferNode var15 = class113.getPacketBufferNode(ClientPacket.field3402, Client.packetWriter.isaacCipher);
			var15.packetBuffer.writeByteNeg(var12);
			var15.packetBuffer.writeIntME(Client.revision);
			var15.packetBuffer.writeShortLE(var14);
			var15.packetBuffer.writeShortLE(var13);
			Client.packetWriter.addNode(var15);
		}

	}
}
