import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public enum class131 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1621(0, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1612(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1613(2, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1614(3, 3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1615(4, 4),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1616(5, 5),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1620(6, 6),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1618(7, 7),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ley;"
   )
   field1622(8, 8);

   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1178244865
   )
   final int field1617;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1485278965
   )
   final int field1611;

   class131(int var3, int var4) {
      this.field1617 = var3;
      this.field1611 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1611;
   }
}
