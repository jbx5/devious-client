import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public enum class424 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   field4630(1, 1),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   field4629(3, 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   field4632(0, 3),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   field4631(2, 10);

   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 142058319
   )
   final int field4628;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 349375635
   )
   final int field4633;

   class424(int var3, int var4) {
      this.field4628 = var3;
      this.field4633 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4633;
   }
}
