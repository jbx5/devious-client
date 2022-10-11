import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Model")
public class Model extends Renderable {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   @Export("Model_sharedSequenceModel")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("f")
   @Export("Model_sharedSequenceModelFaceAlphas")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   @Export("Model_sharedSpotAnimationModel")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("x")
   @Export("Model_sharedSpotAnimationModelFaceAlphas")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   static class407 field2592 = new class407();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   static class407 field2593 = new class407();
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   static class407 field2594 = new class407();
   @ObfuscatedName("ai")
   static boolean[] field2632 = new boolean[6500];
   @ObfuscatedName("au")
   static boolean[] field2633 = new boolean[6500];
   @ObfuscatedName("aw")
   @Export("modelViewportXs")
   static int[] modelViewportXs = new int[6500];
   @ObfuscatedName("at")
   @Export("modelViewportYs")
   static int[] modelViewportYs = new int[6500];
   @ObfuscatedName("ar")
   static int[] field2620 = new int[6500];
   @ObfuscatedName("ay")
   static int[] field2615 = new int[6500];
   @ObfuscatedName("ax")
   static int[] field2638 = new int[6500];
   @ObfuscatedName("aa")
   static int[] field2639 = new int[6500];
   @ObfuscatedName("bh")
   static char[] field2641 = new char[6000];
   @ObfuscatedName("bm")
   static char[][] field2642 = new char[6000][512];
   @ObfuscatedName("bp")
   static int[] field2643 = new int[12];
   @ObfuscatedName("bl")
   static int[][] field2644 = new int[12][2000];
   @ObfuscatedName("bo")
   static int[] field2645 = new int[2000];
   @ObfuscatedName("bg")
   static int[] field2612 = new int[2000];
   @ObfuscatedName("bd")
   static int[] field2630 = new int[12];
   @ObfuscatedName("bq")
   static int[] field2648 = new int[10];
   @ObfuscatedName("bk")
   static int[] field2598 = new int[10];
   @ObfuscatedName("bc")
   static int[] field2650 = new int[10];
   @ObfuscatedName("bv")
   @Export("Model_transformTempX")
   static int Model_transformTempX;
   @ObfuscatedName("bt")
   @Export("Model_transformTempY")
   static int Model_transformTempY;
   @ObfuscatedName("ba")
   @Export("Model_transformTempZ")
   static int Model_transformTempZ;
   @ObfuscatedName("br")
   static boolean field2654 = true;
   @ObfuscatedName("bb")
   static int[] field2657;
   @ObfuscatedName("bu")
   static int[] field2658;
   @ObfuscatedName("bj")
   static int[] field2663;
   @ObfuscatedName("bw")
   static int[] field2611;
   @ObfuscatedName("d")
   @Export("verticesCount")
   int verticesCount = 0;
   @ObfuscatedName("n")
   @Export("verticesX")
   int[] verticesX;
   @ObfuscatedName("r")
   @Export("verticesY")
   int[] verticesY;
   @ObfuscatedName("l")
   @Export("verticesZ")
   int[] verticesZ;
   @ObfuscatedName("s")
   @Export("indicesCount")
   public int indicesCount = 0;
   @ObfuscatedName("p")
   @Export("indices1")
   int[] indices1;
   @ObfuscatedName("b")
   @Export("indices2")
   int[] indices2;
   @ObfuscatedName("o")
   @Export("indices3")
   int[] indices3;
   @ObfuscatedName("u")
   @Export("faceColors1")
   int[] faceColors1;
   @ObfuscatedName("z")
   @Export("faceColors2")
   int[] faceColors2;
   @ObfuscatedName("t")
   @Export("faceColors3")
   int[] faceColors3;
   @ObfuscatedName("w")
   @Export("faceRenderPriorities")
   byte[] faceRenderPriorities;
   @ObfuscatedName("m")
   @Export("faceAlphas")
   byte[] faceAlphas;
   @ObfuscatedName("q")
   byte[] field2608;
   @ObfuscatedName("i")
   @Export("faceTextures")
   short[] faceTextures;
   @ObfuscatedName("e")
   byte field2588 = 0;
   @ObfuscatedName("g")
   int field2637 = 0;
   @ObfuscatedName("k")
   int[] field2646;
   @ObfuscatedName("v")
   int[] field2613;
   @ObfuscatedName("aj")
   int[] field2614;
   @ObfuscatedName("an")
   @Export("vertexLabels")
   int[][] vertexLabels;
   @ObfuscatedName("ah")
   @Export("faceLabelsAlpha")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("ao")
   int[][] field2624;
   @ObfuscatedName("ac")
   int[][] field2618;
   @ObfuscatedName("af")
   @Export("isSingleTile")
   public boolean isSingleTile = false;
   @ObfuscatedName("ad")
   @Export("boundsType")
   int boundsType;
   @ObfuscatedName("av")
   @Export("bottomY")
   int bottomY;
   @ObfuscatedName("ak")
   @Export("xzRadius")
   int xzRadius;
   @ObfuscatedName("ae")
   @Export("diameter")
   int diameter;
   @ObfuscatedName("ap")
   @Export("radius")
   int radius;
   @ObfuscatedName("as")
   @Export("xMid")
   int xMid;
   @ObfuscatedName("aq")
   @Export("yMid")
   int yMid;
   @ObfuscatedName("al")
   @Export("zMid")
   int zMid;
   @ObfuscatedName("ag")
   @Export("xMidOffset")
   int xMidOffset = -1;
   @ObfuscatedName("am")
   @Export("yMidOffset")
   int yMidOffset = -1;
   @ObfuscatedName("az")
   @Export("zMidOffset")
   int zMidOffset = -1;
   @ObfuscatedName("bz")
   @Export("overrideHue")
   public byte overrideHue;
   @ObfuscatedName("bi")
   @Export("overrideSaturation")
   public byte overrideSaturation;
   @ObfuscatedName("bs")
   @Export("overrideLuminance")
   public byte overrideLuminance;
   @ObfuscatedName("cd")
   @Export("overrideAmount")
   public byte overrideAmount;
   @ObfuscatedName("cg")
   public short field2667;

   static {
      field2657 = Rasterizer3D.Rasterizer3D_sine;
      field2658 = Rasterizer3D.Rasterizer3D_cosine;
      field2663 = Rasterizer3D.Rasterizer3D_colorPalette;
      field2611 = Rasterizer3D.field2423;
   }

   Model() {
   }

   @ObfuscatedSignature(
      descriptor = "([Lha;I)V"
   )
   public Model(Model[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2637 = 0;
      this.field2588 = -1;

      int var7;
      Model var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.verticesCount += var8.verticesCount;
            this.indicesCount += var8.indicesCount;
            this.field2637 += var8.field2637;
            if (var8.faceRenderPriorities != null) {
               var3 = true;
            } else {
               if (this.field2588 == -1) {
                  this.field2588 = var8.field2588;
               }

               if (this.field2588 != var8.field2588) {
                  var3 = true;
               }
            }

            var4 |= var8.faceAlphas != null;
            var5 |= var8.faceTextures != null;
            var6 |= var8.field2608 != null;
         }
      }

      this.verticesX = new int[this.verticesCount];
      this.verticesY = new int[this.verticesCount];
      this.verticesZ = new int[this.verticesCount];
      this.indices1 = new int[this.indicesCount];
      this.indices2 = new int[this.indicesCount];
      this.indices3 = new int[this.indicesCount];
      this.faceColors1 = new int[this.indicesCount];
      this.faceColors2 = new int[this.indicesCount];
      this.faceColors3 = new int[this.indicesCount];
      if (var3) {
         this.faceRenderPriorities = new byte[this.indicesCount];
      }

      if (var4) {
         this.faceAlphas = new byte[this.indicesCount];
      }

      if (var5) {
         this.faceTextures = new short[this.indicesCount];
      }

      if (var6) {
         this.field2608 = new byte[this.indicesCount];
      }

      if (this.field2637 > 0) {
         this.field2646 = new int[this.field2637];
         this.field2613 = new int[this.field2637];
         this.field2614 = new int[this.field2637];
      }

      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2637 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.indicesCount; ++var9) {
               this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9];
               this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9];
               this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9];
               this.faceColors1[this.indicesCount] = var8.faceColors1[var9];
               this.faceColors2[this.indicesCount] = var8.faceColors2[var9];
               this.faceColors3[this.indicesCount] = var8.faceColors3[var9];
               if (var3) {
                  if (var8.faceRenderPriorities != null) {
                     this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
                  } else {
                     this.faceRenderPriorities[this.indicesCount] = var8.field2588;
                  }
               }

               if (var4 && var8.faceAlphas != null) {
                  this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
               }

               if (var5) {
                  if (var8.faceTextures != null) {
                     this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
                  } else {
                     this.faceTextures[this.indicesCount] = -1;
                  }
               }

               if (var6) {
                  if (var8.field2608 != null && var8.field2608[var9] != -1) {
                     this.field2608[this.indicesCount] = (byte)(this.field2637 + var8.field2608[var9]);
                  } else {
                     this.field2608[this.indicesCount] = -1;
                  }
               }

               ++this.indicesCount;
            }

            for(var9 = 0; var9 < var8.field2637; ++var9) {
               this.field2646[this.field2637] = this.verticesCount + var8.field2646[var9];
               this.field2613[this.field2637] = this.verticesCount + var8.field2613[var9];
               this.field2614[this.field2637] = this.verticesCount + var8.field2614[var9];
               ++this.field2637;
            }

            for(var9 = 0; var9 < var8.verticesCount; ++var9) {
               this.verticesX[this.verticesCount] = var8.verticesX[var9];
               this.verticesY[this.verticesCount] = var8.verticesY[var9];
               this.verticesZ[this.verticesCount] = var8.verticesZ[var9];
               ++this.verticesCount;
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Lha;"
   )
   @Export("contourGround")
   public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.calculateBoundsCylinder();
      int var7 = var2 - this.xzRadius;
      int var8 = var2 + this.xzRadius;
      int var9 = var4 - this.xzRadius;
      int var10 = var4 + this.xzRadius;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model();
               var11.verticesCount = this.verticesCount;
               var11.indicesCount = this.indicesCount;
               var11.field2637 = this.field2637;
               var11.verticesX = this.verticesX;
               var11.verticesZ = this.verticesZ;
               var11.indices1 = this.indices1;
               var11.indices2 = this.indices2;
               var11.indices3 = this.indices3;
               var11.faceColors1 = this.faceColors1;
               var11.faceColors2 = this.faceColors2;
               var11.faceColors3 = this.faceColors3;
               var11.faceRenderPriorities = this.faceRenderPriorities;
               var11.faceAlphas = this.faceAlphas;
               var11.field2608 = this.field2608;
               var11.faceTextures = this.faceTextures;
               var11.field2588 = this.field2588;
               var11.field2646 = this.field2646;
               var11.field2613 = this.field2613;
               var11.field2614 = this.field2614;
               var11.vertexLabels = this.vertexLabels;
               var11.faceLabelsAlpha = this.faceLabelsAlpha;
               var11.isSingleTile = this.isSingleTile;
               var11.verticesY = new int[var11.verticesCount];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = var2 + this.verticesX[var12];
                  var14 = var4 + this.verticesZ[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = (-this.verticesY[var12] << 16) / super.height;
                  if (var13 < var6) {
                     var14 = var2 + this.verticesX[var12];
                     var15 = var4 + this.verticesZ[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
                  }
               }
            }

            var11.resetBounds();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Z)Lha;"
   )
   @Export("toSharedSequenceModel")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Z)Lha;"
   )
   @Export("toSharedSpotAnimationModel")
   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ZLha;[B)Lha;"
   )
   @Export("buildSharedModel")
   Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.field2637 = this.field2637;
      if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
         var2.verticesX = new int[this.verticesCount + 100];
         var2.verticesY = new int[this.verticesCount + 100];
         var2.verticesZ = new int[this.verticesCount + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.verticesCount; ++var4) {
         var2.verticesX[var4] = this.verticesX[var4];
         var2.verticesY[var4] = this.verticesY[var4];
         var2.verticesZ[var4] = this.verticesZ[var4];
      }

      if (var1) {
         var2.faceAlphas = this.faceAlphas;
      } else {
         var2.faceAlphas = var3;
         if (this.faceAlphas == null) {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.faceAlphas[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.faceAlphas[var4] = this.faceAlphas[var4];
            }
         }
      }

      var2.indices1 = this.indices1;
      var2.indices2 = this.indices2;
      var2.indices3 = this.indices3;
      var2.faceColors1 = this.faceColors1;
      var2.faceColors2 = this.faceColors2;
      var2.faceColors3 = this.faceColors3;
      var2.faceRenderPriorities = this.faceRenderPriorities;
      var2.field2608 = this.field2608;
      var2.faceTextures = this.faceTextures;
      var2.field2588 = this.field2588;
      var2.field2646 = this.field2646;
      var2.field2613 = this.field2613;
      var2.field2614 = this.field2614;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field2624 = this.field2624;
      var2.field2618 = this.field2618;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.overrideAmount = 0;
      return var2;
   }

   @ObfuscatedName("j")
   @Export("calculateBoundingBox")
   void calculateBoundingBox(int var1) {
      if (this.xMidOffset == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2658[var1];
         int var9 = field2657[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = Rasterizer3D.method4190(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = Rasterizer3D.method4170(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         this.xMid = (var5 + var2) / 2;
         this.yMid = (var6 + var3) / 2;
         this.zMid = (var7 + var4) / 2;
         this.xMidOffset = (var5 - var2 + 1) / 2;
         this.yMidOffset = (var6 - var3 + 1) / 2;
         this.zMidOffset = (var7 - var4 + 1) / 2;
         boolean var14 = true;
         if (this.xMidOffset < 32) {
            this.xMidOffset = 32;
         }

         if (this.zMidOffset < 32) {
            this.zMidOffset = 32;
         }

         if (this.isSingleTile) {
            boolean var15 = true;
            this.xMidOffset += 8;
            this.zMidOffset += 8;
         }

      }
   }

   @ObfuscatedName("n")
   @Export("calculateBoundsCylinder")
   public void calculateBoundsCylinder() {
      if (this.boundsType != 1) {
         this.boundsType = 1;
         super.height = 0;
         this.bottomY = 0;
         this.xzRadius = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            if (-var3 > super.height) {
               super.height = -var3;
            }

            if (var3 > this.bottomY) {
               this.bottomY = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.xzRadius) {
               this.xzRadius = var5;
            }
         }

         this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99);
         this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99);
         this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99);
      }
   }

   @ObfuscatedName("r")
   void method4509() {
      if (this.boundsType != 2) {
         this.boundsType = 2;
         this.xzRadius = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.xzRadius) {
               this.xzRadius = var5;
            }
         }

         this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99);
         this.radius = this.xzRadius;
         this.diameter = this.xzRadius + this.xzRadius;
      }
   }

   @ObfuscatedName("l")
   public int method4510() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   @ObfuscatedName("s")
   @Export("resetBounds")
   public void resetBounds() {
      this.boundsType = 0;
      this.xMidOffset = -1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Lhj;I)V"
   )
   @Export("animate")
   public void animate(Frames var1, int var2) {
      if (this.vertexLabels != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;

            for(int var5 = 0; var5 < var3.transformCount; ++var5) {
               int var6 = var3.transformSkeletonLabels[var5];
               this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
            }

            this.resetBounds();
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ldh;I)V"
   )
   public void method4573(class129 var1, int var2) {
      Skeleton var3 = var1.field1541;
      class211 var4 = var3.method4263();
      if (var4 != null) {
         var3.method4263().method4241(var1, var2);
         this.method4585(var3.method4263(), var1.method2923());
      }

      if (var1.method2928()) {
         this.method4514(var1, var2);
      }

      this.resetBounds();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ldh;I)V"
   )
   void method4514(class129 var1, int var2) {
      Skeleton var3 = var1.field1541;

      for(int var4 = 0; var4 < var3.count; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.field1539 != null && var1.field1539[var4] != null && var1.field1539[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            class124 var6 = var1.field1539[var4][0];
            int[] var7 = var3.labels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2885(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.faceAlphas[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lhh;I)V"
   )
   void method4585(class211 var1, int var2) {
      this.method4534(var1, var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lhj;ILhj;I[I)V"
   )
   @Export("animate2")
   public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.transformCount; ++var11) {
               for(var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
               }
            }

            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.transformCount; ++var11) {
               for(var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.transformTypes[var12] == 0) {
                  this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
               }
            }

            this.resetBounds();
         } else {
            this.animate(var1, var2);
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Lhv;Ldh;I[ZZZ)V"
   )
   public void method4571(Skeleton var1, class129 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class211 var7 = var1.method4263();
      if (var7 != null) {
         var7.method4242(var2, var3, var4, var5);
         if (var6) {
            this.method4585(var7, var2.method2923());
         }
      }

      if (!var5 && var2.method2928()) {
         this.method4514(var2, var3);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lhj;I[IZ)V"
   )
   public void method4518(Frames var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for(int var9 = 0; var9 < var5.transformCount; ++var9) {
            int var10;
            for(var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
            }
         }

      }
   }

   @ObfuscatedName("m")
   @Export("transform")
   void transform(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.vertexLabels.length) {
               int[] var19 = this.vertexLabels[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  Model_transformTempX += this.verticesX[var12];
                  Model_transformTempY += this.verticesY[var12];
                  Model_transformTempZ += this.verticesZ[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            Model_transformTempX = var3 + Model_transformTempX / var7;
            Model_transformTempY = var4 + Model_transformTempY / var7;
            Model_transformTempZ = var5 + Model_transformTempZ / var7;
         } else {
            Model_transformTempX = var3;
            Model_transformTempY = var4;
            Model_transformTempZ = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] += var3;
                     var10000 = this.verticesY;
                     var10000[var11] += var4;
                     var10000 = this.verticesZ;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] -= Model_transformTempX;
                     var10000 = this.verticesY;
                     var10000[var11] -= Model_transformTempY;
                     var10000 = this.verticesZ;
                     var10000[var11] -= Model_transformTempZ;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field2657[var14];
                        var16 = field2658[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2657[var12];
                        var16 = field2658[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2657[var13];
                        var16 = field2658[var13];
                        var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     var10000 = this.verticesX;
                     var10000[var11] += Model_transformTempX;
                     var10000 = this.verticesY;
                     var10000[var11] += Model_transformTempY;
                     var10000 = this.verticesZ;
                     var10000[var11] += Model_transformTempZ;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] -= Model_transformTempX;
                     var10000 = this.verticesY;
                     var10000[var11] -= Model_transformTempY;
                     var10000 = this.verticesZ;
                     var10000[var11] -= Model_transformTempZ;
                     this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
                     this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
                     this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
                     var10000 = this.verticesX;
                     var10000[var11] += Model_transformTempX;
                     var10000 = this.verticesY;
                     var10000[var11] += Model_transformTempY;
                     var10000 = this.verticesZ;
                     var10000[var11] += Model_transformTempZ;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.faceLabelsAlpha.length) {
                     var9 = this.faceLabelsAlpha[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.faceAlphas[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("q")
   @Export("rotateY90Ccw")
   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("i")
   @Export("rotateY180")
   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   @ObfuscatedName("e")
   @Export("rotateY270Ccw")
   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("g")
   @Export("rotateZ")
   public void rotateZ(int var1) {
      int var2 = field2657[var1];
      int var3 = field2658[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   @ObfuscatedName("k")
   @Export("offsetBy")
   public void offsetBy(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int[] var10000 = this.verticesX;
         var10000[var4] += var1;
         var10000 = this.verticesY;
         var10000[var4] += var2;
         var10000 = this.verticesZ;
         var10000[var4] += var3;
      }

      this.resetBounds();
   }

   @ObfuscatedName("v")
   @Export("scale")
   public void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.resetBounds();
   }

   @ObfuscatedName("aj")
   public final void method4590(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4509();
      }

      int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var10 = field2657[var1];
      int var11 = field2658[var1];
      int var12 = field2657[var2];
      int var13 = field2658[var2];
      int var14 = field2657[var3];
      int var15 = field2658[var3];
      int var16 = field2657[var4];
      int var17 = field2658[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.verticesCount; ++var19) {
         int var20 = this.verticesX[var19];
         int var21 = this.verticesY[var19];
         int var22 = this.verticesZ[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2620[var19] = var22 - var18;
         modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
         modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
         if (this.field2637 > 0) {
            field2615[var19] = var20;
            field2638[var19] = var23;
            field2639[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   @ObfuscatedName("an")
   public final void method4512(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4509();
      }

      int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var11 = field2657[var1];
      int var12 = field2658[var1];
      int var13 = field2657[var2];
      int var14 = field2658[var2];
      int var15 = field2657[var3];
      int var16 = field2658[var3];
      int var17 = field2657[var4];
      int var18 = field2658[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.verticesCount; ++var20) {
         int var21 = this.verticesX[var20];
         int var22 = this.verticesY[var20];
         int var23 = this.verticesZ[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2620[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
         modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
         if (this.field2637 > 0) {
            field2615[var20] = var21;
            field2638[var20] = var24;
            field2639[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   @ObfuscatedName("ah")
   @Export("draw0")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field2641[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var15;
         int var16;
         int var18;
         int var28;
         for(var7 = 0; var7 < this.indicesCount; var7 = (char)(var7 + 1)) {
            if (this.faceColors3[var7] != -2) {
               var8 = this.indices1[var7];
               var9 = this.indices2[var7];
               var10 = this.indices3[var7];
               var11 = modelViewportXs[var8];
               var12 = modelViewportXs[var9];
               var28 = modelViewportXs[var10];
               int var29;
               if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) {
                  var29 = field2615[var8];
                  var15 = field2615[var9];
                  var16 = field2615[var10];
                  int var30 = field2638[var8];
                  var18 = field2638[var9];
                  int var19 = field2638[var10];
                  int var20 = field2639[var8];
                  int var21 = field2639[var9];
                  int var22 = field2639[var10];
                  var29 -= var15;
                  var16 -= var15;
                  var30 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var30 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var29 * var22;
                  int var25 = var29 * var19 - var30 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field2633[var7] = true;
                     int var26 = (field2620[var8] + field2620[var9] + field2620[var10]) / 3 + this.radius;
                     field2642[var26][field2641[var26]++] = (char)var7;
                  }
               } else {
                  if (var2 && class9.method75(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
                     ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
                     var2 = false;
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
                     field2633[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
                        field2632[var7] = false;
                     } else {
                        field2632[var7] = true;
                     }

                     var29 = (field2620[var8] + field2620[var9] + field2620[var10]) / 3 + this.radius;
                     field2642[var29][field2641[var29]++] = (char)var7;
                  }
               }
            }
         }

         char[] var27;
         char var33;
         if (this.faceRenderPriorities == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var33 = field2641[var7];
               if (var33 > 0) {
                  var27 = field2642[var7];

                  for(var10 = 0; var10 < var33; ++var10) {
                     this.drawFace(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2643[var7] = 0;
               field2630[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var33 = field2641[var7];
               if (var33 > 0) {
                  var27 = field2642[var7];

                  for(var10 = 0; var10 < var33; ++var10) {
                     char var34 = var27[var10];
                     byte var35 = this.faceRenderPriorities[var34];
                     var28 = field2643[var35]++;
                     field2644[var35][var28] = var34;
                     if (var35 < 10) {
                        int[] var36 = field2630;
                        var36[var35] += var7;
                     } else if (var35 == 10) {
                        field2645[var28] = var7;
                     } else {
                        field2612[var28] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2643[1] > 0 || field2643[2] > 0) {
               var7 = (field2630[1] + field2630[2]) / (field2643[1] + field2643[2]);
            }

            var8 = 0;
            if (field2643[3] > 0 || field2643[4] > 0) {
               var8 = (field2630[3] + field2630[4]) / (field2643[3] + field2643[4]);
            }

            var9 = 0;
            if (field2643[6] > 0 || field2643[8] > 0) {
               var9 = (field2630[8] + field2630[6]) / (field2643[8] + field2643[6]);
            }

            var11 = 0;
            var12 = field2643[10];
            int[] var13 = field2644[10];
            int[] var14 = field2645;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2643[11];
               var13 = field2644[11];
               var14 = field2612;
            }

            if (var11 < var12) {
               var10 = var14[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2644[11]) {
                     var11 = 0;
                     var12 = field2643[11];
                     var13 = field2644[11];
                     var14 = field2612;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2644[11]) {
                     var11 = 0;
                     var12 = field2643[11];
                     var13 = field2644[11];
                     var14 = field2612;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2644[11]) {
                     var11 = 0;
                     var12 = field2643[11];
                     var13 = field2644[11];
                     var14 = field2612;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2643[var15];
               int[] var17 = field2644[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var17[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var13[var11++]);
               if (var11 == var12 && var13 != field2644[11]) {
                  var11 = 0;
                  var13 = field2644[11];
                  var12 = field2643[11];
                  var14 = field2612;
               }

               if (var11 < var12) {
                  var10 = var14[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   @ObfuscatedName("ao")
   @Export("drawFace")
   final void drawFace(int var1) {
      if (field2633[var1]) {
         this.method4532(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.field2420 = field2632[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.Rasterizer3D_alpha = 0;
         } else {
            Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
         }

         this.method4547(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   @ObfuscatedName("ac")
   boolean method4530(int var1) {
      return this.overrideAmount > 0 && var1 < this.field2667;
   }

   @ObfuscatedName("af")
   final void method4547(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var12;
         int var13;
         int var15;
         if (this.field2608 != null && this.field2608[var1] != -1) {
            int var14 = this.field2608[var1] & 255;
            var15 = this.field2646[var14];
            var12 = this.field2613[var14];
            var13 = this.field2614[var14];
         } else {
            var15 = this.indices1[var1];
            var12 = this.indices2[var1];
            var13 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4165(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2615[var15], field2615[var12], field2615[var13], field2638[var15], field2638[var12], field2638[var13], field2639[var15], field2639[var12], field2639[var13], this.faceTextures[var1]);
         } else {
            Rasterizer3D.method4165(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2615[var15], field2615[var12], field2615[var13], field2638[var15], field2638[var12], field2638[var13], field2639[var15], field2639[var12], field2639[var13], this.faceTextures[var1]);
         }
      } else {
         boolean var11 = this.method4530(var1);
         if (this.faceColors3[var1] == -1 && var11) {
            Rasterizer3D.method4163(var2, var3, var4, var5, var6, var7, field2663[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4220(var2, var3, var4, var5, var6, var7, field2663[this.faceColors1[var1]]);
         } else if (var11) {
            Rasterizer3D.method4159(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else {
            Rasterizer3D.method4158(var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }

   }

   @ObfuscatedName("ad")
   final void method4532(int var1) {
      int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field2639[var5];
      int var9 = field2639[var6];
      int var10 = field2639[var7];
      if (this.faceAlphas == null) {
         Rasterizer3D.Rasterizer3D_alpha = 0;
      } else {
         Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2648[var4] = modelViewportXs[var5];
         field2598[var4] = modelViewportYs[var5];
         field2650[var4++] = this.faceColors1[var1];
      } else {
         var11 = field2615[var5];
         var12 = field2638[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = field2611[var10 - var8] * (50 - var8);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var7] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var7] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2611[var9 - var8] * (50 - var8);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var6] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var6] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2648[var4] = modelViewportXs[var6];
         field2598[var4] = modelViewportYs[var6];
         field2650[var4++] = this.faceColors2[var1];
      } else {
         var11 = field2615[var6];
         var12 = field2638[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = field2611[var8 - var9] * (50 - var9);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var5] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var5] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2611[var10 - var9] * (50 - var9);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var7] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var7] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2648[var4] = modelViewportXs[var7];
         field2598[var4] = modelViewportYs[var7];
         field2650[var4++] = this.faceColors3[var1];
      } else {
         var11 = field2615[var7];
         var12 = field2638[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = field2611[var9 - var10] * (50 - var10);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var6] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var6] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2611[var8 - var10] * (50 - var10);
            field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var5] - var11) * var14 >> 16)) / 50;
            field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var5] - var12) * var14 >> 16)) / 50;
            field2650[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2648[0];
      var12 = field2648[1];
      var13 = field2648[2];
      var14 = field2598[0];
      int var15 = field2598[1];
      int var16 = field2598[2];
      Rasterizer3D.field2420 = false;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2420 = true;
         }

         this.method4547(var1, var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2648[3] < 0 || field2648[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2420 = true;
         }

         int var18;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var19;
            int var21;
            if (this.field2608 != null && this.field2608[var1] != -1) {
               int var20 = this.field2608[var1] & 255;
               var21 = this.field2646[var20];
               var18 = this.field2613[var20];
               var19 = this.field2614[var20];
            } else {
               var21 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var22 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               Rasterizer3D.method4165(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22);
               Rasterizer3D.method4165(var14, var16, field2598[3], var11, var13, field2648[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22);
            } else {
               Rasterizer3D.method4165(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22);
               Rasterizer3D.method4165(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22);
            }
         } else {
            boolean var17 = this.method4530(var1);
            if (this.faceColors3[var1] == -1 && var17) {
               var18 = field2663[this.faceColors1[var1]];
               Rasterizer3D.method4163(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
               Rasterizer3D.method4163(var14, var16, field2598[3], var11, var13, field2648[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
            } else if (this.faceColors3[var1] == -1) {
               var18 = field2663[this.faceColors1[var1]];
               Rasterizer3D.method4220(var14, var15, var16, var11, var12, var13, var18);
               Rasterizer3D.method4220(var14, var16, field2598[3], var11, var13, field2648[3], var18);
            } else if (var17) {
               Rasterizer3D.method4159(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
               Rasterizer3D.method4159(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
            } else {
               Rasterizer3D.method4158(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2]);
               Rasterizer3D.method4158(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3]);
            }
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILov;)V"
   )
   void method4517(int var1, class407 var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.field4566[0] * var3 + var2.field4566[4] * var4 + var2.field4566[8] * var5 + var2.field4566[12] * var6);
      this.verticesY[var1] = -((int)(var2.field4566[1] * var3 + var2.field4566[5] * var4 + var2.field4566[9] * var5 + var2.field4566[13] * var6));
      this.verticesZ[var1] = -((int)(var2.field4566[2] * var3 + var2.field4566[6] * var4 + var2.field4566[10] * var5 + var2.field4566[14] * var6));
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lhh;I)V"
   )
   void method4534(class211 var1, int var2) {
      if (this.field2624 != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.field2624[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2618[var3];
               field2592.method7647();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class122 var8 = var1.method4244(var7);
                  if (var8 != null) {
                     field2593.method7680((float)var5[var6] / 255.0F);
                     field2594.method7648(var8.method2832(var2));
                     field2594.method7652(field2593);
                     field2592.method7673(field2594);
                  }
               }

               this.method4517(var3, field2592);
            }
         }

      }
   }

   @ObfuscatedName("cq")
   @Export("draw")
   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.boundsType != 1) {
         this.calculateBoundsCylinder();
      }

      this.calculateBoundingBox(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.xzRadius >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
         if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) {
            int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
            if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.xzRadius >> 16;
               int var20 = (var3 * this.bottomY >> 16) + var19;
               int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom;
               if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) {
                  int var22 = (var3 * super.height >> 16) + var19;
                  int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom;
                  if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) {
                     int var24 = var13 + (var2 * super.height >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.field2637 > 0;
                     int var28 = WorldMapArea.method4749();
                     int var29 = ViewportMouse.ViewportMouse_y;
                     boolean var31 = class122.method2865();
                     boolean var32 = AbstractByteArrayCopier.method6222(var9);
                     boolean var33 = false;
                     int var37;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var46;
                     int var52;
                     if (var32 && var31) {
                        boolean var34 = false;
                        if (field2654) {
                           boolean var35;
                           if (!class122.method2865()) {
                              var35 = false;
                           } else {
                              class122.method2864();
                              var37 = this.xMid + var6;
                              var38 = var7 + this.yMid;
                              var39 = var8 + this.zMid;
                              var40 = this.xMidOffset;
                              var41 = this.yMidOffset;
                              var42 = this.zMidOffset;
                              int var43 = ViewportMouse.field2672 - var37;
                              int var44 = ViewportMouse.field2677 - var38;
                              int var45 = ViewportMouse.field2674 - var39;
                              if (Math.abs(var43) > var40 + ViewportMouse.field2675) {
                                 var35 = false;
                              } else if (Math.abs(var44) > var41 + WorldMapArchiveLoader.field4685) {
                                 var35 = false;
                              } else if (Math.abs(var45) > var42 + class6.field17) {
                                 var35 = false;
                              } else if (Math.abs(var45 * UserComparator6.field1435 - var44 * MenuAction.field887) > var42 * WorldMapArchiveLoader.field4685 + var41 * class6.field17) {
                                 var35 = false;
                              } else if (Math.abs(var43 * MenuAction.field887 - var45 * class309.field3657) > var40 * class6.field17 + var42 * ViewportMouse.field2675) {
                                 var35 = false;
                              } else if (Math.abs(var44 * class309.field3657 - var43 * UserComparator6.field1435) > var40 * WorldMapArchiveLoader.field4685 + var41 * ViewportMouse.field2675) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var52 = var12 - var13;
                           if (var52 <= 50) {
                              var52 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var52;
                           } else {
                              var17 /= var14;
                              var16 /= var52;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var52;
                           } else {
                              var21 /= var14;
                              var23 /= var52;
                           }

                           var46 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
                           var37 = var29 - Rasterizer3D.Rasterizer3D_clipMidY;
                           if (var46 > var16 && var46 < var17 && var37 > var23 && var37 < var21) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.isSingleTile) {
                              ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var51 = Rasterizer3D.Rasterizer3D_clipMidX;
                     var52 = Rasterizer3D.Rasterizer3D_clipMidY;
                     var46 = 0;
                     var37 = 0;
                     if (var1 != 0) {
                        var46 = field2657[var1];
                        var37 = field2658[var1];
                     }

                     for(var38 = 0; var38 < this.verticesCount; ++var38) {
                        var39 = this.verticesX[var38];
                        var40 = this.verticesY[var38];
                        var41 = this.verticesZ[var38];
                        if (var1 != 0) {
                           var42 = var41 * var46 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var46 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field2620[var38] = var41 - var12;
                        if (var41 >= 50) {
                           modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var41 + var51;
                           modelViewportYs[var38] = var42 * Rasterizer3D.Rasterizer3D_zoom / var41 + var52;
                        } else {
                           modelViewportXs[var38] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field2615[var38] = var39;
                           field2638[var38] = var42;
                           field2639[var38] = var41;
                        }
                     }

                     try {
                        this.draw0(var25, var33, this.isSingleTile, var9);
                     } catch (Exception var50) {
                     }

                  }
               }
            }
         }
      }
   }
}
