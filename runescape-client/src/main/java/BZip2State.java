import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qd")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("c")
	final int field4709;

	@ObfuscatedName("v")
	final int field4704;

	@ObfuscatedName("q")
	final int field4705;

	@ObfuscatedName("f")
	final int field4713;

	@ObfuscatedName("j")
	final int field4707;

	@ObfuscatedName("e")
	final int field4712;

	@ObfuscatedName("g")
	@Export("inputArray")
	byte[] inputArray;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1626824001)
	@Export("nextByte")
	int nextByte;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1971225163)
	@Export("nextBit_unused")
	int nextBit_unused;

	@ObfuscatedName("i")
	@Export("outputArray")
	byte[] outputArray;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1819049245)
	@Export("next_out")
	int next_out;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1774346175)
	@Export("outputLength")
	int outputLength;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1489535775)
	int field4715;

	@ObfuscatedName("r")
	@Export("out_char")
	byte out_char;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -709367265)
	@Export("su_rNToGo")
	int su_rNToGo;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1666306837)
	@Export("bsBuff")
	int bsBuff;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1002804521)
	@Export("bsLive")
	int bsLive;

	@ObfuscatedName("x")
	@Export("blockSize100k")
	int blockSize100k;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1114530927)
	@Export("originalPointer")
	int originalPointer;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -354978331)
	int field4722;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 819371129)
	@Export("su_ch2")
	int su_ch2;

	@ObfuscatedName("b")
	@Export("unzftab")
	int[] unzftab;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1156638647)
	@Export("nblocks_used")
	int nblocks_used;

	@ObfuscatedName("o")
	@Export("cftab")
	int[] cftab;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1218641305)
	@Export("nInUse")
	int nInUse;

	@ObfuscatedName("ad")
	@Export("inUse")
	boolean[] inUse;

	@ObfuscatedName("ak")
	@Export("inUse16")
	boolean[] inUse16;

	@ObfuscatedName("al")
	@Export("seqToUnseq")
	byte[] seqToUnseq;

	@ObfuscatedName("ao")
	@Export("ll8")
	byte[] ll8;

	@ObfuscatedName("ab")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;

	@ObfuscatedName("ap")
	@Export("selector")
	byte[] selector;

	@ObfuscatedName("ac")
	@Export("selectorMtf")
	byte[] selectorMtf;

	@ObfuscatedName("ae")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;

	@ObfuscatedName("aj")
	@Export("limit")
	int[][] limit;

	@ObfuscatedName("am")
	@Export("base")
	int[][] base;

	@ObfuscatedName("an")
	@Export("perm")
	int[][] perm;

	@ObfuscatedName("af")
	@Export("minLens")
	int[] minLens;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1083748329)
	int field4734;

	BZip2State() {
		this.field4709 = 4096;
		this.field4704 = 16;
		this.field4705 = 258;
		this.field4713 = 6;
		this.field4707 = 50;
		this.field4712 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}