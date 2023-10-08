import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -600329691
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1188430355
	)
	@Export("z")
	int z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 10846867
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -162734927
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1372655535
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 819475611
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 364059813
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1110951363
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 612590109
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1226441067
	)
	int field2887;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1962485651
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -332762966360864525L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1579460977
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SB)V",
		garbageValue = "84"
	)
	public static void method5196(String[] var0, short[] var1) {
		VarpDefinition.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2128713491"
	)
	public static int method5195(int var0) {
		return class479.field4823[var0 & 16383];
	}
}
