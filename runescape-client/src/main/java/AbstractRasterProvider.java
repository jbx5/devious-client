import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("al")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1797318603
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1733921925
	)
	@Export("height")
	public int height;
	@ObfuscatedName("as")
	protected float[] field5280;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1765158256"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2146640999"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9822(this.pixels, this.width, this.height, this.field5280);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2055289986"
	)
	public final void method9862(boolean var1) {
		this.field5280 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
