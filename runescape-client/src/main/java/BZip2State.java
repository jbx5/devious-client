import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tb")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("aw")
	final int field5107;
	@ObfuscatedName("ay")
	final int field5112;
	@ObfuscatedName("ar")
	final int field5108;
	@ObfuscatedName("am")
	final int field5077;
	@ObfuscatedName("as")
	final int field5079;
	@ObfuscatedName("aj")
	final int field5080;
	@ObfuscatedName("ag")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 663558147
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1453474317
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ap")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -193520605
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -302019405
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1283585371
	)
	int field5087;
	@ObfuscatedName("ax")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1182981507
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 673163213
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1314502839
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1401992192
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1587918381
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -516580671
	)
	int field5094;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1996059187
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ak")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1440901021
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("af")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1756922079
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bd")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bb")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bn")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ba")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bf")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bs")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bp")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bv")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bq")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bo")
	@Export("base")
	int[][] base;
	@ObfuscatedName("br")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bw")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1061910137
	)
	int field5100;

	BZip2State() {
		this.field5107 = 4096;
		this.field5112 = 16;
		this.field5108 = 258;
		this.field5077 = 6;
		this.field5079 = 50;
		this.field5080 = 18002;
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
