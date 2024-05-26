import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("aq")
	public static short[] field494;
	@ObfuscatedName("ak")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;B)I",
		garbageValue = "-51"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2132261145"
	)
	public static boolean method1213(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class412.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-85"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return ChatChannel.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Ldh;IB)V",
		garbageValue = "0"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var4;
		int var5;
		int var7;
		int var10;
		if (var1.spotAnimation >= Client.cycle) {
			int var3 = Math.max(1, var1.spotAnimation - Client.cycle);
			var10 = var1.field1208 * 64 + var1.field1256 * 128;
			var5 = var1.field1208 * 64 + var1.field1258 * 128;
			var1.x += (var10 - var1.x) / var3;
			var1.y += (var5 - var1.y) / var3;
			var1.field1278 = 0;
			var1.orientation = var1.field1262;
		} else if (var1.field1261 >= Client.cycle) {
			boolean var13 = Client.cycle == var1.field1261 || var1.sequence == -1 || var1.sequenceDelay != 0;
			if (!var13) {
				var4 = FaceNormal.SequenceDefinition_get(var1.sequence);
				if (var4 != null && !var4.isCachedModelIdSet()) {
					var13 = var1.sequenceFrameCycle + 1 > var4.frameLengths[var1.sequenceFrame];
				} else {
					var13 = true;
				}
			}

			if (var13) {
				var10 = var1.field1261 - var1.spotAnimation;
				var5 = Client.cycle - var1.spotAnimation;
				int var6 = var1.field1208 * 64 + var1.field1256 * 128;
				var7 = var1.field1208 * 64 + var1.field1258 * 128;
				int var8 = var1.field1208 * 64 + var1.field1257 * 128;
				int var9 = var1.field1208 * 64 + var1.field1259 * 128;
				var1.x = (var5 * var8 + var6 * (var10 - var5)) / var10;
				var1.y = (var9 * var5 + var7 * (var10 - var5)) / var10;
			}

			var1.field1278 = 0;
			var1.orientation = var1.field1262;
			var1.rotation = var1.orientation;
		} else {
			class186.method3735(var1);
		}

		if (var1.x < 128 || var1.y < 128 || var1.x >= 13184 || var1.y >= 13184) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1261 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1208 * 64;
			var1.y = var1.pathY[0] * 128 + var1.field1208 * 64;
			var1.method2420();
		}

		if (var1 == class17.localPlayer && (var1.x < 1536 || var1.y < 1536 || var1.x >= 11776 || var1.y >= 11776)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1261 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1208 * 64;
			var1.y = var1.pathY[0] * 128 + var1.field1208 * 64;
			var1.method2420();
		}

		PlayerComposition.method6613(var0, var1);
		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			SequenceDefinition var11 = FaceNormal.SequenceDefinition_get(var1.movementSequence);
			if (var11 != null) {
				if (!var11.isCachedModelIdSet() && var11.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var11.frameIds.length && var1.movementFrameCycle > var11.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						Tiles.method2272(var11, var1.movementFrame, var1.x, var1.y, var1);
					}

					if (var1.movementFrame >= var11.frameIds.length) {
						if (var11.frameCount > 0) {
							var1.movementFrame -= var11.frameCount;
							if (var11.field2430) {
								++var1.field1248;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var11.frameIds.length || var11.field2430 && var1.field1248 >= var11.field2426) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1248 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						Tiles.method2272(var11, var1.movementFrame, var1.x, var1.y, var1);
					}
				} else if (var11.isCachedModelIdSet()) {
					++var1.movementFrame;
					var10 = var11.method4326();
					if (var1.movementFrame < var10) {
						class31.method448(var11, var1.movementFrame, var1.x, var1.y, var1);
					} else {
						if (var11.frameCount > 0) {
							var1.movementFrame -= var11.frameCount;
							if (var11.field2430) {
								++var1.field1248;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var10 || var11.field2430 && var1.field1248 >= var11.field2426) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1248 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class31.method448(var11, var1.movementFrame, var1.x, var1.y, var1);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var15 = new IterableNodeHashTableIterator(var1.method2426());

		for (ActorSpotAnim var14 = (ActorSpotAnim)var15.method9325(); var14 != null; var14 = (ActorSpotAnim)var15.next()) {
			if (var14.spotAnimation != -1 && Client.cycle >= var14.field4955) {
				var5 = Sound.SpotAnimationDefinition_get(var14.spotAnimation).sequence;
				if (var5 == -1) {
					var14.remove();
					--var1.graphicsCount;
				} else {
					var14.spotAnimationFrame = Math.max(var14.spotAnimationFrame, 0);
					SequenceDefinition var12 = FaceNormal.SequenceDefinition_get(var5);
					if (var12.frameIds != null && !var12.isCachedModelIdSet()) {
						++var14.spotAnimationFrameCycle;
						if (var14.spotAnimationFrame < var12.frameIds.length && var14.spotAnimationFrameCycle > var12.frameLengths[var14.spotAnimationFrame]) {
							var14.spotAnimationFrameCycle = 1;
							++var14.spotAnimationFrame;
							Tiles.method2272(var12, var14.spotAnimationFrame, var1.x, var1.y, var1);
						}

						if (var14.spotAnimationFrame >= var12.frameIds.length) {
							var14.remove();
							--var1.graphicsCount;
						}
					} else if (var12.isCachedModelIdSet()) {
						++var14.spotAnimationFrame;
						var7 = var12.method4326();
						if (var14.spotAnimationFrame < var7) {
							class31.method448(var12, var14.spotAnimationFrame, var1.x, var1.y, var1);
						} else {
							var14.remove();
							--var1.graphicsCount;
						}
					} else {
						var14.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var4 = FaceNormal.SequenceDefinition_get(var1.sequence);
			if (var4.field2431 == 1 && var1.field1226 > 0 && var1.spotAnimation <= Client.cycle && var1.field1261 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var4 = FaceNormal.SequenceDefinition_get(var1.sequence);
			if (var4 == null) {
				var1.sequence = -1;
			} else if (!var4.isCachedModelIdSet() && var4.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var4.frameIds.length && var1.sequenceFrameCycle > var4.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					Tiles.method2272(var4, var1.sequenceFrame, var1.x, var1.y, var1);
				}

				if (var1.sequenceFrame >= var4.frameIds.length) {
					var1.sequenceFrame -= var4.frameCount;
					++var1.field1239;
					if (var1.field1239 >= var4.field2426) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var4.frameIds.length) {
						Tiles.method2272(var4, var1.sequenceFrame, var1.x, var1.y, var1);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var4.field2425;
			} else if (var4.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var4.method4326();
				if (var1.sequenceFrame < var5) {
					class31.method448(var4, var1.sequenceFrame, var1.x, var1.y, var1);
				} else {
					var1.sequenceFrame -= var4.frameCount;
					++var1.field1239;
					if (var1.field1239 >= var4.field2426) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						class31.method448(var4, var1.sequenceFrame, var1.x, var1.y, var1);
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

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIIIIII)V",
		garbageValue = "2062265240"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			ObjectComposition var16;
			if (var10 != 0L) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var27 = class105.Entity_unpackID(var10);
				int var28 = var15 & 31;
				int var29 = var15 >> 6 & 3;
				var16 = HitSplatDefinition.getObjectDefinition(var27);
				if (var16 != null && var16.hasSound()) {
					int var19 = var16.sizeX;
					int var20 = var16.sizeY;
					if (var29 == 1 || var29 == 3) {
						var19 = var16.sizeY;
						var20 = var16.sizeX;
					}

					int var21 = (var19 + var3) * 128;
					int var22 = (var4 + var20) * 128;
					int var17 = var3 * 128;
					int var18 = var4 * 128;
					int var23 = var16.ambientSoundId;
					int var24 = var16.int7 * 16384;
					int var25 = var16.int8 * 16384;
					if (var16.transforms != null) {
						ObjectComposition var26 = var16.transform();
						if (var26 != null) {
							var23 = var26.ambientSoundId;
							var24 = var26.int7 * 16384;
							var25 = var26.int8 * 16384;
						}
					}

					Object var10000 = null;

					for (ObjectSound var30 = (ObjectSound)ObjectSound.objectSounds.last(); var30 != null; var30 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var30.plane == var1 && var17 == var30.x * 16384 && var18 == var30.y * 16384 && var21 == var30.maxX * 16384 && var22 == var30.maxY * 128 && var23 == var30.soundEffectId && var24 == var30.field859 && var25 == var30.field858) {
							if (var30.stream1 != null) {
								class349.pcmStreamMixer.removeSubStream(var30.stream1);
								var30.stream1 = null;
							}

							if (var30.stream2 != null) {
								class349.pcmStreamMixer.removeSubStream(var30.stream2);
								var30.stream2 = null;
							}

							var30.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method4478(var3, var4, var28, var29, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var29, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method4470(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				MusicPatch.method6441(var0, var1, var15, var3, var4, var5, var6, var7, var8, var0.collisionMaps[var1]);
				var16 = HitSplatDefinition.getObjectDefinition(var5);
				if (var16 != null && var16.hasSound()) {
					SoundCache.createObjectSound(var15, var3, var4, var16, var6);
				}
			}
		}

	}
}
