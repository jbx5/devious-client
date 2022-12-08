import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("aq")
   @Export("garbageCollector")
   static GarbageCollectorMXBean garbageCollector;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1523052687
   )
   @Export("id")
   int id;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1947725359
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 879345441
   )
   @Export("sourceX")
   int sourceX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 140840657
   )
   @Export("sourceY")
   int sourceY;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -519343155
   )
   @Export("sourceZ")
   int sourceZ;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1010896295
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1612153409
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1384648045
   )
   @Export("cycleEnd")
   int cycleEnd;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1239204449
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1545090087
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1220656091
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("g")
   @Export("isMoving")
   boolean isMoving = false;
   @ObfuscatedName("i")
   @Export("x")
   double x;
   @ObfuscatedName("o")
   @Export("y")
   double y;
   @ObfuscatedName("n")
   @Export("z")
   double z;
   @ObfuscatedName("k")
   @Export("speedX")
   double speedX;
   @ObfuscatedName("a")
   @Export("speedY")
   double speedY;
   @ObfuscatedName("s")
   @Export("speed")
   double speed;
   @ObfuscatedName("l")
   @Export("speedZ")
   double speedZ;
   @ObfuscatedName("t")
   @Export("accelerationZ")
   double accelerationZ;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1617416595
   )
   @Export("yaw")
   int yaw;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1125057587
   )
   @Export("pitch")
   int pitch;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1598140117
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1307859615
   )
   @Export("frameCycle")
   int frameCycle = 0;

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.id = var1;
      this.plane = var2;
      this.sourceX = var3;
      this.sourceY = var4;
      this.sourceZ = var5;
      this.cycleStart = var6;
      this.cycleEnd = var7;
      this.slope = var8;
      this.startHeight = var9;
      this.targetIndex = var10;
      this.endHeight = var11;
      this.isMoving = false;
      int var12 = ClanSettings.SpotAnimationDefinition_get(this.id).sequence;
      if (var12 != -1) {
         this.sequenceDefinition = AABB.SequenceDefinition_get(var12);
      } else {
         this.sequenceDefinition = null;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1027863856"
   )
   @Export("setDestination")
   final void setDestination(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double)(var1 - this.sourceX);
         double var7 = (double)(var2 - this.sourceY);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9;
         this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
         this.z = (double)this.sourceZ;
      }

      var5 = (double)(this.cycleEnd + 1 - var4);
      this.speedX = ((double)var1 - this.x) / var5;
      this.speedY = ((double)var2 - this.y) / var5;
      this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369);
      }

      this.accelerationZ = 2.0 * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lhh;",
      garbageValue = "-1279733976"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = ClanSettings.SpotAnimationDefinition_get(this.id);
      Model var2 = var1.getModel(this.frame);
      if (var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.pitch);
         return var2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2050320762"
   )
   @Export("advance")
   final void advance(int var1) {
      this.isMoving = true;
      this.x += (double)var1 * this.speedX;
      this.y += (double)var1 * this.speedY;
      this.z += (double)var1 * this.speedZ + (double)var1 * 0.5 * this.accelerationZ * (double)var1;
      this.speedZ += (double)var1 * this.accelerationZ;
      this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 2047;
      this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 2047;
      if (this.sequenceDefinition != null) {
         if (!this.sequenceDefinition.isCachedModelIdSet()) {
            this.frameCycle += var1;

            while(true) {
               do {
                  do {
                     if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
                        return;
                     }

                     this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
                     ++this.frame;
                  } while(this.frame < this.sequenceDefinition.frameIds.length);

                  this.frame -= this.sequenceDefinition.frameCount;
               } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

               this.frame = 0;
            }
         } else {
            this.frame += var1;
            int var2 = this.sequenceDefinition.method4024();
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lly;Ljava/lang/String;Ljava/lang/String;I)Lra;",
      garbageValue = "-1993204368"
   )
   @Export("SpriteBuffer_getIndexedSpriteByName")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      byte[] var7 = var0.takeFile(var3, var4);
      boolean var6;
      if (var7 == null) {
         var6 = false;
      } else {
         VarpDefinition.SpriteBuffer_decode(var7);
         var6 = true;
      }

      IndexedSprite var5;
      if (!var6) {
         var5 = null;
      } else {
         IndexedSprite var8 = new IndexedSprite();
         var8.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth;
         var8.height = class481.SpriteBuffer_spriteHeight;
         var8.xOffset = class481.SpriteBuffer_xOffsets[0];
         var8.yOffset = class414.SpriteBuffer_yOffsets[0];
         var8.subWidth = class11.SpriteBuffer_spriteWidths[0];
         var8.subHeight = StructComposition.SpriteBuffer_spriteHeights[0];
         var8.palette = WorldMapEvent.SpriteBuffer_spritePalette;
         var8.pixels = FloorDecoration.SpriteBuffer_pixels[0];
         class481.SpriteBuffer_xOffsets = null;
         class414.SpriteBuffer_yOffsets = null;
         class11.SpriteBuffer_spriteWidths = null;
         StructComposition.SpriteBuffer_spriteHeights = null;
         WorldMapEvent.SpriteBuffer_spritePalette = null;
         FloorDecoration.SpriteBuffer_pixels = null;
         var5 = var8;
      }

      return var5;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-2"
   )
   public static int method2105(int var0) {
      return Occluder.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2029958408"
   )
   @Export("drawEntities")
   static final void drawEntities(int var0, int var1, int var2, int var3) {
      ++Client.viewportDrawCount;
      GrandExchangeOfferUnitPriceComparator.method6640();
      UserComparator3.method2848();
      if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
         WorldMapAreaData.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
      }

      DevicePcmPlayerProvider.addNpcsToScene(true);
      class281.method5504();
      DevicePcmPlayerProvider.addNpcsToScene(false);
      class31.method454();

      for(GraphicsObject var4 = (GraphicsObject)Client.graphicsObjects.last(); var4 != null; var4 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var4.plane == class383.Client_plane && !var4.isFinished) {
            if (Client.cycle >= var4.cycleStart) {
               var4.advance(Client.graphicsCycle);
               if (var4.isFinished) {
                  var4.remove();
               } else {
                  ReflectionCheck.scene.drawEntity(var4.plane, var4.x, var4.y, var4.z, 60, var4, 0, -1L, false);
               }
            }
         } else {
            var4.remove();
         }
      }

      class143.setViewportShape(var0, var1, var2, var3, true);
      var0 = Client.viewportOffsetX;
      var1 = Client.viewportOffsetY;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
      int var35 = Client.camAngleX;
      if (Client.field604 / 256 > var35) {
         var35 = Client.field604 / 256;
      }

      if (Client.field773[4] && Client.field775[4] + 128 > var35) {
         var35 = Client.field775[4] + 128;
      }

      int var5 = Client.camAngleY & 2047;
      int var6 = class29.oculusOrbFocalPointX;
      int var7 = ApproximateRouteStrategy.field498;
      int var8 = class14.oculusOrbFocalPointY;
      int var9 = var35 * 3 + 600;
      int var12 = var3 - 334;
      if (var12 < 0) {
         var12 = 0;
      } else if (var12 > 100) {
         var12 = 100;
      }

      int var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight;
      int var11 = var13 * var9 / 256;
      var12 = 2048 - var35 & 2047;
      var13 = 2048 - var5 & 2047;
      int var14 = 0;
      int var15 = 0;
      int var16 = var11;
      int var17;
      int var18;
      int var19;
      if (var12 != 0) {
         var17 = Rasterizer3D.Rasterizer3D_sine[var12];
         var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
         var19 = var18 * var15 - var11 * var17 >> 16;
         var16 = var17 * var15 + var18 * var11 >> 16;
         var15 = var19;
      }

      if (var13 != 0) {
         var17 = Rasterizer3D.Rasterizer3D_sine[var13];
         var18 = Rasterizer3D.Rasterizer3D_cosine[var13];
         var19 = var16 * var17 + var14 * var18 >> 16;
         var16 = var18 * var16 - var17 * var14 >> 16;
         var14 = var19;
      }

      if (Client.isCameraLocked) {
         class102.field1367 = var6 - var14;
         Frames.field2616 = var7 - var15;
         MusicPatchNode2.field3342 = var8 - var16;
         NPCComposition.field2067 = var35;
         class101.field1365 = var5;
      } else {
         class145.cameraX = var6 - var14;
         class414.cameraY = var7 - var15;
         ClanChannel.cameraZ = var8 - var16;
         class97.cameraPitch = var35;
         class128.cameraYaw = var5;
      }

      if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class29.oculusOrbFocalPointX >> 7 != class155.localPlayer.x >> 7 || class14.oculusOrbFocalPointY >> 7 != class155.localPlayer.y >> 7)) {
         var17 = class155.localPlayer.plane;
         var18 = class154.baseX * 64 + (class29.oculusOrbFocalPointX >> 7);
         var19 = class365.baseY * 64 + (class14.oculusOrbFocalPointY >> 7);
         PacketBufferNode var20 = class136.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher);
         var20.packetBuffer.writeShortLE(var19);
         var20.packetBuffer.writeByteAdd(var17);
         var20.packetBuffer.writeShortAdd(var18);
         var20.packetBuffer.writeIntME(Client.field789);
         Client.packetWriter.addNode(var20);
      }

      if (!Client.isCameraLocked) {
         var11 = class163.method3424();
      } else {
         var11 = SecureRandomFuture.method2118();
      }

      var12 = class145.cameraX;
      var13 = class414.cameraY;
      var14 = ClanChannel.cameraZ;
      var15 = class97.cameraPitch;
      var16 = class128.cameraYaw;

      for(var17 = 0; var17 < 5; ++var17) {
         if (Client.field773[var17]) {
            var18 = (int)(Math.random() * (double)(Client.field803[var17] * 2 + 1) - (double)Client.field803[var17] + Math.sin((double)Client.field617[var17] * ((double)Client.field776[var17] / 100.0)) * (double)Client.field775[var17]);
            if (var17 == 0) {
               class145.cameraX += var18;
            }

            if (var17 == 1) {
               class414.cameraY += var18;
            }

            if (var17 == 2) {
               ClanChannel.cameraZ += var18;
            }

            if (var17 == 3) {
               class128.cameraYaw = var18 + class128.cameraYaw & 2047;
            }

            if (var17 == 4) {
               class97.cameraPitch += var18;
               if (class97.cameraPitch < 128) {
                  class97.cameraPitch = 128;
               }

               if (class97.cameraPitch > 383) {
                  class97.cameraPitch = 383;
               }
            }
         }
      }

      var17 = MouseHandler.MouseHandler_x;
      var18 = MouseHandler.MouseHandler_y;
      if (MouseHandler.MouseHandler_lastButton != 0) {
         var17 = MouseHandler.MouseHandler_lastPressedX;
         var18 = MouseHandler.MouseHandler_lastPressedY;
      }

      if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
         var19 = var17 - var0;
         int var36 = var18 - var1;
         ViewportMouse.ViewportMouse_x = var19;
         ViewportMouse.ViewportMouse_y = var36;
         ViewportMouse.ViewportMouse_isInViewport = true;
         ViewportMouse.ViewportMouse_entityCount = 0;
         ViewportMouse.ViewportMouse_false0 = false;
      } else {
         class17.method252();
      }

      Client.playPcmPlayers();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      Client.playPcmPlayers();
      var19 = Rasterizer3D.Rasterizer3D_zoom;
      Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
      ReflectionCheck.scene.draw(class145.cameraX, class414.cameraY, ClanChannel.cameraZ, class97.cameraPitch, class128.cameraYaw, var11);
      Rasterizer3D.Rasterizer3D_zoom = var19;
      Client.playPcmPlayers();
      ReflectionCheck.scene.clearTempGameObjects();
      Client.overheadTextCount = 0;
      boolean var40 = false;
      int var21 = -1;
      int var22 = -1;
      int var23 = Players.Players_count;
      int[] var24 = Players.Players_indices;

      int var25;
      for(var25 = 0; var25 < var23 + Client.npcCount; ++var25) {
         Object var38;
         if (var25 < var23) {
            var38 = Client.players[var24[var25]];
            if (var24[var25] == Client.combatTargetPlayerIndex) {
               var40 = true;
               var21 = var25;
               continue;
            }

            if (var38 == class155.localPlayer) {
               var22 = var25;
               continue;
            }
         } else {
            var38 = Client.npcs[Client.npcIndices[var25 - var23]];
         }

         class128.drawActor2d((Actor)var38, var25, var0, var1, var2, var3);
      }

      if (Client.renderSelf && var22 != -1) {
         class128.drawActor2d(class155.localPlayer, var22, var0, var1, var2, var3);
      }

      if (var40) {
         class128.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3);
      }

      for(var25 = 0; var25 < Client.overheadTextCount; ++var25) {
         int var26 = Client.overheadTextXs[var25];
         int var27 = Client.overheadTextYs[var25];
         int var28 = Client.overheadTextXOffsets[var25];
         int var29 = Client.overheadTextAscents[var25];
         boolean var30 = true;

         while(var30) {
            var30 = false;

            for(int var37 = 0; var37 < var25; ++var37) {
               if (var27 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var27 - var29 < Client.overheadTextYs[var37] + 2 && var26 - var28 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var28 + var26 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var27) {
                  var27 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37];
                  var30 = true;
               }
            }
         }

         Client.viewportTempX = Client.overheadTextXs[var25];
         Client.viewportTempY = Client.overheadTextYs[var25] = var27;
         String var31 = Client.overheadText[var25];
         if (Client.chatEffects == 0) {
            int var32 = 16776960;
            if (Client.overheadTextColors[var25] < 6) {
               var32 = Client.field741[Client.overheadTextColors[var25]];
            }

            if (Client.overheadTextColors[var25] == 6) {
               var32 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.overheadTextColors[var25] == 7) {
               var32 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.overheadTextColors[var25] == 8) {
               var32 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
            }

            int var33;
            if (Client.overheadTextColors[var25] == 9) {
               var33 = 150 - Client.overheadTextCyclesRemaining[var25];
               if (var33 < 50) {
                  var32 = var33 * 1280 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16776960 - (var33 - 50) * 327680;
               } else if (var33 < 150) {
                  var32 = (var33 - 100) * 5 + '\uff00';
               }
            }

            if (Client.overheadTextColors[var25] == 10) {
               var33 = 150 - Client.overheadTextCyclesRemaining[var25];
               if (var33 < 50) {
                  var32 = var33 * 5 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16711935 - (var33 - 50) * 327680;
               } else if (var33 < 150) {
                  var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
               }
            }

            if (Client.overheadTextColors[var25] == 11) {
               var33 = 150 - Client.overheadTextCyclesRemaining[var25];
               if (var33 < 50) {
                  var32 = 16777215 - var33 * 327685;
               } else if (var33 < 100) {
                  var32 = (var33 - 50) * 327685 + '\uff00';
               } else if (var33 < 150) {
                  var32 = 16777215 - (var33 - 100) * 327680;
               }
            }

            if (Client.overheadTextEffects[var25] == 0) {
               class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0);
            }

            if (Client.overheadTextEffects[var25] == 1) {
               class146.fontBold12.drawCenteredWave(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var25] == 2) {
               class146.fontBold12.drawCenteredWave2(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var25] == 3) {
               class146.fontBold12.drawCenteredShake(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var25]);
            }

            if (Client.overheadTextEffects[var25] == 4) {
               var33 = (150 - Client.overheadTextCyclesRemaining[var25]) * (class146.fontBold12.stringWidth(var31) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               class146.fontBold12.draw(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var25] == 5) {
               var33 = 150 - Client.overheadTextCyclesRemaining[var25];
               int var34 = 0;
               if (var33 < 25) {
                  var34 = var33 - 25;
               } else if (var33 > 125) {
                  var34 = var33 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class146.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

      RouteStrategy.method4180(var0, var1);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
      CollisionMap.method4176();
      class145.cameraX = var12;
      class414.cameraY = var13;
      ClanChannel.cameraZ = var14;
      class97.cameraPitch = var15;
      class128.cameraYaw = var16;
      if (Client.isLoading) {
         byte var39 = 0;
         var21 = var39 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
         if (var21 == 0) {
            Client.isLoading = false;
         }
      }

      if (Client.isLoading) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         SoundSystem.drawLoadingMessage("Loading - please wait.", false);
      }

   }
}
