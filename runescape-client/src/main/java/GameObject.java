import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ho")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("t")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -2050172129)
	@Export("plane")
	int plane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -806311755)
	@Export("z")
	int z;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1330612619)
	@Export("centerX")
	int centerX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1347868839)
	@Export("centerY")
	int centerY;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("renderable")
	public Renderable renderable;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1116209989)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1522514911)
	@Export("startX")
	int startX;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1585185549)
	@Export("endX")
	int endX;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1102957751)
	@Export("startY")
	int startY;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1363302169)
	@Export("endY")
	int endY;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1876673383)
	int field2648;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1074729407)
	@Export("lastDrawn")
	int lastDrawn;

	@ObfuscatedName("x")
	@ObfuscatedGetter(longValue = -6071620435348386687L)
	@Export("tag")
	public long tag = 0L;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1075992131)
	@Export("flags")
	int flags = 0;

	GameObject() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1902376995")
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}