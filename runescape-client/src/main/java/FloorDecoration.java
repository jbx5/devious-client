import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1764906591
	)
	static int field2713;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1858852897
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1647703591
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -880112075
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2857987176138791039L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 342494541
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}
}
