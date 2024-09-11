import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public final class class4 {
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		longValue = -6940267054176306705L
	)
	static long field4;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-252508775"
	)
	public static void method13() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lvv;",
		garbageValue = "1195559720"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = MouseRecorder.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = MouseRecorder.ItemDefinition_get(var10);
			}
		}

		Model var22 = var9.getModel(1);
		if (var22 == null) {
			return null;
		} else {
			SpritePixels var23 = null;
			if (var9.noteTemplate != -1) {
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var23 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var23 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var23 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.Rasterizer2D_brightness;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method4738(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.setCustomClipBounds(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var22.calculateBoundsCylinder();
			var22.drawFrustum(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var23.drawTransBgAt(0, 0);
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

			Rasterizer3D.method4738(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var20 = class338.ItemDefinition_fontPlain11;
				String var21;
				if (var1 < 100000) {
					var21 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var20.draw(var21, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4738(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}
}
