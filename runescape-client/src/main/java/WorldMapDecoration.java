import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1056681405
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 141981565
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1928545853
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;Lly;Lka;I)Z",
      garbageValue = "1603100581"
   )
   public static boolean method5269(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
      class286.musicPatchesArchive = var0;
      class286.musicSamplesArchive = var1;
      class286.soundEffectsArchive = var2;
      class251.midiPcmStream = var3;
      return true;
   }
}
