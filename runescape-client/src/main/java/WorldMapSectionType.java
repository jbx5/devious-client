import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   @Export("WORLDMAPSECTIONTYPE0")
   WORLDMAPSECTIONTYPE0(0, (byte)0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   @Export("WORLDMAPSECTIONTYPE1")
   WORLDMAPSECTIONTYPE1(3, (byte)1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   @Export("WORLDMAPSECTIONTYPE2")
   WORLDMAPSECTIONTYPE2(1, (byte)2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   @Export("WORLDMAPSECTIONTYPE3")
   WORLDMAPSECTIONTYPE3(2, (byte)3);

   @ObfuscatedName("sk")
   @Export("ClanChat_inClanChat")
   static boolean ClanChat_inClanChat;
   @ObfuscatedName("tr")
   @ObfuscatedSignature(
      descriptor = "Lak;"
   )
   @Export("pcmPlayer1")
   static PcmPlayer pcmPlayer1;
   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "[Lrs;"
   )
   @Export("headIconHintSprites")
   static SpritePixels[] headIconHintSprites;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 94095455
   )
   @Export("type")
   final int type;
   @ObfuscatedName("j")
   @Export("id")
   final byte id;

   WorldMapSectionType(int var3, byte var4) {
      this.type = var3;
      this.id = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I[BLoi;I)V",
      garbageValue = "-1305968821"
   )
   static void method5296(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 0;
      var3.key = (long)var0;
      var3.data = var1;
      var3.archiveDisk = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class288.method5590();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;I)I",
      garbageValue = "1342224866"
   )
   static int method5295(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = Login.field941;

      int var4;
      String var5;
      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      var3 = Login.field942;

      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var1.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      var3 = Login.field902;

      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      return var2;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lnv;Lnv;I)V",
      garbageValue = "2131724772"
   )
   static void method5297(Font var0, Font var1) {
      int var4;
      int var5;
      if (class491.worldSelectBackSprites == null) {
         Archive var3 = WorldMapEvent.archive8;
         var4 = var3.getGroupId("sl_back");
         var5 = var3.getFileId(var4, "");
         SpritePixels[] var2 = AABB.method4629(var3, var4, var5);
         class491.worldSelectBackSprites = var2;
      }

      if (class307.worldSelectFlagSprites == null) {
         class307.worldSelectFlagSprites = class125.method3066(WorldMapEvent.archive8, "sl_flags", "");
      }

      if (class391.worldSelectArrows == null) {
         class391.worldSelectArrows = class125.method3066(WorldMapEvent.archive8, "sl_arrows", "");
      }

      if (KeyHandler.worldSelectStars == null) {
         KeyHandler.worldSelectStars = class125.method3066(WorldMapEvent.archive8, "sl_stars", "");
      }

      if (StudioGame.worldSelectLeftSprite == null) {
         StudioGame.worldSelectLeftSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "leftarrow", "");
      }

      if (class205.worldSelectRightSprite == null) {
         class205.worldSelectRightSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "rightarrow", "");
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
      var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
      if (KeyHandler.worldSelectStars != null) {
         KeyHandler.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
         var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
         KeyHandler.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
         var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
      }

      if (class391.worldSelectArrows != null) {
         int var22 = Login.xPadding + 280;
         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
            class391.worldSelectArrows[2].drawAt(var22, 4);
         } else {
            class391.worldSelectArrows[0].drawAt(var22, 4);
         }

         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
            class391.worldSelectArrows[3].drawAt(var22 + 15, 4);
         } else {
            class391.worldSelectArrows[1].drawAt(var22 + 15, 4);
         }

         var0.draw("World", var22 + 32, 17, 16777215, -1);
         int var23 = Login.xPadding + 390;
         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
            class391.worldSelectArrows[2].drawAt(var23, 4);
         } else {
            class391.worldSelectArrows[0].drawAt(var23, 4);
         }

         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
            class391.worldSelectArrows[3].drawAt(var23 + 15, 4);
         } else {
            class391.worldSelectArrows[1].drawAt(var23 + 15, 4);
         }

         var0.draw("Players", var23 + 32, 17, 16777215, -1);
         var4 = Login.xPadding + 500;
         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
            class391.worldSelectArrows[2].drawAt(var4, 4);
         } else {
            class391.worldSelectArrows[0].drawAt(var4, 4);
         }

         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
            class391.worldSelectArrows[3].drawAt(var4 + 15, 4);
         } else {
            class391.worldSelectArrows[1].drawAt(var4 + 15, 4);
         }

         var0.draw("Location", var4 + 32, 17, 16777215, -1);
         var5 = Login.xPadding + 610;
         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
            class391.worldSelectArrows[2].drawAt(var5, 4);
         } else {
            class391.worldSelectArrows[0].drawAt(var5, 4);
         }

         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
            class391.worldSelectArrows[3].drawAt(var5 + 15, 4);
         } else {
            class391.worldSelectArrows[1].drawAt(var5 + 15, 4);
         }

         var0.draw("Type", var5 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
      var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
      Login.hoveredWorldIndex = -1;
      if (class491.worldSelectBackSprites != null) {
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
         } while(var6 != var5 || var7 != var4);

         var6 = (765 - var26 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var27 * var5) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (var5 + World.World_count - 1) / var5;
         Login.worldSelectPagesCount = var10 - var4;
         if (StudioGame.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
            StudioGame.worldSelectLeftSprite.drawAt(8, class127.canvasHeight / 2 - StudioGame.worldSelectLeftSprite.subHeight / 2);
         }

         if (class205.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
            class205.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class205.worldSelectRightSprite.subWidth - 8, class127.canvasHeight / 2 - class205.worldSelectRightSprite.subHeight / 2);
         }

         int var11 = var9 + 23;
         int var12 = var8 + Login.xPadding;
         int var13 = 0;
         boolean var14 = false;
         int var15 = Login.worldSelectPage;

         int var16;
         for(var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
            World var17 = class88.World_worlds[var16];
            boolean var18 = true;
            String var19 = Integer.toString(var17.population);
            if (var17.population == -1) {
               var19 = "OFF";
               var18 = false;
            } else if (var17.population > 1980) {
               var19 = "FULL";
               var18 = false;
            }

            int var20 = -1;
            int var21 = 0;
            if (var17.isBeta()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1361.field1368;
               } else {
                  var20 = class103.field1360.field1368;
               }
            } else if (var17.isDeadman()) {
               var21 = 16711680;
               if (var17.isMembersOnly()) {
                  var20 = class103.field1359.field1368;
               } else {
                  var20 = class103.field1358.field1368;
               }
            } else if (var17.method1774()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1363.field1368;
               } else {
                  var20 = class103.field1362.field1368;
               }
            } else if (var17.isPvp()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1354.field1368;
               } else {
                  var20 = class103.field1356.field1368;
               }
            } else if (var17.method1781()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1365.field1368;
               } else {
                  var20 = class103.field1364.field1368;
               }
            } else if (var17.method1782()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1367.field1368;
               } else {
                  var20 = class103.field1355.field1368;
               }
            }

            if (var20 == -1 || var20 >= class491.worldSelectBackSprites.length) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1371.field1368;
               } else {
                  var20 = class103.field1370.field1368;
               }
            }

            if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
               Login.hoveredWorldIndex = var16;
               class491.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               class491.worldSelectBackSprites[var20].drawAt(var12, var11);
            }

            if (class307.worldSelectFlagSprites != null) {
               class307.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
            }

            var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
            var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
            var11 = var11 + var27 + var7;
            ++var13;
            if (var13 >= var5) {
               var11 = var9 + 23;
               var12 = var12 + var6 + var26;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.stringWidth(class88.World_worlds[Login.hoveredWorldIndex].activity) + 6;
            int var24 = var1.ascent + 8;
            int var25 = MouseHandler.MouseHandler_y + 25;
            if (var25 + var24 > 480) {
               var25 = MouseHandler.MouseHandler_y - 25 - var24;
            }

            Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
            Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
            var1.drawCentered(class88.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
         }
      }

      KeyHandler.rasterProvider.drawFull(0, 0);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "-67"
   )
   static int method5294(int var0, Script var1, boolean var2) {
      Widget var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IIII)V",
      garbageValue = "-1221066541"
   )
   @Export("drawMinimap")
   static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
      HorizontalAlignment.playPcmPlayers();
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
         if (Client.minimapState != 2 && Client.minimapState != 5) {
            int var5 = Client.camAngleY & 2047;
            int var6 = class387.localPlayer.x / 32 + 48;
            int var7 = 464 - class387.localPlayer.y / 32;
            class31.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

            int var8;
            int var10;
            int var16;
            for(var8 = 0; var8 < Client.mapIconCount; ++var8) {
               var16 = Client.mapIconXs[var8] * 4 + 2 - class387.localPlayer.x / 32;
               var10 = Client.mapIconYs[var8] * 4 + 2 - class387.localPlayer.y / 32;
               class31.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var16 = 0; var16 < 104; ++var16) {
                  NodeDeque var14 = Client.groundItems[class103.Client_plane][var8][var16];
                  if (var14 != null) {
                     var11 = var8 * 4 + 2 - class387.localPlayer.x / 32;
                     var12 = var16 * 4 + 2 - class387.localPlayer.y / 32;
                     class31.drawSpriteOnMinimap(var1, var2, var11, var12, UrlRequest.mapDotSprites[0], var4);
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
                     var11 = var9.x / 32 - class387.localPlayer.x / 32;
                     var12 = var9.y / 32 - class387.localPlayer.y / 32;
                     class31.drawSpriteOnMinimap(var1, var2, var11, var12, UrlRequest.mapDotSprites[1], var4);
                  }
               }
            }

            var8 = Players.Players_count;
            int[] var17 = Players.Players_indices;

            for(var10 = 0; var10 < var8; ++var10) {
               Player var15 = Client.players[var17[var10]];
               if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class387.localPlayer) {
                  var12 = var15.x / 32 - class387.localPlayer.x / 32;
                  int var13 = var15.y / 32 - class387.localPlayer.y / 32;
                  if (var15.isFriend()) {
                     class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[3], var4);
                  } else if (class387.localPlayer.team != 0 && var15.team != 0 && var15.team == class387.localPlayer.team) {
                     class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[4], var4);
                  } else if (var15.isFriendsChatMember()) {
                     class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[5], var4);
                  } else if (var15.isClanMember()) {
                     class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[6], var4);
                  } else {
                     class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[2], var4);
                  }
               }
            }

            if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
               if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
                  NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
                  if (var19 != null) {
                     var11 = var19.x / 32 - class387.localPlayer.x / 32;
                     var12 = var19.y / 32 - class387.localPlayer.y / 32;
                     class361.worldToMinimap(var1, var2, var11, var12, UserComparator6.mapMarkerSprites[1], var4);
                  }
               }

               if (Client.hintArrowType == 2) {
                  var10 = Client.hintArrowX * 4 - ParamComposition.baseX * 256 + 2 - class387.localPlayer.x / 32;
                  var11 = Client.hintArrowY * 4 - Client.baseY * 256 + 2 - class387.localPlayer.y / 32;
                  class361.worldToMinimap(var1, var2, var10, var11, UserComparator6.mapMarkerSprites[1], var4);
               }

               if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
                  Player var20 = Client.players[Client.hintArrowPlayerIndex];
                  if (var20 != null) {
                     var11 = var20.x / 32 - class387.localPlayer.x / 32;
                     var12 = var20.y / 32 - class387.localPlayer.y / 32;
                     class361.worldToMinimap(var1, var2, var11, var12, UserComparator6.mapMarkerSprites[1], var4);
                  }
               }
            }

            if (Client.destinationX != 0) {
               var10 = Client.destinationX * 4 + 2 - class387.localPlayer.x / 32;
               var11 = Client.destinationY * 4 + 2 - class387.localPlayer.y / 32;
               class31.drawSpriteOnMinimap(var1, var2, var10, var11, UserComparator6.mapMarkerSprites[0], var4);
            }

            if (!class387.localPlayer.isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

         Client.field678[var3] = true;
      }
   }
}
