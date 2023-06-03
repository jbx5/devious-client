import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ta")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("at")
   final int field5058 = 4096;
   @ObfuscatedName("an")
   final int field5027 = 16;
   @ObfuscatedName("av")
   final int field5028 = 258;
   @ObfuscatedName("as")
   final int field5029 = 6;
   @ObfuscatedName("ax")
   final int field5057 = 50;
   @ObfuscatedName("ap")
   final int field5031 = 18002;
   @ObfuscatedName("ab")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1904713285
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -757246445
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("af")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2072347971
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 386315705
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1794913673
   )
   int field5060;
   @ObfuscatedName("ad")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1641416731
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1202899389
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1915000559
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1893250048
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1671701129
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 563051131
   )
   int field5045;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -830789181
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("aq")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -217680743
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("ay")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1414409225
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("bs")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("bc")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("bj")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("bo")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("bq")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("bg")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("bf")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("bd")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("ba")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("bn")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("bb")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("bx")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1266130793
   )
   int field5063;

   BZip2State() {
   }
}
