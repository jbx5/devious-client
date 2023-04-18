import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class219 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lew;"
   )
   class122[] field2523;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1558849479
   )
   int field2525;

   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V"
   )
   class219(Buffer var1, int var2) {
      this.field2523 = new class122[var2];
      this.field2525 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2523.length; ++var3) {
         class122 var4 = new class122(this.field2525, var1, false);
         this.field2523[var3] = var4;
      }

      this.method4453();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "698731352"
   )
   void method4453() {
      class122[] var1 = this.field2523;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class122 var3 = var1[var2];
         if (var3.field1481 >= 0) {
            var3.field1478 = this.field2523[var3.field1481];
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1415640515"
   )
   public int method4452() {
      return this.field2523.length;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lew;",
      garbageValue = "119"
   )
   class122 method4454(int var1) {
      return var1 >= this.method4452() ? null : this.field2523[var1];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)[Lew;",
      garbageValue = "53"
   )
   class122[] method4456() {
      return this.field2523;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lfh;II)V",
      garbageValue = "1980554520"
   )
   void method4457(class133 var1, int var2) {
      this.method4474(var1, var2, (boolean[])null, false);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lfh;I[ZZI)V",
      garbageValue = "-944205793"
   )
   void method4474(class133 var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method3141();
      int var6 = 0;
      class122[] var7 = this.method4456();

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class122 var9 = var7[var8];
         if (var3 == null || var4 == var3[var6]) {
            var1.method3139(var2, var9, var6, var5);
         }

         ++var6;
      }

   }
}
