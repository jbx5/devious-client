import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2103755373
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1659954279
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -56633013
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 549588913
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -451772705
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8087086773214451169L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 231523475
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-16711936"
	)
	static final int method5517(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
