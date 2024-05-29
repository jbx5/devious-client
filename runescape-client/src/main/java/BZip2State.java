import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vt")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ak")
	final int field5353;
	@ObfuscatedName("al")
	final int field5350;
	@ObfuscatedName("aj")
	final int field5352;
	@ObfuscatedName("az")
	final int field5351;
	@ObfuscatedName("af")
	final int field5357;
	@ObfuscatedName("aa")
	final int field5354;
	@ObfuscatedName("at")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -673026097
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1619956677
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ao")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1514712379
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2004221203
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -807947157
	)
	int field5361;
	@ObfuscatedName("ap")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -742723875
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2088297285
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1187250681
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1704371200
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1386194005
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -712960361
	)
	int field5358;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1156774785
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ai")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -40118725
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("am")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1482092357
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bs")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bf")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bo")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bi")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bt")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bn")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bw")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bl")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("be")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bg")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bu")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bh")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 232855837
	)
	int field5386;

	BZip2State() {
		this.field5353 = 4096;
		this.field5350 = 16;
		this.field5352 = 258;
		this.field5351 = 6;
		this.field5357 = 50;
		this.field5354 = 18002;
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
