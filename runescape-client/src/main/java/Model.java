import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Model")
public class Model extends Renderable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lhs;"
   )
   @Export("Model_sharedSequenceModel")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("w")
   @Export("Model_sharedSequenceModelFaceAlphas")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lhs;"
   )
   @Export("Model_sharedSpotAnimationModel")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("s")
   @Export("Model_sharedSpotAnimationModelFaceAlphas")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   static class417 field2703 = new class417();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   static class417 field2674 = new class417();
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   static class417 field2739 = new class417();
   @ObfuscatedName("ac")
   static boolean[] field2708 = new boolean[6500];
   @ObfuscatedName("av")
   static boolean[] field2709 = new boolean[6500];
   @ObfuscatedName("aq")
   @Export("modelViewportXs")
   static int[] modelViewportXs = new int[6500];
   @ObfuscatedName("ak")
   @Export("modelViewportYs")
   static int[] modelViewportYs = new int[6500];
   @ObfuscatedName("au")
   static int[] field2712 = new int[6500];
   @ObfuscatedName("ae")
   static int[] field2695 = new int[6500];
   @ObfuscatedName("ah")
   static int[] field2741 = new int[6500];
   @ObfuscatedName("ad")
   static int[] field2715 = new int[6500];
   @ObfuscatedName("an")
   static char[] field2675 = new char[6000];
   @ObfuscatedName("am")
   static char[][] field2673 = new char[6000][512];
   @ObfuscatedName("as")
   static int[] field2728 = new int[12];
   @ObfuscatedName("ao")
   static int[][] field2669 = new int[12][2000];
   @ObfuscatedName("bj")
   static int[] field2720 = new int[2000];
   @ObfuscatedName("bf")
   static int[] field2721 = new int[2000];
   @ObfuscatedName("bz")
   static int[] field2698 = new int[12];
   @ObfuscatedName("br")
   static int[] field2691 = new int[10];
   @ObfuscatedName("bm")
   static int[] field2724 = new int[10];
   @ObfuscatedName("be")
   static int[] field2726 = new int[10];
   @ObfuscatedName("bo")
   @Export("Model_transformTempX")
   static int Model_transformTempX;
   @ObfuscatedName("bl")
   @Export("Model_transformTempY")
   static int Model_transformTempY;
   @ObfuscatedName("bq")
   @Export("Model_transformTempZ")
   static int Model_transformTempZ;
   @ObfuscatedName("bn")
   static boolean field2730 = true;
   @ObfuscatedName("bt")
   static int[] field2733;
   @ObfuscatedName("bd")
   static int[] field2734;
   @ObfuscatedName("bg")
   static int[] field2738;
   @ObfuscatedName("bb")
   static int[] field2736;
   @ObfuscatedName("n")
   @Export("verticesCount")
   int verticesCount = 0;
   @ObfuscatedName("l")
   @Export("verticesX")
   int[] verticesX;
   @ObfuscatedName("k")
   @Export("verticesY")
   int[] verticesY;
   @ObfuscatedName("c")
   @Export("verticesZ")
   int[] verticesZ;
   @ObfuscatedName("r")
   @Export("indicesCount")
   public int indicesCount = 0;
   @ObfuscatedName("b")
   @Export("indices1")
   int[] indices1;
   @ObfuscatedName("m")
   @Export("indices2")
   int[] indices2;
   @ObfuscatedName("t")
   @Export("indices3")
   int[] indices3;
   @ObfuscatedName("h")
   @Export("faceColors1")
   int[] faceColors1;
   @ObfuscatedName("p")
   @Export("faceColors2")
   int[] faceColors2;
   @ObfuscatedName("o")
   @Export("faceColors3")
   int[] faceColors3;
   @ObfuscatedName("u")
   @Export("faceRenderPriorities")
   byte[] faceRenderPriorities;
   @ObfuscatedName("x")
   @Export("faceAlphas")
   byte[] faceAlphas;
   @ObfuscatedName("a")
   byte[] field2689;
   @ObfuscatedName("q")
   @Export("faceTextures")
   short[] faceTextures;
   @ObfuscatedName("d")
   byte field2719 = 0;
   @ObfuscatedName("e")
   int field2692 = 0;
   @ObfuscatedName("g")
   int[] field2693;
   @ObfuscatedName("y")
   int[] field2694;
   @ObfuscatedName("af")
   int[] field2717;
   @ObfuscatedName("aa")
   @Export("vertexLabels")
   int[][] vertexLabels;
   @ObfuscatedName("ai")
   @Export("faceLabelsAlpha")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("ag")
   int[][] field2716;
   @ObfuscatedName("aw")
   int[][] field2699;
   @ObfuscatedName("ar")
   @Export("isSingleTile")
   public boolean isSingleTile = false;
   @ObfuscatedName("al")
   @Export("boundsType")
   int boundsType;
   @ObfuscatedName("at")
   @Export("bottomY")
   int bottomY;
   @ObfuscatedName("aj")
   @Export("xzRadius")
   int xzRadius;
   @ObfuscatedName("ax")
   @Export("diameter")
   int diameter;
   @ObfuscatedName("az")
   @Export("radius")
   int radius;
   @ObfuscatedName("ap")
   @Export("aabb")
   HashMap aabb = new HashMap();
   @ObfuscatedName("by")
   @Export("overrideHue")
   public byte overrideHue;
   @ObfuscatedName("bu")
   @Export("overrideSaturation")
   public byte overrideSaturation;
   @ObfuscatedName("bp")
   @Export("overrideLuminance")
   public byte overrideLuminance;
   @ObfuscatedName("bc")
   @Export("overrideAmount")
   public byte overrideAmount;
   @ObfuscatedName("ba")
   public short field2743;

   static {
      field2733 = Rasterizer3D.Rasterizer3D_sine;
      field2734 = Rasterizer3D.Rasterizer3D_cosine;
      field2738 = Rasterizer3D.Rasterizer3D_colorPalette;
      field2736 = Rasterizer3D.field2489;
   }

   Model() {
   }

   @ObfuscatedSignature(
      descriptor = "([Lhs;I)V"
   )
   public Model(Model[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2692 = 0;
      this.field2719 = -1;

      int var7;
      Model var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.verticesCount += var8.verticesCount;
            this.indicesCount += var8.indicesCount;
            this.field2692 += var8.field2692;
            if (var8.faceRenderPriorities != null) {
               var3 = true;
            } else {
               if (this.field2719 == -1) {
                  this.field2719 = var8.field2719;
               }

               if (this.field2719 != var8.field2719) {
                  var3 = true;
               }
            }

            var4 |= var8.faceAlphas != null;
            var5 |= var8.faceTextures != null;
            var6 |= var8.field2689 != null;
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
         this.field2689 = new byte[this.indicesCount];
      }

      if (this.field2692 > 0) {
         this.field2693 = new int[this.field2692];
         this.field2694 = new int[this.field2692];
         this.field2717 = new int[this.field2692];
      }

      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field2692 = 0;

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
                     this.faceRenderPriorities[this.indicesCount] = var8.field2719;
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
                  if (var8.field2689 != null && var8.field2689[var9] != -1) {
                     this.field2689[this.indicesCount] = (byte)(this.field2692 + var8.field2689[var9]);
                  } else {
                     this.field2689[this.indicesCount] = -1;
                  }
               }

               ++this.indicesCount;
            }

            for(var9 = 0; var9 < var8.field2692; ++var9) {
               this.field2693[this.field2692] = this.verticesCount + var8.field2693[var9];
               this.field2694[this.field2692] = this.verticesCount + var8.field2694[var9];
               this.field2717[this.field2692] = this.verticesCount + var8.field2717[var9];
               ++this.field2692;
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Lhs;"
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
               var11.field2692 = this.field2692;
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
               var11.field2689 = this.field2689;
               var11.faceTextures = this.faceTextures;
               var11.field2719 = this.field2719;
               var11.field2693 = this.field2693;
               var11.field2694 = this.field2694;
               var11.field2717 = this.field2717;
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Z)Lhs;"
   )
   @Export("toSharedSequenceModel")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Z)Lhs;"
   )
   @Export("toSharedSpotAnimationModel")
   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(ZLhs;[B)Lhs;"
   )
   @Export("buildSharedModel")
   Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.field2692 = this.field2692;
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
      var2.field2689 = this.field2689;
      var2.faceTextures = this.faceTextures;
      var2.field2719 = this.field2719;
      var2.field2693 = this.field2693;
      var2.field2694 = this.field2694;
      var2.field2717 = this.field2717;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field2716 = this.field2716;
      var2.field2699 = this.field2699;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.overrideAmount = 0;
      return var2;
   }

   @ObfuscatedName("c")
   @Export("calculateBoundingBox")
   void calculateBoundingBox(int var1) {
      if (!this.aabb.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2734[var1];
         int var9 = field2733[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = Rasterizer3D.method4347(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = Rasterizer3D.method4348(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

   @ObfuscatedName("r")
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

   @ObfuscatedName("b")
   void method4755() {
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

   @ObfuscatedName("m")
   public int method4690() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   @ObfuscatedName("t")
   @Export("resetBounds")
   public void resetBounds() {
      this.boundsType = 0;
      this.aabb.clear();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lhw;I)V"
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Lei;I)V"
   )
   public void method4727(class133 var1, int var2) {
      Skeleton var3 = var1.field1600;
      class217 var4 = var3.method4450();
      if (var4 != null) {
         var3.method4450().method4443(var1, var2);
         this.method4695(var3.method4450(), var1.method3117());
      }

      if (var1.method3096()) {
         this.method4707(var1, var2);
      }

      this.resetBounds();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lei;I)V"
   )
   void method4707(class133 var1, int var2) {
      Skeleton var3 = var1.field1600;

      for(int var4 = 0; var4 < var3.count; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.field1601 != null && var1.field1601[var4] != null && var1.field1601[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            class125 var6 = var1.field1601[var4][0];
            int[] var7 = var3.labels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3043(var2) * 255.0F);
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
      descriptor = "(Lhk;I)V"
   )
   void method4695(class217 var1, int var2) {
      this.method4715(var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lhw;ILhw;I[I)V"
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lha;Lei;I[ZZZ)V"
   )
   public void method4697(Skeleton var1, class133 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class217 var7 = var1.method4450();
      if (var7 != null) {
         var7.method4423(var2, var3, var4, var5);
         if (var6) {
            this.method4695(var7, var2.method3117());
         }
      }

      if (!var5 && var2.method3096()) {
         this.method4707(var2, var3);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lhw;I[IZ)V"
   )
   public void method4801(Frames var1, int var2, int[] var3, boolean var4) {
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

   @ObfuscatedName("d")
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
                        var15 = field2733[var14];
                        var16 = field2734[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2733[var12];
                        var16 = field2734[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2733[var13];
                        var16 = field2734[var13];
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

   @ObfuscatedName("e")
   @Export("rotateY90Ccw")
   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("g")
   @Export("rotateY180")
   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   @ObfuscatedName("y")
   @Export("rotateY270Ccw")
   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("af")
   @Export("rotateZ")
   public void rotateZ(int var1) {
      int var2 = field2733[var1];
      int var3 = field2734[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   @ObfuscatedName("aa")
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

   @ObfuscatedName("ai")
   @Export("scale")
   public void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.resetBounds();
   }

   @ObfuscatedName("ag")
   public final void method4706(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4755();
      }

      int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var10 = field2733[var1];
      int var11 = field2734[var1];
      int var12 = field2733[var2];
      int var13 = field2734[var2];
      int var14 = field2733[var3];
      int var15 = field2734[var3];
      int var16 = field2733[var4];
      int var17 = field2734[var4];
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
         field2712[var19] = var22 - var18;
         modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
         modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
         if (this.field2692 > 0) {
            field2695[var19] = var20;
            field2741[var19] = var23;
            field2715[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   @ObfuscatedName("aw")
   public final void method4794(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4755();
      }

      int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var11 = field2733[var1];
      int var12 = field2734[var1];
      int var13 = field2733[var2];
      int var14 = field2734[var2];
      int var15 = field2733[var3];
      int var16 = field2734[var3];
      int var17 = field2733[var4];
      int var18 = field2734[var4];
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
         field2712[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
         modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
         if (this.field2692 > 0) {
            field2695[var20] = var21;
            field2741[var20] = var24;
            field2715[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   @ObfuscatedName("ar")
   @Export("draw0")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field2675[var6] = 0;
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
               int var30;
               if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
                  if (var2) {
                     var15 = modelViewportYs[var8];
                     var16 = modelViewportYs[var9];
                     var30 = modelViewportYs[var10];
                     var18 = var6 + ViewportMouse.ViewportMouse_y;
                     boolean var34;
                     if (var18 < var15 && var18 < var16 && var18 < var30) {
                        var34 = false;
                     } else {
                        var18 = ViewportMouse.ViewportMouse_y - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var30) {
                           var34 = false;
                        } else {
                           var18 = var6 + ViewportMouse.ViewportMouse_x;
                           if (var18 < var11 && var18 < var12 && var18 < var28) {
                              var34 = false;
                           } else {
                              var18 = ViewportMouse.ViewportMouse_x - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var28) {
                                 var34 = false;
                              } else {
                                 var34 = true;
                              }
                           }
                        }
                     }

                     if (var34) {
                        GrandExchangeEvent.method6700(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
                     field2709[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
                        field2708[var7] = false;
                     } else {
                        field2708[var7] = true;
                     }

                     var29 = (field2712[var8] + field2712[var9] + field2712[var10]) / 3 + this.radius;
                     field2673[var29][field2675[var29]++] = (char)var7;
                  }
               } else {
                  var29 = field2695[var8];
                  var15 = field2695[var9];
                  var16 = field2695[var10];
                  var30 = field2741[var8];
                  var18 = field2741[var9];
                  int var19 = field2741[var10];
                  int var20 = field2715[var8];
                  int var21 = field2715[var9];
                  int var22 = field2715[var10];
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
                     field2709[var7] = true;
                     int var26 = (field2712[var8] + field2712[var9] + field2712[var10]) / 3 + this.radius;
                     field2673[var26][field2675[var26]++] = (char)var7;
                  }
               }
            }
         }

         char[] var27;
         char var31;
         if (this.faceRenderPriorities == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2675[var7];
               if (var31 > 0) {
                  var27 = field2673[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     this.drawFace(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2728[var7] = 0;
               field2698[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2675[var7];
               if (var31 > 0) {
                  var27 = field2673[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     char var32 = var27[var10];
                     byte var33 = this.faceRenderPriorities[var32];
                     var28 = field2728[var33]++;
                     field2669[var33][var28] = var32;
                     if (var33 < 10) {
                        int[] var35 = field2698;
                        var35[var33] += var7;
                     } else if (var33 == 10) {
                        field2720[var28] = var7;
                     } else {
                        field2721[var28] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2728[1] > 0 || field2728[2] > 0) {
               var7 = (field2698[1] + field2698[2]) / (field2728[1] + field2728[2]);
            }

            var8 = 0;
            if (field2728[3] > 0 || field2728[4] > 0) {
               var8 = (field2698[3] + field2698[4]) / (field2728[3] + field2728[4]);
            }

            var9 = 0;
            if (field2728[6] > 0 || field2728[8] > 0) {
               var9 = (field2698[8] + field2698[6]) / (field2728[8] + field2728[6]);
            }

            var11 = 0;
            var12 = field2728[10];
            int[] var13 = field2669[10];
            int[] var14 = field2720;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2728[11];
               var13 = field2669[11];
               var14 = field2721;
            }

            if (var11 < var12) {
               var10 = var14[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2669[11]) {
                     var11 = 0;
                     var12 = field2728[11];
                     var13 = field2669[11];
                     var14 = field2721;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2669[11]) {
                     var11 = 0;
                     var12 = field2728[11];
                     var13 = field2669[11];
                     var14 = field2721;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2669[11]) {
                     var11 = 0;
                     var12 = field2728[11];
                     var13 = field2669[11];
                     var14 = field2721;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2728[var15];
               int[] var17 = field2669[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var17[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var13[var11++]);
               if (var11 == var12 && var13 != field2669[11]) {
                  var11 = 0;
                  var13 = field2669[11];
                  var12 = field2728[11];
                  var14 = field2721;
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

   @ObfuscatedName("al")
   @Export("drawFace")
   final void drawFace(int var1) {
      if (field2709[var1]) {
         this.method4713(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.field2495 = field2708[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.Rasterizer3D_alpha = 0;
         } else {
            Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
         }

         this.method4712(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   @ObfuscatedName("at")
   boolean method4711(int var1) {
      return this.overrideAmount > 0 && var1 < this.field2743;
   }

   @ObfuscatedName("aj")
   final void method4712(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var12;
         int var13;
         int var15;
         if (this.field2689 != null && this.field2689[var1] != -1) {
            int var14 = this.field2689[var1] & 255;
            var15 = this.field2693[var14];
            var12 = this.field2694[var14];
            var13 = this.field2717[var14];
         } else {
            var15 = this.indices1[var1];
            var12 = this.indices2[var1];
            var13 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4342(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2695[var15], field2695[var12], field2695[var13], field2741[var15], field2741[var12], field2741[var13], field2715[var15], field2715[var12], field2715[var13], this.faceTextures[var1]);
         } else {
            Rasterizer3D.method4342(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2695[var15], field2695[var12], field2695[var13], field2741[var15], field2741[var12], field2741[var13], field2715[var15], field2715[var12], field2715[var13], this.faceTextures[var1]);
         }
      } else {
         boolean var11 = this.method4711(var1);
         if (this.faceColors3[var1] == -1 && var11) {
            Rasterizer3D.method4340(var2, var3, var4, var5, var6, var7, field2738[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4339(var2, var3, var4, var5, var6, var7, field2738[this.faceColors1[var1]]);
         } else if (var11) {
            Rasterizer3D.method4336(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else {
            Rasterizer3D.method4366(var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }

   }

   @ObfuscatedName("ax")
   final void method4713(int var1) {
      int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
      int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field2715[var5];
      int var9 = field2715[var6];
      int var10 = field2715[var7];
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
         field2691[var4] = modelViewportXs[var5];
         field2724[var4] = modelViewportYs[var5];
         field2726[var4++] = this.faceColors1[var1];
      } else {
         var11 = field2695[var5];
         var12 = field2741[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = field2736[var10 - var8] * (50 - var8);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var7] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2736[var9 - var8] * (50 - var8);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var6] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2691[var4] = modelViewportXs[var6];
         field2724[var4] = modelViewportYs[var6];
         field2726[var4++] = this.faceColors2[var1];
      } else {
         var11 = field2695[var6];
         var12 = field2741[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = field2736[var8 - var9] * (50 - var9);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var5] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2736[var10 - var9] * (50 - var9);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var7] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2691[var4] = modelViewportXs[var7];
         field2724[var4] = modelViewportYs[var7];
         field2726[var4++] = this.faceColors3[var1];
      } else {
         var11 = field2695[var7];
         var12 = field2741[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = field2736[var9 - var10] * (50 - var10);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var6] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2736[var8 - var10] * (50 - var10);
            field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50;
            field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var5] - var12) * var14 >> 16)) / 50;
            field2726[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2691[0];
      var12 = field2691[1];
      var13 = field2691[2];
      var14 = field2724[0];
      int var15 = field2724[1];
      int var16 = field2724[2];
      Rasterizer3D.field2495 = false;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2495 = true;
         }

         this.method4712(var1, var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2691[3] < 0 || field2691[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
            Rasterizer3D.field2495 = true;
         }

         int var18;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var19;
            int var21;
            if (this.field2689 != null && this.field2689[var1] != -1) {
               int var20 = this.field2689[var1] & 255;
               var21 = this.field2693[var20];
               var18 = this.field2694[var20];
               var19 = this.field2717[var20];
            } else {
               var21 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var22 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               Rasterizer3D.method4342(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22);
               Rasterizer3D.method4342(var14, var16, field2724[3], var11, var13, field2691[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22);
            } else {
               Rasterizer3D.method4342(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22);
               Rasterizer3D.method4342(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22);
            }
         } else {
            boolean var17 = this.method4711(var1);
            if (this.faceColors3[var1] == -1 && var17) {
               var18 = field2738[this.faceColors1[var1]];
               Rasterizer3D.method4340(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
               Rasterizer3D.method4340(var14, var16, field2724[3], var11, var13, field2691[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
            } else if (this.faceColors3[var1] == -1) {
               var18 = field2738[this.faceColors1[var1]];
               Rasterizer3D.method4339(var14, var15, var16, var11, var12, var13, var18);
               Rasterizer3D.method4339(var14, var16, field2724[3], var11, var13, field2691[3], var18);
            } else if (var17) {
               Rasterizer3D.method4336(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
               Rasterizer3D.method4336(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
            } else {
               Rasterizer3D.method4366(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2]);
               Rasterizer3D.method4366(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3]);
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILpb;)V"
   )
   void method4714(int var1, class417 var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.field4644[0] * var3 + var2.field4644[4] * var4 + var2.field4644[8] * var5 + var2.field4644[12] * var6);
      this.verticesY[var1] = -((int)(var2.field4644[1] * var3 + var2.field4644[5] * var4 + var2.field4644[9] * var5 + var2.field4644[13] * var6));
      this.verticesZ[var1] = -((int)(var2.field4644[2] * var3 + var2.field4644[6] * var4 + var2.field4644[10] * var5 + var2.field4644[14] * var6));
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lhk;I)V"
   )
   void method4715(class217 var1, int var2) {
      if (this.field2716 != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.field2716[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2699[var3];
               field2703.method7955();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class122 var8 = var1.method4425(var7);
                  if (var8 != null) {
                     field2674.method7936((float)var5[var6] / 255.0F);
                     field2739.method7915(var8.method3003(var2));
                     field2739.method7914(field2674);
                     field2703.method7917(field2739);
                  }
               }

               this.method4714(var3, field2703);
            }
         }

      }
   }

   @ObfuscatedName("cx")
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

                     boolean var27 = var26 || this.field2692 > 0;
                     int var28 = ViewportMouse.ViewportMouse_x;
                     int var30 = ViewportMouse.ViewportMouse_y;
                     boolean var32 = ViewportMouse.ViewportMouse_isInViewport;
                     boolean var35 = var9 != 0L;
                     boolean var36;
                     if (var35) {
                        var36 = (int)(var9 >>> 16 & 1L) == 1;
                        var35 = !var36;
                     }

                     var36 = false;
                     int var42;
                     int var43;
                     int var44;
                     int var45;
                     int var51;
                     int var57;
                     int var58;
                     if (var35 && var32) {
                        boolean var37 = false;
                        if (field2730) {
                           boolean var40 = ViewportMouse.ViewportMouse_isInViewport;
                           boolean var38;
                           if (!var40) {
                              var38 = false;
                           } else {
                              FriendsChat.method7573();
                              AABB var41 = (AABB)this.aabb.get(var1);
                              var42 = var41.xMid + var6;
                              var43 = var7 + var41.yMid;
                              var44 = var8 + var41.zMid;
                              var45 = var41.xMidOffset;
                              int var46 = var41.yMidOffset;
                              int var47 = var41.zMidOffset;
                              int var48 = class148.field1702 - var42;
                              int var49 = GrandExchangeEvent.field4284 - var43;
                              int var50 = ViewportMouse.field2744 - var44;
                              if (Math.abs(var48) > var45 + class172.field1868) {
                                 var38 = false;
                              } else if (Math.abs(var49) > var46 + class137.field1639) {
                                 var38 = false;
                              } else if (Math.abs(var50) > var47 + class151.field1743) {
                                 var38 = false;
                              } else if (Math.abs(var50 * VerticalAlignment.field2071 - var49 * class14.field79) > var46 * class151.field1743 + var47 * class137.field1639) {
                                 var38 = false;
                              } else if (Math.abs(var48 * class14.field79 - var50 * class419.field4661) > var45 * class151.field1743 + var47 * class172.field1868) {
                                 var38 = false;
                              } else if (Math.abs(var49 * class419.field4661 - var48 * VerticalAlignment.field2071) > var45 * class137.field1639 + var46 * class172.field1868) {
                                 var38 = false;
                              } else {
                                 var38 = true;
                              }
                           }

                           var37 = var38;
                        } else {
                           var58 = var12 - var13;
                           if (var58 <= 50) {
                              var58 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var58;
                           } else {
                              var17 /= var14;
                              var16 /= var58;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var58;
                           } else {
                              var21 /= var14;
                              var23 /= var58;
                           }

                           var51 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
                           var57 = var30 - Rasterizer3D.Rasterizer3D_clipMidY;
                           if (var51 > var16 && var51 < var17 && var57 > var23 && var57 < var21) {
                              var37 = true;
                           }
                        }

                        if (var37) {
                           if (this.isSingleTile) {
                              ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
                           } else {
                              var36 = true;
                           }
                        }
                     }

                     int var56 = Rasterizer3D.Rasterizer3D_clipMidX;
                     var58 = Rasterizer3D.Rasterizer3D_clipMidY;
                     var51 = 0;
                     var57 = 0;
                     if (var1 != 0) {
                        var51 = field2733[var1];
                        var57 = field2734[var1];
                     }

                     for(int var54 = 0; var54 < this.verticesCount; ++var54) {
                        var42 = this.verticesX[var54];
                        var43 = this.verticesY[var54];
                        var44 = this.verticesZ[var54];
                        if (var1 != 0) {
                           var45 = var44 * var51 + var42 * var57 >> 16;
                           var44 = var44 * var57 - var42 * var51 >> 16;
                           var42 = var45;
                        }

                        var42 += var6;
                        var43 += var7;
                        var44 += var8;
                        var45 = var44 * var4 + var5 * var42 >> 16;
                        var44 = var5 * var44 - var42 * var4 >> 16;
                        var42 = var45;
                        var45 = var3 * var43 - var44 * var2 >> 16;
                        var44 = var43 * var2 + var3 * var44 >> 16;
                        field2712[var54] = var44 - var12;
                        if (var44 >= 50) {
                           modelViewportXs[var54] = var42 * Rasterizer3D.Rasterizer3D_zoom / var44 + var56;
                           modelViewportYs[var54] = var45 * Rasterizer3D.Rasterizer3D_zoom / var44 + var58;
                        } else {
                           modelViewportXs[var54] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field2695[var54] = var42;
                           field2741[var54] = var45;
                           field2715[var54] = var44;
                        }
                     }

                     try {
                        this.draw0(var25, var36, this.isSingleTile, var9);
                     } catch (Exception var55) {
                     }

                  }
               }
            }
         }
      }
   }
}
