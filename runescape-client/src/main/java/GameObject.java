import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("aj")
	static String[] field3091;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2078922457
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -415100769
	)
	@Export("z")
	int z;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2117082253
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1222462707
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1248145487
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1925243401
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -471526341
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -294435209
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -822585263
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1812635965
	)
	int field3093;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1902942925
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 5918743696151912835L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2091094119
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
