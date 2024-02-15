import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class190 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field2100")
	static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-105"
	)
	public static int method3772(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968515161"
	)
	public static void method3773() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1019496566"
	)
	static final void method3774() {
		if (AuthenticationScheme.pcmPlayer1 != null) {
			AuthenticationScheme.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1572187025"
	)
	static final int method3768(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
