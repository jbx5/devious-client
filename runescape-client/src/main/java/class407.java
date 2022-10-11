import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public final class class407 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   public static final class407 field4567;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[Lov;"
   )
   static class407[] field4563 = new class407[0];
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 372979687
   )
   static int field4564 = 100;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -61693019
   )
   static int field4565;
   @ObfuscatedName("j")
   public float[] field4566 = new float[16];

   static {
      field4563 = new class407[100];
      field4565 = 0;
      field4567 = new class407();
   }

   public class407() {
      this.method7646();
   }

   @ObfuscatedSignature(
      descriptor = "(Lov;)V"
   )
   public class407(class407 var1) {
      this.method7648(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqr;Z)V"
   )
   public class407(Buffer var1, boolean var2) {
      this.method7689(var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1357090508"
   )
   public void method7695() {
      synchronized(field4563) {
         if (field4565 < field4564 - 1) {
            field4563[++field4565 - 1] = this;
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;ZI)V",
      garbageValue = "164819171"
   )
   void method7689(Buffer var1, boolean var2) {
      if (var2) {
         class408 var10 = new class408();
         int var6 = var1.readShort();
         var6 &= 16383;
         float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586);
         var10.method7712(var5);
         var10.method7730(StructComposition.method3677(var1.readShort()));
         int var9 = var1.readShort();
         var9 &= 16383;
         float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586);
         var10.method7731(var8);
         var10.method7714((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method7654(var10);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4566[var3] = var1.method8410();
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "531737565"
   )
   float[] method7644() {
      float[] var1 = new float[3];
      if ((double)this.field4566[2] < 0.999 && (double)this.field4566[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4566[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4566[6] / var2, (double)this.field4566[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4566[1] / var2, (double)this.field4566[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4566[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4566[9]), (double)this.field4566[5]);
      }

      return var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1571625008"
   )
   public float[] method7645() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4566[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4566[2];
         var6 = (double)this.field4566[10];
         double var8 = (double)this.field4566[4];
         double var10 = (double)this.field4566[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4566[1];
         var6 = (double)this.field4566[0];
         if (this.field4566[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1311074651"
   )
   void method7646() {
      this.field4566[0] = 1.0F;
      this.field4566[1] = 0.0F;
      this.field4566[2] = 0.0F;
      this.field4566[3] = 0.0F;
      this.field4566[4] = 0.0F;
      this.field4566[5] = 1.0F;
      this.field4566[6] = 0.0F;
      this.field4566[7] = 0.0F;
      this.field4566[8] = 0.0F;
      this.field4566[9] = 0.0F;
      this.field4566[10] = 1.0F;
      this.field4566[11] = 0.0F;
      this.field4566[12] = 0.0F;
      this.field4566[13] = 0.0F;
      this.field4566[14] = 0.0F;
      this.field4566[15] = 1.0F;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "37"
   )
   public void method7647() {
      this.field4566[0] = 0.0F;
      this.field4566[1] = 0.0F;
      this.field4566[2] = 0.0F;
      this.field4566[3] = 0.0F;
      this.field4566[4] = 0.0F;
      this.field4566[5] = 0.0F;
      this.field4566[6] = 0.0F;
      this.field4566[7] = 0.0F;
      this.field4566[8] = 0.0F;
      this.field4566[9] = 0.0F;
      this.field4566[10] = 0.0F;
      this.field4566[11] = 0.0F;
      this.field4566[12] = 0.0F;
      this.field4566[13] = 0.0F;
      this.field4566[14] = 0.0F;
      this.field4566[15] = 0.0F;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "1357245429"
   )
   public void method7648(class407 var1) {
      System.arraycopy(var1.field4566, 0, this.field4566, 0, 16);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "8"
   )
   public void method7680(float var1) {
      this.method7650(var1, var1, var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(FFFB)V",
      garbageValue = "1"
   )
   public void method7650(float var1, float var2, float var3) {
      this.method7646();
      this.field4566[0] = var1;
      this.field4566[5] = var2;
      this.field4566[10] = var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "1212207341"
   )
   public void method7673(class407 var1) {
      for(int var2 = 0; var2 < this.field4566.length; ++var2) {
         float[] var10000 = this.field4566;
         var10000[var2] += var1.field4566[var2];
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "-803446408"
   )
   public void method7652(class407 var1) {
      float var2 = var1.field4566[12] * this.field4566[3] + this.field4566[0] * var1.field4566[0] + this.field4566[1] * var1.field4566[4] + this.field4566[2] * var1.field4566[8];
      float var3 = var1.field4566[13] * this.field4566[3] + this.field4566[2] * var1.field4566[9] + this.field4566[0] * var1.field4566[1] + var1.field4566[5] * this.field4566[1];
      float var4 = this.field4566[3] * var1.field4566[14] + this.field4566[0] * var1.field4566[2] + var1.field4566[6] * this.field4566[1] + var1.field4566[10] * this.field4566[2];
      float var5 = this.field4566[2] * var1.field4566[11] + this.field4566[0] * var1.field4566[3] + var1.field4566[7] * this.field4566[1] + var1.field4566[15] * this.field4566[3];
      float var6 = this.field4566[7] * var1.field4566[12] + var1.field4566[8] * this.field4566[6] + var1.field4566[0] * this.field4566[4] + var1.field4566[4] * this.field4566[5];
      float var7 = this.field4566[6] * var1.field4566[9] + var1.field4566[5] * this.field4566[5] + this.field4566[4] * var1.field4566[1] + this.field4566[7] * var1.field4566[13];
      float var8 = var1.field4566[14] * this.field4566[7] + this.field4566[4] * var1.field4566[2] + var1.field4566[6] * this.field4566[5] + this.field4566[6] * var1.field4566[10];
      float var9 = var1.field4566[15] * this.field4566[7] + var1.field4566[3] * this.field4566[4] + this.field4566[5] * var1.field4566[7] + this.field4566[6] * var1.field4566[11];
      float var10 = var1.field4566[12] * this.field4566[11] + this.field4566[9] * var1.field4566[4] + var1.field4566[0] * this.field4566[8] + var1.field4566[8] * this.field4566[10];
      float var11 = this.field4566[9] * var1.field4566[5] + this.field4566[8] * var1.field4566[1] + this.field4566[10] * var1.field4566[9] + this.field4566[11] * var1.field4566[13];
      float var12 = this.field4566[9] * var1.field4566[6] + var1.field4566[2] * this.field4566[8] + this.field4566[10] * var1.field4566[10] + this.field4566[11] * var1.field4566[14];
      float var13 = this.field4566[11] * var1.field4566[15] + this.field4566[10] * var1.field4566[11] + this.field4566[9] * var1.field4566[7] + this.field4566[8] * var1.field4566[3];
      float var14 = var1.field4566[12] * this.field4566[15] + var1.field4566[4] * this.field4566[13] + var1.field4566[0] * this.field4566[12] + this.field4566[14] * var1.field4566[8];
      float var15 = var1.field4566[13] * this.field4566[15] + this.field4566[12] * var1.field4566[1] + this.field4566[13] * var1.field4566[5] + var1.field4566[9] * this.field4566[14];
      float var16 = var1.field4566[2] * this.field4566[12] + var1.field4566[6] * this.field4566[13] + var1.field4566[10] * this.field4566[14] + var1.field4566[14] * this.field4566[15];
      float var17 = var1.field4566[15] * this.field4566[15] + var1.field4566[11] * this.field4566[14] + this.field4566[13] * var1.field4566[7] + var1.field4566[3] * this.field4566[12];
      this.field4566[0] = var2;
      this.field4566[1] = var3;
      this.field4566[2] = var4;
      this.field4566[3] = var5;
      this.field4566[4] = var6;
      this.field4566[5] = var7;
      this.field4566[6] = var8;
      this.field4566[7] = var9;
      this.field4566[8] = var10;
      this.field4566[9] = var11;
      this.field4566[10] = var12;
      this.field4566[11] = var13;
      this.field4566[12] = var14;
      this.field4566[13] = var15;
      this.field4566[14] = var16;
      this.field4566[15] = var17;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Loy;B)V",
      garbageValue = "2"
   )
   public void method7653(class406 var1) {
      float var2 = var1.field4557 * var1.field4557;
      float var3 = var1.field4557 * var1.field4558;
      float var4 = var1.field4555 * var1.field4557;
      float var5 = var1.field4559 * var1.field4557;
      float var6 = var1.field4558 * var1.field4558;
      float var7 = var1.field4555 * var1.field4558;
      float var8 = var1.field4559 * var1.field4558;
      float var9 = var1.field4555 * var1.field4555;
      float var10 = var1.field4559 * var1.field4555;
      float var11 = var1.field4559 * var1.field4559;
      this.field4566[0] = var6 + var2 - var11 - var9;
      this.field4566[1] = var5 + var7 + var5 + var7;
      this.field4566[2] = var8 - var4 - var4 + var8;
      this.field4566[4] = var7 - var5 - var5 + var7;
      this.field4566[5] = var2 + var9 - var6 - var11;
      this.field4566[6] = var3 + var10 + var3 + var10;
      this.field4566[8] = var4 + var8 + var8 + var4;
      this.field4566[9] = var10 - var3 - var3 + var10;
      this.field4566[10] = var11 + var2 - var9 - var6;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lox;B)V",
      garbageValue = "-17"
   )
   void method7654(class408 var1) {
      this.field4566[0] = var1.field4576;
      this.field4566[1] = var1.field4570;
      this.field4566[2] = var1.field4571;
      this.field4566[3] = 0.0F;
      this.field4566[4] = var1.field4569;
      this.field4566[5] = var1.field4573;
      this.field4566[6] = var1.field4574;
      this.field4566[7] = 0.0F;
      this.field4566[8] = var1.field4575;
      this.field4566[9] = var1.field4572;
      this.field4566[10] = var1.field4577;
      this.field4566[11] = 0.0F;
      this.field4566[12] = var1.field4578;
      this.field4566[13] = var1.field4579;
      this.field4566[14] = var1.field4580;
      this.field4566[15] = 1.0F;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "1717166501"
   )
   float method7672() {
      return this.field4566[12] * this.field4566[6] * this.field4566[3] * this.field4566[9] + (this.field4566[5] * this.field4566[2] * this.field4566[11] * this.field4566[12] + (this.field4566[15] * this.field4566[9] * this.field4566[2] * this.field4566[4] + this.field4566[8] * this.field4566[6] * this.field4566[1] * this.field4566[15] + this.field4566[15] * this.field4566[10] * this.field4566[5] * this.field4566[0] - this.field4566[11] * this.field4566[5] * this.field4566[0] * this.field4566[14] - this.field4566[15] * this.field4566[6] * this.field4566[0] * this.field4566[9] + this.field4566[13] * this.field4566[11] * this.field4566[6] * this.field4566[0] + this.field4566[14] * this.field4566[9] * this.field4566[7] * this.field4566[0] - this.field4566[10] * this.field4566[0] * this.field4566[7] * this.field4566[13] - this.field4566[15] * this.field4566[1] * this.field4566[4] * this.field4566[10] + this.field4566[11] * this.field4566[1] * this.field4566[4] * this.field4566[14] - this.field4566[6] * this.field4566[1] * this.field4566[11] * this.field4566[12] - this.field4566[14] * this.field4566[7] * this.field4566[1] * this.field4566[8] + this.field4566[12] * this.field4566[10] * this.field4566[1] * this.field4566[7] - this.field4566[13] * this.field4566[4] * this.field4566[2] * this.field4566[11] - this.field4566[15] * this.field4566[8] * this.field4566[5] * this.field4566[2]) + this.field4566[2] * this.field4566[7] * this.field4566[8] * this.field4566[13] - this.field4566[12] * this.field4566[9] * this.field4566[7] * this.field4566[2] - this.field4566[14] * this.field4566[4] * this.field4566[3] * this.field4566[9] + this.field4566[13] * this.field4566[10] * this.field4566[4] * this.field4566[3] + this.field4566[14] * this.field4566[8] * this.field4566[5] * this.field4566[3] - this.field4566[12] * this.field4566[3] * this.field4566[5] * this.field4566[10] - this.field4566[13] * this.field4566[6] * this.field4566[3] * this.field4566[8]);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1335065580"
   )
   public void method7678() {
      float var1 = 1.0F / this.method7672();
      float var2 = (this.field4566[10] * this.field4566[5] * this.field4566[15] - this.field4566[14] * this.field4566[11] * this.field4566[5] - this.field4566[9] * this.field4566[6] * this.field4566[15] + this.field4566[13] * this.field4566[11] * this.field4566[6] + this.field4566[7] * this.field4566[9] * this.field4566[14] - this.field4566[10] * this.field4566[7] * this.field4566[13]) * var1;
      float var3 = var1 * (this.field4566[15] * this.field4566[10] * -this.field4566[1] + this.field4566[14] * this.field4566[11] * this.field4566[1] + this.field4566[15] * this.field4566[2] * this.field4566[9] - this.field4566[13] * this.field4566[2] * this.field4566[11] - this.field4566[9] * this.field4566[3] * this.field4566[14] + this.field4566[10] * this.field4566[3] * this.field4566[13]);
      float var4 = var1 * (this.field4566[3] * this.field4566[5] * this.field4566[14] + this.field4566[15] * this.field4566[6] * this.field4566[1] - this.field4566[7] * this.field4566[1] * this.field4566[14] - this.field4566[15] * this.field4566[2] * this.field4566[5] + this.field4566[2] * this.field4566[7] * this.field4566[13] - this.field4566[6] * this.field4566[3] * this.field4566[13]);
      float var5 = (this.field4566[5] * this.field4566[2] * this.field4566[11] + this.field4566[11] * this.field4566[6] * -this.field4566[1] + this.field4566[10] * this.field4566[1] * this.field4566[7] - this.field4566[7] * this.field4566[2] * this.field4566[9] - this.field4566[10] * this.field4566[3] * this.field4566[5] + this.field4566[6] * this.field4566[3] * this.field4566[9]) * var1;
      float var6 = (this.field4566[15] * this.field4566[6] * this.field4566[8] + this.field4566[11] * this.field4566[4] * this.field4566[14] + -this.field4566[4] * this.field4566[10] * this.field4566[15] - this.field4566[6] * this.field4566[11] * this.field4566[12] - this.field4566[14] * this.field4566[7] * this.field4566[8] + this.field4566[10] * this.field4566[7] * this.field4566[12]) * var1;
      float var7 = var1 * (this.field4566[15] * this.field4566[0] * this.field4566[10] - this.field4566[0] * this.field4566[11] * this.field4566[14] - this.field4566[15] * this.field4566[2] * this.field4566[8] + this.field4566[2] * this.field4566[11] * this.field4566[12] + this.field4566[14] * this.field4566[8] * this.field4566[3] - this.field4566[12] * this.field4566[10] * this.field4566[3]);
      float var8 = var1 * (this.field4566[15] * -this.field4566[0] * this.field4566[6] + this.field4566[14] * this.field4566[0] * this.field4566[7] + this.field4566[4] * this.field4566[2] * this.field4566[15] - this.field4566[2] * this.field4566[7] * this.field4566[12] - this.field4566[14] * this.field4566[3] * this.field4566[4] + this.field4566[3] * this.field4566[6] * this.field4566[12]);
      float var9 = var1 * (this.field4566[3] * this.field4566[4] * this.field4566[10] + this.field4566[6] * this.field4566[0] * this.field4566[11] - this.field4566[0] * this.field4566[7] * this.field4566[10] - this.field4566[11] * this.field4566[4] * this.field4566[2] + this.field4566[2] * this.field4566[7] * this.field4566[8] - this.field4566[3] * this.field4566[6] * this.field4566[8]);
      float var10 = var1 * (this.field4566[13] * this.field4566[8] * this.field4566[7] + this.field4566[12] * this.field4566[5] * this.field4566[11] + (this.field4566[4] * this.field4566[9] * this.field4566[15] - this.field4566[11] * this.field4566[4] * this.field4566[13] - this.field4566[8] * this.field4566[5] * this.field4566[15]) - this.field4566[12] * this.field4566[9] * this.field4566[7]);
      float var11 = (this.field4566[12] * this.field4566[3] * this.field4566[9] + (this.field4566[9] * -this.field4566[0] * this.field4566[15] + this.field4566[0] * this.field4566[11] * this.field4566[13] + this.field4566[15] * this.field4566[1] * this.field4566[8] - this.field4566[1] * this.field4566[11] * this.field4566[12] - this.field4566[13] * this.field4566[3] * this.field4566[8])) * var1;
      float var12 = var1 * (this.field4566[4] * this.field4566[3] * this.field4566[13] + this.field4566[7] * this.field4566[1] * this.field4566[12] + (this.field4566[5] * this.field4566[0] * this.field4566[15] - this.field4566[13] * this.field4566[0] * this.field4566[7] - this.field4566[1] * this.field4566[4] * this.field4566[15]) - this.field4566[3] * this.field4566[5] * this.field4566[12]);
      float var13 = var1 * (this.field4566[8] * this.field4566[5] * this.field4566[3] + (this.field4566[4] * this.field4566[1] * this.field4566[11] + this.field4566[11] * -this.field4566[0] * this.field4566[5] + this.field4566[9] * this.field4566[0] * this.field4566[7] - this.field4566[8] * this.field4566[7] * this.field4566[1] - this.field4566[9] * this.field4566[3] * this.field4566[4]));
      float var14 = var1 * (this.field4566[5] * this.field4566[8] * this.field4566[14] + this.field4566[4] * this.field4566[10] * this.field4566[13] + this.field4566[14] * this.field4566[9] * -this.field4566[4] - this.field4566[12] * this.field4566[5] * this.field4566[10] - this.field4566[13] * this.field4566[8] * this.field4566[6] + this.field4566[12] * this.field4566[6] * this.field4566[9]);
      float var15 = (this.field4566[2] * this.field4566[8] * this.field4566[13] + this.field4566[0] * this.field4566[9] * this.field4566[14] - this.field4566[10] * this.field4566[0] * this.field4566[13] - this.field4566[14] * this.field4566[1] * this.field4566[8] + this.field4566[12] * this.field4566[1] * this.field4566[10] - this.field4566[12] * this.field4566[2] * this.field4566[9]) * var1;
      float var16 = (this.field4566[4] * this.field4566[1] * this.field4566[14] + this.field4566[6] * this.field4566[0] * this.field4566[13] + -this.field4566[0] * this.field4566[5] * this.field4566[14] - this.field4566[12] * this.field4566[1] * this.field4566[6] - this.field4566[2] * this.field4566[4] * this.field4566[13] + this.field4566[12] * this.field4566[5] * this.field4566[2]) * var1;
      float var17 = var1 * (this.field4566[9] * this.field4566[2] * this.field4566[4] + this.field4566[10] * this.field4566[5] * this.field4566[0] - this.field4566[6] * this.field4566[0] * this.field4566[9] - this.field4566[1] * this.field4566[4] * this.field4566[10] + this.field4566[1] * this.field4566[6] * this.field4566[8] - this.field4566[8] * this.field4566[2] * this.field4566[5]);
      this.field4566[0] = var2;
      this.field4566[1] = var3;
      this.field4566[2] = var4;
      this.field4566[3] = var5;
      this.field4566[4] = var6;
      this.field4566[5] = var7;
      this.field4566[6] = var8;
      this.field4566[7] = var9;
      this.field4566[8] = var10;
      this.field4566[9] = var11;
      this.field4566[10] = var12;
      this.field4566[11] = var13;
      this.field4566[12] = var14;
      this.field4566[13] = var15;
      this.field4566[14] = var16;
      this.field4566[15] = var17;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "78283568"
   )
   public float[] method7658() {
      float[] var1 = new float[3];
      class405 var2 = new class405(this.field4566[0], this.field4566[1], this.field4566[2]);
      class405 var3 = new class405(this.field4566[4], this.field4566[5], this.field4566[6]);
      class405 var4 = new class405(this.field4566[8], this.field4566[9], this.field4566[10]);
      var1[0] = var2.method7602();
      var1[1] = var3.method7602();
      var1[2] = var4.method7602();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method7645();
      this.method7644();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4566[var3 + var2 * 4];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.field4566);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class407)) {
         return false;
      } else {
         class407 var2 = (class407)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field4566[var3] != this.field4566[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Llg;IB)Lry;",
      garbageValue = "2"
   )
   public static IndexedSprite method7641(AbstractArchive var0, int var1) {
      if (!class169.method3362(var0, var1)) {
         return null;
      } else {
         IndexedSprite var3 = new IndexedSprite();
         var3.width = class477.SpriteBuffer_spriteWidth;
         var3.height = class477.SpriteBuffer_spriteHeight;
         var3.xOffset = class451.SpriteBuffer_xOffsets[0];
         var3.yOffset = class319.SpriteBuffer_yOffsets[0];
         var3.subWidth = class450.SpriteBuffer_spriteWidths[0];
         var3.subHeight = class477.SpriteBuffer_spriteHeights[0];
         var3.palette = class477.SpriteBuffer_spritePalette;
         var3.pixels = class453.SpriteBuffer_pixels[0];
         class451.SpriteBuffer_xOffsets = null;
         class319.SpriteBuffer_yOffsets = null;
         class450.SpriteBuffer_spriteWidths = null;
         class477.SpriteBuffer_spriteHeights = null;
         class477.SpriteBuffer_spritePalette = null;
         class453.SpriteBuffer_pixels = null;
         return var3;
      }
   }
}
