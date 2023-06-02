import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Decimator")
public class Decimator {
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2102737717
   )
   @Export("inputRate")
   int inputRate;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -265498811
   )
   @Export("outputRate")
   int outputRate;
   @ObfuscatedName("ap")
   @Export("table")
   int[][] table;

   public Decimator(int var1, int var2) {
      if (var2 != var1) {
         int var4 = var1;
         int var5 = var2;
         if (var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.inputRate = var1;
         this.outputRate = var2;
         this.table = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.table[var7];
            double var9 = (double)var7 / (double)var1 + 6.0;
            int var11 = (int)Math.floor(1.0 + (var9 - 7.0));
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(var9 + 7.0);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * Math.PI;
               double var17 = var13;
               if (var15 < -1.0E-4 || var15 > 1.0E-4) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54 + 0.46 * Math.cos(((double)var11 - var9) * 0.2243994752564138);
               var8[var11] = (int)Math.floor(0.5 + 65536.0 * var17);
            }
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "-1120461861"
   )
   @Export("resample")
   byte[] resample(byte[] var1) {
      if (this.table != null) {
         int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         int var7;
         for(var6 = 0; var6 < var1.length; ++var6) {
            var7 = var1[var6];
            int[] var8 = this.table[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var7 * var8[var9];
            }

            var5 += this.outputRate;
            var9 = var5 / this.inputRate;
            var4 += var9;
            var5 -= var9 * this.inputRate;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var3[var6] + '耀' >> 16;
            if (var7 < -128) {
               var1[var6] = -128;
            } else if (var7 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var7;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-32"
   )
   @Export("scaleRate")
   int scaleRate(int var1) {
      if (this.table != null) {
         var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
      }

      return var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "90354327"
   )
   @Export("scalePosition")
   int scalePosition(int var1) {
      if (this.table != null) {
         var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Llp;",
      garbageValue = "860811438"
   )
   static LoginPacket[] method1086() {
      return new LoginPacket[]{LoginPacket.field3345, LoginPacket.field3342, LoginPacket.field3343, LoginPacket.field3346, LoginPacket.field3347, LoginPacket.field3344};
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "2040533931"
   )
   static final boolean method1091(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "2142390934"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = Renderable.getTileHeight(var0, var1, Clock.Client_plane) - var2;
         var0 -= class208.cameraX;
         var3 -= class152.cameraY;
         var1 -= ByteArrayPool.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[MusicPatchNode.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[MusicPatchNode.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class291.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class291.cameraYaw];
         int var8 = var0 * var7 + var6 * var1 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var4 * var3 + var5 * var1 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(Lmb;IIIB)V",
      garbageValue = "-12"
   )
   @Export("drawMinimap")
   static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
      WorldMapSectionType.playPcmPlayers();
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
         if (Client.minimapState != 2 && Client.minimapState != 5) {
            int var5 = Client.camAngleY & 2047;
            int var6 = Projectile.localPlayer.x / 32 + 48;
            int var7 = 464 - Projectile.localPlayer.y / 32;
            class33.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

            int var8;
            int var10;
            int var16;
            for(var8 = 0; var8 < Client.mapIconCount; ++var8) {
               var16 = Client.mapIconXs[var8] * 4 + 2 - Projectile.localPlayer.x / 32;
               var10 = Client.mapIconYs[var8] * 4 + 2 - Projectile.localPlayer.y / 32;
               class59.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var16 = 0; var16 < 104; ++var16) {
                  NodeDeque var14 = Client.groundItems[Clock.Client_plane][var8][var16];
                  if (var14 != null) {
                     var11 = var8 * 4 + 2 - Projectile.localPlayer.x / 32;
                     var12 = var16 * 4 + 2 - Projectile.localPlayer.y / 32;
                     class59.drawSpriteOnMinimap(var1, var2, var11, var12, class19.mapDotSprites[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < Client.npcCount; ++var8) {
               NPC var9 = Client.npcs[Client.npcIndices[var8]];
               if (var9 != null && var9.isVisible()) {
                  NPCComposition var18 = var9.definition;
                  if (var18 != null && var18.transforms != null) {
                     var18 = var18.transform();
                  }

                  if (var18 != null && var18.drawMapDot && var18.isInteractable) {
                     var11 = var9.x / 32 - Projectile.localPlayer.x / 32;
                     var12 = var9.y / 32 - Projectile.localPlayer.y / 32;
                     class59.drawSpriteOnMinimap(var1, var2, var11, var12, class19.mapDotSprites[1], var4);
                  }
               }
            }

            var8 = Players.Players_count;
            int[] var17 = Players.Players_indices;

            for(var10 = 0; var10 < var8; ++var10) {
               Player var15 = Client.players[var17[var10]];
               if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != Projectile.localPlayer) {
                  var12 = var15.x / 32 - Projectile.localPlayer.x / 32;
                  int var13 = var15.y / 32 - Projectile.localPlayer.y / 32;
                  if (var15.isFriend()) {
                     class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[3], var4);
                  } else if (Projectile.localPlayer.team != 0 && var15.team != 0 && var15.team == Projectile.localPlayer.team) {
                     class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[4], var4);
                  } else if (var15.isFriendsChatMember()) {
                     class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[5], var4);
                  } else if (var15.isClanMember()) {
                     class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[6], var4);
                  } else {
                     class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[2], var4);
                  }
               }
            }

            if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
               if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
                  NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
                  if (var19 != null) {
                     var11 = var19.x / 32 - Projectile.localPlayer.x / 32;
                     var12 = var19.y / 32 - Projectile.localPlayer.y / 32;
                     class136.worldToMinimap(var1, var2, var11, var12, LoginScreenAnimation.mapMarkerSprites[1], var4);
                  }
               }

               if (Client.hintArrowType == 2) {
                  var10 = Client.hintArrowX * 4 - class213.baseX * 256 + 2 - Projectile.localPlayer.x / 32;
                  var11 = Client.hintArrowY * 4 - class101.baseY * 256 + 2 - Projectile.localPlayer.y / 32;
                  class136.worldToMinimap(var1, var2, var10, var11, LoginScreenAnimation.mapMarkerSprites[1], var4);
               }

               if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
                  Player var20 = Client.players[Client.hintArrowPlayerIndex];
                  if (var20 != null) {
                     var11 = var20.x / 32 - Projectile.localPlayer.x / 32;
                     var12 = var20.y / 32 - Projectile.localPlayer.y / 32;
                     class136.worldToMinimap(var1, var2, var11, var12, LoginScreenAnimation.mapMarkerSprites[1], var4);
                  }
               }
            }

            if (Client.destinationX != 0) {
               var10 = Client.destinationX * 4 + 2 - Projectile.localPlayer.x / 32;
               var11 = Client.destinationY * 4 + 2 - Projectile.localPlayer.y / 32;
               class59.drawSpriteOnMinimap(var1, var2, var10, var11, LoginScreenAnimation.mapMarkerSprites[0], var4);
            }

            if (!Projectile.localPlayer.isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

         Client.field724[var3] = true;
      }
   }
}
