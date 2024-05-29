import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -285362375
	)
	static int field3705;
	@ObfuscatedName("jb")
	static byte[][] field3706;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -771143131
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1324622685
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("aj")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("az")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "12"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2060529092"
	)
	static boolean method6499(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}
}
