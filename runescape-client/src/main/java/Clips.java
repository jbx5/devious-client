import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("aq")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ad")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ag")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("an")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ah")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("az")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("ax")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ac")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("al")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ay")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ao")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("aa")
	int clipCenterY;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("aq")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.clipCenterY = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ad")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.clipCenterY = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ag")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
