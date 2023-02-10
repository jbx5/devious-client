import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public final class class417 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   public static final class417 field4646;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[Lpb;"
   )
   public static class417[] field4641 = new class417[0];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1269002537
   )
   static int field4642 = 100;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1291302581
   )
   public static int field4643;
   @ObfuscatedName("j")
   public float[] field4644 = new float[16];

   static {
      field4641 = new class417[100];
      field4643 = 0;
      field4646 = new class417();
   }

   public class417() {
      this.method7964();
   }

   @ObfuscatedSignature(
      descriptor = "(Lpb;)V"
   )
   public class417(class417 var1) {
      this.method7915(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Lrd;Z)V"
   )
   public class417(Buffer var1, boolean var2) {
      this.method7933(var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "93"
   )
   public void method7908() {
      synchronized(field4641) {
         if (field4643 < field4642 - 1) {
            field4641[++field4643 - 1] = this;
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;ZI)V",
      garbageValue = "-1728654158"
   )
   void method7933(Buffer var1, boolean var2) {
      if (var2) {
         class418 var13 = new class418();
         int var6 = var1.readShort();
         var6 &= 16383;
         float var5 = (float)(6.283185307179586 * (double)((float)var6 / 16384.0F));
         var13.method7968(var5);
         int var9 = var1.readShort();
         var9 &= 16383;
         float var8 = (float)(6.283185307179586 * (double)((float)var9 / 16384.0F));
         var13.method7980(var8);
         int var12 = var1.readShort();
         var12 &= 16383;
         float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586);
         var13.method7969(var11);
         var13.method7970((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method7920(var13);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4644[var3] = var1.method8764();
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "-1321135888"
   )
   float[] method7911() {
      float[] var1 = new float[3];
      if ((double)this.field4644[2] < 0.999 && (double)this.field4644[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4644[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4644[6] / var2, (double)this.field4644[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4644[1] / var2, (double)this.field4644[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4644[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4644[9]), (double)this.field4644[5]);
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "-1583268268"
   )
   public float[] method7912() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4644[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4644[2];
         var6 = (double)this.field4644[10];
         double var8 = (double)this.field4644[4];
         double var10 = (double)this.field4644[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4644[1];
         var6 = (double)this.field4644[0];
         if (this.field4644[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "68"
   )
   public void method7964() {
      this.field4644[0] = 1.0F;
      this.field4644[1] = 0.0F;
      this.field4644[2] = 0.0F;
      this.field4644[3] = 0.0F;
      this.field4644[4] = 0.0F;
      this.field4644[5] = 1.0F;
      this.field4644[6] = 0.0F;
      this.field4644[7] = 0.0F;
      this.field4644[8] = 0.0F;
      this.field4644[9] = 0.0F;
      this.field4644[10] = 1.0F;
      this.field4644[11] = 0.0F;
      this.field4644[12] = 0.0F;
      this.field4644[13] = 0.0F;
      this.field4644[14] = 0.0F;
      this.field4644[15] = 1.0F;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-118815811"
   )
   public void method7955() {
      this.field4644[0] = 0.0F;
      this.field4644[1] = 0.0F;
      this.field4644[2] = 0.0F;
      this.field4644[3] = 0.0F;
      this.field4644[4] = 0.0F;
      this.field4644[5] = 0.0F;
      this.field4644[6] = 0.0F;
      this.field4644[7] = 0.0F;
      this.field4644[8] = 0.0F;
      this.field4644[9] = 0.0F;
      this.field4644[10] = 0.0F;
      this.field4644[11] = 0.0F;
      this.field4644[12] = 0.0F;
      this.field4644[13] = 0.0F;
      this.field4644[14] = 0.0F;
      this.field4644[15] = 0.0F;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)V",
      garbageValue = "-1538664278"
   )
   public void method7915(class417 var1) {
      System.arraycopy(var1.field4644, 0, this.field4644, 0, 16);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "1501741729"
   )
   public void method7936(float var1) {
      this.method7923(var1, var1, var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(FFFB)V",
      garbageValue = "-1"
   )
   public void method7923(float var1, float var2, float var3) {
      this.method7964();
      this.field4644[0] = var1;
      this.field4644[5] = var2;
      this.field4644[10] = var3;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lpb;B)V",
      garbageValue = "-15"
   )
   public void method7917(class417 var1) {
      for(int var2 = 0; var2 < this.field4644.length; ++var2) {
         float[] var10000 = this.field4644;
         var10000[var2] += var1.field4644[var2];
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)V",
      garbageValue = "1770760973"
   )
   public void method7914(class417 var1) {
      float var2 = var1.field4644[0] * this.field4644[0] + var1.field4644[4] * this.field4644[1] + var1.field4644[8] * this.field4644[2] + var1.field4644[12] * this.field4644[3];
      float var3 = this.field4644[3] * var1.field4644[13] + this.field4644[1] * var1.field4644[5] + this.field4644[0] * var1.field4644[1] + var1.field4644[9] * this.field4644[2];
      float var4 = this.field4644[3] * var1.field4644[14] + var1.field4644[2] * this.field4644[0] + var1.field4644[6] * this.field4644[1] + this.field4644[2] * var1.field4644[10];
      float var5 = this.field4644[3] * var1.field4644[15] + this.field4644[2] * var1.field4644[11] + this.field4644[0] * var1.field4644[3] + var1.field4644[7] * this.field4644[1];
      float var6 = this.field4644[7] * var1.field4644[12] + this.field4644[6] * var1.field4644[8] + var1.field4644[0] * this.field4644[4] + this.field4644[5] * var1.field4644[4];
      float var7 = this.field4644[5] * var1.field4644[5] + this.field4644[4] * var1.field4644[1] + var1.field4644[9] * this.field4644[6] + this.field4644[7] * var1.field4644[13];
      float var8 = var1.field4644[14] * this.field4644[7] + var1.field4644[10] * this.field4644[6] + var1.field4644[6] * this.field4644[5] + var1.field4644[2] * this.field4644[4];
      float var9 = var1.field4644[11] * this.field4644[6] + this.field4644[5] * var1.field4644[7] + this.field4644[4] * var1.field4644[3] + this.field4644[7] * var1.field4644[15];
      float var10 = this.field4644[9] * var1.field4644[4] + var1.field4644[0] * this.field4644[8] + this.field4644[10] * var1.field4644[8] + this.field4644[11] * var1.field4644[12];
      float var11 = var1.field4644[13] * this.field4644[11] + this.field4644[10] * var1.field4644[9] + var1.field4644[5] * this.field4644[9] + var1.field4644[1] * this.field4644[8];
      float var12 = this.field4644[11] * var1.field4644[14] + var1.field4644[6] * this.field4644[9] + var1.field4644[2] * this.field4644[8] + this.field4644[10] * var1.field4644[10];
      float var13 = var1.field4644[15] * this.field4644[11] + var1.field4644[3] * this.field4644[8] + this.field4644[9] * var1.field4644[7] + this.field4644[10] * var1.field4644[11];
      float var14 = this.field4644[14] * var1.field4644[8] + this.field4644[12] * var1.field4644[0] + this.field4644[13] * var1.field4644[4] + var1.field4644[12] * this.field4644[15];
      float var15 = var1.field4644[13] * this.field4644[15] + this.field4644[12] * var1.field4644[1] + this.field4644[13] * var1.field4644[5] + var1.field4644[9] * this.field4644[14];
      float var16 = this.field4644[15] * var1.field4644[14] + var1.field4644[2] * this.field4644[12] + var1.field4644[6] * this.field4644[13] + this.field4644[14] * var1.field4644[10];
      float var17 = this.field4644[15] * var1.field4644[15] + this.field4644[14] * var1.field4644[11] + this.field4644[13] * var1.field4644[7] + this.field4644[12] * var1.field4644[3];
      this.field4644[0] = var2;
      this.field4644[1] = var3;
      this.field4644[2] = var4;
      this.field4644[3] = var5;
      this.field4644[4] = var6;
      this.field4644[5] = var7;
      this.field4644[6] = var8;
      this.field4644[7] = var9;
      this.field4644[8] = var10;
      this.field4644[9] = var11;
      this.field4644[10] = var12;
      this.field4644[11] = var13;
      this.field4644[12] = var14;
      this.field4644[13] = var15;
      this.field4644[14] = var16;
      this.field4644[15] = var17;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lpl;I)V",
      garbageValue = "-1344791874"
   )
   public void method7919(class416 var1) {
      float var2 = var1.field4639 * var1.field4639;
      float var3 = var1.field4636 * var1.field4639;
      float var4 = var1.field4639 * var1.field4637;
      float var5 = var1.field4638 * var1.field4639;
      float var6 = var1.field4636 * var1.field4636;
      float var7 = var1.field4637 * var1.field4636;
      float var8 = var1.field4636 * var1.field4638;
      float var9 = var1.field4637 * var1.field4637;
      float var10 = var1.field4638 * var1.field4637;
      float var11 = var1.field4638 * var1.field4638;
      this.field4644[0] = var2 + var6 - var11 - var9;
      this.field4644[1] = var5 + var5 + var7 + var7;
      this.field4644[2] = var8 - var4 - var4 + var8;
      this.field4644[4] = var7 + (var7 - var5 - var5);
      this.field4644[5] = var2 + var9 - var6 - var11;
      this.field4644[6] = var10 + var3 + var10 + var3;
      this.field4644[8] = var4 + var8 + var8 + var4;
      this.field4644[9] = var10 - var3 - var3 + var10;
      this.field4644[10] = var2 + var11 - var9 - var6;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lpn;I)V",
      garbageValue = "969352548"
   )
   void method7920(class418 var1) {
      this.field4644[0] = var1.field4652;
      this.field4644[1] = var1.field4648;
      this.field4644[2] = var1.field4649;
      this.field4644[3] = 0.0F;
      this.field4644[4] = var1.field4650;
      this.field4644[5] = var1.field4651;
      this.field4644[6] = var1.field4653;
      this.field4644[7] = 0.0F;
      this.field4644[8] = var1.field4654;
      this.field4644[9] = var1.field4655;
      this.field4644[10] = var1.field4658;
      this.field4644[11] = 0.0F;
      this.field4644[12] = var1.field4656;
      this.field4644[13] = var1.field4657;
      this.field4644[14] = var1.field4647;
      this.field4644[15] = 1.0F;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "-1920224065"
   )
   float method7921() {
      return this.field4644[8] * this.field4644[5] * this.field4644[3] * this.field4644[14] + this.field4644[13] * this.field4644[10] * this.field4644[3] * this.field4644[4] + (this.field4644[8] * this.field4644[1] * this.field4644[6] * this.field4644[15] + this.field4644[14] * this.field4644[1] * this.field4644[4] * this.field4644[11] + (this.field4644[14] * this.field4644[9] * this.field4644[0] * this.field4644[7] + this.field4644[11] * this.field4644[6] * this.field4644[0] * this.field4644[13] + (this.field4644[15] * this.field4644[10] * this.field4644[5] * this.field4644[0] - this.field4644[11] * this.field4644[5] * this.field4644[0] * this.field4644[14] - this.field4644[15] * this.field4644[9] * this.field4644[0] * this.field4644[6]) - this.field4644[0] * this.field4644[7] * this.field4644[10] * this.field4644[13] - this.field4644[1] * this.field4644[4] * this.field4644[10] * this.field4644[15]) - this.field4644[12] * this.field4644[6] * this.field4644[1] * this.field4644[11] - this.field4644[8] * this.field4644[1] * this.field4644[7] * this.field4644[14] + this.field4644[12] * this.field4644[10] * this.field4644[7] * this.field4644[1] + this.field4644[2] * this.field4644[4] * this.field4644[9] * this.field4644[15] - this.field4644[13] * this.field4644[11] * this.field4644[4] * this.field4644[2] - this.field4644[2] * this.field4644[5] * this.field4644[8] * this.field4644[15] + this.field4644[12] * this.field4644[11] * this.field4644[5] * this.field4644[2] + this.field4644[13] * this.field4644[2] * this.field4644[7] * this.field4644[8] - this.field4644[7] * this.field4644[2] * this.field4644[9] * this.field4644[12] - this.field4644[14] * this.field4644[4] * this.field4644[3] * this.field4644[9]) - this.field4644[3] * this.field4644[5] * this.field4644[10] * this.field4644[12] - this.field4644[13] * this.field4644[3] * this.field4644[6] * this.field4644[8] + this.field4644[9] * this.field4644[6] * this.field4644[3] * this.field4644[12];
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-966337264"
   )
   public void method7922() {
      float var1 = 1.0F / this.method7921();
      float var2 = var1 * (this.field4644[13] * this.field4644[6] * this.field4644[11] + (this.field4644[10] * this.field4644[5] * this.field4644[15] - this.field4644[14] * this.field4644[11] * this.field4644[5] - this.field4644[6] * this.field4644[9] * this.field4644[15]) + this.field4644[9] * this.field4644[7] * this.field4644[14] - this.field4644[13] * this.field4644[10] * this.field4644[7]);
      float var3 = var1 * (this.field4644[13] * this.field4644[10] * this.field4644[3] + (this.field4644[10] * -this.field4644[1] * this.field4644[15] + this.field4644[14] * this.field4644[11] * this.field4644[1] + this.field4644[9] * this.field4644[2] * this.field4644[15] - this.field4644[13] * this.field4644[11] * this.field4644[2] - this.field4644[3] * this.field4644[9] * this.field4644[14]));
      float var4 = (this.field4644[15] * this.field4644[1] * this.field4644[6] - this.field4644[14] * this.field4644[7] * this.field4644[1] - this.field4644[2] * this.field4644[5] * this.field4644[15] + this.field4644[2] * this.field4644[7] * this.field4644[13] + this.field4644[5] * this.field4644[3] * this.field4644[14] - this.field4644[13] * this.field4644[6] * this.field4644[3]) * var1;
      float var5 = (this.field4644[9] * this.field4644[6] * this.field4644[3] + (this.field4644[2] * this.field4644[5] * this.field4644[11] + this.field4644[1] * this.field4644[7] * this.field4644[10] + this.field4644[11] * this.field4644[6] * -this.field4644[1] - this.field4644[9] * this.field4644[7] * this.field4644[2] - this.field4644[3] * this.field4644[5] * this.field4644[10])) * var1;
      float var6 = (this.field4644[6] * this.field4644[8] * this.field4644[15] + this.field4644[15] * -this.field4644[4] * this.field4644[10] + this.field4644[14] * this.field4644[4] * this.field4644[11] - this.field4644[12] * this.field4644[11] * this.field4644[6] - this.field4644[7] * this.field4644[8] * this.field4644[14] + this.field4644[12] * this.field4644[10] * this.field4644[7]) * var1;
      float var7 = var1 * (this.field4644[8] * this.field4644[3] * this.field4644[14] + this.field4644[2] * this.field4644[11] * this.field4644[12] + (this.field4644[10] * this.field4644[0] * this.field4644[15] - this.field4644[0] * this.field4644[11] * this.field4644[14] - this.field4644[15] * this.field4644[8] * this.field4644[2]) - this.field4644[3] * this.field4644[10] * this.field4644[12]);
      float var8 = var1 * (this.field4644[2] * this.field4644[4] * this.field4644[15] + this.field4644[15] * this.field4644[6] * -this.field4644[0] + this.field4644[7] * this.field4644[0] * this.field4644[14] - this.field4644[12] * this.field4644[7] * this.field4644[2] - this.field4644[14] * this.field4644[3] * this.field4644[4] + this.field4644[3] * this.field4644[6] * this.field4644[12]);
      float var9 = (this.field4644[4] * this.field4644[3] * this.field4644[10] + this.field4644[11] * this.field4644[0] * this.field4644[6] - this.field4644[10] * this.field4644[7] * this.field4644[0] - this.field4644[11] * this.field4644[4] * this.field4644[2] + this.field4644[8] * this.field4644[2] * this.field4644[7] - this.field4644[8] * this.field4644[3] * this.field4644[6]) * var1;
      float var10 = (this.field4644[13] * this.field4644[7] * this.field4644[8] + this.field4644[11] * this.field4644[5] * this.field4644[12] + (this.field4644[9] * this.field4644[4] * this.field4644[15] - this.field4644[4] * this.field4644[11] * this.field4644[13] - this.field4644[15] * this.field4644[5] * this.field4644[8]) - this.field4644[12] * this.field4644[7] * this.field4644[9]) * var1;
      float var11 = (this.field4644[3] * this.field4644[9] * this.field4644[12] + (this.field4644[8] * this.field4644[1] * this.field4644[15] + this.field4644[9] * -this.field4644[0] * this.field4644[15] + this.field4644[11] * this.field4644[0] * this.field4644[13] - this.field4644[1] * this.field4644[11] * this.field4644[12] - this.field4644[13] * this.field4644[3] * this.field4644[8])) * var1;
      float var12 = (this.field4644[15] * this.field4644[5] * this.field4644[0] - this.field4644[0] * this.field4644[7] * this.field4644[13] - this.field4644[1] * this.field4644[4] * this.field4644[15] + this.field4644[1] * this.field4644[7] * this.field4644[12] + this.field4644[13] * this.field4644[4] * this.field4644[3] - this.field4644[12] * this.field4644[5] * this.field4644[3]) * var1;
      float var13 = var1 * (this.field4644[3] * this.field4644[5] * this.field4644[8] + (this.field4644[11] * this.field4644[4] * this.field4644[1] + -this.field4644[0] * this.field4644[5] * this.field4644[11] + this.field4644[7] * this.field4644[0] * this.field4644[9] - this.field4644[1] * this.field4644[7] * this.field4644[8] - this.field4644[3] * this.field4644[4] * this.field4644[9]));
      float var14 = var1 * (this.field4644[14] * this.field4644[9] * -this.field4644[4] + this.field4644[13] * this.field4644[4] * this.field4644[10] + this.field4644[8] * this.field4644[5] * this.field4644[14] - this.field4644[12] * this.field4644[10] * this.field4644[5] - this.field4644[8] * this.field4644[6] * this.field4644[13] + this.field4644[12] * this.field4644[9] * this.field4644[6]);
      float var15 = (this.field4644[14] * this.field4644[0] * this.field4644[9] - this.field4644[13] * this.field4644[0] * this.field4644[10] - this.field4644[14] * this.field4644[8] * this.field4644[1] + this.field4644[12] * this.field4644[1] * this.field4644[10] + this.field4644[2] * this.field4644[8] * this.field4644[13] - this.field4644[12] * this.field4644[2] * this.field4644[9]) * var1;
      float var16 = var1 * (this.field4644[14] * this.field4644[1] * this.field4644[4] + this.field4644[5] * -this.field4644[0] * this.field4644[14] + this.field4644[6] * this.field4644[0] * this.field4644[13] - this.field4644[12] * this.field4644[6] * this.field4644[1] - this.field4644[4] * this.field4644[2] * this.field4644[13] + this.field4644[12] * this.field4644[2] * this.field4644[5]);
      float var17 = (this.field4644[9] * this.field4644[2] * this.field4644[4] + this.field4644[1] * this.field4644[6] * this.field4644[8] + (this.field4644[5] * this.field4644[0] * this.field4644[10] - this.field4644[0] * this.field4644[6] * this.field4644[9] - this.field4644[4] * this.field4644[1] * this.field4644[10]) - this.field4644[2] * this.field4644[5] * this.field4644[8]) * var1;
      this.field4644[0] = var2;
      this.field4644[1] = var3;
      this.field4644[2] = var4;
      this.field4644[3] = var5;
      this.field4644[4] = var6;
      this.field4644[5] = var7;
      this.field4644[6] = var8;
      this.field4644[7] = var9;
      this.field4644[8] = var10;
      this.field4644[9] = var11;
      this.field4644[10] = var12;
      this.field4644[11] = var13;
      this.field4644[12] = var14;
      this.field4644[13] = var15;
      this.field4644[14] = var16;
      this.field4644[15] = var17;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "146135519"
   )
   public float[] method7924() {
      float[] var1 = new float[3];
      class415 var2 = new class415(this.field4644[0], this.field4644[1], this.field4644[2]);
      class415 var3 = new class415(this.field4644[4], this.field4644[5], this.field4644[6]);
      class415 var4 = new class415(this.field4644[8], this.field4644[9], this.field4644[10]);
      var1[0] = var2.method7872();
      var1[1] = var3.method7872();
      var1[2] = var4.method7872();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method7912();
      this.method7911();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4644[var3 + var2 * 4];
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
      var2 = var2 * 31 + Arrays.hashCode(this.field4644);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class417)) {
         return false;
      } else {
         class417 var2 = (class417)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field4644[var3] != this.field4644[var3]) {
               return false;
            }
         }

         return true;
      }
   }
}
