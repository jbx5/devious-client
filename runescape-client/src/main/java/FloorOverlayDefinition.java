import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 2138486231
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -265762545
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1814161031
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ai")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1742760383
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1283114581
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1450197231
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1077160877
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1693258293
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -42789891
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1789961391
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "-105"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IIB)V",
		garbageValue = "24"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1873491953"
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
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(var14 * 256.0D);
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

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1463567568"
	)
	static final void method4353(int var0, int var1, int var2) {
		if (AsyncHttpResponse.cameraX < var0) {
			AsyncHttpResponse.cameraX = (var0 - AsyncHttpResponse.cameraX) * HttpResponse.field82 / 1000 + AsyncHttpResponse.cameraX + Message.field461;
			if (AsyncHttpResponse.cameraX > var0) {
				AsyncHttpResponse.cameraX = var0;
			}
		}

		if (AsyncHttpResponse.cameraX > var0) {
			AsyncHttpResponse.cameraX -= (AsyncHttpResponse.cameraX - var0) * HttpResponse.field82 / 1000 + Message.field461;
			if (AsyncHttpResponse.cameraX < var0) {
				AsyncHttpResponse.cameraX = var0;
			}
		}

		if (cameraY < var1) {
			cameraY = (var1 - cameraY) * HttpResponse.field82 / 1000 + cameraY + Message.field461;
			if (cameraY > var1) {
				cameraY = var1;
			}
		}

		if (cameraY > var1) {
			cameraY -= (cameraY - var1) * HttpResponse.field82 / 1000 + Message.field461;
			if (cameraY < var1) {
				cameraY = var1;
			}
		}

		if (PlayerType.cameraZ < var2) {
			PlayerType.cameraZ = (var2 - PlayerType.cameraZ) * HttpResponse.field82 / 1000 + PlayerType.cameraZ + Message.field461;
			if (PlayerType.cameraZ > var2) {
				PlayerType.cameraZ = var2;
			}
		}

		if (PlayerType.cameraZ > var2) {
			PlayerType.cameraZ -= (PlayerType.cameraZ - var2) * HttpResponse.field82 / 1000 + Message.field461;
			if (PlayerType.cameraZ < var2) {
				PlayerType.cameraZ = var2;
			}
		}

	}
}
