import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("sn")
	static boolean field3124;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 995489187
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1835328399
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1336345397
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;ILlk;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class104.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Llk;",
		garbageValue = "-1430269717"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-48"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16609"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldt;II)V",
		garbageValue = "-309817914"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var3;
		int var4;
		int var5;
		int var6;
		int var8;
		int var12;
		if (var1.spotAnimation >= Client.cycle) {
			class164.method3545(var1);
		} else if (var1.field1236 >= Client.cycle) {
			UserComparator4.method3044(var1);
		} else {
			var1.movementSequence = var1.idleSequence;
			if (var1.pathLength == 0) {
				var1.field1253 = 0;
			} else {
				label750: {
					if (var1.sequence != -1 && var1.sequenceDelay == 0) {
						var3 = class182.SequenceDefinition_get(var1.sequence);
						if (var1.field1255 > 0 && var3.field2866 == 0) {
							++var1.field1253;
							break label750;
						}

						if (var1.field1255 <= 0 && var3.field2885 == 0) {
							++var1.field1253;
							break label750;
						}
					}

					var12 = var1.x;
					var4 = var1.y;
					var5 = var1.pathX[var1.pathLength - 1] * 128 + var1.field1183 * 64;
					var6 = var1.field1183 * 64 + var1.pathY[var1.pathLength - 1] * 128;
					if (var12 < var5) {
						if (var4 < var6) {
							var1.orientation = 1280;
						} else if (var4 > var6) {
							var1.orientation = 1792;
						} else {
							var1.orientation = 1536;
						}
					} else if (var12 > var5) {
						if (var4 < var6) {
							var1.orientation = 768;
						} else if (var4 > var6) {
							var1.orientation = 256;
						} else {
							var1.orientation = 512;
						}
					} else if (var4 < var6) {
						var1.orientation = 1024;
					} else if (var4 > var6) {
						var1.orientation = 0;
					}

					MoveSpeed var7 = var1.pathTraversed[var1.pathLength - 1];
					if (var5 - var12 <= 256 && var5 - var12 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
						var8 = var1.orientation - var1.rotation & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						int var9 = var1.walkBackSequence;
						if (var8 >= -256 && var8 <= 256) {
							var9 = var1.walkSequence;
						} else if (var8 >= 256 && var8 < 768) {
							var9 = var1.walkRightSequence;
						} else if (var8 >= -768 && var8 <= -256) {
							var9 = var1.walkLeftSequence;
						}

						if (var9 == -1) {
							var9 = var1.walkSequence;
						}

						var1.movementSequence = var9;
						int var10 = 4;
						boolean var11 = true;
						if (var1 instanceof NPC) {
							var11 = ((NPC)var1).definition.isClipped;
						}

						if (var11) {
							if (var1.orientation != var1.rotation && var1.targetIndex == -1 && var1.field1221 != 0) {
								var10 = 2;
							}

							if (var1.pathLength > 2) {
								var10 = 6;
							}

							if (var1.pathLength > 3) {
								var10 = 8;
							}

							if (var1.field1253 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1253;
							}
						} else {
							if (var1.pathLength > 1) {
								var10 = 6;
							}

							if (var1.pathLength > 2) {
								var10 = 8;
							}

							if (var1.field1253 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1253;
							}
						}

						if (var7 == MoveSpeed.field2984) {
							var10 <<= 1;
						} else if (var7 == MoveSpeed.field2987) {
							var10 >>= 1;
						}

						if (var10 >= 8) {
							if (var1.movementSequence == var1.walkSequence && var1.runSequence != -1) {
								var1.movementSequence = var1.runSequence;
							} else if (var1.movementSequence == var1.walkBackSequence && var1.field1251 != -1) {
								var1.movementSequence = var1.field1251;
							} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1194 != -1) {
								var1.movementSequence = var1.field1194;
							} else if (var1.movementSequence == var1.walkRightSequence && var1.field1195 != -1) {
								var1.movementSequence = var1.field1195;
							}
						} else if (var10 <= 2) {
							if (var1.walkSequence == var1.movementSequence && var1.field1196 != -1) {
								var1.movementSequence = var1.field1196;
							} else if (var1.walkBackSequence == var1.movementSequence && var1.field1197 != -1) {
								var1.movementSequence = var1.field1197;
							} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1188 != -1) {
								var1.movementSequence = var1.field1188;
							} else if (var1.walkRightSequence == var1.movementSequence && var1.field1199 != -1) {
								var1.movementSequence = var1.field1199;
							}
						}

						if (var5 != var12 || var4 != var6) {
							if (var12 < var5) {
								var1.x += var10;
								if (var1.x > var5) {
									var1.x = var5;
								}
							} else if (var12 > var5) {
								var1.x -= var10;
								if (var1.x < var5) {
									var1.x = var5;
								}
							}

							if (var4 < var6) {
								var1.y += var10;
								if (var1.y > var6) {
									var1.y = var6;
								}
							} else if (var4 > var6) {
								var1.y -= var10;
								if (var1.y < var6) {
									var1.y = var6;
								}
							}
						}

						if (var5 == var1.x && var6 == var1.y) {
							--var1.pathLength;
							if (var1.field1255 > 0) {
								--var1.field1255;
							}
						}
					} else {
						var1.x = var5;
						var1.y = var6;
						--var1.pathLength;
						if (var1.field1255 > 0) {
							--var1.field1255;
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1236 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1183 * 64;
			var1.y = var1.field1183 * 64 + var1.pathY[0] * 128;
			var1.method2555();
		}

		if (var1 == class253.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1236 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.field1183 * 64 + var1.pathX[0] * 128;
			var1.y = var1.pathY[0] * 128 + var1.field1183 * 64;
			var1.method2555();
		}

		if (var1.targetIndex != -1) {
			var3 = null;
			var4 = 65536;
			Object var17;
			if (var1.targetIndex < var4) {
				var17 = var0.npcs[var1.targetIndex];
			} else {
				var17 = var0.players[var1.targetIndex - var4];
			}

			if (var17 != null) {
				var5 = var1.x - ((Actor)var17).x;
				var6 = var1.y - ((Actor)var17).y;
				if (var5 != 0 || var6 != 0) {
					var8 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167D) & 2047;
					var1.orientation = var8;
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var13;
		if (var1.pathLength == 0 || var1.field1253 > 0) {
			var12 = -1;
			if (var1.field1200 != -1 && var1.field1218 != -1) {
				var4 = class378.method7167(var1.field1200 - ConcurrentMidiTask.topLevelWorldView.baseX);
				var5 = class378.method7167(var1.field1218 - ConcurrentMidiTask.topLevelWorldView.baseY);
				var6 = var1.x - var4;
				var13 = var1.y - var5;
				if (var6 != 0 || var13 != 0) {
					var8 = (int)(Math.atan2((double)var6, (double)var13) * 325.94932345220167D) & 2047;
					var12 = var8;
				}
			} else if (var1.field1254 != -1) {
				var12 = var1.field1254;
			}

			if (var12 != -1) {
				var1.orientation = var12;
				if (var1.field1219) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2528();
		}

		var12 = var1.orientation - var1.rotation & 2047;
		if (var12 != 0) {
			boolean var18 = true;
			boolean var20 = true;
			++var1.field1247;
			var6 = var12 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1221;
			boolean var21 = true;
			if (var12 < var1.field1221 || var12 > 2048 - var1.field1221) {
				var1.rotation = var1.orientation;
				var21 = false;
			}

			if (var1.field1221 > 0 && var1.movementSequence == var1.idleSequence && (var1.field1247 > 25 || var21)) {
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

			var1.field1247 = 0;
		}

		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			var3 = class182.SequenceDefinition_get(var1.movementSequence);
			if (var3 != null) {
				if (!var3.isCachedModelIdSet() && var3.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var3.frameIds.length && var1.movementFrameCycle > var3.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						class142.method3293(var3, var1.movementFrame, var1.x, var1.y, var1 == class253.localPlayer);
					}

					if (var1.movementFrame >= var3.frameIds.length) {
						if (var3.frameCount > 0) {
							var1.movementFrame -= var3.frameCount;
							if (var3.field2883) {
								++var1.field1192;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var3.frameIds.length || var3.field2883 && var1.field1192 >= var3.field2882) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1192 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class142.method3293(var3, var1.movementFrame, var1.x, var1.y, var1 == class253.localPlayer);
					}
				} else if (var3.isCachedModelIdSet()) {
					++var1.movementFrame;
					var4 = var3.method5307();
					if (var1.movementFrame < var4) {
						class139.method3253(var3, var1.movementFrame, var1.x, var1.y, var1 == class253.localPlayer);
					} else {
						if (var3.frameCount > 0) {
							var1.movementFrame -= var3.frameCount;
							if (var3.field2883) {
								++var1.field1192;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var4 || var3.field2883 && var1.field1192 >= var3.field2882) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1192 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class139.method3253(var3, var1.movementFrame, var1.x, var1.y, var1 == class253.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var19 = new IterableNodeHashTableIterator(var1.method2525());

		for (ActorSpotAnim var15 = (ActorSpotAnim)var19.method9276(); var15 != null; var15 = (ActorSpotAnim)var19.next()) {
			if (var15.spotAnimation != -1 && Client.cycle >= var15.field4956) {
				var5 = AbstractWorldMapIcon.SpotAnimationDefinition_get(var15.spotAnimation).sequence;
				if (var5 == -1) {
					var15.remove();
					--var1.graphicsCount;
				} else {
					var15.spotAnimationFrame = Math.max(var15.spotAnimationFrame, 0);
					SequenceDefinition var16 = class182.SequenceDefinition_get(var5);
					if (var16.frameIds != null && !var16.isCachedModelIdSet()) {
						++var15.spotAnimationFrameCycle;
						if (var15.spotAnimationFrame < var16.frameIds.length && var15.spotAnimationFrameCycle > var16.frameLengths[var15.spotAnimationFrame]) {
							var15.spotAnimationFrameCycle = 1;
							++var15.spotAnimationFrame;
							class142.method3293(var16, var15.spotAnimationFrame, var1.x, var1.y, var1 == class253.localPlayer);
						}

						if (var15.spotAnimationFrame >= var16.frameIds.length) {
							var15.remove();
							--var1.graphicsCount;
						}
					} else if (var16.isCachedModelIdSet()) {
						++var15.spotAnimationFrame;
						var13 = var16.method5307();
						if (var15.spotAnimationFrame < var13) {
							class139.method3253(var16, var15.spotAnimationFrame, var1.x, var1.y, var1 == class253.localPlayer);
						} else {
							var15.remove();
							--var1.graphicsCount;
						}
					} else {
						var15.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var22;
		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var22 = class182.SequenceDefinition_get(var1.sequence);
			if (var22.field2866 == 1 && var1.field1255 > 0 && var1.spotAnimation <= Client.cycle && var1.field1236 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var22 = class182.SequenceDefinition_get(var1.sequence);
			if (var22 == null) {
				var1.sequence = -1;
			} else if (!var22.isCachedModelIdSet() && var22.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var22.frameIds.length && var1.sequenceFrameCycle > var22.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					class142.method3293(var22, var1.sequenceFrame, var1.x, var1.y, var1 == class253.localPlayer);
				}

				if (var1.sequenceFrame >= var22.frameIds.length) {
					var1.sequenceFrame -= var22.frameCount;
					++var1.field1228;
					if (var1.field1228 >= var22.field2882) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var22.frameIds.length) {
						class142.method3293(var22, var1.sequenceFrame, var1.x, var1.y, var1 == class253.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var22.field2872;
			} else if (var22.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var22.method5307();
				if (var1.sequenceFrame < var5) {
					class139.method3253(var22, var1.sequenceFrame, var1.x, var1.y, var1 == class253.localPlayer);
				} else {
					var1.sequenceFrame -= var22.frameCount;
					++var1.field1228;
					if (var1.field1228 >= var22.field2882) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						class139.method3253(var22, var1.sequenceFrame, var1.x, var1.y, var1 == class253.localPlayer);
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
}
