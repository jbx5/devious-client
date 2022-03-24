import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lir;")

	public static final WorldMapCacheName field2849;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lir;")

	public static final WorldMapCacheName field2847;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lir;")

	public static final WorldMapCacheName field2846;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lir;")

	static final WorldMapCacheName field2852;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lir;")

	public static final WorldMapCacheName field2850;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;
	static 
	{
		field2849 = new WorldMapCacheName("details");
		field2847 = new WorldMapCacheName("compositemap");
		field2846 = new WorldMapCacheName("compositetexture");
		field2852 = new WorldMapCacheName("area");
		field2850 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIZI)Lql;", garbageValue = 
	"1724872631")

	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == (-1)) {
			var4 = 0;
		} else if ((var4 == 2) && (var1 != 1)) {
			var4 = 1;
		}

		long var6 = ((((((long) (var3)) << 42) + ((long) (var0))) + (((long) (var1)) << 16)) + (((long) (var2)) << 38)) + (((long) (var4)) << 40);
		SpritePixels var8;
		if (!var5) {
			var8 = ((SpritePixels) (ItemComposition.ItemDefinition_cachedSprites.get(var6)));
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class67.ItemDefinition_get(var0);
		if ((var1 > 1) && (var9.countobj != null)) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if ((var1 >= var9.countco[var11]) && (var9.countco[var11] != 0)) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != (-1)) {
				var9 = class67.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != (-1)) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != (-1)) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != (-1)) {
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
			Rasterizer3D.method3997(16, 16);
			Rasterizer3D.field2325 = false;
			if (var9.placeholderTemplate != (-1)) {
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = ((int) (((double) (var16)) * 1.5));
			} else if (var2 == 2) {
				var16 = ((int) (((double) (var16)) * 1.04));
			}

			int var17 = (var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d]) >> 16;
			int var18 = (var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d]) >> 16;
			var21.calculateBoundsCylinder();
			var21.method4376(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, ((var21.height / 2) + var17) + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != (-1)) {
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
			if (var9.noteTemplate != (-1)) {
				var22.drawTransBgAt(0, 0);
			}

			if ((var4 == 1) || ((var4 == 2) && (var9.isStackable == 1))) {
				Font var19 = class239.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = ("<col=ffff00>" + var1) + "</col>";
				} else if (var1 < 10000000) {
					var20 = (("<col=ffffff>" + (var1 / 1000)) + "K") + "</col>";
				} else {
					var20 = (("<col=00ff80>" + (var1 / 1000000)) + "M") + "</col>";
				}

				var19.draw(var20, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2325 = true;
			return var8;
		}
	}
}