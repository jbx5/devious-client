import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uq")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ad")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("at")
	final int field5180;
	@ObfuscatedName("ah")
	final int field5179;
	@ObfuscatedName("ar")
	final int field5146;
	@ObfuscatedName("ao")
	final int field5147;
	@ObfuscatedName("ab")
	final int field5148;
	@ObfuscatedName("au")
	final int field5161;
	@ObfuscatedName("aa")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -465619605
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -427426363
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("az")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 903874365
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1522384453
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -743202227
	)
	int field5166;
	@ObfuscatedName("as")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 806256577
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -860195179
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -801575151
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1000035328
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 632767701
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 158974869
	)
	int field5163;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1842959099
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ae")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 238072571
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ag")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -194930785
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("be")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bd")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bl")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bi")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bv")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bf")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bg")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ba")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bm")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bp")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bw")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bj")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 243765833
	)
	int field5182;

	BZip2State() {
		this.field5180 = 4096;
		this.field5179 = 16;
		this.field5146 = 258;
		this.field5147 = 6;
		this.field5148 = 50;
		this.field5161 = 18002;
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
