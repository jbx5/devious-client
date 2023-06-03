import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class497 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1647907932"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (World.World_request == null) {
            World.World_request = class47.urlRequester.request(new URL(FillMode.field5098));
         } else if (World.World_request.isDone()) {
            byte[] var0 = World.World_request.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.World_count = var1.readUnsignedShort();
            World.World_worlds = new World[World.World_count];

            World var3;
            for(int var2 = 0; var2 < World.World_count; var3.index = var2++) {
               var3 = World.World_worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            ClanChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            World.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         World.World_request = null;
      }

      return false;
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "18"
   )
   static boolean method8848() {
      return (Client.drawPlayerNames & 4) != 0;
   }
}
