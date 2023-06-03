import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public class class367 {
   @ObfuscatedName("ae")
   static int[] field4327;
   @ObfuscatedName("at")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("av")
   int[] field4324 = new int[2048];
   @ObfuscatedName("as")
   int[] field4326 = new int[2048];
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -809867357
   )
   int field4328 = 0;

   public class367() {
      field4327 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class60.method1135((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         field4327[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < field4327.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = class60.method1135((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < field4327.length; ++var1) {
            field4327[var1] = var5;
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "485296313"
   )
   void method6877(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = VertexNormal.method4921(0.0, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      this.spriteMap.put(var1, var11);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Ltm;",
      garbageValue = "112"
   )
   SpritePixels method6889(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method6877(var1);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1795124654"
   )
   public final void method6876(int var1, int var2) {
      if (this.field4328 < this.field4324.length) {
         this.field4324[this.field4328] = var1;
         this.field4326[this.field4328] = var2;
         ++this.field4328;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1444057893"
   )
   public final void method6887() {
      this.field4328 = 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IILtm;FI)V",
      garbageValue = "344518977"
   )
   public final void method6878(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method6889(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field4328; ++var10) {
         var11 = this.field4324[var10];
         var12 = this.field4326[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method8031(var8, var9);
         this.method6875(var6, var3, var9);
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
               if (var11 > field4327.length) {
                  var11 = field4327.length;
               }

               var12 = field4327[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltm;Ltm;Lqs;S)V",
      garbageValue = "223"
   )
   void method6875(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
         int var7 = var2.subWidth * var3.lowY + var3.lowX;

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
}
