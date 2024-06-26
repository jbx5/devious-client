import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public class class386 extends DualNode {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static AbstractSocket field4521;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	Archive field4523;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2065166421
	)
	int field4524;
	@ObfuscatedName("ag")
	byte field4522;

	class386() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-704186007"
	)
	static final float method7177(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)V",
		garbageValue = "111"
	)
	static final void method7176(Actor var0) {
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var1 = class353.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class188.method3684(var1, var0.movementFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2304) {
								++var0.field1234;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2304 && var0.field1234 >= var1.field2280) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1234 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						class188.method3684(var1, var0.movementFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					int var2 = var1.method4059();
					if (var0.movementFrame < var2) {
						WorldMapLabelSize.method4571(var1, var0.movementFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2304) {
								++var0.field1234;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2304 && var0.field1234 >= var1.field2280) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1234 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						WorldMapLabelSize.method4571(var1, var0.movementFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2482());

		int var3;
		for (ActorSpotAnim var6 = (ActorSpotAnim)var7.method9230(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
			if (var6.spotAnimation != -1 && Client.cycle >= var6.field4981) {
				var3 = class178.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
				if (var3 == -1) {
					var6.remove();
					--var0.graphicsCount;
				} else {
					var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
					SequenceDefinition var4 = class353.SequenceDefinition_get(var3);
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrameCycle;
						if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
							var6.spotAnimationFrameCycle = 1;
							++var6.spotAnimationFrame;
							class188.method3684(var4, var6.spotAnimationFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
						}

						if (var6.spotAnimationFrame >= var4.frameIds.length) {
							var6.remove();
							--var0.graphicsCount;
						}
					} else if (var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrame;
						int var5 = var4.method4059();
						if (var6.spotAnimationFrame < var5) {
							WorldMapLabelSize.method4571(var4, var6.spotAnimationFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
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
			var8 = class353.SequenceDefinition_get(var0.sequence);
			if (var8.field2303 == 1 && var0.field1265 > 0 && var0.spotAnimation <= Client.cycle && var0.field1260 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = class353.SequenceDefinition_get(var0.sequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class188.method3684(var8, var0.sequenceFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					}

					if (var0.sequenceFrame >= var8.frameIds.length) {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1214;
						if (var0.field1214 >= var8.field2280) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
							class188.method3684(var8, var0.sequenceFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var8.field2297;
				} else if (var8.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var3 = var8.method4059();
					if (var0.sequenceFrame < var3) {
						WorldMapLabelSize.method4571(var8, var0.sequenceFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
					} else {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1214;
						if (var0.field1214 >= var8.field2280) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
							WorldMapLabelSize.method4571(var8, var0.sequenceFrame, var0.x, var0.y, SoundCache.localPlayer == var0);
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
