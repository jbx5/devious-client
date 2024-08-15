import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		longValue = -452167066215132521L
	)
	static long field3697;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2129642777
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1891020969
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("an")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("au")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1813707489"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1579469893"
	)
	static int method6497(int var0, int var1) {
		FloorOverlayDefinition var2 = HealthBarDefinition.method4870(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var3;
			int var4;
			if (var2.secondaryRgb >= 0) {
				var3 = class358.method6931(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var4 = UserComparator4.method3043(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			} else if (var2.texture >= 0) {
				var3 = UserComparator4.method3043(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = class358.method6931(var2.hue, var2.saturation, var2.lightness);
				var4 = UserComparator4.method3043(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvg;J)V"
	)
	static void method6493(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)I",
		garbageValue = "1458516118"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
