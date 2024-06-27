import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class30 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1323524365
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("jn")
	static int[] field147;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "1908706038"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "249019892"
	)
	static void method446(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = HttpResponse.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			WorldMapRenderer.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1948030057"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		UrlRequest.scrollBarSprites[0].drawAt(var0, var1);
		UrlRequest.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field693);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field747);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field747);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field747);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field747);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field584);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field584);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field584);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field584);
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1265045225"
	)
	static final void method451(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field790 == -1) {
				Client.field790 = var0.spriteId2;
				Client.field665 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field790;
			} else {
				var0.spriteId2 = Client.field665;
			}

		} else if (var1 == 325) {
			if (Client.field790 == -1) {
				Client.field790 = var0.spriteId2;
				Client.field665 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field665;
			} else {
				var0.spriteId2 = Client.field790;
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
