import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qx")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("z")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("c")
	final int field4737;
	@ObfuscatedName("p")
	final int field4738;
	@ObfuscatedName("f")
	final int field4739;
	@ObfuscatedName("n")
	final int field4742;
	@ObfuscatedName("k")
	final int field4740;
	@ObfuscatedName("w")
	final int field4754;
	@ObfuscatedName("s")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1640433535
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 686682087
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("x")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1827303657
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1618668637
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -160871729
	)
	int field4748;
	@ObfuscatedName("t")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1834795541
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2133826475
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1324502229
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -932887552
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1477440773
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -990916823
	)
	int field4756;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1635256939
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("y")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -155417927
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("r")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -355270205
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("as")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ac")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ar")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ai")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("an")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("aa")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ak")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("am")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ap")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ab")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1667955067
	)
	int field4775;

	BZip2State() {
		this.field4737 = 4096; // L: 4
		this.field4738 = 16; // L: 5
		this.field4739 = 258; // L: 6
		this.field4742 = 6; // L: 7
		this.field4740 = 50; // L: 8
		this.field4754 = 18002; // L: 9
		this.nextByte = 0; // L: 11
		this.next_out = 0; // L: 14
		this.unzftab = new int[256]; // L: 25
		this.cftab = new int[257]; // L: 27
		this.inUse = new boolean[256]; // L: 30
		this.inUse16 = new boolean[16]; // L: 31
		this.seqToUnseq = new byte[256]; // L: 32
		this.ll8 = new byte[4096]; // L: 33
		this.getAndMoveToFrontDecode_yy = new int[16]; // L: 34
		this.selector = new byte[18002]; // L: 35
		this.selectorMtf = new byte[18002]; // L: 36
		this.temp_charArray2d = new byte[6][258]; // L: 37
		this.limit = new int[6][258]; // L: 38
		this.base = new int[6][258]; // L: 39
		this.perm = new int[6][258]; // L: 40
		this.minLens = new int[6]; // L: 41
	} // L: 44
}
