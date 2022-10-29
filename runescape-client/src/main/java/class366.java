import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class366 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 452696211
   )
   int field4340;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class366(int var1, boolean var2) {
      this.field4340 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1156696690"
   )
   public int method6990() {
      return this.field4340;
   }
}
