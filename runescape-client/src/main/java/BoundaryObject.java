import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "[Lkw;"
	)
	static Widget[] field2663;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 184581345
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1430540447
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1551630571
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1676188487
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2069012073
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6147520536142177601L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1671682929
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Loi;",
		garbageValue = "-701060466"
	)
	static class392[] method4650() {
		return new class392[]{class392.field4459, class392.field4462, class392.field4458, class392.field4457}; // L: 16
	}

	@ObfuscatedName("p")
	static double method4649(double var0, double var2, double var4) {
		return class33.method644((var0 - var2) / var4) / var4; // L: 13
	}
}
