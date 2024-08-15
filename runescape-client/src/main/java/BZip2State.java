import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vm")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ab")
	final int field5422;
	@ObfuscatedName("ay")
	final int field5388;
	@ObfuscatedName("an")
	final int field5389;
	@ObfuscatedName("au")
	final int field5390;
	@ObfuscatedName("ax")
	final int field5391;
	@ObfuscatedName("ao")
	final int field5392;
	@ObfuscatedName("am")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -413989587
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1193051135
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ad")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2033086911
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 810552949
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -459853555
	)
	int field5415;
	@ObfuscatedName("as")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1006279115
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1049411759
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 761466391
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 785089536
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1735153781
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1338842055
	)
	int field5406;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -526182991
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ap")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 641468783
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ai")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1050052851
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bg")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bz")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bj")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bc")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bo")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bm")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bd")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bh")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bx")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bv")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bu")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bp")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1347744099
	)
	int field5424;

	BZip2State() {
		this.field5422 = 4096;
		this.field5388 = 16;
		this.field5389 = 258;
		this.field5390 = 6;
		this.field5391 = 50;
		this.field5392 = 18002;
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
