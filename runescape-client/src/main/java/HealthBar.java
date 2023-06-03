import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("HealthBar")
public class HealthBar extends Node {
   @ObfuscatedName("rm")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("HitSplatDefinition_cached")
   static class485 HitSplatDefinition_cached;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   @Export("definition")
   HealthBarDefinition definition;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("updates")
   IterableNodeDeque updates = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lhp;)V"
   )
   HealthBar(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2113368810"
   )
   @Export("put")
   void put(int var1, int var2, int var3, int var4) {
      HealthBarUpdate var5 = null;
      int var6 = 0;

      for(HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
         ++var6;
         if (var7.cycle == var1) {
            var7.set(var1, var2, var3, var4);
            return;
         }

         if (var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }

      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.updates.last().remove();
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Ldj;",
      garbageValue = "16777215"
   )
   @Export("get")
   HealthBarUpdate get(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
      if (var2 != null && var2.cycle <= var1) {
         for(HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
            var2.remove();
            var2 = var3;
         }

         if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1407768452"
   )
   @Export("isEmpty")
   boolean isEmpty() {
      return this.updates.method7007();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IB)Lfz;",
      garbageValue = "-111"
   )
   public static class136 method2553(int var0) {
      class136 var1 = (class136)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
         AbstractArchive var4 = class305.SequenceDefinition_skeletonsArchive;
         boolean var5 = true;
         byte[] var6 = var3.getFile(var0 >> 16 & '\uffff', var0 & '\uffff');
         class136 var2;
         if (var6 == null) {
            var5 = false;
            var2 = null;
         } else {
            int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
            byte[] var8 = var4.getFile(var7, 0);
            if (var8 == null) {
               var5 = false;
            }

            if (!var5) {
               var2 = null;
            } else {
               if (class125.field1468 == null) {
                  AccessFile.field4940 = Runtime.getRuntime().availableProcessors();
                  class125.field1468 = new ThreadPoolExecutor(0, AccessFile.field4940, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(AccessFile.field4940 * 100 + 100), new class183());
               }

               try {
                  var2 = new class136(var3, var4, var0, false);
               } catch (Exception var10) {
                  var2 = null;
               }
            }
         }

         if (var2 != null) {
            SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "75"
   )
   static final void method2549() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      if (Client.oculusOrbState == 0) {
         var0 = Projectile.localPlayer.x;
         var1 = Projectile.localPlayer.y;
         if (ModeWhere.oculusOrbFocalPointX - var0 < -500 || ModeWhere.oculusOrbFocalPointX - var0 > 500 || GrandExchangeEvents.oculusOrbFocalPointY - var1 < -500 || GrandExchangeEvents.oculusOrbFocalPointY - var1 > 500) {
            ModeWhere.oculusOrbFocalPointX = var0;
            GrandExchangeEvents.oculusOrbFocalPointY = var1;
         }

         if (var0 != ModeWhere.oculusOrbFocalPointX) {
            ModeWhere.oculusOrbFocalPointX += (var0 - ModeWhere.oculusOrbFocalPointX) / 16;
         }

         if (var1 != GrandExchangeEvents.oculusOrbFocalPointY) {
            GrandExchangeEvents.oculusOrbFocalPointY += (var1 - GrandExchangeEvents.oculusOrbFocalPointY) / 16;
         }

         var2 = ModeWhere.oculusOrbFocalPointX >> 7;
         var3 = GrandExchangeEvents.oculusOrbFocalPointY >> 7;
         var4 = Renderable.getTileHeight(ModeWhere.oculusOrbFocalPointX, GrandExchangeEvents.oculusOrbFocalPointY, Clock.Client_plane);
         var5 = 0;
         int var6;
         if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for(var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
               for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                  int var8 = Clock.Client_plane;
                  if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
                     ++var8;
                  }

                  int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
                  if (var9 > var5) {
                     var5 = var9;
                  }
               }
            }
         }

         var6 = var5 * 192;
         if (var6 > 98048) {
            var6 = 98048;
         }

         if (var6 < 32768) {
            var6 = 32768;
         }

         if (var6 > Client.field605) {
            Client.field605 += (var6 - Client.field605) / 24;
         } else if (var6 < Client.field605) {
            Client.field605 += (var6 - Client.field605) / 80;
         }

         Login.field917 = Renderable.getTileHeight(Projectile.localPlayer.x, Projectile.localPlayer.y, Clock.Client_plane) - Client.camFollowHeight;
      } else if (Client.oculusOrbState == 1) {
         if (Client.field602 && Projectile.localPlayer != null) {
            var0 = Projectile.localPlayer.pathX[0];
            var1 = Projectile.localPlayer.pathY[0];
            if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
               ModeWhere.oculusOrbFocalPointX = Projectile.localPlayer.x;
               var2 = Renderable.getTileHeight(Projectile.localPlayer.x, Projectile.localPlayer.y, Clock.Client_plane) - Client.camFollowHeight;
               if (var2 < Login.field917) {
                  Login.field917 = var2;
               }

               GrandExchangeEvents.oculusOrbFocalPointY = Projectile.localPlayer.y;
               Client.field602 = false;
            }
         }

         short var10 = -1;
         if (Client.field739.method4134(33)) {
            var10 = 0;
         } else if (Client.field739.method4134(49)) {
            var10 = 1024;
         }

         if (Client.field739.method4134(48)) {
            if (var10 == 0) {
               var10 = 1792;
            } else if (var10 == 1024) {
               var10 = 1280;
            } else {
               var10 = 1536;
            }
         } else if (Client.field739.method4134(50)) {
            if (var10 == 0) {
               var10 = 256;
            } else if (var10 == 1024) {
               var10 = 768;
            } else {
               var10 = 512;
            }
         }

         byte var11 = 0;
         if (Client.field739.method4134(35)) {
            var11 = -1;
         } else if (Client.field739.method4134(51)) {
            var11 = 1;
         }

         var2 = 0;
         if (var10 >= 0 || var11 != 0) {
            var2 = Client.field739.method4134(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
            var2 *= 16;
            Client.field597 = var10;
            Client.field598 = var11;
         }

         if (Client.field596 < var2) {
            Client.field596 += var2 / 8;
            if (Client.field596 > var2) {
               Client.field596 = var2;
            }
         } else if (Client.field596 > var2) {
            Client.field596 = Client.field596 * 9 / 10;
         }

         if (Client.field596 > 0) {
            var3 = Client.field596 / 16;
            if (Client.field597 >= 0) {
               var0 = Client.field597 - class291.cameraYaw & 2047;
               var4 = Rasterizer3D.Rasterizer3D_sine[var0];
               var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
               ModeWhere.oculusOrbFocalPointX += var4 * var3 / 65536;
               GrandExchangeEvents.oculusOrbFocalPointY += var3 * var5 / 65536;
            }

            if (Client.field598 != 0) {
               Login.field917 += var3 * Client.field598;
               if (Login.field917 > 0) {
                  Login.field917 = 0;
               }
            }
         } else {
            Client.field597 = -1;
            Client.field598 = -1;
         }

         if (Client.field739.method4134(13)) {
            Client.packetWriter.addNode(ObjectComposition.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
            Client.oculusOrbState = 0;
         }
      }

      if (MouseHandler.MouseHandler_currentButton == 4 && class305.mouseCam) {
         var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
         Client.camAngleDX = var0 * 2;
         Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
         var1 = Client.field727 - MouseHandler.MouseHandler_x;
         Client.camAngleDY = var1 * 2;
         Client.field727 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field727) / 2 : MouseHandler.MouseHandler_x;
      } else {
         if (Client.field739.method4134(96)) {
            Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
         } else if (Client.field739.method4134(97)) {
            Client.camAngleDY += (24 - Client.camAngleDY) / 2;
         } else {
            Client.camAngleDY /= 2;
         }

         if (Client.field739.method4134(98)) {
            Client.camAngleDX += (12 - Client.camAngleDX) / 2;
         } else if (Client.field739.method4134(99)) {
            Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
         } else {
            Client.camAngleDX /= 2;
         }

         Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
         Client.field727 = MouseHandler.MouseHandler_x;
      }

      Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
      Client.camAngleX += Client.camAngleDX / 2;
      if (Client.camAngleX < 128) {
         Client.camAngleX = 128;
      }

      if (Client.camAngleX > 383) {
         Client.camAngleX = 383;
      }

   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "69"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field731 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (class237.getWindowedMode() == 1) {
         class347.client.setMaxCanvasSize(765, 503);
      } else {
         class347.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(class237.getWindowedMode());
         var1.packetBuffer.writeShort(class448.canvasWidth);
         var1.packetBuffer.writeShort(WorldMapID.canvasHeight);
         Client.packetWriter.addNode(var1);
      }

   }
}
