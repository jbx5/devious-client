import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("aq")
	public static short[] field5460;
	@ObfuscatedName("an")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1858563901
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1133482929
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ao")
	protected float[] field5456;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-839653351"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1925664580"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5456);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public final void method10024(boolean var1) {
		this.field5456 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
