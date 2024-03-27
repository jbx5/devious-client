import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("af")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -6207961
	)
	@Export("width")
	public int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 706062905
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ao")
	protected float[] field5314;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1356735383"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-34667667"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24657"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9582(this.pixels, this.width, this.height, this.field5314);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2147270531"
	)
	public final void method9669(boolean var1) {
		this.field5314 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
