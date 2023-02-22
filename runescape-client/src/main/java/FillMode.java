import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public enum FillMode implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lsc;"
   )
   @Export("SOLID")
   SOLID(0, 0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lsc;"
   )
   field4982(1, 1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsc;"
   )
   field4983(2, 2);

   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2110853219
   )
   public final int field4981;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 2028587337
   )
   final int field4984;

   FillMode(int var3, int var4) {
      this.field4981 = var3;
      this.field4984 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4984;
   }
}
