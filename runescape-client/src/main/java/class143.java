import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ew")
public class class143 extends class128 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -772192395)
	static int field1639;

	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = 1559501797777688911L)
	long field1642;

	@ObfuscatedName("h")
	String field1640;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -2145178383)
	int field1641;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1642 = -1L;
		this.field1640 = null;
		this.field1641 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1642 = var1.readLong();
		}
		this.field1640 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1641 = var1.readUnsignedShort();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.method2955(this.field1642, this.field1640, this.field1641);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V", garbageValue = "-1252332390")
	static void method3003(Float var0, Float var1) {
		if (var0 + class114.field1410 < 1.3333334F) {
			float var2 = var0 - 2.0F;
			float var3 = var0 - 1.0F;
			float var4 = ((float) (Math.sqrt(((double) (var2 * var2 - var3 * 4.0F * var3)))));
			float var5 = 0.5F * (-var2 + var4);
			if (var1 + class114.field1410 > var5) {
				var1 = var5 - class114.field1410;
			} else {
				var5 = (-var2 - var4) * 0.5F;
				if (var1 < class114.field1410 + var5) {
					var1 = class114.field1410 + var5;
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1410;
			var1 = 0.33333334F - class114.field1410;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(descriptor = "(Lkn;IIIB)V", garbageValue = "0")
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class83.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = ScriptFrame.localPlayer.x / 32 + 48;
				int var7 = 464 - ScriptFrame.localPlayer.y / 32;
				class1.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);
				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - ScriptFrame.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - ScriptFrame.localPlayer.y / 32;
					SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}
				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class268.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - ScriptFrame.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - ScriptFrame.localPlayer.y / 32;
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode.mapDotSprites[0], var4);
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
							var11 = var9.x / 32 - ScriptFrame.localPlayer.x / 32;
							var12 = var9.y / 32 - ScriptFrame.localPlayer.y / 32;
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode.mapDotSprites[1], var4);
						}
					}
				}
				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;
				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != ScriptFrame.localPlayer) {
						var12 = var15.x / 32 - ScriptFrame.localPlayer.x / 32;
						int var13 = var15.y / 32 - ScriptFrame.localPlayer.y / 32;
						if (var15.isFriend()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.mapDotSprites[3], var4);
						} else if (ScriptFrame.localPlayer.team != 0 && var15.team != 0 && var15.team == ScriptFrame.localPlayer.team) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.mapDotSprites[6], var4);
						} else {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.mapDotSprites[2], var4);
						}
					}
				}
				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - ScriptFrame.localPlayer.x / 32;
							var12 = var19.y / 32 - ScriptFrame.localPlayer.y / 32;
							ArchiveLoader.worldToMinimap(var1, var2, var11, var12, class7.mapMarkerSprites[1], var4);
						}
					}
					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - Decimator.baseX * 32 + 2 - ScriptFrame.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class7.baseY * 256 + 2 - ScriptFrame.localPlayer.y / 32;
						ArchiveLoader.worldToMinimap(var1, var2, var10, var11, class7.mapMarkerSprites[1], var4);
					}
					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - ScriptFrame.localPlayer.x / 32;
							var12 = var20.y / 32 - ScriptFrame.localPlayer.y / 32;
							ArchiveLoader.worldToMinimap(var1, var2, var11, var12, class7.mapMarkerSprites[1], var4);
						}
					}
				}
				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - ScriptFrame.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - ScriptFrame.localPlayer.y / 32;
					SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var10, var11, class7.mapMarkerSprites[0], var4);
				}
				if (!ScriptFrame.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
			Client.field753[var3] = true;
		}
	}
}