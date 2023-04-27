import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public abstract class class456 {
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 71849511
   )
   int field4803 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1095678947
   )
   int field4801 = 0;
   @ObfuscatedName("aa")
   double field4804 = 0.0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 570638463
   )
   int field4802 = 0;

   class456(int var1, int var2) {
      this.field4803 = var1;
      this.field4801 = 0;
      this.field4802 = var2 >= 0 && var2 <= 27 ? var2 : 0;
      this.field4804 = class70.method2045(this.field4801, this.field4803, this.field4802);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1056608867"
   )
   public void method8441() {
      if (this.field4801 < this.field4803) {
         ++this.field4801;
         this.field4804 = class70.method2045(this.field4801, this.field4803, this.field4802);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)D",
      garbageValue = "1089057010"
   )
   double method8447() {
      return this.field4804;
   }
}
