import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ud")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("al")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("am")
	final int field5218;
	@ObfuscatedName("ap")
	final int field5185;
	@ObfuscatedName("af")
	final int field5197;
	@ObfuscatedName("aj")
	final int field5188;
	@ObfuscatedName("aq")
	final int field5203;
	@ObfuscatedName("ar")
	final int field5190;
	@ObfuscatedName("ag")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1952955283
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2107074621
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("aa")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -648543579
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1287451473
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1431736583
	)
	int field5212;
	@ObfuscatedName("ax")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 661025435
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -74535437
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1454874677
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -759256064
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 156306735
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1350394861
	)
	int field5204;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1153542401
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ah")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1858532035
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ac")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1769960875
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bj")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bd")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bg")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bt")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("br")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ba")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bk")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bn")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("by")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bc")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bx")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bf")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1257596717
	)
	int field5223;

	BZip2State() {
		this.field5218 = 4096;
		this.field5185 = 16;
		this.field5197 = 258;
		this.field5188 = 6;
		this.field5203 = 50;
		this.field5190 = 18002;
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
