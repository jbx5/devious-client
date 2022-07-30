import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jf")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1294534435)
	int field3274;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljh;")
	@Export("patch")
	MusicPatch patch;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lap;")
	@Export("rawSound")
	RawSound rawSound;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljb;")
	MusicPatchNode2 field3261;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 32088699)
	int field3265;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1734612137)
	int field3279;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1057864677)
	int field3267;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1411616549)
	int field3273;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -515562641)
	int field3263;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -689296601)
	int field3269;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1216279749)
	int field3271;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -233027663)
	int field3272;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -206831331)
	int field3264;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 541319582)
	int field3270;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 2145758209)
	int field3275;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 492776381)
	int field3276;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 641451677)
	int field3277;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1691149719)
	int field3278;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lav;")
	@Export("stream")
	RawPcmStream stream;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1200493067)
	int field3280;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1207660311)
	int field3281;

	MusicPatchNode() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2068907598")
	void method5479() {
		this.patch = null;
		this.rawSound = null;
		this.field3261 = null;
		this.stream = null;
	}
}