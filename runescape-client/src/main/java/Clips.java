import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ak")
	boolean field2973;
	@ObfuscatedName("al")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("aj")
	int field2983;
	@ObfuscatedName("aa")
	public int field2976;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aq")
	int field2982;
	@ObfuscatedName("ap")
	int field2984;
	@ObfuscatedName("ae")
	int field2985;
	@ObfuscatedName("ax")
	int field2986;
	@ObfuscatedName("ay")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("au")
	int field2988;
	@ObfuscatedName("as")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("aw")
	int field2990;
	@ObfuscatedName("ad")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2973 = false;
		this.rasterGouraudLowRes = true;
		this.field2983 = 0;
		this.field2976 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ak")
	void method5380() {
		this.field2982 = this.field2985 / 2;
		this.field2984 = this.field2986 / 2;
		this.clipNegativeMidX = -this.field2982;
		this.field2988 = this.field2985 - this.field2982;
		this.clipNegativeMidY = -this.field2984;
		this.field2990 = this.field2986 - this.field2984;
	}

	@ObfuscatedName("al")
	void method5379(int var1, int var2, int var3, int var4) {
		this.field2982 = var1 - var2;
		this.field2984 = var3 - var4;
		this.clipNegativeMidX = -this.field2982;
		this.field2988 = this.field2985 - this.field2982;
		this.clipNegativeMidY = -this.field2984;
		this.field2990 = this.field2986 - this.field2984;
	}

	@ObfuscatedName("aj")
	void method5382(int var1, int var2, int var3) {
		this.field2973 = var1 < 0 || var1 > this.field2985 || var2 < 0 || var2 > this.field2985 || var3 < 0 || var3 > this.field2985;
	}
}
