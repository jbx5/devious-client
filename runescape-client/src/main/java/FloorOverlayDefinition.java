import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("wa")
	static List field2278;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2130195297
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1868876849
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ap")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 398762743
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 899009769
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 940491185
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 992973643
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 641939819
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 893402431
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1211510327
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2009375911"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-2060202740"
	)
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;III)V",
		garbageValue = "2006578058"
	)
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2059953925"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
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

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(var16 * 256.0D);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "396253425"
	)
	public static int method4035(int var0) {
		return class496.field5052[var0 & 16383];
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "134068715"
	)
	static void method4034() {
		World.compass = null;
		class74.redHintArrowSprite = null;
		class418.mapSceneSprites = null;
		FaceNormal.headIconPkSprites = null;
		ArchiveDiskActionHandler.headIconPrayerSprites = null;
		class337.headIconHintSprites = null;
		KeyHandler.mapDotSprites = null;
		PlayerUpdateManager.crossSprites = null;
		class446.field4821 = null;
		UrlRequest.scrollBarSprites = null;
		class240.field2526 = null;
	}
}
