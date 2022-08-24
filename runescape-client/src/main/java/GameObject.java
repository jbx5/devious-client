import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("he")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 271411639)
	@Export("plane")
	int plane;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 582497265)
	@Export("z")
	int z;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -9176165)
	@Export("centerX")
	int centerX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1556132625)
	@Export("centerY")
	int centerY;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lgq;")
	@Export("renderable")
	public Renderable renderable;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -248114719)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1113126289)
	@Export("startX")
	int startX;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1835931621)
	@Export("endX")
	int endX;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1093203169)
	@Export("startY")
	int startY;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -764736559)
	@Export("endY")
	int endY;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1931911743)
	int field2658;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1034085493)
	@Export("lastDrawn")
	int lastDrawn;

	@ObfuscatedName("m")
	@ObfuscatedGetter(longValue = -3701413312264417241L)
	@Export("tag")
	public long tag = 0L;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1225853567)
	@Export("flags")
	int flags = 0;

	GameObject() {
	}
}