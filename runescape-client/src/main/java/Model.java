import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Model")
public class Model extends Renderable {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("Model_sharedSequenceModel")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("an")
   @Export("Model_sharedSequenceModelFaceAlphas")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("Model_sharedSpotAnimationModel")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("as")
   @Export("Model_sharedSpotAnimationModelFaceAlphas")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   static class438 field2750 = new class438();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   static class438 field2689 = new class438();
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   static class438 field2690 = new class438();
   @ObfuscatedName("bh")
   static boolean[] field2733 = new boolean[6500];
   @ObfuscatedName("bp")
   static boolean[] field2724 = new boolean[6500];
   @ObfuscatedName("bw")
   @Export("modelViewportXs")
   static int[] modelViewportXs = new int[6500];
   @ObfuscatedName("bi")
   @Export("modelViewportYs")
   static int[] modelViewportYs = new int[6500];
   @ObfuscatedName("bk")
   static float[] field2692 = new float[6500];
   @ObfuscatedName("bv")
   static int[] field2726 = new int[6500];
   @ObfuscatedName("bz")
   static int[] field2717 = new int[6500];
   @ObfuscatedName("bm")
   static int[] field2730 = new int[6500];
   @ObfuscatedName("br")
   static int[] field2731 = new int[6500];
   @ObfuscatedName("by")
   static char[] field2725 = new char[6000];
   @ObfuscatedName("bt")
   static char[][] field2734 = new char[6000][512];
   @ObfuscatedName("bl")
   static int[] field2735 = new int[12];
   @ObfuscatedName("cs")
   static int[][] field2714 = new int[12][2000];
   @ObfuscatedName("cu")
   static int[] field2737 = new int[2000];
   @ObfuscatedName("ca")
   static int[] field2738 = new int[2000];
   @ObfuscatedName("cf")
   static int[] field2727 = new int[12];
   @ObfuscatedName("cw")
   static int[] field2740 = new int[10];
   @ObfuscatedName("ch")
   static int[] field2741 = new int[10];
   @ObfuscatedName("cp")
   static int[] field2744 = new int[10];
   @ObfuscatedName("cy")
   static float[] field2743 = new float[10];
   @ObfuscatedName("cd")
   @Export("Model_transformTempX")
   static int Model_transformTempX;
   @ObfuscatedName("cv")
   @Export("Model_transformTempY")
   static int Model_transformTempY;
   @ObfuscatedName("cr")
   @Export("Model_transformTempZ")
   static int Model_transformTempZ;
   @ObfuscatedName("cm")
   static boolean field2747 = true;
   @ObfuscatedName("cb")
   static int[] field2700;
   @ObfuscatedName("cc")
   static int[] field2756;
   @ObfuscatedName("ck")
   static int[] field2752;
   @ObfuscatedName("cq")
   static int[] field2753;
   @ObfuscatedName("cl")
   static final float field2718;
   @ObfuscatedName("ak")
   @Export("verticesCount")
   public int verticesCount = 0;
   @ObfuscatedName("ae")
   @Export("verticesX")
   int[] verticesX;
   @ObfuscatedName("af")
   @Export("verticesY")
   int[] verticesY;
   @ObfuscatedName("ao")
   @Export("verticesZ")
   int[] verticesZ;
   @ObfuscatedName("aa")
   @Export("indicesCount")
   public int indicesCount = 0;
   @ObfuscatedName("aj")
   @Export("indices1")
   int[] indices1;
   @ObfuscatedName("ad")
   @Export("indices2")
   int[] indices2;
   @ObfuscatedName("ac")
   @Export("indices3")
   int[] indices3;
   @ObfuscatedName("ag")
   @Export("faceColors1")
   int[] faceColors1;
   @ObfuscatedName("ar")
   @Export("faceColors2")
   int[] faceColors2;
   @ObfuscatedName("ah")
   @Export("faceColors3")
   int[] faceColors3;
   @ObfuscatedName("az")
   @Export("faceRenderPriorities")
   byte[] faceRenderPriorities;
   @ObfuscatedName("au")
   @Export("faceAlphas")
   byte[] faceAlphas;
   @ObfuscatedName("ai")
   @Export("textureFaces")
   byte[] textureFaces;
   @ObfuscatedName("aq")
   @Export("faceTextures")
   short[] faceTextures;
   @ObfuscatedName("aw")
   public byte field2706 = 0;
   @ObfuscatedName("ay")
   @Export("texIndicesCount")
   public int texIndicesCount = 0;
   @ObfuscatedName("al")
   @Export("texIndices1")
   int[] texIndices1;
   @ObfuscatedName("am")
   @Export("texIndices2")
   int[] texIndices2;
   @ObfuscatedName("bs")
   @Export("texIndices3")
   int[] texIndices3;
   @ObfuscatedName("bc")
   @Export("vertexLabels")
   int[][] vertexLabels;
   @ObfuscatedName("bj")
   @Export("faceLabelsAlpha")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("bo")
   int[][] field2713;
   @ObfuscatedName("bq")
   int[][] field2684;
   @ObfuscatedName("bg")
   @Export("isSingleTile")
   public boolean isSingleTile = false;
   @ObfuscatedName("bf")
   @Export("boundsType")
   int boundsType;
   @ObfuscatedName("bd")
   @Export("bottomY")
   int bottomY;
   @ObfuscatedName("ba")
   @Export("xzRadius")
   int xzRadius;
   @ObfuscatedName("bn")
   @Export("diameter")
   int diameter;
   @ObfuscatedName("bb")
   @Export("radius")
   int radius;
   @ObfuscatedName("bx")
   @Export("aabb")
   HashMap aabb = new HashMap();
   @ObfuscatedName("cn")
   @Export("overrideHue")
   public byte overrideHue;
   @ObfuscatedName("ct")
   @Export("overrideSaturation")
   public byte overrideSaturation;
   @ObfuscatedName("cx")
   @Export("overrideLuminance")
   public byte overrideLuminance;
   @ObfuscatedName("co")
   @Export("overrideAmount")
   public byte overrideAmount;
   @ObfuscatedName("cz")
   public short field2761;

   static {
      field2700 = Rasterizer3D.Rasterizer3D_sine;
      field2756 = Rasterizer3D.Rasterizer3D_cosine;
      field2752 = Rasterizer3D.Rasterizer3D_colorPalette;
      field2753 = Rasterizer3D.field2517;
      field2718 = class137.method3092(50);
   }

   Model() {
   }

   public Model(int var1, int var2, int var3, byte var4) {
      this.method4773(var1, var2, var3);
      this.field2706 = var4;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
   }

   @ObfuscatedSignature(
      descriptor = "([Ljd;I)V"
   )
   public Model(Model[] var1, int var2) {
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
      this.field2706 = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         Model var4 = var1[var3];
         if (var4 != null) {
            this.verticesCount += var4.verticesCount;
            this.indicesCount += var4.indicesCount;
            this.texIndicesCount += var4.texIndicesCount;
            if (this.field2706 == -1) {
               this.field2706 = var4.field2706;
            }
         }
      }

      this.method4773(this.verticesCount, this.indicesCount, this.texIndicesCount);
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.method4782(var1[var3]);
      }

   }

   @ObfuscatedName("at")
   void method4773(int var1, int var2, int var3) {
      this.verticesX = new int[var1];
      this.verticesY = new int[var1];
      this.verticesZ = new int[var1];
      this.indices1 = new int[var2];
      this.indices2 = new int[var2];
      this.indices3 = new int[var2];
      this.faceColors1 = new int[var2];
      this.faceColors2 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.texIndices1 = new int[var3];
         this.texIndices2 = new int[var3];
         this.texIndices3 = new int[var3];
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljd;)V"
   )
   void method4774(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2706 != var1.field2706)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field2706);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.textureFaces == null && var1.textureFaces != null) {
         this.textureFaces = new byte[var2];
         Arrays.fill(this.textureFaces, (byte)-1);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljd;)V"
   )
   public void method4782(Model var1) {
      if (var1 != null) {
         this.method4774(var1);

         int var2;
         for(var2 = 0; var2 < var1.indicesCount; ++var2) {
            this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
            this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
            this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
            this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
            this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
            this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
            if (this.faceRenderPriorities != null) {
               this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2706;
            }

            if (this.faceAlphas != null && var1.faceAlphas != null) {
               this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
            }

            if (this.faceTextures != null) {
               this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
            }

            if (this.textureFaces != null) {
               if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
                  this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
               } else {
                  this.textureFaces[this.indicesCount] = -1;
               }
            }

            ++this.indicesCount;
         }

         for(var2 = 0; var2 < var1.texIndicesCount; ++var2) {
            this.texIndices1[this.texIndicesCount] = this.verticesCount + var1.texIndices1[var2];
            this.texIndices2[this.texIndicesCount] = this.verticesCount + var1.texIndices2[var2];
            this.texIndices3[this.texIndicesCount] = this.verticesCount + var1.texIndices3[var2];
            ++this.texIndicesCount;
         }

         for(var2 = 0; var2 < var1.verticesCount; ++var2) {
            this.verticesX[this.verticesCount] = var1.verticesX[var2];
            this.verticesY[this.verticesCount] = var1.verticesY[var2];
            this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
            ++this.verticesCount;
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Ljd;"
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
               var11.texIndicesCount = this.texIndicesCount;
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
               var11.textureFaces = this.textureFaces;
               var11.faceTextures = this.faceTextures;
               var11.field2706 = this.field2706;
               var11.texIndices1 = this.texIndices1;
               var11.texIndices2 = this.texIndices2;
               var11.texIndices3 = this.texIndices3;
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Z)Ljd;"
   )
   @Export("toSharedSequenceModel")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Z)Ljd;"
   )
   @Export("toSharedSpotAnimationModel")
   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZLjd;[B)Ljd;"
   )
   @Export("buildSharedModel")
   Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.texIndicesCount = this.texIndicesCount;
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
      var2.textureFaces = this.textureFaces;
      var2.faceTextures = this.faceTextures;
      var2.field2706 = this.field2706;
      var2.texIndices1 = this.texIndices1;
      var2.texIndices2 = this.texIndices2;
      var2.texIndices3 = this.texIndices3;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field2713 = this.field2713;
      var2.field2684 = this.field2684;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.overrideAmount = 0;
      return var2;
   }

   @ObfuscatedName("aa")
   @Export("calculateBoundingBox")
   void calculateBoundingBox(int var1) {
      if (!this.aabb.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2756[var1];
         int var9 = field2700[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = Tiles.method2209(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = AABB.method4705(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

   @ObfuscatedName("aj")
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

   @ObfuscatedName("ad")
   void method4781() {
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

   @ObfuscatedName("ac")
   public int method4846() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   @ObfuscatedName("ag")
   @Export("resetBounds")
   public void resetBounds() {
      this.boundsType = 0;
      this.aabb.clear();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Liu;I)V"
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lfz;I)V"
   )
   public void method4785(class136 var1, int var2) {
      Skeleton var3 = var1.field1587;
      class226 var4 = var3.method4507();
      if (var4 != null) {
         var3.method4507().method4456(var1, var2);
         this.method4883(var3.method4507(), var1.method3052());
      }

      if (var1.method3053()) {
         this.method4786(var1, var2);
      }

      this.resetBounds();
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lfz;I)V"
   )
   void method4786(class136 var1, int var2) {
      Skeleton var3 = var1.field1587;

      for(int var4 = 0; var4 < var3.count; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.field1583 != null && var1.field1583[var4] != null && var1.field1583[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            class129 var6 = var1.field1583[var4][0];
            int[] var7 = var3.labels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2975(var2) * 255.0F);
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lid;I)V"
   )
   void method4883(class226 var1, int var2) {
      this.method4807(var1, var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Liu;ILiu;I[I)V"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lir;Lfz;I[ZZZ)V"
   )
   public void method4789(Skeleton var1, class136 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class226 var7 = var1.method4507();
      if (var7 != null) {
         var7.method4457(var2, var3, var4, var5);
         if (var6) {
            this.method4883(var7, var2.method3052());
         }
      }

      if (!var5 && var2.method3053()) {
         this.method4786(var2, var3);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Liu;I[IZ)V"
   )
   public void method4790(Frames var1, int var2, int[] var3, boolean var4) {
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

   @ObfuscatedName("ay")
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
                        var15 = field2700[var14];
                        var16 = field2756[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2700[var12];
                        var16 = field2756[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2700[var13];
                        var16 = field2756[var13];
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

   @ObfuscatedName("al")
   @Export("rotateY90Ccw")
   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("am")
   @Export("rotateY180")
   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   @ObfuscatedName("bs")
   @Export("rotateY270Ccw")
   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bc")
   @Export("rotateZ")
   public void rotateZ(int var1) {
      int var2 = field2700[var1];
      int var3 = field2756[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bj")
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

   @ObfuscatedName("bo")
   @Export("scale")
   public void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bq")
   public final void method4798(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4781();
      }

      int var8 = Rasterizer3D.getClipMidX();
      int var9 = Rasterizer3D.getClipMidY();
      int var10 = field2700[var1];
      int var11 = field2756[var1];
      int var12 = field2700[var2];
      int var13 = field2756[var2];
      int var14 = field2700[var3];
      int var15 = field2756[var3];
      int var16 = field2700[var4];
      int var17 = field2756[var4];
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
         field2726[var19] = var22 - var18;
         modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
         modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
         field2692[var19] = class137.method3092(var22);
         if (this.texIndicesCount > 0) {
            field2717[var19] = var20;
            field2730[var19] = var23;
            field2731[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   @ObfuscatedName("bg")
   public final void method4799(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4781();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field2700[var1];
      int var12 = field2756[var1];
      int var13 = field2700[var2];
      int var14 = field2756[var2];
      int var15 = field2700[var3];
      int var16 = field2756[var3];
      int var17 = field2700[var4];
      int var18 = field2756[var4];
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
         field2726[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
         field2692[var20] = class137.method3092(var8);
         if (this.texIndicesCount > 0) {
            field2717[var20] = var21;
            field2730[var20] = var24;
            field2731[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   @ObfuscatedName("bf")
   @Export("draw0")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field2725[var6] = 0;
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
                  if (var2 && ClientPacket.method5662(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
                     class12.method163(var4);
                     var2 = false;
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
                     field2724[var7] = false;
                     var29 = Rasterizer3D.method4388();
                     if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
                        field2733[var7] = false;
                     } else {
                        field2733[var7] = true;
                     }

                     var15 = (field2726[var8] + field2726[var9] + field2726[var10]) / 3 + this.radius;
                     field2734[var15][field2725[var15]++] = (char)var7;
                  }
               } else {
                  var29 = field2717[var8];
                  var15 = field2717[var9];
                  var16 = field2717[var10];
                  int var30 = field2730[var8];
                  var18 = field2730[var9];
                  int var19 = field2730[var10];
                  int var20 = field2731[var8];
                  int var21 = field2731[var9];
                  int var22 = field2731[var10];
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
                     field2724[var7] = true;
                     int var26 = (field2726[var8] + field2726[var9] + field2726[var10]) / 3 + this.radius;
                     field2734[var26][field2725[var26]++] = (char)var7;
                  }
               }
            }
         }

         char[] var27;
         char var31;
         if (this.faceRenderPriorities == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2725[var7];
               if (var31 > 0) {
                  var27 = field2734[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     this.drawFace(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2735[var7] = 0;
               field2727[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2725[var7];
               if (var31 > 0) {
                  var27 = field2734[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     char var32 = var27[var10];
                     byte var33 = this.faceRenderPriorities[var32];
                     var28 = field2735[var33]++;
                     field2714[var33][var28] = var32;
                     if (var33 < 10) {
                        int[] var34 = field2727;
                        var34[var33] += var7;
                     } else if (var33 == 10) {
                        field2737[var28] = var7;
                     } else {
                        field2738[var28] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2735[1] > 0 || field2735[2] > 0) {
               var7 = (field2727[1] + field2727[2]) / (field2735[1] + field2735[2]);
            }

            var8 = 0;
            if (field2735[3] > 0 || field2735[4] > 0) {
               var8 = (field2727[3] + field2727[4]) / (field2735[3] + field2735[4]);
            }

            var9 = 0;
            if (field2735[6] > 0 || field2735[8] > 0) {
               var9 = (field2727[8] + field2727[6]) / (field2735[8] + field2735[6]);
            }

            var11 = 0;
            var12 = field2735[10];
            int[] var13 = field2714[10];
            int[] var14 = field2737;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2735[11];
               var13 = field2714[11];
               var14 = field2738;
            }

            if (var11 < var12) {
               var10 = var14[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2714[11]) {
                     var11 = 0;
                     var12 = field2735[11];
                     var13 = field2714[11];
                     var14 = field2738;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2714[11]) {
                     var11 = 0;
                     var12 = field2735[11];
                     var13 = field2714[11];
                     var14 = field2738;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2714[11]) {
                     var11 = 0;
                     var12 = field2735[11];
                     var13 = field2714[11];
                     var14 = field2738;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2735[var15];
               int[] var17 = field2714[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var17[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var13[var11++]);
               if (var11 == var12 && var13 != field2714[11]) {
                  var11 = 0;
                  var13 = field2714[11];
                  var12 = field2735[11];
                  var14 = field2738;
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

   @ObfuscatedName("bd")
   @Export("drawFace")
   final void drawFace(int var1) {
      if (field2724[var1]) {
         this.method4862(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.clips.field2798 = field2733[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.clips.field2793 = 0;
         } else {
            Rasterizer3D.clips.field2793 = this.faceAlphas[var1] & 255;
         }

         this.method4779(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2692[var2], field2692[var3], field2692[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   @ObfuscatedName("ba")
   boolean method4803(int var1) {
      return this.overrideAmount > 0 && var1 < this.field2761;
   }

   @ObfuscatedName("bn")
   final void method4779(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            int var17 = this.textureFaces[var1] & 255;
            var18 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var18 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4391(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2717[var18], field2717[var15], field2717[var16], field2730[var18], field2730[var15], field2730[var16], field2731[var18], field2731[var15], field2731[var16], this.faceTextures[var1]);
         } else {
            Rasterizer3D.method4391(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2717[var18], field2717[var15], field2717[var16], field2730[var18], field2730[var15], field2730[var16], field2731[var18], field2731[var15], field2731[var16], this.faceTextures[var1]);
         }
      } else {
         boolean var14 = this.method4803(var1);
         if (this.faceColors3[var1] == -1 && var14) {
            Rasterizer3D.method4394(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2752[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.method4390(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2752[this.faceColors1[var1]]);
         } else if (var14) {
            Rasterizer3D.method4393(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
         } else {
            Rasterizer3D.method4389(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   @ObfuscatedName("bb")
   final void method4862(int var1) {
      int var2 = Rasterizer3D.getClipMidX();
      int var3 = Rasterizer3D.getClipMidY();
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field2731[var5];
      int var9 = field2731[var6];
      int var10 = field2731[var7];
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.field2793 = 0;
      } else {
         Rasterizer3D.clips.field2793 = this.faceAlphas[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2740[var4] = modelViewportXs[var5];
         field2741[var4] = modelViewportYs[var5];
         field2743[var4] = field2692[var7];
         field2744[var4++] = this.faceColors1[var1];
      } else {
         var11 = field2717[var5];
         var12 = field2730[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = field2753[var10 - var8] * (50 - var8);
            field2740[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2743[var4] = field2718;
            field2744[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2753[var9 - var8] * (50 - var8);
            field2740[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2743[var4] = field2718;
            field2744[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2740[var4] = modelViewportXs[var6];
         field2741[var4] = modelViewportYs[var6];
         field2743[var4] = field2692[var7];
         field2744[var4++] = this.faceColors2[var1];
      } else {
         var11 = field2717[var6];
         var12 = field2730[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = field2753[var8 - var9] * (50 - var9);
            field2740[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2743[var4] = field2718;
            field2744[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2753[var10 - var9] * (50 - var9);
            field2740[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2744[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2740[var4] = modelViewportXs[var7];
         field2741[var4] = modelViewportYs[var7];
         field2743[var4] = field2692[var7];
         field2744[var4++] = this.faceColors3[var1];
      } else {
         var11 = field2717[var7];
         var12 = field2730[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = field2753[var9 - var10] * (50 - var10);
            field2740[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2743[var4] = field2718;
            field2744[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2753[var8 - var10] * (50 - var10);
            field2740[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2741[var4] = var3 + (var12 + ((field2730[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field2743[var4] = field2718;
            field2744[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2740[0];
      var12 = field2740[1];
      var13 = field2740[2];
      var14 = field2741[0];
      int var15 = field2741[1];
      int var16 = field2741[2];
      float var17 = field2743[0];
      float var18 = field2743[1];
      float var19 = field2743[2];
      Rasterizer3D.clips.field2798 = false;
      int var20 = Rasterizer3D.method4388();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            Rasterizer3D.clips.field2798 = true;
         }

         this.method4779(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2740[3] < 0 || field2740[3] > var20) {
            Rasterizer3D.clips.field2798 = true;
         }

         int var22;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var23;
            int var25;
            if (this.textureFaces != null && this.textureFaces[var1] != -1) {
               int var24 = this.textureFaces[var1] & 255;
               var25 = this.texIndices1[var24];
               var22 = this.texIndices2[var24];
               var23 = this.texIndices3[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               Rasterizer3D.method4391(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26);
               Rasterizer3D.method4391(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26);
            } else {
               Rasterizer3D.method4391(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26);
               Rasterizer3D.method4391(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], field2744[0], field2744[2], field2744[3], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26);
            }
         } else {
            boolean var21 = this.method4803(var1);
            if (this.faceColors3[var1] == -1 && var21) {
               var22 = field2752[this.faceColors1[var1]];
               Rasterizer3D.method4394(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
               Rasterizer3D.method4394(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
            } else if (this.faceColors3[var1] == -1) {
               var22 = field2752[this.faceColors1[var1]];
               Rasterizer3D.method4390(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               Rasterizer3D.method4390(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], var22);
            } else if (var21) {
               Rasterizer3D.method4393(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
               Rasterizer3D.method4393(var14, var16, field2741[3], var11, var13, field2740[3], 0.0F, 0.0F, 0.0F, field2744[0], field2744[2], field2744[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
            } else {
               Rasterizer3D.method4389(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]);
               Rasterizer3D.method4389(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], field2744[0], field2744[2], field2744[3]);
            }
         }
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ILqp;)V"
   )
   void method4806(int var1, class438 var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.field4685[0] * var3 + var2.field4685[4] * var4 + var2.field4685[8] * var5 + var2.field4685[12] * var6);
      this.verticesY[var1] = -((int)(var2.field4685[1] * var3 + var2.field4685[5] * var4 + var2.field4685[9] * var5 + var2.field4685[13] * var6));
      this.verticesZ[var1] = -((int)(var2.field4685[2] * var3 + var2.field4685[6] * var4 + var2.field4685[10] * var5 + var2.field4685[14] * var6));
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Lid;I)V"
   )
   void method4807(class226 var1, int var2) {
      if (this.field2713 != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.field2713[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2684[var3];
               field2750.method8099();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class126 var8 = var1.method4454(var7);
                  if (var8 != null) {
                     field2689.method8101((float)var5[var6] / 255.0F);
                     field2690.method8096(var8.method2928(var2));
                     field2690.method8104(field2689);
                     field2750.method8103(field2690);
                  }
               }

               this.method4806(var3, field2750);
            }
         }

      }
   }

   @ObfuscatedName("dy")
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
         int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
         if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2()) {
            int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
            if (var17 / var14 > Rasterizer3D.method4377()) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.xzRadius >> 16;
               int var20 = (var3 * this.bottomY >> 16) + var19;
               int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
               if (var21 / var14 > Rasterizer3D.method4418()) {
                  int var22 = (var3 * super.height >> 16) + var19;
                  int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
                  if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
                     int var24 = var13 + (var2 * super.height >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.texIndicesCount > 0;
                     int var28 = VertexNormal.method4920();
                     int var29 = ViewportMouse.ViewportMouse_y;
                     boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
                     boolean var33 = GameEngine.method563(var9);
                     boolean var34 = false;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     int var49;
                     int var53;
                     int var54;
                     if (var33 && var31) {
                        boolean var35 = false;
                        if (field2747) {
                           boolean var38 = ViewportMouse.ViewportMouse_isInViewport;
                           boolean var36;
                           if (!var38) {
                              var36 = false;
                           } else {
                              UserComparator9.method2877();
                              AABB var39 = (AABB)this.aabb.get(var1);
                              var40 = var39.xMid + var6;
                              var41 = var7 + var39.yMid;
                              var42 = var8 + var39.zMid;
                              var43 = var39.xMidOffset;
                              int var44 = var39.yMidOffset;
                              int var45 = var39.zMidOffset;
                              int var46 = class177.field1853 - var40;
                              int var47 = ViewportMouse.field2766 - var41;
                              int var48 = ViewportMouse.field2767 - var42;
                              if (Math.abs(var46) > var43 + class393.field4436) {
                                 var36 = false;
                              } else if (Math.abs(var47) > var44 + class337.field3782) {
                                 var36 = false;
                              } else if (Math.abs(var48) > var45 + class136.field1585) {
                                 var36 = false;
                              } else if (Math.abs(var48 * class1.field4 - var47 * VarpDefinition.field1905) > var45 * class337.field3782 + var44 * class136.field1585) {
                                 var36 = false;
                              } else if (Math.abs(var46 * VarpDefinition.field1905 - var48 * ViewportMouse.field2762) > var45 * class393.field4436 + var43 * class136.field1585) {
                                 var36 = false;
                              } else if (Math.abs(var47 * ViewportMouse.field2762 - var46 * class1.field4) > var44 * class393.field4436 + var43 * class337.field3782) {
                                 var36 = false;
                              } else {
                                 var36 = true;
                              }
                           }

                           var35 = var36;
                        } else {
                           var54 = var12 - var13;
                           if (var54 <= 50) {
                              var54 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var54;
                           } else {
                              var17 /= var14;
                              var16 /= var54;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var54;
                           } else {
                              var21 /= var14;
                              var23 /= var54;
                           }

                           var49 = var28 - Rasterizer3D.getClipMidX();
                           var53 = var29 - Rasterizer3D.getClipMidY();
                           if (var49 > var16 && var49 < var17 && var53 > var23 && var53 < var21) {
                              var35 = true;
                           }
                        }

                        if (var35) {
                           if (this.isSingleTile) {
                              class12.method163(var9);
                           } else {
                              var34 = true;
                           }
                        }
                     }

                     int var52 = Rasterizer3D.getClipMidX();
                     var54 = Rasterizer3D.getClipMidY();
                     var49 = 0;
                     var53 = 0;
                     if (var1 != 0) {
                        var49 = field2700[var1];
                        var53 = field2756[var1];
                     }

                     for(int var50 = 0; var50 < this.verticesCount; ++var50) {
                        var40 = this.verticesX[var50];
                        var41 = this.verticesY[var50];
                        var42 = this.verticesZ[var50];
                        if (var1 != 0) {
                           var43 = var42 * var49 + var40 * var53 >> 16;
                           var42 = var42 * var53 - var40 * var49 >> 16;
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
                        field2726[var50] = var42 - var12;
                        if (var42 >= 50) {
                           modelViewportXs[var50] = var52 + var40 * Rasterizer3D.get3dZoom() / var42;
                           modelViewportYs[var50] = var54 + var43 * Rasterizer3D.get3dZoom() / var42;
                           field2692[var50] = class137.method3092(var42);
                        } else {
                           modelViewportXs[var50] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field2717[var50] = var40;
                           field2730[var50] = var43;
                           field2731[var50] = var42;
                        }
                     }

                     try {
                        this.draw0(var25, var34, this.isSingleTile, var9);
                     } catch (Exception var51) {
                     }

                  }
               }
            }
         }
      }
   }
}
