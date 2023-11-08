import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ar")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1353905913
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1542064901
	)
	@Export("height")
	public int height;
	@ObfuscatedName("au")
	protected float[] field5217;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-24"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9607(this.pixels, this.width, this.height, this.field5217);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1918983678"
	)
	public final void method9701(boolean var1) {
		this.field5217 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
