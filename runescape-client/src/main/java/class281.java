import java.io.File;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public final class class281 {
   @ObfuscatedName("sf")
   @ObfuscatedSignature(
      descriptor = "Lnc;"
   )
   @Export("friendsChat")
   static FriendsChat friendsChat;
   @ObfuscatedName("sa")
   @Export("ClanChat_inClanChat")
   static boolean ClanChat_inClanChat;
   @ObfuscatedName("v")
   static final HashMap field3318 = new HashMap();
   @ObfuscatedName("m")
   @Export("cacheDir")
   public static File cacheDir;
   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("mapDotSprites")
   static SpritePixels[] mapDotSprites;

   static {
      java.util.Calendar.getInstance(method5503("Europe/London"));
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
      garbageValue = "32904762"
   )
   static TimeZone method5503(String var0) {
      synchronized(field3318) {
         TimeZone var2 = (TimeZone)field3318.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3318.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "12"
   )
   static void method5504() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
            WorldMapAreaData.addPlayerToScene(Client.players[var1[var2]], true);
         }
      }

   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "283375352"
   )
   static final void method5499(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class17.field101 || MusicPatchNode2.field3341 != var1) {
         class17.field101 = var0;
         MusicPatchNode2.field3341 = var1;
         class140.updateGameState(25);
         SoundSystem.drawLoadingMessage("Loading - please wait.", true);
         int var3 = class154.baseX * 64;
         int var4 = class365.baseY * 64;
         class154.baseX = (var0 - 6) * 8;
         class365.baseY = (var1 - 6) * 8;
         int var5 = class154.baseX * 64 - var3;
         int var6 = class365.baseY * 64 - var4;
         var3 = class154.baseX * 64;
         var4 = class365.baseY * 64;

         int var7;
         int var9;
         int[] var10000;
         for(var7 = 0; var7 < 65536; ++var7) {
            NPC var19 = Client.npcs[var7];
            if (var19 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var19.pathX;
                  var10000[var9] -= var5;
                  var10000 = var19.pathY;
                  var10000[var9] -= var6;
               }

               var19.x -= var5 * 128;
               var19.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var22 = Client.players[var7];
            if (var22 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var22.pathX;
                  var10000[var9] -= var5;
                  var10000 = var22.pathY;
                  var10000[var9] -= var6;
               }

               var22.x -= var5 * 128;
               var22.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var8 = 104;
         byte var21 = 1;
         if (var5 < 0) {
            var20 = 103;
            var8 = -1;
            var21 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var13 != var8; var13 += var21) {
            for(var14 = var10; var11 != var14; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
                  } else {
                     Client.groundItems[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
            var18.x -= var5;
            var18.y -= var6;
            if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
               var18.remove();
            }
         }

         if (Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.soundEffectCount = 0;
         Client.isCameraLocked = false;
         class145.cameraX -= var5 << 7;
         ClanChannel.cameraZ -= var6 << 7;
         class29.oculusOrbFocalPointX -= var5 << 7;
         class14.oculusOrbFocalPointY -= var6 << 7;
         Client.field619 = -1;
         Client.graphicsObjects.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].clear();
         }

      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1604095117"
   )
   static final boolean method5505(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var1 = Client.menuOpcodes[var0];
         if (var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1475515227"
   )
   static boolean method5501(int var0) {
      for(int var1 = 0; var1 < Client.field710; ++var1) {
         if (Client.field751[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
