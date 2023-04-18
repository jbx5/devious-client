import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class426 {
   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   static Archive field4687;
   @ObfuscatedName("af")
   float field4686;
   @ObfuscatedName("an")
   float field4675;
   @ObfuscatedName("aw")
   float field4676;
   @ObfuscatedName("ac")
   float field4677;
   @ObfuscatedName("au")
   float field4678;
   @ObfuscatedName("ab")
   float field4679;
   @ObfuscatedName("aq")
   float field4680;
   @ObfuscatedName("al")
   float field4681;
   @ObfuscatedName("at")
   float field4682;
   @ObfuscatedName("aa")
   float field4683;
   @ObfuscatedName("ay")
   float field4684;
   @ObfuscatedName("ao")
   float field4685;

   static {
      new class426();
   }

   class426() {
      this.method8255();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-23475"
   )
   void method8255() {
      this.field4685 = 0.0F;
      this.field4684 = 0.0F;
      this.field4683 = 0.0F;
      this.field4681 = 0.0F;
      this.field4680 = 0.0F;
      this.field4679 = 0.0F;
      this.field4677 = 0.0F;
      this.field4676 = 0.0F;
      this.field4675 = 0.0F;
      this.field4682 = 1.0F;
      this.field4678 = 1.0F;
      this.field4686 = 1.0F;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-1749175533"
   )
   void method8246(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4675;
      float var5 = this.field4678;
      float var6 = this.field4681;
      float var7 = this.field4684;
      this.field4675 = var4 * var2 - this.field4676 * var3;
      this.field4676 = this.field4676 * var2 + var3 * var4;
      this.field4678 = var2 * var5 - var3 * this.field4679;
      this.field4679 = this.field4679 * var2 + var5 * var3;
      this.field4681 = var6 * var2 - var3 * this.field4682;
      this.field4682 = this.field4682 * var2 + var3 * var6;
      this.field4684 = var2 * var7 - this.field4685 * var3;
      this.field4685 = var3 * var7 + var2 * this.field4685;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "1665202061"
   )
   void method8247(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4686;
      float var5 = this.field4677;
      float var6 = this.field4680;
      float var7 = this.field4683;
      this.field4686 = var3 * this.field4676 + var2 * var4;
      this.field4676 = var2 * this.field4676 - var4 * var3;
      this.field4677 = var3 * this.field4679 + var5 * var2;
      this.field4679 = this.field4679 * var2 - var5 * var3;
      this.field4680 = var3 * this.field4682 + var2 * var6;
      this.field4682 = this.field4682 * var2 - var3 * var6;
      this.field4683 = var2 * var7 + var3 * this.field4685;
      this.field4685 = var2 * this.field4685 - var7 * var3;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "61"
   )
   void method8248(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4686;
      float var5 = this.field4677;
      float var6 = this.field4680;
      float var7 = this.field4683;
      this.field4686 = var4 * var2 - this.field4675 * var3;
      this.field4675 = var2 * this.field4675 + var4 * var3;
      this.field4677 = var5 * var2 - this.field4678 * var3;
      this.field4678 = var3 * var5 + var2 * this.field4678;
      this.field4680 = var2 * var6 - this.field4681 * var3;
      this.field4681 = var2 * this.field4681 + var3 * var6;
      this.field4683 = var2 * var7 - var3 * this.field4684;
      this.field4684 = var2 * this.field4684 + var3 * var7;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(FFFB)V",
      garbageValue = "117"
   )
   void method8245(float var1, float var2, float var3) {
      this.field4683 += var1;
      this.field4684 += var2;
      this.field4685 += var3;
   }

   public String toString() {
      return this.field4686 + "," + this.field4677 + "," + this.field4680 + "," + this.field4683 + "\n" + this.field4675 + "," + this.field4678 + "," + this.field4681 + "," + this.field4684 + "\n" + this.field4676 + "," + this.field4679 + "," + this.field4682 + "," + this.field4685;
   }

   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      descriptor = "(IIIILtq;Lll;I)V",
      garbageValue = "-1609285207"
   )
   @Export("drawSpriteOnMinimap")
   static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      if (var4 != null) {
         int var6 = Client.camAngleY & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method9512(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
            } else {
               var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
            }

         }
      }
   }
}
