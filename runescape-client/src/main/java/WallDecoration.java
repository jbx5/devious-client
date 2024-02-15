import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -355801299
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1594438977
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1706758751
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1390257743
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1006420929
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 696303159
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1645144365
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 705769494631973791L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 147237553
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
