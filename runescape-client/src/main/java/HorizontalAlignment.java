import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	field2554(1, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	field2551(2, 2);

	@ObfuscatedName("al")
	public static short[][] field2553;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 165487207
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1638844297
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public static void method4908() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1327065074"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = GrandExchangeOfferUnitPriceComparator.fontPlain12.lineWidth(var0, 250);
			int var6 = GrandExchangeOfferUnitPriceComparator.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
			GrandExchangeOfferUnitPriceComparator.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var6 + var2 + var2;

			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.validRootWidgets[var11] = true;
				}
			}

			if (var1) {
				class299.rasterProvider.drawFull(0, 0);
			} else {
				var11 = var3;
				int var12 = var4;
				int var13 = var5;
				int var14 = var6;

				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) {
					if (Client.rootWidgetWidths[var15] + Client.rootWidgetXs[var15] > var11 && Client.rootWidgetXs[var15] < var11 + var13 && Client.rootWidgetHeights[var15] + Client.rootWidgetYs[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) {
						Client.field685[var15] = true;
					}
				}
			}

		}
	}
}
