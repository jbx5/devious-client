import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("te")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("au")
	final int field5126;
	@ObfuscatedName("ae")
	final int field5117;
	@ObfuscatedName("ao")
	final int field5119;
	@ObfuscatedName("at")
	final int field5120;
	@ObfuscatedName("ac")
	final int field5121;
	@ObfuscatedName("ai")
	final int field5145;
	@ObfuscatedName("az")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2092728553
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 176782767
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("af")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -527880423
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1254769027
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1004065633
	)
	int field5127;
	@ObfuscatedName("an")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -879226673
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1908343509
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -741406269
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1697952768
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2088792739
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -18085365
	)
	int field5136;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1718110481
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ay")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 964212399
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("av")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1955605005
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bh")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bj")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bk")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bv")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bt")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bd")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("by")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bs")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bm")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bf")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bq")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ba")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -787322195
	)
	int field5154;

	BZip2State() {
		this.field5126 = 4096;
		this.field5117 = 16;
		this.field5119 = 258;
		this.field5120 = 6;
		this.field5121 = 50;
		this.field5145 = 18002;
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
