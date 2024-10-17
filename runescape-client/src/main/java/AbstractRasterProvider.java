import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ak")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 488852221
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 168694077
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ay")
	protected float[] field5540;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "805573506"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1680653708"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-63"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5540);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "481145533"
	)
	public final void method10535(boolean var1) {
		this.field5540 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
