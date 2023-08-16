import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("au")
	boolean field2816;
	@ObfuscatedName("ae")
	public boolean field2811;
	@ObfuscatedName("ao")
	int field2823;
	@ObfuscatedName("ai")
	public int field2815;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("al")
	int field2810;
	@ObfuscatedName("an")
	int field2825;
	@ObfuscatedName("ar")
	int field2824;
	@ObfuscatedName("ab")
	int field2822;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("am")
	int field2827;
	@ObfuscatedName("ax")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ah")
	int field2829;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2816 = false;
		this.field2811 = true;
		this.field2823 = 0;
		this.field2815 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("au")
	void method4956() {
		this.field2810 = this.field2824 / 2;
		this.field2825 = this.field2822 / 2;
		this.clipNegativeMidX = -this.field2810;
		this.field2827 = this.field2824 - this.field2810;
		this.clipNegativeMidY = -this.field2825;
		this.field2829 = this.field2822 - this.field2825;
	}

	@ObfuscatedName("ae")
	void method4962(int var1, int var2, int var3, int var4) {
		this.field2810 = var1 - var2;
		this.field2825 = var3 - var4;
		this.clipNegativeMidX = -this.field2810;
		this.field2827 = this.field2824 - this.field2810;
		this.clipNegativeMidY = -this.field2825;
		this.field2829 = this.field2822 - this.field2825;
	}

	@ObfuscatedName("ao")
	void method4958(int var1, int var2, int var3) {
		this.field2816 = var1 < 0 || var1 > this.field2824 || var2 < 0 || var2 > this.field2824 || var3 < 0 || var3 > this.field2824;
	}
}
