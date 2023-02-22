import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class376 {
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive18")
   static Archive archive18;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1498210669
   )
   int field4377;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class376(int var1, boolean var2) {
      this.field4377 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1782146409"
   )
   public int method7137() {
      return this.field4377;
   }
}
