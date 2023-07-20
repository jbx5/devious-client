import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -99375235
	)
	static int field4949;
	@ObfuscatedName("ag")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-821041494"
	)
	static int method8744(int var0, int var1) {
		FloorOverlayDefinition var2 = class131.method3024(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) {
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = ClanChannelMember.method3150(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.texture >= 0) {
				int var3 = ClanChannelMember.method3150(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = ClanChannelMember.method3150(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsg;",
		garbageValue = "-347561633"
	)
	public static FontName[] method8739() {
		return new FontName[]{FontName_verdana15, FontName_bold12, FontName_verdana13, FontName_plain11, FontName_plain12, FontName_verdana11};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldd;",
		garbageValue = "-718226553"
	)
	static class89[] method8742() {
		return new class89[]{class89.field1096, class89.field1091, class89.field1089, class89.field1093, class89.field1097};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1946858719"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}
}
