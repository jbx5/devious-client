import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ap")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("aw")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ak")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ay")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ao")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("af")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("ar")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ab")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("az")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ag")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ad")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ac")
	int field2931;
	@ObfuscatedName("av")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ap")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2931 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("aw")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2931 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ak")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
