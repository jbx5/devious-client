import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("AudioFilter")
public class AudioFilter {
   @ObfuscatedName("q")
   static float[][] field445 = new float[2][8];
   @ObfuscatedName("f")
   @Export("coefficients")
   static int[][] coefficients = new int[2][8];
   @ObfuscatedName("r")
   static float field448;
   @ObfuscatedName("u")
   @Export("forwardMultiplier")
   static int forwardMultiplier;
   @ObfuscatedName("h")
   @Export("pairs")
   int[] pairs = new int[2];
   @ObfuscatedName("v")
   int[][][] field451 = new int[2][2][4];
   @ObfuscatedName("x")
   int[][][] field443 = new int[2][2][4];
   @ObfuscatedName("m")
   int[] field444 = new int[2];

   AudioFilter() {
   }

   @ObfuscatedName("h")
   float method1140(int var1, int var2, float var3) {
      float var4 = (float)this.field443[var1][0][var2] + var3 * (float)(this.field443[var1][1][var2] - this.field443[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   @ObfuscatedName("v")
   float method1145(int var1, int var2, float var3) {
      float var4 = (float)this.field451[var1][0][var2] + var3 * (float)(this.field451[var1][1][var2] - this.field451[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return normalize(var4);
   }

   @ObfuscatedName("x")
   @Export("compute")
   int compute(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field444[0] + (float)(this.field444[1] - this.field444[0]) * var2;
         var3 *= 0.0030517578F;
         field448 = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         forwardMultiplier = (int)(field448 * 65536.0F);
      }

      if (this.pairs[var1] == 0) {
         return 0;
      } else {
         var3 = this.method1140(var1, 0, var2);
         field445[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1145(var1, 0, var2));
         field445[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.pairs[var1]; ++var4) {
            var3 = this.method1140(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1145(var1, var4, var2));
            float var6 = var3 * var3;
            field445[var1][var4 * 2 + 1] = field445[var1][var4 * 2 - 1] * var6;
            field445[var1][var4 * 2] = field445[var1][var4 * 2 - 1] * var5 + field445[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = field445[var1];
               var10000[var7] += field445[var1][var7 - 1] * var5 + field445[var1][var7 - 2] * var6;
            }

            var10000 = field445[var1];
            var10000[1] += field445[var1][0] * var5 + var6;
            var10000 = field445[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
               var10000 = field445[0];
               var10000[var4] *= field448;
            }
         }

         for(var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
            coefficients[var1][var4] = (int)(field445[var1][var4] * 65536.0F);
         }

         return this.pairs[var1] * 2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lah;)V"
   )
   final void method1144(Buffer var1, SoundEnvelope var2) {
      int var3 = var1.readUnsignedByte();
      this.pairs[0] = var3 >> 4;
      this.pairs[1] = var3 & 15;
      if (var3 != 0) {
         this.field444[0] = var1.readUnsignedShort();
         this.field444[1] = var1.readUnsignedShort();
         int var7 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.pairs[var5]; ++var6) {
               this.field451[var5][0][var6] = var1.readUnsignedShort();
               this.field443[var5][0][var6] = var1.readUnsignedShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.pairs[var5]; ++var6) {
               if ((var7 & 1 << var5 * 4 << var6) != 0) {
                  this.field451[var5][1][var6] = var1.readUnsignedShort();
                  this.field443[var5][1][var6] = var1.readUnsignedShort();
               } else {
                  this.field451[var5][1][var6] = this.field451[var5][0][var6];
                  this.field443[var5][1][var6] = this.field443[var5][0][var6];
               }
            }
         }

         if (var7 != 0 || this.field444[1] != this.field444[0]) {
            var2.decodeSegments(var1);
         }
      } else {
         int[] var4 = this.field444;
         this.field444[1] = 0;
         var4[0] = 0;
      }

   }

   @ObfuscatedName("e")
   @Export("normalize")
   static float normalize(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
