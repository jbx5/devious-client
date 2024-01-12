import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("am")
	boolean field3098;
	@ObfuscatedName("ap")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("af")
	int field3081;
	@ObfuscatedName("ar")
	public int field3092;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ad")
	int field3091;
	@ObfuscatedName("ax")
	int field3093;
	@ObfuscatedName("aw")
	int field3079;
	@ObfuscatedName("az")
	int field3085;
	@ObfuscatedName("av")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ak")
	int field3096;
	@ObfuscatedName("ay")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("as")
	int field3099;
	@ObfuscatedName("ab")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field3098 = false;
		this.rasterGouraudLowRes = true;
		this.field3081 = 0;
		this.field3092 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("am")
	void method5813() {
		this.field3091 = this.field3079 / 2;
		this.field3093 = this.field3085 / 2;
		this.clipNegativeMidX = -this.field3091;
		this.field3096 = this.field3079 - this.field3091;
		this.clipNegativeMidY = -this.field3093;
		this.field3099 = this.field3085 - this.field3093;
	}

	@ObfuscatedName("ap")
	void method5814(int var1, int var2, int var3, int var4) {
		this.field3091 = var1 - var2;
		this.field3093 = var3 - var4;
		this.clipNegativeMidX = -this.field3091;
		this.field3096 = this.field3079 - this.field3091;
		this.clipNegativeMidY = -this.field3093;
		this.field3099 = this.field3085 - this.field3093;
	}

	@ObfuscatedName("af")
	void method5822(int var1, int var2, int var3) {
		this.field3098 = var1 < 0 || var1 > this.field3079 || var2 < 0 || var2 > this.field3079 || var3 < 0 || var3 > this.field3079;
	}
}
