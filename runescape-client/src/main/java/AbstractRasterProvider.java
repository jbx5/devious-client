import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ao")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 132368805
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2105446071
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ai")
	protected float[] field5188;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-46"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1065945289"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9367(this.pixels, this.width, this.height, this.field5188);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-37"
	)
	public final void method9462(boolean var1) {
		this.field5188 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
