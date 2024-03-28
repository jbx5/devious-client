import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("az")
	boolean field2893;
	@ObfuscatedName("ah")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("af")
	int field2886;
	@ObfuscatedName("ao")
	public int field2889;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ai")
	int field2896;
	@ObfuscatedName("ax")
	int field2897;
	@ObfuscatedName("ar")
	int field2899;
	@ObfuscatedName("aj")
	int field2892;
	@ObfuscatedName("au")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ay")
	int field2890;
	@ObfuscatedName("ap")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("av")
	int field2903;
	@ObfuscatedName("aa")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2893 = false;
		this.rasterGouraudLowRes = true;
		this.field2886 = 0;
		this.field2889 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("az")
	void method5144() {
		this.field2896 = this.field2899 / 2;
		this.field2897 = this.field2892 / 2;
		this.clipNegativeMidX = -this.field2896;
		this.field2890 = this.field2899 - this.field2896;
		this.clipNegativeMidY = -this.field2897;
		this.field2903 = this.field2892 - this.field2897;
	}

	@ObfuscatedName("ah")
	void method5134(int var1, int var2, int var3, int var4) {
		this.field2896 = var1 - var2;
		this.field2897 = var3 - var4;
		this.clipNegativeMidX = -this.field2896;
		this.field2890 = this.field2899 - this.field2896;
		this.clipNegativeMidY = -this.field2897;
		this.field2903 = this.field2892 - this.field2897;
	}

	@ObfuscatedName("af")
	void method5133(int var1, int var2, int var3) {
		this.field2893 = var1 < 0 || var1 > this.field2899 || var2 < 0 || var2 > this.field2899 || var3 < 0 || var3 > this.field2899;
	}
}
