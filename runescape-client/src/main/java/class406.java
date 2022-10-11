import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public final class class406 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Loy;"
   )
   static class406[] field4561 = new class406[0];
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1187313523
   )
   static int field4556 = 100;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 561992607
   )
   static int field4560;
   @ObfuscatedName("x")
   float field4555;
   @ObfuscatedName("h")
   float field4558;
   @ObfuscatedName("j")
   float field4559;
   @ObfuscatedName("y")
   float field4557;

   static {
      field4561 = new class406[100];
      field4560 = 0;
      new class406();
   }

   class406() {
      this.method7633();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-34"
   )
   public void method7623() {
      synchronized(field4561) {
         if (field4560 < field4556 - 1) {
            field4561[++field4560 - 1] = this;
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)V",
      garbageValue = "193585192"
   )
   void method7617(float var1, float var2, float var3, float var4) {
      this.field4558 = var1;
      this.field4555 = var2;
      this.field4559 = var3;
      this.field4557 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)V",
      garbageValue = "1805256714"
   )
   public void method7638(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.field4558 = var1 * var5;
      this.field4555 = var2 * var5;
      this.field4559 = var5 * var3;
      this.field4557 = var6;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "54"
   )
   final void method7633() {
      this.field4559 = 0.0F;
      this.field4555 = 0.0F;
      this.field4558 = 0.0F;
      this.field4557 = 1.0F;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Loy;I)V",
      garbageValue = "788551228"
   )
   public final void method7615(class406 var1) {
      this.method7617(var1.field4558 * this.field4557 + this.field4558 * var1.field4557 + this.field4559 * var1.field4555 - this.field4555 * var1.field4559, var1.field4559 * this.field4558 + var1.field4555 * this.field4557 + (var1.field4557 * this.field4555 - this.field4559 * var1.field4558), this.field4559 * var1.field4557 + this.field4555 * var1.field4558 - var1.field4555 * this.field4558 + var1.field4559 * this.field4557, var1.field4557 * this.field4557 - this.field4558 * var1.field4558 - var1.field4555 * this.field4555 - var1.field4559 * this.field4559);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class406)) {
         return false;
      } else {
         class406 var2 = (class406)var1;
         return var2.field4558 == this.field4558 && this.field4555 == var2.field4555 && this.field4559 == var2.field4559 && var2.field4557 == this.field4557;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = var2 * 31.0F + this.field4558;
      var2 = var2 * 31.0F + this.field4555;
      var2 = this.field4559 + 31.0F * var2;
      var2 = var2 * 31.0F + this.field4557;
      return (int)var2;
   }

   public String toString() {
      return this.field4558 + "," + this.field4555 + "," + this.field4559 + "," + this.field4557;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Loo;FFFB)F",
      garbageValue = "18"
   )
   static float method7618(class409 var0, float var1, float var2, float var3) {
      float var4 = class1.method8(var0.field4583, var0.field4582, var1);
      if (Math.abs(var4) < class121.field1454) {
         return var1;
      } else {
         float var5 = class1.method8(var0.field4583, var0.field4582, var2);
         if (Math.abs(var5) < class121.field1454) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = class121.field1452 * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var17 * 2.0F * var12;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (var10 * var17 * 2.0F * (var10 - var11) - (var2 - var1) * (var11 - 1.0F));
                        var10 = (var12 - 1.0F) * (var11 - 1.0F) * (var10 - 1.0F);
                     }

                     if ((double)var9 > 0.0) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(var10 * var12 * 0.5F)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = class1.method8(var0.field4583, var0.field4582, var2);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   @ObfuscatedName("x")
   public static int method7640(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }
}
