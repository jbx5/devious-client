import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("so")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("af")
   final int field5005 = 4096;
   @ObfuscatedName("an")
   final int field4999 = 16;
   @ObfuscatedName("aw")
   final int field5029 = 258;
   @ObfuscatedName("ac")
   final int field5000 = 6;
   @ObfuscatedName("au")
   final int field5002 = 50;
   @ObfuscatedName("ab")
   final int field4998 = 18002;
   @ObfuscatedName("aq")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1648560407
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1956977123
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("aa")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -642536903
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1452165841
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1259159999
   )
   int field5010;
   @ObfuscatedName("ai")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -845006579
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -993525011
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -208048185
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -850174976
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 463465659
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1540039981
   )
   int field5017;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -152862273
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("ak")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1752794807
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("ad")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1198613029
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("by")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("bb")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("bi")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("be")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("bk")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("bx")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("bo")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("bz")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("bm")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("bd")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("bt")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("bj")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 311916497
   )
   int field5035;

   BZip2State() {
   }
}
