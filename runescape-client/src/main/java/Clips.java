import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ac")
	boolean field2838;
	@ObfuscatedName("al")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ak")
	int field2832;
	@ObfuscatedName("ah")
	public int field2830;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ap")
	int field2848;
	@ObfuscatedName("ay")
	int field2843;
	@ObfuscatedName("as")
	int field2842;
	@ObfuscatedName("aj")
	int field2845;
	@ObfuscatedName("an")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("au")
	int field2850;
	@ObfuscatedName("ai")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ae")
	int field2849;
	@ObfuscatedName("aw")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2838 = false;
		this.rasterGouraudLowRes = true;
		this.field2832 = 0;
		this.field2830 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ac")
	void method5108() {
		this.field2848 = this.field2842 / 2;
		this.field2843 = this.field2845 / 2;
		this.clipNegativeMidX = -this.field2848;
		this.field2850 = this.field2842 - this.field2848;
		this.clipNegativeMidY = -this.field2843;
		this.field2849 = this.field2845 - this.field2843;
	}

	@ObfuscatedName("al")
	void method5107(int var1, int var2, int var3, int var4) {
		this.field2848 = var1 - var2;
		this.field2843 = var3 - var4;
		this.clipNegativeMidX = -this.field2848;
		this.field2850 = this.field2842 - this.field2848;
		this.clipNegativeMidY = -this.field2843;
		this.field2849 = this.field2845 - this.field2843;
	}

	@ObfuscatedName("ak")
	void method5109(int var1, int var2, int var3) {
		this.field2838 = var1 < 0 || var1 > this.field2842 || var2 < 0 || var2 > this.field2842 || var3 < 0 || var3 > this.field2842;
	}
}
