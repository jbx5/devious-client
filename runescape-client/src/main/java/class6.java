import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public enum class6 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lf;"
   )
   field17(0, 0);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1124908931
   )
   final int field16;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -2124090035
   )
   final int field19;

   class6(int var3, int var4) {
      this.field16 = var3;
      this.field19 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field19;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1148872564"
   )
   public static void method39() {
      class251.midiPcmStream.clear();
      class286.musicPlayerStatus = 1;
      class304.musicTrackArchive = null;
   }
}
