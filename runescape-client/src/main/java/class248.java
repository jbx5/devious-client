import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class248 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   static final class248 field2915 = new class248(0);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   static final class248 field2919 = new class248(1);
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -108752475
   )
   @Export("value")
   final int value;

   class248(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;Llg;Ljr;I)Z",
      garbageValue = "-949591035"
   )
   public static boolean method5161(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
      class283.musicPatchesArchive = var0;
      class283.musicSamplesArchive = var1;
      class283.soundEffectsArchive = var2;
      class283.midiPcmStream = var3;
      return true;
   }

   @ObfuscatedName("f")
   static final void method5160(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "36"
   )
   public static void method5162(int var0) {
      if (class283.musicPlayerStatus != 0) {
         Messages.musicTrackVolume = var0;
      } else {
         class283.midiPcmStream.setPcmStreamVolume(var0);
      }

   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1893048295"
   )
   static final boolean method5163() {
      return Client.isMenuOpen;
   }
}
