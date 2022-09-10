import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 216493687
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -524659345
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2019849325
	)
	@Export("z")
	int z;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1901568163
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 512475551
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1736260079
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 155227051
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2081819735
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -377885443
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1283564619
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 942214617
	)
	int field2679;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1995571253
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 7185604237786058919L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1855881837
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public static boolean method4666(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field134[var0] : false; // L: 242 243
	}
}
