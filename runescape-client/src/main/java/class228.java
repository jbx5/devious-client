import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class228 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2412((byte)-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2408((byte)0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2409((byte)1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2410((byte)2);

	@ObfuscatedName("cw")
	static String field2415;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ab")
	public byte field2414;

	class228(byte var3) {
		this.field2414 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2414;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "-1953021335"
	)
	static void method4438(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class348.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = class1.KitDefinition_get(var3);
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) {
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "-1026770295"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var3;
		int var4;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) {
			int var2 = Math.max(1, var0.spotAnimation - Client.cycle);
			var9 = var0.field1209 * 128 + var0.field1198 * 64;
			var4 = var0.field1194 * 128 + var0.field1198 * 64;
			var0.x += (var9 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1245 = 0;
			var0.orientation = var0.field1229;
		} else if (var0.field1187 >= Client.cycle) {
			boolean var12 = var0.field1187 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
			if (!var12) {
				var3 = DynamicObject.SequenceDefinition_get(var0.sequence);
				if (var3 != null && !var3.isCachedModelIdSet()) {
					var12 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame];
				} else {
					var12 = true;
				}
			}

			if (var12) {
				var9 = var0.field1187 - var0.spotAnimation;
				var4 = Client.cycle - var0.spotAnimation;
				int var5 = var0.field1209 * 128 + var0.field1198 * 64;
				var6 = var0.field1194 * 128 + var0.field1198 * 64;
				int var7 = var0.field1224 * 128 + var0.field1198 * 64;
				int var8 = var0.field1203 * 128 + var0.field1198 * 64;
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9;
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9;
			}

			var0.field1245 = 0;
			var0.orientation = var0.field1229;
			var0.rotation = var0.orientation;
		} else {
			DevicePcmPlayerProvider.method322(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1187 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1198 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1198 * 64;
			var0.method2461();
		}

		if (class229.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1187 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1198 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1198 * 64;
			var0.method2461();
		}

		WorldMap.method8922(var0);
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var10 = DynamicObject.SequenceDefinition_get(var0.movementSequence);
			if (var10 != null) {
				if (!var10.isCachedModelIdSet() && var10.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var10.frameIds.length && var0.movementFrameCycle > var10.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						DynamicObject.method2244(var10, var0.movementFrame, var0.x, var0.y, var0);
					}

					if (var0.movementFrame >= var10.frameIds.length) {
						if (var10.frameCount > 0) {
							var0.movementFrame -= var10.frameCount;
							if (var10.field2210) {
								++var0.field1248;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var10.frameIds.length || var10.field2210 && var0.field1248 >= var10.field2211) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1248 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						DynamicObject.method2244(var10, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else if (var10.isCachedModelIdSet()) {
					++var0.movementFrame;
					var9 = var10.method4064();
					if (var0.movementFrame < var9) {
						FriendLoginUpdate.method8127(var10, var0.movementFrame, var0.x, var0.y, var0);
					} else {
						if (var10.frameCount > 0) {
							var0.movementFrame -= var10.frameCount;
							if (var10.field2210) {
								++var0.field1248;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var9 || var10.field2210 && var0.field1248 >= var10.field2211) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1248 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						FriendLoginUpdate.method8127(var10, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var14 = new IterableNodeHashTableIterator(var0.method2467());

		for (ActorSpotAnim var13 = (ActorSpotAnim)var14.method8937(); var13 != null; var13 = (ActorSpotAnim)var14.next()) {
			if (var13.spotAnimation != -1 && Client.cycle >= var13.field5285) {
				var4 = Canvas.SpotAnimationDefinition_get(var13.spotAnimation).sequence;
				if (var4 == -1) {
					var13.remove();
					--var0.graphicsCount;
				} else {
					var13.spotAnimationFrame = Math.max(var13.spotAnimationFrame, 0);
					SequenceDefinition var11 = DynamicObject.SequenceDefinition_get(var4);
					if (var11.frameIds != null && !var11.isCachedModelIdSet()) {
						++var13.spotAnimationFrameCycle;
						if (var13.spotAnimationFrame < var11.frameIds.length && var13.spotAnimationFrameCycle > var11.frameLengths[var13.spotAnimationFrame]) {
							var13.spotAnimationFrameCycle = 1;
							++var13.spotAnimationFrame;
							DynamicObject.method2244(var11, var13.spotAnimationFrame, var0.x, var0.y, var0);
						}

						if (var13.spotAnimationFrame >= var11.frameIds.length) {
							var13.remove();
							--var0.graphicsCount;
						}
					} else if (var11.isCachedModelIdSet()) {
						++var13.spotAnimationFrame;
						var6 = var11.method4064();
						if (var13.spotAnimationFrame < var6) {
							FriendLoginUpdate.method8127(var11, var13.spotAnimationFrame, var0.x, var0.y, var0);
						} else {
							var13.remove();
							--var0.graphicsCount;
						}
					} else {
						var13.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var3 = DynamicObject.SequenceDefinition_get(var0.sequence);
			if (var3.field2218 == 1 && var0.field1220 > 0 && var0.spotAnimation <= Client.cycle && var0.field1187 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var3 = DynamicObject.SequenceDefinition_get(var0.sequence);
			if (var3 == null) {
				var0.sequence = -1;
			} else if (!var3.isCachedModelIdSet() && var3.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var3.frameIds.length && var0.sequenceFrameCycle > var3.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					DynamicObject.method2244(var3, var0.sequenceFrame, var0.x, var0.y, var0);
				}

				if (var0.sequenceFrame >= var3.frameIds.length) {
					var0.sequenceFrame -= var3.frameCount;
					++var0.field1199;
					if (var0.field1199 >= var3.field2211) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3.frameIds.length) {
						DynamicObject.method2244(var3, var0.sequenceFrame, var0.x, var0.y, var0);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var3.field2224;
			} else if (var3.isCachedModelIdSet()) {
				++var0.sequenceFrame;
				var4 = var3.method4064();
				if (var0.sequenceFrame < var4) {
					FriendLoginUpdate.method8127(var3, var0.sequenceFrame, var0.x, var0.y, var0);
				} else {
					var0.sequenceFrame -= var3.frameCount;
					++var0.field1199;
					if (var0.field1199 >= var3.field2211) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) {
						FriendLoginUpdate.method8127(var3, var0.sequenceFrame, var0.x, var0.y, var0);
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
}
