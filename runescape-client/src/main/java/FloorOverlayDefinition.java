import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gs")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1309786773)
	@Export("primaryRgb")
	public int primaryRgb = 0;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -673899207)
	@Export("texture")
	public int texture = -1;

	@ObfuscatedName("c")
	@Export("hideUnderlay")
	public boolean hideUnderlay = true;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 854090491)
	@Export("secondaryRgb")
	public int secondaryRgb = -1;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1666995081)
	@Export("hue")
	public int hue;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 987371197)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1587823397)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1905676505)
	@Export("secondaryHue")
	public int secondaryHue;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1540815289)
	@Export("secondarySaturation")
	public int secondarySaturation;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 262785679)
	@Export("secondaryLightness")
	public int secondaryLightness;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1947171747")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "1881228717")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;III)V", garbageValue = "352713725")
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
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2132569463")
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
		if (var10 != var8) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IS)I", garbageValue = "17439")
	public static int method3800(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1775354023")
	static void method3799() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}
	}
}