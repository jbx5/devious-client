import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1608034387
	)
	static int field1072;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 208440143
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1320255875
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1576244259
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-66382679"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7484(var1) || this.archive.method7483(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-234431369"
	)
	static void method2478(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class162.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				class162.worldView.groundItems[var0][var1][var2] = null;
			}

			class537.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIII)V",
		garbageValue = "1511936949"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		GrandExchangeOffer.method7712();
		SpriteMask var4 = var0.method7244(TaskHandler.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + ClanSettings.entity.getX() / 32;
				int var7 = 464 - ClanSettings.entity.getY() / 32;
				Tiles.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - ClanSettings.entity.getX() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - ClanSettings.entity.getY() / 32;
					FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = ClientPreferences.topLevelWorldView.groundItems[ClientPreferences.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - ClanSettings.entity.getX() / 32;
							var12 = var16 * 4 + 2 - ClanSettings.entity.getY() / 32;
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var11, var12, class135.field1593[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < ClientPreferences.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = ClientPreferences.topLevelWorldView.npcs[ClientPreferences.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - ClanSettings.entity.getX() / 32;
							var12 = var9.y / 32 - ClanSettings.entity.getY() / 32;
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var11, var12, class135.field1593[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = ClientPreferences.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != AddRequestTask.localPlayer) {
						var12 = var15.x / 32 - ClanSettings.entity.getX() / 32;
						int var13 = var15.y / 32 - ClanSettings.entity.getY() / 32;
						if (var15.isFriend()) {
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var12, var13, class135.field1593[3], var4);
						} else if (AddRequestTask.localPlayer.team != 0 && var15.team != 0 && var15.team == AddRequestTask.localPlayer.team) {
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var12, var13, class135.field1593[4], var4);
						} else if (var15.isFriendsChatMember()) {
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var12, var13, class135.field1593[5], var4);
						} else if (var15.isClanMember()) {
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var12, var13, class135.field1593[6], var4);
						} else {
							FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var12, var13, class135.field1593[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < ClientPreferences.topLevelWorldView.npcs.length) {
						NPC var19 = ClientPreferences.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - ClanSettings.entity.getX() / 32;
							var12 = var19.y / 32 - ClanSettings.entity.getY() / 32;
							class164.worldToMinimap(var1, var2, var11, var12, class160.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - ClientPreferences.topLevelWorldView.baseX * 4 + 2 - ClanSettings.entity.getX() / 32;
						var11 = Client.hintArrowY * 4 - ClientPreferences.topLevelWorldView.baseY * 4 + 2 - ClanSettings.entity.getY() / 32;
						class164.worldToMinimap(var1, var2, var10, var11, class160.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < ClientPreferences.topLevelWorldView.players.length) {
						Player var20 = ClientPreferences.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - ClanSettings.entity.getX() / 32;
							var12 = var20.y / 32 - ClanSettings.entity.getY() / 32;
							class164.worldToMinimap(var1, var2, var11, var12, class160.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - ClanSettings.entity.getX() / 32;
					var11 = Client.destinationY * 4 + 2 - ClanSettings.entity.getY() / 32;
					FloorOverlayDefinition.drawSpriteOnMinimap(var1, var2, var10, var11, class160.mapDotSprites[0], var4);
				}

				if (!AddRequestTask.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field731[var3] = true;
		}
	}
}
