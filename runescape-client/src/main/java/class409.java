import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public final class class409 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lop;"
   )
   static class409[] field4601 = new class409[0];
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1552768481
   )
   static int field4602 = 100;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1009623885
   )
   static int field4604;
   @ObfuscatedName("x")
   float field4600;
   @ObfuscatedName("m")
   float field4603;
   @ObfuscatedName("q")
   float field4605;
   @ObfuscatedName("f")
   float field4606;

   static {
      field4601 = new class409[100];
      field4604 = 0;
      new class409();
   }

   class409() {
      this.method7763();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1171063218"
   )
   public void method7775() {
      synchronized(field4601) {
         if (field4604 < field4602 - 1) {
            field4601[++field4604 - 1] = this;
         }

      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)V",
      garbageValue = "-1050402339"
   )
   void method7757(float var1, float var2, float var3, float var4) {
      this.field4603 = var1;
      this.field4600 = var2;
      this.field4605 = var3;
      this.field4606 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)V",
      garbageValue = "-733251402"
   )
   public void method7758(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(0.5F * var4));
      this.field4603 = var5 * var1;
      this.field4600 = var5 * var2;
      this.field4605 = var3 * var5;
      this.field4606 = var6;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-48"
   )
   final void method7763() {
      this.field4605 = 0.0F;
      this.field4600 = 0.0F;
      this.field4603 = 0.0F;
      this.field4606 = 1.0F;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lop;I)V",
      garbageValue = "665164038"
   )
   public final void method7760(class409 var1) {
      this.method7757(this.field4605 * var1.field4600 + this.field4603 * var1.field4606 + var1.field4603 * this.field4606 - this.field4600 * var1.field4605, this.field4606 * var1.field4600 + (var1.field4606 * this.field4600 - var1.field4603 * this.field4605) + var1.field4605 * this.field4603, this.field4600 * var1.field4603 + var1.field4606 * this.field4605 - var1.field4600 * this.field4603 + this.field4606 * var1.field4605, var1.field4606 * this.field4606 - this.field4603 * var1.field4603 - var1.field4600 * this.field4600 - this.field4605 * var1.field4605);
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field4603 + var2 * 31.0F;
      var2 = this.field4600 + 31.0F * var2;
      var2 = var2 * 31.0F + this.field4605;
      var2 = this.field4606 + var2 * 31.0F;
      return (int)var2;
   }

   public String toString() {
      return this.field4603 + "," + this.field4600 + "," + this.field4605 + "," + this.field4606;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class409)) {
         return false;
      } else {
         class409 var2 = (class409)var1;
         return this.field4603 == var2.field4603 && this.field4600 == var2.field4600 && var2.field4605 == this.field4605 && this.field4606 == var2.field4606;
      }
   }
}
