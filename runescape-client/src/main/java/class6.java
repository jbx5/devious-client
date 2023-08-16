import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public enum class6 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	field19(0, 0);

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2116991637
	)
	public final int field18;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 760206015
	)
	final int field16;

	class6(int var3, int var4) {
		this.field18 = var3;
		this.field16 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1893076970"
	)
	static int method38(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIIB)V",
		garbageValue = "32"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class301.method5721();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = VarbitComposition.localPlayer.x / 32 + 48;
				int var7 = 464 - VarbitComposition.localPlayer.y / 32;
				AbstractUserComparator.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - VarbitComposition.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - VarbitComposition.localPlayer.y / 32;
					class210.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[HealthBar.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - VarbitComposition.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - VarbitComposition.localPlayer.y / 32;
							class210.drawSpriteOnMinimap(var1, var2, var11, var12, FloorOverlayDefinition.field2289[0], var4);
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
							var11 = var9.x / 32 - VarbitComposition.localPlayer.x / 32;
							var12 = var9.y / 32 - VarbitComposition.localPlayer.y / 32;
							class210.drawSpriteOnMinimap(var1, var2, var11, var12, FloorOverlayDefinition.field2289[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != VarbitComposition.localPlayer) {
						var12 = var15.x / 32 - VarbitComposition.localPlayer.x / 32;
						int var13 = var15.y / 32 - VarbitComposition.localPlayer.y / 32;
						if (var15.isFriend()) {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[3], var4);
						} else if (VarbitComposition.localPlayer.team != 0 && var15.team != 0 && var15.team == VarbitComposition.localPlayer.team) {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[5], var4);
						} else if (var15.isClanMember()) {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[6], var4);
						} else {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - VarbitComposition.localPlayer.x / 32;
							var12 = var19.y / 32 - VarbitComposition.localPlayer.y / 32;
							class408.worldToMinimap(var1, var2, var11, var12, Message.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - UrlRequester.baseX * 256 + 2 - VarbitComposition.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class47.baseY * 256 + 2 - VarbitComposition.localPlayer.y / 32;
						class408.worldToMinimap(var1, var2, var10, var11, Message.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - VarbitComposition.localPlayer.x / 32;
							var12 = var20.y / 32 - VarbitComposition.localPlayer.y / 32;
							class408.worldToMinimap(var1, var2, var11, var12, Message.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - VarbitComposition.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - VarbitComposition.localPlayer.y / 32;
					class210.drawSpriteOnMinimap(var1, var2, var10, var11, Message.mapDotSprites[0], var4);
				}

				if (!VarbitComposition.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field749[var3] = true;
		}
	}
}
