import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("Animation")
public class Animation {
   @ObfuscatedName("a")
   static int[] field2381 = new int[500];
   @ObfuscatedName("f")
   static int[] field2379 = new int[500];
   @ObfuscatedName("c")
   static int[] field2377 = new int[500];
   @ObfuscatedName("x")
   static int[] field2378 = new int[500];
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lhv;"
   )
   @Export("skeleton")
   Skeleton skeleton = null;
   @ObfuscatedName("j")
   @Export("transformCount")
   int transformCount = -1;
   @ObfuscatedName("y")
   @Export("transformSkeletonLabels")
   int[] transformSkeletonLabels;
   @ObfuscatedName("d")
   @Export("transformXs")
   int[] transformXs;
   @ObfuscatedName("n")
   @Export("transformYs")
   int[] transformYs;
   @ObfuscatedName("r")
   @Export("transformZs")
   int[] transformZs;
   @ObfuscatedName("l")
   @Export("hasAlphaTransform")
   boolean hasAlphaTransform = false;

   @ObfuscatedSignature(
      descriptor = "([BLhv;)V"
   )
   Animation(byte[] var1, Skeleton var2) {
      this.skeleton = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var5 + var3.offset;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if (var9 > 0) {
            if (this.skeleton.transformTypes[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.skeleton.transformTypes[var10] == 0) {
                     field2381[var7] = var10;
                     field2379[var7] = 0;
                     field2377[var7] = 0;
                     field2378[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field2381[var7] = var8;
            short var11 = 0;
            if (this.skeleton.transformTypes[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field2379[var7] = var4.readShortSmart();
            } else {
               field2379[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field2377[var7] = var4.readShortSmart();
            } else {
               field2377[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field2378[var7] = var4.readShortSmart();
            } else {
               field2378[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.skeleton.transformTypes[var8] == 5) {
               this.hasAlphaTransform = true;
            }
         }
      }

      if (var1.length != var4.offset) {
         throw new RuntimeException();
      } else {
         this.transformCount = var7;
         this.transformSkeletonLabels = new int[var7];
         this.transformXs = new int[var7];
         this.transformYs = new int[var7];
         this.transformZs = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.transformSkeletonLabels[var8] = field2381[var8];
            this.transformXs[var8] = field2379[var8];
            this.transformYs[var8] = field2377[var8];
            this.transformZs[var8] = field2378[var8];
         }

      }
   }
}
