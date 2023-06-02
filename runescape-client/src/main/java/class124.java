import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class124 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -328384129
   )
   int field1457;
   @ObfuscatedName("an")
   float field1455;
   @ObfuscatedName("av")
   float field1456 = Float.MAX_VALUE;
   @ObfuscatedName("as")
   float field1461 = Float.MAX_VALUE;
   @ObfuscatedName("ax")
   float field1458 = Float.MAX_VALUE;
   @ObfuscatedName("ap")
   float field1459 = Float.MAX_VALUE;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   class124 field1460;

   class124() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "-12"
   )
   void method2901(Buffer var1, int var2) {
      this.field1457 = var1.readShort();
      this.field1455 = var1.method8916();
      this.field1456 = var1.method8916();
      this.field1461 = var1.method8916();
      this.field1458 = var1.method8916();
      this.field1459 = var1.method8916();
   }
}
