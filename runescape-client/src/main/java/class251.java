import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class251 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lis;"
   )
   static final class251 field2976 = new class251(0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lis;"
   )
   static final class251 field2977 = new class251(1);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("midiPcmStream")
   static MidiPcmStream midiPcmStream;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2091175605
   )
   @Export("value")
   final int value;

   class251(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "85"
   )
   public static boolean method5275(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }
}
