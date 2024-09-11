import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ag")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1441925673
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -551279691
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aq")
	protected float[] field5490;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "131201232"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "333676017"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1426865107"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5490);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1740604000"
	)
	public final void method10340(boolean var1) {
		this.field5490 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
