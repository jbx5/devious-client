import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public final class class421 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lqt;"
   )
   public static class421[] field4611 = new class421[0];
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2064076709
   )
   static int field4609 = 100;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1816281437
   )
   public static int field4610;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   public static final class421 field4612;
   @ObfuscatedName("an")
   public float[] field4608 = new float[16];

   static {
      field4611 = new class421[100];
      field4610 = 0;
      field4612 = new class421();
   }

   public class421() {
      this.method7856();
   }

   @ObfuscatedSignature(
      descriptor = "(Lqt;)V"
   )
   public class421(class421 var1) {
      this.method7850(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Lsy;Z)V"
   )
   public class421(Buffer var1, boolean var2) {
      this.method7882(var1, var2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1774903306"
   )
   public void method7888() {
      synchronized(field4611) {
         if (field4610 < field4609 - 1) {
            field4611[++field4610 - 1] = this;
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;ZI)V",
      garbageValue = "-1704033205"
   )
   void method7882(Buffer var1, boolean var2) {
      if (var2) {
         class422 var13 = new class422();
         int var6 = var1.readShort();
         var6 &= 16383;
         float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586);
         var13.method7904(var5);
         int var9 = var1.readShort();
         var9 &= 16383;
         float var8 = (float)(6.283185307179586 * (double)((float)var9 / 16384.0F));
         var13.method7905(var8);
         int var12 = var1.readShort();
         var12 &= 16383;
         float var11 = (float)(6.283185307179586 * (double)((float)var12 / 16384.0F));
         var13.method7908(var11);
         var13.method7913((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method7899(var13);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4608[var3] = var1.method8626();
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)[F",
      garbageValue = "-101"
   )
   float[] method7844() {
      float[] var1 = new float[3];
      if ((double)this.field4608[2] < 0.999 && (double)this.field4608[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4608[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4608[6] / var2, (double)this.field4608[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4608[1] / var2, (double)this.field4608[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4608[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4608[9]), (double)this.field4608[5]);
      }

      return var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1868274554"
   )
   public float[] method7858() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4608[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4608[2];
         var6 = (double)this.field4608[10];
         double var8 = (double)this.field4608[4];
         double var10 = (double)this.field4608[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4608[1];
         var6 = (double)this.field4608[0];
         if (this.field4608[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1579547508"
   )
   public void method7856() {
      this.field4608[0] = 1.0F;
      this.field4608[1] = 0.0F;
      this.field4608[2] = 0.0F;
      this.field4608[3] = 0.0F;
      this.field4608[4] = 0.0F;
      this.field4608[5] = 1.0F;
      this.field4608[6] = 0.0F;
      this.field4608[7] = 0.0F;
      this.field4608[8] = 0.0F;
      this.field4608[9] = 0.0F;
      this.field4608[10] = 1.0F;
      this.field4608[11] = 0.0F;
      this.field4608[12] = 0.0F;
      this.field4608[13] = 0.0F;
      this.field4608[14] = 0.0F;
      this.field4608[15] = 1.0F;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "100"
   )
   public void method7877() {
      this.field4608[0] = 0.0F;
      this.field4608[1] = 0.0F;
      this.field4608[2] = 0.0F;
      this.field4608[3] = 0.0F;
      this.field4608[4] = 0.0F;
      this.field4608[5] = 0.0F;
      this.field4608[6] = 0.0F;
      this.field4608[7] = 0.0F;
      this.field4608[8] = 0.0F;
      this.field4608[9] = 0.0F;
      this.field4608[10] = 0.0F;
      this.field4608[11] = 0.0F;
      this.field4608[12] = 0.0F;
      this.field4608[13] = 0.0F;
      this.field4608[14] = 0.0F;
      this.field4608[15] = 0.0F;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lqt;I)V",
      garbageValue = "-1594891298"
   )
   public void method7850(class421 var1) {
      System.arraycopy(var1.field4608, 0, this.field4608, 0, 16);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-963333532"
   )
   public void method7849(float var1) {
      this.method7847(var1, var1, var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "-1492163658"
   )
   public void method7847(float var1, float var2, float var3) {
      this.method7856();
      this.field4608[0] = var1;
      this.field4608[5] = var2;
      this.field4608[10] = var3;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lqt;I)V",
      garbageValue = "1265956468"
   )
   public void method7885(class421 var1) {
      for(int var2 = 0; var2 < this.field4608.length; ++var2) {
         float[] var10000 = this.field4608;
         var10000[var2] += var1.field4608[var2];
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lqt;B)V",
      garbageValue = "27"
   )
   public void method7851(class421 var1) {
      float var2 = this.field4608[1] * var1.field4608[4] + this.field4608[0] * var1.field4608[0] + this.field4608[2] * var1.field4608[8] + this.field4608[3] * var1.field4608[12];
      float var3 = this.field4608[3] * var1.field4608[13] + this.field4608[2] * var1.field4608[9] + this.field4608[1] * var1.field4608[5] + var1.field4608[1] * this.field4608[0];
      float var4 = var1.field4608[10] * this.field4608[2] + var1.field4608[2] * this.field4608[0] + var1.field4608[6] * this.field4608[1] + this.field4608[3] * var1.field4608[14];
      float var5 = var1.field4608[7] * this.field4608[1] + var1.field4608[3] * this.field4608[0] + this.field4608[2] * var1.field4608[11] + var1.field4608[15] * this.field4608[3];
      float var6 = this.field4608[7] * var1.field4608[12] + this.field4608[6] * var1.field4608[8] + this.field4608[4] * var1.field4608[0] + this.field4608[5] * var1.field4608[4];
      float var7 = this.field4608[7] * var1.field4608[13] + var1.field4608[9] * this.field4608[6] + this.field4608[5] * var1.field4608[5] + var1.field4608[1] * this.field4608[4];
      float var8 = this.field4608[6] * var1.field4608[10] + this.field4608[5] * var1.field4608[6] + this.field4608[4] * var1.field4608[2] + var1.field4608[14] * this.field4608[7];
      float var9 = var1.field4608[15] * this.field4608[7] + this.field4608[4] * var1.field4608[3] + var1.field4608[7] * this.field4608[5] + this.field4608[6] * var1.field4608[11];
      float var10 = var1.field4608[12] * this.field4608[11] + var1.field4608[0] * this.field4608[8] + this.field4608[9] * var1.field4608[4] + this.field4608[10] * var1.field4608[8];
      float var11 = var1.field4608[13] * this.field4608[11] + var1.field4608[9] * this.field4608[10] + var1.field4608[5] * this.field4608[9] + var1.field4608[1] * this.field4608[8];
      float var12 = this.field4608[11] * var1.field4608[14] + var1.field4608[10] * this.field4608[10] + this.field4608[8] * var1.field4608[2] + var1.field4608[6] * this.field4608[9];
      float var13 = var1.field4608[11] * this.field4608[10] + var1.field4608[7] * this.field4608[9] + this.field4608[8] * var1.field4608[3] + var1.field4608[15] * this.field4608[11];
      float var14 = this.field4608[15] * var1.field4608[12] + this.field4608[13] * var1.field4608[4] + var1.field4608[0] * this.field4608[12] + this.field4608[14] * var1.field4608[8];
      float var15 = this.field4608[14] * var1.field4608[9] + this.field4608[12] * var1.field4608[1] + var1.field4608[5] * this.field4608[13] + var1.field4608[13] * this.field4608[15];
      float var16 = this.field4608[14] * var1.field4608[10] + var1.field4608[6] * this.field4608[13] + this.field4608[12] * var1.field4608[2] + this.field4608[15] * var1.field4608[14];
      float var17 = var1.field4608[15] * this.field4608[15] + this.field4608[14] * var1.field4608[11] + this.field4608[13] * var1.field4608[7] + this.field4608[12] * var1.field4608[3];
      this.field4608[0] = var2;
      this.field4608[1] = var3;
      this.field4608[2] = var4;
      this.field4608[3] = var5;
      this.field4608[4] = var6;
      this.field4608[5] = var7;
      this.field4608[6] = var8;
      this.field4608[7] = var9;
      this.field4608[8] = var10;
      this.field4608[9] = var11;
      this.field4608[10] = var12;
      this.field4608[11] = var13;
      this.field4608[12] = var14;
      this.field4608[13] = var15;
      this.field4608[14] = var16;
      this.field4608[15] = var17;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lqh;B)V",
      garbageValue = "-50"
   )
   public void method7852(class420 var1) {
      float var2 = var1.field4603 * var1.field4603;
      float var3 = var1.field4603 * var1.field4602;
      float var4 = var1.field4604 * var1.field4603;
      float var5 = var1.field4605 * var1.field4603;
      float var6 = var1.field4602 * var1.field4602;
      float var7 = var1.field4604 * var1.field4602;
      float var8 = var1.field4602 * var1.field4605;
      float var9 = var1.field4604 * var1.field4604;
      float var10 = var1.field4605 * var1.field4604;
      float var11 = var1.field4605 * var1.field4605;
      this.field4608[0] = var6 + var2 - var11 - var9;
      this.field4608[1] = var7 + var7 + var5 + var5;
      this.field4608[2] = var8 - var4 - var4 + var8;
      this.field4608[4] = var7 + (var7 - var5 - var5);
      this.field4608[5] = var9 + var2 - var6 - var11;
      this.field4608[6] = var3 + var3 + var10 + var10;
      this.field4608[8] = var8 + var8 + var4 + var4;
      this.field4608[9] = var10 + (var10 - var3 - var3);
      this.field4608[10] = var11 + var2 - var9 - var6;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lqx;B)V",
      garbageValue = "56"
   )
   void method7899(class422 var1) {
      this.field4608[0] = var1.field4619;
      this.field4608[1] = var1.field4624;
      this.field4608[2] = var1.field4615;
      this.field4608[3] = 0.0F;
      this.field4608[4] = var1.field4616;
      this.field4608[5] = var1.field4617;
      this.field4608[6] = var1.field4618;
      this.field4608[7] = 0.0F;
      this.field4608[8] = var1.field4613;
      this.field4608[9] = var1.field4620;
      this.field4608[10] = var1.field4621;
      this.field4608[11] = 0.0F;
      this.field4608[12] = var1.field4622;
      this.field4608[13] = var1.field4614;
      this.field4608[14] = var1.field4623;
      this.field4608[15] = 1.0F;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)F",
      garbageValue = "1"
   )
   float method7854() {
      return this.field4608[12] * this.field4608[3] * this.field4608[6] * this.field4608[9] + (this.field4608[10] * this.field4608[3] * this.field4608[4] * this.field4608[13] + (this.field4608[1] * this.field4608[6] * this.field4608[8] * this.field4608[15] + this.field4608[5] * this.field4608[0] * this.field4608[10] * this.field4608[15] - this.field4608[5] * this.field4608[0] * this.field4608[11] * this.field4608[14] - this.field4608[0] * this.field4608[6] * this.field4608[9] * this.field4608[15] + this.field4608[6] * this.field4608[0] * this.field4608[11] * this.field4608[13] + this.field4608[14] * this.field4608[9] * this.field4608[7] * this.field4608[0] - this.field4608[10] * this.field4608[7] * this.field4608[0] * this.field4608[13] - this.field4608[10] * this.field4608[1] * this.field4608[4] * this.field4608[15] + this.field4608[14] * this.field4608[4] * this.field4608[1] * this.field4608[11] - this.field4608[12] * this.field4608[11] * this.field4608[6] * this.field4608[1] - this.field4608[7] * this.field4608[1] * this.field4608[8] * this.field4608[14] + this.field4608[12] * this.field4608[7] * this.field4608[1] * this.field4608[10] + this.field4608[9] * this.field4608[4] * this.field4608[2] * this.field4608[15] - this.field4608[13] * this.field4608[4] * this.field4608[2] * this.field4608[11] - this.field4608[15] * this.field4608[5] * this.field4608[2] * this.field4608[8] + this.field4608[2] * this.field4608[5] * this.field4608[11] * this.field4608[12] + this.field4608[13] * this.field4608[8] * this.field4608[7] * this.field4608[2] - this.field4608[9] * this.field4608[7] * this.field4608[2] * this.field4608[12] - this.field4608[14] * this.field4608[3] * this.field4608[4] * this.field4608[9]) + this.field4608[14] * this.field4608[8] * this.field4608[5] * this.field4608[3] - this.field4608[5] * this.field4608[3] * this.field4608[10] * this.field4608[12] - this.field4608[3] * this.field4608[6] * this.field4608[8] * this.field4608[13]);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2129943862"
   )
   public void method7855() {
      float var1 = 1.0F / this.method7854();
      float var2 = var1 * (this.field4608[14] * this.field4608[9] * this.field4608[7] + this.field4608[13] * this.field4608[6] * this.field4608[11] + (this.field4608[10] * this.field4608[5] * this.field4608[15] - this.field4608[11] * this.field4608[5] * this.field4608[14] - this.field4608[15] * this.field4608[9] * this.field4608[6]) - this.field4608[13] * this.field4608[7] * this.field4608[10]);
      float var3 = var1 * (this.field4608[3] * this.field4608[10] * this.field4608[13] + (this.field4608[15] * -this.field4608[1] * this.field4608[10] + this.field4608[14] * this.field4608[11] * this.field4608[1] + this.field4608[15] * this.field4608[9] * this.field4608[2] - this.field4608[13] * this.field4608[2] * this.field4608[11] - this.field4608[3] * this.field4608[9] * this.field4608[14]));
      float var4 = var1 * (this.field4608[2] * this.field4608[7] * this.field4608[13] + (this.field4608[15] * this.field4608[6] * this.field4608[1] - this.field4608[1] * this.field4608[7] * this.field4608[14] - this.field4608[5] * this.field4608[2] * this.field4608[15]) + this.field4608[3] * this.field4608[5] * this.field4608[14] - this.field4608[13] * this.field4608[3] * this.field4608[6]);
      float var5 = (this.field4608[6] * -this.field4608[1] * this.field4608[11] + this.field4608[10] * this.field4608[1] * this.field4608[7] + this.field4608[11] * this.field4608[2] * this.field4608[5] - this.field4608[2] * this.field4608[7] * this.field4608[9] - this.field4608[10] * this.field4608[3] * this.field4608[5] + this.field4608[9] * this.field4608[3] * this.field4608[6]) * var1;
      float var6 = var1 * (this.field4608[12] * this.field4608[7] * this.field4608[10] + (this.field4608[14] * this.field4608[4] * this.field4608[11] + -this.field4608[4] * this.field4608[10] * this.field4608[15] + this.field4608[8] * this.field4608[6] * this.field4608[15] - this.field4608[12] * this.field4608[11] * this.field4608[6] - this.field4608[7] * this.field4608[8] * this.field4608[14]));
      float var7 = (this.field4608[12] * this.field4608[2] * this.field4608[11] + (this.field4608[15] * this.field4608[0] * this.field4608[10] - this.field4608[14] * this.field4608[11] * this.field4608[0] - this.field4608[8] * this.field4608[2] * this.field4608[15]) + this.field4608[14] * this.field4608[3] * this.field4608[8] - this.field4608[12] * this.field4608[10] * this.field4608[3]) * var1;
      float var8 = (this.field4608[4] * this.field4608[2] * this.field4608[15] + this.field4608[15] * this.field4608[6] * -this.field4608[0] + this.field4608[14] * this.field4608[0] * this.field4608[7] - this.field4608[2] * this.field4608[7] * this.field4608[12] - this.field4608[14] * this.field4608[4] * this.field4608[3] + this.field4608[6] * this.field4608[3] * this.field4608[12]) * var1;
      float var9 = var1 * (this.field4608[11] * this.field4608[0] * this.field4608[6] - this.field4608[10] * this.field4608[0] * this.field4608[7] - this.field4608[11] * this.field4608[4] * this.field4608[2] + this.field4608[7] * this.field4608[2] * this.field4608[8] + this.field4608[3] * this.field4608[4] * this.field4608[10] - this.field4608[8] * this.field4608[3] * this.field4608[6]);
      float var10 = (this.field4608[13] * this.field4608[8] * this.field4608[7] + this.field4608[15] * this.field4608[9] * this.field4608[4] - this.field4608[4] * this.field4608[11] * this.field4608[13] - this.field4608[5] * this.field4608[8] * this.field4608[15] + this.field4608[12] * this.field4608[11] * this.field4608[5] - this.field4608[7] * this.field4608[9] * this.field4608[12]) * var1;
      float var11 = (-this.field4608[0] * this.field4608[9] * this.field4608[15] + this.field4608[13] * this.field4608[11] * this.field4608[0] + this.field4608[8] * this.field4608[1] * this.field4608[15] - this.field4608[11] * this.field4608[1] * this.field4608[12] - this.field4608[8] * this.field4608[3] * this.field4608[13] + this.field4608[12] * this.field4608[9] * this.field4608[3]) * var1;
      float var12 = (this.field4608[3] * this.field4608[4] * this.field4608[13] + this.field4608[1] * this.field4608[7] * this.field4608[12] + (this.field4608[0] * this.field4608[5] * this.field4608[15] - this.field4608[13] * this.field4608[0] * this.field4608[7] - this.field4608[4] * this.field4608[1] * this.field4608[15]) - this.field4608[3] * this.field4608[5] * this.field4608[12]) * var1;
      float var13 = var1 * (this.field4608[0] * this.field4608[7] * this.field4608[9] + -this.field4608[0] * this.field4608[5] * this.field4608[11] + this.field4608[11] * this.field4608[1] * this.field4608[4] - this.field4608[8] * this.field4608[7] * this.field4608[1] - this.field4608[9] * this.field4608[3] * this.field4608[4] + this.field4608[8] * this.field4608[3] * this.field4608[5]);
      float var14 = var1 * (this.field4608[12] * this.field4608[9] * this.field4608[6] + (this.field4608[14] * this.field4608[9] * -this.field4608[4] + this.field4608[4] * this.field4608[10] * this.field4608[13] + this.field4608[14] * this.field4608[8] * this.field4608[5] - this.field4608[5] * this.field4608[10] * this.field4608[12] - this.field4608[6] * this.field4608[8] * this.field4608[13]));
      float var15 = var1 * (this.field4608[2] * this.field4608[8] * this.field4608[13] + this.field4608[12] * this.field4608[1] * this.field4608[10] + (this.field4608[14] * this.field4608[9] * this.field4608[0] - this.field4608[10] * this.field4608[0] * this.field4608[13] - this.field4608[1] * this.field4608[8] * this.field4608[14]) - this.field4608[2] * this.field4608[9] * this.field4608[12]);
      float var16 = (this.field4608[5] * this.field4608[2] * this.field4608[12] + (this.field4608[4] * this.field4608[1] * this.field4608[14] + -this.field4608[0] * this.field4608[5] * this.field4608[14] + this.field4608[13] * this.field4608[6] * this.field4608[0] - this.field4608[12] * this.field4608[1] * this.field4608[6] - this.field4608[4] * this.field4608[2] * this.field4608[13])) * var1;
      float var17 = var1 * (this.field4608[9] * this.field4608[4] * this.field4608[2] + this.field4608[8] * this.field4608[1] * this.field4608[6] + (this.field4608[5] * this.field4608[0] * this.field4608[10] - this.field4608[9] * this.field4608[0] * this.field4608[6] - this.field4608[10] * this.field4608[1] * this.field4608[4]) - this.field4608[5] * this.field4608[2] * this.field4608[8]);
      this.field4608[0] = var2;
      this.field4608[1] = var3;
      this.field4608[2] = var4;
      this.field4608[3] = var5;
      this.field4608[4] = var6;
      this.field4608[5] = var7;
      this.field4608[6] = var8;
      this.field4608[7] = var9;
      this.field4608[8] = var10;
      this.field4608[9] = var11;
      this.field4608[10] = var12;
      this.field4608[11] = var13;
      this.field4608[12] = var14;
      this.field4608[13] = var15;
      this.field4608[14] = var16;
      this.field4608[15] = var17;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1849517045"
   )
   public float[] method7857() {
      float[] var1 = new float[3];
      class419 var2 = new class419(this.field4608[0], this.field4608[1], this.field4608[2]);
      class419 var3 = new class419(this.field4608[4], this.field4608[5], this.field4608[6]);
      class419 var4 = new class419(this.field4608[8], this.field4608[9], this.field4608[10]);
      var1[0] = var2.method7815();
      var1[1] = var3.method7815();
      var1[2] = var4.method7815();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method7858();
      this.method7844();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4608[var3 + var2 * 4];
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
      var2 = 31 * var2 + Arrays.hashCode(this.field4608);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class421)) {
         return false;
      } else {
         class421 var2 = (class421)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.field4608[var3] != var2.field4608[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Lgj;",
      garbageValue = "-1046185305"
   )
   public static Clock method7879() {
      try {
         return new NanoClock();
      } catch (Throwable var1) {
         return new MilliClock();
      }
   }
}
