import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
@ObfuscatedName("kr")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	@ObfuscatedName("gr")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -2024477891)
	@Export("width")
	public final int width;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1726190535)
	@Export("height")
	public final int height;

	@ObfuscatedName("f")
	@Export("xWidths")
	public final int[] xWidths;

	@ObfuscatedName("u")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "-40")
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