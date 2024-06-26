import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ag")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -278390989
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -609996575
	)
	@Export("height")
	public int height;
	@ObfuscatedName("an")
	protected float[] field5439;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1877835118"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "58963104"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1973864941"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9902(this.pixels, this.width, this.height, this.field5439);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1268085019"
	)
	public final void method9963(boolean var1) {
		this.field5439 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
