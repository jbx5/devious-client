import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1777998723)

	@Export("rgb")
	int rgb;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	10295831)

	@Export("hue")
	public int hue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	2028509669)

	@Export("saturation")
	public int saturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	2013441019)

	@Export("lightness")
	public int lightness;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1582174631)

	@Export("hueMultiplier")
	public int hueMultiplier;
	static 
	{
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-597629849")

	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"922943363")

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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;IIB)V", garbageValue = 
	"10")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"458316763")

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
		double var16 = (var10 + var8) / 2.0;
		if (var10 != var8) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / ((2.0 - var10) - var8);
			}

			if (var10 == var2) {
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
			this.hueMultiplier = ((int) ((var14 * (1.0 - var16)) * 512.0));
		} else {
			this.hueMultiplier = ((int) ((512.0 * var16) * var14));
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = ((int) (var12 * ((double) (this.hueMultiplier))));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"122")

	public static int method3536(int var0, int var1) {
		return (((-3) - var0) << 8) + var1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-699179659")

	static void method3548() {
		if (MusicPatch.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}