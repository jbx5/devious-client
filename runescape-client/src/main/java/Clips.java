import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("aq")
	boolean field3192;
	@ObfuscatedName("ad")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ag")
	int field3186;
	@ObfuscatedName("an")
	public int field3184;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ah")
	int field3196;
	@ObfuscatedName("az")
	int field3197;
	@ObfuscatedName("ax")
	int field3198;
	@ObfuscatedName("ac")
	int field3199;
	@ObfuscatedName("al")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ay")
	int field3201;
	@ObfuscatedName("ao")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("aa")
	int field3190;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field3192 = false;
		this.rasterGouraudLowRes = true;
		this.field3186 = 0;
		this.field3184 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("aq")
	void method5946() {
		this.field3196 = this.field3198 / 2;
		this.field3197 = this.field3199 / 2;
		this.clipNegativeMidX = -this.field3196;
		this.field3201 = this.field3198 - this.field3196;
		this.clipNegativeMidY = -this.field3197;
		this.field3190 = this.field3199 - this.field3197;
	}

	@ObfuscatedName("ad")
	void method5947(int var1, int var2, int var3, int var4) {
		this.field3196 = var1 - var2;
		this.field3197 = var3 - var4;
		this.clipNegativeMidX = -this.field3196;
		this.field3201 = this.field3198 - this.field3196;
		this.clipNegativeMidY = -this.field3197;
		this.field3190 = this.field3199 - this.field3197;
	}

	@ObfuscatedName("ag")
	void method5948(int var1, int var2, int var3) {
		this.field3192 = var1 < 0 || var1 > this.field3198 || var2 < 0 || var2 > this.field3198 || var3 < 0 || var3 > this.field3198;
	}
}
