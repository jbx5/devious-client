import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vk")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 171186151
	)
	static int field5507;
	@ObfuscatedName("ap")
	final int field5495;
	@ObfuscatedName("aw")
	final int field5470;
	@ObfuscatedName("ak")
	final int field5477;
	@ObfuscatedName("aj")
	final int field5472;
	@ObfuscatedName("ai")
	final int field5473;
	@ObfuscatedName("ay")
	final int field5474;
	@ObfuscatedName("as")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1105480205
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1159878947
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("at")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -52477679
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1336394719
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1018743397
	)
	int field5481;
	@ObfuscatedName("af")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2035058081
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 561692771
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1641847111
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2023834624
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1223097369
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 686952297
	)
	int field5488;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2114068569
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ax")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1826671221
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("al")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -315812665
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bh")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bj")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bv")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bx")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bk")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bb")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bq")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bp")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bz")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bc")
	@Export("base")
	int[][] base;
	@ObfuscatedName("by")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("br")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 635497641
	)
	int field5494;

	BZip2State() {
		this.field5495 = 4096;
		this.field5470 = 16;
		this.field5477 = 258;
		this.field5472 = 6;
		this.field5473 = 50;
		this.field5474 = 18002;
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
