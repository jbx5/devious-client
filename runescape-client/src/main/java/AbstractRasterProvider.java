import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qr")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("f")
	@Export("pixels")
	public int[] pixels;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 551005431)
	@Export("width")
	public int width;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -805081597)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-490851442")
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "2472356")
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-783590744")
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}
}