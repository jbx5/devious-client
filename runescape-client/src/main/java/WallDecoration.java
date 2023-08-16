import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Ltd;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1365937923
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 787946685
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -218934925
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 52639641
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 489110633
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1102500453
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1708077931
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5570150087619181313L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1405593685
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
