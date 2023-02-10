import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public enum class420 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   field4667(0, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   field4666(3, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   field4665(1, 3),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   field4668(2, 10);

   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1778165817
   )
   final int field4669;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1123956495
   )
   final int field4670;

   class420(int var3, int var4) {
      this.field4669 = var3;
      this.field4670 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4670;
   }
}
