import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class439 {
   @ObfuscatedName("at")
   float field4695;
   @ObfuscatedName("an")
   float field4688;
   @ObfuscatedName("av")
   float field4687;
   @ObfuscatedName("as")
   float field4699;
   @ObfuscatedName("ax")
   float field4691;
   @ObfuscatedName("ap")
   float field4692;
   @ObfuscatedName("ab")
   float field4693;
   @ObfuscatedName("ak")
   float field4694;
   @ObfuscatedName("ae")
   float field4689;
   @ObfuscatedName("af")
   float field4696;
   @ObfuscatedName("ao")
   float field4690;
   @ObfuscatedName("aa")
   float field4698;

   static {
      new class439();
   }

   class439() {
      this.method8153();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1851005339"
   )
   void method8153() {
      this.field4698 = 0.0F;
      this.field4690 = 0.0F;
      this.field4696 = 0.0F;
      this.field4694 = 0.0F;
      this.field4693 = 0.0F;
      this.field4692 = 0.0F;
      this.field4699 = 0.0F;
      this.field4687 = 0.0F;
      this.field4688 = 0.0F;
      this.field4689 = 1.0F;
      this.field4691 = 1.0F;
      this.field4695 = 1.0F;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "-16"
   )
   void method8157(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4688;
      float var5 = this.field4691;
      float var6 = this.field4694;
      float var7 = this.field4690;
      this.field4688 = var2 * var4 - var3 * this.field4687;
      this.field4687 = var4 * var3 + this.field4687 * var2;
      this.field4691 = var5 * var2 - var3 * this.field4692;
      this.field4692 = var5 * var3 + this.field4692 * var2;
      this.field4694 = var2 * var6 - var3 * this.field4689;
      this.field4689 = var2 * this.field4689 + var3 * var6;
      this.field4690 = var2 * var7 - this.field4698 * var3;
      this.field4698 = var2 * this.field4698 + var7 * var3;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "1629816296"
   )
   void method8169(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4695;
      float var5 = this.field4699;
      float var6 = this.field4693;
      float var7 = this.field4696;
      this.field4695 = var3 * this.field4687 + var2 * var4;
      this.field4687 = this.field4687 * var2 - var4 * var3;
      this.field4699 = var3 * this.field4692 + var2 * var5;
      this.field4692 = this.field4692 * var2 - var3 * var5;
      this.field4693 = var3 * this.field4689 + var2 * var6;
      this.field4689 = var2 * this.field4689 - var6 * var3;
      this.field4696 = var2 * var7 + var3 * this.field4698;
      this.field4698 = this.field4698 * var2 - var3 * var7;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-1031514623"
   )
   void method8168(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4695;
      float var5 = this.field4699;
      float var6 = this.field4693;
      float var7 = this.field4696;
      this.field4695 = var4 * var2 - var3 * this.field4688;
      this.field4688 = var3 * var4 + this.field4688 * var2;
      this.field4699 = var5 * var2 - var3 * this.field4691;
      this.field4691 = this.field4691 * var2 + var5 * var3;
      this.field4693 = var6 * var2 - var3 * this.field4694;
      this.field4694 = var2 * this.field4694 + var3 * var6;
      this.field4696 = var2 * var7 - this.field4690 * var3;
      this.field4690 = var2 * this.field4690 + var3 * var7;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "1520938784"
   )
   void method8162(float var1, float var2, float var3) {
      this.field4696 += var1;
      this.field4690 += var2;
      this.field4698 += var3;
   }

   public String toString() {
      return this.field4695 + "," + this.field4699 + "," + this.field4693 + "," + this.field4696 + "\n" + this.field4688 + "," + this.field4691 + "," + this.field4694 + "," + this.field4690 + "\n" + this.field4687 + "," + this.field4692 + "," + this.field4689 + "," + this.field4698;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "102"
   )
   public static int method8155(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lbl;I)V",
      garbageValue = "-1900979009"
   )
   public static final void method8156(class51 var0) {
      AbstractUserComparator.pcmPlayerProvider = var0;
   }
}
