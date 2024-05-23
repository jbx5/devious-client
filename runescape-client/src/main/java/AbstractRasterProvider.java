import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("aj")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -463747397
	)
	@Export("width")
	public int width;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1871416401
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aa")
	protected float[] field5423;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1626560953"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2075251596"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1816482747"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9971(this.pixels, this.width, this.height, this.field5423);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "84"
	)
	public final void method10058(boolean var1) {
		this.field5423 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
