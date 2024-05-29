import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1993404823
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1814303763
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1974071729
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 336880011
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -487371055
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 4933655260804929971L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1373030979
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILun;I)Z",
		garbageValue = "1718767909"
	)
	public static boolean method5455(int var0, class541 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}
}
