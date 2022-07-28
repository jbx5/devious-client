import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gd")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("w")
	static final int[] field1991 = new int[32];

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -867331759)
	@Export("baseVar")
	public int baseVar;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 978684669)
	@Export("startBit")
	public int startBit;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1206369175)
	@Export("endBit")
	public int endBit;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			field1991[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "721119227")
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "1497343851")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}
	}

	@ObfuscatedName("o")
	public static final int method3556(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0) {
			double var12;
			if (var4 < 0.5) {
				var12 = (1.0 + var2) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2;
			}
			double var14 = 2.0 * var4 - var12;
			double var16 = var0 + 0.3333333333333333;
			if (var16 > 1.0) {
				--var16;
			}
			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				++var20;
			}
			if (6.0 * var16 < 1.0) {
				var6 = var16 * (var12 - var14) * 6.0 + var14;
			} else if (2.0 * var16 < 1.0) {
				var6 = var12;
			} else if (var16 * 3.0 < 2.0) {
				var6 = var14 + (var12 - var14) * (0.6666666666666666 - var16) * 6.0;
			} else {
				var6 = var14;
			}
			if (var0 * 6.0 < 1.0) {
				var8 = var14 + 6.0 * (var12 - var14) * var0;
			} else if (var0 * 2.0 < 1.0) {
				var8 = var12;
			} else if (var0 * 3.0 < 2.0) {
				var8 = var14 + (0.6666666666666666 - var0) * (var12 - var14) * 6.0;
			} else {
				var8 = var14;
			}
			if (var20 * 6.0 < 1.0) {
				var10 = 6.0 * (var12 - var14) * var20 + var14;
			} else if (var20 * 2.0 < 1.0) {
				var10 = var12;
			} else if (var20 * 3.0 < 2.0) {
				var10 = (0.6666666666666666 - var20) * (var12 - var14) * 6.0 + var14;
			} else {
				var10 = var14;
			}
		}
		int var22 = ((int) (256.0 * var6));
		int var13 = ((int) (var8 * 256.0));
		int var23 = ((int) (256.0 * var10));
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IIIIIZI)Lqj;", garbageValue = "-876125855")
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}
		long var6 = (((long) (var4)) << 40) + (((long) (var2)) << 38) + (((long) (var1)) << 16) + ((long) (var0)) + (((long) (var3)) << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = ((SpritePixels) (ItemComposition.ItemDefinition_cachedSprites.get(var6)));
			if (var8 != null) {
				return var8;
			}
		}
		ItemComposition var9 = class258.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}
			if (var10 != -1) {
				var9 = class258.ItemDefinition_get(var10);
			}
		}
		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != -1) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}
			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method4043(16, 16);
			Rasterizer3D.field2331 = false;
			if (var9.placeholderTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}
			int var16 = var9.zoom2d;
			if (var5) {
				var16 = ((int) (((double) (var16)) * 1.5));
			} else if (var2 == 2) {
				var16 = ((int) (((double) (var16)) * 1.04));
			}
			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var21.calculateBoundsCylinder();
			var21.method4366(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var22.drawTransBgAt(0, 0);
			}
			if (var2 >= 1) {
				var8.outline(1);
			}
			if (var2 >= 2) {
				var8.outline(16777215);
			}
			if (var3 != 0) {
				var8.shadow(var3);
			}
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}
			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var19 = class341.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}
				var19.draw(var20, 0, 9, 16776960, 1);
			}
			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}
			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2331 = true;
			return var8;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "917156048")
	static final void method3557(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Player.method2211();
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = ClanChannelMember.method2906(var2);
				}
				if (Client.menuOptionsCount > 2) {
					var3 = var3 + class82.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}
				class116.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}