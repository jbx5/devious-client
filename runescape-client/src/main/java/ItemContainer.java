import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Luv;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ay")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("an")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;III)[Lvb;",
		garbageValue = "-637216950"
	)
	public static IndexedSprite[] method2397(AbstractArchive var0, int var1, int var2) {
		if (!class415.method7697(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class563.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class563.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = class563.SpriteBuffer_spriteHeight;
				var6.xOffset = class149.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class563.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class563.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class372.SpriteBuffer_spriteHeights[var5] * -2113044483;
				var6.palette = RouteStrategy.SpriteBuffer_spritePalette;
				var6.pixels = class563.SpriteBuffer_pixels[var5];
			}

			class149.SpriteBuffer_xOffsets = null;
			class563.SpriteBuffer_yOffsets = null;
			class563.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			RouteStrategy.SpriteBuffer_spritePalette = null;
			class563.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfb;FZB)F",
		garbageValue = "33"
	)
	static float method2395(class134 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3194() != 0) {
			float var4 = (float)var0.field1561[0].field1507;
			float var5 = (float)var0.field1561[var0.method3194() - 1].field1507;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1561[0].field1501;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(1.0D + var8);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1559 == class132.field1544) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1559 != class132.field1542 && var0.field1559 != class132.field1543) {
						if (var0.field1559 == class132.field1545) {
							var11 = var4 - var1;
							var16 = var0.field1561[0].field1502;
							var17 = var0.field1561[0].field1503;
							var3 = var0.field1561[0].field1501;
							if (0.0D != (double)var16) {
								var3 -= var11 * var17 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1560 == class132.field1544) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1560 != class132.field1542 && var0.field1560 != class132.field1543) {
					if (var0.field1560 == class132.field1545) {
						var11 = var1 - var5;
						var16 = var0.field1561[var0.method3194() - 1].field1504;
						var17 = var0.field1561[var0.method3194() - 1].field1505;
						var3 = var0.field1561[var0.method3194() - 1].field1501;
						if (0.0D != (double)var16) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = HttpRequest.method98(var0, var11);
				float var18;
				if (var2 && var0.field1559 == class132.field1543) {
					var18 = var0.field1561[var0.method3194() - 1].field1501 - var0.field1561[0].field1501;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1560 == class132.field1543) {
					var18 = var0.field1561[var0.method3194() - 1].field1501 - var0.field1561[0].field1501;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409806265"
	)
	static final int method2396() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "64955812"
	)
	static final void method2388() {
		Client.field701 = Client.cycleCntr;
		HttpRequestTask.ClanChat_inClanChat = true;
	}
}
