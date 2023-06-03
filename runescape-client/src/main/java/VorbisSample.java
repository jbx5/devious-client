import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("VorbisSample")
public class VorbisSample extends Node {
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lcd;"
   )
   static class60 field374 = new class60();
   @ObfuscatedName("ak")
   static int field386;
   @ObfuscatedName("ae")
   static int field394;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lcs;"
   )
   static VorbisCodebook[] field383;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[Lbw;"
   )
   static VorbisFloor[] field384;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "[Lbm;"
   )
   static VorbisResidue[] field385;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lbt;"
   )
   static VorbisMapping[] field404;
   @ObfuscatedName("ad")
   static boolean[] field387;
   @ObfuscatedName("ac")
   static int[] field388;
   @ObfuscatedName("ag")
   static boolean field389 = false;
   @ObfuscatedName("aq")
   static float[] field395;
   @ObfuscatedName("aw")
   static float[] field396;
   @ObfuscatedName("ay")
   static float[] field397;
   @ObfuscatedName("al")
   static float[] field398;
   @ObfuscatedName("am")
   static float[] field390;
   @ObfuscatedName("bs")
   static float[] field401;
   @ObfuscatedName("bc")
   static int[] field381;
   @ObfuscatedName("bj")
   static int[] field402;
   @ObfuscatedName("at")
   byte[][] field375;
   @ObfuscatedName("an")
   @Export("sampleRate")
   int sampleRate;
   @ObfuscatedName("av")
   @Export("sampleCount")
   int sampleCount;
   @ObfuscatedName("as")
   @Export("start")
   int start;
   @ObfuscatedName("ax")
   @Export("end")
   int end;
   @ObfuscatedName("ap")
   boolean field379;
   @ObfuscatedName("ar")
   float[] field393;
   @ObfuscatedName("ah")
   int field391;
   @ObfuscatedName("az")
   int field380;
   @ObfuscatedName("au")
   boolean field376;
   @ObfuscatedName("ai")
   float[] field400;
   @ObfuscatedName("bo")
   @Export("samples")
   byte[] samples;
   @ObfuscatedName("bq")
   int field382;
   @ObfuscatedName("bg")
   int field405;

   VorbisSample(byte[] var1) {
      this.read(var1);
   }

   @ObfuscatedName("an")
   @Export("read")
   void read(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.sampleRate = var2.readInt();
      this.sampleCount = var2.readInt();
      this.start = var2.readInt();
      this.end = var2.readInt();
      if (this.end < 0) {
         this.end = ~this.end;
         this.field379 = true;
      }

      int var3 = var2.readInt();
      this.field375 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5);
         this.field375[var4] = var7;
      }

   }

   @ObfuscatedName("as")
   float[] method1056(int var1) {
      class60 var2 = new class60();
      var2.method1136(this.field375[var1], 0);
      this.field400 = new float[field394];
      var2.method1117();
      int var3 = var2.readBits(Tile.iLog(field388.length - 1));
      boolean var4 = field387[var3];
      int var5 = var4 ? field394 : field386;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.method1117() != 0;
         var7 = var2.method1117() != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (field386 >> 2);
         var10 = (field386 >> 2) + (var5 >> 2);
         var11 = field386 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field386 >> 2);
         var13 = (field386 >> 2) + (var5 - (var5 >> 2));
         var14 = field386 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field404[field388[var3]];
      int var16 = var15.field357;
      int var17 = var15.field358[var16];
      class59 var18 = field384[var17].method734(var2);
      boolean var19 = !var18.method1110();

      int var20;
      for(var20 = 0; var20 < var15.field356; ++var20) {
         VorbisResidue var45 = field385[var15.field359[var20]];
         float[] var47 = this.field400;
         var45.method840(var47, var5 >> 1, var19, var2);
      }

      if (var18.method1110()) {
         var16 = var15.field357;
         int var10000 = var15.field358[var16];
         var18.method1112(this.field400, var5 >> 1);
      }

      int var21;
      int var22;
      if (!var18.method1110()) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.field400[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var21 = var5 >> 2;
         var22 = var5 >> 3;
         float[] var23 = this.field400;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var43 = var4 ? field398 : field395;
         float[] var25 = var4 ? field390 : field396;
         float[] var26 = var4 ? field401 : field397;
         int[] var27 = var4 ? field402 : field381;

         int var28;
         float var29;
         float var30;
         float var31;
         float var32;
         for(var28 = 0; var28 < var21; ++var28) {
            var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
            var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            var31 = var43[var28 * 2];
            var32 = var43[var28 * 2 + 1];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
         }

         float var33;
         float var34;
         for(var28 = 0; var28 < var22; ++var28) {
            var29 = var23[var20 + var28 * 4 + 3];
            var30 = var23[var20 + var28 * 4 + 1];
            var31 = var23[var28 * 4 + 3];
            var32 = var23[var28 * 4 + 1];
            var23[var20 + var28 * 4 + 3] = var29 + var31;
            var23[var20 + var28 * 4 + 1] = var30 + var32;
            var33 = var43[var20 - 4 - var28 * 4];
            var34 = var43[var20 - 3 - var28 * 4];
            var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
            var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
         }

         var28 = Tile.iLog(var5 - 1);

         int var48;
         int var49;
         int var50;
         int var51;
         for(var48 = 0; var48 < var28 - 3; ++var48) {
            var49 = var5 >> var48 + 2;
            var50 = 8 << var48;

            for(var51 = 0; var51 < 2 << var48; ++var51) {
               int var52 = var5 - var49 * var51 * 2;
               int var53 = var5 - var49 * (var51 * 2 + 1);

               for(int var35 = 0; var35 < var5 >> var48 + 4; ++var35) {
                  int var36 = var35 * 4;
                  float var37 = var23[var52 - 1 - var36];
                  float var38 = var23[var52 - 3 - var36];
                  float var39 = var23[var53 - 1 - var36];
                  float var40 = var23[var53 - 3 - var36];
                  var23[var52 - 1 - var36] = var37 + var39;
                  var23[var52 - 3 - var36] = var38 + var40;
                  float var41 = var43[var35 * var50];
                  float var42 = var43[var35 * var50 + 1];
                  var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for(var48 = 1; var48 < var22 - 1; ++var48) {
            var49 = var27[var48];
            if (var48 < var49) {
               var50 = var48 * 8;
               var51 = var49 * 8;
               var33 = var23[var50 + 1];
               var23[var50 + 1] = var23[var51 + 1];
               var23[var51 + 1] = var33;
               var33 = var23[var50 + 3];
               var23[var50 + 3] = var23[var51 + 3];
               var23[var51 + 3] = var33;
               var33 = var23[var50 + 5];
               var23[var50 + 5] = var23[var51 + 5];
               var23[var51 + 5] = var33;
               var33 = var23[var50 + 7];
               var23[var50 + 7] = var23[var51 + 7];
               var23[var51 + 7] = var33;
            }
         }

         for(var48 = 0; var48 < var20; ++var48) {
            var23[var48] = var23[var48 * 2 + 1];
         }

         for(var48 = 0; var48 < var22; ++var48) {
            var23[var5 - 1 - var48 * 2] = var23[var48 * 4];
            var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1];
            var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2];
            var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3];
         }

         for(var48 = 0; var48 < var22; ++var48) {
            var30 = var26[var48 * 2];
            var31 = var26[var48 * 2 + 1];
            var32 = var23[var20 + var48 * 2];
            var33 = var23[var20 + var48 * 2 + 1];
            var34 = var23[var5 - 2 - var48 * 2];
            float var54 = var23[var5 - 1 - var48 * 2];
            float var55 = var31 * (var32 - var34) + var30 * (var33 + var54);
            var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F;
            var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F;
            var55 = var31 * (var33 + var54) - var30 * (var32 - var34);
            var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F;
            var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F;
         }

         for(var48 = 0; var48 < var21; ++var48) {
            var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1];
            var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2];
         }

         for(var48 = 0; var48 < var21; ++var48) {
            var23[var48 + (var5 - var21)] = -var23[var48];
         }

         for(var48 = 0; var48 < var21; ++var48) {
            var23[var48] = var23[var21 + var48];
         }

         for(var48 = 0; var48 < var21; ++var48) {
            var23[var21 + var48] = -var23[var21 - var48 - 1];
         }

         for(var48 = 0; var48 < var21; ++var48) {
            var23[var20 + var48] = var23[var5 - var48 - 1];
         }

         float[] var57;
         for(var48 = var9; var48 < var10; ++var48) {
            var30 = (float)Math.sin(((double)(var48 - var9) + 0.5) / (double)var11 * 0.5 * Math.PI);
            var57 = this.field400;
            var57[var48] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }

         for(var48 = var12; var48 < var13; ++var48) {
            var30 = (float)Math.sin(((double)(var48 - var12) + 0.5) / (double)var14 * 0.5 * Math.PI + 1.5707963267948966);
            var57 = this.field400;
            var57[var48] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.field391 > 0) {
         var21 = var5 + this.field391 >> 2;
         var44 = new float[var21];
         int var46;
         if (!this.field376) {
            for(var22 = 0; var22 < this.field380; ++var22) {
               var46 = var22 + (this.field391 >> 1);
               var44[var22] += this.field393[var46];
            }
         }

         if (var18.method1110()) {
            for(var22 = var9; var22 < var5 >> 1; ++var22) {
               var46 = var44.length - (var5 >> 1) + var22;
               var44[var46] += this.field400[var22];
            }
         }
      }

      float[] var56 = this.field393;
      this.field393 = this.field400;
      this.field400 = var56;
      this.field391 = var5;
      this.field380 = var13 - (var5 >> 1);
      this.field376 = !var18.method1110();
      return var44;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([I)Lbp;"
   )
   @Export("toRawSound")
   RawSound toRawSound(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.samples == null) {
            this.field391 = 0;
            this.field393 = new float[field394];
            this.samples = new byte[this.sampleCount];
            this.field382 = 0;
            this.field405 = 0;
         }

         for(; this.field405 < this.field375.length; ++this.field405) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1056(this.field405);
            if (var2 != null) {
               int var3 = this.field382;
               int var4 = var2.length;
               if (var4 > this.sampleCount - var3) {
                  var4 = this.sampleCount - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.samples[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field382;
               }

               this.field382 = var3;
            }
         }

         this.field393 = null;
         byte[] var7 = this.samples;
         this.samples = null;
         return new RawSound(this.sampleRate, var7, this.start, this.end, this.field379);
      }
   }

   @ObfuscatedName("at")
   @Export("float32Unpack")
   static float float32Unpack(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   @ObfuscatedName("av")
   static void method1055(byte[] var0) {
      class60 var1 = field374;
      var1.method1136(var0, 0);
      field386 = 1 << var1.readBits(4);
      field394 = 1 << var1.readBits(4);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? field394 : field386;
         var4 = var3 >> 1;
         var5 = var3 >> 2;
         var6 = var3 >> 3;
         float[] var19 = new float[var4];

         for(int var8 = 0; var8 < var5; ++var8) {
            var19[var8 * 2] = (float)Math.cos((double)(var8 * 4) * Math.PI / (double)var3);
            var19[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * Math.PI / (double)var3));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * Math.PI / (double)(var3 * 2));
            var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * Math.PI / (double)(var3 * 2));
         }

         float[] var21 = new float[var5];

         for(int var10 = 0; var10 < var6; ++var10) {
            var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * Math.PI / (double)var3);
            var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * Math.PI / (double)var3));
         }

         int[] var22 = new int[var6];
         int var11 = Tile.iLog(var6 - 1);

         for(int var12 = 0; var12 < var6; ++var12) {
            int var16 = var12;
            int var17 = var11;

            int var18;
            for(var18 = 0; var17 > 0; --var17) {
               var18 = var18 << 1 | var16 & 1;
               var16 >>>= 1;
            }

            var22[var12] = var18;
         }

         if (var2 != 0) {
            field398 = var19;
            field390 = var20;
            field401 = var21;
            field402 = var22;
         } else {
            field395 = var19;
            field396 = var20;
            field397 = var21;
            field381 = var22;
         }
      }

      var2 = var1.readBits(8) + 1;
      field383 = new VorbisCodebook[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field383[var3] = new VorbisCodebook();
      }

      var3 = var1.readBits(6) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.readBits(16);
      }

      var3 = var1.readBits(6) + 1;
      field384 = new VorbisFloor[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field384[var4] = new VorbisFloor();
      }

      var4 = var1.readBits(6) + 1;
      field385 = new VorbisResidue[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field385[var5] = new VorbisResidue();
      }

      var5 = var1.readBits(6) + 1;
      field404 = new VorbisMapping[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         field404[var6] = new VorbisMapping();
      }

      var6 = var1.readBits(6) + 1;
      field387 = new boolean[var6];
      field388 = new int[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field387[var7] = var1.method1117() != 0;
         var1.readBits(16);
         var1.readBits(16);
         field388[var7] = var1.readBits(8);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lnq;)Z"
   )
   static boolean method1057(AbstractArchive var0) {
      if (!field389) {
         byte[] var1 = var0.takeFile(0, 0);
         if (var1 == null) {
            return false;
         }

         method1055(var1);
         field389 = true;
      }

      return true;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lnq;II)Lca;"
   )
   @Export("readMusicSample")
   static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
      if (!method1057(var0)) {
         var0.tryLoadFile(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.takeFile(var1, var2);
         return var3 == null ? null : new VorbisSample(var3);
      }
   }
}
