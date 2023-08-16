import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("az")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 933190117
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1476740129
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ao")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("at")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "152224212"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1301851589"
	)
	public static int method6023(int var0) {
		return var0 >> 17 & 7;
	}
}
