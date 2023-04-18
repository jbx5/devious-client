import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class425 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lqj;"
   )
   public static class425[] field4665 = new class425[0];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2095080743
   )
   static int field4669;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -910698341
   )
   public static int field4667;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   public static final class425 field4664;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = 583188571
   )
   static int field4671;
   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "[Ltq;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;
   @ObfuscatedName("au")
   public float[] field4670 = new float[16];

   static {
      WorldMapSection1.method5509(100);
      field4664 = new class425();
   }

   public class425() {
      this.method8177();
   }

   @ObfuscatedSignature(
      descriptor = "(Lqj;)V"
   )
   public class425(class425 var1) {
      this.method8179(var1);
   }

   @ObfuscatedSignature(
      descriptor = "(Lsg;Z)V"
   )
   public class425(Buffer var1, boolean var2) {
      this.method8174(var1, var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1198141071"
   )
   public void method8176() {
      synchronized(field4665) {
         if (field4667 < field4669 - 1) {
            field4665[++field4667 - 1] = this;
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;ZB)V",
      garbageValue = "39"
   )
   void method8174(Buffer var1, boolean var2) {
      if (var2) {
         class426 var4 = new class426();
         var4.method8246(MusicPatchNode.method5985(var1.readShort()));
         var4.method8247(MusicPatchNode.method5985(var1.readShort()));
         var4.method8248(MusicPatchNode.method5985(var1.readShort()));
         var4.method8245((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method8185(var4);
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field4670[var3] = var1.method9064();
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)[F",
      garbageValue = "18255"
   )
   float[] method8175() {
      float[] var1 = new float[3];
      if ((double)this.field4670[2] < 0.999 && (double)this.field4670[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.field4670[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.field4670[6] / var2, (double)this.field4670[10] / var2);
         var1[2] = (float)Math.atan2((double)this.field4670[1] / var2, (double)this.field4670[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.field4670[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.field4670[9]), (double)this.field4670[5]);
      }

      return var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "2011587647"
   )
   public float[] method8173() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.field4670[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.field4670[2];
         var6 = (double)this.field4670[10];
         double var8 = (double)this.field4670[4];
         double var10 = (double)this.field4670[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.field4670[1];
         var6 = (double)this.field4670[0];
         if (this.field4670[6] < 0.0F) {
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
      descriptor = "(B)V",
      garbageValue = "-10"
   )
   public void method8177() {
      this.field4670[0] = 1.0F;
      this.field4670[1] = 0.0F;
      this.field4670[2] = 0.0F;
      this.field4670[3] = 0.0F;
      this.field4670[4] = 0.0F;
      this.field4670[5] = 1.0F;
      this.field4670[6] = 0.0F;
      this.field4670[7] = 0.0F;
      this.field4670[8] = 0.0F;
      this.field4670[9] = 0.0F;
      this.field4670[10] = 1.0F;
      this.field4670[11] = 0.0F;
      this.field4670[12] = 0.0F;
      this.field4670[13] = 0.0F;
      this.field4670[14] = 0.0F;
      this.field4670[15] = 1.0F;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1283851159"
   )
   public void method8178() {
      this.field4670[0] = 0.0F;
      this.field4670[1] = 0.0F;
      this.field4670[2] = 0.0F;
      this.field4670[3] = 0.0F;
      this.field4670[4] = 0.0F;
      this.field4670[5] = 0.0F;
      this.field4670[6] = 0.0F;
      this.field4670[7] = 0.0F;
      this.field4670[8] = 0.0F;
      this.field4670[9] = 0.0F;
      this.field4670[10] = 0.0F;
      this.field4670[11] = 0.0F;
      this.field4670[12] = 0.0F;
      this.field4670[13] = 0.0F;
      this.field4670[14] = 0.0F;
      this.field4670[15] = 0.0F;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lqj;I)V",
      garbageValue = "1919850341"
   )
   public void method8179(class425 var1) {
      System.arraycopy(var1.field4670, 0, this.field4670, 0, 16);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-2059885087"
   )
   public void method8180(float var1) {
      this.method8223(var1, var1, var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "-814200416"
   )
   public void method8223(float var1, float var2, float var3) {
      this.method8177();
      this.field4670[0] = var1;
      this.field4670[5] = var2;
      this.field4670[10] = var3;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lqj;I)V",
      garbageValue = "-1643954745"
   )
   public void method8182(class425 var1) {
      for(int var2 = 0; var2 < this.field4670.length; ++var2) {
         float[] var10000 = this.field4670;
         var10000[var2] += var1.field4670[var2];
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lqj;I)V",
      garbageValue = "2018256268"
   )
   public void method8183(class425 var1) {
      float var2 = this.field4670[3] * var1.field4670[12] + this.field4670[2] * var1.field4670[8] + var1.field4670[4] * this.field4670[1] + var1.field4670[0] * this.field4670[0];
      float var3 = var1.field4670[13] * this.field4670[3] + var1.field4670[1] * this.field4670[0] + this.field4670[1] * var1.field4670[5] + var1.field4670[9] * this.field4670[2];
      float var4 = this.field4670[0] * var1.field4670[2] + var1.field4670[6] * this.field4670[1] + this.field4670[2] * var1.field4670[10] + var1.field4670[14] * this.field4670[3];
      float var5 = this.field4670[2] * var1.field4670[11] + this.field4670[1] * var1.field4670[7] + this.field4670[0] * var1.field4670[3] + this.field4670[3] * var1.field4670[15];
      float var6 = this.field4670[5] * var1.field4670[4] + this.field4670[4] * var1.field4670[0] + var1.field4670[8] * this.field4670[6] + this.field4670[7] * var1.field4670[12];
      float var7 = var1.field4670[13] * this.field4670[7] + this.field4670[6] * var1.field4670[9] + this.field4670[5] * var1.field4670[5] + var1.field4670[1] * this.field4670[4];
      float var8 = var1.field4670[2] * this.field4670[4] + this.field4670[5] * var1.field4670[6] + var1.field4670[10] * this.field4670[6] + var1.field4670[14] * this.field4670[7];
      float var9 = this.field4670[6] * var1.field4670[11] + var1.field4670[3] * this.field4670[4] + var1.field4670[7] * this.field4670[5] + this.field4670[7] * var1.field4670[15];
      float var10 = var1.field4670[0] * this.field4670[8] + this.field4670[9] * var1.field4670[4] + var1.field4670[8] * this.field4670[10] + this.field4670[11] * var1.field4670[12];
      float var11 = var1.field4670[13] * this.field4670[11] + this.field4670[9] * var1.field4670[5] + var1.field4670[1] * this.field4670[8] + this.field4670[10] * var1.field4670[9];
      float var12 = this.field4670[11] * var1.field4670[14] + var1.field4670[6] * this.field4670[9] + var1.field4670[2] * this.field4670[8] + this.field4670[10] * var1.field4670[10];
      float var13 = var1.field4670[3] * this.field4670[8] + var1.field4670[7] * this.field4670[9] + this.field4670[10] * var1.field4670[11] + this.field4670[11] * var1.field4670[15];
      float var14 = this.field4670[14] * var1.field4670[8] + var1.field4670[4] * this.field4670[13] + this.field4670[12] * var1.field4670[0] + this.field4670[15] * var1.field4670[12];
      float var15 = this.field4670[12] * var1.field4670[1] + this.field4670[13] * var1.field4670[5] + this.field4670[14] * var1.field4670[9] + this.field4670[15] * var1.field4670[13];
      float var16 = var1.field4670[14] * this.field4670[15] + var1.field4670[2] * this.field4670[12] + this.field4670[13] * var1.field4670[6] + var1.field4670[10] * this.field4670[14];
      float var17 = var1.field4670[7] * this.field4670[13] + this.field4670[12] * var1.field4670[3] + this.field4670[14] * var1.field4670[11] + var1.field4670[15] * this.field4670[15];
      this.field4670[0] = var2;
      this.field4670[1] = var3;
      this.field4670[2] = var4;
      this.field4670[3] = var5;
      this.field4670[4] = var6;
      this.field4670[5] = var7;
      this.field4670[6] = var8;
      this.field4670[7] = var9;
      this.field4670[8] = var10;
      this.field4670[9] = var11;
      this.field4670[10] = var12;
      this.field4670[11] = var13;
      this.field4670[12] = var14;
      this.field4670[13] = var15;
      this.field4670[14] = var16;
      this.field4670[15] = var17;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lqx;B)V",
      garbageValue = "-48"
   )
   public void method8184(class424 var1) {
      float var2 = var1.field4663 * var1.field4663;
      float var3 = var1.field4663 * var1.field4660;
      float var4 = var1.field4661 * var1.field4663;
      float var5 = var1.field4663 * var1.field4662;
      float var6 = var1.field4660 * var1.field4660;
      float var7 = var1.field4660 * var1.field4661;
      float var8 = var1.field4662 * var1.field4660;
      float var9 = var1.field4661 * var1.field4661;
      float var10 = var1.field4662 * var1.field4661;
      float var11 = var1.field4662 * var1.field4662;
      this.field4670[0] = var6 + var2 - var11 - var9;
      this.field4670[1] = var5 + var7 + var5 + var7;
      this.field4670[2] = var8 + (var8 - var4 - var4);
      this.field4670[4] = var7 + (var7 - var5 - var5);
      this.field4670[5] = var9 + var2 - var6 - var11;
      this.field4670[6] = var10 + var3 + var10 + var3;
      this.field4670[8] = var4 + var8 + var4 + var8;
      this.field4670[9] = var10 - var3 - var3 + var10;
      this.field4670[10] = var2 + var11 - var9 - var6;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lqc;B)V",
      garbageValue = "87"
   )
   void method8185(class426 var1) {
      this.field4670[0] = var1.field4686;
      this.field4670[1] = var1.field4675;
      this.field4670[2] = var1.field4676;
      this.field4670[3] = 0.0F;
      this.field4670[4] = var1.field4677;
      this.field4670[5] = var1.field4678;
      this.field4670[6] = var1.field4679;
      this.field4670[7] = 0.0F;
      this.field4670[8] = var1.field4680;
      this.field4670[9] = var1.field4681;
      this.field4670[10] = var1.field4682;
      this.field4670[11] = 0.0F;
      this.field4670[12] = var1.field4683;
      this.field4670[13] = var1.field4684;
      this.field4670[14] = var1.field4685;
      this.field4670[15] = 1.0F;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "-671681757"
   )
   float method8186() {
      return this.field4670[8] * this.field4670[7] * this.field4670[2] * this.field4670[13] + this.field4670[2] * this.field4670[5] * this.field4670[11] * this.field4670[12] + (this.field4670[4] * this.field4670[2] * this.field4670[9] * this.field4670[15] + this.field4670[12] * this.field4670[1] * this.field4670[7] * this.field4670[10] + (this.field4670[8] * this.field4670[6] * this.field4670[1] * this.field4670[15] + this.field4670[14] * this.field4670[1] * this.field4670[4] * this.field4670[11] + (this.field4670[0] * this.field4670[7] * this.field4670[9] * this.field4670[14] + this.field4670[0] * this.field4670[6] * this.field4670[11] * this.field4670[13] + (this.field4670[5] * this.field4670[0] * this.field4670[10] * this.field4670[15] - this.field4670[14] * this.field4670[5] * this.field4670[0] * this.field4670[11] - this.field4670[15] * this.field4670[0] * this.field4670[6] * this.field4670[9]) - this.field4670[10] * this.field4670[0] * this.field4670[7] * this.field4670[13] - this.field4670[1] * this.field4670[4] * this.field4670[10] * this.field4670[15]) - this.field4670[12] * this.field4670[11] * this.field4670[1] * this.field4670[6] - this.field4670[14] * this.field4670[1] * this.field4670[7] * this.field4670[8]) - this.field4670[2] * this.field4670[4] * this.field4670[11] * this.field4670[13] - this.field4670[15] * this.field4670[2] * this.field4670[5] * this.field4670[8]) - this.field4670[12] * this.field4670[9] * this.field4670[2] * this.field4670[7] - this.field4670[9] * this.field4670[3] * this.field4670[4] * this.field4670[14] + this.field4670[13] * this.field4670[10] * this.field4670[4] * this.field4670[3] + this.field4670[3] * this.field4670[5] * this.field4670[8] * this.field4670[14] - this.field4670[12] * this.field4670[5] * this.field4670[3] * this.field4670[10] - this.field4670[8] * this.field4670[6] * this.field4670[3] * this.field4670[13] + this.field4670[12] * this.field4670[3] * this.field4670[6] * this.field4670[9];
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-49766360"
   )
   public void method8197() {
      float var1 = 1.0F / this.method8186();
      float var2 = var1 * (this.field4670[7] * this.field4670[9] * this.field4670[14] + this.field4670[11] * this.field4670[6] * this.field4670[13] + (this.field4670[5] * this.field4670[10] * this.field4670[15] - this.field4670[14] * this.field4670[5] * this.field4670[11] - this.field4670[6] * this.field4670[9] * this.field4670[15]) - this.field4670[13] * this.field4670[7] * this.field4670[10]);
      float var3 = (-this.field4670[1] * this.field4670[10] * this.field4670[15] + this.field4670[1] * this.field4670[11] * this.field4670[14] + this.field4670[15] * this.field4670[2] * this.field4670[9] - this.field4670[11] * this.field4670[2] * this.field4670[13] - this.field4670[14] * this.field4670[3] * this.field4670[9] + this.field4670[3] * this.field4670[10] * this.field4670[13]) * var1;
      float var4 = var1 * (this.field4670[7] * this.field4670[2] * this.field4670[13] + (this.field4670[15] * this.field4670[6] * this.field4670[1] - this.field4670[1] * this.field4670[7] * this.field4670[14] - this.field4670[15] * this.field4670[5] * this.field4670[2]) + this.field4670[14] * this.field4670[3] * this.field4670[5] - this.field4670[6] * this.field4670[3] * this.field4670[13]);
      float var5 = var1 * (this.field4670[9] * this.field4670[3] * this.field4670[6] + (this.field4670[5] * this.field4670[2] * this.field4670[11] + this.field4670[1] * this.field4670[7] * this.field4670[10] + this.field4670[11] * this.field4670[6] * -this.field4670[1] - this.field4670[9] * this.field4670[2] * this.field4670[7] - this.field4670[10] * this.field4670[3] * this.field4670[5]));
      float var6 = var1 * (this.field4670[12] * this.field4670[10] * this.field4670[7] + (this.field4670[15] * this.field4670[8] * this.field4670[6] + this.field4670[11] * this.field4670[4] * this.field4670[14] + this.field4670[15] * -this.field4670[4] * this.field4670[10] - this.field4670[6] * this.field4670[11] * this.field4670[12] - this.field4670[7] * this.field4670[8] * this.field4670[14]));
      float var7 = (this.field4670[12] * this.field4670[2] * this.field4670[11] + (this.field4670[15] * this.field4670[10] * this.field4670[0] - this.field4670[14] * this.field4670[11] * this.field4670[0] - this.field4670[8] * this.field4670[2] * this.field4670[15]) + this.field4670[14] * this.field4670[3] * this.field4670[8] - this.field4670[12] * this.field4670[3] * this.field4670[10]) * var1;
      float var8 = var1 * (this.field4670[12] * this.field4670[6] * this.field4670[3] + (this.field4670[15] * -this.field4670[0] * this.field4670[6] + this.field4670[14] * this.field4670[7] * this.field4670[0] + this.field4670[2] * this.field4670[4] * this.field4670[15] - this.field4670[2] * this.field4670[7] * this.field4670[12] - this.field4670[14] * this.field4670[4] * this.field4670[3]));
      float var9 = var1 * (this.field4670[4] * this.field4670[3] * this.field4670[10] + this.field4670[8] * this.field4670[7] * this.field4670[2] + (this.field4670[0] * this.field4670[6] * this.field4670[11] - this.field4670[10] * this.field4670[7] * this.field4670[0] - this.field4670[11] * this.field4670[2] * this.field4670[4]) - this.field4670[6] * this.field4670[3] * this.field4670[8]);
      float var10 = var1 * (this.field4670[13] * this.field4670[7] * this.field4670[8] + this.field4670[5] * this.field4670[11] * this.field4670[12] + (this.field4670[15] * this.field4670[9] * this.field4670[4] - this.field4670[4] * this.field4670[11] * this.field4670[13] - this.field4670[8] * this.field4670[5] * this.field4670[15]) - this.field4670[12] * this.field4670[7] * this.field4670[9]);
      float var11 = var1 * (this.field4670[9] * -this.field4670[0] * this.field4670[15] + this.field4670[0] * this.field4670[11] * this.field4670[13] + this.field4670[1] * this.field4670[8] * this.field4670[15] - this.field4670[1] * this.field4670[11] * this.field4670[12] - this.field4670[8] * this.field4670[3] * this.field4670[13] + this.field4670[12] * this.field4670[9] * this.field4670[3]);
      float var12 = var1 * (this.field4670[5] * this.field4670[0] * this.field4670[15] - this.field4670[13] * this.field4670[0] * this.field4670[7] - this.field4670[1] * this.field4670[4] * this.field4670[15] + this.field4670[12] * this.field4670[7] * this.field4670[1] + this.field4670[3] * this.field4670[4] * this.field4670[13] - this.field4670[3] * this.field4670[5] * this.field4670[12]);
      float var13 = (this.field4670[4] * this.field4670[1] * this.field4670[11] + this.field4670[9] * this.field4670[0] * this.field4670[7] + -this.field4670[0] * this.field4670[5] * this.field4670[11] - this.field4670[1] * this.field4670[7] * this.field4670[8] - this.field4670[3] * this.field4670[4] * this.field4670[9] + this.field4670[3] * this.field4670[5] * this.field4670[8]) * var1;
      float var14 = (this.field4670[12] * this.field4670[9] * this.field4670[6] + (this.field4670[9] * -this.field4670[4] * this.field4670[14] + this.field4670[4] * this.field4670[10] * this.field4670[13] + this.field4670[8] * this.field4670[5] * this.field4670[14] - this.field4670[12] * this.field4670[10] * this.field4670[5] - this.field4670[8] * this.field4670[6] * this.field4670[13])) * var1;
      float var15 = (this.field4670[12] * this.field4670[1] * this.field4670[10] + (this.field4670[9] * this.field4670[0] * this.field4670[14] - this.field4670[10] * this.field4670[0] * this.field4670[13] - this.field4670[14] * this.field4670[1] * this.field4670[8]) + this.field4670[8] * this.field4670[2] * this.field4670[13] - this.field4670[2] * this.field4670[9] * this.field4670[12]) * var1;
      float var16 = var1 * (this.field4670[14] * this.field4670[1] * this.field4670[4] + this.field4670[5] * -this.field4670[0] * this.field4670[14] + this.field4670[6] * this.field4670[0] * this.field4670[13] - this.field4670[12] * this.field4670[1] * this.field4670[6] - this.field4670[4] * this.field4670[2] * this.field4670[13] + this.field4670[5] * this.field4670[2] * this.field4670[12]);
      float var17 = var1 * (this.field4670[10] * this.field4670[5] * this.field4670[0] - this.field4670[9] * this.field4670[6] * this.field4670[0] - this.field4670[10] * this.field4670[1] * this.field4670[4] + this.field4670[8] * this.field4670[1] * this.field4670[6] + this.field4670[4] * this.field4670[2] * this.field4670[9] - this.field4670[8] * this.field4670[5] * this.field4670[2]);
      this.field4670[0] = var2;
      this.field4670[1] = var3;
      this.field4670[2] = var4;
      this.field4670[3] = var5;
      this.field4670[4] = var6;
      this.field4670[5] = var7;
      this.field4670[6] = var8;
      this.field4670[7] = var9;
      this.field4670[8] = var10;
      this.field4670[9] = var11;
      this.field4670[10] = var12;
      this.field4670[11] = var13;
      this.field4670[12] = var14;
      this.field4670[13] = var15;
      this.field4670[14] = var16;
      this.field4670[15] = var17;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)[F",
      garbageValue = "-1193193638"
   )
   public float[] method8224() {
      float[] var1 = new float[3];
      class423 var2 = new class423(this.field4670[0], this.field4670[1], this.field4670[2]);
      class423 var3 = new class423(this.field4670[4], this.field4670[5], this.field4670[6]);
      class423 var4 = new class423(this.field4670[8], this.field4670[9], this.field4670[10]);
      var1[0] = var2.method8131();
      var1[1] = var3.method8131();
      var1[2] = var4.method8131();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method8173();
      this.method8175();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4670[var3 + var2 * 4];
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
      if (!(var1 instanceof class425)) {
         return false;
      } else {
         class425 var2 = (class425)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.field4670[var3] != this.field4670[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.field4670);
      return var2;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Lfl;",
      garbageValue = "1631895479"
   )
   static class134[] method8243() {
      return new class134[]{class134.field1603, class134.field1610, class134.field1602, class134.field1605, class134.field1599, class134.field1604, class134.field1600, class134.field1606, class134.field1607};
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1975852814"
   )
   static final int method8242(int var0) {
      return Math.abs(var0 - class125.cameraYaw) > 1024 ? (var0 < class125.cameraYaw ? 1 : -1) * 2048 + var0 : var0;
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "32"
   )
   static final void method8244() {
      boolean var0 = false;

      while(!var0) {
         var0 = true;

         for(int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
            if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
               String var2 = Client.menuTargets[var1];
               Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
               Client.menuTargets[var1 + 1] = var2;
               String var3 = Client.menuActions[var1];
               Client.menuActions[var1] = Client.menuActions[var1 + 1];
               Client.menuActions[var1 + 1] = var3;
               int var4 = Client.menuOpcodes[var1];
               Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
               Client.menuOpcodes[var1 + 1] = var4;
               var4 = Client.menuArguments1[var1];
               Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
               Client.menuArguments1[var1 + 1] = var4;
               var4 = Client.menuArguments2[var1];
               Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
               Client.menuArguments2[var1 + 1] = var4;
               var4 = Client.menuIdentifiers[var1];
               Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
               Client.menuIdentifiers[var1 + 1] = var4;
               var4 = Client.menuItemIds[var1];
               Client.menuItemIds[var1] = Client.menuItemIds[var1 + 1];
               Client.menuItemIds[var1 + 1] = var4;
               boolean var5 = Client.menuShiftClick[var1];
               Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
               Client.menuShiftClick[var1 + 1] = var5;
               var0 = false;
            }
         }
      }

   }
}
