import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class290 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("musicPatchesArchive")
   public static AbstractArchive musicPatchesArchive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("musicSamplesArchive")
   public static AbstractArchive musicSamplesArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("soundEffectsArchive")
   public static AbstractArchive soundEffectsArchive;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("midiPcmStream")
   public static MidiPcmStream midiPcmStream;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1163473009
   )
   @Export("musicPlayerStatus")
   public static int musicPlayerStatus = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -423935109
   )
   @Export("musicTrackVolume")
   public static int musicTrackVolume;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   static Bounds field3364;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "138356035"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (ClanChannel.World_request == null) {
            ClanChannel.World_request = class245.urlRequester.request(new URL(VerticalAlignment.field2070));
         } else if (ClanChannel.World_request.isDone()) {
            byte[] var0 = ClanChannel.World_request.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.World_count = var1.readUnsignedShort();
            class88.World_worlds = new World[World.World_count];

            World var3;
            for(int var2 = 0; var2 < World.World_count; var3.index = var2++) {
               var3 = class88.World_worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            class156.sortWorlds(class88.World_worlds, 0, class88.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            ClanChannel.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         ClanChannel.World_request = null;
      }

      return false;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V",
      garbageValue = "35"
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
}
