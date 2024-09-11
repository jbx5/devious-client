import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vz")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ac")
	final int field5457;
	@ObfuscatedName("ae")
	final int field5421;
	@ObfuscatedName("ag")
	final int field5422;
	@ObfuscatedName("am")
	final int field5423;
	@ObfuscatedName("ax")
	final int field5441;
	@ObfuscatedName("aq")
	final int field5425;
	@ObfuscatedName("af")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2043404571
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1430127729
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ar")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 673297239
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -974107413
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1167906823
	)
	int field5432;
	@ObfuscatedName("ap")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1112508069
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1099476119
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 147872273
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2033540096
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1675403187
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 301199527
	)
	int field5439;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1867063413
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aj")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1900190883
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("aw")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1281993917
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bn")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bh")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bd")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bx")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bf")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bm")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bs")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bw")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ba")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bj")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bp")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("by")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -866973593
	)
	int field5424;

	BZip2State() {
		this.field5457 = 4096;
		this.field5421 = 16;
		this.field5422 = 258;
		this.field5423 = 6;
		this.field5441 = 50;
		this.field5425 = 18002;
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
