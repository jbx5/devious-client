import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public class class484 {
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -544764579
   )
   int field5035;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 407056329
   )
   int field5043;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 718401383
   )
   int field5036;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1169119765
   )
   int field5037;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1800251423
   )
   int field5033;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2136683631
   )
   int field5040;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1280823113
   )
   int field5042 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1066251557
   )
   int field5039 = 0;
   @ObfuscatedName("b")
   boolean field5034;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -491304047
   )
   int field5038;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -888747591
   )
   int field5044;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1604343367
   )
   int field5045;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 587876815
   )
   int field5046;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIIZI)V",
      garbageValue = "1188082077"
   )
   public void method9152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.field5035 = var1;
      this.field5043 = var2;
      this.field5036 = var3;
      this.field5037 = var4;
      this.field5033 = var5;
      this.field5040 = var6;
      this.field5042 = var9;
      this.field5039 = var10;
      this.field5034 = var11;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-990498874"
   )
   public void method9144(int var1, int var2, int var3, int var4) {
      this.field5038 = var1;
      this.field5044 = var2;
      this.field5045 = var3;
      this.field5046 = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lnu;Lnv;B)V",
      garbageValue = "-5"
   )
   public void method9143(class368 var1, Font var2) {
      if (var2 != null) {
         int var3 = var2.ascent;
         int var4 = Math.min(this.field5037, (int)(0.9F * (float)var3));
         int var5 = this.field5035 - this.field5033;
         int var6 = var3 + (this.field5043 - this.field5040);
         Rasterizer2D.Rasterizer2D_setClip(this.field5035, this.field5043, this.field5036 + this.field5035, this.field5043 + this.field5037);
         int var7 = this.field5039;
         int var8 = this.field5042;
         if (var7 > var8) {
            int var9 = var7;
            var7 = var8;
            var8 = var9;
         }

         class372 var19 = var1.method7092(0, var7);
         class372 var10 = var1.method7092(var7, var8);
         class372 var11 = var1.method7092(var8, var1.method7041());
         class372 var12 = var1.method7092(0, this.field5042);
         int var14;
         int var16;
         if (!var10.method7251()) {
            int var13 = var2.maxDescent + var2.maxAscent;

            for(var14 = 0; var14 < var10.method7269(); ++var14) {
               class370 var21 = var10.method7256(var14);
               var16 = var5 + var21.field4398;
               int var17 = var2.charWidth(var21.field4395);
               int var18 = var6 + var21.field4397 - var3;
               Rasterizer2D.Rasterizer2D_fillRectangle(var16, var18, var17, var13, this.field5046);
            }
         }

         if (!var19.method7251()) {
            var2.method7166(var19, var5, var6, this.field5038, this.field5044, -1);
         }

         if (!var10.method7251()) {
            var2.method7166(var10, var5, var6, this.field5045, this.field5044, -1);
         }

         if (!var11.method7251()) {
            var2.method7166(var11, var5, var6, this.field5038, this.field5044, -1);
         }

         if (this.field5034) {
            class440 var20 = var12.method7255();
            var14 = var5 + (Integer)var20.field4811;
            int var15 = var6 + (Integer)var20.field4809;
            var16 = var15 - var4;
            Rasterizer2D.Rasterizer2D_drawLine(var14, var15, var14, var16, this.field5038);
            if (this.field5044 != -1) {
               Rasterizer2D.Rasterizer2D_drawLine(var14 + 1, var15 + 1, var14 + 1, var16 + 1, this.field5044);
            }
         }

      }
   }
}
