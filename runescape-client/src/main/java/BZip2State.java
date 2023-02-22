import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ss")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("aj")
   final int field4935 = 4096;
   @ObfuscatedName("al")
   final int field4938 = 16;
   @ObfuscatedName("ac")
   final int field4911 = 258;
   @ObfuscatedName("ab")
   final int field4940 = 6;
   @ObfuscatedName("an")
   final int field4934 = 50;
   @ObfuscatedName("ao")
   final int field4914 = 18002;
   @ObfuscatedName("av")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -811441901
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -877546793
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("ar")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 290672311
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -158025889
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1748047551
   )
   int field4921;
   @ObfuscatedName("ay")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -2050824283
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -255173437
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 661581013
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 64398336
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1639419667
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -23106095
   )
   int field4928;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1890936445
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("ai")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 159429297
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("aa")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1848953013
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("bm")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("bv")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("bo")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("bs")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("bg")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("bh")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("bl")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("bk")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("br")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("ba")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("bz")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("bq")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -600141465
   )
   int field4946;

   BZip2State() {
   }
}
