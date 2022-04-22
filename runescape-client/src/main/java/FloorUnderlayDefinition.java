import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	2001140681)

	@Export("rgb")
	int rgb;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1442875069)

	@Export("hue")
	public int hue;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1249056165)

	@Export("saturation")
	public int saturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1727815031)

	@Export("lightness")
	public int lightness;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	634259911)

	@Export("hueMultiplier")
	public int hueMultiplier;
	static 
	{
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1803560536")

	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"141274967")

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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;III)V", garbageValue = 
	"-606456868")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"15")

	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = ((double) ((var1 >> 16) & 255)) / 256.0;
		double var4 = ((double) ((var1 >> 8) & 255)) / 256.0;
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
				var14 = (var10 - var8) / ((2.0 - var10) - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = ((var6 - var2) / (var10 - var8)) + 2.0;
			} else if (var10 == var6) {
				var12 = ((var2 - var4) / (var10 - var8)) + 4.0;
			}
		}

		var12 /= 6.0;
		this.saturation = ((int) (var14 * 256.0));
		this.lightness = ((int) (var16 * 256.0));
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
			this.hueMultiplier = ((int) (((1.0 - var16) * var14) * 512.0));
		} else {
			this.hueMultiplier = ((int) ((var14 * var16) * 512.0));
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = ((int) (((double) (this.hueMultiplier)) * var12));
	}
}