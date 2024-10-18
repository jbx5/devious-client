import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("gv")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -748699669
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -453798821
	)
	@Export("count")
	int count;
	@ObfuscatedName("ae")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("am")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	class241 field2636;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2636 = new class241(var3, var4);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	public int method4971() {
		return this.count;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljx;",
		garbageValue = "669227290"
	)
	public class241 method4972() {
		return this.field2636;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldw;II)V",
		garbageValue = "555386953"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			class36.method695(var1);
		} else if (var1.field1273 >= Client.cycle) {
			MusicSong.method6829(var1);
		} else {
			UserComparator6.method3351(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1273 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1220 * 64;
			var1.y = var1.pathY[0] * 128 + var1.field1220 * 64;
			var1.method2715();
		}

		if (var1 == SpriteMask.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1273 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1220 * 64;
			var1.y = var1.pathY[0] * 128 + var1.field1220 * 64;
			var1.method2715();
		}

		int var5;
		int var6;
		int var13;
		if (var1.targetIndex != -1) {
			WorldView var3 = null;
			Object var4 = null;
			var5 = 65536;
			if (var1.targetIndex < var5) {
				var3 = class416.method8058(var1.targetIndex, Client.worldViewManager);
				var4 = var3.npcs[var1.targetIndex];
			} else {
				var6 = var1.targetIndex - var5;
				var3 = class229.method4627(var6, Client.worldViewManager);
				var4 = var3.players[var6];
			}

			if (var4 != null) {
				class426 var12 = LoginState.method1296((float)var1.x, 0.0F, (float)var1.y);
				class426 var7 = LoginState.method1296((float)((Actor)var4).x, 0.0F, (float)((Actor)var4).y);
				WorldEntity var8;
				if (var0.id != -1) {
					var8 = class198.topLevelWorldView.worldEntities[var0.id];
					var12 = var8.method9155(var1.x, var1.y);
				}

				if (var3.id != -1) {
					var8 = class198.topLevelWorldView.worldEntities[var3.id];
					var7 = var8.method9155(((Actor)var4).x, ((Actor)var4).y);
				}

				var13 = (int)(var12.field4771 - var7.field4771);
				int var9 = (int)(var12.field4766 - var7.field4766);
				if (var13 != 0 || var9 != 0) {
					int var11 = (int)(Math.atan2((double)var13, (double)var9) * 325.94932345220167D) & 2047;
					var1.orientation = var11;
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var14;
		int var15;
		int var16;
		if (var1.pathLength == 0 || var1.field1263 > 0) {
			var14 = -1;
			if (var1.field1254 != -1 && var1.field1258 != -1) {
				var15 = Coord.method6854(var1.field1254 - class198.topLevelWorldView.baseX);
				var5 = Coord.method6854(var1.field1258 - class198.topLevelWorldView.baseY);
				var6 = var1.x - var15;
				var16 = var1.y - var5;
				if (var6 != 0 || var16 != 0) {
					var13 = (int)(Math.atan2((double)var6, (double)var16) * 325.94932345220167D) & 2047;
					var14 = var13;
				}
			} else if (var1.field1253 != -1) {
				var14 = var1.field1253;
			}

			if (var14 != -1) {
				var1.orientation = var14;
				if (var1.field1256) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2724();
		}

		var14 = var1.orientation - var1.rotation & 2047;
		if (var14 != 0) {
			boolean var23 = true;
			boolean var20 = true;
			++var1.field1284;
			var6 = var14 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1285;
			boolean var24 = true;
			if (var14 < var1.field1285 || var14 > 2048 - var1.field1285) {
				var1.rotation = var1.orientation;
				var24 = false;
			}

			if (var1.field1285 > 0 && var1.idleSequence == var1.movementSequence && (var1.field1284 > 25 || var24)) {
				if (var6 == -1 && var1.turnLeftSequence != -1) {
					var1.movementSequence = var1.turnLeftSequence;
				} else if (var6 == 1 && var1.turnRightSequence != -1) {
					var1.movementSequence = var1.turnRightSequence;
				} else {
					var1.movementSequence = var1.walkSequence;
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1284 = 0;
		}

		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			SequenceDefinition var17 = Widget.SequenceDefinition_get(var1.movementSequence);
			if (var17 != null) {
				if (!var17.isCachedModelIdSet() && var17.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var17.frameIds.length && var1.movementFrameCycle > var17.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						WorldMapSection0.method6223(var17, var1.movementFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					}

					if (var1.movementFrame >= var17.frameIds.length) {
						if (var17.frameCount > 0) {
							var1.movementFrame -= var17.frameCount;
							if (var17.field2324) {
								++var1.field1260;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var17.frameIds.length || var17.field2324 && var1.field1260 >= var17.field2323) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1260 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						WorldMapSection0.method6223(var17, var1.movementFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					}
				} else if (var17.isCachedModelIdSet()) {
					++var1.movementFrame;
					var15 = var17.method4367();
					if (var1.movementFrame < var15) {
						WorldMapSection0.method6223(var17, var1.movementFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					} else {
						if (var17.frameCount > 0) {
							var1.movementFrame -= var17.frameCount;
							if (var17.field2324) {
								++var1.field1260;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var15 || var17.field2324 && var1.field1260 >= var17.field2323) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1260 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						WorldMapSection0.method6223(var17, var1.movementFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var18 = new IterableNodeHashTableIterator(var1.method2721());

		for (ActorSpotAnim var19 = (ActorSpotAnim)var18.method9745(); var19 != null; var19 = (ActorSpotAnim)var18.next()) {
			if (var19.spotAnimation != -1 && Client.cycle >= var19.field5054) {
				var5 = class362.SpotAnimationDefinition_get(var19.spotAnimation).sequence;
				if (var5 == -1) {
					var19.remove();
					--var1.graphicsCount;
				} else {
					var19.spotAnimationFrame = Math.max(var19.spotAnimationFrame, 0);
					SequenceDefinition var22 = Widget.SequenceDefinition_get(var5);
					if (var22.frameIds != null && !var22.isCachedModelIdSet()) {
						++var19.spotAnimationFrameCycle;
						if (var19.spotAnimationFrame < var22.frameIds.length && var19.spotAnimationFrameCycle > var22.frameLengths[var19.spotAnimationFrame]) {
							var19.spotAnimationFrameCycle = 1;
							++var19.spotAnimationFrame;
							WorldMapSection0.method6223(var22, var19.spotAnimationFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
						}

						if (var19.spotAnimationFrame >= var22.frameIds.length) {
							var19.remove();
							--var1.graphicsCount;
						}
					} else if (var22.isCachedModelIdSet()) {
						++var19.spotAnimationFrame;
						var16 = var22.method4367();
						if (var19.spotAnimationFrame < var16) {
							WorldMapSection0.method6223(var22, var19.spotAnimationFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
						} else {
							var19.remove();
							--var1.graphicsCount;
						}
					} else {
						var19.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var21;
		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var21 = Widget.SequenceDefinition_get(var1.sequence);
			if (var21.field2325 == 1 && var1.field1291 > 0 && var1.spotAnimation <= Client.cycle && var1.field1273 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var21 = Widget.SequenceDefinition_get(var1.sequence);
			if (var21 == null) {
				var1.sequence = -1;
			} else if (!var21.isCachedModelIdSet() && var21.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var21.frameIds.length && var1.sequenceFrameCycle > var21.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					WorldMapSection0.method6223(var21, var1.sequenceFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
				}

				if (var1.sequenceFrame >= var21.frameIds.length) {
					var1.sequenceFrame -= var21.frameCount;
					++var1.field1237;
					if (var1.field1237 >= var21.field2323) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var21.frameIds.length) {
						WorldMapSection0.method6223(var21, var1.sequenceFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var21.field2319;
			} else if (var21.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var21.method4367();
				if (var1.sequenceFrame < var5) {
					WorldMapSection0.method6223(var21, var1.sequenceFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
				} else {
					var1.sequenceFrame -= var21.frameCount;
					++var1.field1237;
					if (var1.field1237 >= var21.field2323) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						WorldMapSection0.method6223(var21, var1.sequenceFrame, var1.x, var1.y, var1 == SpriteMask.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}
			} else {
				var1.sequence = -1;
			}
		}

		if (var1.sequenceDelay > 0) {
			--var1.sequenceDelay;
		}

	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "2041547238"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class149.method3569();
		SpriteMask var4 = var0.method7328(class416.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + GameEngine.entity.getX() / 32;
				int var7 = 464 - GameEngine.entity.getY() / 32;
				Decimator.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - GameEngine.entity.getX() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - GameEngine.entity.getY() / 32;
					class421.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = class198.topLevelWorldView.groundItems[class198.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - GameEngine.entity.getX() / 32;
							var12 = var16 * 4 + 2 - GameEngine.entity.getY() / 32;
							class421.drawSpriteOnMinimap(var1, var2, var11, var12, GraphicsObject.field892[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class198.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = class198.topLevelWorldView.npcs[class198.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - GameEngine.entity.getX() / 32;
							var12 = var9.y / 32 - GameEngine.entity.getY() / 32;
							class421.drawSpriteOnMinimap(var1, var2, var11, var12, GraphicsObject.field892[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = class198.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != SpriteMask.localPlayer) {
						var12 = var15.x / 32 - GameEngine.entity.getX() / 32;
						int var13 = var15.y / 32 - GameEngine.entity.getY() / 32;
						if (var15.isFriend()) {
							class421.drawSpriteOnMinimap(var1, var2, var12, var13, GraphicsObject.field892[3], var4);
						} else if (SpriteMask.localPlayer.team != 0 && var15.team != 0 && var15.team == SpriteMask.localPlayer.team) {
							class421.drawSpriteOnMinimap(var1, var2, var12, var13, GraphicsObject.field892[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class421.drawSpriteOnMinimap(var1, var2, var12, var13, GraphicsObject.field892[5], var4);
						} else if (var15.isClanMember()) {
							class421.drawSpriteOnMinimap(var1, var2, var12, var13, GraphicsObject.field892[6], var4);
						} else {
							class421.drawSpriteOnMinimap(var1, var2, var12, var13, GraphicsObject.field892[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < class198.topLevelWorldView.npcs.length) {
						NPC var19 = class198.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - GameEngine.entity.getX() / 32;
							var12 = var19.y / 32 - GameEngine.entity.getY() / 32;
							AsyncRestClient.worldToMinimap(var1, var2, var11, var12, class136.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class198.topLevelWorldView.baseX * 4 + 2 - GameEngine.entity.getX() / 32;
						var11 = Client.hintArrowY * 4 - class198.topLevelWorldView.baseY * 4 + 2 - GameEngine.entity.getY() / 32;
						AsyncRestClient.worldToMinimap(var1, var2, var10, var11, class136.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < class198.topLevelWorldView.players.length) {
						Player var20 = class198.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - GameEngine.entity.getX() / 32;
							var12 = var20.y / 32 - GameEngine.entity.getY() / 32;
							AsyncRestClient.worldToMinimap(var1, var2, var11, var12, class136.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - GameEngine.entity.getX() / 32;
					var11 = Client.destinationY * 4 + 2 - GameEngine.entity.getY() / 32;
					class421.drawSpriteOnMinimap(var1, var2, var10, var11, class136.mapDotSprites[0], var4);
				}

				if (!SpriteMask.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field716[var3] = true;
		}
	}
}
