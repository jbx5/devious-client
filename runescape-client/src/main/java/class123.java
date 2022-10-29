import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public enum class123 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   field1470(0, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   field1471(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   field1474(2, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   field1473(3, 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   field1472(4, 4);

   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -848181793
   )
   final int field1475;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1294862883
   )
   final int field1476;

   class123(int var3, int var4) {
      this.field1475 = var3;
      this.field1476 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1476;
   }

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1953852682"
   )
   static final void method2869() {
      Client.field703 = Client.cycleCntr;
      class139.field1616 = true;
   }
}
