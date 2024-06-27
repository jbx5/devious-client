import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class454 {
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class157.method3347();
		SpriteMask var4 = var0.method6943(ModeWhere.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + StudioGame.field4084.vmethod8670() / 32;
				int var7 = 464 - StudioGame.field4084.vmethod8671() / 32;
				class196.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - StudioGame.field4084.vmethod8670() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - StudioGame.field4084.vmethod8671() / 32;
					Archive.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = class511.topLevelWorldView.groundItems[class511.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - StudioGame.field4084.vmethod8670() / 32;
							var12 = var16 * 4 + 2 - StudioGame.field4084.vmethod8671() / 32;
							Archive.drawSpriteOnMinimap(var1, var2, var11, var12, class446.field4821[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class511.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = class511.topLevelWorldView.npcs[class511.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - StudioGame.field4084.vmethod8670() / 32;
							var12 = var9.y / 32 - StudioGame.field4084.vmethod8671() / 32;
							Archive.drawSpriteOnMinimap(var1, var2, var11, var12, class446.field4821[1], var4);
						}
					}
				}

				var8 = class511.topLevelWorldView.playerUpdateManager.playerCount;
				int[] var17 = class511.topLevelWorldView.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = class511.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != SoundCache.localPlayer) {
						var12 = var15.x / 32 - StudioGame.field4084.vmethod8670() / 32;
						int var13 = var15.y / 32 - StudioGame.field4084.vmethod8671() / 32;
						if (var15.isFriend()) {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[3], var4);
						} else if (SoundCache.localPlayer.team != 0 && var15.team != 0 && var15.team == SoundCache.localPlayer.team) {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[4], var4);
						} else if (var15.isFriendsChatMember()) {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[5], var4);
						} else if (var15.isClanMember()) {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[6], var4);
						} else {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < class511.topLevelWorldView.npcs.length) {
						NPC var19 = class511.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - StudioGame.field4084.vmethod8670() / 32;
							var12 = var19.y / 32 - StudioGame.field4084.vmethod8671() / 32;
							AsyncRestClient.worldToMinimap(var1, var2, var11, var12, KeyHandler.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class511.topLevelWorldView.baseX * 4 + 2 - StudioGame.field4084.vmethod8670() / 32;
						var11 = Client.hintArrowY * 4 - class511.topLevelWorldView.baseY * 4 + 2 - StudioGame.field4084.vmethod8671() / 32;
						AsyncRestClient.worldToMinimap(var1, var2, var10, var11, KeyHandler.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < class511.topLevelWorldView.players.length) {
						Player var20 = class511.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - StudioGame.field4084.vmethod8670() / 32;
							var12 = var20.y / 32 - StudioGame.field4084.vmethod8671() / 32;
							AsyncRestClient.worldToMinimap(var1, var2, var11, var12, KeyHandler.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - StudioGame.field4084.vmethod8670() / 32;
					var11 = Client.destinationY * 4 + 2 - StudioGame.field4084.vmethod8671() / 32;
					Archive.drawSpriteOnMinimap(var1, var2, var10, var11, KeyHandler.mapDotSprites[0], var4);
				}

				if (!SoundCache.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field722[var3] = true;
		}
	}
}
