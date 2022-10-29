import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class283 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("musicPatchesArchive")
   public static AbstractArchive musicPatchesArchive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("musicSamplesArchive")
   public static AbstractArchive musicSamplesArchive;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("soundEffectsArchive")
   public static AbstractArchive soundEffectsArchive;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljr;"
   )
   @Export("midiPcmStream")
   public static MidiPcmStream midiPcmStream;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 789238769
   )
   @Export("musicPlayerStatus")
   public static int musicPlayerStatus = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -432360525
   )
   @Export("musicTrackGroupId")
   public static int musicTrackGroupId;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -71379071
   )
   @Export("musicTrackFileId")
   public static int musicTrackFileId;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-606489254"
   )
   public static boolean method5443(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (var0 != 0) {
            char[] var1 = class355.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-638583103"
   )
   static void method5450() {
      if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
         Login.currentLoginField = 1;
      } else {
         Login.currentLoginField = 0;
      }

   }
}
