import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class436 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	public static final class436 field4651;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static final class436 field4652;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -537971187
	)
	final int field4650;

	static {
		field4651 = new class436(1);
		field4652 = new class436(0);
	}

	class436(int var1) {
		this.field4650 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "30"
	)
	static String method7916(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "112"
	)
	static final void method7914(String var0) {
		class411.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIII)V",
		garbageValue = "-1362386286"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class313.method5891();
		SpriteMask var4 = var0.method6594(class33.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = TextureProvider.localPlayer.x / 32 + 48;
				int var7 = 464 - TextureProvider.localPlayer.y / 32;
				SpriteMask.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - TextureProvider.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - TextureProvider.localPlayer.y / 32;
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class87.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - TextureProvider.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - TextureProvider.localPlayer.y / 32;
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, class103.field1336[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - TextureProvider.localPlayer.x / 32;
							var12 = var9.y / 32 - TextureProvider.localPlayer.y / 32;
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, class103.field1336[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != TextureProvider.localPlayer) {
						var12 = var15.x / 32 - TextureProvider.localPlayer.x / 32;
						int var13 = var15.y / 32 - TextureProvider.localPlayer.y / 32;
						if (var15.isFriend()) {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[3], var4);
						} else if (TextureProvider.localPlayer.team != 0 && var15.team != 0 && var15.team == TextureProvider.localPlayer.team) {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[4], var4);
						} else if (var15.isFriendsChatMember()) {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[5], var4);
						} else if (var15.isClanMember()) {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[6], var4);
						} else {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - TextureProvider.localPlayer.x / 32;
							var12 = var19.y / 32 - TextureProvider.localPlayer.y / 32;
							Language.worldToMinimap(var1, var2, var11, var12, class47.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class20.baseX * 256 + 2 - TextureProvider.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class19.baseY * 256 + 2 - TextureProvider.localPlayer.y / 32;
						Language.worldToMinimap(var1, var2, var10, var11, class47.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - TextureProvider.localPlayer.x / 32;
							var12 = var20.y / 32 - TextureProvider.localPlayer.y / 32;
							Language.worldToMinimap(var1, var2, var11, var12, class47.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - TextureProvider.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - TextureProvider.localPlayer.y / 32;
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var10, var11, class47.mapDotSprites[0], var4);
				}

				if (!TextureProvider.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field735[var3] = true;
		}
	}
}
