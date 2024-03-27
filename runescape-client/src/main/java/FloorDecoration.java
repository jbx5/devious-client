import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 334123469
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2007569035
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1499379891
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 9050821616856748983L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -362934189
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1438496947"
	)
	static final void method4550(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field799 == -1) {
				Client.field799 = var0.spriteId2;
				Client.field800 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field799;
			} else {
				var0.spriteId2 = Client.field800;
			}

		} else if (var1 == 325) {
			if (Client.field799 == -1) {
				Client.field799 = var0.spriteId2;
				Client.field800 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field800;
			} else {
				var0.spriteId2 = Client.field799;
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
