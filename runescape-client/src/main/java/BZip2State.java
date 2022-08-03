import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qd")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("o")
	final int field4729 = 4096;

	@ObfuscatedName("q")
	final int field4715 = 16;

	@ObfuscatedName("f")
	final int field4716 = 258;

	@ObfuscatedName("u")
	final int field4717 = 6;

	@ObfuscatedName("c")
	final int field4718 = 50;

	@ObfuscatedName("w")
	final int field4719 = 18002;

	@ObfuscatedName("z")
	@Export("inputArray")
	byte[] inputArray;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1061882633)
	@Export("nextByte")
	int nextByte = 0;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1241744169)
	@Export("nextBit_unused")
	int nextBit_unused;

	@ObfuscatedName("a")
	@Export("outputArray")
	byte[] outputArray;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -268992773)
	@Export("next_out")
	int next_out = 0;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 379275819)
	@Export("outputLength")
	int outputLength;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -1599277733)
	int field4741;

	@ObfuscatedName("g")
	@Export("out_char")
	byte out_char;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1618822425)
	@Export("su_rNToGo")
	int su_rNToGo;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 116985793)
	@Export("bsBuff")
	int bsBuff;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1622362317)
	@Export("bsLive")
	int bsLive;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -612356704)
	@Export("blockSize100k")
	int blockSize100k;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -421179221)
	@Export("originalPointer")
	int originalPointer;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1872250707)
	int field4751;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -336985683)
	@Export("su_ch2")
	int su_ch2;

	@ObfuscatedName("e")
	@Export("unzftab")
	int[] unzftab = new int[256];

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1246519951)
	@Export("nblocks_used")
	int nblocks_used;

	@ObfuscatedName("i")
	@Export("cftab")
	int[] cftab = new int[257];

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1436981817)
	@Export("nInUse")
	int nInUse;

	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse = new boolean[256];

	@ObfuscatedName("ar")
	@Export("inUse16")
	boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("aj")
	@Export("seqToUnseq")
	byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("au")
	@Export("ll8")
	byte[] ll8 = new byte[4096];

	@ObfuscatedName("af")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy = new int[16];

	@ObfuscatedName("as")
	@Export("selector")
	byte[] selector = new byte[18002];

	@ObfuscatedName("ab")
	@Export("selectorMtf")
	byte[] selectorMtf = new byte[18002];

	@ObfuscatedName("al")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d = new byte[6][258];

	@ObfuscatedName("ah")
	@Export("limit")
	int[][] limit = new int[6][258];

	@ObfuscatedName("ai")
	@Export("base")
	int[][] base = new int[6][258];

	@ObfuscatedName("ac")
	@Export("perm")
	int[][] perm = new int[6][258];

	@ObfuscatedName("ap")
	@Export("minLens")
	int[] minLens = new int[6];

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 1469727093)
	int field4726;

	BZip2State() {
	}
}