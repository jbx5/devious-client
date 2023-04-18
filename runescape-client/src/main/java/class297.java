import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class297 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("musicPatchesArchive")
   public static AbstractArchive musicPatchesArchive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("musicSamplesArchive")
   public static AbstractArchive musicSamplesArchive;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("soundEffectsArchive")
   public static AbstractArchive soundEffectsArchive;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 926096579
   )
   @Export("musicPlayerStatus")
   public static int musicPlayerStatus = 0;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("musicTrackArchive")
   public static AbstractArchive musicTrackArchive;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lba;"
   )
   @Export("soundCache")
   public static SoundCache soundCache;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = -91399205
   )
   @Export("cameraZ")
   static int cameraZ;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lcl;Lcl;IZB)I",
      garbageValue = "52"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1777() ? (var1.method1777() ? 0 : 1) : (var1.method1777() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1824() ? (var1.method1824() ? 0 : 1) : (var1.method1824() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }
}
