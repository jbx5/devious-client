import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ao")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("af")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -470866495
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -656805095
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ar")
	protected float[] field5259;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1922041881"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-38"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-466034605"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9766(this.pixels, this.width, this.height, this.field5259);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2139015279"
	)
	public final void method9790(boolean var1) {
		this.field5259 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
