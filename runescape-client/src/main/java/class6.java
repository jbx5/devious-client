import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public enum class6 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	field14(0, 0);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1375980133
	)
	public final int field21;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1249543369
	)
	final int field13;

	class6(int var3, int var4) {
		this.field21 = var3;
		this.field13 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)V",
		garbageValue = "1987002078"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var11;
		if (var0.spotAnimation >= Client.cycle) {
			var11 = Math.max(1, var0.spotAnimation - Client.cycle);
			var3 = var0.field1238 * 128 + var0.field1189 * 64;
			var4 = var0.field1185 * 128 + var0.field1189 * 64;
			var0.x += (var3 - var0.x) / var11;
			var0.y += (var4 - var0.y) / var11;
			var0.field1233 = 0;
			var0.orientation = var0.field1254;
		} else if (var0.field1243 >= Client.cycle) {
			JagexCache.method3537(var0);
		} else {
			var0.movementSequence = var0.idleSequence;
			if (var0.pathLength == 0) {
				var0.field1233 = 0;
			} else {
				label681: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) {
						var2 = class36.SequenceDefinition_get(var0.sequence);
						if (var0.field1261 > 0 && var2.field2327 == 0) {
							++var0.field1233;
							break label681;
						}

						if (var0.field1261 <= 0 && var2.field2339 == 0) {
							++var0.field1233;
							break label681;
						}
					}

					var11 = var0.x;
					var3 = var0.y;
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1189 * 64;
					var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1189 * 64;
					if (var11 < var4) {
						if (var3 < var5) {
							var0.orientation = 1280;
						} else if (var3 > var5) {
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536;
						}
					} else if (var11 > var4) {
						if (var3 < var5) {
							var0.orientation = 768;
						} else if (var3 > var5) {
							var0.orientation = 256;
						} else {
							var0.orientation = 512;
						}
					} else if (var3 < var5) {
						var0.orientation = 1024;
					} else if (var3 > var5) {
						var0.orientation = 0;
					}

					class231 var6 = var0.pathTraversed[var0.pathLength - 1];
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
						var7 = var0.orientation - var0.rotation & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence;
						if (var7 >= -256 && var7 <= 256) {
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) {
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) {
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) {
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8;
						int var9 = 4;
						boolean var10 = true;
						if (var0 instanceof NPC) {
							var10 = ((NPC)var0).definition.isClipped;
						}

						if (var10) {
							if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1216 != 0) {
								var9 = 2;
							}

							if (var0.pathLength > 2) {
								var9 = 6;
							}

							if (var0.pathLength > 3) {
								var9 = 8;
							}

							if (var0.field1233 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1233;
							}
						} else {
							if (var0.pathLength > 1) {
								var9 = 6;
							}

							if (var0.pathLength > 2) {
								var9 = 8;
							}

							if (var0.field1233 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1233;
							}
						}

						if (var6 == class231.field2427) {
							var9 <<= 1;
						} else if (var6 == class231.field2426) {
							var9 >>= 1;
						}

						if (var9 >= 8) {
							if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
								var0.movementSequence = var0.runSequence;
							} else if (var0.walkBackSequence == var0.movementSequence && var0.field1217 != -1) {
								var0.movementSequence = var0.field1217;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1202 != -1) {
								var0.movementSequence = var0.field1202;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1201 != -1) {
								var0.movementSequence = var0.field1201;
							}
						} else if (var9 <= 2) {
							if (var0.walkSequence == var0.movementSequence && var0.field1196 != -1) {
								var0.movementSequence = var0.field1196;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1203 != -1) {
								var0.movementSequence = var0.field1203;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1219 != -1) {
								var0.movementSequence = var0.field1219;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1205 != -1) {
								var0.movementSequence = var0.field1205;
							}
						}

						if (var4 != var11 || var3 != var5) {
							if (var11 < var4) {
								var0.x += var9;
								if (var0.x > var4) {
									var0.x = var4;
								}
							} else if (var11 > var4) {
								var0.x -= var9;
								if (var0.x < var4) {
									var0.x = var4;
								}
							}

							if (var3 < var5) {
								var0.y += var9;
								if (var0.y > var5) {
									var0.y = var5;
								}
							} else if (var3 > var5) {
								var0.y -= var9;
								if (var0.y < var5) {
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) {
							--var0.pathLength;
							if (var0.field1261 > 0) {
								--var0.field1261;
							}
						}
					} else {
						var0.x = var4;
						var0.y = var5;
						--var0.pathLength;
						if (var0.field1261 > 0) {
							--var0.field1261;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1243 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1189 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1189 * 64;
			var0.method2421();
		}

		if (TextureProvider.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1243 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1189 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1189 * 64;
			var0.method2421();
		}

		if (var0.targetIndex != -1) {
			var2 = null;
			var3 = 65536;
			Object var16;
			if (var0.targetIndex < var3) {
				var16 = Client.npcs[var0.targetIndex];
			} else {
				var16 = Client.players[var0.targetIndex - var3];
			}

			if (var16 != null) {
				var4 = var0.x - ((Actor)var16).x;
				var5 = var0.y - ((Actor)var16).y;
				if (var4 != 0 || var5 != 0) {
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047;
					var0.orientation = var7;
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var12;
		if (var0.pathLength == 0 || var0.field1233 > 0) {
			var11 = -1;
			if (var0.field1224 != -1 && var0.field1225 != -1) {
				var3 = var0.field1224 * 128 - class20.baseX * 8192 + 64;
				var4 = var0.field1225 * 128 - class19.baseY * 8192 + 64;
				var5 = var0.x - var3;
				var12 = var0.y - var4;
				if (var5 != 0 || var12 != 0) {
					var7 = (int)(Math.atan2((double)var5, (double)var12) * 325.94932345220167D) & 2047;
					var11 = var7;
				}
			} else if (var0.field1223 != -1) {
				var11 = var0.field1223;
			}

			if (var11 != -1) {
				var0.orientation = var11;
				if (var0.field1240) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2430();
		}

		var11 = var0.orientation - var0.rotation & 2047;
		if (var11 != 0) {
			boolean var18 = true;
			boolean var19 = true;
			++var0.field1212;
			var5 = var11 > 1024 ? -1 : 1;
			var0.rotation += var0.field1216 * var5;
			boolean var20 = true;
			if (var11 < var0.field1216 || var11 > 2048 - var0.field1216) {
				var0.rotation = var0.orientation;
				var20 = false;
			}

			if (var0.field1216 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1212 > 25 || var20)) {
				if (var5 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var5 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1212 = 0;
		}

		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			var2 = class36.SequenceDefinition_get(var0.movementSequence);
			if (var2 != null) {
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						FontName.method8850(var2, var0.movementFrame, var0.x, var0.y);
					}

					if (var0.movementFrame >= var2.frameIds.length) {
						if (var2.frameCount > 0) {
							var0.movementFrame -= var2.frameCount;
							if (var2.field2319) {
								++var0.field1230;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2319 && var0.field1230 >= var2.field2341) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1230 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						FontName.method8850(var2, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var2.isCachedModelIdSet()) {
					++var0.movementFrame;
					var3 = var2.method4177();
					if (var0.movementFrame < var3) {
						ModeWhere.method7181(var2, var0.movementFrame, var0.x, var0.y);
					} else {
						if (var2.frameCount > 0) {
							var0.movementFrame -= var2.frameCount;
							if (var2.field2319) {
								++var0.field1230;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2319 && var0.field1230 >= var2.field2341) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1230 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						ModeWhere.method7181(var2, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var17 = new IterableNodeHashTableIterator(var0.method2425());

		for (ActorSpotAnim var14 = (ActorSpotAnim)var17.method8861(); var14 != null; var14 = (ActorSpotAnim)var17.next()) {
			if (var14.spotAnimation != -1 && Client.cycle >= var14.field5282) {
				var4 = class406.SpotAnimationDefinition_get(var14.spotAnimation).sequence;
				if (var4 == -1) {
					var14.remove();
					--var0.graphicsCount;
				} else {
					var14.spotAnimationFrame = Math.max(var14.spotAnimationFrame, 0);
					SequenceDefinition var15 = class36.SequenceDefinition_get(var4);
					if (var15.frameIds != null && !var15.isCachedModelIdSet()) {
						++var14.spotAnimationFrameCycle;
						if (var14.spotAnimationFrame < var15.frameIds.length && var14.spotAnimationFrameCycle > var15.frameLengths[var14.spotAnimationFrame]) {
							var14.spotAnimationFrameCycle = 1;
							++var14.spotAnimationFrame;
							FontName.method8850(var15, var14.spotAnimationFrame, var0.x, var0.y);
						}

						if (var14.spotAnimationFrame >= var15.frameIds.length) {
							var14.remove();
							--var0.graphicsCount;
						}
					} else if (var15.isCachedModelIdSet()) {
						++var14.spotAnimationFrame;
						var12 = var15.method4177();
						if (var14.spotAnimationFrame < var12) {
							ModeWhere.method7181(var15, var14.spotAnimationFrame, var0.x, var0.y);
						} else {
							var14.remove();
							--var0.graphicsCount;
						}
					} else {
						var14.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var21;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var21 = class36.SequenceDefinition_get(var0.sequence);
			if (var21.field2327 == 1 && var0.field1261 > 0 && var0.spotAnimation <= Client.cycle && var0.field1243 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var21 = class36.SequenceDefinition_get(var0.sequence);
			if (var21 == null) {
				var0.sequence = -1;
			} else if (!var21.isCachedModelIdSet() && var21.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var21.frameIds.length && var0.sequenceFrameCycle > var21.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					FontName.method8850(var21, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var21.frameIds.length) {
					var0.sequenceFrame -= var21.frameCount;
					++var0.field1235;
					if (var0.field1235 >= var21.field2341) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var21.frameIds.length) {
						FontName.method8850(var21, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var21.field2338;
			} else if (var21.isCachedModelIdSet()) {
				++var0.sequenceFrame;
				var4 = var21.method4177();
				if (var0.sequenceFrame < var4) {
					ModeWhere.method7181(var21, var0.sequenceFrame, var0.x, var0.y);
				} else {
					var0.sequenceFrame -= var21.frameCount;
					++var0.field1235;
					if (var0.field1235 >= var21.field2341) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) {
						ModeWhere.method7181(var21, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "569925847"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class10.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) {
			var7 = class10.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class372.method6898(var5)) {
				var10 = var4;
			}

			int[] var11 = SpriteMask.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = SecureRandomFuture.Entity_unpackID(var5);
			ObjectComposition var14 = class91.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = KitDefinition.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class10.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class10.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = SecureRandomFuture.Entity_unpackID(var5);
			ObjectComposition var24 = class91.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = KitDefinition.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class372.method6898(var5)) {
					var12 = 15597568;
				}

				int[] var18 = SpriteMask.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = class10.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = SecureRandomFuture.Entity_unpackID(var5);
			ObjectComposition var21 = class91.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = KitDefinition.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-2045006615"
	)
	static final void method40(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field805 == -1) {
				Client.field805 = var0.spriteId2;
				Client.field806 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field805;
			} else {
				var0.spriteId2 = Client.field806;
			}

		} else if (var1 == 325) {
			if (Client.field805 == -1) {
				Client.field805 = var0.spriteId2;
				Client.field806 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field806;
			} else {
				var0.spriteId2 = Client.field805;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
