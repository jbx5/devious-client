import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gj")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("jz")
	@ObfuscatedGetter(intValue = -214209769)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 444643155)
	@Export("primaryRgb")
	public int primaryRgb = 0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -180252261)
	@Export("texture")
	public int texture = -1;

	@ObfuscatedName("c")
	@Export("hideUnderlay")
	public boolean hideUnderlay = true;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1139903209)
	@Export("secondaryRgb")
	public int secondaryRgb = -1;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2046052479)
	@Export("hue")
	public int hue;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1253899879)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1437897057)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -932708741)
	@Export("secondaryHue")
	public int secondaryHue;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1597329197)
	@Export("secondarySaturation")
	public int secondarySaturation;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1561033009)
	@Export("secondaryLightness")
	public int secondaryLightness;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-105")
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}
		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "-937730080")
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}
			this.decodeNext(var1, var3, var2);
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;III)V", garbageValue = "-2146576435")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "112")
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
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var10 == var6) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}
		var12 /= 6.0;
		this.hue = ((int) (256.0 * var12));
		this.saturation = ((int) (256.0 * var14));
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
	}
}