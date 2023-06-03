import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public abstract class class468 {
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1238147959
   )
   int field4815 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -805297035
   )
   int field4816 = 0;
   @ObfuscatedName("af")
   double field4817 = 0.0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -422186143
   )
   int field4818 = 0;

   class468(int var1, int var2) {
      this.field4815 = var1;
      this.field4816 = 0;
      this.field4818 = var2 >= 0 && var2 <= 27 ? var2 : 0;
      this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-786703556"
   )
   public void method8359() {
      if (this.field4816 < this.field4815) {
         ++this.field4816;
         this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818);
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)D",
      garbageValue = "-3"
   )
   double method8361() {
      return this.field4817;
   }
}
