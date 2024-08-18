import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 464061243
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1792543309
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ax")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 233196693
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 199304205
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1306789669
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -557872953
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1049516043
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1498907317
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1998600675
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-1176113450"
	)
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IIB)V",
		garbageValue = "5"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-908261376"
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
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
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

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "14"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = Player.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class162.foundItemIdCount = -1;
					WorldMapCacheName.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		WorldMapCacheName.foundItemIds = var2;
		ParamComposition.foundItemIndex = 0;
		class162.foundItemIdCount = var3;
		String[] var8 = new String[class162.foundItemIdCount];

		for (int var5 = 0; var5 < class162.foundItemIdCount; ++var5) {
			var8[var5] = Player.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = WorldMapCacheName.foundItemIds;
		class419.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
