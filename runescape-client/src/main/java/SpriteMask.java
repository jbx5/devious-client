import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	484977617)

	@Export("width")
	public final int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	341413753)

	@Export("height")
	public final int height;
	@ObfuscatedName("i")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("f")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"24")

	@Export("contains")
	public boolean contains(int var1, int var2) {
		if ((var2 >= 0) && (var2 < this.xStarts.length)) {
			int var3 = this.xStarts[var2];
			if ((var1 >= var3) && (var1 <= (var3 + this.xWidths[var2]))) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lbb;Lbb;IZB)I", garbageValue = 
	"7")

	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == (-1)) {
					var4 = 2001;
				}

				if (var5 == (-1)) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1639() ? var1.method1639() ? 0 : 1 : var1.method1639() ? -1 : 0;
		} else if (var2 == 5) {
			return var0.method1637() ? var1.method1637() ? 0 : 1 : var1.method1637() ? -1 : 0;
		} else if (var2 == 6) {
			return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
		} else {
			return var0.id - var1.id;
		}
	}
}