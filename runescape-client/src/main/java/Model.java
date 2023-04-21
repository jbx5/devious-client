import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("Model")
public class Model extends Renderable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("Model_sharedSequenceModel")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("an")
   @Export("Model_sharedSequenceModelFaceAlphas")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("Model_sharedSpotAnimationModel")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("ac")
   @Export("Model_sharedSpotAnimationModelFaceAlphas")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static class425 field2689 = new class425();
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static class425 field2690 = new class425();
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static class425 field2691 = new class425();
   @ObfuscatedName("bs")
   static boolean[] field2724 = new boolean[6500];
   @ObfuscatedName("br")
   static boolean[] field2725 = new boolean[6500];
   @ObfuscatedName("bg")
   @Export("modelViewportXs")
   static int[] modelViewportXs = new int[6500];
   @ObfuscatedName("bu")
   @Export("modelViewportYs")
   static int[] modelViewportYs = new int[6500];
   @ObfuscatedName("bf")
   static float[] field2728 = new float[6500];
   @ObfuscatedName("bq")
   static int[] field2729 = new int[6500];
   @ObfuscatedName("ba")
   static int[] field2716 = new int[6500];
   @ObfuscatedName("bv")
   static int[] field2731 = new int[6500];
   @ObfuscatedName("bl")
   static int[] field2760 = new int[6500];
   @ObfuscatedName("bc")
   static char[] field2754 = new char[6000];
   @ObfuscatedName("bh")
   static char[][] field2735 = new char[6000][512];
   @ObfuscatedName("bw")
   static int[] field2736 = new int[12];
   @ObfuscatedName("ce")
   static int[][] field2700 = new int[12][2000];
   @ObfuscatedName("ci")
   static int[] field2738 = new int[2000];
   @ObfuscatedName("cs")
   static int[] field2739 = new int[2000];
   @ObfuscatedName("cc")
   static int[] field2740 = new int[12];
   @ObfuscatedName("cn")
   static int[] field2741 = new int[10];
   @ObfuscatedName("ca")
   static int[] field2742 = new int[10];
   @ObfuscatedName("cu")
   static int[] field2743 = new int[10];
   @ObfuscatedName("ck")
   static float[] field2705 = new float[10];
   @ObfuscatedName("cq")
   @Export("Model_transformTempX")
   static int Model_transformTempX;
   @ObfuscatedName("cm")
   @Export("Model_transformTempY")
   static int Model_transformTempY;
   @ObfuscatedName("cf")
   @Export("Model_transformTempZ")
   static int Model_transformTempZ;
   @ObfuscatedName("cl")
   static boolean field2737 = true;
   @ObfuscatedName("cy")
   static int[] field2749;
   @ObfuscatedName("cx")
   static int[] field2687;
   @ObfuscatedName("cv")
   static int[] field2695;
   @ObfuscatedName("cb")
   static int[] field2732;
   @ObfuscatedName("cw")
   static final float field2757;
   @ObfuscatedName("al")
   @Export("verticesCount")
   public int verticesCount = 0;
   @ObfuscatedName("at")
   @Export("verticesX")
   int[] verticesX;
   @ObfuscatedName("aa")
   @Export("verticesY")
   int[] verticesY;
   @ObfuscatedName("ay")
   @Export("verticesZ")
   int[] verticesZ;
   @ObfuscatedName("ao")
   @Export("indicesCount")
   public int indicesCount = 0;
   @ObfuscatedName("ax")
   @Export("indices1")
   int[] indices1;
   @ObfuscatedName("ai")
   @Export("indices2")
   int[] indices2;
   @ObfuscatedName("ag")
   @Export("indices3")
   int[] indices3;
   @ObfuscatedName("ah")
   @Export("faceColors1")
   int[] faceColors1;
   @ObfuscatedName("av")
   @Export("faceColors2")
   int[] faceColors2;
   @ObfuscatedName("ar")
   @Export("faceColors3")
   int[] faceColors3;
   @ObfuscatedName("am")
   @Export("faceRenderPriorities")
   byte[] faceRenderPriorities;
   @ObfuscatedName("as")
   @Export("faceAlphas")
   byte[] faceAlphas;
   @ObfuscatedName("aj")
   @Export("textureFaces")
   byte[] textureFaces;
   @ObfuscatedName("ak")
   @Export("faceTextures")
   short[] faceTextures;
   @ObfuscatedName("az")
   public byte field2707 = 0;
   @ObfuscatedName("ad")
   @Export("texIndicesCount")
   public int texIndicesCount = 0;
   @ObfuscatedName("ae")
   @Export("texIndices1")
   int[] texIndices1;
   @ObfuscatedName("ap")
   @Export("texIndices2")
   int[] texIndices2;
   @ObfuscatedName("by")
   @Export("texIndices3")
   int[] texIndices3;
   @ObfuscatedName("bb")
   @Export("vertexLabels")
   int[][] vertexLabels;
   @ObfuscatedName("bi")
   @Export("faceLabelsAlpha")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("be")
   int[][] field2711;
   @ObfuscatedName("bk")
   int[][] field2715;
   @ObfuscatedName("bx")
   @Export("isSingleTile")
   public boolean isSingleTile = false;
   @ObfuscatedName("bo")
   @Export("boundsType")
   int boundsType;
   @ObfuscatedName("bz")
   @Export("bottomY")
   int bottomY;
   @ObfuscatedName("bm")
   @Export("xzRadius")
   int xzRadius;
   @ObfuscatedName("bd")
   @Export("diameter")
   int diameter;
   @ObfuscatedName("bt")
   @Export("radius")
   int radius;
   @ObfuscatedName("bj")
   @Export("aabb")
   HashMap aabb = new HashMap();
   @ObfuscatedName("cj")
   @Export("overrideHue")
   public byte overrideHue;
   @ObfuscatedName("ch")
   @Export("overrideSaturation")
   public byte overrideSaturation;
   @ObfuscatedName("ct")
   @Export("overrideLuminance")
   public byte overrideLuminance;
   @ObfuscatedName("cp")
   @Export("overrideAmount")
   public byte overrideAmount;
   @ObfuscatedName("cd")
   public short field2755;

   static {
      field2749 = Rasterizer3D.Rasterizer3D_sine;
      field2687 = Rasterizer3D.Rasterizer3D_cosine;
      field2695 = Rasterizer3D.Rasterizer3D_colorPalette;
      field2732 = Rasterizer3D.field2513;
      field2757 = NPC.method2626(50);
   }

   Model() {
   }

   public Model(int var1, int var2, int var3, byte var4) {
      this.method4824(var1, var2, var3);
      this.field2707 = var4;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
   }

   @ObfuscatedSignature(
      descriptor = "([Lit;I)V"
   )
   public Model(Model[] var1, int var2) {
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
      this.field2707 = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         Model var4 = var1[var3];
         if (var4 != null) {
            this.verticesCount += var4.verticesCount;
            this.indicesCount += var4.indicesCount;
            this.texIndicesCount += var4.texIndicesCount;
            if (this.field2707 == -1) {
               this.field2707 = var4.field2707;
            }
         }
      }

      this.method4824(this.verticesCount, this.indicesCount, this.texIndicesCount);
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.method4862(var1[var3]);
      }

   }

   @ObfuscatedName("af")
   void method4824(int var1, int var2, int var3) {
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lit;)V"
   )
   void method4749(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2707 != var1.field2707)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field2707);
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lit;)V"
   )
   public void method4862(Model var1) {
      if (var1 != null) {
         this.method4749(var1);

         int var2;
         for(var2 = 0; var2 < var1.indicesCount; ++var2) {
            this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
            this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
            this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
            this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
            this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
            this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
            if (this.faceRenderPriorities != null) {
               this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2707;
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Lit;"
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
               var11.field2707 = this.field2707;
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Z)Lit;"
   )
   @Export("toSharedSequenceModel")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Z)Lit;"
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
      descriptor = "(ZLit;[B)Lit;"
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
      var2.field2707 = this.field2707;
      var2.texIndices1 = this.texIndices1;
      var2.texIndices2 = this.texIndices2;
      var2.texIndices3 = this.texIndices3;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field2711 = this.field2711;
      var2.field2715 = this.field2715;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.overrideAmount = 0;
      return var2;
   }

   @ObfuscatedName("ax")
   @Export("calculateBoundingBox")
   void calculateBoundingBox(int var1) {
      if (!this.aabb.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2687[var1];
         int var9 = field2749[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = class143.method3237(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = ClanChannel.method3439(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

   @ObfuscatedName("ai")
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

   @ObfuscatedName("ag")
   void method4857() {
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

   @ObfuscatedName("ah")
   public int method4762() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   @ObfuscatedName("av")
   @Export("resetBounds")
   public void resetBounds() {
      this.boundsType = 0;
      this.aabb.clear();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lio;I)V"
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lfh;I)V"
   )
   public void method4761(class133 var1, int var2) {
      Skeleton var3 = var1.field1590;
      class219 var4 = var3.method4517();
      if (var4 != null) {
         var3.method4517().method4457(var1, var2);
         this.method4763(var3.method4517(), var1.method3141());
      }

      if (var1.method3136()) {
         this.method4771(var1, var2);
      }

      this.resetBounds();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lfh;I)V"
   )
   void method4771(class133 var1, int var2) {
      Skeleton var3 = var1.field1590;

      for(int var4 = 0; var4 < var3.count; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.field1592 != null && var1.field1592[var4] != null && var1.field1592[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            class125 var6 = var1.field1592[var4][0];
            int[] var7 = var3.labels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3062(var2) * 255.0F);
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lic;I)V"
   )
   void method4763(class219 var1, int var2) {
      this.method4783(var1, var2);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lio;ILio;I[I)V"
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lik;Lfh;I[ZZZ)V"
   )
   public void method4804(Skeleton var1, class133 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class219 var7 = var1.method4517();
      if (var7 != null) {
         var7.method4474(var2, var3, var4, var5);
         if (var6) {
            this.method4763(var7, var2.method3141());
         }
      }

      if (!var5 && var2.method3136()) {
         this.method4771(var2, var3);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lio;I[IZ)V"
   )
   public void method4766(Frames var1, int var2, int[] var3, boolean var4) {
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

   @ObfuscatedName("ae")
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
                        var15 = field2749[var14];
                        var16 = field2687[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2749[var12];
                        var16 = field2687[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2749[var13];
                        var16 = field2687[var13];
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

   @ObfuscatedName("ap")
   @Export("rotateY90Ccw")
   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("by")
   @Export("rotateY180")
   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   @ObfuscatedName("bb")
   @Export("rotateY270Ccw")
   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bi")
   @Export("rotateZ")
   public void rotateZ(int var1) {
      int var2 = field2749[var1];
      int var3 = field2687[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   @ObfuscatedName("be")
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

   @ObfuscatedName("bk")
   @Export("scale")
   public void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.resetBounds();
   }

   @ObfuscatedName("bx")
   public final void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4857();
      }

      int var8 = TaskHandler.getClipMidX();
      int var9 = class12.getClipMidY();
      int var10 = field2749[var1];
      int var11 = field2687[var1];
      int var12 = field2749[var2];
      int var13 = field2687[var2];
      int var14 = field2749[var3];
      int var15 = field2687[var3];
      int var16 = field2749[var4];
      int var17 = field2687[var4];
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
         field2729[var19] = var22 - var18;
         modelViewportXs[var19] = var8 + var20 * UserComparator7.get3dZoom() / var22;
         modelViewportYs[var19] = var9 + var23 * UserComparator7.get3dZoom() / var22;
         field2728[var19] = NPC.method2626(var22);
         if (this.texIndicesCount > 0) {
            field2716[var19] = var20;
            field2731[var19] = var23;
            field2760[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   @ObfuscatedName("bo")
   public final void method4775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.method4857();
      }

      int var9 = TaskHandler.getClipMidX();
      int var10 = class12.getClipMidY();
      int var11 = field2749[var1];
      int var12 = field2687[var1];
      int var13 = field2749[var2];
      int var14 = field2687[var2];
      int var15 = field2749[var3];
      int var16 = field2687[var3];
      int var17 = field2749[var4];
      int var18 = field2687[var4];
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
         field2729[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * UserComparator7.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var24 * UserComparator7.get3dZoom() / var8;
         field2728[var20] = NPC.method2626(var8);
         if (this.texIndicesCount > 0) {
            field2716[var20] = var21;
            field2731[var20] = var24;
            field2760[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   @ObfuscatedName("bz")
   @Export("draw0")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field2754[var6] = 0;
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
                        GraphicsObject.method2016(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
                     field2725[var7] = false;
                     var29 = class6.method46();
                     if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
                        field2724[var7] = false;
                     } else {
                        field2724[var7] = true;
                     }

                     var15 = (field2729[var8] + field2729[var9] + field2729[var10]) / 3 + this.radius;
                     field2735[var15][field2754[var15]++] = (char)var7;
                  }
               } else {
                  var29 = field2716[var8];
                  var15 = field2716[var9];
                  var16 = field2716[var10];
                  var30 = field2731[var8];
                  var18 = field2731[var9];
                  int var19 = field2731[var10];
                  int var20 = field2760[var8];
                  int var21 = field2760[var9];
                  int var22 = field2760[var10];
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
                     field2725[var7] = true;
                     int var26 = (field2729[var8] + field2729[var9] + field2729[var10]) / 3 + this.radius;
                     field2735[var26][field2754[var26]++] = (char)var7;
                  }
               }
            }
         }

         char[] var27;
         char var31;
         if (this.faceRenderPriorities == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2754[var7];
               if (var31 > 0) {
                  var27 = field2735[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     this.drawFace(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2736[var7] = 0;
               field2740[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var31 = field2754[var7];
               if (var31 > 0) {
                  var27 = field2735[var7];

                  for(var10 = 0; var10 < var31; ++var10) {
                     char var32 = var27[var10];
                     byte var33 = this.faceRenderPriorities[var32];
                     var28 = field2736[var33]++;
                     field2700[var33][var28] = var32;
                     if (var33 < 10) {
                        int[] var35 = field2740;
                        var35[var33] += var7;
                     } else if (var33 == 10) {
                        field2738[var28] = var7;
                     } else {
                        field2739[var28] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2736[1] > 0 || field2736[2] > 0) {
               var7 = (field2740[1] + field2740[2]) / (field2736[1] + field2736[2]);
            }

            var8 = 0;
            if (field2736[3] > 0 || field2736[4] > 0) {
               var8 = (field2740[3] + field2740[4]) / (field2736[3] + field2736[4]);
            }

            var9 = 0;
            if (field2736[6] > 0 || field2736[8] > 0) {
               var9 = (field2740[8] + field2740[6]) / (field2736[8] + field2736[6]);
            }

            var11 = 0;
            var12 = field2736[10];
            int[] var13 = field2700[10];
            int[] var14 = field2738;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2736[11];
               var13 = field2700[11];
               var14 = field2739;
            }

            if (var11 < var12) {
               var10 = var14[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2700[11]) {
                     var11 = 0;
                     var12 = field2736[11];
                     var13 = field2700[11];
                     var14 = field2739;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2700[11]) {
                     var11 = 0;
                     var12 = field2736[11];
                     var13 = field2700[11];
                     var14 = field2739;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.drawFace(var13[var11++]);
                  if (var11 == var12 && var13 != field2700[11]) {
                     var11 = 0;
                     var12 = field2736[11];
                     var13 = field2700[11];
                     var14 = field2739;
                  }

                  if (var11 < var12) {
                     var10 = var14[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2736[var15];
               int[] var17 = field2700[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var17[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var13[var11++]);
               if (var11 == var12 && var13 != field2700[11]) {
                  var11 = 0;
                  var13 = field2700[11];
                  var12 = field2736[11];
                  var14 = field2739;
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

   @ObfuscatedName("bm")
   @Export("drawFace")
   final void drawFace(int var1) {
      if (field2725[var1]) {
         this.method4791(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.clips.field2798 = field2724[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.clips.field2788 = 0;
         } else {
            Rasterizer3D.clips.field2788 = this.faceAlphas[var1] & 255;
         }

         this.method4780(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2728[var2], field2728[var3], field2728[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   @ObfuscatedName("bd")
   boolean method4779(int var1) {
      return this.overrideAmount > 0 && var1 < this.field2755;
   }

   @ObfuscatedName("bt")
   final void method4780(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var20;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            var17 = this.textureFaces[var1] & 255;
            var20 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var20 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            DevicePcmPlayerProvider.method322(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2716[var20], field2716[var15], field2716[var16], field2731[var20], field2731[var15], field2731[var16], field2760[var20], field2760[var15], field2760[var16], this.faceTextures[var1]);
         } else {
            DevicePcmPlayerProvider.method322(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2716[var20], field2716[var15], field2716[var16], field2731[var20], field2731[var15], field2731[var16], field2760[var20], field2760[var15], field2760[var16], this.faceTextures[var1]);
         }
      } else {
         boolean var14 = this.method4779(var1);
         byte var18;
         if (this.faceColors3[var1] == -1 && var14) {
            var15 = field2695[this.faceColors1[var1]];
            var16 = this.overrideHue;
            var17 = this.overrideSaturation;
            var18 = this.overrideLuminance;
            byte var19 = this.overrideAmount;
            Rasterizer3D.field2519.method4512(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19);
         } else if (this.faceColors3[var1] == -1) {
            class144.method3256(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2695[this.faceColors1[var1]]);
         } else if (var14) {
            var15 = this.overrideHue;
            var16 = this.overrideSaturation;
            var17 = this.overrideLuminance;
            var18 = this.overrideAmount;
            Rasterizer3D.field2519.method4478(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18);
         } else {
            BoundaryObject.method5010(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   @ObfuscatedName("bj")
   final void method4791(int var1) {
      int var2 = TaskHandler.getClipMidX();
      int var3 = class12.getClipMidY();
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field2760[var5];
      int var9 = field2760[var6];
      int var10 = field2760[var7];
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.field2788 = 0;
      } else {
         Rasterizer3D.clips.field2788 = this.faceAlphas[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2741[var4] = modelViewportXs[var5];
         field2742[var4] = modelViewportYs[var5];
         field2705[var4] = field2728[var7];
         field2743[var4++] = this.faceColors1[var1];
      } else {
         var11 = field2716[var5];
         var12 = field2731[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = field2732[var10 - var8] * (50 - var8);
            field2741[var4] = var2 + (var11 + ((field2716[var7] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var7] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2705[var4] = field2757;
            field2743[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2732[var9 - var8] * (50 - var8);
            field2741[var4] = var2 + (var11 + ((field2716[var6] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var6] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2705[var4] = field2757;
            field2743[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2741[var4] = modelViewportXs[var6];
         field2742[var4] = modelViewportYs[var6];
         field2705[var4] = field2728[var7];
         field2743[var4++] = this.faceColors2[var1];
      } else {
         var11 = field2716[var6];
         var12 = field2731[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = field2732[var8 - var9] * (50 - var9);
            field2741[var4] = var2 + (var11 + ((field2716[var5] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var5] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2705[var4] = field2757;
            field2743[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2732[var10 - var9] * (50 - var9);
            field2741[var4] = var2 + (var11 + ((field2716[var7] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var7] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2743[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2741[var4] = modelViewportXs[var7];
         field2742[var4] = modelViewportYs[var7];
         field2705[var4] = field2728[var7];
         field2743[var4++] = this.faceColors3[var1];
      } else {
         var11 = field2716[var7];
         var12 = field2731[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = field2732[var9 - var10] * (50 - var10);
            field2741[var4] = var2 + (var11 + ((field2716[var6] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var6] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2705[var4] = field2757;
            field2743[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2732[var8 - var10] * (50 - var10);
            field2741[var4] = var2 + (var11 + ((field2716[var5] - var11) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2742[var4] = var3 + (var12 + ((field2731[var5] - var12) * var14 >> 16)) * UserComparator7.get3dZoom() / 50;
            field2705[var4] = field2757;
            field2743[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2741[0];
      var12 = field2741[1];
      var13 = field2741[2];
      var14 = field2742[0];
      int var15 = field2742[1];
      int var16 = field2742[2];
      float var17 = field2705[0];
      float var18 = field2705[1];
      float var19 = field2705[2];
      Rasterizer3D.clips.field2798 = false;
      int var20 = class6.method46();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            Rasterizer3D.clips.field2798 = true;
         }

         this.method4780(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2741[3] < 0 || field2741[3] > var20) {
            Rasterizer3D.clips.field2798 = true;
         }

         int var22;
         int var23;
         int var24;
         short var40;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var38;
            if (this.textureFaces != null && this.textureFaces[var1] != -1) {
               var24 = this.textureFaces[var1] & 255;
               var38 = this.texIndices1[var24];
               var22 = this.texIndices2[var24];
               var23 = this.texIndices3[var24];
            } else {
               var38 = var5;
               var22 = var6;
               var23 = var7;
            }

            var40 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               DevicePcmPlayerProvider.method322(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var40);
               DevicePcmPlayerProvider.method322(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var40);
            } else {
               DevicePcmPlayerProvider.method322(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var40);
               DevicePcmPlayerProvider.method322(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], field2743[0], field2743[2], field2743[3], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var40);
            }
         } else {
            boolean var21 = this.method4779(var1);
            byte var25;
            byte var26;
            int var27;
            int var28;
            if (this.faceColors3[var1] == -1 && var21) {
               var22 = field2695[this.faceColors1[var1]];
               byte var39 = this.overrideHue;
               var40 = this.overrideSaturation;
               var25 = this.overrideLuminance;
               var26 = this.overrideAmount;
               Rasterizer3D.field2519.method4512(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, (byte)var40, var25, var26);
               var27 = field2742[3];
               var28 = field2741[3];
               float var41 = field2705[3];
               byte var42 = this.overrideHue;
               byte var43 = this.overrideSaturation;
               byte var44 = this.overrideLuminance;
               byte var45 = this.overrideAmount;
               Rasterizer3D.field2519.method4512(var14, var16, var27, var11, var13, var28, var17, var19, var41, var22, var42, var43, var44, var45);
            } else if (this.faceColors3[var1] == -1) {
               var22 = field2695[this.faceColors1[var1]];
               class144.method3256(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               class144.method3256(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], var22);
            } else if (var21) {
               var22 = field2743[0];
               var23 = field2743[1];
               var24 = field2743[2];
               var25 = this.overrideHue;
               var26 = this.overrideLuminance;
               var27 = this.overrideSaturation;
               var28 = this.overrideAmount;
               Rasterizer3D.field2519.method4478(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, (byte)var27, (byte)var28);
               int var29 = field2742[3];
               int var30 = field2741[3];
               int var31 = field2743[0];
               int var32 = field2743[2];
               int var33 = field2743[3];
               byte var34 = this.overrideHue;
               byte var35 = this.overrideLuminance;
               byte var36 = this.overrideSaturation;
               byte var37 = this.overrideAmount;
               Rasterizer3D.field2519.method4478(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37);
            } else {
               BoundaryObject.method5010(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2]);
               BoundaryObject.method5010(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], field2743[0], field2743[2], field2743[3]);
            }
         }
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILqj;)V"
   )
   void method4772(int var1, class425 var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.field4670[0] * var3 + var2.field4670[4] * var4 + var2.field4670[8] * var5 + var2.field4670[12] * var6);
      this.verticesY[var1] = -((int)(var2.field4670[1] * var3 + var2.field4670[5] * var4 + var2.field4670[9] * var5 + var2.field4670[13] * var6));
      this.verticesZ[var1] = -((int)(var2.field4670[2] * var3 + var2.field4670[6] * var4 + var2.field4670[10] * var5 + var2.field4670[14] * var6));
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Lic;I)V"
   )
   void method4783(class219 var1, int var2) {
      if (this.field2711 != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.field2711[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2715[var3];
               field2689.method8178();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class122 var8 = var1.method4454(var7);
                  if (var8 != null) {
                     field2690.method8180((float)var5[var6] / 255.0F);
                     field2691.method8179(var8.method2999(var2));
                     field2691.method8183(field2690);
                     field2689.method8182(field2691);
                  }
               }

               this.method4772(var3, field2689);
            }
         }

      }
   }

   @ObfuscatedName("df")
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
         int var16 = (var15 - this.xzRadius) * UserComparator7.get3dZoom();
         if (var16 / var14 < class264.Rasterizer3D_clipMidX2()) {
            int var17 = (var15 + this.xzRadius) * UserComparator7.get3dZoom();
            int var18 = var17 / var14;
            int var19 = Rasterizer3D.clips.clipNegativeMidX;
            if (var18 > var19) {
               int var20 = var3 * var7 - var11 * var2 >> 16;
               int var21 = var2 * this.xzRadius >> 16;
               int var22 = (var3 * this.bottomY >> 16) + var21;
               int var23 = (var20 + var22) * UserComparator7.get3dZoom();
               int var24 = var23 / var14;
               int var25 = Rasterizer3D.clips.clipNegativeMidY;
               if (var24 > var25) {
                  int var26 = (var3 * super.height >> 16) + var21;
                  int var27 = (var20 - var26) * UserComparator7.get3dZoom();
                  if (var27 / var14 < class142.Rasterizer3D_clipMidY2()) {
                     int var28 = var13 + (var2 * super.height >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.texIndicesCount > 0;
                     int var32 = Projectile.method2117();
                     int var33 = ViewportMouse.ViewportMouse_y;
                     boolean var35 = ViewportMouse.ViewportMouse_isInViewport;
                     boolean var37 = class173.method3588(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (field2737) {
                           var39 = class428.method8278(this, var1, var6, var7, var8);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - TaskHandler.getClipMidX();
                           var42 = var33 - class12.getClipMidY();
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.isSingleTile) {
                              GraphicsObject.method2016(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var50 = TaskHandler.getClipMidX();
                     var40 = class12.getClipMidY();
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = field2749[var1];
                        var42 = field2687[var1];
                     }

                     for(int var43 = 0; var43 < this.verticesCount; ++var43) {
                        int var44 = this.verticesX[var43];
                        int var45 = this.verticesY[var43];
                        int var46 = this.verticesZ[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var5 * var44 >> 16;
                        var46 = var5 * var46 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var3 * var45 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var3 * var46 >> 16;
                        field2729[var43] = var46 - var12;
                        if (var46 >= 50) {
                           modelViewportXs[var43] = var50 + var44 * UserComparator7.get3dZoom() / var46;
                           modelViewportYs[var43] = var40 + var47 * UserComparator7.get3dZoom() / var46;
                           field2728[var43] = NPC.method2626(var46);
                        } else {
                           modelViewportXs[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           field2716[var43] = var44;
                           field2731[var43] = var47;
                           field2760[var43] = var46;
                        }
                     }

                     try {
                        this.draw0(var29, var38, this.isSingleTile, var9);
                     } catch (Exception var49) {
                     }

                  }
               }
            }
         }
      }
   }
}
