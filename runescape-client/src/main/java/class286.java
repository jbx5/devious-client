import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class286 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("musicPatchesArchive")
   static AbstractArchive musicPatchesArchive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("musicSamplesArchive")
   static AbstractArchive musicSamplesArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("soundEffectsArchive")
   static AbstractArchive soundEffectsArchive;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -248283575
   )
   @Export("musicPlayerStatus")
   public static int musicPlayerStatus = 0;
   @ObfuscatedName("q")
   @Export("PcmPlayer_stereo")
   public static boolean PcmPlayer_stereo;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -334824875
   )
   @Export("musicTrackFileId")
   public static int musicTrackFileId;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 623704693
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Lkc;"
   )
   @Export("musicTrack")
   static MusicTrack musicTrack;
}
