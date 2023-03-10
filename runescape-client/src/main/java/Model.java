import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Model")
public class Model extends Renderable {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lix;"
   )
   @Export("Model_sharedSequenceModel")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("al")
   @Export("Model_sharedSequenceModelFaceAlphas")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lix;"
   )
   @Export("Model_sharedSpotAnimationModel")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("ab")
   @Export("Model_sharedSpotAnimationModelFaceAlphas")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   static class421 field2656 = new class421();
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   static class421 field2660 = new class421();
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   static class421 field2724 = new class421();
   @ObfuscatedName("bt")
   static boolean[] field2687 = new boolean[6500];
   @ObfuscatedName("be")
   static boolean[] field2691 = new boolean[6500];
   @ObfuscatedName("bu")
   @Export("modelViewportXs")
   static int[] modelViewportXs = new int[6500];
   @ObfuscatedName("bd")
   @Export("modelViewportYs")
   static int[] modelViewportYs = new int[6500];
   @ObfuscatedName("by")
   static int[] field2669 = new int[6500];
   @ObfuscatedName("bp")
   static int[] field2695 = new int[6500];
   @ObfuscatedName("bb")
   static int[] field2651 = new int[6500];
   @ObfuscatedName("bx")
   static int[] field2655 = new int[6500];
   @ObfuscatedName("bj")
   static char[] field2699 = new char[6000];
   @ObfuscatedName("bf")
   static char[][] field2668 = new char[6000][512];
   @ObfuscatedName("bw")
   static int[] field2696 = new int[12];
   @ObfuscatedName("bi")
   static int[][] field2702 = new int[12][2000];
   @ObfuscatedName("cl")
   @Export("Model_transformTempX")
   static int Model_transformTempX;
   @ObfuscatedName("ca")
   static int[] field2703 = new int[2000];
   @ObfuscatedName("cb")
   static int[] field2684 = new int[2000];
   @ObfuscatedName("co")
   static int[] field2705 = new int[12];
   @ObfuscatedName("cj")
   static int[] field2723 = new int[10];
   @ObfuscatedName("cn")
   static int[] field2662 = new int[10];
   @ObfuscatedName("ce")
   static int[] field2704 = new int[10];
   @ObfuscatedName("cd")
   @Export("Model_transformTempY")
   static int Model_transformTempY;
   @ObfuscatedName("cc")
   @Export("Model_transformTempZ")
   static int Model_transformTempZ;
   @ObfuscatedName("ct")
   static boolean field2712 = true;
   @ObfuscatedName("cz")
   static int[] field2686;
   @ObfuscatedName("cg")
   static int[] field2716;
   @ObfuscatedName("ch")
   static int[] field2717;
   @ObfuscatedName("cs")
   static int[] field2718;
   @ObfuscatedName("aq")
   @Export("verticesCount")
   int verticesCount = 0;
   @ObfuscatedName("ap")
   @Export("verticesX")
   int[] verticesX;
   @ObfuscatedName("ar")
   @Export("verticesY")
   int[] verticesY;
   @ObfuscatedName("ak")
   @Export("verticesZ")
   int[] verticesZ;
   @ObfuscatedName("ax")
   @Export("indicesCount")
   public int indicesCount = 0;
   @ObfuscatedName("as")
   @Export("indices1")
   int[] indices1;
   @ObfuscatedName("ay")
   @Export("indices2")
   int[] indices2;
   @ObfuscatedName("am")
   @Export("indices3")
   int[] indices3;
   @ObfuscatedName("az")
   @Export("faceColors1")
   int[] faceColors1;
   @ObfuscatedName("ae")
   @Export("faceColors2")
   int[] faceColors2;
   @ObfuscatedName("au")
   @Export("faceColors3")
   int[] faceColors3;
   @ObfuscatedName("ag")
   @Export("faceRenderPriorities")
   byte[] faceRenderPriorities;
   @ObfuscatedName("at")
   @Export("faceAlphas")
   byte[] faceAlphas;
   @ObfuscatedName("af")
   byte[] field2671;
   @ObfuscatedName("ai")
   @Export("faceTextures")
   short[] faceTextures;
   @ObfuscatedName("aw")
   byte field2673 = 0;
   @ObfuscatedName("aa")
   int field2674 = 0;
   @ObfuscatedName("ah")
   int[] field2675;
   @ObfuscatedName("ad")
   int[] field2676;
   @ObfuscatedName("bm")
   int[] field2677;
   @ObfuscatedName("bv")
   @Export("vertexLabels")
   int[][] vertexLabels;
   @ObfuscatedName("bo")
   @Export("faceLabelsAlpha")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("bs")
   int[][] field2680;
   @ObfuscatedName("bg")
   int[][] field2681;
   @ObfuscatedName("bh")
   @Export("isSingleTile")
   public boolean isSingleTile = false;
   @ObfuscatedName("bl")
   @Export("boundsType")
   int boundsType;
   @ObfuscatedName("bk")
   @Export("bottomY")
   int bottomY;
   @ObfuscatedName("br")
   @Export("xzRadius")
   int xzRadius;
   @ObfuscatedName("ba")
   @Export("diameter")
   int diameter;
   @ObfuscatedName("bz")
   @Export("radius")
   int radius;
   @ObfuscatedName("bq")
   @Export("aabb")
   HashMap aabb = new HashMap();
   @ObfuscatedName("cu")
   @Export("overrideHue")
   public byte overrideHue;
   @ObfuscatedName("cm")
   @Export("overrideSaturation")
   public byte overrideSaturation;
   @ObfuscatedName("cw")
   @Export("overrideLuminance")
   public byte overrideLuminance;
   @ObfuscatedName("cp")
   @Export("overrideAmount")
   public byte overrideAmount;
   @ObfuscatedName("ci")
   public short field2725;

   static {
      field2686 = Rasterizer3D.Rasterizer3D_sine;
      field2716 = Rasterizer3D.Rasterizer3D_cosine;
      field2717 = Rasterizer3D.Rasterizer3D_colorPalette;
      field2718 = Rasterizer3D.field2473;
   }

   Model() {
   }

   @ObfuscatedSignature(
      descriptor = "([Lix;I)V"
   )
   public Model(Model[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2674 = 0;
      this.field2673 = -1;

      int var7;
      Model var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.verticesCount += var8.verticesCount;
            this.indicesCount += var8.indicesCount;
            this.field2674 += var8.field2674;
            if (var8.faceRenderPriorities != null) {
               var3 = true;
            } else {
               if (this.field2673 == -1) {
                  this.field2673 = var8.field2673;
               }

               if (this.field2673 != var8.field2673) {
                  var3 = true;
               }
            }

            var4 |= var8.faceAlphas != null;
            var5 |= var8.faceTextures != null;
            var6 |= var8.field2671 != null;
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
         this.field2671 = new byte[this.indicesCount];
      }

      if (this.field2674 > 0) {
         this.field2675 = new int[this.field2674];
         this.field2676 = new int[this.field2674];
         this.field2677 = new int[this.field2674];
      }

      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2674 = 0;

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
                     this.faceRenderPriorities[this.indicesCount] = var8.field2673;
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
                  if (var8.field2671 != null && var8.field2671[var9] != -1) {
                     this.field2671[this.indicesCount] = (byte)(this.field2674 + var8.field2671[var9]);
                  } else {
                     this.field2671[this.indicesCount] = -1;
                  }
               }

               ++this.indicesCount;
            }

            for(var9 = 0; var9 < var8.field2674; ++var9) {
               this.field2675[this.field2674] = this.verticesCount + var8.field2675[var9];
               this.field2676[this.field2674] = this.verticesCount + var8.field2676[var9];
               this.field2677[this.field2674] = this.verticesCount + var8.field2677[var9];
               ++this.field2674;
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Lix;"
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
               var11.field2674 = this.field2674;
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
               var11.field2671 = this.field2671;
               var11.faceTextures = this.faceTextures;
               var11.field2673 = this.field2673;
               var11.field2675 = this.field2675;
               var11.field2676 = this.field2676;
               var11.field2677 = this.field2677;
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Z)Lix;"
   )
   @Export("toSharedSequenceModel")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Z)Lix;"
   )
   @Export("toSharedSpotAnimationModel")
   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ZLix;[B)Lix;"
   )
   @Export("buildSharedModel")
   Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.field2674 = this.field2674;
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
      var2.field2671 = this.field2671;
      var2.faceTextures = this.faceTextures;
      var2.field2673 = this.field2673;
      var2.field2675 = this.field2675;
      var2.field2676 = this.field2676;
      var2.field2677 = this.field2677;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field2680 = this.field2680;
      var2.field2681 = this.field2681;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.overrideAmount = 0;
      return var2;
   }

   @ObfuscatedName("ao")
   @Export("calculateBoundingBox")
   void calculateBoundingBox(int var1) {
      if (!this.aabb.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2716[var1];
         int var9 = field2686[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = Rasterizer3D.method4282(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = Rasterizer3D.method4283(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

         AABB var14 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var15 = true;
         if (var14.xMidOffset < 32) {
            var14.xMidOffset = 32;
         }

         if (var14.zMidOffset < 32) {
            var14.zMidOffset = 32;
         }

         if (this.isSingleTile) {
            boolean var16 = true;
            var14.xMidOffset += 8;
            var14.zMidOffset += 8;
         }

         this.aabb.put(var1, var14);
      }
   }

   @ObfuscatedName("ap")
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

   @ObfuscatedName("ar")
   void method4626() {
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

   @ObfuscatedName("ak")
   public int method4625() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   @ObfuscatedName("ax")
   @Export("resetBounds")
   public void resetBounds() {
      this.boundsType = 0;
      this.aabb.clear();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Liw;I)V"
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lfl;I)V"
   )
   public void method4603(class134 var1, int var2) {
      Skeleton var3 = var1.field1570;
      class220 var4 = var3.method4377();
      if (var4 != null) {
         var3.method4377().method4362(var1, var2);
         this.method4605(var3.method4377(), var1.method3058());
      }

      if (var1.method3043()) {
         this.method4604(var1, var2);
      }

      this.resetBounds();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lfl;I)V"
   )
   void method4604(class134 var1, int var2) {
      Skeleton var3 = var1.field1570;

      for(int var4 = 0; var4 < var3.count; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.field1568 != null && var1.field1568[var4] != null && var1.field1568[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            class127 var6 = var1.field1568[var4][0];
            int[] var7 = var3.labels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2974(var2) * 255.0F);
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lik;I)V"
   )
   void method4605(class220 var1, int var2) {
      this.method4662(var1, var2);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Liw;ILiw;I[I)V"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lin;Lfl;I[ZZZ)V"
   )
   public void method4639(Skeleton var1, class134 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class220 var7 = var1.method4377();
      if (var7 != null) {
         var7.method4371(var2, var3, var4, var5);
         if (var6) {
            this.method4605(var7, var2.method3058());
         }
      }

      if (!var5 && var2.method3043()) {
         this.method4604(var2, var3);
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Liw;I[IZ)V"
   )
   public void method4617(Frames var1, int var2, int[] var3, boolean var4) {
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

   @ObfuscatedName("at")
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
                        var15 = field2686[var14];
                        var16 = field2716[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2686[var12];
                        var16 = field2716[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2686[var13];
                        var16 = field2716[var13];
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

   @ObfuscatedName("af")
   @Export("rotateY90Ccw")
   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("ai")
   @Export("rotateY180")
   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   @ObfuscatedName("aw")
   @Export("rotateY270Ccw")
   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("aa")
   @Export("rotateZ")
   public void rotateZ(int var1) {
      int var2 = field2686[var1];
      int var3 = field2716[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   @ObfuscatedName("ah")
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

   @ObfuscatedName("ad")
   @Export("scale")
   public void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bm")
   public final void method4651(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4626();
      }

      int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var10 = field2686[var1];
      int var11 = field2716[var1];
      int var12 = field2686[var2];
      int var13 = field2716[var2];
      int var14 = field2686[var3];
      int var15 = field2716[var3];
      int var16 = field2686[var4];
      int var17 = field2716[var4];
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
         field2669[var19] = var22 - var18;
         modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
         modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
         if (this.field2674 > 0) {
            field2695[var19] = var20;
            field2651[var19] = var23;
            field2655[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   @ObfuscatedName("bv")
   public final void method4629(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4626();
      }

      int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var11 = field2686[var1];
      int var12 = field2716[var1];
      int var13 = field2686[var2];
      int var14 = field2716[var2];
      int var15 = field2686[var3];
      int var16 = field2716[var3];
      int var17 = field2686[var4];
      int var18 = field2716[var4];
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
         field2669[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
         modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
         if (this.field2674 > 0) {
            field2695[var20] = var21;
            field2651[var20] = var24;
            field2655[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   @ObfuscatedName("bo")
   @Export("draw0")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field2699[var6] = 0;
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
               if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
                  if (var2 && class156.method3298(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
                     class169.method3464(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
                     field2691[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
                        field2687[var7] = false;
                     } else {
                        field2687[var7] = true;
                     }

                     var29 = (field2669[var8] + field2669[var9] + field2669[var10]) / 3 + this.radius;
                     field2668[var29][field2699[var29]++] = (char)var7;
                  }
               } else {
                  var29 = field2695[var8];
                  var15 = field2695[var9];
                  var16 = field2695[var10];
                  int var30 = field2651[var8];
                  var18 = field2651[var9];
                  int var19 = field2651[var10];
                  int var20 = field2655[var8];
                  int var21 = field2655[var9];
                  int var22 = field2655[var10];
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
                     field2691[var7] = true;
                     int var26 = (field2669[var8] + field2669[var9] + field2669[var10]) / 3 + this.radius;
                     field2668[var26][field2699[var26]++] = (char)var7;
                  }
               }
            }
         }

         char[] var27;
         char var31;
         if (this.faceRenderPriorities == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2699[var7];
               if (var31 > 0) {
                  var27 = field2668[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     this.drawFace(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2696[var7] = 0;
               field2705[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2699[var7];
               if (var31 > 0) {
                  var27 = field2668[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     char var32 = var27[var10];
                     byte var33 = this.faceRenderPriorities[var32];
                     var28 = field2696[var33]++;
                     field2702[var33][var28] = var32;
                     if (var33 < 10) {
                        int[] var34 = field2705;
                        var34[var33] += var7;
                     } else if (var33 == 10) {
                        field2703[var28] = var7;
                     } else {
                        field2684[var28] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2696[1] > 0 || field2696[2] > 0) {
               var7 = (field2705[1] + field2705[2]) / (field2696[1] + field2696[2]);
            }

            var8 = 0;
            if (field2696[3] > 0 || field2696[4] > 0) {
               var8 = (field2705[3] + field2705[4]) / (field2696[3] + field2696[4]);
            }

            var9 = 0;
            if (field2696[6] > 0 || field2696[8] > 0) {
               var9 = (field2705[8] + field2705[6]) / (field2696[8] + field2696[6]);
            }

            var11 = 0;
            var12 = field2696[10];
            int[] var13 = field2702[10];
            int[] var14 = field2703;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2696[11];
               var13 = field2702[11];
               var14 = field2684;
            }

            if (var11 < var12) {
               var10 = var14[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2702[11]) {
                     var11 = 0;
                     var12 = field2696[11];
                     var13 = field2702[11];
                     var14 = field2684;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2702[11]) {
                     var11 = 0;
                     var12 = field2696[11];
                     var13 = field2702[11];
                     var14 = field2684;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2702[11]) {
                     var11 = 0;
                     var12 = field2696[11];
                     var13 = field2702[11];
                     var14 = field2684;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2696[var15];
               int[] var17 = field2702[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var17[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var13[var11++]);
               if (var11 == var12 && var13 != field2702[11]) {
                  var11 = 0;
                  var13 = field2702[11];
                  var12 = field2696[11];
                  var14 = field2684;
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

   @ObfuscatedName("bs")
   @Export("drawFace")
   final void drawFace(int var1) {
      if (field2691[var1]) {
         this.method4694(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.field2471 = field2687[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.Rasterizer3D_alpha = 0;
         } else {
            Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
         }

         this.method4596(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   @ObfuscatedName("bg")
   boolean method4599(int var1) {
      return this.overrideAmount > 0 && var1 < this.field2725;
   }

   @ObfuscatedName("bh")
   final void method4596(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var12;
         int var13;
         int var15;
         if (this.field2671 != null && this.field2671[var1] != -1) {
            int var14 = this.field2671[var1] & 255;
            var15 = this.field2675[var14];
            var12 = this.field2676[var14];
            var13 = this.field2677[var14];
         } else {
            var15 = this.indices1[var1];
            var12 = this.indices2[var1];
            var13 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4352(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2695[var15], field2695[var12], field2695[var13], field2651[var15], field2651[var12], field2651[var13], field2655[var15], field2655[var12], field2655[var13], this.faceTextures[var1]);
         } else {
            Rasterizer3D.method4352(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2695[var15], field2695[var12], field2695[var13], field2651[var15], field2651[var12], field2651[var13], field2655[var15], field2655[var12], field2655[var13], this.faceTextures[var1]);
         }
      } else {
         boolean var11 = this.method4599(var1);
         if (this.faceColors3[var1] == -1 && var11) {
            Rasterizer3D.method4300(var2, var3, var4, var5, var6, var7, field2717[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4269(var2, var3, var4, var5, var6, var7, field2717[this.faceColors1[var1]]);
         } else if (var11) {
            Rasterizer3D.method4285(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else {
            Rasterizer3D.method4270(var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }

   }

   @ObfuscatedName("bl")
   final void method4694(int var1) {
      int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field2655[var5];
      int var9 = field2655[var6];
      int var10 = field2655[var7];
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
         field2723[var4] = modelViewportXs[var5];
         field2662[var4] = modelViewportYs[var5];
         field2704[var4++] = this.faceColors1[var1];
      } else {
         var11 = field2695[var5];
         var12 = field2651[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = field2718[var10 - var8] * (50 - var8);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var7] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2718[var9 - var8] * (50 - var8);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var6] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2723[var4] = modelViewportXs[var6];
         field2662[var4] = modelViewportYs[var6];
         field2704[var4++] = this.faceColors2[var1];
      } else {
         var11 = field2695[var6];
         var12 = field2651[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = field2718[var8 - var9] * (50 - var9);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var5] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2718[var10 - var9] * (50 - var9);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var7] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2723[var4] = modelViewportXs[var7];
         field2662[var4] = modelViewportYs[var7];
         field2704[var4++] = this.faceColors3[var1];
      } else {
         var11 = field2695[var7];
         var12 = field2651[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = field2718[var9 - var10] * (50 - var10);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var6] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2718[var8 - var10] * (50 - var10);
            field2723[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50;
            field2662[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2651[var5] - var12) * var14 >> 16)) / 50;
            field2704[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2723[0];
      var12 = field2723[1];
      var13 = field2723[2];
      var14 = field2662[0];
      int var15 = field2662[1];
      int var16 = field2662[2];
      Rasterizer3D.field2471 = false;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2471 = true;
         }

         this.method4596(var1, var14, var15, var16, var11, var12, var13, field2704[0], field2704[1], field2704[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2723[3] < 0 || field2723[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2471 = true;
         }

         int var18;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var19;
            int var21;
            if (this.field2671 != null && this.field2671[var1] != -1) {
               int var20 = this.field2671[var1] & 255;
               var21 = this.field2675[var20];
               var18 = this.field2676[var20];
               var19 = this.field2677[var20];
            } else {
               var21 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var22 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               Rasterizer3D.method4352(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2651[var21], field2651[var18], field2651[var19], field2655[var21], field2655[var18], field2655[var19], var22);
               Rasterizer3D.method4352(var14, var16, field2662[3], var11, var13, field2723[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2651[var21], field2651[var18], field2651[var19], field2655[var21], field2655[var18], field2655[var19], var22);
            } else {
               Rasterizer3D.method4352(var14, var15, var16, var11, var12, var13, field2704[0], field2704[1], field2704[2], field2695[var21], field2695[var18], field2695[var19], field2651[var21], field2651[var18], field2651[var19], field2655[var21], field2655[var18], field2655[var19], var22);
               Rasterizer3D.method4352(var14, var16, field2662[3], var11, var13, field2723[3], field2704[0], field2704[2], field2704[3], field2695[var21], field2695[var18], field2695[var19], field2651[var21], field2651[var18], field2651[var19], field2655[var21], field2655[var18], field2655[var19], var22);
            }
         } else {
            boolean var17 = this.method4599(var1);
            if (this.faceColors3[var1] == -1 && var17) {
               var18 = field2717[this.faceColors1[var1]];
               Rasterizer3D.method4300(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
               Rasterizer3D.method4300(var14, var16, field2662[3], var11, var13, field2723[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
            } else if (this.faceColors3[var1] == -1) {
               var18 = field2717[this.faceColors1[var1]];
               Rasterizer3D.method4269(var14, var15, var16, var11, var12, var13, var18);
               Rasterizer3D.method4269(var14, var16, field2662[3], var11, var13, field2723[3], var18);
            } else if (var17) {
               Rasterizer3D.method4285(var14, var15, var16, var11, var12, var13, field2704[0], field2704[1], field2704[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
               Rasterizer3D.method4285(var14, var16, field2662[3], var11, var13, field2723[3], field2704[0], field2704[2], field2704[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
            } else {
               Rasterizer3D.method4270(var14, var15, var16, var11, var12, var13, field2704[0], field2704[1], field2704[2]);
               Rasterizer3D.method4270(var14, var16, field2662[3], var11, var13, field2723[3], field2704[0], field2704[2], field2704[3]);
            }
         }
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ILqt;)V"
   )
   void method4624(int var1, class421 var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.field4608[0] * var3 + var2.field4608[4] * var4 + var2.field4608[8] * var5 + var2.field4608[12] * var6);
      this.verticesY[var1] = -((int)(var2.field4608[1] * var3 + var2.field4608[5] * var4 + var2.field4608[9] * var5 + var2.field4608[13] * var6));
      this.verticesZ[var1] = -((int)(var2.field4608[2] * var3 + var2.field4608[6] * var4 + var2.field4608[10] * var5 + var2.field4608[14] * var6));
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Lik;I)V"
   )
   void method4662(class220 var1, int var2) {
      if (this.field2680 != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.field2680[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2681[var3];
               field2656.method7877();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class124 var8 = var1.method4360(var7);
                  if (var8 != null) {
                     field2660.method7849((float)var5[var6] / 255.0F);
                     field2724.method7850(var8.method2934(var2));
                     field2724.method7851(field2660);
                     field2656.method7885(field2724);
                  }
               }

               this.method4624(var3, field2656);
            }
         }

      }
   }

   @ObfuscatedName("dh")
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

                     boolean var27 = var26 || this.field2674 > 0;
                     int var28 = HitSplatDefinition.method3854();
                     int var29 = ViewportMouse.ViewportMouse_y;
                     boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
                     boolean var33 = Decimator.method1127(var9);
                     boolean var34 = false;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     int var51;
                     int var54;
                     int var55;
                     if (var33 && var31) {
                        boolean var35 = false;
                        if (field2712) {
                           boolean var38 = ViewportMouse.ViewportMouse_isInViewport;
                           boolean var36;
                           if (!var38) {
                              var36 = false;
                           } else {
                              int var44;
                              int var45;
                              int var46;
                              int var47;
                              int var48;
                              if (!ViewportMouse.ViewportMouse_false0) {
                                 var39 = Scene.Scene_cameraPitchSine;
                                 var40 = Scene.Scene_cameraPitchCosine;
                                 var41 = Scene.Scene_cameraYawSine;
                                 var42 = Scene.Scene_cameraYawCosine;
                                 var43 = 50;
                                 var44 = 3500;
                                 var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var43 / Rasterizer3D.Rasterizer3D_zoom;
                                 var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var43 / Rasterizer3D.Rasterizer3D_zoom;
                                 var47 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var44 / Rasterizer3D.Rasterizer3D_zoom;
                                 var48 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var44 / Rasterizer3D.Rasterizer3D_zoom;
                                 int var49 = Rasterizer3D.method4286(var46, var43, var40, var39);
                                 var43 = Rasterizer3D.method4287(var46, var43, var40, var39);
                                 var46 = var49;
                                 var49 = Rasterizer3D.method4286(var48, var44, var40, var39);
                                 var44 = Rasterizer3D.method4287(var48, var44, var40, var39);
                                 var48 = var49;
                                 var49 = Rasterizer3D.method4284(var45, var43, var42, var41);
                                 var43 = Rasterizer3D.method4346(var45, var43, var42, var41);
                                 var45 = var49;
                                 var49 = Rasterizer3D.method4284(var47, var44, var42, var41);
                                 var44 = Rasterizer3D.method4346(var47, var44, var42, var41);
                                 ViewportMouse.field2730 = (var49 + var45) / 2;
                                 SecureRandomCallable.field1011 = (var46 + var48) / 2;
                                 ViewportMouse.field2731 = (var43 + var44) / 2;
                                 class391.field4473 = (var49 - var45) / 2;
                                 ViewportMouse.field2732 = (var48 - var46) / 2;
                                 Canvas.field125 = (var44 - var43) / 2;
                                 class196.field2072 = Math.abs(class391.field4473);
                                 Frames.field2593 = Math.abs(ViewportMouse.field2732);
                                 ViewportMouse.field2726 = Math.abs(Canvas.field125);
                              }

                              AABB var50 = (AABB)this.aabb.get(var1);
                              var40 = var50.xMid + var6;
                              var41 = var7 + var50.yMid;
                              var42 = var8 + var50.zMid;
                              var43 = var50.xMidOffset;
                              var44 = var50.yMidOffset;
                              var45 = var50.zMidOffset;
                              var46 = ViewportMouse.field2730 - var40;
                              var47 = SecureRandomCallable.field1011 - var41;
                              var48 = ViewportMouse.field2731 - var42;
                              if (Math.abs(var46) > var43 + class196.field2072) {
                                 var36 = false;
                              } else if (Math.abs(var47) > var44 + Frames.field2593) {
                                 var36 = false;
                              } else if (Math.abs(var48) > var45 + ViewportMouse.field2726) {
                                 var36 = false;
                              } else if (Math.abs(var48 * ViewportMouse.field2732 - var47 * Canvas.field125) > var45 * Frames.field2593 + var44 * ViewportMouse.field2726) {
                                 var36 = false;
                              } else if (Math.abs(var46 * Canvas.field125 - var48 * class391.field4473) > var43 * ViewportMouse.field2726 + var45 * class196.field2072) {
                                 var36 = false;
                              } else if (Math.abs(var47 * class391.field4473 - var46 * ViewportMouse.field2732) > var43 * Frames.field2593 + var44 * class196.field2072) {
                                 var36 = false;
                              } else {
                                 var36 = true;
                              }
                           }

                           var35 = var36;
                        } else {
                           var55 = var12 - var13;
                           if (var55 <= 50) {
                              var55 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var55;
                           } else {
                              var17 /= var14;
                              var16 /= var55;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var55;
                           } else {
                              var21 /= var14;
                              var23 /= var55;
                           }

                           var51 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
                           var54 = var29 - Rasterizer3D.Rasterizer3D_clipMidY;
                           if (var51 > var16 && var51 < var17 && var54 > var23 && var54 < var21) {
                              var35 = true;
                           }
                        }

                        if (var35) {
                           if (this.isSingleTile) {
                              class169.method3464(var9);
                           } else {
                              var34 = true;
                           }
                        }
                     }

                     int var53 = Rasterizer3D.Rasterizer3D_clipMidX;
                     var55 = Rasterizer3D.Rasterizer3D_clipMidY;
                     var51 = 0;
                     var54 = 0;
                     if (var1 != 0) {
                        var51 = field2686[var1];
                        var54 = field2716[var1];
                     }

                     for(var39 = 0; var39 < this.verticesCount; ++var39) {
                        var40 = this.verticesX[var39];
                        var41 = this.verticesY[var39];
                        var42 = this.verticesZ[var39];
                        if (var1 != 0) {
                           var43 = var42 * var51 + var40 * var54 >> 16;
                           var42 = var42 * var54 - var40 * var51 >> 16;
                           var40 = var43;
                        }

                        var40 += var6;
                        var41 += var7;
                        var42 += var8;
                        var43 = var42 * var4 + var5 * var40 >> 16;
                        var42 = var5 * var42 - var40 * var4 >> 16;
                        var40 = var43;
                        var43 = var3 * var41 - var42 * var2 >> 16;
                        var42 = var41 * var2 + var3 * var42 >> 16;
                        field2669[var39] = var42 - var12;
                        if (var42 >= 50) {
                           modelViewportXs[var39] = var40 * Rasterizer3D.Rasterizer3D_zoom / var42 + var53;
                           modelViewportYs[var39] = var43 * Rasterizer3D.Rasterizer3D_zoom / var42 + var55;
                        } else {
                           modelViewportXs[var39] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field2695[var39] = var40;
                           field2651[var39] = var43;
                           field2655[var39] = var42;
                        }
                     }

                     try {
                        this.draw0(var25, var34, this.isSingleTile, var9);
                     } catch (Exception var52) {
                     }

                  }
               }
            }
         }
      }
   }
}
