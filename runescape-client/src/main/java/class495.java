import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class495 {
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 1361227103
   )
   static int field5036;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 2069391415
   )
   int field5023;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1674937461
   )
   int field5024;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -544898867
   )
   int field5025;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 60223199
   )
   int field5026;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1880572091
   )
   int field5035;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1400577347
   )
   int field5029;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 159467181
   )
   int field5027 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -893539005
   )
   int field5030 = 0;
   @ObfuscatedName("ar")
   boolean field5031;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1512490637
   )
   int field5022;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 237262701
   )
   int field5028;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1953491027
   )
   int field5034;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1021787325
   )
   int field5032;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIZI)V",
      garbageValue = "-1262493748"
   )
   public void method9209(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field5023 = var1;
      this.field5024 = var2;
      this.field5025 = var3;
      this.field5026 = var4;
      this.field5035 = var5;
      this.field5029 = var6;
      this.field5027 = var7;
      this.field5030 = var8;
      this.field5031 = var9;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1697791116"
   )
   public void method9203(int var1, int var2, int var3, int var4) {
      this.field5022 = var1;
      this.field5028 = var2;
      this.field5034 = var3;
      this.field5032 = var4;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Low;Loe;I)V",
      garbageValue = "1245058623"
   )
   public void method9204(class375 var1, Font var2) {
      if (var2 != null) {
         int var3 = var2.ascent;
         int var4 = Math.min(this.field5026, (int)((float)var3 * 0.9F));
         int var5 = var1.method7069(this.field5025);
         int var6 = var1.method7033(this.field5026);
         int var7 = var5 + (this.field5023 - this.field5035);
         int var8 = var3 + var6 + (this.field5024 - this.field5029);
         Rasterizer2D.Rasterizer2D_setClip(this.field5023, this.field5024, this.field5025 + this.field5023, this.field5026 + this.field5024);
         int var9 = this.field5030;
         int var10 = this.field5027;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         class379 var21 = var1.method7007(0, var9);
         class379 var12 = var1.method7007(var9, var10);
         class379 var13 = var1.method7007(var10, var1.method6998());
         class379 var14 = var1.method7007(0, this.field5027);
         int var16;
         int var18;
         if (!var12.method7246()) {
            int var15 = var2.maxDescent + var2.maxAscent;

            for(var16 = 0; var16 < var12.method7247(); ++var16) {
               class377 var23 = var12.method7251(var16);
               var18 = var7 + var23.field4379;
               int var19 = var2.charWidth(var23.field4380);
               int var20 = var8 + var23.field4378 - var3;
               Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5032);
            }
         }

         if (!var21.method7246()) {
            var2.method7155(var21, var7, var8, this.field5022, this.field5028, -1);
         }

         if (!var12.method7246()) {
            var2.method7155(var12, var7, var8, this.field5034, this.field5028, -1);
         }

         if (!var13.method7246()) {
            var2.method7155(var13, var7, var8, this.field5022, this.field5028, -1);
         }

         if (this.field5031) {
            class451 var22 = var14.method7268();
            var16 = var7 + (Integer)var22.field4798;
            int var17 = var8 + (Integer)var22.field4799;
            var18 = var17 - var4;
            Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5022);
            if (this.field5028 != -1) {
               Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5028);
            }
         }

      }
   }
}
