import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 2105549815
	)
	static int field2819;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1910207127
	)
	@Export("z")
	int z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2027599945
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1568279101
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -7989712840084584009L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1276033865
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}
}
