import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class480 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2023135889
   )
   int field4986;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 459487259
   )
   int field4987;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1019277499
   )
   int field4997;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1525421915
   )
   int field4989;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -195568033
   )
   int field4985;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 856154769
   )
   int field4996;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1833236829
   )
   int field4992 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1195309361
   )
   int field4993 = 0;
   @ObfuscatedName("r")
   boolean field4990;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -630143305
   )
   int field4995;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -534048577
   )
   int field4988;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1995385909
   )
   int field4994;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 20632691
   )
   int field4998;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIIZI)V",
      garbageValue = "204682544"
   )
   public void method8980(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.field4986 = var1;
      this.field4987 = var2;
      this.field4997 = var3;
      this.field4989 = var4;
      this.field4985 = var5;
      this.field4996 = var6;
      this.field4992 = var9;
      this.field4993 = var10;
      this.field4990 = var11;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "319504055"
   )
   public void method8981(int var1, int var2, int var3, int var4) {
      this.field4995 = var1;
      this.field4988 = var2;
      this.field4994 = var3;
      this.field4998 = var4;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lnz;Lnl;I)V",
      garbageValue = "2063892125"
   )
   public void method8979(class365 var1, Font var2) {
      if (var2 != null) {
         int var3 = var2.ascent;
         int var4 = Math.min(this.field4989, (int)((float)var3 * 0.9F));
         int var5 = this.field4986 - this.field4985;
         int var6 = var3 + (this.field4987 - this.field4996);
         Rasterizer2D.Rasterizer2D_setClip(this.field4986, this.field4987, this.field4986 + this.field4997, this.field4989 + this.field4987);
         int var7 = this.field4993;
         int var8 = this.field4992;
         if (var7 > var8) {
            int var9 = var7;
            var7 = var8;
            var8 = var9;
         }

         class369 var19 = var1.method6891(0, var7);
         class369 var10 = var1.method6891(var7, var8);
         class369 var11 = var1.method6891(var8, var1.method6943());
         class369 var12 = var1.method6891(0, this.field4992);
         int var14;
         int var16;
         if (!var10.method7097()) {
            int var13 = var2.maxAscent + var2.maxDescent;

            for(var14 = 0; var14 < var10.method7098(); ++var14) {
               class367 var21 = var10.method7114(var14);
               var16 = var5 + var21.field4341;
               int var17 = var2.charWidth(var21.field4347);
               int var18 = var6 + var21.field4343 - var3;
               Rasterizer2D.Rasterizer2D_fillRectangle(var16, var18, var17, var13, this.field4998);
            }
         }

         if (!var19.method7097()) {
            var2.method7007(var19, var5, var6, this.field4995, this.field4988, -1);
         }

         if (!var10.method7097()) {
            var2.method7007(var10, var5, var6, this.field4994, this.field4988, -1);
         }

         if (!var11.method7097()) {
            var2.method7007(var11, var5, var6, this.field4995, this.field4988, -1);
         }

         if (this.field4990) {
            class437 var20 = var12.method7101();
            var14 = var5 + (Integer)var20.field4764;
            int var15 = var6 + (Integer)var20.field4765;
            var16 = var15 - var4;
            Rasterizer2D.Rasterizer2D_drawLine(var14, var15, var14, var16, this.field4995);
            if (this.field4988 != -1) {
               Rasterizer2D.Rasterizer2D_drawLine(var14 + 1, var15 + 1, var14 + 1, var16 + 1, this.field4988);
            }
         }

      }
   }
}
