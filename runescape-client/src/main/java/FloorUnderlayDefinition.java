import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fs")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("ep")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive11")
	static Archive archive11;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1415861081)
	@Export("rgb")
	int rgb = 0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 711472625)
	@Export("hue")
	public int hue;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1601741227)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -754627641)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 42167891)
	@Export("hueMultiplier")
	public int hueMultiplier;

	FloorUnderlayDefinition() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "7")
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "-2144301665")
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}
			this.decodeNext(var1, var3, var2);
		} 
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqr;IIB)V", garbageValue = "6")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1992701527")
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = ((double) (var1 >> 16 & 255)) / 256.0;
		double var4 = ((double) (var1 >> 8 & 255)) / 256.0;
		double var6 = ((double) (var1 & 255)) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var8 + var10) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}
		var12 /= 6.0;
		this.saturation = ((int) (var14 * 256.0));
		this.lightness = ((int) (256.0 * var16));
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var16 > 0.5) {
			this.hueMultiplier = ((int) (var14 * (1.0 - var16) * 512.0));
		} else {
			this.hueMultiplier = ((int) (512.0 * var16 * var14));
		}
		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}
		this.hue = ((int) (var12 * ((double) (this.hueMultiplier))));
	}
}