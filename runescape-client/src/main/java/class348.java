import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class348 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1820269009
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 592055015
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-10"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field760;
		} else if (var5 >= 100) {
			var6 = Client.field761;
		} else {
			var6 = (Client.field761 - Client.field760) * var5 / 100 + Client.field760;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field531) {
			var10 = Client.field531;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field765) {
				var6 = Client.field765;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field722) {
			var10 = Client.field722;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field764) {
				var6 = Client.field764;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class102.method2743(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "1443967648"
	)
	static final void method6831(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field774 == -1) {
				Client.field774 = var0.spriteId2;
				Client.field720 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field774;
			} else {
				var0.spriteId2 = Client.field720;
			}

		} else if (var1 == 325) {
			if (Client.field774 == -1) {
				Client.field774 = var0.spriteId2;
				Client.field720 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field720;
			} else {
				var0.spriteId2 = Client.field774;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
