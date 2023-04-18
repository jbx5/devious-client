import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public enum class337 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   field4162(-1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   field4164(0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   field4161(1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   field4163(2);

   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1923877153
   )
   final int field4165;

   class337(int var3) {
      this.field4165 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4165;
   }
}
