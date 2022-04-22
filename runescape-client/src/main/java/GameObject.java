import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1042326033)

	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1852780791)

	@Export("z")
	int z;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1035014481)

	@Export("centerX")
	int centerX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-491615683)

	@Export("centerY")
	int centerY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lix;")

	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	949419433)

	@Export("orientation")
	int orientation;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	341581995)

	@Export("startX")
	int startX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1189496713)

	@Export("endX")
	int endX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	897314371)

	@Export("startY")
	int startY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1130692301)

	@Export("endY")
	int endY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-278227507)

	int field2865;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	946452763)

	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 
	3413023011063757331L)

	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-742925927)

	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Lbd;", garbageValue = 
	"1018035869")

	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = TileItem.method2393(var1, var0);
		Script var4 = UserComparator5.method2600(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (((-3) - var2) << 8) + var0;
			var4 = UserComparator5.method2600(var5, var0);
			return var4 != null ? var4 : null;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IIIZIB)J", garbageValue = 
	"119")

	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = ((long) ((((var0 & 127) << 0) | ((var1 & 127) << 7)) | ((var2 & 3) << 14))) | ((((long) (var4)) & 4294967295L) << 17);
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"329658125")

	static int method5111(int var0, Script var1, boolean var2) {
		if ((var0 != 3700) && (var0 != 3701)) {
			if (var0 == 3702) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--Interpreter.Interpreter_intStackSize;
			--class122.Interpreter_stringStackSize;
			return 1;
		}
	}
}