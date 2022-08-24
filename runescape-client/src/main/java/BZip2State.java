import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qq")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("s")
	final int field4747 = 4096;

	@ObfuscatedName("h")
	final int field4712 = 16;

	@ObfuscatedName("w")
	final int field4720 = 258;

	@ObfuscatedName("v")
	final int field4713 = 6;

	@ObfuscatedName("c")
	final int field4714 = 50;

	@ObfuscatedName("q")
	final int field4729 = 18002;

	@ObfuscatedName("i")
	@Export("inputArray")
	byte[] inputArray;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1136892385)
	@Export("nextByte")
	int nextByte = 0;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1557797669)
	@Export("nextBit_unused")
	int nextBit_unused;

	@ObfuscatedName("n")
	@Export("outputArray")
	byte[] outputArray;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 82328733)
	@Export("next_out")
	int next_out = 0;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -990545499)
	@Export("outputLength")
	int outputLength;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -258517701)
	int field4722;

	@ObfuscatedName("u")
	@Export("out_char")
	byte out_char;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 440338361)
	@Export("su_rNToGo")
	int su_rNToGo;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -54042767)
	@Export("bsBuff")
	int bsBuff;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -583561549)
	@Export("bsLive")
	int bsLive;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 506657792)
	@Export("blockSize100k")
	int blockSize100k;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1966700557)
	@Export("originalPointer")
	int originalPointer;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 2056731845)
	int field4710;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -1678636317)
	@Export("su_ch2")
	int su_ch2;

	@ObfuscatedName("x")
	@Export("unzftab")
	int[] unzftab = new int[256];

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1297480759)
	@Export("nblocks_used")
	int nblocks_used;

	@ObfuscatedName("t")
	@Export("cftab")
	int[] cftab = new int[257];

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -751030927)
	@Export("nInUse")
	int nInUse;

	@ObfuscatedName("ar")
	@Export("inUse")
	boolean[] inUse = new boolean[256];

	@ObfuscatedName("aq")
	@Export("inUse16")
	boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("av")
	@Export("seqToUnseq")
	byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("aj")
	@Export("ll8")
	byte[] ll8 = new byte[4096];

	@ObfuscatedName("ax")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy = new int[16];

	@ObfuscatedName("ab")
	@Export("selector")
	byte[] selector = new byte[18002];

	@ObfuscatedName("ak")
	@Export("selectorMtf")
	byte[] selectorMtf = new byte[18002];

	@ObfuscatedName("au")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d = new byte[6][258];

	@ObfuscatedName("ae")
	@Export("limit")
	int[][] limit = new int[6][258];

	@ObfuscatedName("as")
	@Export("base")
	int[][] base = new int[6][258];

	@ObfuscatedName("ay")
	@Export("perm")
	int[][] perm = new int[6][258];

	@ObfuscatedName("ag")
	@Export("minLens")
	int[] minLens = new int[6];

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -1455022529)
	int field4711;

	BZip2State() {
	}
}