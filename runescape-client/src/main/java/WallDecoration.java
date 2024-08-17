import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1015679727
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1329778125
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -291940047
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2059362611
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -221612035
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2078493373
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1898507483
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 1381089231700164173L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 214280365
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
