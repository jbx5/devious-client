import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("jw")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1679504163
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 633794047
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ax")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1193926069
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -204798379
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1155509615
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1570391835
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -336599249
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1303900443
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1167656883
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "958426142"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;IB)V",
		garbageValue = "0"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;III)V",
		garbageValue = "-1187465059"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "686929054"
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
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(256.0D * var16);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-2068232304"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		SoundCache.method890(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-769892069"
	)
	static double method4312(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var3 > 0.0D && var3 < 1.0D) {
			double var5;
			double var7;
			switch(var2) {
			case 0:
				return var3;
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D);
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var3 * var3;
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3);
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D;
			case 7:
				return var3 * var3 * var3;
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D);
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D;
			case 10:
				return var3 * var3 * var3 * var3;
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D);
			case 12:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var3 * var3 * var3 * var3 * var3;
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D);
			case 15:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D);
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 20.0D * var3 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
			case 23:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
			case 24:
				var5 = 1.70158D;
				var7 = 2.5949095D;
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
			case 25:
				var5 = 2.0943951023931953D;
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D);
			case 26:
				var5 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var5 = 1.3962634015954636D;
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D);
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D;
			default:
				return var3;
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(IIIILvv;Lnl;I)V",
		garbageValue = "-1502021667"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10408(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "950249480"
	)
	static void method4308(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class450.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
