import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public enum FillMode implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lrb;"
   )
   @Export("SOLID")
   SOLID(0, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lrb;"
   )
   field4944(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lrb;"
   )
   field4945(2, 2);

   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -770014619
   )
   public final int field4947;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1917012875
   )
   final int field4948;

   FillMode(int var3, int var4) {
      this.field4947 = var3;
      this.field4948 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4948;
   }
}
