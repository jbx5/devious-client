import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class31 {
   @ObfuscatedName("tz")
   @ObfuscatedGetter(
      intValue = 267846207
   )
   static int field181;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -9171562425366214627L
   )
   static long field180;
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = 460402933
   )
   @Export("currentPort")
   static int currentPort;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (Players.loadInterface(var0)) {
            Widget[] var1 = class71.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  class125.runScript(var4, 5000000, 0);
               }
            }

         }
      }
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "352173417"
   )
   static final void method453() {
      class280.method5498(class102.field1367, Frames.field2616, MusicPatchNode2.field3342);
      class158.method3335(NPCComposition.field2067, class101.field1365);
      if (class102.field1367 == class145.cameraX && class414.cameraY == Frames.field2616 && MusicPatchNode2.field3342 == ClanChannel.cameraZ && class97.cameraPitch == NPCComposition.field2067 && class101.field1365 == class128.cameraYaw) {
         Client.field772 = false;
         Client.isCameraLocked = false;
         class109.field1442 = 0;
         class146.field1718 = 0;
         class104.field1398 = 0;
         class415.field4647 = 0;
         LoginScreenAnimation.field1283 = 0;
         Tile.field2481 = 0;
         field181 = 0;
         class155.field1787 = 0;
         class34.field208 = 0;
         Script.field1001 = 0;
      }

   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1979436321"
   )
   static final void method454() {
      for(Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
         if (var0.plane == class383.Client_plane && Client.cycle <= var0.cycleEnd) {
            if (Client.cycle >= var0.cycleStart) {
               if (var0.targetIndex > 0) {
                  NPC var1 = Client.npcs[var0.targetIndex - 1];
                  if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.setDestination(var1.x, var1.y, SpotAnimationDefinition.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               if (var0.targetIndex < 0) {
                  int var2 = -var0.targetIndex - 1;
                  Player var3;
                  if (var2 == Client.localPlayerIndex) {
                     var3 = class155.localPlayer;
                  } else {
                     var3 = Client.players[var2];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.setDestination(var3.x, var3.y, SpotAnimationDefinition.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               var0.advance(Client.graphicsCycle);
               ReflectionCheck.scene.drawEntity(class383.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
            }
         } else {
            var0.remove();
         }
      }

   }
}
