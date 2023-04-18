import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public final class class424 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lqx;"
   )
   static class424[] field4659 = new class424[0];
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1819670561
   )
   static int field4657;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2133937525
   )
   static int field4658;
   @ObfuscatedName("ac")
   float field4660;
   @ObfuscatedName("au")
   float field4661;
   @ObfuscatedName("ab")
   float field4662;
   @ObfuscatedName("aq")
   float field4663;

   static {
      class310.method6031(100);
      new class424();
   }

   class424() {
      this.method8167();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-73"
   )
   public void method8144() {
      synchronized(field4659) {
         if (field4658 < field4657 - 1) {
            field4659[++field4658 - 1] = this;
         }

      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(FFFFB)V",
      garbageValue = "-47"
   )
   void method8138(float var1, float var2, float var3, float var4) {
      this.field4660 = var1;
      this.field4661 = var2;
      this.field4662 = var3;
      this.field4663 = var4;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)V",
      garbageValue = "749287521"
   )
   public void method8139(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(0.5F * var4));
      float var6 = (float)Math.cos((double)(0.5F * var4));
      this.field4660 = var5 * var1;
      this.field4661 = var5 * var2;
      this.field4662 = var3 * var5;
      this.field4663 = var6;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "147041014"
   )
   final void method8167() {
      this.field4662 = 0.0F;
      this.field4661 = 0.0F;
      this.field4660 = 0.0F;
      this.field4663 = 1.0F;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lqx;B)V",
      garbageValue = "31"
   )
   public final void method8141(class424 var1) {
      this.method8138(var1.field4661 * this.field4662 + var1.field4660 * this.field4663 + var1.field4663 * this.field4660 - this.field4661 * var1.field4662, var1.field4661 * this.field4663 + (this.field4661 * var1.field4663 - this.field4662 * var1.field4660) + this.field4660 * var1.field4662, this.field4662 * var1.field4663 + var1.field4660 * this.field4661 - var1.field4661 * this.field4660 + var1.field4662 * this.field4663, this.field4663 * var1.field4663 - var1.field4660 * this.field4660 - this.field4661 * var1.field4661 - this.field4662 * var1.field4662);
   }

   public String toString() {
      return this.field4660 + "," + this.field4661 + "," + this.field4662 + "," + this.field4663;
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.field4660;
      var2 = 31.0F * var2 + this.field4661;
      var2 = 31.0F * var2 + this.field4662;
      var2 = this.field4663 + 31.0F * var2;
      return (int)var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class424)) {
         return false;
      } else {
         class424 var2 = (class424)var1;
         return this.field4660 == var2.field4660 && this.field4661 == var2.field4661 && this.field4662 == var2.field4662 && var2.field4663 == this.field4663;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([FIFI)F",
      garbageValue = "186890791"
   )
   static float method8171(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }
}
