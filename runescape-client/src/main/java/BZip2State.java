import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ue")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("av")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("aq")
	final int field5210;
	@ObfuscatedName("aw")
	final int field5206;
	@ObfuscatedName("al")
	final int field5207;
	@ObfuscatedName("ai")
	final int field5208;
	@ObfuscatedName("ar")
	final int field5240;
	@ObfuscatedName("as")
	final int field5213;
	@ObfuscatedName("aa")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -652868909
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -618582653
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("au")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1683399887
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 400908121
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1568956233
	)
	int field5217;
	@ObfuscatedName("af")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -937708097
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1531395401
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1554557835
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1448719360
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1589650809
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1089101455
	)
	int field5224;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 310865539
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ae")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -455384849
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ab")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 604135277
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bu")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bo")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bd")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bi")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ba")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bt")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bk")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bm")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bw")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bv")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("by")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -597630567
	)
	int field5243;

	BZip2State() {
		this.field5210 = 4096;
		this.field5206 = 16;
		this.field5207 = 258;
		this.field5208 = 6;
		this.field5240 = 50;
		this.field5213 = 18002;
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
