import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("n")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("k")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -407792165
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lpr;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("b")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("a")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("i")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkw;",
		garbageValue = "-39"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = SpotAnimationDefinition.getWidget(var0); // L: 231
		if (var1 == -1) { // L: 232
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 233 234
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIIB)Z",
		garbageValue = "28"
	)
	static final boolean method3439(Model var0, int var1, int var2, int var3) {
		boolean var4 = ViewportMouse.ViewportMouse_isInViewport; // L: 130
		if (!var4) { // L: 132
			return false;
		} else {
			KitDefinition.method3589(); // L: 133
			int var5 = var0.xMid + var1; // L: 134
			int var6 = var2 + var0.yMid; // L: 135
			int var7 = var3 + var0.zMid; // L: 136
			int var8 = var0.xMidOffset; // L: 137
			int var9 = var0.yMidOffset; // L: 138
			int var10 = var0.zMidOffset; // L: 139
			int var11 = ViewportMouse.field2619 - var5; // L: 140
			int var12 = GrandExchangeOfferOwnWorldComparator.field487 - var6; // L: 141
			int var13 = WorldMapID.field2870 - var7; // L: 142
			if (Math.abs(var11) > var8 + ViewportMouse.field2625) { // L: 143
				return false; // L: 144
			} else if (Math.abs(var12) > var9 + class147.field1689) { // L: 146
				return false; // L: 147
			} else if (Math.abs(var13) > var10 + class328.field4128) { // L: 149
				return false; // L: 150
			} else if (Math.abs(var13 * ViewportMouse.field2630 - var12 * BuddyRankComparator.field1396) > var10 * class147.field1689 + var9 * class328.field4128) { // L: 152
				return false; // L: 153
			} else if (Math.abs(var11 * BuddyRankComparator.field1396 - var13 * class152.field1725) > var8 * class328.field4128 + var10 * ViewportMouse.field2625) { // L: 155
				return false; // L: 156
			} else {
				return Math.abs(var12 * class152.field1725 - var11 * ViewportMouse.field2630) <= var9 * ViewportMouse.field2625 + var8 * class147.field1689; // L: 158
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "29"
	)
	static int method3441(String var0) {
		if (var0.equals("centre")) { // L: 297
			return 1; // L: 298
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 300 301 303
		}
	}
}
