import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1174257603
	)
	static int field3223;
	@ObfuscatedName("c")
	byte[] field3219;
	@ObfuscatedName("p")
	byte[] field3212;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2076416029
	)
	int field3213;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1239433131
	)
	int field3217;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1617370895
	)
	int field3211;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -215799583
	)
	int field3216;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1225266601
	)
	int field3214;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1368696359
	)
	int field3218;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -876009499
	)
	int field3222;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1909819821"
	)
	static int method5401(int var0) {
		return var0 * 3 + 600; // L: 1487
	}
}
