import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public abstract class class227 extends Rasterizer2D {
   @ObfuscatedName("at")
   boolean field2528 = false;
   @ObfuscatedName("an")
   boolean field2527 = false;
   @ObfuscatedName("ab")
   int[] field2533;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljy;"
   )
   Clips field2534;

   @ObfuscatedSignature(
      descriptor = "(Ljy;)V"
   )
   class227(Clips var1) {
      this.field2533 = Rasterizer3D.Rasterizer3D_colorPalette;
      this.field2534 = var1;
   }

   @ObfuscatedName("at")
   void method4470(int[] var1, int var2, int var3, float[] var4) {
      Rasterizer2D.method9246(var1, var2, var3, var4);
   }

   @ObfuscatedName("as")
   void method4494(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = method4471(var10, var13, var14, var15, var16);
      var11 = method4471(var11, var13, var14, var15, var16);
      var12 = method4471(var12, var13, var14, var15, var16);
      this.vmethod4984(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedName("ax")
   void method4472(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = method4471(var10, var11, var12, var13, var14);
      var10 = this.field2533[var15];
      this.vmethod4976(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedName("ap")
   abstract void vmethod4984(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   @ObfuscatedName("ab")
   abstract void vmethod4976(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   @ObfuscatedName("ak")
   abstract void vmethod4978(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   @ObfuscatedName("ae")
   abstract void vmethod4975(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   @ObfuscatedName("an")
   static int method4471(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (var2 != -1) {
         var6 += var8 * (var2 - var6) >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   @ObfuscatedName("av")
   static final int method4497(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }
}
