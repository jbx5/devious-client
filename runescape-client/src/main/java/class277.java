import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class277 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final class277 field3053;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final class277 field3052;

	static {
		field3053 = new class277(-1);
		field3052 = new class277(1);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1"
	)
	class277(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIII)V",
		garbageValue = "1481455206"
	)
	static void method5709(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldi;III)V",
		garbageValue = "-583937703"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = HealthBarUpdate.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1272 = 0;
			}

			if (var3 == 2) {
				var0.field1272 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || HealthBarUpdate.SequenceDefinition_get(var1).field2321 >= HealthBarUpdate.SequenceDefinition_get(var0.sequence).field2321) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1272 = 0;
			var0.field1298 = var0.pathLength;
		}

	}
}
