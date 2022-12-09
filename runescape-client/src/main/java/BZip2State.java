import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rf")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("z")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("h")
   final int field4954 = 4096;
   @ObfuscatedName("e")
   final int field4925 = 16;
   @ObfuscatedName("v")
   final int field4923 = 258;
   @ObfuscatedName("x")
   final int field4949 = 6;
   @ObfuscatedName("m")
   final int field4924 = 50;
   @ObfuscatedName("q")
   final int field4926 = 18002;
   @ObfuscatedName("f")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1821114693
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1658409903
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("b")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1295462847
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1101177005
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -825545807
   )
   int field4936;
   @ObfuscatedName("o")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -57104711
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1388160973
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -2006172181
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 571376640
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1238646899
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 935146643
   )
   int field4940;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -633335589
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("p")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -287672173
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("y")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -50977887
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("as")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("ad")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("ao")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("am")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("av")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("au")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("ar")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("at")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("ay")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("an")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("ab")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("al")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -290046001
   )
   int field4959;

   BZip2State() {
   }
}
