import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public enum class310 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   field3667(0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   field3662(1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   field3663(2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   field3664(3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   field3665(4);

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive19")
   static Archive archive19;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1504029357
   )
   final int field3666;

   class310(int var3) {
      this.field3666 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3666;
   }
}
