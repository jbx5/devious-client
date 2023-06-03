import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public enum class337 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   field3779(0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   field3777(1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   field3776(2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   field3778(3),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   field3780(4);

   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 997149899
   )
   static int field3782;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -151030961
   )
   final int field3781;

   class337(int var3) {
      this.field3781 = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3781;
   }
}
