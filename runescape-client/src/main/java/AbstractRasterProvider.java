import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("f")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 697858245
	)
	@Export("width")
	public int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1550839689
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "28507398"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-41"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)[Lqi;",
		garbageValue = "475253810"
	)
	public static SpritePixels[] method8301(AbstractArchive var0, int var1, int var2) {
		return !Occluder.method4475(var0, var1, var2) ? null : class124.method2967(); // L: 33 34
	}
}
