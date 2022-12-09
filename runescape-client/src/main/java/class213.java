import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class213 {
   @ObfuscatedName("uk")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Ldt;"
   )
   class123[] field2510;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1879864783
   )
   int field2515;

   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V"
   )
   class213(Buffer var1, int var2) {
      this.field2510 = new class123[var2];
      this.field2515 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2510.length; ++var3) {
         class123 var4 = new class123(this.field2515, var1, false);
         this.field2510[var3] = var4;
      }

      this.method4399();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1801753384"
   )
   void method4399() {
      class123[] var1 = this.field2510;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class123 var3 = var1[var2];
         if (var3.field1516 >= 0) {
            var3.field1513 = this.field2510[var3.field1516];
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-294189999"
   )
   public int method4400() {
      return this.field2510.length;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Ldt;",
      garbageValue = "2141149812"
   )
   class123 method4401(int var1) {
      return var1 >= this.method4400() ? null : this.field2510[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldt;",
      garbageValue = "-777333146"
   )
   class123[] method4412() {
      return this.field2510;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lew;IB)V",
      garbageValue = "-52"
   )
   void method4403(class130 var1, int var2) {
      this.method4414(var1, var2, (boolean[])null, false);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lew;I[ZZI)V",
      garbageValue = "1653301978"
   )
   void method4414(class130 var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method3021();
      int var6 = 0;
      class123[] var7 = this.method4412();

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class123 var9 = var7[var8];
         if (var3 == null || var4 == var3[var6]) {
            var1.method3003(var2, var9, var6, var5);
         }

         ++var6;
      }

   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "6274"
   )
   public static boolean method4420() {
      return Client.clickedWidget != null;
   }
}
