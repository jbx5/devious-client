import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class484 {
	@ObfuscatedName("an")
	static final int[] field4915;
	@ObfuscatedName("ao")
	static final int[] field4918;

	static {
		field4915 = new int[16384];
		field4918 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4915[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4918[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "139624089"
	)
	static final void method8581(Actor var0) {
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var1 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						AbstractWorldMapIcon.method5729(var1, var0.movementFrame, var0.x, var0.y, var0);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2397) {
								++var0.field1243;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2397 && var0.field1243 >= var1.field2388) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1243 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						AbstractWorldMapIcon.method5729(var1, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					int var2 = var1.method4232();
					if (var0.movementFrame < var2) {
						WorldMapLabelSize.method5246(var1, var0.movementFrame, var0.x, var0.y, var0);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2397) {
								++var0.field1243;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2397 && var0.field1243 >= var1.field2388) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1243 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						WorldMapLabelSize.method5246(var1, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2399());

		int var3;
		for (ActorSpotAnim var6 = (ActorSpotAnim)var7.method8943(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
			if (var6.spotAnimation != -1 && Client.cycle >= var6.field5381) {
				var3 = UserComparator3.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
				if (var3 == -1) {
					var6.remove();
					--var0.graphicsCount;
				} else {
					var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
					SequenceDefinition var4 = DevicePcmPlayerProvider.SequenceDefinition_get(var3);
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrameCycle;
						if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
							var6.spotAnimationFrameCycle = 1;
							++var6.spotAnimationFrame;
							AbstractWorldMapIcon.method5729(var4, var6.spotAnimationFrame, var0.x, var0.y, var0);
						}

						if (var6.spotAnimationFrame >= var4.frameIds.length) {
							var6.remove();
							--var0.graphicsCount;
						}
					} else if (var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrame;
						int var5 = var4.method4232();
						if (var6.spotAnimationFrame < var5) {
							WorldMapLabelSize.method5246(var4, var6.spotAnimationFrame, var0.x, var0.y, var0);
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
			var8 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence);
			if (var8.field2398 == 1 && var0.field1274 > 0 && var0.spotAnimation <= Client.cycle && var0.field1256 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						AbstractWorldMapIcon.method5729(var8, var0.sequenceFrame, var0.x, var0.y, var0);
					}

					if (var0.sequenceFrame >= var8.frameIds.length) {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1248;
						if (var0.field1248 >= var8.field2388) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
							AbstractWorldMapIcon.method5729(var8, var0.sequenceFrame, var0.x, var0.y, var0);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var8.field2376;
				} else if (var8.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var3 = var8.method4232();
					if (var0.sequenceFrame < var3) {
						WorldMapLabelSize.method5246(var8, var0.sequenceFrame, var0.x, var0.y, var0);
					} else {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1248;
						if (var0.field1248 >= var8.field2388) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
							WorldMapLabelSize.method5246(var8, var0.sequenceFrame, var0.x, var0.y, var0);
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
}
