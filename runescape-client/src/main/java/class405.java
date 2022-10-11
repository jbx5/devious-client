import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class405 {
   @ObfuscatedName("a")
   float field4553;
   @ObfuscatedName("f")
   float field4554;
   @ObfuscatedName("c")
   float field4552;

   static {
      new class405(0.0F, 0.0F, 0.0F);
      new class405(1.0F, 1.0F, 1.0F);
      new class405(1.0F, 0.0F, 0.0F);
      new class405(0.0F, 1.0F, 0.0F);
      new class405(0.0F, 0.0F, 1.0F);
      PacketWriter.method2655(100);
   }

   class405(float var1, float var2, float var3) {
      this.field4553 = var1;
      this.field4554 = var2;
      this.field4552 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "1976854042"
   )
   final float method7602() {
      return (float)Math.sqrt((double)(this.field4552 * this.field4552 + this.field4554 * this.field4554 + this.field4553 * this.field4553));
   }

   public String toString() {
      return this.field4553 + ", " + this.field4554 + ", " + this.field4552;
   }
}
