import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -974194965
	)
	static int field3031;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -783151089
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1852068695
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -167741727
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1721181881
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1056312055
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1825265297
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1493092463
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1774789875
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1436587587
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1092203407
	)
	int field3026;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1422878921
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 6238027129843276915L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2016533671
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-97"
	)
	@Export("shift8LeftAndAdd")
	public static int shift8LeftAndAdd(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "91"
	)
	static int method5474(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
