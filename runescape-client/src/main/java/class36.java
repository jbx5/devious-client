import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class36 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -923257993
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Llo;",
		garbageValue = "88"
	)
	static LoginPacket[] method708() {
		return new LoginPacket[]{LoginPacket.field3383, LoginPacket.field3380, LoginPacket.field3382, LoginPacket.field3378, LoginPacket.field3377, LoginPacket.field3379};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1667921404"
	)
	static boolean method709() {
		Date var0;
		try {
			var0 = class395.method7402();
		} catch (ParseException var7) {
			UserComparator7.method2966(7);
			class139.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var4 = var0.before(var3);
			boolean var6 = class241.method4832(var0);
			if (!var6) {
				UserComparator7.method2966(7);
				class139.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var4) {
					class160.field1748 = 8388607;
				} else {
					class160.field1748 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "-1700622537"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class102.method2728();
		SpriteMask var4 = var0.method6668(HealthBarDefinition.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class229.localPlayer.x / 32 + 48;
				int var7 = 464 - class229.localPlayer.y / 32;
				class102.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class229.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class229.localPlayer.y / 32;
					class147.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[ItemLayer.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class229.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class229.localPlayer.y / 32;
							class147.drawSpriteOnMinimap(var1, var2, var11, var12, HorizontalAlignment.field1908[0], var4);
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
							var11 = var9.x / 32 - class229.localPlayer.x / 32;
							var12 = var9.y / 32 - class229.localPlayer.y / 32;
							class147.drawSpriteOnMinimap(var1, var2, var11, var12, HorizontalAlignment.field1908[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class229.localPlayer) {
						var12 = var15.x / 32 - class229.localPlayer.x / 32;
						int var13 = var15.y / 32 - class229.localPlayer.y / 32;
						if (var15.isFriend()) {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[3], var4);
						} else if (class229.localPlayer.team != 0 && var15.team != 0 && var15.team == class229.localPlayer.team) {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[5], var4);
						} else if (var15.isClanMember()) {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[6], var4);
						} else {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class229.localPlayer.x / 32;
							var12 = var19.y / 32 - class229.localPlayer.y / 32;
							class153.worldToMinimap(var1, var2, var11, var12, class12.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - NpcOverrides.baseX * 256 + 2 - class229.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class101.baseY * 256 + 2 - class229.localPlayer.y / 32;
						class153.worldToMinimap(var1, var2, var10, var11, class12.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class229.localPlayer.x / 32;
							var12 = var20.y / 32 - class229.localPlayer.y / 32;
							class153.worldToMinimap(var1, var2, var11, var12, class12.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class229.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class229.localPlayer.y / 32;
					class147.drawSpriteOnMinimap(var1, var2, var10, var11, class12.mapDotSprites[0], var4);
				}

				if (!class229.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field785[var3] = true;
		}
	}
}
