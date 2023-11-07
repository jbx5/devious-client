import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("at")
	boolean field3036;
	@ObfuscatedName("ah")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ar")
	int field3051;
	@ObfuscatedName("au")
	public int field3041;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ax")
	int field3037;
	@ObfuscatedName("as")
	int field3049;
	@ObfuscatedName("ay")
	int field3050;
	@ObfuscatedName("ak")
	int field3039;
	@ObfuscatedName("aj")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("am")
	int field3053;
	@ObfuscatedName("aq")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ai")
	int field3055;
	@ObfuscatedName("aw")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field3036 = false;
		this.rasterGouraudLowRes = true;
		this.field3051 = 0;
		this.field3041 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("at")
	void method5733() {
		this.field3037 = this.field3050 / 2;
		this.field3049 = this.field3039 / 2;
		this.clipNegativeMidX = -this.field3037;
		this.field3053 = this.field3050 - this.field3037;
		this.clipNegativeMidY = -this.field3049;
		this.field3055 = this.field3039 - this.field3049;
	}

	@ObfuscatedName("ah")
	void method5734(int var1, int var2, int var3, int var4) {
		this.field3037 = var1 - var2;
		this.field3049 = var3 - var4;
		this.clipNegativeMidX = -this.field3037;
		this.field3053 = this.field3050 - this.field3037;
		this.clipNegativeMidY = -this.field3049;
		this.field3055 = this.field3039 - this.field3049;
	}

	@ObfuscatedName("ar")
	void method5735(int var1, int var2, int var3) {
		this.field3036 = var1 < 0 || var1 > this.field3050 || var2 < 0 || var2 > this.field3050 || var3 < 0 || var3 > this.field3050;
	}
}
