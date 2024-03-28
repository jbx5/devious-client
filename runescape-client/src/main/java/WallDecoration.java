import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2057960553
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 444344465
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -845965803
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -401311141
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1058397013
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 255519261
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -18673619
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -8691895186979174981L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1389807105
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
