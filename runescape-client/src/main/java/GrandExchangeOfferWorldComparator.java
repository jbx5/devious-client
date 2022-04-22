import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llc;Llc;I)I", garbageValue = 
	"-468460476")

	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : var2.world == var1.world ? 0 : 1;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;I)V", garbageValue = 
	"-1213322311")

	static final void method6006(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != (-1)) {
			var1 = class163.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
					++var0.movementFrameCycle;
					if ((var0.movementFrame < var1.frameIds.length) && (var0.movementFrameCycle > var1.frameLengths[var0.movementFrame])) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						Language.method6087(var1, var0.movementFrame, var0.x, var0.y);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						Language.method6087(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					var2 = var1.method3844();
					if (var0.movementFrame < var2) {
						KeyHandler.method336(var1, var0.movementFrame, var0.x, var0.y);
					} else {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						KeyHandler.method336(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if ((var0.spotAnimation != (-1)) && (Client.cycle >= var0.field1134)) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var4 = ClientPreferences.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var4 != (-1)) {
				SequenceDefinition var5 = class163.SequenceDefinition_get(var4);
				if ((var5 != null) && (var5.frameIds != null)) {
					++var0.spotAnimationFrameCycle;
					if ((var0.spotAnimationFrame < var5.frameIds.length) && (var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame])) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						Language.method6087(var5, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if ((var0.spotAnimationFrame >= var5.frameIds.length) && ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var5.frameIds.length))) {
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrame;
					int var3 = var5.method3844();
					if (var0.spotAnimationFrame < var3) {
						KeyHandler.method336(var5, var0.spotAnimationFrame, var0.x, var0.y);
					} else if ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var3)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if ((var0.sequence != (-1)) && (var0.sequenceDelay <= 1)) {
			var1 = class163.SequenceDefinition_get(var0.sequence);
			if ((((var1.field2159 == 1) && (var0.field1170 > 0)) && (var0.field1143 <= Client.cycle)) && (var0.field1163 < Client.cycle)) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
			var1 = class163.SequenceDefinition_get(var0.sequence);
			if (var1 != null) {
				if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
					++var0.sequenceFrameCycle;
					if ((var0.sequenceFrame < var1.frameIds.length) && (var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame])) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						Language.method6087(var1, var0.sequenceFrame, var0.x, var0.y);
					}

					if (var0.sequenceFrame >= var1.frameIds.length) {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1152;
						if (var0.field1152 >= var1.field2138) {
							var0.sequence = -1;
						} else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var1.frameIds.length)) {
							Language.method6087(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2154;
				} else if (var1.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var2 = var1.method3801().method2762();
					if (var0.sequenceFrame < var2) {
						KeyHandler.method336(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1152;
						if (var0.field1152 >= var1.field2138) {
							var0.sequence = -1;
						} else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var2)) {
							KeyHandler.method336(var1, var0.sequenceFrame, var0.x, var0.y);
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

	@ObfuscatedName("hf")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIIII)V", garbageValue = 
	"1469705502")

	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = ((PendingSpawn) (Client.pendingSpawns.last())); var10 != null; var10 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if ((((var0 == var10.plane) && (var10.x == var1)) && (var2 == var10.y)) && (var3 == var10.type)) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class163.method3315(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1107 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}