import java.util.Arrays;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public final class class410 {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Loj;"
   )
   static class410[] field4609 = new class410[0];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1296378791
   )
   static int field4615 = 100;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 161940069
   )
   static int field4608;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   public static final class410 field4613;
   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;
   @ObfuscatedName("m")
   public float[] field4612 = new float[16];

   static {
      field4609 = new class410[100];
      field4608 = 0;
      field4613 = new class410();
   }

   public class410() {
      this.method7782();
   }

   @ObfuscatedSignature(
      descriptor = "(Loj;)V"
   )
   public class410(class410 var1) {
      this.method7784(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqy;Z)V"
   )
   public class410(Buffer var1, boolean var2) {
      this.method7779(var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1020610059"
   )
   public void method7795() {
      synchronized(field4609) {
         if (field4608 < field4615 - 1) {
            field4609[++field4608 - 1] = this;
         }

      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;ZI)V",
      garbageValue = "271698512"
   )
   void method7779(Buffer var1, boolean var2) {
      if (var2) {
         class411 var13 = new class411();
         int var6 = var1.readShort();
         var6 &= 16383;
         float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586);
         var13.method7835(var5);
         int var9 = var1.readShort();
         var9 &= 16383;
         float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586);
         var13.method7836(var8);
         int var12 = var1.readShort();
         var12 &= 16383;
         float var11 = (float)(6.283185307179586 * (double)((float)var12 / 16384.0F));
         var13.method7840(var11);
         var13.method7838((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method7790(var13);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4612[var3] = var1.method8556();
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)[F",
      garbageValue = "22"
   )
   float[] method7780() {
      float[] var1 = new float[3];
      if ((double)this.field4612[2] < 0.999 && (double)this.field4612[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4612[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4612[6] / var2, (double)this.field4612[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4612[1] / var2, (double)this.field4612[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4612[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4612[9]), (double)this.field4612[5]);
      }

      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "-999012260"
   )
   public float[] method7781() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4612[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4612[2];
         var6 = (double)this.field4612[10];
         double var8 = (double)this.field4612[4];
         double var10 = (double)this.field4612[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4612[1];
         var6 = (double)this.field4612[0];
         if (this.field4612[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-51"
   )
   void method7782() {
      this.field4612[0] = 1.0F;
      this.field4612[1] = 0.0F;
      this.field4612[2] = 0.0F;
      this.field4612[3] = 0.0F;
      this.field4612[4] = 0.0F;
      this.field4612[5] = 1.0F;
      this.field4612[6] = 0.0F;
      this.field4612[7] = 0.0F;
      this.field4612[8] = 0.0F;
      this.field4612[9] = 0.0F;
      this.field4612[10] = 1.0F;
      this.field4612[11] = 0.0F;
      this.field4612[12] = 0.0F;
      this.field4612[13] = 0.0F;
      this.field4612[14] = 0.0F;
      this.field4612[15] = 1.0F;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "395260364"
   )
   public void method7783() {
      this.field4612[0] = 0.0F;
      this.field4612[1] = 0.0F;
      this.field4612[2] = 0.0F;
      this.field4612[3] = 0.0F;
      this.field4612[4] = 0.0F;
      this.field4612[5] = 0.0F;
      this.field4612[6] = 0.0F;
      this.field4612[7] = 0.0F;
      this.field4612[8] = 0.0F;
      this.field4612[9] = 0.0F;
      this.field4612[10] = 0.0F;
      this.field4612[11] = 0.0F;
      this.field4612[12] = 0.0F;
      this.field4612[13] = 0.0F;
      this.field4612[14] = 0.0F;
      this.field4612[15] = 0.0F;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-584495645"
   )
   public void method7784(class410 var1) {
      System.arraycopy(var1.field4612, 0, this.field4612, 0, 16);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(FS)V",
      garbageValue = "-2109"
   )
   public void method7785(float var1) {
      this.method7786(var1, var1, var1);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "-504827889"
   )
   public void method7786(float var1, float var2, float var3) {
      this.method7782();
      this.field4612[0] = var1;
      this.field4612[5] = var2;
      this.field4612[10] = var3;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-496202053"
   )
   public void method7830(class410 var1) {
      for(int var2 = 0; var2 < this.field4612.length; ++var2) {
         float[] var10000 = this.field4612;
         var10000[var2] += var1.field4612[var2];
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "1995782349"
   )
   public void method7788(class410 var1) {
      float var2 = this.field4612[3] * var1.field4612[12] + this.field4612[2] * var1.field4612[8] + var1.field4612[4] * this.field4612[1] + var1.field4612[0] * this.field4612[0];
      float var3 = this.field4612[1] * var1.field4612[5] + var1.field4612[1] * this.field4612[0] + var1.field4612[9] * this.field4612[2] + var1.field4612[13] * this.field4612[3];
      float var4 = this.field4612[1] * var1.field4612[6] + var1.field4612[2] * this.field4612[0] + var1.field4612[10] * this.field4612[2] + this.field4612[3] * var1.field4612[14];
      float var5 = this.field4612[3] * var1.field4612[15] + this.field4612[2] * var1.field4612[11] + var1.field4612[3] * this.field4612[0] + var1.field4612[7] * this.field4612[1];
      float var6 = var1.field4612[0] * this.field4612[4] + var1.field4612[4] * this.field4612[5] + var1.field4612[8] * this.field4612[6] + this.field4612[7] * var1.field4612[12];
      float var7 = var1.field4612[13] * this.field4612[7] + var1.field4612[1] * this.field4612[4] + this.field4612[5] * var1.field4612[5] + this.field4612[6] * var1.field4612[9];
      float var8 = var1.field4612[14] * this.field4612[7] + var1.field4612[10] * this.field4612[6] + var1.field4612[6] * this.field4612[5] + var1.field4612[2] * this.field4612[4];
      float var9 = this.field4612[5] * var1.field4612[7] + var1.field4612[3] * this.field4612[4] + this.field4612[6] * var1.field4612[11] + var1.field4612[15] * this.field4612[7];
      float var10 = var1.field4612[12] * this.field4612[11] + this.field4612[10] * var1.field4612[8] + var1.field4612[0] * this.field4612[8] + this.field4612[9] * var1.field4612[4];
      float var11 = this.field4612[11] * var1.field4612[13] + this.field4612[9] * var1.field4612[5] + var1.field4612[1] * this.field4612[8] + var1.field4612[9] * this.field4612[10];
      float var12 = this.field4612[9] * var1.field4612[6] + var1.field4612[2] * this.field4612[8] + var1.field4612[10] * this.field4612[10] + this.field4612[11] * var1.field4612[14];
      float var13 = var1.field4612[11] * this.field4612[10] + this.field4612[9] * var1.field4612[7] + this.field4612[8] * var1.field4612[3] + var1.field4612[15] * this.field4612[11];
      float var14 = this.field4612[15] * var1.field4612[12] + var1.field4612[8] * this.field4612[14] + var1.field4612[4] * this.field4612[13] + var1.field4612[0] * this.field4612[12];
      float var15 = this.field4612[12] * var1.field4612[1] + this.field4612[13] * var1.field4612[5] + this.field4612[14] * var1.field4612[9] + var1.field4612[13] * this.field4612[15];
      float var16 = var1.field4612[14] * this.field4612[15] + var1.field4612[10] * this.field4612[14] + var1.field4612[6] * this.field4612[13] + var1.field4612[2] * this.field4612[12];
      float var17 = var1.field4612[15] * this.field4612[15] + this.field4612[13] * var1.field4612[7] + var1.field4612[3] * this.field4612[12] + var1.field4612[11] * this.field4612[14];
      this.field4612[0] = var2;
      this.field4612[1] = var3;
      this.field4612[2] = var4;
      this.field4612[3] = var5;
      this.field4612[4] = var6;
      this.field4612[5] = var7;
      this.field4612[6] = var8;
      this.field4612[7] = var9;
      this.field4612[8] = var10;
      this.field4612[9] = var11;
      this.field4612[10] = var12;
      this.field4612[11] = var13;
      this.field4612[12] = var14;
      this.field4612[13] = var15;
      this.field4612[14] = var16;
      this.field4612[15] = var17;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lop;B)V",
      garbageValue = "8"
   )
   public void method7789(class409 var1) {
      float var2 = var1.field4606 * var1.field4606;
      float var3 = var1.field4603 * var1.field4606;
      float var4 = var1.field4600 * var1.field4606;
      float var5 = var1.field4605 * var1.field4606;
      float var6 = var1.field4603 * var1.field4603;
      float var7 = var1.field4603 * var1.field4600;
      float var8 = var1.field4603 * var1.field4605;
      float var9 = var1.field4600 * var1.field4600;
      float var10 = var1.field4600 * var1.field4605;
      float var11 = var1.field4605 * var1.field4605;
      this.field4612[0] = var6 + var2 - var11 - var9;
      this.field4612[1] = var7 + var7 + var5 + var5;
      this.field4612[2] = var8 + (var8 - var4 - var4);
      this.field4612[4] = var7 + (var7 - var5 - var5);
      this.field4612[5] = var9 + var2 - var6 - var11;
      this.field4612[6] = var3 + var10 + var3 + var10;
      this.field4612[8] = var4 + var8 + var8 + var4;
      this.field4612[9] = var10 - var3 - var3 + var10;
      this.field4612[10] = var2 + var11 - var9 - var6;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Loc;I)V",
      garbageValue = "1326296862"
   )
   void method7790(class411 var1) {
      this.field4612[0] = var1.field4624;
      this.field4612[1] = var1.field4617;
      this.field4612[2] = var1.field4618;
      this.field4612[3] = 0.0F;
      this.field4612[4] = var1.field4625;
      this.field4612[5] = var1.field4620;
      this.field4612[6] = var1.field4621;
      this.field4612[7] = 0.0F;
      this.field4612[8] = var1.field4622;
      this.field4612[9] = var1.field4623;
      this.field4612[10] = var1.field4616;
      this.field4612[11] = 0.0F;
      this.field4612[12] = var1.field4627;
      this.field4612[13] = var1.field4626;
      this.field4612[14] = var1.field4619;
      this.field4612[15] = 1.0F;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)F",
      garbageValue = "-72"
   )
   float method7803() {
      return this.field4612[12] * this.field4612[6] * this.field4612[3] * this.field4612[9] + (this.field4612[13] * this.field4612[3] * this.field4612[4] * this.field4612[10] + (this.field4612[11] * this.field4612[2] * this.field4612[5] * this.field4612[12] + (this.field4612[15] * this.field4612[2] * this.field4612[4] * this.field4612[9] + this.field4612[15] * this.field4612[10] * this.field4612[5] * this.field4612[0] - this.field4612[11] * this.field4612[5] * this.field4612[0] * this.field4612[14] - this.field4612[15] * this.field4612[9] * this.field4612[0] * this.field4612[6] + this.field4612[13] * this.field4612[0] * this.field4612[6] * this.field4612[11] + this.field4612[0] * this.field4612[7] * this.field4612[9] * this.field4612[14] - this.field4612[13] * this.field4612[10] * this.field4612[0] * this.field4612[7] - this.field4612[15] * this.field4612[4] * this.field4612[1] * this.field4612[10] + this.field4612[14] * this.field4612[4] * this.field4612[1] * this.field4612[11] + this.field4612[15] * this.field4612[8] * this.field4612[1] * this.field4612[6] - this.field4612[12] * this.field4612[11] * this.field4612[1] * this.field4612[6] - this.field4612[8] * this.field4612[1] * this.field4612[7] * this.field4612[14] + this.field4612[12] * this.field4612[7] * this.field4612[1] * this.field4612[10] - this.field4612[13] * this.field4612[11] * this.field4612[4] * this.field4612[2] - this.field4612[8] * this.field4612[5] * this.field4612[2] * this.field4612[15]) + this.field4612[7] * this.field4612[2] * this.field4612[8] * this.field4612[13] - this.field4612[7] * this.field4612[2] * this.field4612[9] * this.field4612[12] - this.field4612[3] * this.field4612[4] * this.field4612[9] * this.field4612[14]) + this.field4612[3] * this.field4612[5] * this.field4612[8] * this.field4612[14] - this.field4612[10] * this.field4612[5] * this.field4612[3] * this.field4612[12] - this.field4612[8] * this.field4612[3] * this.field4612[6] * this.field4612[13]);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-6"
   )
   public void method7792() {
      float var1 = 1.0F / this.method7803();
      float var2 = (this.field4612[14] * this.field4612[7] * this.field4612[9] + this.field4612[11] * this.field4612[6] * this.field4612[13] + (this.field4612[15] * this.field4612[10] * this.field4612[5] - this.field4612[14] * this.field4612[5] * this.field4612[11] - this.field4612[9] * this.field4612[6] * this.field4612[15]) - this.field4612[10] * this.field4612[7] * this.field4612[13]) * var1;
      float var3 = var1 * (this.field4612[10] * this.field4612[3] * this.field4612[13] + (this.field4612[15] * this.field4612[9] * this.field4612[2] + this.field4612[14] * this.field4612[1] * this.field4612[11] + this.field4612[15] * -this.field4612[1] * this.field4612[10] - this.field4612[13] * this.field4612[2] * this.field4612[11] - this.field4612[3] * this.field4612[9] * this.field4612[14]));
      float var4 = var1 * (this.field4612[13] * this.field4612[7] * this.field4612[2] + (this.field4612[6] * this.field4612[1] * this.field4612[15] - this.field4612[14] * this.field4612[1] * this.field4612[7] - this.field4612[2] * this.field4612[5] * this.field4612[15]) + this.field4612[5] * this.field4612[3] * this.field4612[14] - this.field4612[6] * this.field4612[3] * this.field4612[13]);
      float var5 = (this.field4612[6] * this.field4612[3] * this.field4612[9] + (this.field4612[11] * this.field4612[2] * this.field4612[5] + this.field4612[1] * this.field4612[7] * this.field4612[10] + -this.field4612[1] * this.field4612[6] * this.field4612[11] - this.field4612[9] * this.field4612[7] * this.field4612[2] - this.field4612[10] * this.field4612[5] * this.field4612[3])) * var1;
      float var6 = var1 * (this.field4612[7] * this.field4612[10] * this.field4612[12] + (-this.field4612[4] * this.field4612[10] * this.field4612[15] + this.field4612[4] * this.field4612[11] * this.field4612[14] + this.field4612[6] * this.field4612[8] * this.field4612[15] - this.field4612[6] * this.field4612[11] * this.field4612[12] - this.field4612[14] * this.field4612[7] * this.field4612[8]));
      float var7 = (this.field4612[10] * this.field4612[0] * this.field4612[15] - this.field4612[14] * this.field4612[0] * this.field4612[11] - this.field4612[15] * this.field4612[8] * this.field4612[2] + this.field4612[2] * this.field4612[11] * this.field4612[12] + this.field4612[14] * this.field4612[8] * this.field4612[3] - this.field4612[10] * this.field4612[3] * this.field4612[12]) * var1;
      float var8 = var1 * (this.field4612[12] * this.field4612[6] * this.field4612[3] + (this.field4612[14] * this.field4612[0] * this.field4612[7] + this.field4612[15] * -this.field4612[0] * this.field4612[6] + this.field4612[15] * this.field4612[2] * this.field4612[4] - this.field4612[7] * this.field4612[2] * this.field4612[12] - this.field4612[4] * this.field4612[3] * this.field4612[14]));
      float var9 = (this.field4612[4] * this.field4612[3] * this.field4612[10] + this.field4612[2] * this.field4612[7] * this.field4612[8] + (this.field4612[6] * this.field4612[0] * this.field4612[11] - this.field4612[0] * this.field4612[7] * this.field4612[10] - this.field4612[11] * this.field4612[4] * this.field4612[2]) - this.field4612[6] * this.field4612[3] * this.field4612[8]) * var1;
      float var10 = var1 * (this.field4612[11] * this.field4612[5] * this.field4612[12] + (this.field4612[15] * this.field4612[4] * this.field4612[9] - this.field4612[4] * this.field4612[11] * this.field4612[13] - this.field4612[15] * this.field4612[5] * this.field4612[8]) + this.field4612[7] * this.field4612[8] * this.field4612[13] - this.field4612[9] * this.field4612[7] * this.field4612[12]);
      float var11 = var1 * (this.field4612[9] * this.field4612[3] * this.field4612[12] + (this.field4612[9] * -this.field4612[0] * this.field4612[15] + this.field4612[0] * this.field4612[11] * this.field4612[13] + this.field4612[1] * this.field4612[8] * this.field4612[15] - this.field4612[12] * this.field4612[11] * this.field4612[1] - this.field4612[13] * this.field4612[8] * this.field4612[3]));
      float var12 = (this.field4612[13] * this.field4612[4] * this.field4612[3] + this.field4612[12] * this.field4612[7] * this.field4612[1] + (this.field4612[0] * this.field4612[5] * this.field4612[15] - this.field4612[7] * this.field4612[0] * this.field4612[13] - this.field4612[15] * this.field4612[1] * this.field4612[4]) - this.field4612[12] * this.field4612[5] * this.field4612[3]) * var1;
      float var13 = (this.field4612[5] * this.field4612[3] * this.field4612[8] + (this.field4612[4] * this.field4612[1] * this.field4612[11] + this.field4612[9] * this.field4612[0] * this.field4612[7] + this.field4612[5] * -this.field4612[0] * this.field4612[11] - this.field4612[8] * this.field4612[7] * this.field4612[1] - this.field4612[4] * this.field4612[3] * this.field4612[9])) * var1;
      float var14 = (this.field4612[12] * this.field4612[6] * this.field4612[9] + (this.field4612[14] * this.field4612[5] * this.field4612[8] + this.field4612[13] * this.field4612[10] * this.field4612[4] + -this.field4612[4] * this.field4612[9] * this.field4612[14] - this.field4612[12] * this.field4612[5] * this.field4612[10] - this.field4612[13] * this.field4612[6] * this.field4612[8])) * var1;
      float var15 = (this.field4612[14] * this.field4612[9] * this.field4612[0] - this.field4612[10] * this.field4612[0] * this.field4612[13] - this.field4612[1] * this.field4612[8] * this.field4612[14] + this.field4612[10] * this.field4612[1] * this.field4612[12] + this.field4612[13] * this.field4612[8] * this.field4612[2] - this.field4612[12] * this.field4612[2] * this.field4612[9]) * var1;
      float var16 = var1 * (this.field4612[14] * this.field4612[1] * this.field4612[4] + this.field4612[14] * -this.field4612[0] * this.field4612[5] + this.field4612[13] * this.field4612[0] * this.field4612[6] - this.field4612[12] * this.field4612[6] * this.field4612[1] - this.field4612[13] * this.field4612[2] * this.field4612[4] + this.field4612[5] * this.field4612[2] * this.field4612[12]);
      float var17 = (this.field4612[8] * this.field4612[1] * this.field4612[6] + (this.field4612[10] * this.field4612[5] * this.field4612[0] - this.field4612[0] * this.field4612[6] * this.field4612[9] - this.field4612[4] * this.field4612[1] * this.field4612[10]) + this.field4612[4] * this.field4612[2] * this.field4612[9] - this.field4612[2] * this.field4612[5] * this.field4612[8]) * var1;
      this.field4612[0] = var2;
      this.field4612[1] = var3;
      this.field4612[2] = var4;
      this.field4612[3] = var5;
      this.field4612[4] = var6;
      this.field4612[5] = var7;
      this.field4612[6] = var8;
      this.field4612[7] = var9;
      this.field4612[8] = var10;
      this.field4612[9] = var11;
      this.field4612[10] = var12;
      this.field4612[11] = var13;
      this.field4612[12] = var14;
      this.field4612[13] = var15;
      this.field4612[14] = var16;
      this.field4612[15] = var17;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1949764600"
   )
   public float[] method7794() {
      float[] var1 = new float[3];
      class408 var2 = new class408(this.field4612[0], this.field4612[1], this.field4612[2]);
      class408 var3 = new class408(this.field4612[4], this.field4612[5], this.field4612[6]);
      class408 var4 = new class408(this.field4612[8], this.field4612[9], this.field4612[10]);
      var1[0] = var2.method7751();
      var1[1] = var3.method7751();
      var1[2] = var4.method7751();
      return var1;
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = 31 * var2 + Arrays.hashCode(this.field4612);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class410)) {
         return false;
      } else {
         class410 var2 = (class410)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field4612[var3] != this.field4612[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method7781();
      this.method7780();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4612[var3 + var2 * 4];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;B)Z",
      garbageValue = "-34"
   )
   static boolean method7833(Date var0) {
      Date var1 = class200.method4093();
      return var0.after(var1);
   }
}
