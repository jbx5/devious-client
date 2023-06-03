import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public final class class438 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lqp;"
   )
   static class438[] field4682 = new class438[0];
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -381350743
   )
   static int field4684;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   public static final class438 field4686;
   @ObfuscatedName("ax")
   public float[] field4685 = new float[16];

   static {
      class10.method104(100);
      field4686 = new class438();
   }

   public class438() {
      this.method8098();
   }

   @ObfuscatedSignature(
      descriptor = "(Lqp;)V"
   )
   public class438(class438 var1) {
      this.method8096(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Ltz;Z)V"
   )
   public class438(Buffer var1, boolean var2) {
      this.method8095(var1, var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1957373361"
   )
   public void method8119() {
      synchronized(field4682) {
         if (field4684 < UserComparator9.field1437 - 1) {
            field4682[++field4684 - 1] = this;
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;ZI)V",
      garbageValue = "-1884252111"
   )
   void method8095(Buffer var1, boolean var2) {
      if (var2) {
         class439 var13 = new class439();
         int var6 = var1.readShort();
         var6 &= 16383;
         float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586);
         var13.method8157(var5);
         int var9 = var1.readShort();
         var9 &= 16383;
         float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586);
         var13.method8169(var8);
         int var12 = var1.readShort();
         var12 &= 16383;
         float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586);
         var13.method8168(var11);
         var13.method8162((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method8106(var13);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4685[var3] = var1.method8916();
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "455501097"
   )
   float[] method8145() {
      float[] var1 = new float[3];
      if ((double)this.field4685[2] < 0.999 && (double)this.field4685[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4685[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4685[6] / var2, (double)this.field4685[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4685[1] / var2, (double)this.field4685[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4685[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4685[9]), (double)this.field4685[5]);
      }

      return var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1221709859"
   )
   public float[] method8097() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4685[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4685[2];
         var6 = (double)this.field4685[10];
         double var8 = (double)this.field4685[4];
         double var10 = (double)this.field4685[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4685[1];
         var6 = (double)this.field4685[0];
         if (this.field4685[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1068320526"
   )
   void method8098() {
      this.field4685[0] = 1.0F;
      this.field4685[1] = 0.0F;
      this.field4685[2] = 0.0F;
      this.field4685[3] = 0.0F;
      this.field4685[4] = 0.0F;
      this.field4685[5] = 1.0F;
      this.field4685[6] = 0.0F;
      this.field4685[7] = 0.0F;
      this.field4685[8] = 0.0F;
      this.field4685[9] = 0.0F;
      this.field4685[10] = 1.0F;
      this.field4685[11] = 0.0F;
      this.field4685[12] = 0.0F;
      this.field4685[13] = 0.0F;
      this.field4685[14] = 0.0F;
      this.field4685[15] = 1.0F;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-412578041"
   )
   public void method8099() {
      this.field4685[0] = 0.0F;
      this.field4685[1] = 0.0F;
      this.field4685[2] = 0.0F;
      this.field4685[3] = 0.0F;
      this.field4685[4] = 0.0F;
      this.field4685[5] = 0.0F;
      this.field4685[6] = 0.0F;
      this.field4685[7] = 0.0F;
      this.field4685[8] = 0.0F;
      this.field4685[9] = 0.0F;
      this.field4685[10] = 0.0F;
      this.field4685[11] = 0.0F;
      this.field4685[12] = 0.0F;
      this.field4685[13] = 0.0F;
      this.field4685[14] = 0.0F;
      this.field4685[15] = 0.0F;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lqp;I)V",
      garbageValue = "-1289616120"
   )
   public void method8096(class438 var1) {
      System.arraycopy(var1.field4685, 0, this.field4685, 0, 16);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "0"
   )
   public void method8101(float var1) {
      this.method8102(var1, var1, var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "377579402"
   )
   public void method8102(float var1, float var2, float var3) {
      this.method8098();
      this.field4685[0] = var1;
      this.field4685[5] = var2;
      this.field4685[10] = var3;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lqp;I)V",
      garbageValue = "-1768860871"
   )
   public void method8103(class438 var1) {
      for(int var2 = 0; var2 < this.field4685.length; ++var2) {
         float[] var10000 = this.field4685;
         var10000[var2] += var1.field4685[var2];
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lqp;B)V",
      garbageValue = "57"
   )
   public void method8104(class438 var1) {
      float var2 = var1.field4685[12] * this.field4685[3] + this.field4685[1] * var1.field4685[4] + var1.field4685[0] * this.field4685[0] + this.field4685[2] * var1.field4685[8];
      float var3 = var1.field4685[13] * this.field4685[3] + var1.field4685[9] * this.field4685[2] + var1.field4685[1] * this.field4685[0] + this.field4685[1] * var1.field4685[5];
      float var4 = var1.field4685[2] * this.field4685[0] + this.field4685[1] * var1.field4685[6] + var1.field4685[10] * this.field4685[2] + var1.field4685[14] * this.field4685[3];
      float var5 = var1.field4685[7] * this.field4685[1] + var1.field4685[3] * this.field4685[0] + var1.field4685[11] * this.field4685[2] + var1.field4685[15] * this.field4685[3];
      float var6 = var1.field4685[12] * this.field4685[7] + var1.field4685[4] * this.field4685[5] + this.field4685[4] * var1.field4685[0] + this.field4685[6] * var1.field4685[8];
      float var7 = var1.field4685[9] * this.field4685[6] + this.field4685[4] * var1.field4685[1] + var1.field4685[5] * this.field4685[5] + var1.field4685[13] * this.field4685[7];
      float var8 = var1.field4685[10] * this.field4685[6] + this.field4685[5] * var1.field4685[6] + this.field4685[4] * var1.field4685[2] + this.field4685[7] * var1.field4685[14];
      float var9 = var1.field4685[15] * this.field4685[7] + this.field4685[6] * var1.field4685[11] + this.field4685[5] * var1.field4685[7] + var1.field4685[3] * this.field4685[4];
      float var10 = var1.field4685[12] * this.field4685[11] + this.field4685[10] * var1.field4685[8] + var1.field4685[0] * this.field4685[8] + var1.field4685[4] * this.field4685[9];
      float var11 = this.field4685[10] * var1.field4685[9] + var1.field4685[5] * this.field4685[9] + this.field4685[8] * var1.field4685[1] + var1.field4685[13] * this.field4685[11];
      float var12 = this.field4685[9] * var1.field4685[6] + this.field4685[8] * var1.field4685[2] + this.field4685[10] * var1.field4685[10] + var1.field4685[14] * this.field4685[11];
      float var13 = this.field4685[11] * var1.field4685[15] + this.field4685[10] * var1.field4685[11] + this.field4685[8] * var1.field4685[3] + this.field4685[9] * var1.field4685[7];
      float var14 = var1.field4685[0] * this.field4685[12] + this.field4685[13] * var1.field4685[4] + var1.field4685[8] * this.field4685[14] + var1.field4685[12] * this.field4685[15];
      float var15 = var1.field4685[13] * this.field4685[15] + var1.field4685[5] * this.field4685[13] + var1.field4685[1] * this.field4685[12] + var1.field4685[9] * this.field4685[14];
      float var16 = this.field4685[12] * var1.field4685[2] + this.field4685[13] * var1.field4685[6] + this.field4685[14] * var1.field4685[10] + this.field4685[15] * var1.field4685[14];
      float var17 = this.field4685[14] * var1.field4685[11] + var1.field4685[3] * this.field4685[12] + var1.field4685[7] * this.field4685[13] + this.field4685[15] * var1.field4685[15];
      this.field4685[0] = var2;
      this.field4685[1] = var3;
      this.field4685[2] = var4;
      this.field4685[3] = var5;
      this.field4685[4] = var6;
      this.field4685[5] = var7;
      this.field4685[6] = var8;
      this.field4685[7] = var9;
      this.field4685[8] = var10;
      this.field4685[9] = var11;
      this.field4685[10] = var12;
      this.field4685[11] = var13;
      this.field4685[12] = var14;
      this.field4685[13] = var15;
      this.field4685[14] = var16;
      this.field4685[15] = var17;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lqj;S)V",
      garbageValue = "5361"
   )
   public void method8105(class437 var1) {
      float var2 = var1.field4674 * var1.field4674;
      float var3 = var1.field4678 * var1.field4674;
      float var4 = var1.field4675 * var1.field4674;
      float var5 = var1.field4674 * var1.field4679;
      float var6 = var1.field4678 * var1.field4678;
      float var7 = var1.field4678 * var1.field4675;
      float var8 = var1.field4679 * var1.field4678;
      float var9 = var1.field4675 * var1.field4675;
      float var10 = var1.field4675 * var1.field4679;
      float var11 = var1.field4679 * var1.field4679;
      this.field4685[0] = var6 + var2 - var11 - var9;
      this.field4685[1] = var5 + var7 + var5 + var7;
      this.field4685[2] = var8 + (var8 - var4 - var4);
      this.field4685[4] = var7 - var5 - var5 + var7;
      this.field4685[5] = var2 + var9 - var6 - var11;
      this.field4685[6] = var10 + var3 + var10 + var3;
      this.field4685[8] = var4 + var8 + var8 + var4;
      this.field4685[9] = var10 - var3 - var3 + var10;
      this.field4685[10] = var11 + var2 - var9 - var6;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lqu;I)V",
      garbageValue = "968373442"
   )
   void method8106(class439 var1) {
      this.field4685[0] = var1.field4695;
      this.field4685[1] = var1.field4688;
      this.field4685[2] = var1.field4687;
      this.field4685[3] = 0.0F;
      this.field4685[4] = var1.field4699;
      this.field4685[5] = var1.field4691;
      this.field4685[6] = var1.field4692;
      this.field4685[7] = 0.0F;
      this.field4685[8] = var1.field4693;
      this.field4685[9] = var1.field4694;
      this.field4685[10] = var1.field4689;
      this.field4685[11] = 0.0F;
      this.field4685[12] = var1.field4696;
      this.field4685[13] = var1.field4690;
      this.field4685[14] = var1.field4698;
      this.field4685[15] = 1.0F;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)F",
      garbageValue = "122"
   )
   float method8117() {
      return this.field4685[13] * this.field4685[8] * this.field4685[7] * this.field4685[2] + this.field4685[15] * this.field4685[9] * this.field4685[4] * this.field4685[2] + this.field4685[11] * this.field4685[6] * this.field4685[0] * this.field4685[13] + (this.field4685[10] * this.field4685[5] * this.field4685[0] * this.field4685[15] - this.field4685[14] * this.field4685[0] * this.field4685[5] * this.field4685[11] - this.field4685[0] * this.field4685[6] * this.field4685[9] * this.field4685[15]) + this.field4685[9] * this.field4685[7] * this.field4685[0] * this.field4685[14] - this.field4685[10] * this.field4685[0] * this.field4685[7] * this.field4685[13] - this.field4685[15] * this.field4685[10] * this.field4685[4] * this.field4685[1] + this.field4685[14] * this.field4685[4] * this.field4685[1] * this.field4685[11] + this.field4685[15] * this.field4685[8] * this.field4685[6] * this.field4685[1] - this.field4685[1] * this.field4685[6] * this.field4685[11] * this.field4685[12] - this.field4685[14] * this.field4685[1] * this.field4685[7] * this.field4685[8] + this.field4685[10] * this.field4685[1] * this.field4685[7] * this.field4685[12] - this.field4685[11] * this.field4685[4] * this.field4685[2] * this.field4685[13] - this.field4685[15] * this.field4685[5] * this.field4685[2] * this.field4685[8] + this.field4685[5] * this.field4685[2] * this.field4685[11] * this.field4685[12] - this.field4685[12] * this.field4685[9] * this.field4685[7] * this.field4685[2] - this.field4685[14] * this.field4685[3] * this.field4685[4] * this.field4685[9] + this.field4685[13] * this.field4685[4] * this.field4685[3] * this.field4685[10] + this.field4685[14] * this.field4685[5] * this.field4685[3] * this.field4685[8] - this.field4685[10] * this.field4685[5] * this.field4685[3] * this.field4685[12] - this.field4685[6] * this.field4685[3] * this.field4685[8] * this.field4685[13] + this.field4685[12] * this.field4685[3] * this.field4685[6] * this.field4685[9];
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1611052304"
   )
   public void method8139() {
      float var1 = 1.0F / this.method8117();
      float var2 = (this.field4685[13] * this.field4685[6] * this.field4685[11] + (this.field4685[10] * this.field4685[5] * this.field4685[15] - this.field4685[5] * this.field4685[11] * this.field4685[14] - this.field4685[15] * this.field4685[9] * this.field4685[6]) + this.field4685[14] * this.field4685[7] * this.field4685[9] - this.field4685[13] * this.field4685[7] * this.field4685[10]) * var1;
      float var3 = var1 * (this.field4685[3] * this.field4685[10] * this.field4685[13] + (this.field4685[9] * this.field4685[2] * this.field4685[15] + this.field4685[11] * this.field4685[1] * this.field4685[14] + this.field4685[15] * -this.field4685[1] * this.field4685[10] - this.field4685[2] * this.field4685[11] * this.field4685[13] - this.field4685[14] * this.field4685[3] * this.field4685[9]));
      float var4 = (this.field4685[1] * this.field4685[6] * this.field4685[15] - this.field4685[14] * this.field4685[1] * this.field4685[7] - this.field4685[2] * this.field4685[5] * this.field4685[15] + this.field4685[2] * this.field4685[7] * this.field4685[13] + this.field4685[14] * this.field4685[5] * this.field4685[3] - this.field4685[13] * this.field4685[6] * this.field4685[3]) * var1;
      float var5 = (this.field4685[6] * this.field4685[3] * this.field4685[9] + (this.field4685[11] * this.field4685[5] * this.field4685[2] + this.field4685[10] * this.field4685[1] * this.field4685[7] + this.field4685[6] * -this.field4685[1] * this.field4685[11] - this.field4685[9] * this.field4685[7] * this.field4685[2] - this.field4685[3] * this.field4685[5] * this.field4685[10])) * var1;
      float var6 = (this.field4685[15] * this.field4685[8] * this.field4685[6] + -this.field4685[4] * this.field4685[10] * this.field4685[15] + this.field4685[11] * this.field4685[4] * this.field4685[14] - this.field4685[12] * this.field4685[11] * this.field4685[6] - this.field4685[7] * this.field4685[8] * this.field4685[14] + this.field4685[12] * this.field4685[10] * this.field4685[7]) * var1;
      float var7 = (this.field4685[2] * this.field4685[11] * this.field4685[12] + (this.field4685[10] * this.field4685[0] * this.field4685[15] - this.field4685[14] * this.field4685[0] * this.field4685[11] - this.field4685[8] * this.field4685[2] * this.field4685[15]) + this.field4685[3] * this.field4685[8] * this.field4685[14] - this.field4685[3] * this.field4685[10] * this.field4685[12]) * var1;
      float var8 = var1 * (this.field4685[12] * this.field4685[3] * this.field4685[6] + (this.field4685[15] * this.field4685[4] * this.field4685[2] + this.field4685[15] * this.field4685[6] * -this.field4685[0] + this.field4685[14] * this.field4685[0] * this.field4685[7] - this.field4685[2] * this.field4685[7] * this.field4685[12] - this.field4685[14] * this.field4685[3] * this.field4685[4]));
      float var9 = (this.field4685[3] * this.field4685[4] * this.field4685[10] + this.field4685[8] * this.field4685[2] * this.field4685[7] + (this.field4685[11] * this.field4685[0] * this.field4685[6] - this.field4685[10] * this.field4685[0] * this.field4685[7] - this.field4685[11] * this.field4685[2] * this.field4685[4]) - this.field4685[3] * this.field4685[6] * this.field4685[8]) * var1;
      float var10 = var1 * (this.field4685[7] * this.field4685[8] * this.field4685[13] + this.field4685[15] * this.field4685[4] * this.field4685[9] - this.field4685[13] * this.field4685[4] * this.field4685[11] - this.field4685[5] * this.field4685[8] * this.field4685[15] + this.field4685[12] * this.field4685[11] * this.field4685[5] - this.field4685[7] * this.field4685[9] * this.field4685[12]);
      float var11 = var1 * (this.field4685[9] * this.field4685[3] * this.field4685[12] + (this.field4685[15] * this.field4685[8] * this.field4685[1] + this.field4685[15] * this.field4685[9] * -this.field4685[0] + this.field4685[11] * this.field4685[0] * this.field4685[13] - this.field4685[1] * this.field4685[11] * this.field4685[12] - this.field4685[13] * this.field4685[3] * this.field4685[8]));
      float var12 = var1 * (this.field4685[13] * this.field4685[4] * this.field4685[3] + this.field4685[12] * this.field4685[7] * this.field4685[1] + (this.field4685[5] * this.field4685[0] * this.field4685[15] - this.field4685[0] * this.field4685[7] * this.field4685[13] - this.field4685[1] * this.field4685[4] * this.field4685[15]) - this.field4685[3] * this.field4685[5] * this.field4685[12]);
      float var13 = (this.field4685[9] * this.field4685[7] * this.field4685[0] + this.field4685[5] * -this.field4685[0] * this.field4685[11] + this.field4685[4] * this.field4685[1] * this.field4685[11] - this.field4685[8] * this.field4685[1] * this.field4685[7] - this.field4685[4] * this.field4685[3] * this.field4685[9] + this.field4685[3] * this.field4685[5] * this.field4685[8]) * var1;
      float var14 = (this.field4685[6] * this.field4685[9] * this.field4685[12] + (this.field4685[8] * this.field4685[5] * this.field4685[14] + this.field4685[10] * this.field4685[4] * this.field4685[13] + -this.field4685[4] * this.field4685[9] * this.field4685[14] - this.field4685[10] * this.field4685[5] * this.field4685[12] - this.field4685[13] * this.field4685[8] * this.field4685[6])) * var1;
      float var15 = (this.field4685[1] * this.field4685[10] * this.field4685[12] + (this.field4685[0] * this.field4685[9] * this.field4685[14] - this.field4685[0] * this.field4685[10] * this.field4685[13] - this.field4685[1] * this.field4685[8] * this.field4685[14]) + this.field4685[8] * this.field4685[2] * this.field4685[13] - this.field4685[12] * this.field4685[2] * this.field4685[9]) * var1;
      float var16 = (this.field4685[5] * -this.field4685[0] * this.field4685[14] + this.field4685[13] * this.field4685[6] * this.field4685[0] + this.field4685[4] * this.field4685[1] * this.field4685[14] - this.field4685[12] * this.field4685[1] * this.field4685[6] - this.field4685[13] * this.field4685[4] * this.field4685[2] + this.field4685[2] * this.field4685[5] * this.field4685[12]) * var1;
      float var17 = (this.field4685[4] * this.field4685[2] * this.field4685[9] + this.field4685[1] * this.field4685[6] * this.field4685[8] + (this.field4685[10] * this.field4685[0] * this.field4685[5] - this.field4685[9] * this.field4685[6] * this.field4685[0] - this.field4685[4] * this.field4685[1] * this.field4685[10]) - this.field4685[2] * this.field4685[5] * this.field4685[8]) * var1;
      this.field4685[0] = var2;
      this.field4685[1] = var3;
      this.field4685[2] = var4;
      this.field4685[3] = var5;
      this.field4685[4] = var6;
      this.field4685[5] = var7;
      this.field4685[6] = var8;
      this.field4685[7] = var9;
      this.field4685[8] = var10;
      this.field4685[9] = var11;
      this.field4685[10] = var12;
      this.field4685[11] = var13;
      this.field4685[12] = var14;
      this.field4685[13] = var15;
      this.field4685[14] = var16;
      this.field4685[15] = var17;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "1623312614"
   )
   public float[] method8116() {
      float[] var1 = new float[3];
      class436 var2 = new class436(this.field4685[0], this.field4685[1], this.field4685[2]);
      class436 var3 = new class436(this.field4685[4], this.field4685[5], this.field4685[6]);
      class436 var4 = new class436(this.field4685[8], this.field4685[9], this.field4685[10]);
      var1[0] = var2.method8058();
      var1[1] = var3.method8058();
      var1[2] = var4.method8058();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method8097();
      this.method8145();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4685[var3 + var2 * 4];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class438)) {
         return false;
      } else {
         class438 var2 = (class438)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field4685[var3] != this.field4685[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.field4685);
      return var2;
   }
}
