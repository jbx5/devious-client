import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -210833969
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 736216811
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ak")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("aj")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2007505347"
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
}
