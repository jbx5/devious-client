import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class173 extends class188 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 408192727
	)
	int field1850;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	final class185 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhj;Ljava/lang/String;I)V"
	)
	class173(class185 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1850 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-435761148"
	)
	public int vmethod3757() {
		return 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2059088308"
	)
	public int vmethod3759() {
		return this.field1850;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "1364141864"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		return class193.method3793(var0, 0, var0.length);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcl;IZIZI)I",
		garbageValue = "749541866"
	)
	static int method3504(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class237.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class237.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIIB)V",
		garbageValue = "-5"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class212.method4031();
		SpriteMask var4 = var0.method6924(AsyncRestClient.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + Interpreter.field899.vmethod8779() / 32;
				int var7 = 464 - Interpreter.field899.vmethod8773() / 32;
				HealthBarUpdate.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - Interpreter.field899.vmethod8779() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - Interpreter.field899.vmethod8773() / 32;
					class94.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = class358.topLevelWorldView.groundItems[class358.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - Interpreter.field899.vmethod8779() / 32;
							var12 = var16 * 4 + 2 - Interpreter.field899.vmethod8773() / 32;
							class94.drawSpriteOnMinimap(var1, var2, var11, var12, SequenceDefinition.field2434[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class358.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = class358.topLevelWorldView.npcs[class358.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - Interpreter.field899.vmethod8779() / 32;
							var12 = var9.y / 32 - Interpreter.field899.vmethod8773() / 32;
							class94.drawSpriteOnMinimap(var1, var2, var11, var12, SequenceDefinition.field2434[1], var4);
						}
					}
				}

				var8 = class358.topLevelWorldView.playerUpdateManager.playerCount;
				int[] var17 = class358.topLevelWorldView.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = class358.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class17.localPlayer) {
						var12 = var15.x / 32 - Interpreter.field899.vmethod8779() / 32;
						int var13 = var15.y / 32 - Interpreter.field899.vmethod8773() / 32;
						if (var15.isFriend()) {
							class94.drawSpriteOnMinimap(var1, var2, var12, var13, SequenceDefinition.field2434[3], var4);
						} else if (class17.localPlayer.team != 0 && var15.team != 0 && var15.team == class17.localPlayer.team) {
							class94.drawSpriteOnMinimap(var1, var2, var12, var13, SequenceDefinition.field2434[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class94.drawSpriteOnMinimap(var1, var2, var12, var13, SequenceDefinition.field2434[5], var4);
						} else if (var15.isClanMember()) {
							class94.drawSpriteOnMinimap(var1, var2, var12, var13, SequenceDefinition.field2434[6], var4);
						} else {
							class94.drawSpriteOnMinimap(var1, var2, var12, var13, SequenceDefinition.field2434[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < class358.topLevelWorldView.npcs.length) {
						NPC var19 = class358.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - Interpreter.field899.vmethod8779() / 32;
							var12 = var19.y / 32 - Interpreter.field899.vmethod8773() / 32;
							SecureRandomFuture.worldToMinimap(var1, var2, var11, var12, Varcs.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class358.topLevelWorldView.baseX * 4 + 2 - Interpreter.field899.vmethod8779() / 32;
						var11 = Client.hintArrowY * 4 - class358.topLevelWorldView.baseY * 4 + 2 - Interpreter.field899.vmethod8773() / 32;
						SecureRandomFuture.worldToMinimap(var1, var2, var10, var11, Varcs.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < class358.topLevelWorldView.players.length) {
						Player var20 = class358.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - Interpreter.field899.vmethod8779() / 32;
							var12 = var20.y / 32 - Interpreter.field899.vmethod8773() / 32;
							SecureRandomFuture.worldToMinimap(var1, var2, var11, var12, Varcs.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Interpreter.field899.vmethod8779() / 32;
					var11 = Client.destinationY * 4 + 2 - Interpreter.field899.vmethod8773() / 32;
					class94.drawSpriteOnMinimap(var1, var2, var10, var11, Varcs.mapDotSprites[0], var4);
				}

				if (!class17.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field746[var3] = true;
		}
	}
}
