import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uo")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ac")
	final int field5173;
	@ObfuscatedName("al")
	final int field5146;
	@ObfuscatedName("ak")
	final int field5172;
	@ObfuscatedName("ax")
	final int field5148;
	@ObfuscatedName("ao")
	final int field5149;
	@ObfuscatedName("ah")
	final int field5150;
	@ObfuscatedName("ar")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 818837171
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -248004031
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("av")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1115922755
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 664653085
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -834006935
	)
	int field5157;
	@ObfuscatedName("ay")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 766622741
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1018178343
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 724200097
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 112585728
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1960135451
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 117326111
	)
	int field5164;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1052293771
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aq")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1128838103
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("at")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1058683869
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bn")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bk")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("by")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bd")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("be")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bv")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ba")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bz")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bb")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bo")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bp")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bt")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 49636705
	)
	int field5182;

	BZip2State() {
		this.field5173 = 4096;
		this.field5146 = 16;
		this.field5172 = 258;
		this.field5148 = 6;
		this.field5149 = 50;
		this.field5150 = 18002;
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
