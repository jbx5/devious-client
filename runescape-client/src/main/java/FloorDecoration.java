import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1749648961
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1722441719
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -472964851
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 5933410536782648867L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -79580845
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11
}
