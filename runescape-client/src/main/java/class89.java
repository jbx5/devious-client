import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public enum class89 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   field1082(0, -1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   field1081(1, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   field1083(2, 7),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   field1084(3, 8),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   field1085(4, 9);

   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -32541355
   )
   final int field1086;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1486235101
   )
   final int field1087;

   class89(int var3, int var4) {
      this.field1086 = var3;
      this.field1087 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1087;
   }
}
