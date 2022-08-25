import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1562461341)
	@Export("canvasHeight")
	public static int canvasHeight;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -114647615)
	@Export("z")
	int z;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1817381783)
	@Export("x")
	int x;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 193612147)
	@Export("y")
	int y;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -971954679)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 163757837)
	@Export("orientation2")
	int orientation2;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 373491259)
	@Export("xOffset")
	int xOffset;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 926659643)
	@Export("yOffset")
	int yOffset;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lgq;")
	@Export("renderable1")
	public Renderable renderable1;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lgq;")
	@Export("renderable2")
	public Renderable renderable2;

	@ObfuscatedName("n")
	@ObfuscatedGetter(longValue = -5335514292976326337L)
	@Export("tag")
	public long tag = 0L;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1656580605)
	@Export("flags")
	int flags = 0;

	WallDecoration() {
	}
}