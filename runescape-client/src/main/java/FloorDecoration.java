import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -601098933
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1097595837
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 220591555
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 3442899470081835915L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -886609405
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "92"
	)
	public static int method4710(int var0, int var1, int var2, int var3, int var4, int var5) {
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
}
