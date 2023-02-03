import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("f")
   final int field4948 = 4096;
   @ObfuscatedName("w")
   final int field4946 = 16;
   @ObfuscatedName("v")
   final int field4947 = 258;
   @ObfuscatedName("s")
   final int field4976 = 6;
   @ObfuscatedName("z")
   final int field4949 = 50;
   @ObfuscatedName("j")
   final int field4967 = 18002;
   @ObfuscatedName("i")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1271568777
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -175638631
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("k")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1979788995
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1615110047
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1445321817
   )
   int field4957;
   @ObfuscatedName("m")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -562478711
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 520529197
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1266025893
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1685214208
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 301132855
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1436423459
   )
   int field4964;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1684073131
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("q")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 310629595
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("e")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 941465473
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("af")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("aa")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("ai")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("ag")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("aw")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("ar")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("al")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("at")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("aj")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("ax")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("az")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("ap")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1984167077
   )
   int field4982;

   BZip2State() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lln;III)Lrs;",
      garbageValue = "-126642203"
   )
   @Export("SpriteBuffer_getSprite")
   public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
      if (!Buffer.method8892(var0, var1, var2)) {
         return null;
      } else {
         SpritePixels var4 = new SpritePixels();
         var4.width = class488.SpriteBuffer_spriteWidth;
         var4.height = class488.SpriteBuffer_spriteHeight;
         var4.xOffset = class488.SpriteBuffer_xOffsets[0];
         var4.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[0];
         var4.subWidth = FriendsList.SpriteBuffer_spriteWidths[0];
         var4.subHeight = class132.SpriteBuffer_spriteHeights[0];
         int var5 = var4.subWidth * var4.subHeight;
         byte[] var6 = class140.SpriteBuffer_pixels[0];
         var4.pixels = new int[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.pixels[var7] = class100.SpriteBuffer_spritePalette[var6[var7] & 255];
         }

         class100.method2724();
         return var4;
      }
   }
}
