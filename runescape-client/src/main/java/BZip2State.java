import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ve")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("am")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("aq")
	final int field5384;
	@ObfuscatedName("ad")
	final int field5370;
	@ObfuscatedName("ag")
	final int field5371;
	@ObfuscatedName("ak")
	final int field5372;
	@ObfuscatedName("ap")
	final int field5375;
	@ObfuscatedName("an")
	final int field5374;
	@ObfuscatedName("aj")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1609370483
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1581876209
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ai")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1205441607
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1609728095
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 277864357
	)
	int field5381;
	@ObfuscatedName("az")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -913982035
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -106841007
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -679155701
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1285608448
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1360031689
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1734514229
	)
	int field5388;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2081904641
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aw")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -927308777
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("af")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -550963283
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bt")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bj")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("be")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bm")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bo")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bi")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ba")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bg")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bs")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bp")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bx")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bu")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 154762521
	)
	int field5407;

	BZip2State() {
		this.field5384 = 4096;
		this.field5370 = 16;
		this.field5371 = 258;
		this.field5372 = 6;
		this.field5375 = 50;
		this.field5374 = 18002;
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
