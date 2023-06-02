import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("Skeleton")
public class Skeleton extends Node {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -322801287
   )
   @Export("id")
   int id;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2025739055
   )
   @Export("count")
   int count;
   @ObfuscatedName("ak")
   @Export("transformTypes")
   int[] transformTypes;
   @ObfuscatedName("ae")
   @Export("labels")
   int[][] labels;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lid;"
   )
   class226 field2543;

   public Skeleton(int var1, byte[] var2) {
      this.id = var1;
      Buffer var3 = new Buffer(var2);
      this.count = var3.readUnsignedByte();
      this.transformTypes = new int[this.count];
      this.labels = new int[this.count][];

      int var4;
      for(var4 = 0; var4 < this.count; ++var4) {
         this.transformTypes[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         this.labels[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         for(int var5 = 0; var5 < this.labels[var4].length; ++var5) {
            this.labels[var4][var5] = var3.readUnsignedByte();
         }
      }

      if (var3.offset < var3.array.length) {
         var4 = var3.readUnsignedShort();
         if (var4 > 0) {
            this.field2543 = new class226(var3, var4);
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "61"
   )
   public int method4509() {
      return this.count;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Lid;",
      garbageValue = "208942676"
   )
   public class226 method4507() {
      return this.field2543;
   }

   @ObfuscatedName("an")
   static final void method4505(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1572302747"
   )
   @Export("drawEntities")
   static final void drawEntities(int var0, int var1, int var2, int var3) {
      ++Client.viewportDrawCount;
      if (Projectile.localPlayer.x >> 7 == Client.destinationX && Projectile.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

      if (Client.field751) {
         HealthBarUpdate.addPlayerToScene(Projectile.localPlayer, false);
      }

      if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
         HealthBarUpdate.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
      }

      class481.addNpcsToScene(true);
      class336.method6569();
      class481.addNpcsToScene(false);

      int var6;
      for(Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
         if (var4.plane == Clock.Client_plane && Client.cycle <= var4.cycleEnd) {
            if (Client.cycle >= var4.cycleStart) {
               if (var4.targetIndex > 0) {
                  NPC var23 = Client.npcs[var4.targetIndex - 1];
                  if (var23 != null && var23.x >= 0 && var23.x < 13312 && var23.y >= 0 && var23.y < 13312) {
                     var4.setDestination(var23.x, var23.y, Renderable.getTileHeight(var23.x, var23.y, var4.plane) - var4.endHeight, Client.cycle);
                  }
               }

               if (var4.targetIndex < 0) {
                  var6 = -var4.targetIndex - 1;
                  Player var25;
                  if (var6 == Client.localPlayerIndex) {
                     var25 = Projectile.localPlayer;
                  } else {
                     var25 = Client.players[var6];
                  }

                  if (var25 != null && var25.x >= 0 && var25.x < 13312 && var25.y >= 0 && var25.y < 13312) {
                     var4.setDestination(var25.x, var25.y, Renderable.getTileHeight(var25.x, var25.y, var4.plane) - var4.endHeight, Client.cycle);
                  }
               }

               var4.advance(Client.graphicsCycle);
               class36.scene.drawEntity(Clock.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
            }
         } else {
            var4.remove();
         }
      }

      for(GraphicsObject var24 = (GraphicsObject)Client.graphicsObjects.last(); var24 != null; var24 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var24.plane == Clock.Client_plane && !var24.isFinished) {
            if (Client.cycle >= var24.cycleStart) {
               var24.advance(Client.graphicsCycle);
               if (var24.isFinished) {
                  var24.remove();
               } else {
                  class36.scene.drawEntity(var24.plane, var24.x, var24.y, var24.z, 60, var24, 0, -1L, false);
               }
            }
         } else {
            var24.remove();
         }
      }

      WorldMapDecorationType.setViewportShape(var0, var1, var2, var3, true);
      var0 = Client.viewportOffsetX;
      var1 = Client.viewportOffsetY;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
      Rasterizer3D.method4382();
      Rasterizer2D.method9269();
      int var21 = Client.camAngleX;
      if (Client.field605 / 256 > var21) {
         var21 = Client.field605 / 256;
      }

      if (Client.field771[4] && Client.field695[4] + 128 > var21) {
         var21 = Client.field695[4] + 128;
      }

      int var5 = Client.camAngleY & 2047;
      var6 = ModeWhere.oculusOrbFocalPointX;
      int var7 = Login.field917;
      int var8 = GrandExchangeEvents.oculusOrbFocalPointY;
      int var9 = class101.method2635(var21);
      int var11 = var3 - 334;
      if (var11 < 0) {
         var11 = 0;
      } else if (var11 > 100) {
         var11 = 100;
      }

      int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
      int var10 = var12 * var9 / 256;
      var11 = 2048 - var21 & 2047;
      var12 = 2048 - var5 & 2047;
      int var13 = 0;
      int var14 = 0;
      int var15 = var10;
      int var16;
      int var17;
      int var18;
      if (var11 != 0) {
         var16 = Rasterizer3D.Rasterizer3D_sine[var11];
         var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
         var18 = var14 * var17 - var16 * var10 >> 16;
         var15 = var16 * var14 + var10 * var17 >> 16;
         var14 = var18;
      }

      if (var12 != 0) {
         var16 = Rasterizer3D.Rasterizer3D_sine[var12];
         var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
         var18 = var13 * var17 + var15 * var16 >> 16;
         var15 = var17 * var15 - var16 * var13 >> 16;
         var13 = var18;
      }

      if (Client.isCameraLocked) {
         UserComparator8.field1415 = var6 - var13;
         WallDecoration.field2828 = var7 - var14;
         Clock.field1883 = var8 - var15;
         Clock.field1884 = var21;
         class53.field368 = var5;
      } else {
         class208.cameraX = var6 - var13;
         class152.cameraY = var7 - var14;
         ByteArrayPool.cameraZ = var8 - var15;
         MusicPatchNode.cameraPitch = var21;
         class291.cameraYaw = var5;
      }

      if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ModeWhere.oculusOrbFocalPointX >> 7 != Projectile.localPlayer.x >> 7 || GrandExchangeEvents.oculusOrbFocalPointY >> 7 != Projectile.localPlayer.y >> 7)) {
         var16 = Projectile.localPlayer.plane;
         var17 = class213.baseX * 64 + (ModeWhere.oculusOrbFocalPointX >> 7);
         var18 = class101.baseY * 64 + (GrandExchangeEvents.oculusOrbFocalPointY >> 7);
         PacketBufferNode var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher);
         var19.packetBuffer.writeShortLE(var18);
         var19.packetBuffer.writeByte(var16);
         var19.packetBuffer.writeShortAddLE(var17);
         var19.packetBuffer.writeIntIME(Client.field601);
         Client.packetWriter.addNode(var19);
      }

      if (!Client.isCameraLocked) {
         var10 = class17.method269();
      } else {
         if (class10.clientPreferences.method2434()) {
            var11 = Clock.Client_plane;
         } else {
            var12 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane);
            if (var12 - class152.cameraY < 800 && (Tiles.Tiles_renderFlags[Clock.Client_plane][class208.cameraX >> 7][ByteArrayPool.cameraZ >> 7] & 4) != 0) {
               var11 = Clock.Client_plane;
            } else {
               var11 = 3;
            }
         }

         var10 = var11;
      }

      var11 = class208.cameraX;
      var12 = class152.cameraY;
      var13 = ByteArrayPool.cameraZ;
      var14 = MusicPatchNode.cameraPitch;
      var15 = class291.cameraYaw;

      for(var16 = 0; var16 < 5; ++var16) {
         if (Client.field771[var16]) {
            var17 = (int)(Math.random() * (double)(Client.field772[var16] * 2 + 1) - (double)Client.field772[var16] + Math.sin((double)Client.field763[var16] * ((double)Client.field774[var16] / 100.0)) * (double)Client.field695[var16]);
            if (var16 == 0) {
               class208.cameraX += var17;
            }

            if (var16 == 1) {
               class152.cameraY += var17;
            }

            if (var16 == 2) {
               ByteArrayPool.cameraZ += var17;
            }

            if (var16 == 3) {
               class291.cameraYaw = var17 + class291.cameraYaw & 2047;
            }

            if (var16 == 4) {
               MusicPatchNode.cameraPitch += var17;
               if (MusicPatchNode.cameraPitch < 128) {
                  MusicPatchNode.cameraPitch = 128;
               }

               if (MusicPatchNode.cameraPitch > 383) {
                  MusicPatchNode.cameraPitch = 383;
               }
            }
         }
      }

      var16 = MouseHandler.MouseHandler_x;
      var17 = MouseHandler.MouseHandler_y;
      if (MouseHandler.MouseHandler_lastButton != 0) {
         var16 = MouseHandler.MouseHandler_lastPressedX;
         var17 = MouseHandler.MouseHandler_lastPressedY;
      }

      if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
         var18 = var16 - var0;
         int var22 = var17 - var1;
         ViewportMouse.ViewportMouse_x = var18;
         ViewportMouse.ViewportMouse_y = var22;
         ViewportMouse.ViewportMouse_isInViewport = true;
         ViewportMouse.ViewportMouse_entityCount = 0;
         ViewportMouse.ViewportMouse_false0 = false;
      } else {
         ViewportMouse.ViewportMouse_isInViewport = false;
         ViewportMouse.ViewportMouse_entityCount = 0;
      }

      WorldMapSectionType.playPcmPlayers();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      WorldMapSectionType.playPcmPlayers();
      var18 = Rasterizer3D.get3dZoom();
      Rasterizer3D.method4416(class347.client.field209);
      Rasterizer3D.clips.field2796 = Client.viewportZoom;
      class36.scene.draw(class208.cameraX, class152.cameraY, ByteArrayPool.cameraZ, MusicPatchNode.cameraPitch, class291.cameraYaw, var10);
      Rasterizer3D.method4416(false);
      if (Client.renderSelf) {
         Rasterizer2D.method9270();
      }

      Rasterizer3D.clips.field2796 = var18;
      WorldMapSectionType.playPcmPlayers();
      class36.scene.clearTempGameObjects();
      class152.method3199(var0, var1, var2, var3);
      if (Client.hintArrowType == 2) {
         Decimator.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class213.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class101.baseY * 64 << 7), Client.hintArrowHeight * 4);
         if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
            ReflectionCheck.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
         }
      }

      ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
      ScriptEvent.method2256(var0, var1, var2, var3);
      class208.cameraX = var11;
      class152.cameraY = var12;
      ByteArrayPool.cameraZ = var13;
      MusicPatchNode.cameraPitch = var14;
      class291.cameraYaw = var15;
      if (Client.isLoading) {
         int var20 = 0;
         var20 = var20 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
         if (var20 == 0) {
            Client.isLoading = false;
         }
      }

      if (Client.isLoading) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         AABB.drawLoadingMessage("Loading - please wait.", false);
      }

   }
}
