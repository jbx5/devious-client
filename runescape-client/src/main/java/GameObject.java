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
	int field3018;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -167741727
	)
	int field3019;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1721181881
	)
	int field3020;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public Renderable field3021;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1056312055
	)
	int field3022;
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
	int field3028;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 6238027129843276915L
	)
	public long field3029;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2016533671
	)
	int field3017;

	GameObject() {
		this.field3029 = 0L;
		this.field3017 = 0;
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
