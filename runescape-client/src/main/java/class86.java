import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public enum class86 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   field1106(0, -1),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   field1098(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   field1097(2, 7),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   field1100(3, 8),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   field1101(4, 9);

   @ObfuscatedName("b")
   public static short[] field1104;
   @ObfuscatedName("qu")
   @ObfuscatedSignature(
      descriptor = "Lff;"
   )
   @Export("mouseWheel")
   static class166 mouseWheel;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1562440541
   )
   final int field1099;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2017152405
   )
   final int field1103;

   class86(int var3, int var4) {
      this.field1099 = var3;
      this.field1103 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1103;
   }
}
