import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public class class464 extends class467 {
   @ObfuscatedName("aj")
   public static boolean field4803;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 131469685
   )
   int field4799 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1543634477
   )
   int field4797 = 0;
   @ObfuscatedName("av")
   double field4796 = 0.0;
   @ObfuscatedName("as")
   double field4798 = 0.0;
   @ObfuscatedName("ax")
   double field4800 = 0.0;
   @ObfuscatedName("ap")
   double field4801 = 0.0;
   @ObfuscatedName("ab")
   double field4802 = 0.0;

   public class464(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field4799 = var3;
      this.field4797 = var6;
      if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
         this.field4796 = (double)var4;
         this.field4798 = (double)var5;
      } else {
         double var11 = (double)((float)(var7 + var1)) / 2.0;
         double var13 = (double)((float)(var8 + var2)) / 2.0;
         double var15 = (double)((float)(var4 + var7)) / 2.0;
         double var17 = (double)((float)(var5 + var8)) / 2.0;
         double var19 = (double)(var7 - var1) * -1.0 / (double)(var8 - var2);
         double var21 = (double)(var4 - var7) * -1.0 / (double)(var5 - var8);
         this.field4796 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
         this.field4798 = var13 + var19 * (this.field4796 - var11);
         this.field4800 = Math.sqrt(Math.pow(this.field4796 - (double)var1, 2.0) + Math.pow(this.field4798 - (double)var2, 2.0));
         this.field4801 = Math.atan2((double)var2 - this.field4798, (double)var1 - this.field4796);
         double var23 = Math.atan2((double)var8 - this.field4798, (double)var7 - this.field4796);
         this.field4802 = Math.atan2((double)var5 - this.field4798, (double)var4 - this.field4796);
         boolean var25 = this.field4801 <= var23 && var23 <= this.field4802 || this.field4802 <= var23 && var23 <= this.field4801;
         if (!var25) {
            this.field4802 += (double)(this.field4801 - this.field4802 > 0.0 ? 2 : -2) * Math.PI;
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1021755450"
   )
   public int vmethod8351() {
      double var1 = this.method8361();
      double var3 = var1 * (this.field4802 - this.field4801) + this.field4801;
      return (int)Math.round(this.field4796 + this.field4800 * Math.cos(var3));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1687418689"
   )
   public int vmethod8348() {
      double var1 = this.method8361();
      double var3 = (this.field4802 - this.field4801) * var1 + this.field4801;
      return (int)Math.round(this.field4798 + this.field4800 * Math.sin(var3));
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1779423139"
   )
   public int vmethod8347() {
      double var1 = this.method8361();
      return (int)Math.round(var1 * (double)(this.field4797 - this.field4799) + (double)this.field4799);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "-30154"
   )
   static final int method8328(int var0, int var1) {
      int var2 = UserComparator4.method2848(var0 - 1, var1 - 1) + UserComparator4.method2848(var0 + 1, var1 - 1) + UserComparator4.method2848(var0 - 1, var1 + 1) + UserComparator4.method2848(var0 + 1, var1 + 1);
      int var3 = UserComparator4.method2848(var0 - 1, var1) + UserComparator4.method2848(1 + var0, var1) + UserComparator4.method2848(var0, var1 - 1) + UserComparator4.method2848(var0, 1 + var1);
      int var4 = UserComparator4.method2848(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
