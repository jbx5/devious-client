import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Rasterizer3D")
public class Rasterizer3D {
   @ObfuscatedName("at")
   @Export("Rasterizer3D_colorPalette")
   public static int[] Rasterizer3D_colorPalette = new int[65536];
   @ObfuscatedName("an")
   static int[] field2518 = new int[512];
   @ObfuscatedName("av")
   static int[] field2517 = new int[2048];
   @ObfuscatedName("as")
   @Export("Rasterizer3D_sine")
   public static int[] Rasterizer3D_sine = new int[2048];
   @ObfuscatedName("ax")
   @Export("Rasterizer3D_cosine")
   public static int[] Rasterizer3D_cosine = new int[2048];
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljy;"
   )
   public static Clips clips;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   static class227 field2521;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   static final class227 field2516;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   static final class227 field2523;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field2518[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field2517[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         Rasterizer3D_sine[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
         Rasterizer3D_cosine[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
      }

      clips = new Clips();
      field2516 = new class242(clips);
      field2523 = new class244(clips);
      field2521 = field2516;
   }

   @ObfuscatedName("at")
   public static void method4416(boolean var0) {
      if (var0 && Rasterizer2D.field5088 != null) {
         field2521 = field2523;
      } else {
         field2521 = field2516;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljb;)V"
   )
   public static void method4371(TextureLoader var0) {
      clips.Rasterizer3D_textureLoader = var0;
   }

   @ObfuscatedName("av")
   public static void method4372(double var0) {
      Rasterizer3D_buildPalette(var0, 0, 512);
   }

   @ObfuscatedName("as")
   @Export("Rasterizer3D_buildPalette")
   static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (double)(var5 & 7) / 8.0 + 0.0625;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  ++var27;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = var30 + (var20 << 8) + (var29 << 16);
            var22 = Rasterizer3D_brighten(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            Rasterizer3D_colorPalette[var4++] = var22;
         }
      }

   }

   @ObfuscatedName("ax")
   @Export("Rasterizer3D_brighten")
   static int Rasterizer3D_brighten(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   @ObfuscatedName("ap")
   @Export("getClipMidX")
   static int getClipMidX() {
      return clips.field2803;
   }

   @ObfuscatedName("ab")
   @Export("getClipMidY")
   static int getClipMidY() {
      return clips.field2804;
   }

   @ObfuscatedName("ak")
   static int method4377() {
      return clips.clipNegativeMidX;
   }

   @ObfuscatedName("ae")
   @Export("Rasterizer3D_clipMidX2")
   static int Rasterizer3D_clipMidX2() {
      return clips.field2808;
   }

   @ObfuscatedName("af")
   @Export("Rasterizer3D_clipMidY2")
   static int Rasterizer3D_clipMidY2() {
      return clips.field2810;
   }

   @ObfuscatedName("ao")
   static int method4418() {
      return clips.clipNegativeMidY;
   }

   @ObfuscatedName("aa")
   @Export("get3dZoom")
   public static int get3dZoom() {
      return clips.field2796;
   }

   @ObfuscatedName("aj")
   static int method4388() {
      return clips.field2800;
   }

   @ObfuscatedName("ad")
   public static void method4383(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field2521 == field2523) {
         field2521 = field2516;
      }

      field2521.method4470(var0, var1, var2, var3);
   }

   @ObfuscatedName("ac")
   public static void method4382() {
      method4414(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
   }

   @ObfuscatedName("ag")
   static void method4414(int var0, int var1, int var2, int var3) {
      clips.field2800 = var2 - var0;
      clips.field2806 = var3 - var1;
      method4386();
      if (clips.Rasterizer3D_rowOffsets.length < clips.field2806) {
         clips.Rasterizer3D_rowOffsets = new int[class128.method2970(clips.field2806)];
      }

      int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

      for(int var5 = 0; var5 < clips.field2806; ++var5) {
         clips.Rasterizer3D_rowOffsets[var5] = var4;
         var4 += Rasterizer2D.Rasterizer2D_width;
      }

   }

   @ObfuscatedName("ar")
   public static void method4386() {
      clips.method4956();
   }

   @ObfuscatedName("ah")
   public static void method4387(int var0, int var1) {
      int var2 = clips.Rasterizer3D_rowOffsets[0];
      int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
      int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
      clips.method4957(var0, var4, var1, var3);
   }

   @ObfuscatedName("az")
   public static void method4407(int var0, int var1, int var2) {
      clips.method4955(var0, var1, var2);
   }

   @ObfuscatedName("au")
   static void method4389(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      field2521.vmethod4984(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedName("ai")
   public static void method4390(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      field2521.vmethod4976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("aq")
   static void method4391(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field2521.vmethod4978(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("aw")
   static void method4380(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field2521.vmethod4975(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("ay")
   static void method4393(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      field2521.method4494(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   @ObfuscatedName("al")
   static void method4394(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      field2521.method4472(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
}
