import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class37 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   @Export("reflectionChecks")
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-885227918"
   )
   public static boolean method701() {
      try {
         if (class286.musicPlayerStatus == 2) {
            if (class286.musicTrack == null) {
               class286.musicTrack = MusicTrack.readTrack(class304.musicTrackArchive, class109.musicTrackGroupId, class286.musicTrackFileId);
               if (class286.musicTrack == null) {
                  return false;
               }
            }

            if (ItemContainer.soundCache == null) {
               ItemContainer.soundCache = new SoundCache(class286.soundEffectsArchive, class286.musicSamplesArchive);
            }

            if (class251.midiPcmStream.loadMusicTrack(class286.musicTrack, class286.musicPatchesArchive, ItemContainer.soundCache, 22050)) {
               class251.midiPcmStream.clearAll();
               class251.midiPcmStream.setPcmStreamVolume(class467.musicTrackVolume);
               class251.midiPcmStream.setMusicTrack(class286.musicTrack, class145.musicTrackBoolean);
               class286.musicPlayerStatus = 0;
               class286.musicTrack = null;
               ItemContainer.soundCache = null;
               class304.musicTrackArchive = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class251.midiPcmStream.clear();
         class286.musicPlayerStatus = 0;
         class286.musicTrack = null;
         ItemContainer.soundCache = null;
         class304.musicTrackArchive = null;
      }

      return false;
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
      garbageValue = "-2077316645"
   )
   @Export("insertMenuItem")
   static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!Client.isMenuOpen) {
         if (Client.menuOptionsCount < 500) {
            Client.menuActions[Client.menuOptionsCount] = var0;
            Client.menuTargets[Client.menuOptionsCount] = var1;
            Client.menuOpcodes[Client.menuOptionsCount] = var2;
            Client.menuIdentifiers[Client.menuOptionsCount] = var3;
            Client.menuArguments1[Client.menuOptionsCount] = var4;
            Client.menuArguments2[Client.menuOptionsCount] = var5;
            Client.menuItemIds[Client.menuOptionsCount] = var6;
            Client.menuShiftClick[Client.menuOptionsCount] = var7;
            ++Client.menuOptionsCount;
         }

      }
   }

   @ObfuscatedName("ny")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "1537"
   )
   static void method709(int var0) {
      if (var0 != Client.loginState) {
         Client.loginState = var0;
      }
   }
}
