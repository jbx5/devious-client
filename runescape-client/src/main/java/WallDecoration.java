import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1617612513
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1266112317
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1208845479
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 352052341
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2047175573
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1149054363
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1740811189
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 3453845455137359487L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -138305535
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
