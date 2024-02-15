import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("aq")
	boolean field3098;
	@ObfuscatedName("aw")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("al")
	int field3086;
	@ObfuscatedName("as")
	public int field3089;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aj")
	int field3096;
	@ObfuscatedName("af")
	int field3097;
	@ObfuscatedName("ax")
	int field3084;
	@ObfuscatedName("an")
	int field3088;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("am")
	int field3087;
	@ObfuscatedName("ad")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("at")
	int field3103;
	@ObfuscatedName("ay")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field3098 = false;
		this.rasterGouraudLowRes = true;
		this.field3086 = 0;
		this.field3089 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("aq")
	void method5874() {
		this.field3096 = this.field3084 / 2;
		this.field3097 = this.field3088 / 2;
		this.clipNegativeMidX = -this.field3096;
		this.field3087 = this.field3084 - this.field3096;
		this.clipNegativeMidY = -this.field3097;
		this.field3103 = this.field3088 - this.field3097;
	}

	@ObfuscatedName("aw")
	void method5873(int var1, int var2, int var3, int var4) {
		this.field3096 = var1 - var2;
		this.field3097 = var3 - var4;
		this.clipNegativeMidX = -this.field3096;
		this.field3087 = this.field3084 - this.field3096;
		this.clipNegativeMidY = -this.field3097;
		this.field3103 = this.field3088 - this.field3097;
	}

	@ObfuscatedName("al")
	void method5875(int var1, int var2, int var3) {
		this.field3098 = var1 < 0 || var1 > this.field3084 || var2 < 0 || var2 > this.field3084 || var3 < 0 || var3 > this.field3084;
	}
}
