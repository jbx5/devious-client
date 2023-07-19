import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("aw")
	boolean field2793;
	@ObfuscatedName("ay")
	public boolean field2792;
	@ObfuscatedName("ar")
	int field2783;
	@ObfuscatedName("aj")
	public int field2781;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ah")
	int field2800;
	@ObfuscatedName("ax")
	int field2794;
	@ObfuscatedName("aa")
	int field2795;
	@ObfuscatedName("au")
	int field2796;
	@ObfuscatedName("ae")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ab")
	int field2786;
	@ObfuscatedName("ad")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ao")
	int field2798;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2793 = false;
		this.field2792 = true;
		this.field2783 = 0;
		this.field2781 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("aw")
	void method4987() {
		this.field2800 = this.field2795 / 2;
		this.field2794 = this.field2796 / 2;
		this.clipNegativeMidX = -this.field2800;
		this.field2786 = this.field2795 - this.field2800;
		this.clipNegativeMidY = -this.field2794;
		this.field2798 = this.field2796 - this.field2794;
	}

	@ObfuscatedName("ay")
	void method4984(int var1, int var2, int var3, int var4) {
		this.field2800 = var1 - var2;
		this.field2794 = var3 - var4;
		this.clipNegativeMidX = -this.field2800;
		this.field2786 = this.field2795 - this.field2800;
		this.clipNegativeMidY = -this.field2794;
		this.field2798 = this.field2796 - this.field2794;
	}

	@ObfuscatedName("ar")
	void method4985(int var1, int var2, int var3) {
		this.field2793 = var1 < 0 || var1 > this.field2795 || var2 < 0 || var2 > this.field2795 || var3 < 0 || var3 > this.field2795;
	}
}
