import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 88485587
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1225505631
	)
	@Export("z")
	int z;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1650171533
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1050782949
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 608450227
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2069611541
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1336638479
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 64920415
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -153684557
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 619364889
	)
	int field2955;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1245665253
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -4657194254713557903L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 876842249
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
