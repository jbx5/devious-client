import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
class class439 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	class439(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-856053440"
	)
	int method8183(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method8183((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-1619141249"
	)
	static final void method8184(Actor var0) {
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						GraphicsObject.method2116(var1, var0.movementFrame, var0.x, var0.y, var0);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2270) {
								++var0.field1232;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2270 && var0.field1232 >= var1.field2269) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1232 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						GraphicsObject.method2116(var1, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					int var2 = var1.method4065();
					if (var0.movementFrame < var2) {
						class334.method6394(var1, var0.movementFrame, var0.x, var0.y, var0);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2270) {
								++var0.field1232;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2270 && var0.field1232 >= var1.field2269) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1232 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						class334.method6394(var1, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2475());

		int var3;
		for (ActorSpotAnim var6 = (ActorSpotAnim)var7.method9127(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
			if (var6.spotAnimation != -1 && Client.cycle >= var6.field5351) {
				var3 = VarbitComposition.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
				if (var3 == -1) {
					var6.remove();
					--var0.graphicsCount;
				} else {
					var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
					SequenceDefinition var4 = MilliClock.SequenceDefinition_get(var3);
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrameCycle;
						if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
							var6.spotAnimationFrameCycle = 1;
							++var6.spotAnimationFrame;
							GraphicsObject.method2116(var4, var6.spotAnimationFrame, var0.x, var0.y, var0);
						}

						if (var6.spotAnimationFrame >= var4.frameIds.length) {
							var6.remove();
							--var0.graphicsCount;
						}
					} else if (var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrame;
						int var5 = var4.method4065();
						if (var6.spotAnimationFrame < var5) {
							class334.method6394(var4, var6.spotAnimationFrame, var0.x, var0.y, var0);
						} else {
							var6.remove();
							--var0.graphicsCount;
						}
					} else {
						var6.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var8 = MilliClock.SequenceDefinition_get(var0.sequence);
			if (var8.field2271 == 1 && var0.field1280 > 0 && var0.spotAnimation <= Client.cycle && var0.field1271 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = MilliClock.SequenceDefinition_get(var0.sequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						GraphicsObject.method2116(var8, var0.sequenceFrame, var0.x, var0.y, var0);
					}

					if (var0.sequenceFrame >= var8.frameIds.length) {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1254;
						if (var0.field1254 >= var8.field2269) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
							GraphicsObject.method2116(var8, var0.sequenceFrame, var0.x, var0.y, var0);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var8.field2265;
				} else if (var8.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var3 = var8.method4065();
					if (var0.sequenceFrame < var3) {
						class334.method6394(var8, var0.sequenceFrame, var0.x, var0.y, var0);
					} else {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1254;
						if (var0.field1254 >= var8.field2269) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
							class334.method6394(var8, var0.sequenceFrame, var0.x, var0.y, var0);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-435095249"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class473.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = Actor.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = Actor.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = Actor.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = Actor.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (var8 != 0L) {
				var13 = Actor.scene.getObjectFlags(var0, var2, var3, var8);
				int var25 = Message.Entity_unpackID(var8);
				int var26 = var13 & 31;
				int var27 = var13 >> 6 & 3;
				var14 = class127.getObjectDefinition(var25);
				if (var14 != null && var14.hasSound()) {
					int var17 = var14.sizeX;
					int var18 = var14.sizeY;
					if (var27 == 1 || var27 == 3) {
						var17 = var14.sizeY;
						var18 = var14.sizeX;
					}

					int var19 = (var2 + var17) * 128;
					int var20 = (var3 + var18) * 128;
					int var15 = var2 * 128;
					int var16 = var3 * 128;
					int var21 = var14.ambientSoundId;
					int var22 = var14.int7 * 128;
					int var23 = var14.int8 * 128;
					if (var14.transforms != null) {
						ObjectComposition var24 = var14.transform();
						if (var24 != null) {
							var21 = var24.ambientSoundId;
							var22 = var24.int7 * 128;
							var23 = var24.int8 * 128;
						}
					}

					Object var10000 = null;

					for (ObjectSound var28 = (ObjectSound)ObjectSound.objectSounds.last(); var28 != null; var28 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var0 == var28.plane && var15 == var28.x * 16384 && var16 == var28.y * 128 && var19 == var28.maxX * 128 && var20 == var28.maxY * 16384 && var21 == var28.soundEffectId && var22 == var28.field872 && var23 == var28.field864) {
							if (var28.stream1 != null) {
								SceneTilePaint.pcmStreamMixer.removeSubStream(var28.stream1);
								var28.stream1 = null;
							}

							if (var28.stream2 != null) {
								SceneTilePaint.pcmStreamMixer.removeSubStream(var28.stream2);
								var28.stream2 = null;
							}

							var28.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var1 == 0) {
					Actor.scene.removeBoundaryObject(var0, var2, var3);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4476(var2, var3, var26, var27, var14.boolean1);
					}
				}

				if (var1 == 1) {
					Actor.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					Actor.scene.removeGameObject(var0, var2, var3);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var27, var14.boolean1);
					}
				}

				if (var1 == 3) {
					Actor.scene.removeFloorDecoration(var0, var2, var3);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4489(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				World.method1821(var0, var13, var2, var3, var4, var5, var6, var7, Actor.scene, Client.collisionMaps[var0]);
				var14 = class127.getObjectDefinition(var4);
				if (var14 != null && var14.hasSound()) {
					WorldMapScaleHandler.createObjectSound(var13, var2, var3, var14, var5);
				}
			}
		}

	}
}
