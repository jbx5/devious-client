import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ab")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ay")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("an")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ao")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aj")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("as")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("aw")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("af")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("aa")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ah")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("av")
	int field2274;
	@ObfuscatedName("ar")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ab")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2274 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ay")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2274 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("an")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
