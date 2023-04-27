import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class354 {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lbq;"
   )
   @Export("soundSystem")
   static SoundSystem soundSystem;
   @ObfuscatedName("af")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("aw")
   int[] field4302 = new int[2048];
   @ObfuscatedName("ac")
   int[] field4305 = new int[2048];
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -674420889
   )
   int field4304 = 0;

   public class354() {
      class86.field1073 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = UserComparator7.method2910((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         class86.field1073[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < class86.field1073.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = UserComparator7.method2910((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < class86.field1073.length; ++var1) {
            class86.field1073[var1] = var5;
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-95"
   )
   void method6896(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = KeyHandler.method390((double)var8, 0.0, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var17 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var17[var12 + var11 * var2] = (int)(var14[var11] * var14[var12] / var15 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      SpritePixels var18 = new SpritePixels(var17, var2, var2);
      this.spriteMap.put(var1, var18);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Ltq;",
      garbageValue = "1414918358"
   )
   SpritePixels method6897(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method6896(var1);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "-12492"
   )
   public final void method6898(int var1, int var2) {
      if (this.field4304 < this.field4302.length) {
         this.field4302[this.field4304] = var1;
         this.field4305[this.field4304] = var2;
         ++this.field4304;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "210134861"
   )
   public final void method6903() {
      this.field4304 = 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IILtq;FI)V",
      garbageValue = "47289372"
   )
   public final void method6902(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method6897(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field4304; ++var10) {
         var11 = this.field4302[var10];
         var12 = this.field4305[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method8105(var8, var9);
         this.method6899(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if (var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if (var11 > class86.field1073.length) {
                  var11 = class86.field1073.length;
               }

               var12 = class86.field1073[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltq;Ltq;Lqu;B)V",
      garbageValue = "75"
   )
   void method6899(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (var3.highX != 0 && var3.highY != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.lowX == 0) {
            var4 = var1.subWidth - var3.highX;
         }

         if (var3.lowY == 0) {
            var5 = var1.subHeight - var3.highY;
         }

         int var6 = var4 + var5 * var1.subWidth;
         int var7 = var3.lowX + var2.subWidth * var3.lowY;

         for(int var8 = 0; var8 < var3.highY; ++var8) {
            for(int var9 = 0; var9 < var3.highX; ++var9) {
               int[] var10000 = var2.pixels;
               int var10001 = var7++;
               var10000[var10001] += var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.highX;
            var7 += var2.subWidth - var3.highX;
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lhw;",
      garbageValue = "2096193718"
   )
   @Export("WorldMapElement_get")
   public static WorldMapElement WorldMapElement_get(int var0) {
      return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
   }
}
