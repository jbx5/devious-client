import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Decimator")
public class Decimator {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2021266139
   )
   @Export("inputRate")
   int inputRate;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -2101247493
   )
   @Export("outputRate")
   int outputRate;
   @ObfuscatedName("ab")
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
            int var11 = (int)Math.floor(var9 - 7.0 + 1.0);
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(7.0 + var9);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * Math.PI;
               double var17 = var13;
               if (var15 < -1.0E-4 || var15 > 1.0E-4) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double)var11 - var9));
               var8[var11] = (int)Math.floor(0.5 + var17 * 65536.0);
            }
         }

      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "33076536"
   )
   @Export("resample")
   byte[] resample(byte[] var1) {
      if (this.table != null) {
         int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
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
               var3[var4 + var9] += var8[var9] * var7;
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
      garbageValue = "45"
   )
   @Export("scaleRate")
   int scaleRate(int var1) {
      if (this.table != null) {
         var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
      }

      return var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2001424421"
   )
   @Export("scalePosition")
   int scalePosition(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
      }

      return var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1509749765"
   )
   public static int method1136(int var0) {
      return 255 - (var0 & 255);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lon;Lon;B)V",
      garbageValue = "-96"
   )
   static void method1127(Font var0, Font var1) {
      int var4;
      int var5;
      if (class476.worldSelectBackSprites == null) {
         Archive var3 = class452.archive8;
         SpritePixels[] var2;
         if (!var3.isValidFileName("sl_back", "")) {
            var2 = null;
         } else {
            var4 = var3.getGroupId("sl_back");
            var5 = var3.getFileId(var4, "");
            var2 = UserComparator3.method2923(var3, var4, var5);
         }

         class476.worldSelectBackSprites = var2;
      }

      if (class16.worldSelectFlagSprites == null) {
         class16.worldSelectFlagSprites = class314.method6353(class452.archive8, "sl_flags", "");
      }

      if (DevicePcmPlayerProvider.worldSelectArrows == null) {
         DevicePcmPlayerProvider.worldSelectArrows = class314.method6353(class452.archive8, "sl_arrows", "");
      }

      if (World.worldSelectStars == null) {
         World.worldSelectStars = class314.method6353(class452.archive8, "sl_stars", "");
      }

      if (PlayerType.worldSelectLeftSprite == null) {
         PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "");
      }

      if (class13.worldSelectRightSprite == null) {
         class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "");
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
      var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
      if (World.worldSelectStars != null) {
         World.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
         var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
         World.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
         var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
      }

      if (DevicePcmPlayerProvider.worldSelectArrows != null) {
         int var22 = Login.xPadding + 280;
         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
            DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var22, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var22, 4);
         }

         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
            DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var22 + 15, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var22 + 15, 4);
         }

         var0.draw("World", var22 + 32, 17, 16777215, -1);
         int var23 = Login.xPadding + 390;
         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
            DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var23, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var23, 4);
         }

         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
            DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var23 + 15, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var23 + 15, 4);
         }

         var0.draw("Players", var23 + 32, 17, 16777215, -1);
         var4 = Login.xPadding + 500;
         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
            DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var4, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var4, 4);
         }

         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
            DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var4 + 15, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var4 + 15, 4);
         }

         var0.draw("Location", var4 + 32, 17, 16777215, -1);
         var5 = Login.xPadding + 610;
         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
            DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var5, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var5, 4);
         }

         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
            DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var5 + 15, 4);
         } else {
            DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var5 + 15, 4);
         }

         var0.draw("Type", var5 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
      var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
      Login.hoveredWorldIndex = -1;
      if (class476.worldSelectBackSprites != null) {
         byte var26 = 88;
         byte var27 = 19;
         var4 = 765 / (var26 + 1) - 1;
         var5 = 480 / (var27 + 1);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if (var5 * (var4 - 1) >= World.World_count) {
               --var4;
            }

            if (var4 * (var5 - 1) >= World.World_count) {
               --var5;
            }

            if (var4 * (var5 - 1) >= World.World_count) {
               --var5;
            }
         } while(var5 != var6 || var7 != var4);

         var6 = (765 - var26 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var27) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (var5 + World.World_count - 1) / var5;
         Login.worldSelectPagesCount = var10 - var4;
         if (PlayerType.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
            PlayerType.worldSelectLeftSprite.drawAt(8, class262.canvasHeight / 2 - PlayerType.worldSelectLeftSprite.subHeight / 2);
         }

         if (class13.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
            class13.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class13.worldSelectRightSprite.subWidth - 8, class262.canvasHeight / 2 - class13.worldSelectRightSprite.subHeight / 2);
         }

         int var11 = var9 + 23;
         int var12 = var8 + Login.xPadding;
         int var13 = 0;
         boolean var14 = false;
         int var15 = Login.worldSelectPage;

         int var16;
         for(var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
            World var17 = class31.World_worlds[var16];
            boolean var18 = true;
            String var19 = Integer.toString(var17.population);
            if (var17.population == -1) {
               var19 = "OFF";
               var18 = false;
            } else if (var17.population > 1980) {
               var19 = "FULL";
               var18 = false;
            }

            class103 var20 = null;
            int var21 = 0;
            if (var17.isBeta()) {
               var20 = var17.isMembersOnly() ? class103.field1352 : class103.field1354;
            } else if (var17.isDeadman()) {
               var20 = var17.isMembersOnly() ? class103.field1363 : class103.field1362;
            } else if (var17.method1806()) {
               var21 = 16711680;
               var20 = var17.isMembersOnly() ? class103.field1353 : class103.field1350;
            } else if (var17.method1780()) {
               var20 = var17.isMembersOnly() ? class103.field1364 : class103.field1355;
            } else if (var17.isPvp()) {
               var20 = var17.isMembersOnly() ? class103.field1351 : class103.field1359;
            } else if (var17.method1781()) {
               var20 = var17.isMembersOnly() ? class103.field1356 : class103.field1358;
            } else if (var17.method1782()) {
               var20 = var17.isMembersOnly() ? class103.field1361 : class103.field1360;
            }

            if (var20 == null || var20.field1348 >= class476.worldSelectBackSprites.length) {
               var20 = var17.isMembersOnly() ? class103.field1349 : class103.field1357;
            }

            if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
               Login.hoveredWorldIndex = var16;
               class476.worldSelectBackSprites[var20.field1348].drawTransOverlayAt(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               class476.worldSelectBackSprites[var20.field1348].drawAt(var12, var11);
            }

            if (class16.worldSelectFlagSprites != null) {
               class16.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
            }

            var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
            var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
            var11 = var11 + var7 + var27;
            ++var13;
            if (var13 >= var5) {
               var11 = var9 + 23;
               var12 = var12 + var26 + var6;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.stringWidth(class31.World_worlds[Login.hoveredWorldIndex].activity) + 6;
            int var24 = var1.ascent + 8;
            int var25 = MouseHandler.MouseHandler_y + 25;
            if (var24 + var25 > 480) {
               var25 = MouseHandler.MouseHandler_y - 25 - var24;
            }

            Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
            Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
            var1.drawCentered(class31.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
         }
      }

      RouteStrategy.rasterProvider.drawFull(0, 0);
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-51"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field713 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (GrandExchangeOfferNameComparator.getWindowedMode() == 1) {
         ScriptFrame.client.setMaxCanvasSize(765, 503);
      } else {
         ScriptFrame.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         class1.method11();
      }

   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "101"
   )
   static final void method1135(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class28.field164 || class425.field4671 != var1) {
         class28.field164 = var0;
         class425.field4671 = var1;
         class138.updateGameState(25);
         WorldMapDecoration.drawLoadingMessage("Loading - please wait.", true);
         int var3 = WorldMapData_0.baseX * 64;
         int var4 = GameObject.baseY * 64;
         WorldMapData_0.baseX = (var0 - 6) * 8;
         GameObject.baseY = (var1 - 6) * 8;
         int var5 = WorldMapData_0.baseX * 64 - var3;
         int var6 = GameObject.baseY * 64 - var4;
         var3 = WorldMapData_0.baseX * 64;
         var4 = GameObject.baseY * 64;

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
         for(int var13 = var20; var8 != var13; var13 += var21) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var5 + var13;
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
         class36.cameraX -= var5 << 7;
         class297.cameraZ -= var6 << 7;
         class33.oculusOrbFocalPointX -= var5 << 7;
         class144.oculusOrbFocalPointY -= var6 << 7;
         Client.field729 = -1;
         Client.graphicsObjects.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].clear();
         }

      }
   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      descriptor = "(Ldv;IILiu;I)V",
      garbageValue = "-1796483670"
   )
   static final void method1124(Player var0, int var1, int var2, class210 var3) {
      int var4 = var0.pathX[0];
      int var5 = var0.pathY[0];
      int var6 = var0.transformedSize();
      if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var9 = var0.transformedSize();
            Client.field786.approxDestinationX = var1;
            Client.field786.approxDestinationY = var2;
            Client.field786.approxDestinationSizeX = 1;
            Client.field786.approxDestinationSizeY = 1;
            ApproximateRouteStrategy var10 = Client.field786;
            int var11 = class144.method3246(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field787, Client.field788);
            if (var11 >= 1) {
               for(int var12 = 0; var12 < var11 - 1; ++var12) {
                  var0.method2302(Client.field787[var12], Client.field788[var12], var3);
               }

            }
         }
      }
   }
}
