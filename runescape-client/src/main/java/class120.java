import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("dw")
public class class120 implements class112 {
	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "Lfm;")
	@Export("socketTask")
	static Task socketTask;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1642942182")
	public static boolean method2759(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-183815869")
	static final int method2758() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = "(Lgc;IIIB)V", garbageValue = "-120")
	static void method2761(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class19.clientPreferences.method2262() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var7;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(descriptor = "(Lkb;IIII)V", garbageValue = "-1596298421")
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		Renderable.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class101.localPlayer.x / 32 + 48;
				int var7 = 464 - class101.localPlayer.y / 32;
				FloorUnderlayDefinition.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);
				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class101.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class101.localPlayer.y / 32;
					ParamComposition.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}
				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[PacketWriter.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class101.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class101.localPlayer.y / 32;
							ParamComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class9.mapDotSprites[0], var4);
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
							var11 = var9.x / 32 - class101.localPlayer.x / 32;
							var12 = var9.y / 32 - class101.localPlayer.y / 32;
							ParamComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class9.mapDotSprites[1], var4);
						}
					}
				}
				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;
				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class101.localPlayer) {
						var12 = var15.x / 32 - class101.localPlayer.x / 32;
						int var13 = var15.y / 32 - class101.localPlayer.y / 32;
						if (var15.isFriend()) {
							ParamComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class9.mapDotSprites[3], var4);
						} else if (class101.localPlayer.team != 0 && var15.team != 0 && var15.team == class101.localPlayer.team) {
							ParamComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class9.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							ParamComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class9.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							ParamComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class9.mapDotSprites[6], var4);
						} else {
							ParamComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class9.mapDotSprites[2], var4);
						}
					}
				}
				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class101.localPlayer.x / 32;
							var12 = var19.y / 32 - class101.localPlayer.y / 32;
							UserComparator10.worldToMinimap(var1, var2, var11, var12, DynamicObject.mapMarkerSprites[1], var4);
						}
					}
					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class28.baseX * 4 + 2 - class101.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - WorldMapLabelSize.baseY * 4 + 2 - class101.localPlayer.y / 32;
						UserComparator10.worldToMinimap(var1, var2, var10, var11, DynamicObject.mapMarkerSprites[1], var4);
					}
					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class101.localPlayer.x / 32;
							var12 = var20.y / 32 - class101.localPlayer.y / 32;
							UserComparator10.worldToMinimap(var1, var2, var11, var12, DynamicObject.mapMarkerSprites[1], var4);
						}
					}
				}
				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class101.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class101.localPlayer.y / 32;
					ParamComposition.drawSpriteOnMinimap(var1, var2, var10, var11, DynamicObject.mapMarkerSprites[0], var4);
				}
				if (!class101.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
			Client.field704[var3] = true;
		}
	}
}