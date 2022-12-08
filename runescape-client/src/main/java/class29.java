import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class29 {
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -55139539
   )
   static int field172;
   @ObfuscatedName("cy")
   @Export("KeyHandler_keyCodes")
   static int[] KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = 1655404347
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "79"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (class1.World_request == null) {
            class1.World_request = TaskHandler.urlRequester.request(new URL(class9.field41));
         } else if (class1.World_request.isDone()) {
            byte[] var0 = class1.World_request.getResponse();
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

            class420.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            class1.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class1.World_request = null;
      }

      return false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lly;IIIZB)V",
      garbageValue = "1"
   )
   public static void method426(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class286.musicPlayerStatus = 1;
      class304.musicTrackArchive = var0;
      class109.musicTrackGroupId = var1;
      class286.musicTrackFileId = var2;
      class467.musicTrackVolume = var3;
      class145.musicTrackBoolean = var4;
      class286.pcmSampleLength = 10000;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Lbm;",
      garbageValue = "3"
   )
   @Export("getWorldMapScript")
   static Script getWorldMapScript(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16));
      Script var5;
      if (var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class71.archive12.getGroupId(var7);
         if (var8 == -1) {
            var5 = null;
         } else {
            label59: {
               byte[] var9 = class71.archive12.takeFileFlat(var8);
               if (var9 != null) {
                  if (var9.length <= 1) {
                     var5 = null;
                     break label59;
                  }

                  var6 = FriendSystem.newScript(var9);
                  if (var6 != null) {
                     Script.Script_cached.put(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label59;
                  }
               }

               var5 = null;
            }
         }
      }

      if (var5 != null) {
         return var5;
      } else {
         int var13 = (-3 - var2 << 8) + var0;
         Script var15 = (Script)Script.Script_cached.get((long)(var13 << 16));
         Script var14;
         if (var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class71.archive12.getGroupId(var10);
            if (var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class71.archive12.takeFileFlat(var11);
               if (var12 != null) {
                  if (var12.length <= 1) {
                     var14 = null;
                     return var14 != null ? var14 : null;
                  }

                  var15 = FriendSystem.newScript(var12);
                  if (var15 != null) {
                     Script.Script_cached.put(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null ? var14 : null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null ? var14 : null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1517575560"
   )
   protected static final void method430() {
      UrlRequest.clock.mark();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.graphicsTickTimes[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.clientTickTimes[var0] = 0L;
      }

      class173.gameCyclesToDo = 0;
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static final void method429() {
      if (BufferedSink.field4572) {
         for(int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.method2294();
         }

         BufferedSink.field4572 = false;
      }

   }
}
