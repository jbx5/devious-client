import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Skills")
public class Skills {
   @ObfuscatedName("al")
   @Export("Skills_enabled")
   public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("ac")
   @Export("Skills_experienceTable")
   public static int[] Skills_experienceTable = new int[99];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         Skills_experienceTable[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1787424605"
   )
   @Export("isWorldMapEvent")
   public static boolean isWorldMapEvent(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1955316820"
   )
   static void method6322() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4162 == 0) {
            class145.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            class145.ArchiveDiskActionHandler_thread.setDaemon(true);
            class145.ArchiveDiskActionHandler_thread.start();
            class145.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4162 = 600;
      }
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2090734700"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (WorldMapSectionType.clientPreferences.method2442() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }
}
