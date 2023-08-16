import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 381693817
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1663864411
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -878868163
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 770343019
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1562518895
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 274645333
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 80120955
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1748940281
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1302717711
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 767769119
	)
	int field2867;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1977866275
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -613017502485947103L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1630640933
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
