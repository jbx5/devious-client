import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public enum class330 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llo;"
   )
   field4162(-1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Llo;"
   )
   field4167(0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llo;"
   )
   field4163(1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llo;"
   )
   field4164(2);

   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1925933929
   )
   final int field4166;

   class330(int var3) {
      this.field4166 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4166;
   }
}
