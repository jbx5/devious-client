import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	static Model field2972;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -420592395
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1080639073
	)
	@Export("z")
	int z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 513105251
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1093960855
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 180883073
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1663649347
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1650103875
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1679599593
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1772771443
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -621100299
	)
	int field2958;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -814438507
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -4002139674731118243L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1681160537
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
