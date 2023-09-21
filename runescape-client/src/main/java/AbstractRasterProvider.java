import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ak")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1364322547
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1704138977
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ah")
	protected float[] field5216;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-237304267"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-3"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1751275534"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9581(this.pixels, this.width, this.height, this.field5216);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "952320023"
	)
	public final void method9630(boolean var1) {
		this.field5216 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
