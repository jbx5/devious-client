import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("az")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ah")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("af")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lab;I)Lat;",
		garbageValue = "739287375"
	)
	public static class3 method3536(class6 var0) {
		switch(var0.field13) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1747085526"
	)
	public static void method3529() {
		class192.field1915.clear();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnn;ZI)V",
		garbageValue = "-1161061937"
	)
	static void method3537(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = MouseRecorder.getWorldMap().getMapArea(var0);
		int var4 = class133.localPlayer.plane;
		int var5 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
		int var6 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		MouseRecorder.getWorldMap().method8750(var3, var7, var1, var2);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIII)V",
		garbageValue = "1230831106"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class167.method3417();
		SpriteMask var4 = var0.method6658(class243.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class133.localPlayer.x / 32 + 48;
				int var7 = 464 - class133.localPlayer.y / 32;
				Interpreter.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class133.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class133.localPlayer.y / 32;
					class277.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class172.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class133.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class133.localPlayer.y / 32;
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, KeyHandler.field115[0], var4);
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
							var11 = var9.x / 32 - class133.localPlayer.x / 32;
							var12 = var9.y / 32 - class133.localPlayer.y / 32;
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, KeyHandler.field115[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class133.localPlayer) {
						var12 = var15.x / 32 - class133.localPlayer.x / 32;
						int var13 = var15.y / 32 - class133.localPlayer.y / 32;
						if (var15.isFriend()) {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, KeyHandler.field115[3], var4);
						} else if (class133.localPlayer.team != 0 && var15.team != 0 && var15.team == class133.localPlayer.team) {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, KeyHandler.field115[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, KeyHandler.field115[5], var4);
						} else if (var15.isClanMember()) {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, KeyHandler.field115[6], var4);
						} else {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, KeyHandler.field115[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class133.localPlayer.x / 32;
							var12 = var19.y / 32 - class133.localPlayer.y / 32;
							Client.worldToMinimap(var1, var2, var11, var12, class33.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - GrandExchangeOfferOwnWorldComparator.baseX * 256 + 2 - class133.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - DevicePcmPlayerProvider.baseY * 256 + 2 - class133.localPlayer.y / 32;
						Client.worldToMinimap(var1, var2, var10, var11, class33.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class133.localPlayer.x / 32;
							var12 = var20.y / 32 - class133.localPlayer.y / 32;
							Client.worldToMinimap(var1, var2, var11, var12, class33.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class133.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class133.localPlayer.y / 32;
					class277.drawSpriteOnMinimap(var1, var2, var10, var11, class33.mapDotSprites[0], var4);
				}

				if (!class133.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field816[var3] = true;
		}
	}
}
