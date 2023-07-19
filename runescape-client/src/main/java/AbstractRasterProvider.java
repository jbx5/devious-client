import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ar")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 856501773
	)
	@Export("width")
	public int width;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1072072305
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aj")
	protected float[] field5146;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2103103659"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-93"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1721609371"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9442(this.pixels, this.width, this.height, this.field5146);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "24429174"
	)
	public final void method9514(boolean var1) {
		this.field5146 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
